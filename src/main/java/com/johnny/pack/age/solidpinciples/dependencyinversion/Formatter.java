package com.johnny.pack.age.solidpinciples.dependencyinversion;

//Common interface for classes formatting Message object
public interface Formatter {
	
	public String format(Message message) throws FormatException;
	
}
