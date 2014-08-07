/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package domreader;

import java.io.File;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author Bhavesh Gupta
 */
public class DOMReader {

    /**
     * @param args the command line arguments
     * @throws javax.xml.parsers.ParserConfigurationException
     * @throws java.io.IOException
     * @throws org.xml.sax.SAXException
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
    File xmlFile = new File("CreatedXML.xml");
    DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
    DocumentBuilder builder = factory.newDocumentBuilder();
    Document doc = builder.parse(xmlFile);
    //System.out.println(doc.getDocumentElement().getNodeName());
    String root = doc.getDocumentElement().getNodeName();
    System.out.println(root);    
    NodeList abh = doc.getElementsByTagName("book");
    Node a = abh.item(0);
        String b = a.getChildNodes().toString();
        String item = abh.item(0).getTextContent();
        System.out.println(item);
        /*
        NodeList list = doc.getElementsByTagName("book");
        NodeList doclist = (NodeList) doc.getElementsByTagName("student");
        for(int i=0;i<list.getLength();i++)
        {
        Node book = list.item(i);
        if(book.getNodeType()== Node.ELEMENT_NODE){
        Element st = (Element) book;
        System.out.println();
        }
        }
         */
    }
}
