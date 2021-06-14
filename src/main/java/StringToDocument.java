import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.InputSource;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.StringReader;

public class StringToDocument {

  static String xmlString =
    "<person Id='1'>\n" +
    "  <name> John </name>\n" +
    "  <age>  20   </age>\n" +
    "</person>";

  //================================================================================
  // MAIN
  //================================================================================
  public static void main(String[] args) throws Exception {

    //GET DOCUMENT
    Document document = stringToDocument(xmlString);

    //GET AGE VALUE
    Node     ageNode  = document.getElementsByTagName("age").item(0);
    String   age      = ageNode.getFirstChild().getNodeValue();

    //DISPLAY AGE VALUE
    System.out.println(age);

  }

  //================================================================================
  // STRING TO DOCUMENT
  //================================================================================
  public static Document stringToDocument(String xmlString) throws Exception {

    //READ XML STRING
    InputSource            inputSource            = new InputSource();
                           inputSource.setCharacterStream(new StringReader(xmlString));

    //CREATE DOCUMENT
    DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
                           documentBuilderFactory.setNamespaceAware(true);    //IMPORTANT
    DocumentBuilder        documentBuilder        = documentBuilderFactory.newDocumentBuilder();
    Document               document               = documentBuilder.parse(inputSource);

    //RETURN DOCUMENT
    return document;

  }

}



