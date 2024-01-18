package com.johnny.pack.age.behavioralpatterns.memento.command;

import com.johnny.pack.age.behavioralpatterns.memento.WorkflowDesigner;

public class AbstractWorkflowCommand implements WorkflowCommand{
    protected WorkflowDesigner.Memento memento;
    protected WorkflowDesigner receiver;

    public AbstractWorkflowCommand(WorkflowDesigner designer) {
        this.receiver = designer;
    }

    @Override
    public void execute() {

    }

    @Override
    public void undo() {
        receiver.setMemento(memento);
    }
}
