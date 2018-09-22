 	package com.lgi.ui.testAction;

import java.io.File;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class ReadAndModifyXMLFile {

	//public static final String xmlFilePath = "D:\\notepad++\\AutomationWiFi-DefaultGuestProfile.xml";

	public void modifyPassphraseString(String xmlFilePath,String Passphrase) {

		try {
			System.out.println("Modifying xml File");
			DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
			
			DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();

			Document document = documentBuilder.parse(xmlFilePath);
			System.out.println("1");
			Node employee = document.getElementsByTagName("keyMaterial").item(0);
			System.out.println("2");
			employee.setTextContent(Passphrase);
			System.out.println("3");
			System.out.println(employee);
			System.out.println("4");

			TransformerFactory transformerFactory = TransformerFactory.newInstance();

			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);

			StreamResult streamResult = new StreamResult(new File(xmlFilePath));
			transformer.transform(domSource, streamResult);

			System.out.println("The XML File was ");

		} catch (ParserConfigurationException pce) {
			pce.printStackTrace();
		} catch (TransformerException tfe) {
			tfe.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} catch (SAXException sae) {
			sae.printStackTrace();
		}
	}
}