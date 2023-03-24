package com.johnny.pack.age.creationalpatterns.prototype;

import javafx.geometry.Point3D;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Swordsman s1 = new Swordsman();
        s1.move(new Point3D(-10, 0, 0), 20);
        s1.attack();
        System.out.println(s1);

        Swordsman s2 = (Swordsman) s1.clone();
        System.out.println("Cloned: " + s2);

        s1.reset();
        s1.move(new Point3D(0, 12, 10), 10);
        System.out.println(s1);

        s2.move(new Point3D(10, 10, 10), 5);
        s2.attack();
        System.out.println("Cloned: " + s2);

        Swordsman s3 = (Swordsman) s2.clone();
        System.out.println("Clone again: " + s3);
    }
}
