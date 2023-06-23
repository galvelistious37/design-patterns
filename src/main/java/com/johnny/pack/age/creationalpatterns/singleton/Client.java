package com.johnny.pack.age.creationalpatterns.singleton;

public class Client {

    public static void main(String[] args) {
        // Eager singleton
        EagerRegistry registry = EagerRegistry.getInstance();
        EagerRegistry registry2 = EagerRegistry.getInstance();
        System.out.println(registry == registry2);

        // Lazy singleton
        LazyRegistryWithDCL lazySingleton1 = LazyRegistryWithDCL.getInstance();
        LazyRegistryWithDCL lazySingleton2 = LazyRegistryWithDCL.getInstance();
        System.out.println(lazySingleton1 == lazySingleton2);

        // Lazy singleton with inner class
        LazyRegistryIODH lazySingleton3 = LazyRegistryIODH.getInstance();
        LazyRegistryIODH lazySingleton4 = LazyRegistryIODH.getInstance();
        System.out.println(lazySingleton3 == lazySingleton4);
    }
}
