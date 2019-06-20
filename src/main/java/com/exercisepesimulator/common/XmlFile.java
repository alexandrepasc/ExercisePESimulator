package com.exercisepesimulator.common;

import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class XmlFile {

  public static String[] read(String path, String fileName)
    throws Exception {

    String[] data = new String[2];

    File fXmlFile = new File(path + fileName);
    DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
    DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
    Document doc = dBuilder.parse(fXmlFile);
    doc.getDocumentElement().normalize();

    return data;
  }
}
