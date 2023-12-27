package com.johnny.pack.age.structuralpatterns.decorator.udemyexample;

public class TextMessage implements Message{
    private String msg;

    public TextMessage(String msg) {
        this.msg = msg;
    }

    @Override
    public String getContent() {
        return msg;
    }
}
