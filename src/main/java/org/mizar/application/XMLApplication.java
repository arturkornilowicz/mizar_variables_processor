package org.mizar.application;

import org.dom4j.*;
import org.dom4j.io.*;
import org.mizar.classes.XMLElement;

import java.io.*;

public class XMLApplication {

    public Document document;
    public XMLElement xmlElement;

    public void init(String fileName) {
        try {
            File inputFile = new File(fileName);
            SAXReader saxBuilder = new SAXReader();
            document = saxBuilder.read(inputFile);
        } catch (DocumentException e) {
            e.printStackTrace();
        }
    }

    public XMLElement buildTree() { return null; }
}
