package com.johnny.pack.age.structuralpatterns.adapter.objectadapter;

import com.johnny.pack.age.structuralpatterns.adapter.classadapter.EmployeeClassAdapter;

public class Main {

    public static void main(String[] args) {
        Employee employee = new Employee();
        populateEmployeeData(employee);
        EmployeeObjectAdapter adapter = new EmployeeObjectAdapter(employee);
        BusinessCardDesigner designer = new BusinessCardDesigner();
        String card = designer.designCard(adapter);
        System.out.println(card);
    }

    public static void populateEmployeeData(Employee employee) {
        employee.setFullName("Jekk Baerr");
        employee.setJobTitle("Fedrul Aygent");
        employee.setOfficeLocation("Los Angeles");
    }
}
