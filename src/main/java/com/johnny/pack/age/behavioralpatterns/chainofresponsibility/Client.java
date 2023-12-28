package com.johnny.pack.age.behavioralpatterns.chainofresponsibility;

import java.time.LocalDate;

public class Client {

    public static void main(String[] args) {
        LeaveApplication application = LeaveApplication.getBuilder()
                .withType(LeaveApplication.Type.PTO)
                .from(LocalDate.of(2023, 12, 20))
                .to(LocalDate.of(2023, 12, 31))
                .build();

        System.out.println("Before");
        System.out.println(application);
        LeaveApprover approver = createChain();
        approver.processLeaveApplication(application);
        System.out.println("After");
        System.out.println(application);

        // No guarantee the request will be handled.
        // It could just move up the chain and never meet the conditions to
        // handled. 
        LeaveApplication application2 = LeaveApplication.getBuilder()
                .withType(LeaveApplication.Type.Sick)
                .from(LocalDate.of(2023, 12, 20))
                .to(LocalDate.of(2023, 12, 31))
                .build();

        System.out.println("Before");
        System.out.println(application2);
        approver.processLeaveApplication(application2);
        System.out.println("After");
        System.out.println(application2);
    }

    private static LeaveApprover createChain(){
        Director director = new Director(null);
        Manager manager = new Manager(director);
        return new ProjectLead(manager);
    }
}
