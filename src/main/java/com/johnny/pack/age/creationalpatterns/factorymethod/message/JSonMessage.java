package com.johnny.pack.age.creationalpatterns.factorymethod.message;

public class JSonMessage extends Message {

    @Override
    public String getContent() {
        return "{\"JSON\":[]}";
    }
}
