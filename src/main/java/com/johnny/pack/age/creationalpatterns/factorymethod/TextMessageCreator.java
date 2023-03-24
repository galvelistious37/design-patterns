package com.johnny.pack.age.creationalpatterns.factorymethod;

import com.johnny.pack.age.creationalpatterns.factorymethod.message.Message;
import com.johnny.pack.age.creationalpatterns.factorymethod.message.TextMessage;

public class TextMessageCreator extends MessageCreator{

    @Override
    public Message createMessage() {
        return new TextMessage();
    }
}
