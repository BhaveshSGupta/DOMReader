/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package domreader;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

/**
 *
 * @author Bhavesh
 */
public class DOMCreater {
    public static void main(String ar[]) throws ParserConfigurationException, TransformerConfigurationException, TransformerException{
    
    DocumentBuilderFactory factory= DocumentBuilderFactory.newInstance();
    DocumentBuilder builder= factory.newDocumentBuilder();
    Document doc= builder.newDocument();
    Element bookstore = doc.createElement("bookstore");
    Element book = doc.createElement("book");
    book.setAttribute("category","friction");
    Element title = doc.createElement("title");
    title.setAttribute("lang","en");
    Text titlename= doc.createTextNode("Everyday Italian");
    Element author = doc.createElement("author");
    Text authorname= doc.createTextNode("Giada De Laurentiis");
    Element year = doc.createElement("year");
    Text yearno= doc.createTextNode("2005");   
    Element price= doc.createElement("price");
    Text priceval= doc.createTextNode("30.00");   
    price.appendChild(priceval);
    year.appendChild(yearno);
    author.appendChild(authorname);
    title.appendChild(titlename);
    book.appendChild(title);
    book.appendChild(author);
    book.appendChild(year);
    book.appendChild(price);
    bookstore.appendChild(book);
    doc.appendChild(bookstore);
    TransformerFactory tfactory = TransformerFactory.newInstance();
    Transformer tran= tfactory.newTransformer();
    Source source = new DOMSource(doc);
    Result result = new StreamResult(new File("CreatedXML.xml"));
    tran.transform(source,result);
    
    
    }
}
