package com.johnny.pack.age.solidpinciples.singleresponsibility;

import java.io.IOException;

public class UserController {
    private Store store = new Store();
    private UserPersistenceService persistenceService = new UserPersistenceService();

    private UserCreator creator = new UserCreator();

    public String createUser(String userJson) throws IOException{
        User user = creator.createUser(userJson);
        UserValidator validator = new UserValidator();

        boolean valid = validator.validateUser(user);
        if(!valid){
            return "ERROR";
        }

        persistenceService.saveUser(user);
        return "SUCCESS";
    }
}
