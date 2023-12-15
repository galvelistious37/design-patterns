package com.johnny.pack.age.structuralpatterns.decorator;

import org.apache.commons.lang3.StringEscapeUtils;

// The decorator
public class HtmlEncodedMessage implements Message {

    private Message msg;

    public HtmlEncodedMessage(Message msg) {
        this.msg = msg;
    }

    @Override
    public String getContent() {
        return StringEscapeUtils.escapeHtml4(msg.getContent());
    }
}
