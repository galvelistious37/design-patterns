package com.johnny.pack.age.factorymethod;

import com.johnny.pack.age.factorymethod.message.Message;
import com.johnny.pack.age.factorymethod.message.TextMessage;

public class TextMessageCreator extends MessageCreator{

    @Override
    public Message createMessage() {
        return new TextMessage();
    }
}
