package com.education.models;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.soap.Node;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Main {

	public static void main(String[] args) {
		File file=new File("DOM.XML");
			DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();
			factory.setValidating(false);
			DocumentBuilder builder = null;
			try {
				builder = factory.newDocumentBuilder();
			} catch (ParserConfigurationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Document doc = null;
			try {
				doc = builder.parse(file);
			} catch (SAXException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.print("root: "+doc.getDocumentElement().getNodeName()+"\n");
			NodeList nodeList=doc.getDocumentElement().getChildNodes();
			for (int i = 0; i < nodeList.getLength(); i++) {
				org.w3c.dom.Node node=nodeList.item(i);
				if (node.getNodeType()==Node.ELEMENT_NODE) {
					System.out.println("Element: "+node.getNodeName());
					Element elem=(Element) node;
					try {
						System.out.println("Id: "+elem.getAttribute("Id"));
						System.out.println("Name: "+elem.getElementsByTagName("name").item(0).getTextContent());
						System.out.println("Price: "+elem.getElementsByTagName("price").item(0).getTextContent());
						System.out.println("Category: "+elem.getElementsByTagName("category").item(0).getTextContent());
						System.out.println("Description: "+elem.getElementsByTagName("description").item(0).getTextContent());
					} catch (Exception e) {
						e.printStackTrace();
					}
				}	
			}
		

	}

}
