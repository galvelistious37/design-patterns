package com.johnny.pack.age.solidpinciples.singleresponsibility;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class UserCreator {

    public User createUser(String value) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        User user = mapper.readValue(value, User.class);
        return user;
    }
}
