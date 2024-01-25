package com.johnny.pack.age.behavioralpatterns.templatemethod;

import java.io.FileNotFoundException;

public class Client {
    public static void main(String[] args) throws FileNotFoundException {
        Order order = new Order("1001");
        order.addItem("Soda", 2.50);
        order.addItem("Sandwich", 11.95);
        order.addItem("Pizza", 15.95);

        OrderPrinter printer = new TextPrinter();
        String file = "src\\main\\java\\com\\johnny\\pack\\age\\behavioralpatterns\\templatemethod\\1001.txt";
        printer.printOrder(order, file);

        Order order2 = new Order("1002");
        order2.addItem("Burger", 10.50);
        order2.addItem("Whiskey", 4.50);
        order2.addItem("Chips", 4.25);

        OrderPrinter printer2 = new HtmlPrinter();
        String file2 = "src\\main\\java\\com\\johnny\\pack\\age\\behavioralpatterns\\templatemethod\\index.html";
        printer2.printOrder(order2, file2);
    }
}
