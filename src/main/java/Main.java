import org.w3c.dom.Document;
import org.w3c.dom.Node;

public class Main {

  //XML STRING
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
    Document document = UtilXML.stringToDocument(xmlString);

    //GET AGE VALUE
    Node     nameNode = document.getElementsByTagName("name").item(0);
    String   name     = nameNode.getFirstChild().getNodeValue();

    //DISPLAY AGE VALUE
    System.out.println("Hello" + name);

  }

}



