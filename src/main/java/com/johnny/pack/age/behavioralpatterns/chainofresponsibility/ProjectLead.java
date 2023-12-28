package com.johnny.pack.age.behavioralpatterns.chainofresponsibility;

// A concrete handler
public class ProjectLead extends Employee {

    public ProjectLead(LeaveApprover successor) {
        super("Project Lead", successor);
    }

    @Override
    protected boolean processRequest(LeaveApplication application) {
        // Type is sick leave & duration is less than or equal to 2 days
        if(application.getType() == LeaveApplication.Type.Sick){
            if(application.getNoDays() <= 2){
                application.approve(getApproverRole());
                return true;
            }
        }
        return false;
    }
}
