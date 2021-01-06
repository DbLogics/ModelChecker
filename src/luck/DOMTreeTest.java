package luck;

import java.awt.EventQueue;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.event.*;
import javax.swing.table.*;
import javax.swing.tree.*;
import javax.xml.parsers.*;
import org.w3c.dom.*;
import org.xml.sax.SAXException;

/**
 * This program displays an XML document as a tree.
 * @version 1.11 2007-06-24
 * @author Cay Horstmann
 */
public class DOMTreeTest
{
    public JTree getTreee(String s) throws ParserConfigurationException, SAXException, IOException
    {
        DOMTreeFrame frame = new DOMTreeFrame(s);
              JTree j= frame.getTree(s);
              System.out.println(j);
               frame.setVisible(false);
               
               return j;
    }
   public static void main(String[] args)
   {
      EventQueue.invokeLater(new Runnable()
         {
            public void run()
            {
               DOMTreeFrame frame = new DOMTreeFrame("C:\\Users\\DataByte_Logics\\Desktop\\ifc\\luck\\Column24.ifcxml");
              //JTree j= frame.getTree("C:\\Users\\rk nanda\\Desktop\\Column24.ifcxml");
               frame.setVisible(true);
            }
         });
   }
}