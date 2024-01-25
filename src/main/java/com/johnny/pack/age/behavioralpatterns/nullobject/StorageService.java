package com.johnny.pack.age.behavioralpatterns.nullobject;

import java.io.IOException;
import java.io.PrintWriter;

public class StorageService {
    public void save(Report report){
        System.out.println("Writing report out");
        String file = "src\\main\\java\\com\\johnny\\pack\\age\\behavioralpatterns\\nullobject\\" + report.getName() + ".txt";
        try(PrintWriter writer = new PrintWriter(file)){
            writer.println(report.getName());
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
