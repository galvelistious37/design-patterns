package com.johnny.pack.age.behavioralpatterns.command;

import java.util.LinkedList;
import java.util.List;

// This is the invoker that actually executes commands.
// It starts a worker thread in charge of executing commands.
public class MailTaskRunner implements Runnable{
    private Thread runner;
    private List<Command> pendingCommands;
    private volatile boolean stop;
    private static final MailTaskRunner RUNNER = new MailTaskRunner();

    public static final MailTaskRunner getInstance(){
        return RUNNER;
    }

    private MailTaskRunner(){
        pendingCommands = new LinkedList<>();
        runner = new Thread(this);
        runner.start();
    }

    // Run method takes pending commands and executes them
    @Override
    public void run() {
        while(true){
            Command cmd = null;
            synchronized (pendingCommands){
                if (pendingCommands.isEmpty()){
                    try{
                        pendingCommands.wait();
                    } catch (InterruptedException e){
                        System.out.println("Runner interrupted");
                        if(stop) {
                            System.out.println("Runner stopping");
                            return;
                        }
                    }
                } else {
                    cmd = pendingCommands.remove(0);
                }
            }
            if (cmd == null){
                return;
            }
            cmd.execute();
        }
    }

    // Giving it a command will schedule it for later execution
    public void addCommand(Command cmd){
        synchronized (pendingCommands){
            pendingCommands.add(cmd);
            pendingCommands.notifyAll();
        }
    }

    public void shutdown(){
        this.stop = true;
        this.runner.interrupt();
    }
}
