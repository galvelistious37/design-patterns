package com.johnny.pack.age.creationalpatterns.singleton;

/**
 * This class demonstrates singleton pattern using Double Checked Locking
 * or "classic" singleton. This is also a lazy initializing singleton.
 * Although this implementation solves the multi-threading issue with lazy
 * initialization using volatile and double check locking, the volatile
 * keyword is guaranteed to work only after JVMs starting with version 1.5
 * and later
 */
public class LazyRegistryWithDCL {

    // Volatile keyword means do not use cached version of this instance value
    private static volatile LazyRegistryWithDCL INSTANCE;
    private LazyRegistryWithDCL(){}

    public static LazyRegistryWithDCL getInstance(){
        if(INSTANCE == null){
            synchronized (LazyRegistryWithDCL.class){
                if(INSTANCE == null){
                    INSTANCE = new LazyRegistryWithDCL();
                }
            }
        }
        return INSTANCE;
    }
}
