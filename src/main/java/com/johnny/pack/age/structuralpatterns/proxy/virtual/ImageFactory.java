package com.johnny.pack.age.structuralpatterns.proxy.virtual;

// Factory to get image objects
public class ImageFactory {
    // Provide proxy to caller isntead of real object
    public static Image getImage(String name){
        return new ImageProxy(name);
    }
}
