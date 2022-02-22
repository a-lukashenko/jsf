package ru.babyhall.view.menu;
/*
 * The MIT License
 *
 * Copyright (c) 2009-2021 PrimeTek
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
//package org.primefaces.showcase.view.menu;

import org.primefaces.model.menu.*;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import ru.babyhall.domain.Category;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

@Named
@ApplicationScoped
public class MenuView {

    private MenuModel model;

    @PostConstruct
    public void init() {
        model = new DefaultMenuModel();
        List<DefaultSubMenu> dsm = new ArrayList<DefaultSubMenu>();
        //First submenu
        /*DefaultSubMenu firstSubmenu = DefaultSubMenu.builder()
                .label("Options")
                .build();

        firstSubmenu.getElements().add(DefaultMenuItem.builder()
                .value("Delete Ajax")
                .ajax(true)
                .command("#{menuView.delete}")
                .update("messages")
                .style("")
                .build());
        firstSubmenu.getElements().add(DefaultMenuItem.builder()
                .value("Save Non-Ajax")
                .ajax(false)
                .command("#{menuView.save}")
                .update("messages")
                .style("")
                .build());*/
        //// BEGIN //////////
        List<Category> categories = new ArrayList<>();
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        String FILENAME = "C:\\Users\\Alex\\core-java\\java-xml\\src\\main\\resources\\xml_infoblock.xml";
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
                    NodeList categories1 = element.getElementsByTagName("category");
                    for(int i=0; i<categories1.getLength(); i++) {
                        String id = categories1.item(i).getAttributes().getNamedItem("id").getNodeValue();
                        String parentId = categories1.item(i).getAttributes().getNamedItem("parentId").getNodeValue();;
                        String content = categories1.item(i).getTextContent();
                        Category category = new Category(id, parentId, content);
                        categories.add(category);
                        if(category.getParentId().isEmpty()) {
                            dsm.add(DefaultSubMenu.builder()
                                    .label(category.getTextContent())
                                    .id(category.getId())
                                    .build());
                        }
                    }
                }
            }
            for (Category c : categories) {
                for (DefaultSubMenu me : dsm ) {
                    if (c.getParentId().equals(me.getId())) {
                        me.getElements().add(DefaultMenuItem.builder()
                                .id(c.getId())
                                .value(c.getTextContent())
                                .ajax(true)
                                .build());
                    }
                }
            }
            for(MenuElement me : dsm) {
                model.getElements().add(me);
            }
        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }
    }

    public MenuModel getModel() {
        return model;
    }

    public void redirect() throws IOException {
        ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
        ec.redirect(ec.getRequestContextPath());
    }

    public void save() {
        addMessage("Save", "Data saved");
    }

    public void update() {
        addMessage("Update", "Data updated");
    }

    public void delete() {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_WARN, "Delete", "Data deleted");
        FacesContext.getCurrentInstance().addMessage(null, message);
    }

    public void addMessage(String summary, String detail) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary, detail);
        FacesContext.getCurrentInstance().addMessage(null, message);
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
}
