package com.johnny.pack.age.creationalpatterns.objectpool;

import javafx.geometry.Point2D;

public interface Image extends Poolable {
    void draw();
    Point2D getLocation();
    void setLocation(Point2D location);
}
