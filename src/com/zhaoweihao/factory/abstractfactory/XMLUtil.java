package com.zhaoweihao.factory.abstractfactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class XMLUtil {
    // this method can get classname from XML file and return its object
    public static Object getBean() {
        try {
            // create DOM file object
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            Document doc;
            doc = builder.parse(new File("config.example"));

            // get classname text
            NodeList nl = doc.getElementsByTagName("className");
            Node node = nl.item(0).getFirstChild();
            String className = node.getNodeValue();

            // generate object via classname
            Class c = Class.forName(className);
            Object obj = c.newInstance();
            return obj;


        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
