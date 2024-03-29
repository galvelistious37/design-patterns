package com.johnny.pack.age.creationalpatterns.factorymethod;

import com.johnny.pack.age.creationalpatterns.factorymethod.message.Message;

public class Client {

    public static void main(String[] args) {
        printMessage(new JSonMessageCreator());
        printMessage(new TextMessageCreator());
    }

    public static void printMessage(MessageCreator creator){
        Message msg = creator.getMessage();
        System.out.println(msg.getContent());
    }
}
