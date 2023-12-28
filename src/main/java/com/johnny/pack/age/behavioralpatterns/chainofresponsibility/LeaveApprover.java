package com.johnny.pack.age.behavioralpatterns.chainofresponsibility;

// This represents a handler in chain of responsibility
public interface LeaveApprover {
    void processLeaveApplication(LeaveApplication application);
    String getApproverRole();
}
