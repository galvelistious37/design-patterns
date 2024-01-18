package com.johnny.pack.age.behavioralpatterns.memento.command;

import com.johnny.pack.age.behavioralpatterns.memento.WorkflowDesigner;

public class CreateStepCommand extends AbstractWorkflowCommand{
    private String step;

    public CreateStepCommand(WorkflowDesigner designer, String step) {
        super(designer);
        this.step = step;
    }

    @Override
    public void execute() {
        memento = receiver.getMemento();
        receiver.createWorkflow(step);
    }
}
