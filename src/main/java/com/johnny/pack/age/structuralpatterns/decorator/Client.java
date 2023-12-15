package com.johnny.pack.age.structuralpatterns.decorator;

public class Client {

    public static void main(String[] args) {
        String message = "The <FORCE> is strong with this one!";
        Message decorator = new TextMessage(message);
        System.out.println(decorator.getContent());

        decorator = new HtmlEncodedMessage(decorator);
        System.out.println(decorator.getContent());

        decorator = new Base64EncodedMessage(decorator);
        System.out.println(decorator.getContent());
    }

}
