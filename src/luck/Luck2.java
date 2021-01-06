/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package luck;

/**
 *
 * @author as
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import javax.swing.JOptionPane;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Luck2 {
public void readFile(String r)throws Exception
	{
	File f=new File(r);
	FileReader fr=new FileReader(f);
	BufferedReader br=new BufferedReader(fr);
	String str=br.readLine();
	while(str!=null)
	{
		System.out.println(str);
		str=br.readLine();
	}
	fr.close();
	br.close();
	}
	public void writeFile(String n,String k)throws Exception
	{
	File f=new File(n);
	FileWriter fw=new FileWriter(f,true);
	BufferedWriter bw=new BufferedWriter(fw);
	
	String str=k;
        bw.write(str);
		
	
	bw.close();
	fw.close();
	}
        public static void main(String as[])throws Exception
        {
        Luck2 l=new Luck2();
        String k;
        NodeList fstNm;
        //l.readFile("rectangular tank.ifcxml");
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        
        Document document = db.parse(new File("STRCLM.ifcxml"));
        

        NodeList nodeList = document.getElementsByTagName("IfcPropertySingleValue");
         
        int count=0;
        for(int i=0;i<nodeList.getLength();i++)
        {
            
            System.out.println(i);
            //System.out.println(nodeList.item(i).getNodeValue());     
            Node fstNode = nodeList.item((int)i);
            Element fstElmnt = (Element) fstNode;
      NodeList fstNmElmntLst = fstElmnt.getElementsByTagName("IfcInteger-wrapper");
        
           // nodeList.item((int)i).getAttributes().getNamedItem("id").isSupported(null, null);
            Element el = (org.w3c.dom.Element) nodeList.item((int)i);
       if(el.hasAttribute("id"))
        {
            
        
            //String nodeValue = nodeList.item((int)i).getAttributes().getNamedItem("id").getNodeValue();
            String d=el.getAttribute("id").toString();
            
            System.out.println(d);
            k="\n\n\n\t\t\t\t\t\t\t\t\t\t\t\t-------------------------------Model Validator------------------------------";
            l.writeFile("No_of_Bars.BIM",k);
            if(d.equals("i12329"))
            {
                System.out.println(i);
    if (fstNode.getNodeType() == Node.ELEMENT_NODE) {
        
  
          
      Element fstNmElmnt = (Element) fstNmElmntLst.item(0);
      System.out.println(fstNmElmnt);
       fstNm = fstNmElmnt.getChildNodes();
      System.out.println(fstNm.item(0).getNodeValue());
      
      System.out.println(d);
      //int no_of_bars=Integer.parseInt(fstNm.item((int)i).getNodeValue());
      String str=fstNm.item(0).getNodeValue();
      System.out.println(str);
      
            
             int no_of_bars=Integer.parseInt(str);
      //System.out.println(Integer.parseInt(el.getAttribute("type_id")));
      //int no_of_bars=Integer.parseInt(fstNm.item((int)i).getNodeValue());
             
      if(no_of_bars>=4)
      {
          System.out.println("No_of_Bars in the Column : "+no_of_bars);
          //JOptionPane.showMessageDialog(null, "Depth is Valid : "+no_of_bars);
          count=1;
          k="\n\n\t\t\t No_of_Bars in the Column : "+no_of_bars;
          k=k+"\n\n \t\t\t No_of_Bars in the Column is Valid i.e."+no_of_bars;
         l.writeFile("No_of_bars.BIM",k);
      }
      else
      {
          System.out.println("No_of_Bars in the Column : "+no_of_bars+"must be>=4");
          //JOptionPane.showMessageDialog(null,"Depth is InValid : "+no_of_bars+"must be>10000 and <12000");
          count=1;
          k="\n\n\n No_of_Bars in the Column : "+no_of_bars;
          k=k+"\n\n \t\t\t No_of_Bars in the Column :"+no_of_bars+" is InValid. Should be Greater than equal to 4";
         l.writeFile("No_of_bars.BIM",k);
         
      }
      //System.out.println(no_of_bars);
      /*NodeList lstNmElmntLst = fstElmnt.getElementsByTagName("lastname");
      Element lstNmElmnt = (Element) lstNmElmntLst.item(0);
      NodeList lstNm = lstNmElmnt.getChildNodes();
      System.out.println("Last Name : " + ((Node) lstNm.item(0)).getNodeValue());*/
        }
            }
            
        
}
        }
        }
}