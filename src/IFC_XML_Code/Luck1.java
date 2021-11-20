/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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

public class Luck1 {
   
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
    public static void main(String[] args) throws Exception {
        long heapSize = Runtime.getRuntime().totalMemory();
		int diameter=0,diameter1=0,diameter2=0,diameter3=0,diameter4=0,diameter6=0,spacing=0;
		//Print the jvm heap size.
		System.out.println("Heap Size = " + heapSize);
        Luck1 l=new Luck1();
        String k;
        NodeList fstNm;
        //l.readFile("rectangular tank.ifcxml");
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        
        Document document = db.parse(new File("STRCLM.ifcxml"));
        

        NodeList nodeList = document.getElementsByTagName("IfcReinforcingBar");
         
        int count=0;
        for(int i=0;i<nodeList.getLength();i++)
        {
            
            System.out.println(i);
            //System.out.println(nodeList.item(i).getNodeValue());     
            Node fstNode = nodeList.item((int)i);
            Element fstElmnt = (Element) fstNode;
      NodeList fstNmElmntLst = fstElmnt.getElementsByTagName("NominalDiameter");
        
           // nodeList.item((int)i).getAttributes().getNamedItem("id").isSupported(null, null);
            Element el = (org.w3c.dom.Element) nodeList.item((int)i);
       if(el.hasAttribute("id"))
        {
            
        
            //String nodeValue = nodeList.item((int)i).getAttributes().getNamedItem("id").getNodeValue();
            String d=el.getAttribute("id").toString();
            
            System.out.println(d);
            k="\n\n\n\t\t\t\t\t\t\t\t\t\t\t\t-------------------------------Model Validator------------------------------";
            l.writeFile("Validation.BIM",k);
            if(d.equals("i11696"))
            {
                System.out.println(i);
    if (fstNode.getNodeType() == Node.ELEMENT_NODE) {
        
  
          
      Element fstNmElmnt = (Element) fstNmElmntLst.item(0);
      System.out.println(fstNmElmnt);
       fstNm = fstNmElmnt.getChildNodes();
      System.out.println(fstNm.item(0).getNodeValue());
      
      System.out.println(d);
      //int diameter=Integer.parseInt(fstNm.item((int)i).getNodeValue());
      String str=fstNm.item(0).getNodeValue().toString();
      System.out.println(str);
      int ln=str.length();
            String str1= str.substring(0,ln-1);
              diameter=Integer.parseInt(str1);
      //System.out.println(Integer.parseInt(el.getAttribute("type_id")));
      //int diameter=Integer.parseInt(fstNm.item((int)i).getNodeValue());
             
      if(diameter>=16&&diameter<=30)
      {
          System.out.println("Diameter of ReinforcingBar is Valid : "+diameter);
          //JOptionPane.showMessageDialog(null, "Depth is Valid : "+diameter);
          count=1;
          k="\n\n\nReinforcing Bar's Diameter   :   "+diameter;
          k=k+"\n\n \t\t\t Reinforcing Bar's Diameter is Valid";
         l.writeFile("Validation1.BIM",k);
      }
      else
      {
          System.out.println("Diameter of ReinforcingBar is InValid : "+diameter+"must be>16 and <30");
          //JOptionPane.showMessageDialog(null,"Depth is InValid : "+diameter+"must be>10000 and <12000");
          count=1;
          k="\n\n\nReinforcing Bar's Diameter   :   "+diameter;
          k=k+"\n\n \t\t\t Reinforcing Bar's Diameter is InValid";
         l.writeFile("Validation1.BIM",k);
         
      }
      //System.out.println(diameter);
      /*NodeList lstNmElmntLst = fstElmnt.getElementsByTagName("lastname");
      Element lstNmElmnt = (Element) lstNmElmntLst.item(0);
      NodeList lstNm = lstNmElmnt.getChildNodes();
      System.out.println("Last Name : " + ((Node) lstNm.item(0)).getNodeValue());*/
        }
            }
            
            
            
    
         }
        }
       NodeList  nodeList1 = document.getElementsByTagName("IfcReinforcingBar");
         
        int count1=0;
        for(int i=0;i<nodeList1.getLength();i++)
        {
            
            System.out.println(i);
            //System.out.println(nodeList.item(i).getNodeValue());     
            Node fstNode = nodeList1.item((int)i);
            Element fstElmnt = (Element) fstNode;
      NodeList fstNmElmntLst = fstElmnt.getElementsByTagName("Description");
        
           // nodeList.item((int)i).getAttributes().getNamedItem("id").isSupported(null, null);
            Element el = (org.w3c.dom.Element) nodeList1.item((int)i);
           // Element el1=(org.w3c.dom.Element) fstNmElmntLst.item((int)i);
       if(el.hasAttribute("id"))
        {
            
        String d1=el.getAttribute("id").toString();
        
        if(d1.equals("i11696"))
            {
            //String nodeValue = nodeList.item((int)i).getAttributes().getNamedItem("id").getNodeValue();
           // String d=el1.getTextContent().toString();
            Element fstNmElmnt = (Element) fstNmElmntLst.item(0);
      System.out.println(fstNmElmnt);
       fstNm = fstNmElmnt.getChildNodes();
      String d= fstNm.item(0).getNodeValue().toString();
           
            
            System.out.println(d);
            k="\n\n\n\t\t\t\t\t\t\t\t\t\t\t\t-------------------------------Model Validator------------------------------";
            l.writeFile("Validation1.BIM",k);
            if(d.equals("rebars"))
            {
                NodeList fstNmElmntLst2 = fstElmnt.getElementsByTagName("ObjectType");
                Element fstNmElmnt2 = (Element) fstNmElmntLst2.item(0);
      System.out.println(fstNmElmnt2);
       fstNm = fstNmElmnt2.getChildNodes();
      String d2= fstNm.item(0).getNodeValue().toString();
      System.out.println(d2);
      if(d2.equals("ReinforcementBars"))
      {
                System.out.println(i);
    if (fstNode.getNodeType() == Node.ELEMENT_NODE) {
        
  
       NodeList fstNmElmntLst1 = fstElmnt.getElementsByTagName("CrossSectionArea");   
      Element fstNmElmnt1 = (Element) fstNmElmntLst1.item(0);
      System.out.println(fstNmElmnt1);
       fstNm= fstNmElmnt1.getChildNodes();
      System.out.println(fstNm.item(0).getNodeValue());
      
      System.out.println(d);
      //int diameter=Integer.parseInt(fstNm.item((int)i).getNodeValue());
      String str=fstNm.item(0).getNodeValue().toString();
      System.out.println(str);
      int ln=str.length();
            String str1= str.substring(0,ln-1);
             diameter1=Integer.parseInt(str1);
      //System.out.println(Integer.parseInt(el.getAttribute("type_id")));
      //int diameter=Integer.parseInt(fstNm.item((int)i).getNodeValue());
             
      if(diameter1>=300&&diameter1<=400)
      {
          System.out.println("Cross Section of ReinforcingBar is Valid : "+diameter1);
          //JOptionPane.showMessageDialog(null, "Depth is Valid : "+diameter);
          count1=1;
          k="\n\n\nReinforcing Bar's Cross Section   :   "+diameter1;
          k=k+"\n\n \t\t\t Reinforcing Bar's Cross Section is Valid";
         l.writeFile("Validation1.BIM",k);
      }
      else
      {
          System.out.println("Cross Section of ReinforcingBar is InValid : "+diameter1+"must be>16 and <30");
          //JOptionPane.showMessageDialog(null,"Depth is InValid : "+diameter+"must be>10000 and <12000");
          count1=1;
          k="\n\n\nReinforcing Bar's Cross Section   :   "+diameter1;
          k=k+"\n\n \t\t\t Reinforcing Bar's Cross Section is InValid";
         l.writeFile("Validation1.BIM",k);
         
      }
      //System.out.println(diameter);
      /*NodeList lstNmElmntLst = fstElmnt.getElementsByTagName("lastname");
      Element lstNmElmnt = (Element) lstNmElmntLst.item(0);
      NodeList lstNm = lstNmElmnt.getChildNodes();
      System.out.println("Last Name : " + ((Node) lstNm.item(0)).getNodeValue());*/
        }
            }
            
            
            
    
         }
            }
        if(d1.equals("i11912"))
            {
            //String nodeValue = nodeList.item((int)i).getAttributes().getNamedItem("id").getNodeValue();
           // String d=el1.getTextContent().toString();
            Element fstNmElmnt = (Element) fstNmElmntLst.item(0);
      System.out.println(fstNmElmnt);
       fstNm = fstNmElmnt.getChildNodes();
      String d= fstNm.item(0).getNodeValue().toString();
           
            
            System.out.println(d);
            k="\n\n\n\t\t\t\t\t\t\t\t\t\t\t\t-------------------------------Model Validator------------------------------";
            l.writeFile("Validation1.BIM",k);
            if(d.equals("rebars"))
            {
                System.out.println(i);
                   NodeList fstNmElmntLst2 = fstElmnt.getElementsByTagName("ObjectType");
                Element fstNmElmnt2 = (Element) fstNmElmntLst2.item(0);
      System.out.println(fstNmElmnt2);
       fstNm = fstNmElmnt.getChildNodes();
      String d2= fstNm.item(0).getNodeValue().toString();
      if(d2.equals("ReinforcementBars"))
      {
    if (fstNode.getNodeType() == Node.ELEMENT_NODE) {
        
  
       NodeList fstNmElmntLst1 = fstElmnt.getElementsByTagName("CrossSectionArea");   
      Element fstNmElmnt1 = (Element) fstNmElmntLst1.item(0);
      System.out.println(fstNmElmnt1);
       fstNm= fstNmElmnt1.getChildNodes();
      System.out.println(fstNm.item(0).getNodeValue());
      
      System.out.println(d);
      //int diameter=Integer.parseInt(fstNm.item((int)i).getNodeValue());
      String str=fstNm.item(0).getNodeValue().toString();
      System.out.println(str);
      int ln=str.length();
            String str1= str.substring(0,ln-1);
             diameter2=Integer.parseInt(str1);
      //System.out.println(Integer.parseInt(el.getAttribute("type_id")));
      //int diameter=Integer.parseInt(fstNm.item((int)i).getNodeValue());
             
      if(diameter2>=300&&diameter2<=400)
      {
          System.out.println("Cross Section of ReinforcingBar is Valid : "+diameter2);
          //JOptionPane.showMessageDialog(null, "Depth is Valid : "+diameter);
          count1=1;
          k="\n\n\nReinforcing Bar's Cross Section   :   "+diameter2;
          k=k+"\n\n \t\t\t Reinforcing Bar's Cross Section is Valid";
         l.writeFile("Validation1.BIM",k);
      }
      else
      {
          System.out.println("Cross Section of ReinforcingBar is InValid : "+diameter2+"must be>16 and <30");
          //JOptionPane.showMessageDialog(null,"Depth is InValid : "+diameter+"must be>10000 and <12000");
          count1=1;
          k="\n\n\nReinforcing Bar's Cross Section   :   "+diameter2;
          k=k+"\n\n \t\t\t Reinforcing Bar's Cross Section is InValid";
         l.writeFile("Validation1.BIM",k);
         
      }
      //System.out.println(diameter);
      /*NodeList lstNmElmntLst = fstElmnt.getElementsByTagName("lastname");
      Element lstNmElmnt = (Element) lstNmElmntLst.item(0);
      NodeList lstNm = lstNmElmnt.getChildNodes();
      System.out.println("Last Name : " + ((Node) lstNm.item(0)).getNodeValue());*/
        }
            }
            
            
            
    
         }
            }
        if(d1.equals("i12119"))
            {
            //String nodeValue = nodeList.item((int)i).getAttributes().getNamedItem("id").getNodeValue();
           // String d=el1.getTextContent().toString();
            Element fstNmElmnt = (Element) fstNmElmntLst.item(0);
      System.out.println(fstNmElmnt);
       fstNm = fstNmElmnt.getChildNodes();
      String d= fstNm.item(0).getNodeValue().toString();
           
            
            System.out.println(d);
            k="\n\n\n\t\t\t\t\t\t\t\t\t\t\t\t-------------------------------Model Validator------------------------------";
            l.writeFile("Validation1.BIM",k);
            if(d.equals("rebars"))
            {
                   NodeList fstNmElmntLst2 = fstElmnt.getElementsByTagName("ObjectType");
                Element fstNmElmnt2 = (Element) fstNmElmntLst2.item(0);
      System.out.println(fstNmElmnt2);
       fstNm = fstNmElmnt2.getChildNodes();
      String d2= fstNm.item(0).getNodeValue().toString();
      if(d2.equals("ReinforcementBars"))
      {
                System.out.println(i);
    if (fstNode.getNodeType() == Node.ELEMENT_NODE) {
        
  
       NodeList fstNmElmntLst1 = fstElmnt.getElementsByTagName("CrossSectionArea");   
      Element fstNmElmnt1 = (Element) fstNmElmntLst1.item(0);
      System.out.println(fstNmElmnt1);
       fstNm= fstNmElmnt1.getChildNodes();
      System.out.println(fstNm.item(0).getNodeValue());
      
      System.out.println(d);
      //int diameter=Integer.parseInt(fstNm.item((int)i).getNodeValue());
      String str=fstNm.item(0).getNodeValue().toString();
      System.out.println(str);
      int ln=str.length();
            String str1= str.substring(0,ln-1);
              diameter3=Integer.parseInt(str1);
      //System.out.println(Integer.parseInt(el.getAttribute("type_id")));
      //int diameter=Integer.parseInt(fstNm.item((int)i).getNodeValue());
             
      if(diameter3>=300&&diameter3<=400)
      {
          System.out.println("Cross Section of ReinforcingBar is Valid : "+diameter3);
          //JOptionPane.showMessageDialog(null, "Depth is Valid : "+diameter);
          count1=1;
          k="\n\n\nReinforcing Bar's Cross Section   :   "+diameter3;
          k=k+"\n\n \t\t\t Reinforcing Bar's Cross Section is Valid";
         l.writeFile("Validation1.BIM",k);
      }
      else
      {
          System.out.println("Cross Section of ReinforcingBar is InValid : "+diameter3+"must be>16 and <30");
          //JOptionPane.showMessageDialog(null,"Depth is InValid : "+diameter+"must be>10000 and <12000");
          count1=1;
          k="\n\n\nReinforcing Bar's Cross Section   :   "+diameter3;
          k=k+"\n\n \t\t\t Reinforcing Bar's Cross Section is InValid";
         l.writeFile("Validation1.BIM",k);
         
      }
      //System.out.println(diameter);
      /*NodeList lstNmElmntLst = fstElmnt.getElementsByTagName("lastname");
      Element lstNmElmnt = (Element) lstNmElmntLst.item(0);
      NodeList lstNm = lstNmElmnt.getChildNodes();
      System.out.println("Last Name : " + ((Node) lstNm.item(0)).getNodeValue());*/
        }
            }
            
            
            
    
         }
            }
        if(d1.equals("i12326"))
            {
            //String nodeValue = nodeList.item((int)i).getAttributes().getNamedItem("id").getNodeValue();
           // String d=el1.getTextContent().toString();
            Element fstNmElmnt = (Element) fstNmElmntLst.item(0);
      System.out.println(fstNmElmnt);
       fstNm = fstNmElmnt.getChildNodes();
      String d= fstNm.item(0).getNodeValue().toString();
           
            
            System.out.println(d);
            k="\n\n\n\t\t\t\t\t\t\t\t\t\t\t\t-------------------------------Model Validator------------------------------";
            l.writeFile("Validation1.BIM",k);
            if(d.equals("rebars"))
            {
                   NodeList fstNmElmntLst2 = fstElmnt.getElementsByTagName("ObjectType");
                Element fstNmElmnt2 = (Element) fstNmElmntLst2.item(0);
      System.out.println(fstNmElmnt2);
       fstNm = fstNmElmnt2.getChildNodes();
      String d2= fstNm.item(0).getNodeValue().toString();
      if(d2.equals("ReinforcementBars"))
      {
                System.out.println(i);
    if (fstNode.getNodeType() == Node.ELEMENT_NODE) {
        
  
       NodeList fstNmElmntLst1 = fstElmnt.getElementsByTagName("CrossSectionArea");   
      Element fstNmElmnt1 = (Element) fstNmElmntLst1.item(0);
      System.out.println(fstNmElmnt1);
       fstNm= fstNmElmnt1.getChildNodes();
      System.out.println(fstNm.item(0).getNodeValue());
      
      System.out.println(d);
      //int diameter=Integer.parseInt(fstNm.item((int)i).getNodeValue());
      String str=fstNm.item(0).getNodeValue().toString();
      System.out.println(str);
      int ln=str.length();
            String str1= str.substring(0,ln-1);
              diameter4=Integer.parseInt(str1);
      //System.out.println(Integer.parseInt(el.getAttribute("type_id")));
      //int diameter=Integer.parseInt(fstNm.item((int)i).getNodeValue());
             
      if(diameter4>=300&&diameter4<=400)
      {
          System.out.println("Cross Section of ReinforcingBar is Valid : "+diameter4);
          //JOptionPane.showMessageDialog(null, "Depth is Valid : "+diameter);
          count1=1;
          k="\n\n\nReinforcing Bar's Cross Section   :   "+diameter4;
          k=k+"\n\n \t\t\t Reinforcing Bar's Cross Section is Valid";
         l.writeFile("Validation1.BIM",k);
      }
      else
      {
          System.out.println("Cross Section of ReinforcingBar is InValid : "+diameter4+"must be>16 and <30");
          //JOptionPane.showMessageDialog(null,"Depth is InValid : "+diameter+"must be>10000 and <12000");
          count1=1;
          k="\n\n\nReinforcing Bar's Cross Section   :   "+diameter4;
          k=k+"\n\n \t\t\t Reinforcing Bar's Cross Section is InValid";
         l.writeFile("Validation1.BIM",k);
         
      }
      //System.out.println(diameter);
      /*NodeList lstNmElmntLst = fstElmnt.getElementsByTagName("lastname");
      Element lstNmElmnt = (Element) lstNmElmntLst.item(0);
      NodeList lstNm = lstNmElmnt.getChildNodes();
      System.out.println("Last Name : " + ((Node) lstNm.item(0)).getNodeValue());*/
        }
            }
            
            
            
    
         }
            }
        if(d1.equals("i12533"))
            {
            //String nodeValue = nodeList.item((int)i).getAttributes().getNamedItem("id").getNodeValue();
           // String d=el1.getTextContent().toString();
            Element fstNmElmnt = (Element) fstNmElmntLst.item(0);
      System.out.println(fstNmElmnt);
       fstNm = fstNmElmnt.getChildNodes();
      String d= fstNm.item(0).getNodeValue().toString();
           
            
            System.out.println(d);
            k="\n\n\n\t\t\t\t\t\t\t\t\t\t\t\t-------------------------------Model Validator------------------------------";
            l.writeFile("Validation1.BIM",k);
            if(d.equals("rebars"))
            {
                   NodeList fstNmElmntLst2 = fstElmnt.getElementsByTagName("ObjectType");
                Element fstNmElmnt2 = (Element) fstNmElmntLst2.item(0);
      System.out.println(fstNmElmnt2);
       fstNm = fstNmElmnt2.getChildNodes();
      String d2= fstNm.item(0).getNodeValue().toString();
      if(d2.equals("ReinforcementBars"))
      {
                System.out.println(i);
    if (fstNode.getNodeType() == Node.ELEMENT_NODE) {
        
  
       NodeList fstNmElmntLst1 = fstElmnt.getElementsByTagName("CrossSectionArea");   
      Element fstNmElmnt1 = (Element) fstNmElmntLst1.item(0);
      System.out.println(fstNmElmnt1);
       fstNm= fstNmElmnt1.getChildNodes();
      System.out.println(fstNm.item(0).getNodeValue());
      
      System.out.println(d);
      //int diameter=Integer.parseInt(fstNm.item((int)i).getNodeValue());
      String str=fstNm.item(0).getNodeValue().toString();
      System.out.println(str);
      int ln=str.length();
            String str1= str.substring(0,ln-1);
              diameter6=Integer.parseInt(str1);
      //System.out.println(Integer.parseInt(el.getAttribute("type_id")));
      //int diameter=Integer.parseInt(fstNm.item((int)i).getNodeValue());
             
      if(diameter6>=300&&diameter6<=400)
      {
          System.out.println("Cross Section of ReinforcingBar is Valid : "+diameter6);
          //JOptionPane.showMessageDialog(null, "Depth is Valid : "+diameter);
          count1=1;
          k="\n\n\nReinforcing Bar's Cross Section   :   "+diameter6;
          k=k+"\n\n \t\t\t Reinforcing Bar's Cross Section is Valid";
         l.writeFile("Validation1.BIM",k);
      }
      else
      {
          System.out.println("Cross Section of ReinforcingBar is InValid : "+diameter6+"must be>16 and <30");
          //JOptionPane.showMessageDialog(null,"Depth is InValid : "+diameter+"must be>10000 and <12000");
          count1=1;
          k="\n\n\nReinforcing Bar's Cross Section   :   "+diameter6;
          k=k+"\n\n \t\t\t Reinforcing Bar's Cross Section is InValid";
         l.writeFile("Validation1.BIM",k);
         
      }
      //System.out.println(diameter);
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
         NodeList  nodeList3 = document.getElementsByTagName("IfcPropertySingleValue");
         
        int count2=0;
        System.out.println(nodeList3.getLength());
        for(int i=0;i<nodeList3.getLength();i++)
        {
            
            System.out.println(i);
            
            //System.out.println(nodeList.item(i).getNodeValue());     
            Node fstNode = nodeList3.item((int)i);
            Element fstElmnt = (Element)fstNode;
      NodeList fstNmElmntLst = fstElmnt.getElementsByTagName("Name");
        
           // nodeList.item((int)i).getAttributes().getNamedItem("id").isSupported(null, null);
            Element el = (org.w3c.dom.Element) nodeList3.item((int)i);
           // Element el1=(org.w3c.dom.Element) fstNmElmntLst.item((int)i);
       if(el.hasAttribute("id"))
        {
            
        String d1=el.getAttribute("id").toString();
      System.out.println(d1);
      
        if(d1.equals("i12314"))
            {  System.out.println("Rahul");
            //String nodeValue = nodeList.item((int)i).getAttributes().getNamedItem("id").getNodeValue();
           // String d=el1.getTextContent().toString();
            
            Element fstNmElmnt = (Element) fstNmElmntLst.item(0);
      System.out.println(fstNmElmnt);
       fstNm = fstNmElmnt.getChildNodes();
      String d= fstNm.item(0).getNodeValue().toString();
           System.out.println(d);
            
            System.out.println(d);
            k="\n\n\n\t\t\t\t\t\t\t\t\t\t\t\t-------------------------------Model Validator------------------------------";
            l.writeFile("Validation2.BIM",k);
            if(d.equals("C/CSpacing"))
            {   System.out.println("Rk");
                
      NodeList fstNmElmntLst1 = fstElmnt.getElementsByTagName("IfcReal-wrapper");
                System.out.println(i);
    if (fstNode.getNodeType() == Node.ELEMENT_NODE) {
        
  Element fstNmElmnt1 = (Element) fstNmElmntLst1.item(0);
       fstNm = fstNmElmnt1.getChildNodes();
      //int diameter=Integer.parseInt(fstNm.item((int)i).getNodeValue());
       System.out.println(fstNm.item(0).getNodeValue());
      String str=fstNm.item(0).getNodeValue().toString();
      System.out.println(str);
      int ln=str.length();
            String str1= str.substring(0,ln-1);
             diameter1=Integer.parseInt(str1);
      //System.out.println(Integer.parseInt(el.getAttribute("type_id")));
      //int diameter=Integer.parseInt(fstNm.item((int)i).getNodeValue());
             
      if(diameter1<=300)
      {
          System.out.println("C/C Spacing is Valid : "+diameter1);
          //JOptionPane.showMessageDialog(null, "Depth is Valid : "+diameter);
          count2=1;
          k="\n\n\n C/C Spacing    :   "+diameter1;
          k=k+"\n\n \t\t\t C/C Spacing is Valid";
         l.writeFile("Validation2.BIM",k);
      }
      else
      {
          System.out.println("C/C Spacing is InValid : "+diameter1+"must be>300");
          //JOptionPane.showMessageDialog(null,"Depth is InValid : "+diameter+"must be>10000 and <12000");
          count2=1;
          k="\n\n\n C/C Spacing   :   "+diameter1;
          k=k+"\n\n \t\t\t C/C Spacing is InValid";
         l.writeFile("Validation2.BIM",k);
         
      }
      //System.out.println(diameter);
      /*NodeList lstNmElmntLst = fstElmnt.getElementsByTagName("lastname");
      Element lstNmElmnt = (Element) lstNmElmntLst.item(0);
      NodeList lstNm = lstNmElmnt.getChildNodes();
      System.out.println("Last Name : " + ((Node) lstNm.item(0)).getNodeValue());*/
        }
            
            
            
            
    
         }
            else if(d.equals("ClearCover"))
            {
                NodeList fstNmElmntLst2 = fstElmnt.getElementsByTagName("IfcReal-wrapper");
                Element fstNmElmnt2 = (Element) fstNmElmntLst2.item(0);
      System.out.println(fstNmElmnt2);
       fstNm = fstNmElmnt2.getChildNodes();
      //String d2= fstNm.item(0).getNodeValue().toString();
      //System.out.println(d2);
     
                System.out.println(i);
    if (fstNode.getNodeType() == Node.ELEMENT_NODE) {
        
  
       
      //int diameter=Integer.parseInt(fstNm.item((int)i).getNodeValue());
      String str=fstNm.item(0).getNodeValue().toString();
      System.out.println(str);
      int ln=str.length();
            String str1= str.substring(0,ln-1);
             diameter1=Integer.parseInt(str1);
      //System.out.println(Integer.parseInt(el.getAttribute("type_id")));
      //int diameter=Integer.parseInt(fstNm.item((int)i).getNodeValue());
             
      if(diameter1>=20 &&diameter1<=100)
      {
          System.out.println("ClearCover Spacing is Valid : "+diameter1);
          //JOptionPane.showMessageDialog(null, "Depth is Valid : "+diameter);
          count2=1;
          k="\n\n\n ClearCover Spacing    :   "+diameter1;
          k=k+"\n\n \t\t\t ClearCover Spacing is Valid";
         l.writeFile("Validation2.BIM",k);
      }
      else
      {
          System.out.println("ClearCover Spacing is InValid : "+diameter1+"must be>300");
          //JOptionPane.showMessageDialog(null,"Depth is InValid : "+diameter+"must be>10000 and <12000");
          count1=1;
          k="\n\n\n ClearCover Spacing   :   "+diameter1;
          k=k+"\n\n \t\t\t ClearCover Spacing is InValid";
         l.writeFile("Validation2.BIM",k);
         
      }
      //System.out.println(diameter);
      /*NodeList lstNmElmntLst = fstElmnt.getElementsByTagName("lastname");
      Element lstNmElmnt = (Element) lstNmElmntLst.item(0);
      NodeList lstNm = lstNmElmnt.getChildNodes();
      System.out.println("Last Name : " + ((Node) lstNm.item(0)).getNodeValue());*/
        }
            }
            }
        if(d1.equals("i12318"))
            {
            //String nodeValue = nodeList.item((int)i).getAttributes().getNamedItem("id").getNodeValue();
           // String d=el1.getTextContent().toString();
                System.out.println("Nanda");
            Element fstNmElmnt = (Element) fstNmElmntLst.item(0);
      System.out.println(fstNmElmnt);
       fstNm = fstNmElmnt.getChildNodes();
      String d= fstNm.item(0).getNodeValue().toString();
           
            
            System.out.println(d);
            k="\n\n\n\t\t\t\t\t\t\t\t\t\t\t\t-------------------------------Model Validator------------------------------";
            l.writeFile("Validation2.BIM",k);
            if(d.equals("C/CSpacing"))
            {
                NodeList fstNmElmntLst2 = fstElmnt.getElementsByTagName("IfcReal-wrapper");
                Element fstNmElmnt2 = (Element) fstNmElmntLst2.item(0);
      System.out.println(fstNmElmnt2);
       fstNm = fstNmElmnt2.getChildNodes();
      //String d2= fstNm.item(0).getNodeValue().toString();
      //System.out.println(d2);
     
                System.out.println(i);
    if (fstNode.getNodeType() == Node.ELEMENT_NODE) {
        
  
       
      //int diameter=Integer.parseInt(fstNm.item((int)i).getNodeValue());
      String str=fstNm.item(0).getNodeValue().toString();
      System.out.println(str);
      int ln=str.length();
            String str1= str.substring(0,ln-1);
             spacing=Integer.parseInt(str1);
      //System.out.println(Integer.parseInt(el.getAttribute("type_id")));
      //int diameter=Integer.parseInt(fstNm.item((int)i).getNodeValue());
             
      if(spacing<=300)
      {
          System.out.println("C/C Spacing is Valid : "+spacing);
          //JOptionPane.showMessageDialog(null, "Depth is Valid : "+diameter);
          count2=1;
          k="\n\n\n C/C Spacing    :   "+spacing;
          k=k+"\n\n \t\t\t C/C Spacing is Valid";
         l.writeFile("Validation2.BIM",k);
      }
      else
      {
          System.out.println("C/C Spacing is InValid : "+spacing+"must be>300");
          //JOptionPane.showMessageDialog(null,"Depth is InValid : "+diameter+"must be>10000 and <12000");
          count2=1;
          k="\n\n\n C/C Spacing   :   "+spacing;
          k=k+"\n\n \t\t\t C/C Spacing is InValid";
         l.writeFile("Validation2.BIM",k);
         
      }
      //System.out.println(diameter);
      /*NodeList lstNmElmntLst = fstElmnt.getElementsByTagName("lastname");
      Element lstNmElmnt = (Element) lstNmElmntLst.item(0);
      NodeList lstNm = lstNmElmnt.getChildNodes();
      System.out.println("Last Name : " + ((Node) lstNm.item(0)).getNodeValue());*/
        }
            
            
            
            
    
         }
            else if(d.equals("ClearCover"))
            {
                NodeList fstNmElmntLst2 = fstElmnt.getElementsByTagName("IfcReal-wrapper");
                Element fstNmElmnt2 = (Element) fstNmElmntLst2.item(0);
      System.out.println(fstNmElmnt2);
       fstNm = fstNmElmnt2.getChildNodes();
      //String d2= fstNm.item(0).getNodeValue().toString();
      //System.out.println(d2);
     
                System.out.println(i);
    if (fstNode.getNodeType() == Node.ELEMENT_NODE) {
        
  
       
      //int diameter=Integer.parseInt(fstNm.item((int)i).getNodeValue());
      String str=fstNm.item(0).getNodeValue().toString();
      System.out.println(str);
      int ln=str.length();
            String str1= str.substring(0,ln-1);
             spacing=Integer.parseInt(str1);
      //System.out.println(Integer.parseInt(el.getAttribute("type_id")));
      //int diameter=Integer.parseInt(fstNm.item((int)i).getNodeValue());
             
      if(spacing>=20 &&spacing<=100)
      {
          System.out.println("ClearCover Spacing is Valid : "+spacing);
          //JOptionPane.showMessageDialog(null, "Depth is Valid : "+diameter);
          count2=1;
          k="\n\n\n ClearCover Spacing    :   "+spacing;
          k=k+"\n\n \t\t\t ClearCover Spacing is Valid";
         l.writeFile("Validation2.BIM",k);
      }
      else
      {
          System.out.println("ClearCover Spacing is InValid : "+spacing+"must be>300");
          //JOptionPane.showMessageDialog(null,"Depth is InValid : "+diameter+"must be>10000 and <12000");
          count2=1;
          k="\n\n\n ClearCover Spacing   :   "+spacing;
          k=k+"\n\n \t\t\t ClearCover Spacing is InValid";
         l.writeFile("Validation2.BIM",k);
         
      }
      //System.out.println(diameter);
      /*NodeList lstNmElmntLst = fstElmnt.getElementsByTagName("lastname");
      Element lstNmElmnt = (Element) lstNmElmntLst.item(0);
      NodeList lstNm = lstNmElmnt.getChildNodes();
      System.out.println("Last Name : " + ((Node) lstNm.item(0)).getNodeValue());*/
        }
            }
            }
       
        }
        }
        NodeList nodelist2 = document.getElementsByTagName("IfcReinforcingBar");
         
        int count4=0;
        for(int i=0;i<nodelist2.getLength();i++)
        {
            
            System.out.println(i);
            //System.out.println(nodelist2.item(i).getNodeValue());     
            Node fstNode = nodelist2.item((int)i);
            Element fstElmnt = (Element) fstNode;
      NodeList fstNmElmntLst = fstElmnt.getElementsByTagName("CrossSectionArea");
        
           // nodelist2.item((int)i).getAttributes().getNamedItem("id").isSupported(null, null);
            Element el = (org.w3c.dom.Element) nodelist2.item((int)i);
       if(el.hasAttribute("id"))
        {
            
        
            //String nodeValue = nodelist2.item((int)i).getAttributes().getNamedItem("id").getNodeValue();
            String d=el.getAttribute("id").toString();
            
            System.out.println(d);
            k="\n\n\n\t\t\t\t\t\t\t\t\t\t\t\t-------------------------------Model Validator------------------------------";
            l.writeFile("Validation.BIM",k);
            if(d.equals("i12290"))
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
      int area_of_cross_section=str.length();
            String str1= str.substring(0,area_of_cross_section-1);
             double depth=Double.parseDouble(str1);
      //System.out.println(Integer.parseInt(el.getAttribute("type_id")));
      //int depth=Integer.parseInt(fstNm.item((int)i).getNodeValue());
        double min=(0.8/100)*250000;
        double max=(0.06)*250000;
        System.out.println("max : "+max);
        System.out.println("min : "+min);
      if(depth>= min&&depth<=(int)max)
      {
          System.out.println("Area is Valid : "+depth);
          //JOptionPane.showMessageDialog(null, "Depth is Valid : "+depth);
          count=1;
          k="\n\n\nArea of Reinforcement    :   "+depth;
          k=k+"\n\n \t\t\t Area of Reinforcement is Valid";
         l.writeFile("Validation3.BIM",k);
      }
      else
      {
          System.out.println("Area of Reinforcement is InValid : "+depth+"must be>"+min+" and <"+max);
          //JOptionPane.showMessageDialog(null,"Depth is InValid : "+depth+"must be>10000 and <12000");
          count=1;
          k="\n\n\nArea of Reinforcement  :   "+depth;
          k=k+"\n\n \t\t\t Area of Reinforcement is InValid";
         l.writeFile("Validation3.BIM",k);
         
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
        if(count2==0)
        {
            JOptionPane.showMessageDialog(null,"Id not matched");

        }
        else
        {
            int resultarea=diameter1+diameter2+diameter3+diameter4+diameter6;
            System.out.println(resultarea);
            int area=4*resultarea;
            System.out.println("Area    :   "+area);
            JOptionPane.showMessageDialog(null,"Report of Validation of Reinforcing is Being Created as Validation1.BIM File and Spacing b/w rebars is in Validation2.BIM");
            
        }
        
        }
        //System.out.println(nodeList3.item(0).getAttributes().getNamedItem("id").getNodeValue());
}
        
    
        
         
         
    


