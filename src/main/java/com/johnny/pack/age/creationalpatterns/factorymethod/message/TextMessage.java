package com.johnny.pack.age.creationalpatterns.factorymethod.message;

public class TextMessage extends Message{

    @Override
    public String getContent() {
        return "Text";
    }
}
