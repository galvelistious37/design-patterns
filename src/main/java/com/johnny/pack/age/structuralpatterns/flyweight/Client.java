package com.johnny.pack.age.structuralpatterns.flyweight;

public class Client {

    public static void main(String[] args) {
        SystemErrorMessage message1 = ErrorMessageFactory.getInstance().getError(ErrorMessageFactory.ErrorType.GenericSystemError);
        System.out.println(message1.getText("4056"));

        UserBannedErrorMessage msg2 = ErrorMessageFactory.getInstance().getUserBannedMessage("1202");
        System.out.println(msg2.getText(null));
    }
}
