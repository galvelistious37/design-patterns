package com.johnny.pack.age.creationalpatterns.abstractfactory;

// Represents a concrete product in a family "Google Cloud Platform"
public class GoogleCloudStorage implements Storage {

    public GoogleCloudStorage(int capacityInMib){
        // Use GCP api
        System.out.println("Allocated " + capacityInMib + " on Google Cloud Storage");
    }

    @Override
    public String getId() {
        return "gcpcsi";
    }

    @Override
    public String toString() {
        return "GoogleCloudStorage";
    }
}
