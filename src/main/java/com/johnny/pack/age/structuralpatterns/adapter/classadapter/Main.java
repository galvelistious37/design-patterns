package com.johnny.pack.age.structuralpatterns.adapter.classadapter;

public class Main {

    public static void main(String[] args) {
        // Class adapter is not the preferred adapter because
        // the adapter will then have access to methods in the adaptee.
        // Object adapter is preferable.
        EmployeeClassAdapter adapter = new EmployeeClassAdapter();
        populateEmployeeData(adapter);
        BusinessCardDesigner designer = new BusinessCardDesigner();
        String card = designer.designCard(adapter);
        System.out.println(card);
    }

    public static void populateEmployeeData(Employee employee) {
        employee.setFullName("Elliot Alderson");
        employee.setJobTitle("Security Engineer");
        employee.setOfficeLocation("Allsafe Cybersecurity, New York City, New York");
    }
}
