package com.johnny.pack.age.creationalpatterns.singleton;

/**
 * (Ref. Google I/O 2ks Joshua Bloch)
 * Since Java 1.5 using enum we can creae a singleton. It handles
 * serialization using java's built-in mechanism and still
 * ensures single instance.
 */
public enum RegistryEnum {
    INSTANCE;

    public void getConfiguration(){

    }
}
