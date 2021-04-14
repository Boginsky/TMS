package lesson17.task1;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.ArrayList;
import java.util.Random;

public class DOMXMLParser {
    public static ArrayList<Book> getAllBooksFromXML(){
        Random random = new Random();
        ArrayList<Book> list = new ArrayList<>();
        try{
            File xmlFile = new File("E:\\TMS_DEV\\TMS\\lesson17\\src\\lesson17\\task1\\XMLFile.xml");

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
                    book.setTakeHome(random.nextBoolean());
                    list.add(book);
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }
}
