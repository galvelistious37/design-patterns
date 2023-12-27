package com.johnny.pack.age.structuralpatterns.proxy.virtual;

import javafx.geometry.Point2D;

// Proxy class
public class ImageProxy implements Image{
    private BitmapImage image;
    private String name;
    private Point2D location;

    public ImageProxy(String name) {
        this.name = name;
    }

    @Override
    public void setLocation(Point2D point2D) {
        if(image != null){
            image.setLocation(point2D);
        } else {
            location = point2D;
        }
    }

    @Override
    public Point2D getLocation() {
        if(image != null){
            return image.getLocation();
        }
        return location;
    }

    @Override
    public void render() {
        if(image == null){
            image = new BitmapImage(name);
            if(location != null){
                image.setLocation(location);
            }
        }
        image.render();
    }
}
