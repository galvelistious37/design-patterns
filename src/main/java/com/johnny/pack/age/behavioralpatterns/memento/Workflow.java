package com.johnny.pack.age.behavioralpatterns.memento;


import java.util.Arrays;
import java.util.LinkedList;

public class Workflow {
    private String name;
    private LinkedList<String> steps;

    public Workflow(String name) {
        this.name = name;
        this.steps = new LinkedList<>();
    }

    public Workflow(String name, String... steps){
        this.name = name;
        this.steps = new LinkedList<>();
        if(steps != null && steps.length > 0){
            Arrays.stream(steps).forEach(s -> this.steps.add(s));
        }
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder("Workflow [name=");
        builder.append(name).append("]\nBegin -> ");
        for(String step : steps){
            builder.append(step).append(" -> ");
        }
        builder.append("END");
        return builder.toString();
    }

    public void addStep(String step){
        steps.addLast(step);
    }

    public boolean removeStep(String step){
        return steps.remove(step);
    }

    public String getName() {
        return name;
    }

    public String[] getSteps() {
        return steps.toArray(new String[steps.size()]);
    }
}
