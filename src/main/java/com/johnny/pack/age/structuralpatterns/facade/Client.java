package com.johnny.pack.age.structuralpatterns.facade;

import com.johnny.pack.age.structuralpatterns.facade.email.*;
import com.johnny.pack.age.structuralpatterns.facade.email.Template.TemplateType;

public class Client {

	public static void main(String[] args) {
		Order order = new Order("101", 99.99);
		EmailFacade facade = new EmailFacade();
		boolean result = facade.sendOrderEmail(order);
//		boolean result = sendOrderEmailWithoutFacade(order);

		System.out.println("Order Email "+ (result?"sent!":"NOT sent..."));
		
	}

//	private static boolean sendOrderEmailWithoutFacade(Order order) {
//		Template template = TemplateFactory.createTemplateFor(TemplateType.Email);
//		Stationary stationary = StationaryFactory.createStationary();
//		Email email = Email.getBuilder()
//					  .withTemplate(template)
//					  .withStationary(stationary)
//					  .forObject(order)
//					  .build();
//		Mailer mailer = Mailer.getMailer();
//		return mailer.send(email);
//	}
	
}
