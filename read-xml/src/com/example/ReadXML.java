package com.example;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class ReadXML {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File inputFile = new File("D:\\temp\\res.xml");
			DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
			Document doc = docBuilder.parse(inputFile);

			// Read doc
			Node rootNode = doc.getFirstChild();
			System.out.println("root node = " + rootNode.getNodeName());

			// book nodes
			NodeList books = doc.getElementsByTagName("book");
			for (int i = 0; i < books.getLength(); i++) {
				Node book = books.item(i);
				System.out.println("Node " + book.getNodeName());

				// Attributes
				NamedNodeMap attrs = book.getAttributes();
				for (int j = 0; j < attrs.getLength(); j++) {
					Node attr = attrs.item(j);
					System.out.println(" -- attr " + attr.getNodeName() + " = " + attr.getNodeValue());
				}

				// Children
				NodeList children = book.getChildNodes();
				for (int j = 0; j < children.getLength(); j++) {
					Node child = children.item(j);
					System.out.println(
							" -- childnode " + child.getNodeName() + " = " + child.getFirstChild().getNodeValue());
				}
			}
		} catch (ParserConfigurationException | SAXException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
