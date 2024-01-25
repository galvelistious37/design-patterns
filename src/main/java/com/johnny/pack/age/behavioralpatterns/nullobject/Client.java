package com.johnny.pack.age.behavioralpatterns.nullobject;

public class Client {
    public static void main(String[] args) {
        ComplexService service = new ComplexService("Simple", new StorageService());
        service.generateReport();

        ComplexService service2 = new ComplexService("Simple Report 2", new NullStorageService());
        service2.generateReport();
    }
}
