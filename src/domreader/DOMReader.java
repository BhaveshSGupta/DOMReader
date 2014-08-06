/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package domreader;

import java.io.File;
import java.io.IOException;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author Bhavesh
 */
public class DOMReader {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
    File xmlFile = new File("Students.xml");
    DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
    DocumentBuilder builder = factory.newDocumentBuilder();
    Document doc = builder.parse(xmlFile);
    System.out.println(doc.getDocumentElement().getNodeName());
    NodeList doclist = (NodeList) doc.getElementsByTagName("student");
    
    
    }
}
