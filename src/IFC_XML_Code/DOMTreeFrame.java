package IFC_XML_Code;

import Starting.SwingWorker;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import static java.util.stream.DoubleStream.builder;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;


class DOMTreeFrame extends JFrame
{
    DocumentBuilder builder ;
    static JTree tree;
    JTree tree1;
    String ssss;
     
   public DOMTreeFrame(String s)
   {
      setTitle("DOMTreeTest");
      Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
        int width=(int)d.getWidth();
        int height=(int)d.getHeight();
        setSize(width,height);

      JMenu fileMenu = new JMenu("File");
      JMenuItem openItem = new JMenuItem("Open");
      openItem.addActionListener(new ActionListener()
         {
            public void actionPerformed(ActionEvent event)
            {
              openFile(s);
            }
         });
      fileMenu.add(openItem);

      JMenuItem exitItem = new JMenuItem("Exit");
      exitItem.addActionListener(new ActionListener()
         {
            public void actionPerformed(ActionEvent event)
            {
               System.exit(0);
            }
         });
      fileMenu.add(exitItem);

      JMenuBar menuBar = new JMenuBar();
      menuBar.add(fileMenu);
      setJMenuBar(menuBar);
   }

   /**
    * Open a file and load the document.
    */
   public JTree openFile(String s)
   {
      
     
      File file = new File(s);

      new SwingWorker<Document, Void>()
         {
            protected Document doInBackground() throws Exception
            {
               if (builder == null)
               {
                  DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
                  builder = factory.newDocumentBuilder();
               }
               return builder.parse(file);
            }

            protected JTree done()
            {
               try
               {
                  Document doc = get();
                   tree = new JTree(new DOMTreeModel(doc));
                  tree.setCellRenderer(new DOMTreeCellRenderer());
                 ssss=tree.toString();
  
                  setContentPane(new JScrollPane(tree));
              
                  validate();
                  System.out.println(tree);
                 
                      return tree;
               }
               catch (Exception e)
               {
                  JOptionPane.showMessageDialog(DOMTreeFrame.this, e);
               }
                return tree;
            }
            
         }.execute();
     
      
     return tree; 
   }
  
   public JTree getTree(String s) throws ParserConfigurationException, SAXException, IOException
   {
     
               File file = new File(s);
               while(builder!=null)
               {
     
    
          builder.parse(file);
      
               }
                if (builder == null)
               {
                  DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
                  builder = factory.newDocumentBuilder();
               }
                Document doc = builder.parse(file);
                   tree = new JTree(new DOMTreeModel(doc));
                  tree.setCellRenderer(new DOMTreeCellRenderer());
               
    
       return tree;
   }
}
