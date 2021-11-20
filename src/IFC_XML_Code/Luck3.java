/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package IFC_XML_Code;

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
public class Luck3 {
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
        int Lowest=1;
        //l.readFile("rectangular tank.ifcxml");
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        
        Document document = db.parse(new File("STRCLM.ifcxml"));
        

        NodeList nodeList = document.getElementsByTagName("IfcColumn");
         
        int count=0;
        for(int i=0;i<nodeList.getLength();i++)
        {
            
            System.out.println(i);
            //System.out.println(nodeList.item(i).getNodeValue());     
            Node fstNode = nodeList.item((int)i);
            Element fstElmnt = (Element) fstNode;
      NodeList fstNmElmntLst = fstElmnt.getElementsByTagName("ObjectType");
        
           // nodeList.item((int)i).getAttributes().getNamedItem("id").isSupported(null, null);
            Element el = (org.w3c.dom.Element) nodeList.item((int)i);
       if(el.hasAttribute("id"))
        {
            
        
            //String nodeValue = nodeList.item((int)i).getAttributes().getNamedItem("id").getNodeValue();
            String d=el.getAttribute("id").toString();
            
            System.out.println(d);
            k="\n\n\n\t\t\t\t\t\t\t\t\t\t\t\t-------------------------------Model Validator------------------------------";
            l.writeFile("Slenderness_Ratio.BIM",k);
            if(d.equals("i1774"))
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
      int ln=str.length();
      int loc=-1;
      for(i=0;i<ln;i++)
      {
          if(str.charAt(i)=='X' || str.charAt(i)=='x')
          {
               loc=i;
              break;
          }
      }
      if(loc==-1)
      {
          System.out.println("Not Found");
          break;
      
      }
            String D=str.substring(0,loc);
            String L=str.substring(loc+1, ln);
            
            int D1=Integer.parseInt(D);
            int L1=Integer.parseInt(L);
            System.out.println("D : "+D1);
            System.out.println("L : "+L1);
             
      //System.out.println(Integer.parseInt(el.getAttribute("type_id")));
      //int no_of_bars=Integer.parseInt(fstNm.item((int)i).getNodeValue());
             
      if(D1>L1)
      {
          System.out.println(D1+"is Greater Than"+L1);
          count=1;
          Lowest=L1;
          /*k="\n\n\t\t\t No_of_Bars in the Column : "+no_of_bars;
          k=k+"\n\n \t\t\t No_of_Bars in the Column is Valid i.e."+no_of_bars;
         l.writeFile("No_of_bars.BIM",k);*/
      }
      else if(L1>D1)
      {
          System.out.println(L1+"is Greater Than "+D1);
          //JOptionPane.showMessageDialog(null,"Depth is InValid : "+no_of_bars+"must be>10000 and <12000");
          count=1;
          Lowest=D1;
         /* k="\n\n\n No_of_Bars in the Column : "+no_of_bars;
          k=k+"\n\n \t\t\t No_of_Bars in the Column :"+no_of_bars+" is InValid. Should be Greater than equal to 4";
         l.writeFile("No_of_bars.BIM",k);
         */
      }
      else
      {
          System.out.println(L1+"is Equal to "+D1);
          //JOptionPane.showMessageDialog(null,"Depth is InValid : "+no_of_bars+"must be>10000 and <12000");
          count=1;
          Lowest=L1;
         /* k="\n\n\n No_of_Bars in the Column : "+no_of_bars;
          k=k+"\n\n \t\t\t No_of_Bars in the Column :"+no_of_bars+" is InValid. Should be Greater than equal to 4";
         l.writeFile("No_of_bars.BIM",k);
         */
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
        NodeList nodeList1 = document.getElementsByTagName("IfcExtrudedAreaSolid");
         
        int count1=0;
        for(int i=0;i<nodeList1.getLength();i++)
        {
            
            System.out.println(i);
            //System.out.println(nodeList.item(i).getNodeValue());     
            Node fstNode = nodeList1.item((int)i);
            Element fstElmnt = (Element) fstNode;
      NodeList fstNmElmntLst = fstElmnt.getElementsByTagName("Depth");
        
           // nodeList.item((int)i).getAttributes().getNamedItem("id").isSupported(null, null);
            Element el = (org.w3c.dom.Element) nodeList1.item((int)i);
       if(el.hasAttribute("id"))
        {
            
        
            //String nodeValue = nodeList.item((int)i).getAttributes().getNamedItem("id").getNodeValue();
            String d=el.getAttribute("id").toString();
            
            System.out.println(d);
            
            if(d.equals("i1749"))
            {
                System.out.println(i);
    if (fstNode.getNodeType() == Node.ELEMENT_NODE) {
        
  
          
      Element fstNmElmnt = (Element) fstNmElmntLst.item(0);
      System.out.println(fstNmElmnt);
       fstNm = fstNmElmnt.getChildNodes();
      System.out.println(fstNm.item(0).getNodeValue());
      
      System.out.println(d);
      //int depth=Integer.parseInt(fstNm.item((int)i).getNodeValue());
      String str=fstNm.item(0).getNodeValue().toString();
      System.out.println(str);
      int ln=str.length();
            String str1= str.substring(0,ln-1);
             int depth=Integer.parseInt(str1);
      //System.out.println(Integer.parseInt(el.getAttribute("type_id")));
      //int depth=Integer.parseInt(fstNm.item((int)i).getNodeValue());
             int ratio=depth/Lowest;
      if(ratio<=12)
      {
          System.out.println("Column with Selenderness Ratio : "+ratio);
          //JOptionPane.showMessageDialog(null, "Depth is Valid : "+depth);
          count1=1;
          k="\n\n\nColumn with Selenderness Ratio :   "+ratio;
          k=k+"\n\n \t\t\t Column is a Short Column";
         l.writeFile("Slenderness_Ratio.BIM",k);
      }
      else
      {
          System.out.println("Column with Selenderness Ratio : "+ratio);
          //JOptionPane.showMessageDialog(null,"Depth is InValid : "+depth+"must be>10000 and <12000");
          count1=1;
          k="\n\n\n Column with Selenderness Ratio :   "+ratio;
          k=k+"\n\n \t\t\t Column is a Long Column";
         l.writeFile("Slenderness_Ratio.BIM",k);
         
      }
    }
      //System.out.println(depth);
      /*NodeList lstNmElmntLst = fstElmnt.getElementsByTagName("lastname");
      Element lstNmElmnt = (Element) lstNmElmntLst.item(0);
      NodeList lstNm = lstNmElmnt.getChildNodes();
      System.out.println("Last Name : " + ((Node) lstNm.item(0)).getNodeValue());*/
        }
        }
        }
        }
}
   