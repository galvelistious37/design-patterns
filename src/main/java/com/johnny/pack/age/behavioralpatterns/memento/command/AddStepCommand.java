package com.johnny.pack.age.behavioralpatterns.memento.command;

import com.johnny.pack.age.behavioralpatterns.memento.WorkflowDesigner;

public class AddStepCommand extends AbstractWorkflowCommand {
    private String step;

    public AddStepCommand(WorkflowDesigner designer, String step) {
        super(designer);
        this.step = step;
    }

    @Override
    public void execute(){
        this.memento = receiver.getMemento();
        receiver.addStep(step);
    }
}
