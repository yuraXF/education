package com.education.models;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class Main {
public static void main(String[] args) {
	Shop shop1 = new Shop();
	Goods goods1 = new Goods(1L,"milk",4,"low","for children");
	Goods goods2 = new Goods(2L,"car",5000,"hight","for man");
	List<Goods> lst = new ArrayList<>();
	lst.add(goods1);
	lst.add(goods2);
	String pathname="Marshalling.XML";
	File myXML=new File(pathname);
	
	shop1.setGoods(lst);
	
	try {
		   JAXBContext context = JAXBContext.newInstance(Shop.class);
		   Marshaller marshaller = context.createMarshaller();
		   marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
		   marshaller.marshal(shop1, new PrintWriter(System.out));
		   marshaller.marshal(shop1, myXML);
		  } catch (JAXBException ex) {
			  ex.printStackTrace();
	}
	
	
	
}
}
