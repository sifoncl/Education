import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, XMLStreamException {

        XMLInputFactory factory = XMLInputFactory.newFactory();
        XMLStreamReader reader = factory.createXMLStreamReader(new
                FileInputStream("XML 1/somePoints.xml"));

        ArrayList<Integer[]> points = new ArrayList<Integer[]>();
        String tagContent = null;
        Integer[] point = new Integer[2];

        while (reader.hasNext()) {


            int event = reader.next();

            switch (event) {
                case XMLStreamConstants.START_ELEMENT:
                    if (reader.getLocalName().equals("point")) {
                        point = new Integer[2];
                    }
                    break;
                case XMLStreamConstants.CHARACTERS:
                    tagContent = reader.getText().trim();
                    break;
                case XMLStreamConstants.END_ELEMENT:
                    switch (reader.getLocalName()) {
                        case "x":
                            point[0] = Integer.valueOf(tagContent);
                            break;
                        case "y":
                            point[1] = Integer.valueOf(tagContent);
                            break;
                        case "point":
                            points.add(point);
                            break;
                    }

            }

        }
        for (Integer[] p : points) {
            System.out.println(p[0] + " " + p[1] + " px");
        }
    }

}


