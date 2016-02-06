package com.education;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class SAXHandler extends DefaultHandler {
	private String content;
	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		System.out.print("START :");
		if (qName.equalsIgnoreCase("shop")) {
			System.out.print("shop element (root)...");
		} else if (qName.equalsIgnoreCase("goods")) {
			String id = attributes.getValue("id");
			System.out.print(String.format("goods element... with id = %s", id));
		} else if (qName.equalsIgnoreCase("name")) {
			System.out.print("name element...");
		} else if (qName.equalsIgnoreCase("price")) {
			System.out.print("price element...");
		} else if (qName.equalsIgnoreCase("category")) {
			System.out.print("category element...");
		} else if (qName.equalsIgnoreCase("description")) {
			System.out.print("description element...");
		}
		System.out.println("");
	}
	
	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		System.out.print("END :");
		if (qName.equalsIgnoreCase("shop")) {
			System.out.print("shop element (root)...");
		} else if (qName.equalsIgnoreCase("goods")) {
			System.out.print("goods element...");
		} else if (qName.equalsIgnoreCase("name")) {
			System.out.print("name element...");
		} else if (qName.equalsIgnoreCase("price")) {
			System.out.print("price element...");
		} else if (qName.equalsIgnoreCase("category")) {
			System.out.print("category element...");
		} else if (qName.equalsIgnoreCase("description")) {
			System.out.print("description element...");
		} 
	}
	
	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		 content = String.copyValueOf(ch, start, length);
		 System.out.println(content);
	}
}