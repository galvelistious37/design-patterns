package com.johnny.pack.age.behavioralpatterns.memento;

import com.johnny.pack.age.behavioralpatterns.memento.command.AddStepCommand;
import com.johnny.pack.age.behavioralpatterns.memento.command.CreateStepCommand;
import com.johnny.pack.age.behavioralpatterns.memento.command.WorkflowCommand;

import java.util.LinkedList;

public class Client {
    private static LinkedList<WorkflowCommand> commands;
    public static void main(String[] args) {
        WorkflowDesigner designer = new WorkflowDesigner();
        commands = runCommands(designer);
        designer.print();
        undoLastCommand(commands);
        designer.print();
        undoLastCommand(commands);
        designer.print();
        addCommand(designer);
        designer.print();
        undoLastCommand(commands);
        designer.print();
        undoLastCommand(commands);
        designer.print();
        undoLastCommand(commands);
        designer.print();
    }

    private static void undoLastCommand(LinkedList<WorkflowCommand> commands){
        if(!commands.isEmpty()){
            commands.removeLast().undo();
        }
    }

    private static LinkedList<WorkflowCommand> runCommands(WorkflowDesigner designer){
        LinkedList<WorkflowCommand> commands = new LinkedList<>();
        WorkflowCommand cmd = new CreateStepCommand(designer, "Leave Workflow");
        commands.addLast(cmd);
        cmd.execute();

        cmd = new AddStepCommand(designer, "Create Leave Application");
        commands.addLast(cmd);
        cmd.execute();

        cmd = new AddStepCommand(designer, "Submit Application");
        commands.addLast(cmd);
        cmd.execute();

        cmd = new AddStepCommand(designer, "Application Approved");
        commands.addLast(cmd);
        cmd.execute();

        return commands;
    }

    private static void addCommand(WorkflowDesigner designer){
        WorkflowCommand cmd = new AddStepCommand(designer, "Another Step");
        commands.addLast(cmd);
        cmd.execute();
    }
}
