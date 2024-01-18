package com.johnny.pack.age.behavioralpatterns.memento.command;

public interface WorkflowCommand {
    void execute();
    void undo();
}
