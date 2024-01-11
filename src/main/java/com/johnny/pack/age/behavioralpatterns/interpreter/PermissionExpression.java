package com.johnny.pack.age.behavioralpatterns.interpreter;

// Abstract expression
public interface PermissionExpression {
    boolean interpret(User user);
}
