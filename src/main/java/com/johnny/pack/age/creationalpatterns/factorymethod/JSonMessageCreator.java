package com.johnny.pack.age.creationalpatterns.factorymethod;

import com.johnny.pack.age.creationalpatterns.factorymethod.message.JSonMessage;
import com.johnny.pack.age.creationalpatterns.factorymethod.message.Message;

public class JSonMessageCreator extends MessageCreator{

    @Override
    public Message createMessage() {
        return new JSonMessage();
    }
}
