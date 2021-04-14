package lesson17.task2;

import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.File;
import java.io.IOException;

public class CheckForXML {
    public static boolean checkXMLForXSD(String pathXML, String pathXSD){
        try{
            File xml = new File(pathXML);
            File xsd = new File(pathXSD);

            if(!xml.exists()){
                System.out.println("Не найден XML");
                return false;
            }

            if(!xsd.exists()){
                System.out.println("Не найдет XSD");
                return false;
            }

            SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            Schema schema = factory.newSchema(new StreamSource(pathXSD));
            Validator validator = schema.newValidator();
            validator.validate(new StreamSource(pathXML));
            return true;
        }catch (SAXException | IOException e){
            System.out.println(e.getMessage());
            return false;
        }
    }
}

