package com.johnny.pack.age.behavioralpatterns.command;

public class RemoveMemberCommand implements Command {
    private String emailAddress;
    private String listName;
    private EWSService receiver;

    public RemoveMemberCommand(String emailAddress, String listName, EWSService receiver) {
        this.emailAddress = emailAddress;
        this.listName = listName;
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.removeMember(emailAddress, listName);
    }
}
