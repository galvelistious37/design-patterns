package com.johnny.pack.age.structuralpatterns.proxy.virtual;

import javafx.geometry.Point2D;
// Our concrete class providing actual functionality
public class BitmapImage implements Image{
    private Point2D location;
    private String name;

    public BitmapImage(String filename) {
        // Loads image from file on disk
        System.out.println("Loaded from disk: " + filename);
        this.name = filename;
    }

    @Override
    public void setLocation(Point2D point2D) {
        location = point2D;
    }

    @Override
    public Point2D getLocation() {
        return location;
    }

    @Override
    public void render() {
        // Render to screen
        System.out.println("Rendered " + this.name);
    }
}
