package com.education;

import java.io.File;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class Main{

	public static void main(String[] args) {
		
		File myXML=new File("UnMarshalling.XML");
		
			try {
				JAXBContext jc = JAXBContext.newInstance(Shop.class);
				Unmarshaller u = jc.createUnmarshaller();
				Shop shop1 = (Shop) u.unmarshal(myXML);
				List<Goods> listOfGoods=shop1.getGoods();
				for (Goods goods : listOfGoods) {
					System.out.println("Id: "+goods.getId());
					System.out.println("Name: "+goods.getName());
					System.out.println("Price: "+goods.getPrice());
					System.out.println("Category: "+goods.getCategory());
					System.out.println("Description: "+goods.getDescription());
					System.out.println("\n");
				}
			} catch (JAXBException e) {
				e.printStackTrace();
			}

	}

}
