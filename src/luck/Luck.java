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

public class Luck {
    
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
    public static void main(String[] Rahul) throws Exception {
        long heapSize = Runtime.getRuntime().totalMemory();
		
		//Print the jvm heap size.
		System.out.println("Heap Size = " + heapSize);
        Luck l=new Luck();
        String k;
        NodeList fstNm;
        //l.readFile("rectangular tank.ifcxml");
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        
        Document document = db.parse(new File("rectangular tank.ifcxml"));
        

        NodeList nodeList = document.getElementsByTagName("IfcExtrudedAreaSolid");
         
        int count=0;
        for(int i=0;i<nodeList.getLength();i++)
        {
            
            System.out.println(i);
            //System.out.println(nodeList.item(i).getNodeValue());     
            Node fstNode = nodeList.item((int)i);
            Element fstElmnt = (Element) fstNode;
      NodeList fstNmElmntLst = fstElmnt.getElementsByTagName("Depth");
        
           // nodeList.item((int)i).getAttributes().getNamedItem("id").isSupported(null, null);
            Element el = (org.w3c.dom.Element) nodeList.item((int)i);
       if(el.hasAttribute("id"))
        {
            
        
            //String nodeValue = nodeList.item((int)i).getAttributes().getNamedItem("id").getNodeValue();
            String d=el.getAttribute("id").toString();
            
            System.out.println(d);
            k="\n\n\n\t\t\t\t\t\t\t\t\t\t\t\t-------------------------------Model Validator------------------------------";
            l.writeFile("Validation.BIM",k);
            if(d.equals("i37932"))
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
             
      if(depth>=8000&&depth<=12000)
      {
          System.out.println("Depth is Valid : "+depth);
          //JOptionPane.showMessageDialog(null, "Depth is Valid : "+depth);
          count=1;
          k="\n\n\nColumn's Depth   :   "+depth;
          k=k+"\n\n \t\t\t Column's Depth is Valid";
         l.writeFile("Validation.BIM",k);
      }
      else
      {
          System.out.println("Depth is InValid : "+depth+"must be>8000 and <12000");
          //JOptionPane.showMessageDialog(null,"Depth is InValid : "+depth+"must be>10000 and <12000");
          count=1;
          k="\n\n\nColumn's Depth   :   "+depth;
          k=k+"\n\n \t\t\t Column's Depth is InValid";
         l.writeFile("Validation.BIM",k);
         
      }
      //System.out.println(depth);
      /*NodeList lstNmElmntLst = fstElmnt.getElementsByTagName("lastname");
      Element lstNmElmnt = (Element) lstNmElmntLst.item(0);
      NodeList lstNm = lstNmElmnt.getChildNodes();
      System.out.println("Last Name : " + ((Node) lstNm.item(0)).getNodeValue());*/
        }
            }
            
            else if(d.equals("i1778"))
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
      if(depth>=200 && depth<=600)
      {
          System.out.println("Depth is Valid : "+depth);
          //JOptionPane.showMessageDialog(null, "Depth is Valid : "+depth);
          count=1;
         k="\n\n\nSlab's Depth   :   "+depth;
          k=k+"\n\n \t\t\t Slab's Depth is Valid";
         l.writeFile("Validation.BIM",k);
      }
      else
      {
          System.out.println("Depth is InValid : "+depth+"must be>200 and <600");
          //JOptionPane.showMessageDialog(null,"Depth is InValid : "+depth+"must be>200 and <600");
          count=1;
          k="\n\n\nSlab's Depth   :   "+depth;
          k=k+"\n\n \t\t\t Slab's Depth is InValid";
         l.writeFile("Validation.BIM",k);
         
      }            // JOptionPane.showMessageDialog(null,"Id not matched");

            }
            }
            else if(d.equals("i37848"))
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
      if(depth>=8000&&depth<=12000)
      {
          System.out.println("Depth is Valid : "+depth);
          //JOptionPane.showMessageDialog(null, "Depth is Valid : "+depth);
          count=1;
          k="\n\n\nColumn's Depth   :   "+depth;
          k=k+"\n\n \t\t\t Column's Depth is Valid";
         l.writeFile("Validation.BIM",k);
         
      }
      else
      {
          System.out.println("Depth is InValid : "+depth+"must be>8000 and <12000");
          //JOptionPane.showMessageDialog(null,"Depth is InValid : "+depth+"must be>8000 and <12000");
          count=1;
          k="\n\n\nColumn's Depth   :   "+depth;
          k=k+"\n\n \t\t\t Column's Depth is InValid";
         l.writeFile("Validation.BIM",k);
         
      }            // JOptionPane.showMessageDialog(null,"Id not matched");

            }
            }
            else if(d.equals("i37985"))
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
      if(depth>=8000&&depth<=12000)
      {
          System.out.println("Depth is Valid : "+depth);
          //JOptionPane.showMessageDialog(null, "Depth is Valid : "+depth);
          count=1;
         k="\n\n\nColumn's Depth   :   "+depth;
          k=k+"\n\n \t\t\t Column's Depth is Valid";
         l.writeFile("Validation.BIM",k);
      }
      else
      {
          System.out.println("Depth is InValid : "+depth+"must be>8000 and <12000");
          //JOptionPane.showMessageDialog(null,"Depth is InValid : "+depth+"must be>8000 and <12000");
          count=1;
         k="\n\n\nColumn's Depth   :   "+depth;
          k=k+"\n\n \t\t\t Column's Depth is InValid";
         l.writeFile("Validation.BIM",k);
      }            // JOptionPane.showMessageDialog(null,"Id not matched");

            }
            }
            else if(d.equals("i38038"))
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
      if(depth>=8000&&depth<=12000)
      {
          System.out.println("Depth is Valid : "+depth);
          //JOptionPane.showMessageDialog(null, "Depth is Valid : "+depth);
          count=1;
          k="\n\n\nBeam's Depth   :   "+depth;
          k=k+"\n\n \t\t\t Beam's Depth is Valid";
         l.writeFile("Validation.BIM",k);
         
      }
      else
      {
          System.out.println("Depth is InValid : "+depth+"must be>8000 and <12000");
          //JOptionPane.showMessageDialog(null,"Depth is InValid : "+depth+"must be>8000 and <12000");
          count=1;
          k="\n\n\nBeam's Depth   :   "+depth;
          k=k+"\n\n \t\t\t Beam's Depth is InValid";
         l.writeFile("Validation.BIM",k);
         
      }            // JOptionPane.showMessageDialog(null,"Id not matched");

            }
            }
            else if(d.equals("i38091"))
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
      if(depth>=8000&&depth<=12000)
      {
          System.out.println("Depth is Valid : "+depth);
          //JOptionPane.showMessageDialog(null, "Depth is Valid : "+depth);
          count=1;
          k="\n\n\nBeam's Depth   :   "+depth;
          k=k+"\n\n \t\t\t Beam's Depth is Valid";
         l.writeFile("Validation.BIM",k);
         
      }
      else
      {
          System.out.println("Depth is InValid : "+depth+"must be>8000 and <12000");
          //JOptionPane.showMessageDialog(null,"Depth is InValid : "+depth+"must be>8000 and <12000");
          count=1;
          k="\n\n\nBeam's Depth   :   "+depth;
          k=k+"\n\n \t\t\t Beam's Depth is InValid";
         l.writeFile("Validation.BIM",k);
         
      }            // JOptionPane.showMessageDialog(null,"Id not matched");

            }
            }
             else if(d.equals("i74104"))
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
      if(depth>=8000&&depth<=12000)
      {
          System.out.println("Depth is Valid : "+depth);
          //JOptionPane.showMessageDialog(null, "Depth is Valid : "+depth);
          count=1;
         k="\n\n\nWall's Depth   :   "+depth;
          k=k+"\n\n \t\t\t Wall's Depth is Valid";
         l.writeFile("Validation.BIM",k);
      }
      else
      {
          System.out.println("Depth is InValid : "+depth+"must be>8000 and <12000");
          //JOptionPane.showMessageDialog(null,"Depth is InValid : "+depth+"must be>8000 and <12000");
          count=1;
          k="\n\n\nWall's Depth   :   "+depth;
          k=k+"\n\n \t\t\t Wall's Depth is InValid";
         l.writeFile("Validation.BIM",k);
         
      }            // JOptionPane.showMessageDialog(null,"Id not matched");

            }
            }
            else if(d.equals("i182041"))
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
      if(depth>=8000&&depth<=12000)
      {
          System.out.println("Depth is Valid : "+depth);
          //JOptionPane.showMessageDialog(null, "Depth is Valid : "+depth);
          count=1;
          k="\n\n\nWall's Depth   :   "+depth;
          k=k+"\n\n \t\t\t Wall's Depth is Valid";
         l.writeFile("Validation.BIM",k);
         
      }
      else
      {
          System.out.println("Depth is InValid : "+depth+"must be>8000 and <12000");
          //JOptionPane.showMessageDialog(null,"Depth is InValid : "+depth+"must be>8000 and <12000");
          count=1;
          k="\n\n\nWall's Depth   :   "+depth;
          k=k+"\n\n \t\t\t Wall's Depth is InValid";
         l.writeFile("Validation.BIM",k);
         
      }            // JOptionPane.showMessageDialog(null,"Id not matched");

            }
            }
            
    
         }
        }
        int diameter=0,diameter1=0,diameter2=0,diameter3=0,diameter4=0,diameter6=0,spacing=0;
		
         nodeList = document.getElementsByTagName("IfcReinforcingBar");
         
        //int count=0;
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
         l.writeFile("Validation.BIM",k);
      }
      else
      {
          System.out.println("Diameter of ReinforcingBar is InValid : "+diameter+"must be>16 and <30");
          //JOptionPane.showMessageDialog(null,"Depth is InValid : "+diameter+"must be>10000 and <12000");
          count=1;
          k="\n\n\nReinforcing Bar's Diameter   :   "+diameter;
          k=k+"\n\n \t\t\t Reinforcing Bar's Diameter is InValid";
         l.writeFile("Validation.BIM",k);
         
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
            l.writeFile("Validation.BIM",k);
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
         l.writeFile("Validation.BIM",k);
      }
      else
      {
          System.out.println("Cross Section of ReinforcingBar is InValid : "+diameter1+"must be>16 and <30");
          //JOptionPane.showMessageDialog(null,"Depth is InValid : "+diameter+"must be>10000 and <12000");
          count1=1;
          k="\n\n\nReinforcing Bar's Cross Section   :   "+diameter1;
          k=k+"\n\n \t\t\t Reinforcing Bar's Cross Section is InValid";
         l.writeFile("Validation.BIM",k);
         
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
            l.writeFile("Validation.BIM",k);
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
         l.writeFile("Validation.BIM",k);
      }
      else
      {
          System.out.println("Cross Section of ReinforcingBar is InValid : "+diameter2+"must be>16 and <30");
          //JOptionPane.showMessageDialog(null,"Depth is InValid : "+diameter+"must be>10000 and <12000");
          count1=1;
          k="\n\n\nReinforcing Bar's Cross Section   :   "+diameter2;
          k=k+"\n\n \t\t\t Reinforcing Bar's Cross Section is InValid";
         l.writeFile("Validation.BIM",k);
         
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
            l.writeFile("Validation.BIM",k);
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
         l.writeFile("Validation.BIM",k);
      }
      else
      {
          System.out.println("Cross Section of ReinforcingBar is InValid : "+diameter3+"must be>16 and <30");
          //JOptionPane.showMessageDialog(null,"Depth is InValid : "+diameter+"must be>10000 and <12000");
          count1=1;
          k="\n\n\nReinforcing Bar's Cross Section   :   "+diameter3;
          k=k+"\n\n \t\t\t Reinforcing Bar's Cross Section is InValid";
         l.writeFile("Validation.BIM",k);
         
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
            l.writeFile("Validation.BIM",k);
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
         l.writeFile("Validation.BIM",k);
      }
      else
      {
          System.out.println("Cross Section of ReinforcingBar is InValid : "+diameter4+"must be>16 and <30");
          //JOptionPane.showMessageDialog(null,"Depth is InValid : "+diameter+"must be>10000 and <12000");
          count1=1;
          k="\n\n\nReinforcing Bar's Cross Section   :   "+diameter4;
          k=k+"\n\n \t\t\t Reinforcing Bar's Cross Section is InValid";
         l.writeFile("Validation.BIM",k);
         
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
         l.writeFile("Validation.BIM",k);
      }
      else
      {
          System.out.println("Cross Section of ReinforcingBar is InValid : "+diameter6+"must be>16 and <30");
          //JOptionPane.showMessageDialog(null,"Depth is InValid : "+diameter+"must be>10000 and <12000");
          count1=1;
          k="\n\n\nReinforcing Bar's Cross Section   :   "+diameter6;
          k=k+"\n\n \t\t\t Reinforcing Bar's Cross Section is InValid";
         l.writeFile("Validation.BIM",k);
         
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
         nodeList = document.getElementsByTagName("IfcPropertySingleValue");
         
        //int count=0;
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
            l.writeFile("Validation.BIM",k);
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
         l.writeFile("Validation.BIM",k);
      }
      else
      {
          System.out.println("No_of_Bars in the Column : "+no_of_bars+"must be>=4");
          //JOptionPane.showMessageDialog(null,"Depth is InValid : "+no_of_bars+"must be>10000 and <12000");
          count=1;
          k="\n\n\n No_of_Bars in the Column : "+no_of_bars;
          k=k+"\n\n \t\t\t No_of_Bars in the Column :"+no_of_bars+" is InValid. Should be Greater than equal to 4";
         l.writeFile("Validation.BIM",k);
         
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
         nodeList = document.getElementsByTagName("IfcColumn");
         int Lowest=1;
        //int count=0;
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
            l.writeFile("Validation.BIM",k);
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
       nodeList = document.getElementsByTagName("IfcExtrudedAreaSolid");
         
        
        for(int i=0;i<nodeList.getLength();i++)
        {
            
            System.out.println(i);
            //System.out.println(nodeList.item(i).getNodeValue());     
            Node fstNode = nodeList.item((int)i);
            Element fstElmnt = (Element) fstNode;
      NodeList fstNmElmntLst = fstElmnt.getElementsByTagName("Depth");
        
           // nodeList.item((int)i).getAttributes().getNamedItem("id").isSupported(null, null);
            Element el = (org.w3c.dom.Element) nodeList.item((int)i);
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
         l.writeFile("Validation.BIM",k);
      }
      else
      {
          System.out.println("Column with Selenderness Ratio : "+ratio);
          //JOptionPane.showMessageDialog(null,"Depth is InValid : "+depth+"must be>10000 and <12000");
          count1=1;
          k="\n\n\n Column with Selenderness Ratio :   "+ratio;
          k=k+"\n\n \t\t\t Column is a Long Column";
         l.writeFile("Validation.BIM",k);
         
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
        
        if(count==0)
        {
            JOptionPane.showMessageDialog(null,"Id not matched");

        }
        else
        {
            JOptionPane.showMessageDialog(null,"Report of Valtion is Being Created as Validation.BIM File");
            
        }
        
        }
        //System.out.println(nodeList2.item(0).getAttributes().getNamedItem("id").getNodeValue());
}
        
        
         
         
         
         
         
        
    

    
    

