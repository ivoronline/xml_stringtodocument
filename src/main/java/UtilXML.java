import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.StringReader;

public class UtilXML {

  //================================================================================
  // STRING TO DOCUMENT
  //================================================================================
  public static Document stringToDocument(String xmlString) throws Exception {

    //READ XML STRING
    InputSource            inputSource            = new InputSource();
                           inputSource.setCharacterStream(new StringReader(xmlString));

    //CONVERT TO DOCUMENT
    DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
                           documentBuilderFactory.setNamespaceAware(true);    //IMPORTANT
    DocumentBuilder        documentBuilder        = documentBuilderFactory.newDocumentBuilder();
    Document               document               = documentBuilder.parse(inputSource);

    //RETURN DOCUMENT
    return document;

  }

}


