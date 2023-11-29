package com.johnny.pack.age.solidpinciples.liskovsubstitution;

public class Main {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(10, 20);
        System.out.println(rectangle.computeArea());

        Square square = new Square(10);
        System.out.println(square.computeArea());

        useRectangle(rectangle);
        useSquare(square);

    }

    private static void useRectangle(Rectangle rectangle) {
        rectangle.setHeight(20);
        rectangle.setWidth(30);
        String value = rectangle.getHeight() == 20 ? "yup" : "Height Not equal to 20";
        System.out.println(value);
        value = rectangle.getWidth() == 30 ? "Yup" : "Width Not equal to 30";
        System.out.println(value);
    }

    private static void useSquare(Square square){
        square.setSide(10);
        String value = square.getSide() == 10 ? "yup" : "Not equal and stuff";
        System.out.println(value);
    }
}
