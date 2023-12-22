package com.johnny.pack.age.structuralpatterns.flyweight;

// A concrete Flyweight. Instance is shared
public class SystemErrorMessage implements ErrorMessage{
    // Intrinsic state - shared in all contexts
    // some error message $errorCode
    private String messageTemplate;
    // http://somedomain.com/help?error=
    private String helpUrlBase;

    public SystemErrorMessage(String messageTemplate, String helpUrlBase) {
        // Loaded from external resource
        this.messageTemplate = messageTemplate;
        this.helpUrlBase = helpUrlBase;
    }

    @Override
    public String getText(String code) {
        // Combine extrinsic and intrinsic values
        return messageTemplate.replace("$errorCode", code)
                + helpUrlBase+code;
    }
}
