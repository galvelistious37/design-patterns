package com.johnny.pack.age.solidpinciples.singleresponsibility;

public class UserPersistenceService {

    private Store store = new Store();
    public void saveUser(User user){
        store.store(user);
    }
}
