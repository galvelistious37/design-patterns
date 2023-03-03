package com.johnny.pack.age.factorymethod;

import com.johnny.pack.age.factorymethod.message.JSonMessage;
import com.johnny.pack.age.factorymethod.message.Message;

public class JSonMessageCreator extends MessageCreator{

    @Override
    public Message createMessage() {
        return new JSonMessage();
    }
}
