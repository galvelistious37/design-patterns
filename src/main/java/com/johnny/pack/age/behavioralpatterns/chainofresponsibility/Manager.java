package com.johnny.pack.age.behavioralpatterns.chainofresponsibility;

// A concrete handler
public class Manager extends Employee{

    public Manager(LeaveApprover successor) {
        super("Manager", successor);
    }

    @Override
    protected boolean processRequest(LeaveApplication application) {
        switch (application.getType()) {
            case Sick -> {
                if(application.getNoDays() <= 10){
                    application.approve(getApproverRole());
                    return true;
                }
            }
            case PTO -> {
                if (application.getNoDays() <= 5) {
                    application.approve(getApproverRole());
                    return true;
                }
            }
        }
        return false;
    }
}
