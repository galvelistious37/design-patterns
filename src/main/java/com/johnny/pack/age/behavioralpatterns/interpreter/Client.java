package com.johnny.pack.age.behavioralpatterns.interpreter;

public class Client {
    public static void main(String[] args) throws IllegalAccessException {
        Report report1 = new Report("Cashflow report", "NOT ADMIN");
        ExpressionBuilder builder = new ExpressionBuilder();

        PermissionExpression exp = builder.build(report1);
        System.out.println(exp);

        User user1 = new User("Dave", "USER", "ADMIN");
        System.out.println("User access report: " + exp.interpret(user1));

        System.out.println("*****************************************************");
        Report report2 = new Report("Cashflow report", "SOME_ROLE AND ADMIN");
        ExpressionBuilder builder2 = new ExpressionBuilder();

        PermissionExpression exp2 = builder2.build(report2);
        System.out.println(exp2);

        User user2 = new User("Dave", "USER", "ADMIN", "SOME_ROLE");
        System.out.println("User access report: " + exp2.interpret(user2));

        System.out.println("*****************************************************");
        Report report3 = new Report("Cashflow report", "SOME_ROLE or ADMIN");
        ExpressionBuilder builder3 = new ExpressionBuilder();

        PermissionExpression exp3 = builder3.build(report3);
        System.out.println(exp3);

        User user3 = new User("Dave", "USER", "SOME_ROLE");
        System.out.println("User access report: " + exp3.interpret(user3));
    }
}
