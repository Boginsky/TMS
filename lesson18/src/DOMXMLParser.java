import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.ArrayList;

public class DOMXMLParser {
    //считывание с xml
    public static ArrayList<Book> getAllBooksFromXML(){
        ArrayList<Book> list = new ArrayList<>();
        try{
            File xmlFile = new File("E:\\TMS_DEV\\TMS\\lesson18\\src\\XMLFile.xml");

            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();

            Document doc = db.parse(xmlFile);

            Element root = doc.getDocumentElement();
            NodeList nl = root.getChildNodes();

            for (int i = 0; i < nl.getLength(); i++) {
                Node node = nl.item(i);
                Book book = new Book();
                if(node.getNodeType() == Node.ELEMENT_NODE){
                    Element element = (Element) node;
                    book.setName(element.getElementsByTagName("name").item(0).getChildNodes().item(0).getNodeValue());
                    book.setGenre(element.getElementsByTagName("genre").item(0).getChildNodes().item(0).getNodeValue());
                    book.setAuthor(element.getElementsByTagName("author").item(0).getChildNodes().item(0).getNodeValue());
                    book.setAge(element.getElementsByTagName("age").item(0).getChildNodes().item(0).getNodeValue());
                    book.setCover(element.getElementsByTagName("cover").item(0).getChildNodes().item(0).getNodeValue());
                    list.add(book);
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }
}

