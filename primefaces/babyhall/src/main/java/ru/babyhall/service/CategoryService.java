package ru.babyhall.service;

import ru.babyhall.domain.Category;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.*;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;

@Named
@ApplicationScoped
public class CategoryService {
    private List<Category> categories;

    // C:/Users/Alex/core-java/java-xml/src/main/resources/xml_infoblock.xml
    private final String FILENAME = "C:\\Users\\Alex\\core-java\\java-xml\\src\\main\\resources\\xml_infoblock.xml";

    @PostConstruct
    public void init() {
        categories = new ArrayList<>();
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        try (InputStream is = readXmlFileIntoInputStream(FILENAME)) {
            dbf.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, true);
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(is);
            doc.getDocumentElement().normalize();

            NodeList list = doc.getElementsByTagName("categories");
            for (int temp = 0; temp < list.getLength(); temp++) {
                Node node = list.item(temp);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                    NodeList categories = element.getElementsByTagName("category");
                    for(int i=0; i<categories.getLength(); i++) {
                        String id = categories.item(i).getAttributes().getNamedItem("id").getNodeValue();
                        String parentId = categories.item(i).getAttributes().getNamedItem("parentId").getNodeValue();;
                        String content = categories.item(i).getTextContent();
                        Category category = new Category(id, parentId, content);
                        this.categories.add(category);
                        System.out.println("categoryId=" + id + ", parentId=" + parentId + ", content=" + content);
                    }
                    //System.out.println(categories);
                }
            }

        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }
    }

    // read file from resource's folder.
    private static InputStream readXmlFileIntoInputStream(final String fileName) {
        //System.out.println(ReadXmlDomParser.class.getClassLoader().toString());
        //return ReadXmlDomParser.class.getClassLoader().getResourceAsStream(fileName);
        try {
            return new FileInputStream(fileName);
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();

        }

        return null;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

}
