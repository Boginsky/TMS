package lesson17.task2;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;


public class DOMXMLParser {
    public static CurrencyExchanger getAllFromXML(CurrencyExchanger currencyExchanger){
        try{
            File xmlFile = new File("E:\\TMS_DEV\\TMS\\lesson17\\src\\lesson17\\task2\\currency.xml");
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();

            Document doc = db.parse(xmlFile);

            Element root = doc.getDocumentElement();
            NodeList nl = root.getChildNodes();

            for (int i = 0; i < nl.getLength(); i++) {
                Node node = nl.item(i);

                if(node.getNodeType() == Node.ELEMENT_NODE){
                    Element element = (Element) node;
                    currencyExchanger.setUSD_rate(element.getElementsByTagName("sale").item(0).getChildNodes().item(0).getNodeValue());
                    currencyExchanger.setEUR_rate(element.getElementsByTagName("buy").item(0).getChildNodes().item(0).getNodeValue());
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return currencyExchanger;
    }
}
