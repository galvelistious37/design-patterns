package com.johnny.pack.age.structuralpatterns.proxy.dynamic;

import javafx.geometry.Point2D;

import java.awt.*;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

// Implement invocation handler. Your "proxy" code goes here.
public class ImageInvocationHandler implements InvocationHandler {
    private String filename;
    private Point2D location;
    private BitmapImage image;
    private static final Method setLocationMethod;
    private static final Method getLocationMethod;
    private static final Method renderMethod;

    static {
        try {
            setLocationMethod = Image.class.getMethod("setLocation", Point2D.class);
            getLocationMethod = Image.class.getMethod("getLocation");
            renderMethod = Image.class.getMethod("render");
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    public ImageInvocationHandler(String filename){
        this.filename = filename;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Invoking method: " + method.getName());
        if(method.equals(setLocationMethod)){
            return handleSetLocation(args);
        } else if(method.equals(getLocationMethod)){
            return handleGetLocation();
        } else if(method.equals(renderMethod)){
            return handleRender();
        }
        return null;
    }

    private Object handleSetLocation(Object[] args){
        if(image != null){
            image.setLocation((Point2D) args[0]);
        } else {
            this.location = (Point2D) args[0];
        }
        return null;
    }

    private Point2D handleGetLocation(){
        if(image != null){
            return image.getLocation();
        } else {
            return this.location;
        }
    }

    private Object handleRender(){
        if(image == null){
            image = new BitmapImage(filename);
            if(location != null){
                image.setLocation(location);
            }
        }
        image.render();
        return null;
    }
}
