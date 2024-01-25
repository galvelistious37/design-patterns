package com.johnny.pack.age.behavioralpatterns.visitor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Manager extends AbstractEmployee{
    private List<Employee> directReports = new ArrayList();

    public Manager(String name, Employee... employees){
        super(name);
        Arrays.asList(employees).forEach(directReports::add);
    }

    @Override
    public List<Employee> getDirectReports() {
        return directReports;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

