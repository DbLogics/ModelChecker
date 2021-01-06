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

public class Luck6 {
    
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
        
        Luck6 l=new Luck6();
        String k;
        NodeList fstNm;
        
        
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        
        Document document = db.parse(new File("MainTank.ifcxml"));
        k="\n\n\n Model Validator";
            l.writeFile("Result1.BIM",k);
k="\n\n\n\t\t-----------------------------Depth Validation------------------------------";
           l.writeFile("Result1.BIM",k);
        
           
           
           NodeList nodeList = document.getElementsByTagName("IfcExtrudedAreaSolid");
           int count=0;
        for(int i=0;i<nodeList.getLength();i++)
        {
            
            System.out.println(i);
            Node fstNode = nodeList.item((int)i);
            Element fstElmnt = (Element) fstNode;
            NodeList fstNmElmntLst = fstElmnt.getElementsByTagName("Depth");
        
         
            Element el = (org.w3c.dom.Element) nodeList.item((int)i);
            
            
            
       if(el.hasAttribute("id"))
        {
           String d=el.getAttribute("id");
            
           System.out.println(d);
            
            
            if(d.equals("i2371"))
            {
                System.out.println(i);
    if (fstNode.getNodeType() == Node.ELEMENT_NODE) {
        
  
          
      Element fstNmElmnt = (Element) fstNmElmntLst.item(0);
      System.out.println(fstNmElmnt);
      
      fstNm = fstNmElmnt.getChildNodes();
      System.out.println(fstNm.item(0).getNodeValue());
      
      System.out.println(d);
      
      String str=fstNm.item(0).getNodeValue();
      System.out.println(str);
      int ln=str.length();
            String str1= str.substring(0,ln-1);
             int depth=Integer.parseInt(str1);
             int min=500;
             
     
      
  //The unsupported length between two end restraints shall not exceed 60 times the least lateral dimension of column.
             int limit=min*60;
      if(depth<=limit)
      {
          System.out.println("Depth is Valid : "+depth);
         
          count=1;
          k="\n\n\nColumn's Depth   :   "+depth;
          k=k+"\n\n \t\t\t Column's Depth is Valid";
         l.writeFile("Result1.BIM",k);
      }
      else
      {
          System.out.println("Depth is InValid : "+depth+" must be <60 times the Least Lateral Dimension");
          
          count=1;
          k="\n\n\nColumn's Depth   :   "+depth;
          k=k+"\n\n \t\t\t Column's Depth is InValid";
         l.writeFile("Result1.BIM",k);
         
      }
      
        }
            }
            
            else if(d.equals("i1758"))
            {
             System.out.println(i);
    if (fstNode.getNodeType() == Node.ELEMENT_NODE) {
        
  
          
      Element fstNmElmnt = (Element) fstNmElmntLst.item(0);
      System.out.println(fstNmElmnt);
       fstNm = fstNmElmnt.getChildNodes();
      System.out.println(fstNm.item(0).getNodeValue());
      
      System.out.println(d);
      
      String str=fstNm.item(0).getNodeValue();
      System.out.println(str);
      int ln=str.length();
            String str1= str.substring(0,ln-1);
             int depth=Integer.parseInt(str1);
     
      
      if(depth>=200 && depth<=600)
      {
          System.out.println("Depth is Valid : "+depth);
         
          count=1;
         k="\n\n\nSlab's Depth   :   "+depth;
          k=k+"\n\n \t\t\t Slab's Depth is Valid";
         l.writeFile("Result1.BIM",k);
      }
      else
      {
          System.out.println("Depth is InValid : "+depth+"must be>200 and <600");
          
          count=1;
          k="\n\n\nSlab's Depth   :   "+depth;
          k=k+"\n\n \t\t\t Slab's Depth is InValid";
         l.writeFile("Result1.BIM",k);
         
      }            

            }
            }
            else if(d.equals("i199530"))
            {
             System.out.println(i);
    if (fstNode.getNodeType() == Node.ELEMENT_NODE) {
        
  
          
      Element fstNmElmnt = (Element) fstNmElmntLst.item(0);
      System.out.println(fstNmElmnt);
       fstNm = fstNmElmnt.getChildNodes();
      System.out.println(fstNm.item(0).getNodeValue());
      
      System.out.println(d);
      
      String str=fstNm.item(0).getNodeValue();
      System.out.println(str);
      int ln=str.length();
            String str1= str.substring(0,ln-1);
             int depth=Integer.parseInt(str1);
     
      
      if(depth>=200 && depth<=600)
      {
          System.out.println("Depth is Valid : "+depth);
         
          count=1;
         k="\n\n\nSlab's Depth   :   "+depth;
          k=k+"\n\n \t\t\t Slab's Depth is Valid";
         l.writeFile("Result1.BIM",k);
      }
      else
      {
          System.out.println("Depth is InValid : "+depth+"must be>200 and <600");
          
          count=1;
          k="\n\n\nSlab's Depth   :   "+depth;
          k=k+"\n\n \t\t\t Slab's Depth is InValid";
         l.writeFile("Result1.BIM",k);
         
      }           

            }
            }
            else if(d.equals("i2502"))
            {
             System.out.println(i);
    if (fstNode.getNodeType() == Node.ELEMENT_NODE) {
        
  
          
      Element fstNmElmnt = (Element) fstNmElmntLst.item(0);
      System.out.println(fstNmElmnt);
       fstNm = fstNmElmnt.getChildNodes();
      System.out.println(fstNm.item(0).getNodeValue());
      
      System.out.println(d);
      
      String str=fstNm.item(0).getNodeValue();
      System.out.println(str);
      int ln=str.length();
            String str1= str.substring(0,ln-1);
             int depth=Integer.parseInt(str1);
     
      
      if(depth>=8000&&depth<=12000)
      {
          System.out.println("Depth is Valid : "+depth);
         
          count=1;
          k="\n\n\nColumn's Depth   :   "+depth;
          k=k+"\n\n \t\t\t Column's Depth is Valid";
         l.writeFile("Result1.BIM",k);
         
      }
      else
      {
          System.out.println("Depth is InValid : "+depth+"must be>8000 and <12000");
          
          count=1;
          k="\n\n\nColumn's Depth   :   "+depth;
          k=k+"\n\n \t\t\t Column's Depth is InValid";
         l.writeFile("Result1.BIM",k);
         
      }            

            }
            }
            else if(d.equals("i2619"))
            {
             System.out.println(i);
    if (fstNode.getNodeType() == Node.ELEMENT_NODE) {
        
  
          
      Element fstNmElmnt = (Element) fstNmElmntLst.item(0);
      System.out.println(fstNmElmnt);
       fstNm = fstNmElmnt.getChildNodes();
      System.out.println(fstNm.item(0).getNodeValue());
      
      System.out.println(d);
      
      String str=fstNm.item(0).getNodeValue();
      System.out.println(str);
      int ln=str.length();
      String str1= str.substring(0,ln-1);
      int depth=Integer.parseInt(str1);
     
      
      if(depth>=8000&&depth<=12000)
      {
          System.out.println("Depth is Valid : "+depth);
         
          count=1;
         k="\n\n\nColumn's Depth   :   "+depth;
          k=k+"\n\n \t\t\t Column's Depth is Valid";
         l.writeFile("Result1.BIM",k);
      }
      else
      {
          System.out.println("Depth is InValid : "+depth+"must be>8000 and <12000");
          
          count=1;
         k="\n\n\nColumn's Depth   :   "+depth;
          k=k+"\n\n \t\t\t Column's Depth is InValid";
         l.writeFile("Result1.BIM",k);
      }            

            }
            }
            else if(d.equals("i2736"))
            {
             System.out.println(i);
    if (fstNode.getNodeType() == Node.ELEMENT_NODE) {
        
  
          
      Element fstNmElmnt = (Element) fstNmElmntLst.item(0);
      System.out.println(fstNmElmnt);
       fstNm = fstNmElmnt.getChildNodes();
      System.out.println(fstNm.item(0).getNodeValue());
      
      System.out.println(d);
      
      String str=fstNm.item(0).getNodeValue();
      System.out.println(str);
      int ln=str.length();
            String str1= str.substring(0,ln-1);
             int depth=Integer.parseInt(str1);
     
      
      if(depth>=8000&&depth<=12000)
      {
          System.out.println("Depth is Valid : "+depth);
         
          count=1;
         k="\n\n\nColumn's Depth   :   "+depth;
          k=k+"\n\n \t\t\t Column's Depth is Valid";
         l.writeFile("Result1.BIM",k);
      }
      else
      {
          System.out.println("Depth is InValid : "+depth+"must be>8000 and <12000");
          
          count=1;
         k="\n\n\nColumn's Depth   :   "+depth;
          k=k+"\n\n \t\t\t Column's Depth is InValid";
         l.writeFile("Result1.BIM",k);
      }            

            }
            }
            else if(d.equals("i2853"))
            {
             System.out.println(i);
    if (fstNode.getNodeType() == Node.ELEMENT_NODE) {
        
  
          
      Element fstNmElmnt = (Element) fstNmElmntLst.item(0);
      System.out.println(fstNmElmnt);
       fstNm = fstNmElmnt.getChildNodes();
      System.out.println(fstNm.item(0).getNodeValue());
      
      System.out.println(d);
      
      String str=fstNm.item(0).getNodeValue();
      System.out.println(str);
      int ln=str.length();
            String str1= str.substring(0,ln-1);
             int depth=Integer.parseInt(str1);
     
      
      if(depth>=8000&&depth<=12000)
      {
          System.out.println("Depth is Valid : "+depth);
         
          count=1;
         k="\n\n\nColumn's Depth   :   "+depth;
          k=k+"\n\n \t\t\t Column's Depth is Valid";
         l.writeFile("Result1.BIM",k);
      }
      else
      {
          System.out.println("Depth is InValid : "+depth+"must be>8000 and <12000");
          
          count=1;
         k="\n\n\nColumn's Depth   :   "+depth;
          k=k+"\n\n \t\t\t Column's Depth is InValid";
         l.writeFile("Result1.BIM",k);
      }            

            }
            }
            else if(d.equals("i1889"))
            {
             System.out.println(i);
    if (fstNode.getNodeType() == Node.ELEMENT_NODE) {
        
  
          
      Element fstNmElmnt = (Element) fstNmElmntLst.item(0);
      System.out.println(fstNmElmnt);
       fstNm = fstNmElmnt.getChildNodes();
      System.out.println(fstNm.item(0).getNodeValue());
      
      System.out.println(d);
      
      String str=fstNm.item(0).getNodeValue();
      System.out.println(str);
      int ln=str.length();
            String str1= str.substring(0,ln-1);
             int depth=Integer.parseInt(str1);
     
      
      if(depth>=8000&&depth<=12000)
      {
          System.out.println("Depth is Valid : "+depth);
         
          count=1;
          k="\n\n\nBeam's Depth   :   "+depth;
          k=k+"\n\n \t\t\t Beam's Depth is Valid";
         l.writeFile("Result1.BIM",k);
         
      }
      else
      {
          System.out.println("Depth is InValid : "+depth+"must be>8000 and <12000");
          
          count=1;
          k="\n\n\nBeam's Depth   :   "+depth;
          k=k+"\n\n \t\t\t Beam's Depth is InValid";
         l.writeFile("Result1.BIM",k);
         
      }            

            }
            }
            else if(d.equals("i2020"))
            {
             System.out.println(i);
    if (fstNode.getNodeType() == Node.ELEMENT_NODE) {
        
  
          
      Element fstNmElmnt = (Element) fstNmElmntLst.item(0);
      System.out.println(fstNmElmnt);
       fstNm = fstNmElmnt.getChildNodes();
      System.out.println(fstNm.item(0).getNodeValue());
      
      System.out.println(d);
      
      String str=fstNm.item(0).getNodeValue();
      System.out.println(str);
      int ln=str.length();
            String str1= str.substring(0,ln-1);
             int depth=Integer.parseInt(str1);
     
      
      if(depth>=8000&&depth<=12000)
      {
          System.out.println("Depth is Valid : "+depth);
         
          count=1;
          k="\n\n\nBeam's Depth   :   "+depth;
          k=k+"\n\n \t\t\t Beam's Depth is Valid";
         l.writeFile("Result1.BIM",k);
         
      }
      else
      {
          System.out.println("Depth is InValid : "+depth+"must be>8000 and <12000");
          
          count=1;
          k="\n\n\nBeam's Depth   :   "+depth;
          k=k+"\n\n \t\t\t Beam's Depth is InValid";
         l.writeFile("Result1.BIM",k);
         
      }            

            }
            }
                        else if(d.equals("i2137"))
            {
             System.out.println(i);
    if (fstNode.getNodeType() == Node.ELEMENT_NODE) {
        
  
          
      Element fstNmElmnt = (Element) fstNmElmntLst.item(0);
      System.out.println(fstNmElmnt);
       fstNm = fstNmElmnt.getChildNodes();
      System.out.println(fstNm.item(0).getNodeValue());
      
      System.out.println(d);
      
      String str=fstNm.item(0).getNodeValue();
      System.out.println(str);
      int ln=str.length();
            String str1= str.substring(0,ln-1);
             int depth=Integer.parseInt(str1);
     
      
      if(depth>=8000&&depth<=12000)
      {
          System.out.println("Depth is Valid : "+depth);
         
          count=1;
          k="\n\n\nBeam's Depth   :   "+depth;
          k=k+"\n\n \t\t\t Beam's Depth is Valid";
         l.writeFile("Result1.BIM",k);
         
      }
      else
      {
          System.out.println("Depth is InValid : "+depth+"must be>8000 and <12000");
          
          count=1;
          k="\n\n\nBeam's Depth   :   "+depth;
          k=k+"\n\n \t\t\t Beam's Depth is InValid";
         l.writeFile("Result1.BIM",k);
         
      }            

            }
            }
                                    else if(d.equals("i2254"))
            {
             System.out.println(i);
    if (fstNode.getNodeType() == Node.ELEMENT_NODE) {
        
  
          
      Element fstNmElmnt = (Element) fstNmElmntLst.item(0);
      System.out.println(fstNmElmnt);
       fstNm = fstNmElmnt.getChildNodes();
      System.out.println(fstNm.item(0).getNodeValue());
      
      System.out.println(d);
      
      String str=fstNm.item(0).getNodeValue();
      System.out.println(str);
      int ln=str.length();
            String str1= str.substring(0,ln-1);
             int depth=Integer.parseInt(str1);
     
      
      if(depth>=8000&&depth<=12000)
      {
          System.out.println("Depth is Valid : "+depth);
         
          count=1;
          k="\n\n\nBeam's Depth   :   "+depth;
          k=k+"\n\n \t\t\t Beam's Depth is Valid";
         l.writeFile("Result1.BIM",k);
         
      }
      else
      {
          System.out.println("Depth is InValid : "+depth+"must be>8000 and <12000");
          
          count=1;
          k="\n\n\nBeam's Depth   :   "+depth;
          k=k+"\n\n \t\t\t Beam's Depth is InValid";
         l.writeFile("Result1.BIM",k);
         
      }            

            }
            }
                                                else if(d.equals("i373226"))
            {
             System.out.println(i);
    if (fstNode.getNodeType() == Node.ELEMENT_NODE) {
        
  
          
      Element fstNmElmnt = (Element) fstNmElmntLst.item(0);
      System.out.println(fstNmElmnt);
       fstNm = fstNmElmnt.getChildNodes();
      System.out.println(fstNm.item(0).getNodeValue());
      
      System.out.println(d);
      
      String str=fstNm.item(0).getNodeValue();
      System.out.println(str);
      int ln=str.length();
            String str1= str.substring(0,ln-1);
             int depth=Integer.parseInt(str1);
     
      
      if(depth>=8000&&depth<=12000)
      {
          System.out.println("Depth is Valid : "+depth);
         
          count=1;
          k="\n\n\nBeam's Depth   :   "+depth;
          k=k+"\n\n \t\t\t Beam's Depth is Valid";
         l.writeFile("Result1.BIM",k);
         
      }
      else
      {
          System.out.println("Depth is InValid : "+depth+"must be>8000 and <12000");
          
          count=1;
          k="\n\n\nBeam's Depth   :   "+depth;
          k=k+"\n\n \t\t\t Beam's Depth is InValid";
         l.writeFile("Result1.BIM",k);
         
      }            

            }
            }
                                                            else if(d.equals("i373351"))
            {
             System.out.println(i);
    if (fstNode.getNodeType() == Node.ELEMENT_NODE) {
        
  
          
      Element fstNmElmnt = (Element) fstNmElmntLst.item(0);
      System.out.println(fstNmElmnt);
       fstNm = fstNmElmnt.getChildNodes();
      System.out.println(fstNm.item(0).getNodeValue());
      
      System.out.println(d);
      
      String str=fstNm.item(0).getNodeValue();
      System.out.println(str);
      int ln=str.length();
            String str1= str.substring(0,ln-1);
             int depth=Integer.parseInt(str1);
     
      
      if(depth>=8000&&depth<=12000)
      {
          System.out.println("Depth is Valid : "+depth);
         
          count=1;
          k="\n\n\nBeam's Depth   :   "+depth;
          k=k+"\n\n \t\t\t Beam's Depth is Valid";
         l.writeFile("Result1.BIM",k);
         
      }
      else
      {
          System.out.println("Depth is InValid : "+depth+"must be>8000 and <12000");
          
          count=1;
          k="\n\n\nBeam's Depth   :   "+depth;
          k=k+"\n\n \t\t\t Beam's Depth is InValid";
         l.writeFile("Result1.BIM",k);
         
      }            

            }
            }
                                                                        else if(d.equals("i373468"))
            {
             System.out.println(i);
    if (fstNode.getNodeType() == Node.ELEMENT_NODE) {
        
  
          
      Element fstNmElmnt = (Element) fstNmElmntLst.item(0);
      System.out.println(fstNmElmnt);
       fstNm = fstNmElmnt.getChildNodes();
      System.out.println(fstNm.item(0).getNodeValue());
      
      System.out.println(d);
      
      String str=fstNm.item(0).getNodeValue();
      System.out.println(str);
      int ln=str.length();
            String str1= str.substring(0,ln-1);
             int depth=Integer.parseInt(str1);
     
      
      if(depth>=8000&&depth<=12000)
      {
          System.out.println("Depth is Valid : "+depth);
         
          count=1;
          k="\n\n\nBeam's Depth   :   "+depth;
          k=k+"\n\n \t\t\t Beam's Depth is Valid";
         l.writeFile("Result1.BIM",k);
         
      }
      else
      {
          System.out.println("Depth is InValid : "+depth+"must be>8000 and <12000");
          
          count=1;
          k="\n\n\nBeam's Depth   :   "+depth;
          k=k+"\n\n \t\t\t Beam's Depth is InValid";
         l.writeFile("Result1.BIM",k);
         
      }            

            }
            }
                                                                                    else if(d.equals("i373585"))
            {
             System.out.println(i);
    if (fstNode.getNodeType() == Node.ELEMENT_NODE) {
        
  
          
      Element fstNmElmnt = (Element) fstNmElmntLst.item(0);
      System.out.println(fstNmElmnt);
       fstNm = fstNmElmnt.getChildNodes();
      System.out.println(fstNm.item(0).getNodeValue());
      
      System.out.println(d);
      
      String str=fstNm.item(0).getNodeValue();
      System.out.println(str);
      int ln=str.length();
            String str1= str.substring(0,ln-1);
             int depth=Integer.parseInt(str1);
     
      
      if(depth>=8000&&depth<=12000)
      {
          System.out.println("Depth is Valid : "+depth);
         
          count=1;
          k="\n\n\nBeam's Depth   :   "+depth;
          k=k+"\n\n \t\t\t Beam's Depth is Valid";
         l.writeFile("Result1.BIM",k);
         
      }
      else
      {
          System.out.println("Depth is InValid : "+depth+"must be>8000 and <12000");
          
          count=1;
          k="\n\n\nBeam's Depth   :   "+depth;
          k=k+"\n\n \t\t\t Beam's Depth is InValid";
         l.writeFile("Result1.BIM",k);
         
      }            

            }
            }
             else if(d.equals("i372642"))
            {
             System.out.println(i);
    if (fstNode.getNodeType() == Node.ELEMENT_NODE) {
        
  
          
      Element fstNmElmnt = (Element) fstNmElmntLst.item(0);
      System.out.println(fstNmElmnt);
       fstNm = fstNmElmnt.getChildNodes();
      System.out.println(fstNm.item(0).getNodeValue());
      
      System.out.println(d);
      
      String str=fstNm.item(0).getNodeValue();
      System.out.println(str);
      int ln=str.length();
            String str1= str.substring(0,ln-1);
             int depth=Integer.parseInt(str1);
     
      
      if(depth>=8000&&depth<=12000)
      {
          System.out.println("Depth is Valid : "+depth);
         
          count=1;
         k="\n\n\nWall's Depth   :   "+depth;
          k=k+"\n\n \t\t\t Wall's Depth is Valid";
         l.writeFile("Result1.BIM",k);
      }
      else
      {
          System.out.println("Depth is InValid : "+depth+"must be>8000 and <12000");
          
          count=1;
          k="\n\n\nWall's Depth   :   "+depth;
          k=k+"\n\n \t\t\t Wall's Depth is InValid";
         l.writeFile("Result1.BIM",k);
         
      }            

            }
            }
            else if(d.equals("i372800"))
            {
             System.out.println(i);
    if (fstNode.getNodeType() == Node.ELEMENT_NODE) {
        
  
          
      Element fstNmElmnt = (Element) fstNmElmntLst.item(0);
      System.out.println(fstNmElmnt);
       fstNm = fstNmElmnt.getChildNodes();
      System.out.println(fstNm.item(0).getNodeValue());
      
      System.out.println(d);
      
      String str=fstNm.item(0).getNodeValue();
      System.out.println(str);
      int ln=str.length();
            String str1= str.substring(0,ln-1);
             int depth=Integer.parseInt(str1);
     
      
      if(depth>=8000&&depth<=12000)
      {
          System.out.println("Depth is Valid : "+depth);
         
          count=1;
          k="\n\n\nWall's Depth   :   "+depth;
          k=k+"\n\n \t\t\t Wall's Depth is Valid";
         l.writeFile("Result1.BIM",k);
         
      }
      else
      {
          System.out.println("Depth is InValid : "+depth+"must be>8000 and <12000");
          
          count=1;
          k="\n\n\nWall's Depth   :   "+depth;
          k=k+"\n\n \t\t\t Wall's Depth is InValid";
         l.writeFile("Result1.BIM",k);
         
      }            

            }
            }
            else if(d.equals("i372944"))
            {
             System.out.println(i);
    if (fstNode.getNodeType() == Node.ELEMENT_NODE) {
        
  
          
      Element fstNmElmnt = (Element) fstNmElmntLst.item(0);
      System.out.println(fstNmElmnt);
       fstNm = fstNmElmnt.getChildNodes();
      System.out.println(fstNm.item(0).getNodeValue());
      
      System.out.println(d);
      
      String str=fstNm.item(0).getNodeValue();
      System.out.println(str);
      int ln=str.length();
            String str1= str.substring(0,ln-1);
             int depth=Integer.parseInt(str1);
     
      
      if(depth>=8000&&depth<=12000)
      {
          System.out.println("Depth is Valid : "+depth);
         
          count=1;
          k="\n\n\nWall's Depth   :   "+depth;
          k=k+"\n\n \t\t\t Wall's Depth is Valid";
         l.writeFile("Result1.BIM",k);
         
      }
      else
      {
          System.out.println("Depth is InValid : "+depth+"must be>8000 and <12000");
          
          count=1;
          k="\n\n\nWall's Depth   :   "+depth;
          k=k+"\n\n \t\t\t Wall's Depth is InValid";
         l.writeFile("Result1.BIM",k);
         
      }            

            }
            }
            else if(d.equals("i373088"))
            {
             System.out.println(i);
    if (fstNode.getNodeType() == Node.ELEMENT_NODE) {
        
  
          
      Element fstNmElmnt = (Element) fstNmElmntLst.item(0);
      System.out.println(fstNmElmnt);
       fstNm = fstNmElmnt.getChildNodes();
      System.out.println(fstNm.item(0).getNodeValue());
      
      System.out.println(d);
      
      String str=fstNm.item(0).getNodeValue();
      System.out.println(str);
      int ln=str.length();
            String str1= str.substring(0,ln-1);
             int depth=Integer.parseInt(str1);
     
      
      if(depth>=8000&&depth<=12000)
      {
          System.out.println("Depth is Valid : "+depth);
         
          count=1;
          k="\n\n\nWall's Depth   :   "+depth;
          k=k+"\n\n \t\t\t Wall's Depth is Valid";
         l.writeFile("Result1.BIM",k);
         
      }
      else
      {
          System.out.println("Depth is InValid : "+depth+"must be>8000 and <12000");
          
          count=1;
          k="\n\n\nWall's Depth   :   "+depth;
          k=k+"\n\n \t\t\t Wall's Depth is InValid";
         l.writeFile("Result1.BIM",k);
         
      }            

            }
            }
            
            
    
         }
        }
        int diameter=0,diameter1=0,diameter2=0,diameter3=0,diameter4=0,diameter6=0,spacing=0;
	k="\n\n\n\t\t-----------------------------Reinforcement Bar's Diameter Validation------------------------------";
            l.writeFile("Result1.BIM",k);	
         nodeList = document.getElementsByTagName("IfcReinforcingBar");
         
        
        for(int i=0;i<nodeList.getLength();i++)
        {
            
            System.out.println(i);
                
            Node fstNode = nodeList.item((int)i);
            Element fstElmnt = (Element) fstNode;
      NodeList fstNmElmntLst = fstElmnt.getElementsByTagName("NominalDiameter");
        
         
            Element el = (org.w3c.dom.Element) nodeList.item((int)i);
       if(el.hasAttribute("id"))
        {
            
        
           
            String d=el.getAttribute("id");
            
            System.out.println(d);
            
            
            if(d.equals("i53132"))
            {
                System.out.println(i);
    if (fstNode.getNodeType() == Node.ELEMENT_NODE) {
        
  
          
      Element fstNmElmnt = (Element) fstNmElmntLst.item(0);
      System.out.println(fstNmElmnt);
       fstNm = fstNmElmnt.getChildNodes();
      System.out.println(fstNm.item(0).getNodeValue());
      
      System.out.println(d);
      
      String str=fstNm.item(0).getNodeValue();
      System.out.println(str);
      int ln=str.length();
            String str1= str.substring(0,ln-1);
              diameter=Integer.parseInt(str1);
     
      
             
      if(diameter>=16&&diameter<=30)
      {
          System.out.println("Diameter of ReinforcingBar is Valid : "+diameter);
         
          count=1;
          k="\n\n\nReinforcing Bar's Diameter   :   "+diameter;
          k=k+"\n\n \t\t\t Reinforcing Bar's Diameter is Valid ";
         l.writeFile("Result1.BIM",k);
      }
      else
      {
          System.out.println("Diameter of ReinforcingBar is InValid : "+diameter+"must be>16 and <30");
          
          count=1;
          k="\n\n\nReinforcing Bar's Diameter   :   "+diameter;
          k=k+"\n\n \t\t\t Reinforcing Bar's Diameter is InValid";
         l.writeFile("Result1.BIM",k);
         
      }
     
     
        }
            }
            else if(d.equals("i157799"))
            {
                System.out.println(i);
    if (fstNode.getNodeType() == Node.ELEMENT_NODE) {
        
  
          
      Element fstNmElmnt = (Element) fstNmElmntLst.item(0);
      System.out.println(fstNmElmnt);
       fstNm = fstNmElmnt.getChildNodes();
      System.out.println(fstNm.item(0).getNodeValue());
      
      System.out.println(d);
      
      String str=fstNm.item(0).getNodeValue();
      System.out.println(str);
      int ln=str.length();
            String str1= str.substring(0,ln-1);
              diameter=Integer.parseInt(str1);
     
      
             
      if(diameter>=16&&diameter<=30)
      {
          System.out.println("Diameter of ReinforcingBar is Valid : "+diameter);
         
          count=1;
          k="\n\n\nReinforcing Bar's Diameter   :   "+diameter;
          k=k+"\n\n \t\t\t Reinforcing Bar's Diameter is Valid ";
         l.writeFile("Result1.BIM",k);
      }
      else
      {
          System.out.println("Diameter of ReinforcingBar is InValid : "+diameter+"must be>16 and <30");
          
          count=1;
          k="\n\n\nReinforcing Bar's Diameter   :   "+diameter;
          k=k+"\n\n \t\t\t Reinforcing Bar's Diameter is InValid";
         l.writeFile("Result1.BIM",k);
         
      }
     
      
        }
            }          
           else if(d.equals("i199406"))
            {
                System.out.println(i);
    if (fstNode.getNodeType() == Node.ELEMENT_NODE) {
        
  
          
      Element fstNmElmnt = (Element) fstNmElmntLst.item(0);
      System.out.println(fstNmElmnt);
       fstNm = fstNmElmnt.getChildNodes();
      System.out.println(fstNm.item(0).getNodeValue());
      
      System.out.println(d);
      
      String str=fstNm.item(0).getNodeValue();
      System.out.println(str);
      int ln=str.length();
            String str1= str.substring(0,ln-1);
              diameter=Integer.parseInt(str1);
      
     
             
      if(diameter>=16&&diameter<=30)
      {
          System.out.println("Diameter of ReinforcingBar is Valid : "+diameter);
          
          count=1;
          k="\n\n\nReinforcing Bar's Diameter   :   "+diameter;
          k=k+"\n\n \t\t\t Reinforcing Bar's Diameter is Valid";
         l.writeFile("Result1.BIM",k);
      }
      else
      {
          System.out.println("Diameter of ReinforcingBar is InValid : "+diameter+"must be>16 and <30");
          
          count=1;
          k="\n\n\nReinforcing Bar's Diameter   :   "+diameter;
          k=k+"\n\n \t\t\t Reinforcing Bar's Diameter is InValid";
         l.writeFile("Result1.BIM",k);
         
      }
      
        }
            }
           else if(d.equals("i242786"))
            {
                System.out.println(i);
    if (fstNode.getNodeType() == Node.ELEMENT_NODE) {
        
  
          
      Element fstNmElmnt = (Element) fstNmElmntLst.item(0);
      System.out.println(fstNmElmnt);
       fstNm = fstNmElmnt.getChildNodes();
      System.out.println(fstNm.item(0).getNodeValue());
      
      System.out.println(d);
      
      String str=fstNm.item(0).getNodeValue();
      System.out.println(str);
      int ln=str.length();
            String str1= str.substring(0,ln-1);
              diameter=Integer.parseInt(str1);
      
             
      if(diameter>=16&&diameter<=30)
      {
          System.out.println("Diameter of ReinforcingBar is Valid : "+diameter);
          
          count=1;
          k="\n\n\nReinforcing Bar's Diameter   :   "+diameter;
          k=k+"\n\n \t\t\t Reinforcing Bar's Diameter is Valid";
         l.writeFile("Result1.BIM",k);
      }
      else
      {
          System.out.println("Diameter of ReinforcingBar is InValid : "+diameter+"must be>16 and <30");
         
          count=1;
          k="\n\n\nReinforcing Bar's Diameter   :   "+diameter;
          k=k+"\n\n \t\t\t Reinforcing Bar's Diameter is InValid";
         l.writeFile("Result1.BIM",k);
         
      }
      
        }
            }
            else if(d.equals("i286030"))
            {
                System.out.println(i);
    if (fstNode.getNodeType() == Node.ELEMENT_NODE) {
        
  
          
      Element fstNmElmnt = (Element) fstNmElmntLst.item(0);
      System.out.println(fstNmElmnt);
       fstNm = fstNmElmnt.getChildNodes();
      System.out.println(fstNm.item(0).getNodeValue());
      
      System.out.println(d);
     
      String str=fstNm.item(0).getNodeValue();
      System.out.println(str);
      int ln=str.length();
            String str1= str.substring(0,ln-1);
              diameter=Integer.parseInt(str1);
      
             
      if(diameter>=16&&diameter<=30)
      {
          System.out.println("Diameter of ReinforcingBar is Valid : "+diameter);
         
          count=1;
          k="\n\n\nReinforcing Bar's Diameter   :   "+diameter;
          k=k+"\n\n \t\t\t Reinforcing Bar's Diameter is Valid";
         l.writeFile("Result1.BIM",k);
      }
      else
      {
          System.out.println("Diameter of ReinforcingBar is InValid : "+diameter+"must be>16 and <30");
         
          count=1;
          k="\n\n\nReinforcing Bar's Diameter   :   "+diameter;
          k=k+"\n\n \t\t\t Reinforcing Bar's Diameter is InValid";
         l.writeFile("Result1.BIM",k);
         
      }
      
        }
            }
            else if(d.equals("i329274"))
            {
                System.out.println(i);
    if (fstNode.getNodeType() == Node.ELEMENT_NODE) {
        
  
          
      Element fstNmElmnt = (Element) fstNmElmntLst.item(0);
      System.out.println(fstNmElmnt);
       fstNm = fstNmElmnt.getChildNodes();
      System.out.println(fstNm.item(0).getNodeValue());
      
      System.out.println(d);
      
      String str=fstNm.item(0).getNodeValue();
      System.out.println(str);
      int ln=str.length();
            String str1= str.substring(0,ln-1);
              diameter=Integer.parseInt(str1);
      
             
      if(diameter>=16&&diameter<=30)
      {
          System.out.println("Diameter of ReinforcingBar is Valid : "+diameter);
          
          count=1;
          k="\n\n\nReinforcing Bar's Diameter   :   "+diameter;
          k=k+"\n\n \t\t\t Reinforcing Bar's Diameter is Valid";
         l.writeFile("Result1.BIM",k);
      }
      else
      {
          System.out.println("Diameter of ReinforcingBar is InValid : "+diameter+"must be>16 and <30");
          
          count=1;
          k="\n\n\nReinforcing Bar's Diameter   :   "+diameter;
          k=k+"\n\n \t\t\t Reinforcing Bar's Diameter is InValid";
         l.writeFile("Result1.BIM",k);
         
      }
      
        }
            }
            else if(d.equals("i372518"))
            {
                System.out.println(i);
    if (fstNode.getNodeType() == Node.ELEMENT_NODE) {
        
  
          
      Element fstNmElmnt = (Element) fstNmElmntLst.item(0);
      System.out.println(fstNmElmnt);
       fstNm = fstNmElmnt.getChildNodes();
      System.out.println(fstNm.item(0).getNodeValue());
      
      System.out.println(d);
      
      String str=fstNm.item(0).getNodeValue();
      System.out.println(str);
      int ln=str.length();
            String str1= str.substring(0,ln-1);
              diameter=Integer.parseInt(str1);
      
             
      if(diameter>=16&&diameter<=30)
      {
          System.out.println("Diameter of ReinforcingBar is Valid : "+diameter);
          
          count=1;
          k="\n\n\nReinforcing Bar's Diameter   :   "+diameter;
          k=k+"\n\n \t\t\t Reinforcing Bar's Diameter is Valid";
         l.writeFile("Result1.BIM",k);
      }
      else
      {
          System.out.println("Diameter of ReinforcingBar is InValid : "+diameter+"must be>16 and <30");
          
          count=1;
          k="\n\n\nReinforcing Bar's Diameter   :   "+diameter;
          k=k+"\n\n \t\t\t Reinforcing Bar's Diameter is InValid";
         l.writeFile("Result1.BIM",k);
         
      }
      
        }
            }
            else if(d.equals("i415194"))
            {
                System.out.println(i);
    if (fstNode.getNodeType() == Node.ELEMENT_NODE) {
        
  
          
      Element fstNmElmnt = (Element) fstNmElmntLst.item(0);
      System.out.println(fstNmElmnt);
       fstNm = fstNmElmnt.getChildNodes();
      System.out.println(fstNm.item(0).getNodeValue());
      
      System.out.println(d);
      
      String str=fstNm.item(0).getNodeValue();
      System.out.println(str);
      int ln=str.length();
            String str1= str.substring(0,ln-1);
              diameter=Integer.parseInt(str1);
     
             
      if(diameter>=16&&diameter<=30)
      {
          System.out.println("Diameter of ReinforcingBar is Valid : "+diameter);
         
          count=1;
          k="\n\n\nReinforcing Bar's Diameter   :   "+diameter;
          k=k+"\n\n \t\t\t Reinforcing Bar's Diameter is Valid";
         l.writeFile("Result1.BIM",k);
      }
      else
      {
          System.out.println("Diameter of ReinforcingBar is InValid : "+diameter+"must be>16 and <30");
          
          count=1;
          k="\n\n\nReinforcing Bar's Diameter   :   "+diameter;
          k=k+"\n\n \t\t\t Reinforcing Bar's Diameter is InValid";
         l.writeFile("Result1.BIM",k);
         
      }
     
        }
            }
            else if(d.equals("i456801"))
            {
                System.out.println(i);
    if (fstNode.getNodeType() == Node.ELEMENT_NODE) {
        
  
          
      Element fstNmElmnt = (Element) fstNmElmntLst.item(0);
      System.out.println(fstNmElmnt);
       fstNm = fstNmElmnt.getChildNodes();
      System.out.println(fstNm.item(0).getNodeValue());
      
      System.out.println(d);
      
      String str=fstNm.item(0).getNodeValue();
      System.out.println(str);
      int ln=str.length();
            String str1= str.substring(0,ln-1);
              diameter=Integer.parseInt(str1);
     
             
      if(diameter>=16&&diameter<=30)
      {
          System.out.println("Diameter of ReinforcingBar is Valid : "+diameter);
         
          count=1;
          k="\n\n\nReinforcing Bar's Diameter   :   "+diameter;
          k=k+"\n\n \t\t\t Reinforcing Bar's Diameter is Valid";
         l.writeFile("Result1.BIM",k);
      }
      else
      {
          System.out.println("Diameter of ReinforcingBar is InValid : "+diameter+"must be>16 and <30");
          
          count=1;
          k="\n\n\nReinforcing Bar's Diameter   :   "+diameter;
          k=k+"\n\n \t\t\t Reinforcing Bar's Diameter is InValid";
         l.writeFile("Result1.BIM",k);
         
      }
      
        }
            }
            else if(d.equals("i507181"))
            {
                System.out.println(i);
    if (fstNode.getNodeType() == Node.ELEMENT_NODE) {
        
  
          
      Element fstNmElmnt = (Element) fstNmElmntLst.item(0);
      System.out.println(fstNmElmnt);
       fstNm = fstNmElmnt.getChildNodes();
      System.out.println(fstNm.item(0).getNodeValue());
      
      System.out.println(d);
     
      String str=fstNm.item(0).getNodeValue();
      System.out.println(str);
      int ln=str.length();
            String str1= str.substring(0,ln-1);
              diameter=Integer.parseInt(str1);
     
             
      if(diameter>=16&&diameter<=30)
      {
          System.out.println("Diameter of ReinforcingBar is Valid : "+diameter);
         
          count=1;
          k="\n\n\nReinforcing Bar's Diameter   :   "+diameter;
          k=k+"\n\n \t\t\t Reinforcing Bar's Diameter is Valid";
         l.writeFile("Result1.BIM",k);
      }
      else
      {
          System.out.println("Diameter of ReinforcingBar is InValid : "+diameter+"must be>16 and <30");
          
          count=1;
          k="\n\n\nReinforcing Bar's Diameter   :   "+diameter;
          k=k+"\n\n \t\t\t Reinforcing Bar's Diameter is InValid";
         l.writeFile("Result1.BIM",k);
         
      }
      
        }
            }
            else if(d.equals("i557561"))
            {
                System.out.println(i);
    if (fstNode.getNodeType() == Node.ELEMENT_NODE) {
        
  
          
      Element fstNmElmnt = (Element) fstNmElmntLst.item(0);
      System.out.println(fstNmElmnt);
       fstNm = fstNmElmnt.getChildNodes();
      System.out.println(fstNm.item(0).getNodeValue());
      
      System.out.println(d);
      
      String str=fstNm.item(0).getNodeValue();
      System.out.println(str);
      int ln=str.length();
            String str1= str.substring(0,ln-1);
              diameter=Integer.parseInt(str1);
      
             
      if(diameter>=16&&diameter<=30)
      {
          System.out.println("Diameter of ReinforcingBar is Valid : "+diameter);
         
          count=1;
          k="\n\n\nReinforcing Bar's Diameter   :   "+diameter;
          k=k+"\n\n \t\t\t Reinforcing Bar's Diameter is Valid";
         l.writeFile("Result1.BIM",k);
      }
      else
      {
          System.out.println("Diameter of ReinforcingBar is InValid : "+diameter+"must be>16 and <30");
         
          count=1;
          k="\n\n\nReinforcing Bar's Diameter   :   "+diameter;
          k=k+"\n\n \t\t\t Reinforcing Bar's Diameter is InValid";
         l.writeFile("Result1.BIM",k);
         
      }
      
        }
            }
            else if(d.equals("i607941"))
            {
                System.out.println(i);
    if (fstNode.getNodeType() == Node.ELEMENT_NODE) {
        
  
          
      Element fstNmElmnt = (Element) fstNmElmntLst.item(0);
      System.out.println(fstNmElmnt);
       fstNm = fstNmElmnt.getChildNodes();
      System.out.println(fstNm.item(0).getNodeValue());
      
      System.out.println(d);
      
      String str=fstNm.item(0).getNodeValue();
      System.out.println(str);
      int ln=str.length();
            String str1= str.substring(0,ln-1);
              diameter=Integer.parseInt(str1);
      
             
      if(diameter>=16&&diameter<=30)
      {
          System.out.println("Diameter of ReinforcingBar is Valid : "+diameter);
          
          count=1;
          k="\n\n\nReinforcing Bar's Diameter   :   "+diameter;
          k=k+"\n\n \t\t\t Reinforcing Bar's Diameter is Valid";
         l.writeFile("Result1.BIM",k);
      }
      else
      {
          System.out.println("Diameter of ReinforcingBar is InValid : "+diameter+"must be>16 and <30");
         
          count=1;
          k="\n\n\nReinforcing Bar's Diameter   :   "+diameter;
          k=k+"\n\n \t\t\t Reinforcing Bar's Diameter is InValid";
         l.writeFile("Result1.BIM",k);
         
      }
     
        }
            }
            
    
         }
        }
       NodeList  nodeList1 = document.getElementsByTagName("IfcReinforcingBar");
         k="\n\n\n\t\t-----------------------------Reinforcing Bar's Area Validation------------------------------";
            l.writeFile("Result1.BIM",k);
        int count1=0;
        for(int i=0;i<nodeList1.getLength();i++)
        {
            
            System.out.println(i);
             
            Node fstNode = nodeList1.item((int)i);
            Element fstElmnt = (Element) fstNode;
      NodeList fstNmElmntLst = fstElmnt.getElementsByTagName("Description");
        
          
            Element el = (org.w3c.dom.Element) nodeList1.item((int)i);
          
       if(el.hasAttribute("id"))
        {
            
        String d1=el.getAttribute("id");
        
        if(d1.equals("i53132"))
            {
            
            Element fstNmElmnt = (Element) fstNmElmntLst.item(0);
      System.out.println(fstNmElmnt);
       fstNm = fstNmElmnt.getChildNodes();
      String d= fstNm.item(0).getNodeValue();
           
            
            System.out.println(d);
            
            
            if(d.equals("Reinforcement"))
            {
                NodeList fstNmElmntLst2 = fstElmnt.getElementsByTagName("ObjectType");
                Element fstNmElmnt2 = (Element) fstNmElmntLst2.item(0);
      System.out.println(fstNmElmnt2);
       fstNm = fstNmElmnt2.getChildNodes();
      String d2= fstNm.item(0).getNodeValue();
      System.out.println(d2);
      if(d2.equals("ColumnReinforcement"))
      {
                System.out.println(i);
    if (fstNode.getNodeType() == Node.ELEMENT_NODE) {
        
  
       NodeList fstNmElmntLst1 = fstElmnt.getElementsByTagName("CrossSectionArea");   
      Element fstNmElmnt1 = (Element) fstNmElmntLst1.item(0);
      System.out.println(fstNmElmnt1);
       fstNm= fstNmElmnt1.getChildNodes();
      System.out.println(fstNm.item(0).getNodeValue());
      
      System.out.println(d);
     
      String str=fstNm.item(0).getNodeValue();
      System.out.println(str);
      int ln=str.length();
            String str1= str.substring(0,ln-1);
             diameter1=Integer.parseInt(str1);
      
             
      if(diameter1>=3000&&diameter1<=4000)
      {
          System.out.println("Cross Section of ReinforcingBar is Valid : "+diameter1);
          
          count1=1;
          k="\n\n\nReinforcing Bar's Cross Section   :   "+diameter1;
          k=k+"\n\n \t\t\t Reinforcing Bar's Cross Section is Valid";
         l.writeFile("Result1.BIM",k);
      }
      else
      {
          System.out.println("Cross Section of ReinforcingBar is InValid : "+diameter1+"must be>16 and <30");
          
          count1=1;
          k="\n\n\nReinforcing Bar's Cross Section   :   "+diameter1;
          k=k+"\n\n \t\t\t Reinforcing Bar's Cross Section is InValid";
         l.writeFile("Result1.BIM",k);
         
      }
     
        }
            }
            
            
            
    
         }
            }
        if(d1.equals("i157799"))
            {
            
            Element fstNmElmnt = (Element) fstNmElmntLst.item(0);
      System.out.println(fstNmElmnt);
       fstNm = fstNmElmnt.getChildNodes();
      String d= fstNm.item(0).getNodeValue();
           
            
            System.out.println(d);
            
            
            if(d.equals("Reinforcement"))
            {
                System.out.println(i);
                   NodeList fstNmElmntLst2 = fstElmnt.getElementsByTagName("ObjectType");
                Element fstNmElmnt2 = (Element) fstNmElmntLst2.item(0);
      System.out.println(fstNmElmnt2);
       fstNm = fstNmElmnt.getChildNodes();
      String d2= fstNm.item(0).getNodeValue();
      if(d2.equals("ColumnReinforcement"))
      {
    if (fstNode.getNodeType() == Node.ELEMENT_NODE) {
        
  
       NodeList fstNmElmntLst1 = fstElmnt.getElementsByTagName("CrossSectionArea");   
      Element fstNmElmnt1 = (Element) fstNmElmntLst1.item(0);
      System.out.println(fstNmElmnt1);
       fstNm= fstNmElmnt1.getChildNodes();
      System.out.println(fstNm.item(0).getNodeValue());
      
      System.out.println(d);
      
      String str=fstNm.item(0).getNodeValue();
      System.out.println(str);
      int ln=str.length();
            String str1= str.substring(0,ln-1);
             diameter2=Integer.parseInt(str1);
      
             
      if(diameter2>=3000&&diameter2<=4000)
      {
          System.out.println("Cross Section of ReinforcingBar is Valid : "+diameter2);
         
          count1=1;
          k="\n\n\nReinforcing Bar's Cross Section   :   "+diameter2;
          k=k+"\n\n \t\t\t Reinforcing Bar's Cross Section is Valid";
         l.writeFile("Result1.BIM",k);
      }
      else
      {
          System.out.println("Cross Section of ReinforcingBar is InValid : "+diameter2+"must be>16 and <30");
          
          count1=1;
          k="\n\n\nReinforcing Bar's Cross Section   :   "+diameter2;
          k=k+"\n\n \t\t\t Reinforcing Bar's Cross Section is InValid";
         l.writeFile("Result1.BIM",k);
         
      }
     
     
        }
            }
            
            
            
    
         }
            }
        if(d1.equals("i199406"))
            {
           
           
            Element fstNmElmnt = (Element) fstNmElmntLst.item(0);
      System.out.println(fstNmElmnt);
       fstNm = fstNmElmnt.getChildNodes();
      String d= fstNm.item(0).getNodeValue();
           
            
            System.out.println(d);
            
            
            if(d.equals("Reinforcement"))
            {
                   NodeList fstNmElmntLst2 = fstElmnt.getElementsByTagName("ObjectType");
                Element fstNmElmnt2 = (Element) fstNmElmntLst2.item(0);
      System.out.println(fstNmElmnt2);
       fstNm = fstNmElmnt2.getChildNodes();
      String d2= fstNm.item(0).getNodeValue();
      if(d2.equals("ColumnReinforcement"))
      {
                System.out.println(i);
    if (fstNode.getNodeType() == Node.ELEMENT_NODE) {
        
  
       NodeList fstNmElmntLst1 = fstElmnt.getElementsByTagName("CrossSectionArea");   
      Element fstNmElmnt1 = (Element) fstNmElmntLst1.item(0);
      System.out.println(fstNmElmnt1);
       fstNm= fstNmElmnt1.getChildNodes();
      System.out.println(fstNm.item(0).getNodeValue());
      
      System.out.println(d);
      
      String str=fstNm.item(0).getNodeValue();
      System.out.println(str);
      int ln=str.length();
            String str1= str.substring(0,ln-1);
              diameter3=Integer.parseInt(str1);
     
      
             
      if(diameter3>=3000&&diameter3<=4000)
      {
          System.out.println("Cross Section of ReinforcingBar is Valid : "+diameter3);
         
          count1=1;
          k="\n\n\nReinforcing Bar's Cross Section   :   "+diameter3;
          k=k+"\n\n \t\t\t Reinforcing Bar's Cross Section is Valid";
         l.writeFile("Result1.BIM",k);
      }
      else
      {
          System.out.println("Cross Section of ReinforcingBar is InValid : "+diameter3+"must be>16 and <30");
          
          count1=1;
          k="\n\n\nReinforcing Bar's Cross Section   :   "+diameter3;
          k=k+"\n\n \t\t\t Reinforcing Bar's Cross Section is InValid";
         l.writeFile("Result1.BIM",k);
         
      }
     
   
        }
            }
            
            
            
    
         }
            }
        if(d1.equals("i242786"))
            {
           
           
            Element fstNmElmnt = (Element) fstNmElmntLst.item(0);
      System.out.println(fstNmElmnt);
       fstNm = fstNmElmnt.getChildNodes();
      String d= fstNm.item(0).getNodeValue();
           
            
            System.out.println(d);
            
            
            if(d.equals("Reinforcement"))
            {
                   NodeList fstNmElmntLst2 = fstElmnt.getElementsByTagName("ObjectType");
                Element fstNmElmnt2 = (Element) fstNmElmntLst2.item(0);
      System.out.println(fstNmElmnt2);
       fstNm = fstNmElmnt2.getChildNodes();
      String d2= fstNm.item(0).getNodeValue();
      if(d2.equals("ColumnReinforcement"))
      {
                System.out.println(i);
    if (fstNode.getNodeType() == Node.ELEMENT_NODE) {
        
  
       NodeList fstNmElmntLst1 = fstElmnt.getElementsByTagName("CrossSectionArea");   
      Element fstNmElmnt1 = (Element) fstNmElmntLst1.item(0);
      System.out.println(fstNmElmnt1);
       fstNm= fstNmElmnt1.getChildNodes();
      System.out.println(fstNm.item(0).getNodeValue());
      
      System.out.println(d);
      
      String str=fstNm.item(0).getNodeValue();
      System.out.println(str);
      int ln=str.length();
            String str1= str.substring(0,ln-1);
              diameter4=Integer.parseInt(str1);
     
      
             
      if(diameter4>=3000&&diameter4<=4000)
      {
          System.out.println("Cross Section of ReinforcingBar is Valid : "+diameter4);
         
          count1=1;
          k="\n\n\nReinforcing Bar's Cross Section   :   "+diameter4;
          k=k+"\n\n \t\t\t Reinforcing Bar's Cross Section is Valid";
         l.writeFile("Result1.BIM",k);
      }
      else
      {
          System.out.println("Cross Section of ReinforcingBar is InValid : "+diameter4+"must be>16 and <30");
          
          count1=1;
          k="\n\n\nReinforcing Bar's Cross Section   :   "+diameter4;
          k=k+"\n\n \t\t\t Reinforcing Bar's Cross Section is InValid";
         l.writeFile("Result1.BIM",k);
         
      }
     
   
        }
            }
            
            
            
    
         }
            }
        if(d1.equals("i286030"))
            {
           
           
            Element fstNmElmnt = (Element) fstNmElmntLst.item(0);
      System.out.println(fstNmElmnt);
       fstNm = fstNmElmnt.getChildNodes();
      String d= fstNm.item(0).getNodeValue();
           
            
            System.out.println(d);
            
            
            if(d.equals("Reinforcement"))
            {
                   NodeList fstNmElmntLst2 = fstElmnt.getElementsByTagName("ObjectType");
                Element fstNmElmnt2 = (Element) fstNmElmntLst2.item(0);
      System.out.println(fstNmElmnt2);
       fstNm = fstNmElmnt2.getChildNodes();
      String d2= fstNm.item(0).getNodeValue();
      if(d2.equals("ColumnReinforcement"))
      {
                System.out.println(i);
    if (fstNode.getNodeType() == Node.ELEMENT_NODE) {
        
  
       NodeList fstNmElmntLst1 = fstElmnt.getElementsByTagName("CrossSectionArea");   
      Element fstNmElmnt1 = (Element) fstNmElmntLst1.item(0);
      System.out.println(fstNmElmnt1);
       fstNm= fstNmElmnt1.getChildNodes();
      System.out.println(fstNm.item(0).getNodeValue());
      
      System.out.println(d);
      
      String str=fstNm.item(0).getNodeValue();
      System.out.println(str);
      int ln=str.length();
            String str1= str.substring(0,ln-1);
              diameter6=Integer.parseInt(str1);
     
      
             
      if(diameter6>=3000&&diameter6<=4000)
      {
          System.out.println("Cross Section of ReinforcingBar is Valid : "+diameter6);
         
          count1=1;
          k="\n\n\nReinforcing Bar's Cross Section   :   "+diameter6;
          k=k+"\n\n \t\t\t Reinforcing Bar's Cross Section is Valid";
         l.writeFile("Result1.BIM",k);
      }
      else
      {
          System.out.println("Cross Section of ReinforcingBar is InValid : "+diameter6+"must be>16 and <30");
          
          count1=1;
          k="\n\n\nReinforcing Bar's Cross Section   :   "+diameter6;
          k=k+"\n\n \t\t\t Reinforcing Bar's Cross Section is InValid";
         l.writeFile("Result1.BIM",k);
         
      }
     
      
        }
            }
            
            
            
    
         }
        }
        if(d1.equals("i329274"))
            {
           
           
            Element fstNmElmnt = (Element) fstNmElmntLst.item(0);
      System.out.println(fstNmElmnt);
       fstNm = fstNmElmnt.getChildNodes();
      String d= fstNm.item(0).getNodeValue();
           
            
            System.out.println(d);
            
            
            if(d.equals("Reinforcement"))
            {
                   NodeList fstNmElmntLst2 = fstElmnt.getElementsByTagName("ObjectType");
                Element fstNmElmnt2 = (Element) fstNmElmntLst2.item(0);
      System.out.println(fstNmElmnt2);
       fstNm = fstNmElmnt2.getChildNodes();
      String d2= fstNm.item(0).getNodeValue();
      if(d2.equals("ColumnReinforcement"))
      {
                System.out.println(i);
    if (fstNode.getNodeType() == Node.ELEMENT_NODE) {
        
  
       NodeList fstNmElmntLst1 = fstElmnt.getElementsByTagName("CrossSectionArea");   
      Element fstNmElmnt1 = (Element) fstNmElmntLst1.item(0);
      System.out.println(fstNmElmnt1);
       fstNm= fstNmElmnt1.getChildNodes();
      System.out.println(fstNm.item(0).getNodeValue());
      
      System.out.println(d);
      
      String str=fstNm.item(0).getNodeValue();
      System.out.println(str);
      int ln=str.length();
            String str1= str.substring(0,ln-1);
              diameter6=Integer.parseInt(str1);
     
      
             
      if(diameter6>=3000&&diameter6<=4000)
      {
          System.out.println("Cross Section of ReinforcingBar is Valid : "+diameter6);
         
          count1=1;
          k="\n\n\nReinforcing Bar's Cross Section   :   "+diameter6;
          k=k+"\n\n \t\t\t Reinforcing Bar's Cross Section is Valid";
         l.writeFile("Result1.BIM",k);
      }
      else
      {
          System.out.println("Cross Section of ReinforcingBar is InValid : "+diameter6+"must be>16 and <30");
          
          count1=1;
          k="\n\n\nReinforcing Bar's Cross Section   :   "+diameter6;
          k=k+"\n\n \t\t\t Reinforcing Bar's Cross Section is InValid";
         l.writeFile("Result1.BIM",k);
         
      }
     
      
        }
            }
            
            
            
    
         }
        }
        if(d1.equals("i372518"))
            {
           
           
            Element fstNmElmnt = (Element) fstNmElmntLst.item(0);
      System.out.println(fstNmElmnt);
       fstNm = fstNmElmnt.getChildNodes();
      String d= fstNm.item(0).getNodeValue();
           
            
            System.out.println(d);
            
            
            if(d.equals("Reinforcement"))
            {
                   NodeList fstNmElmntLst2 = fstElmnt.getElementsByTagName("ObjectType");
                Element fstNmElmnt2 = (Element) fstNmElmntLst2.item(0);
      System.out.println(fstNmElmnt2);
       fstNm = fstNmElmnt2.getChildNodes();
      String d2= fstNm.item(0).getNodeValue();
      if(d2.equals("ColumnReinforcement"))
      {
                System.out.println(i);
    if (fstNode.getNodeType() == Node.ELEMENT_NODE) {
        
  
       NodeList fstNmElmntLst1 = fstElmnt.getElementsByTagName("CrossSectionArea");   
      Element fstNmElmnt1 = (Element) fstNmElmntLst1.item(0);
      System.out.println(fstNmElmnt1);
       fstNm= fstNmElmnt1.getChildNodes();
      System.out.println(fstNm.item(0).getNodeValue());
      
      System.out.println(d);
      
      String str=fstNm.item(0).getNodeValue();
      System.out.println(str);
      int ln=str.length();
            String str1= str.substring(0,ln-1);
              diameter6=Integer.parseInt(str1);
     
      
             
      if(diameter6>=3000&&diameter6<=4000)
      {
          System.out.println("Cross Section of ReinforcingBar is Valid : "+diameter6);
         
          count1=1;
          k="\n\n\nReinforcing Bar's Cross Section   :   "+diameter6;
          k=k+"\n\n \t\t\t Reinforcing Bar's Cross Section is Valid";
         l.writeFile("Result1.BIM",k);
      }
      else
      {
          System.out.println("Cross Section of ReinforcingBar is InValid : "+diameter6+"must be>16 and <30");
          
          count1=1;
          k="\n\n\nReinforcing Bar's Cross Section   :   "+diameter6;
          k=k+"\n\n \t\t\t Reinforcing Bar's Cross Section is InValid";
         l.writeFile("Result1.BIM",k);
         
      }
     
   
        }
            }
            
            
            
    
         }
        }
        if(d1.equals("i415194"))
            {
           
           
            Element fstNmElmnt = (Element) fstNmElmntLst.item(0);
      System.out.println(fstNmElmnt);
       fstNm = fstNmElmnt.getChildNodes();
      String d= fstNm.item(0).getNodeValue();
           
            
            System.out.println(d);
            
            
            if(d.equals("Reinforcement"))
            {
                   NodeList fstNmElmntLst2 = fstElmnt.getElementsByTagName("ObjectType");
                Element fstNmElmnt2 = (Element) fstNmElmntLst2.item(0);
      System.out.println(fstNmElmnt2);
       fstNm = fstNmElmnt2.getChildNodes();
      String d2= fstNm.item(0).getNodeValue();
      if(d2.equals("ColumnReinforcement"))
      {
                System.out.println(i);
    if (fstNode.getNodeType() == Node.ELEMENT_NODE) {
        
  
       NodeList fstNmElmntLst1 = fstElmnt.getElementsByTagName("CrossSectionArea");   
      Element fstNmElmnt1 = (Element) fstNmElmntLst1.item(0);
      System.out.println(fstNmElmnt1);
       fstNm= fstNmElmnt1.getChildNodes();
      System.out.println(fstNm.item(0).getNodeValue());
      
      System.out.println(d);
      
      String str=fstNm.item(0).getNodeValue();
      System.out.println(str);
      int ln=str.length();
            String str1= str.substring(0,ln-1);
              diameter6=Integer.parseInt(str1);
     
      
             
      if(diameter6>=3000&&diameter6<=4000)
      {
          System.out.println("Cross Section of ReinforcingBar is Valid : "+diameter6);
         
          count1=1;
          k="\n\n\nReinforcing Bar's Cross Section   :   "+diameter6;
          k=k+"\n\n \t\t\t Reinforcing Bar's Cross Section is Valid";
         l.writeFile("Result1.BIM",k);
      }
      else
      {
          System.out.println("Cross Section of ReinforcingBar is InValid : "+diameter6+"must be>16 and <30");
          
          count1=1;
          k="\n\n\nReinforcing Bar's Cross Section   :   "+diameter6;
          k=k+"\n\n \t\t\t Reinforcing Bar's Cross Section is InValid";
         l.writeFile("Result1.BIM",k);
         
      }
     
    
        }
            }
            
            
            
    
         }
        }
        if(d1.equals("i456801"))
            {
           
           
            Element fstNmElmnt = (Element) fstNmElmntLst.item(0);
      System.out.println(fstNmElmnt);
       fstNm = fstNmElmnt.getChildNodes();
      String d= fstNm.item(0).getNodeValue();
           
            
            System.out.println(d);
            
            
            if(d.equals("Reinforcement"))
            {
                   NodeList fstNmElmntLst2 = fstElmnt.getElementsByTagName("ObjectType");
                Element fstNmElmnt2 = (Element) fstNmElmntLst2.item(0);
      System.out.println(fstNmElmnt2);
       fstNm = fstNmElmnt2.getChildNodes();
      String d2= fstNm.item(0).getNodeValue();
      if(d2.equals("ColumnReinforcement"))
      {
                System.out.println(i);
    if (fstNode.getNodeType() == Node.ELEMENT_NODE) {
        
  
       NodeList fstNmElmntLst1 = fstElmnt.getElementsByTagName("CrossSectionArea");   
      Element fstNmElmnt1 = (Element) fstNmElmntLst1.item(0);
      System.out.println(fstNmElmnt1);
       fstNm= fstNmElmnt1.getChildNodes();
      System.out.println(fstNm.item(0).getNodeValue());
      
      System.out.println(d);
      
      String str=fstNm.item(0).getNodeValue();
      System.out.println(str);
      int ln=str.length();
            String str1= str.substring(0,ln-1);
              diameter6=Integer.parseInt(str1);
     
      
             
      if(diameter6>=3000&&diameter6<=4000)
      {
          System.out.println("Cross Section of ReinforcingBar is Valid : "+diameter6);
         
          count1=1;
          k="\n\n\nReinforcing Bar's Cross Section   :   "+diameter6;
          k=k+"\n\n \t\t\t Reinforcing Bar's Cross Section is Valid";
         l.writeFile("Result1.BIM",k);
      }
      else
      {
          System.out.println("Cross Section of ReinforcingBar is InValid : "+diameter6+"must be>16 and <30");
          
          count1=1;
          k="\n\n\nReinforcing Bar's Cross Section   :   "+diameter6;
          k=k+"\n\n \t\t\t Reinforcing Bar's Cross Section is InValid";
         l.writeFile("Result1.BIM",k);
         
      }
     
   
        }
            }
            
            
            
    
         }
        }
        if(d1.equals("i507181"))
            {
           
           
            Element fstNmElmnt = (Element) fstNmElmntLst.item(0);
      System.out.println(fstNmElmnt);
       fstNm = fstNmElmnt.getChildNodes();
      String d= fstNm.item(0).getNodeValue();
           
            
            System.out.println(d);
            
            
            if(d.equals("Reinforcement"))
            {
                   NodeList fstNmElmntLst2 = fstElmnt.getElementsByTagName("ObjectType");
                Element fstNmElmnt2 = (Element) fstNmElmntLst2.item(0);
      System.out.println(fstNmElmnt2);
       fstNm = fstNmElmnt2.getChildNodes();
      String d2= fstNm.item(0).getNodeValue();
      if(d2.equals("ColumnReinforcement"))
      {
                System.out.println(i);
    if (fstNode.getNodeType() == Node.ELEMENT_NODE) {
        
  
       NodeList fstNmElmntLst1 = fstElmnt.getElementsByTagName("CrossSectionArea");   
      Element fstNmElmnt1 = (Element) fstNmElmntLst1.item(0);
      System.out.println(fstNmElmnt1);
       fstNm= fstNmElmnt1.getChildNodes();
      System.out.println(fstNm.item(0).getNodeValue());
      
      System.out.println(d);
      
      String str=fstNm.item(0).getNodeValue();
      System.out.println(str);
      int ln=str.length();
            String str1= str.substring(0,ln-1);
              diameter6=Integer.parseInt(str1);
     
      
             
      if(diameter6>=3000&&diameter6<=4000)
      {
          System.out.println("Cross Section of ReinforcingBar is Valid : "+diameter6);
         
          count1=1;
          k="\n\n\nReinforcing Bar's Cross Section   :   "+diameter6;
          k=k+"\n\n \t\t\t Reinforcing Bar's Cross Section is Valid";
         l.writeFile("Result1.BIM",k);
      }
      else
      {
          System.out.println("Cross Section of ReinforcingBar is InValid : "+diameter6+"must be>16 and <30");
          
          count1=1;
          k="\n\n\nReinforcing Bar's Cross Section   :   "+diameter6;
          k=k+"\n\n \t\t\t Reinforcing Bar's Cross Section is InValid";
         l.writeFile("Result1.BIM",k);
         
      }
     
  
        }
            }
            
            
            
    
         }
        }
        if(d1.equals("i557561"))
            {
           
           
            Element fstNmElmnt = (Element) fstNmElmntLst.item(0);
      System.out.println(fstNmElmnt);
       fstNm = fstNmElmnt.getChildNodes();
      String d= fstNm.item(0).getNodeValue();
           
            
            System.out.println(d);
            
            
            if(d.equals("Reinforcement"))
            {
                   NodeList fstNmElmntLst2 = fstElmnt.getElementsByTagName("ObjectType");
                Element fstNmElmnt2 = (Element) fstNmElmntLst2.item(0);
      System.out.println(fstNmElmnt2);
       fstNm = fstNmElmnt2.getChildNodes();
      String d2= fstNm.item(0).getNodeValue();
      if(d2.equals("ColumnReinforcement"))
      {
                System.out.println(i);
    if (fstNode.getNodeType() == Node.ELEMENT_NODE) {
        
  
       NodeList fstNmElmntLst1 = fstElmnt.getElementsByTagName("CrossSectionArea");   
      Element fstNmElmnt1 = (Element) fstNmElmntLst1.item(0);
      System.out.println(fstNmElmnt1);
       fstNm= fstNmElmnt1.getChildNodes();
      System.out.println(fstNm.item(0).getNodeValue());
      
      System.out.println(d);
      
      String str=fstNm.item(0).getNodeValue();
      System.out.println(str);
      int ln=str.length();
            String str1= str.substring(0,ln-1);
              diameter6=Integer.parseInt(str1);
     
      
             
      if(diameter6>=3000&&diameter6<=4000)
      {
          System.out.println("Cross Section of ReinforcingBar is Valid : "+diameter6);
         
          count1=1;
          k="\n\n\nReinforcing Bar's Cross Section   :   "+diameter6;
          k=k+"\n\n \t\t\t Reinforcing Bar's Cross Section is Valid";
         l.writeFile("Result1.BIM",k);
      }
      else
      {
          System.out.println("Cross Section of ReinforcingBar is InValid : "+diameter6+"must be>16 and <30");
          
          count1=1;
          k="\n\n\nReinforcing Bar's Cross Section   :   "+diameter6;
          k=k+"\n\n \t\t\t Reinforcing Bar's Cross Section is InValid";
         l.writeFile("Result1.BIM",k);
         
      }
     
      
        }
            }
            
            
            
    
         }
        }
        if(d1.equals("i607941"))
            {
           
           
            Element fstNmElmnt = (Element) fstNmElmntLst.item(0);
      System.out.println(fstNmElmnt);
       fstNm = fstNmElmnt.getChildNodes();
      String d= fstNm.item(0).getNodeValue();
           
            
            System.out.println(d);
            
            
            if(d.equals("Reinforcement"))
            {
                   NodeList fstNmElmntLst2 = fstElmnt.getElementsByTagName("ObjectType");
                Element fstNmElmnt2 = (Element) fstNmElmntLst2.item(0);
      System.out.println(fstNmElmnt2);
       fstNm = fstNmElmnt2.getChildNodes();
      String d2= fstNm.item(0).getNodeValue();
      if(d2.equals("ColumnReinforcement"))
      {
                System.out.println(i);
    if (fstNode.getNodeType() == Node.ELEMENT_NODE) {
        
  
       NodeList fstNmElmntLst1 = fstElmnt.getElementsByTagName("CrossSectionArea");   
      Element fstNmElmnt1 = (Element) fstNmElmntLst1.item(0);
      System.out.println(fstNmElmnt1);
       fstNm= fstNmElmnt1.getChildNodes();
      System.out.println(fstNm.item(0).getNodeValue());
      
      System.out.println(d);
      
      String str=fstNm.item(0).getNodeValue();
      System.out.println(str);
      int ln=str.length();
            String str1= str.substring(0,ln-1);
              diameter6=Integer.parseInt(str1);
     
      
             
      if(diameter6>=3000&&diameter6<=4000)
      {
          System.out.println("Cross Section of ReinforcingBar is Valid : "+diameter6);
         
          count1=1;
          k="\n\n\nReinforcing Bar's Cross Section   :   "+diameter6;
          k=k+"\n\n \t\t\t Reinforcing Bar's Cross Section is Valid";
         l.writeFile("Result1.BIM",k);
      }
      else
      {
          System.out.println("Cross Section of ReinforcingBar is InValid : "+diameter6+"must be>16 and <30");
          
          count1=1;
          k="\n\n\nReinforcing Bar's Cross Section   :   "+diameter6;
          k=k+"\n\n \t\t\t Reinforcing Bar's Cross Section is InValid";
         l.writeFile("Result1.BIM",k);
         
      }
     
   
        }
            }
            
            
            
    
         }
        }
        }
        }
         nodeList = document.getElementsByTagName("IfcPropertySingleValue");
         
    
         k="\n\n\n\t\t-----------------------------No. of Rebars Validation------------------------------";
            l.writeFile("Result1.BIM",k);
        for(int i=0;i<nodeList.getLength();i++)
        {
            
            System.out.println(i);
               
            Node fstNode = nodeList.item((int)i);
            Element fstElmnt = (Element) fstNode;
      NodeList fstNmElmntLst = fstElmnt.getElementsByTagName("IfcLabel-wrapper");
        
         
            Element el = (org.w3c.dom.Element) nodeList.item((int)i);
       if(el.hasAttribute("id"))
        {
            
        
           
            String d=el.getAttribute("id");
            
            System.out.println(d);
            
            
            if(d.equals("i53179"))
            {
                System.out.println(i);
    if (fstNode.getNodeType() == Node.ELEMENT_NODE) {
        
  
          
      Element fstNmElmnt = (Element) fstNmElmntLst.item(0);
      System.out.println(fstNmElmnt);
       fstNm = fstNmElmnt.getChildNodes();
      System.out.println(fstNm.item(0).getNodeValue());
      
      System.out.println(d);
      
      String str=fstNm.item(0).getNodeValue();
      System.out.println(str);
      
            
             int no_of_bars=Integer.parseInt(str);
     
      
             
      if(no_of_bars>=4)
      {
          System.out.println("No_of_Bars in the Column : "+no_of_bars);
          
          count=1;
          k="\n\n\n No_of_Bars in the Column : "+no_of_bars;
          k=k+"\n\n \t\t\t No_of_Bars in the Column is Valid i.e."+no_of_bars;
         l.writeFile("Result1.BIM",k);
      }
      else
      {
          System.out.println("No_of_Bars in the Column : "+no_of_bars+"must be>=4");
          
          count=1;
          k="\n\n\n No_of_Bars in the Column : "+no_of_bars;
          k=k+"\n\n \t\t\t No_of_Bars in the Column :"+no_of_bars+" is InValid. Should be Greater than equal to 4";
         l.writeFile("Result1.BIM",k);
         
      }
     
        }
            }
           else if(d.equals("i507225"))
            {
                System.out.println(i);
    if (fstNode.getNodeType() == Node.ELEMENT_NODE) {
        
  
          
      Element fstNmElmnt = (Element) fstNmElmntLst.item(0);
      System.out.println(fstNmElmnt);
       fstNm = fstNmElmnt.getChildNodes();
      System.out.println(fstNm.item(0).getNodeValue());
      
      System.out.println(d);
      
      String str=fstNm.item(0).getNodeValue();
      System.out.println(str);
      
            
             int no_of_bars=Integer.parseInt(str);
     
      
             
      if(no_of_bars>=4)
      {
          System.out.println("No_of_Bars in the Column : "+no_of_bars);
          
          count=1;
          k="\n\n\n No_of_Bars in the Column : "+no_of_bars;
          k=k+"\n\n \t\t\t No_of_Bars in the Column is Valid i.e."+no_of_bars;
         l.writeFile("Result1.BIM",k);
      }
      else
      {
          System.out.println("No_of_Bars in the Column : "+no_of_bars+"must be>=4");
          
          count=1;
          k="\n\n\n No_of_Bars in the Column : "+no_of_bars;
          k=k+"\n\n \t\t\t No_of_Bars in the Column :"+no_of_bars+" is InValid. Should be Greater than equal to 4";
         l.writeFile("Result1.BIM",k);
         
      }
      
        }
            }
        else if(d.equals("i557605"))
            {
                System.out.println(i);
    if (fstNode.getNodeType() == Node.ELEMENT_NODE) {
        
  
          
      Element fstNmElmnt = (Element) fstNmElmntLst.item(0);
      System.out.println(fstNmElmnt);
       fstNm = fstNmElmnt.getChildNodes();
      System.out.println(fstNm.item(0).getNodeValue());
      
      System.out.println(d);
      
      String str=fstNm.item(0).getNodeValue();
      System.out.println(str);
      
            
             int no_of_bars=Integer.parseInt(str);
     
      
             
      if(no_of_bars>=4)
      {
          System.out.println("No_of_Bars in the Column : "+no_of_bars);
          
          count=1;
          k="\n\n\n No_of_Bars in the Column : "+no_of_bars;
          k=k+"\n\n \t\t\t No_of_Bars in the Column is Valid i.e."+no_of_bars;
         l.writeFile("Result1.BIM",k);
      }
      else
      {
          System.out.println("No_of_Bars in the Column : "+no_of_bars+"must be>=4");
          
          count=1;
          k="\n\n\n No_of_Bars in the Column : "+no_of_bars;
          k=k+"\n\n \t\t\t No_of_Bars in the Column :"+no_of_bars+" is InValid. Should be Greater than equal to 4";
         l.writeFile("Result1.BIM",k);
         
      }
      
        }
            }
            else if(d.equals("i607985"))
            {
                System.out.println(i);
    if (fstNode.getNodeType() == Node.ELEMENT_NODE) {
        
  
          
      Element fstNmElmnt = (Element) fstNmElmntLst.item(0);
      System.out.println(fstNmElmnt);
       fstNm = fstNmElmnt.getChildNodes();
      System.out.println(fstNm.item(0).getNodeValue());
      
      System.out.println(d);
      
      String str=fstNm.item(0).getNodeValue();
      System.out.println(str);
      
            
             int no_of_bars=Integer.parseInt(str);
     
      
             
      if(no_of_bars>=4)
      {
          System.out.println("No_of_Bars in the Column : "+no_of_bars);
          
          count=1;
          k="\n\n\n No_of_Bars in the Column : "+no_of_bars;
          k=k+"\n\n \t\t\t No_of_Bars in the Column is Valid i.e."+no_of_bars;
         l.writeFile("Result1.BIM",k);
      }
      else
      {
          System.out.println("No_of_Bars in the Column : "+no_of_bars+"must be>=4");
          
          count=1;
          k="\n\n\n No_of_Bars in the Column : "+no_of_bars;
          k=k+"\n\n \t\t\t No_of_Bars in the Column :"+no_of_bars+" is InValid. Should be Greater than equal to 4";
         l.writeFile("Result1.BIM",k);
         
      }
     
        }
            }
}
        }
         nodeList = document.getElementsByTagName("IfcColumn");
         int Lowest=1;
        
        for(int i=0;i<nodeList.getLength();i++)
        {
            
            System.out.println(i);
                
            Node fstNode = nodeList.item((int)i);
            Element fstElmnt = (Element) fstNode;
      NodeList fstNmElmntLst = fstElmnt.getElementsByTagName("ObjectType");
        
         
            Element el = (org.w3c.dom.Element) nodeList.item(0);
       if(el.hasAttribute("id"))
        {
            
        
           
            String d=el.getAttribute("id");
            
            System.out.println(d);
            
            
            if(d.equals("i2394"))
            {
                System.out.println(i);
    if (fstNode.getNodeType() == Node.ELEMENT_NODE) {
        
  
          
      Element fstNmElmnt = (Element) fstNmElmntLst.item(0);
      System.out.println(fstNmElmnt);
       fstNm = fstNmElmnt.getChildNodes();
      System.out.println(fstNm.item(0).getNodeValue());
      
      System.out.println(d);
      
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
             
     
      
             
      if(D1>L1)
      {
          System.out.println(D1+"is Greater Than"+L1);
          count=1;
          Lowest=L1;
         
      }
      else if(L1>D1)
      {
          System.out.println(L1+"is Greater Than "+D1);
          
          count=1;
          Lowest=D1;
      
      }
      else
      {
          System.out.println(L1+"is Equal to "+D1);
          
          count=1;
          Lowest=L1;
        
      }
      
        }
            }
            else if(d.equals("i2519"))
            {
                System.out.println(i);
    if (fstNode.getNodeType() == Node.ELEMENT_NODE) {
        
  
          
      Element fstNmElmnt = (Element) fstNmElmntLst.item(0);
      System.out.println(fstNmElmnt);
       fstNm = fstNmElmnt.getChildNodes();
      System.out.println(fstNm.item(0).getNodeValue());
      
      System.out.println(d);
      
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
             
     
      
             
      if(D1>L1)
      {
          System.out.println(D1+"is Greater Than"+L1);
          count=1;
          Lowest=L1;
       
      }
      else if(L1>D1)
      {
          System.out.println(L1+"is Greater Than "+D1);
          
          count=1;
          Lowest=D1;
        
      }
      else
      {
          System.out.println(L1+"is Equal to "+D1);
          
          count=1;
          Lowest=L1;
        
      }
     
        }
            }
            else if(d.equals("i2636"))
            {
                System.out.println(i);
    if (fstNode.getNodeType() == Node.ELEMENT_NODE) {
        
  
          
      Element fstNmElmnt = (Element) fstNmElmntLst.item(0);
      System.out.println(fstNmElmnt);
       fstNm = fstNmElmnt.getChildNodes();
      System.out.println(fstNm.item(0).getNodeValue());
      
      System.out.println(d);
      
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
             
     
      
             
      if(D1>L1)
      {
          System.out.println(D1+"is Greater Than"+L1);
          count=1;
          Lowest=L1;
        
      }
      else if(L1>D1)
      {
          System.out.println(L1+"is Greater Than "+D1);
          
          count=1;
          Lowest=D1;
       
      }
      else
      {
          System.out.println(L1+"is Equal to "+D1);
          
          count=1;
          Lowest=L1;
       
      }
    
        }
            }
            else  if(d.equals("i2753"))
            {
                System.out.println(i);
    if (fstNode.getNodeType() == Node.ELEMENT_NODE) {
        
  
          
      Element fstNmElmnt = (Element) fstNmElmntLst.item(0);
      System.out.println(fstNmElmnt);
       fstNm = fstNmElmnt.getChildNodes();
      System.out.println(fstNm.item(0).getNodeValue());
      
      System.out.println(d);
      
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
             
     
      
             
      if(D1>L1)
      {
          System.out.println(D1+"is Greater Than"+L1);
          count=1;
          Lowest=L1;
         
      }
      else if(L1>D1)
      {
          System.out.println(L1+"is Greater Than "+D1);
          
          count=1;
          Lowest=D1;
       
      }
      else
      {
          System.out.println(L1+"is Equal to "+D1);
          
          count=1;
          Lowest=L1;
       
      }
     
        }
            }
            
        
}
        }
       nodeList = document.getElementsByTagName("IfcExtrudedAreaSolid");
         
        k="\n\n\n\t\t-----------------------------Slenderness Ratio Check------------------------------";
            l.writeFile("Result1.BIM",k);
        for(int i=0;i<nodeList.getLength();i++)
        {
            
            System.out.println(i);
                
            Node fstNode = nodeList.item((int)i);
            Element fstElmnt = (Element) fstNode;
      NodeList fstNmElmntLst = fstElmnt.getElementsByTagName("Depth");
        
         
            Element el = (org.w3c.dom.Element) nodeList.item((int)i);
       if(el.hasAttribute("id"))
        {
            
        
           
            String d=el.getAttribute("id");
            
            System.out.println(d);
            
            if(d.equals("i2371"))
            {
                System.out.println(i);
    if (fstNode.getNodeType() == Node.ELEMENT_NODE) {
        
  
          
      Element fstNmElmnt = (Element) fstNmElmntLst.item(0);
      System.out.println(fstNmElmnt);
       fstNm = fstNmElmnt.getChildNodes();
      System.out.println(fstNm.item(0).getNodeValue());
      
      System.out.println(d);
      
      String str=fstNm.item(0).getNodeValue();
      System.out.println(str);
      int ln=str.length();
            String str1= str.substring(0,ln-1);
             int depth=Integer.parseInt(str1);
     
             int ratio=depth/Lowest;
      if(ratio<=12)
      {
          System.out.println("Column with Slenderness Ratio : "+ratio);
         
          count1=1;
          k="\n\n\nColumn with Slenderness Ratio :   "+ratio;
          k=k+"\n\n \t\t\t Column is a Short Column";
         l.writeFile("Result1.BIM",k);
      }
      else
      {
          System.out.println("Column with Slenderness Ratio : "+ratio);
          
          count1=1;
          k="\n\n\n Column with Slenderness Ratio :   "+ratio;
          k=k+"\n\n \t\t\t Column is a Long Column";
         l.writeFile("Result1.BIM",k);
         
      }
    }
      
        }
            if(d.equals("i2502"))
            {
                System.out.println(i);
    if (fstNode.getNodeType() == Node.ELEMENT_NODE) {
        
  
          
      Element fstNmElmnt = (Element) fstNmElmntLst.item(0);
      System.out.println(fstNmElmnt);
       fstNm = fstNmElmnt.getChildNodes();
      System.out.println(fstNm.item(0).getNodeValue());
      
      System.out.println(d);
      
      String str=fstNm.item(0).getNodeValue();
      System.out.println(str);
      int ln=str.length();
            String str1= str.substring(0,ln-1);
             int depth=Integer.parseInt(str1);
     
      
             int ratio=depth/Lowest;
      if(ratio<=12)
      {
          System.out.println("Column with Slenderness Ratio : "+ratio);
         
          count1=1;
          k="\n\n\nColumn with Slenderness Ratio :   "+ratio;
          k=k+"\n\n \t\t\t Column is a Short Column";
         l.writeFile("Result1.BIM",k);
      }
      else
      {
          System.out.println("Column with Slenderness Ratio : "+ratio);
          
          count1=1;
          k="\n\n\n Column with Slenderness Ratio :   "+ratio;
          k=k+"\n\n \t\t\t Column is a Long Column";
         l.writeFile("Result1.BIM",k);
         
      }
    }
     
        }
            if(d.equals("i2619"))
            {
                System.out.println(i);
    if (fstNode.getNodeType() == Node.ELEMENT_NODE) {
        
  
          
      Element fstNmElmnt = (Element) fstNmElmntLst.item(0);
      System.out.println(fstNmElmnt);
       fstNm = fstNmElmnt.getChildNodes();
      System.out.println(fstNm.item(0).getNodeValue());
      
      System.out.println(d);
      
      String str=fstNm.item(0).getNodeValue();
      System.out.println(str);
      int ln=str.length();
            String str1= str.substring(0,ln-1);
             int depth=Integer.parseInt(str1);
     
      
             int ratio=depth/Lowest;
      if(ratio<=12)
      {
          System.out.println("Column with Slenderness Ratio : "+ratio);
         
          count1=1;
          k="\n\n\nColumn with Slenderness Ratio :   "+ratio;
          k=k+"\n\n \t\t\t Column is a Short Column";
         l.writeFile("Result1.BIM",k);
      }
      else
      {
          System.out.println("Column with Slenderness Ratio : "+ratio);
          
          count1=1;
          k="\n\n\n Column with Slenderness Ratio :   "+ratio;
          k=k+"\n\n \t\t\t Column is a Long Column";
         l.writeFile("Result1.BIM",k);
         
      }
    }
      
        }
            if(d.equals("i2736"))
            {
                System.out.println(i);
    if (fstNode.getNodeType() == Node.ELEMENT_NODE) {
        
  
          
      Element fstNmElmnt = (Element) fstNmElmntLst.item(0);
      System.out.println(fstNmElmnt);
       fstNm = fstNmElmnt.getChildNodes();
      System.out.println(fstNm.item(0).getNodeValue());
      
      System.out.println(d);
      
      String str=fstNm.item(0).getNodeValue();
      System.out.println(str);
      int ln=str.length();
            String str1= str.substring(0,ln-1);
             int depth=Integer.parseInt(str1);
     
      
             int ratio=depth/Lowest;
      if(ratio<=12)
      {
          System.out.println("Column with Slenderness Ratio : "+ratio);
         
          count1=1;
          k="\n\n\nColumn with Slenderness Ratio :   "+ratio;
          k=k+"\n\n \t\t\t Column is a Short Column";
         l.writeFile("Result1.BIM",k);
      }
      else
      {
          System.out.println("Column with Slenderness Ratio : "+ratio);
          
          count1=1;
          k="\n\n\n Column with Slenderness Ratio :   "+ratio;
          k=k+"\n\n \t\t\t Column is a Long Column";
         l.writeFile("Result1.BIM",k);
         
      }
    }
      
        }
            if(d.equals("i2853"))
            {
                System.out.println(i);
    if (fstNode.getNodeType() == Node.ELEMENT_NODE) {
        
  
          
      Element fstNmElmnt = (Element) fstNmElmntLst.item(0);
      System.out.println(fstNmElmnt);
       fstNm = fstNmElmnt.getChildNodes();
      System.out.println(fstNm.item(0).getNodeValue());
      
      System.out.println(d);
      
      String str=fstNm.item(0).getNodeValue();
      System.out.println(str);
      int ln=str.length();
            String str1= str.substring(0,ln-1);
             int depth=Integer.parseInt(str1);
     
      
             int ratio=depth/Lowest;
      if(ratio<=12)
      {
          System.out.println("Column with Slenderness Ratio : "+ratio);
         
          count1=1;
          k="\n\n\nColumn with Slenderness Ratio :   "+ratio;
          k=k+"\n\n \t\t\t Column is a Short Column";
         l.writeFile("Result1.BIM",k);
      }
      else
      {
          System.out.println("Column with Slenderness Ratio : "+ratio);
          
          count1=1;
          k="\n\n\n Column with Slenderness Ratio :   "+ratio;
          k=k+"\n\n \t\t\t Column is a Long Column";
         l.writeFile("Result1.BIM",k);
         
      }
    }
      
        }
            
            }
        }
        NodeList  nodeList3 = document.getElementsByTagName("IfcPropertySingleValue");
         k="\n\n\n\t\t-----------------------------C/C Spacing Check------------------------------";
            l.writeFile("Result1.BIM",k);
        int count2=0;
        System.out.println(nodeList3.getLength());
        for(int i=0;i<nodeList3.getLength();i++)
        {
            
            System.out.println(i);
            
                
            Node fstNode = nodeList3.item((int)i);
            Element fstElmnt = (Element)fstNode;
      NodeList fstNmElmntLst = fstElmnt.getElementsByTagName("Name");
        
         
            Element el = (org.w3c.dom.Element) nodeList3.item((int)i);
          
       if(el.hasAttribute("id"))
        {
            
        String d1=el.getAttribute("id");
      System.out.println(d1);
      
        if(d1.equals("i53156"))
            {  System.out.println("Rahul");
           
           
            
            Element fstNmElmnt = (Element) fstNmElmntLst.item(0);
      System.out.println(fstNmElmnt);
       fstNm = fstNmElmnt.getChildNodes();
      String d= fstNm.item(0).getNodeValue();
           System.out.println(d);
            
            System.out.println(d);
            
            
            if(d.equals("C/CSpacing"))
            {   System.out.println("Rk");
                
      NodeList fstNmElmntLst1 = fstElmnt.getElementsByTagName("IfcReal-wrapper");
                System.out.println(i);
    if (fstNode.getNodeType() == Node.ELEMENT_NODE) {
        
  Element fstNmElmnt1 = (Element) fstNmElmntLst1.item(0);
       fstNm = fstNmElmnt1.getChildNodes();
      
       System.out.println(fstNm.item(0).getNodeValue());
      String str=fstNm.item(0).getNodeValue();
      System.out.println(str);
      int ln=str.length();
            String str1= str.substring(0,ln-1);
             diameter1=Integer.parseInt(str1);
     
      
             
      if(diameter1<=300)
      {
          System.out.println("C/C Spacing is Valid : "+diameter1);
         
          count2=1;
          k="\n\n\n C/C Spacing    :   "+diameter1;
          k=k+"\n\n \t\t\t C/C Spacing is Valid";
         l.writeFile("Result1.BIM",k);
      }
      else
      {
          System.out.println("C/C Spacing is InValid : "+diameter1+"must be>300");
          
          count2=1;
          k="\n\n\n C/C Spacing   :   "+diameter1;
          k=k+"\n\n \t\t\t C/C Spacing is InValid";
         l.writeFile("Result1.BIM",k);
         
      }
     
      
        }
            
            
            
            
    
         }
            }
        if(d1.equals("i507202"))
            {
           
           
                System.out.println("Nanda");
            Element fstNmElmnt = (Element) fstNmElmntLst.item(0);
      System.out.println(fstNmElmnt);
       fstNm = fstNmElmnt.getChildNodes();
      String d= fstNm.item(0).getNodeValue();
           
            
            System.out.println(d);
            
            
            if(d.equals("C/CSpacing"))
            {
                NodeList fstNmElmntLst2 = fstElmnt.getElementsByTagName("IfcReal-wrapper");
                Element fstNmElmnt2 = (Element) fstNmElmntLst2.item(0);
      System.out.println(fstNmElmnt2);
       fstNm = fstNmElmnt2.getChildNodes();
      
     
                System.out.println(i);
    if (fstNode.getNodeType() == Node.ELEMENT_NODE) {
        
  
       
      
      String str=fstNm.item(0).getNodeValue();
      System.out.println(str);
      int ln=str.length();
            String str1= str.substring(0,ln-1);
             spacing=Integer.parseInt(str1);
     
      
             
      if(spacing<=300)
      {
          System.out.println("C/C Spacing is Valid : "+spacing);
         
          count2=1;
          k="\n\n\n C/C Spacing    :   "+spacing;
          k=k+"\n\n \t\t\t C/C Spacing is Valid";
         l.writeFile("Result1.BIM",k);
      }
      else
      {
          System.out.println("C/C Spacing is InValid : "+spacing+"must be>300");
          
          count2=1;
          k="\n\n\n C/C Spacing   :   "+spacing;
          k=k+"\n\n \t\t\t C/C Spacing is InValid";
         l.writeFile("Result1.BIM",k);
         
      }
     
     
        }
            
            
            
            
    
         }
            
            }
        if(d1.equals("i557582"))
            {
           
           
                System.out.println("Nanda");
            Element fstNmElmnt = (Element) fstNmElmntLst.item(0);
      System.out.println(fstNmElmnt);
       fstNm = fstNmElmnt.getChildNodes();
      String d= fstNm.item(0).getNodeValue();
           
            
            System.out.println(d);
            
            
            if(d.equals("C/CSpacing"))
            {
                NodeList fstNmElmntLst2 = fstElmnt.getElementsByTagName("IfcReal-wrapper");
                Element fstNmElmnt2 = (Element) fstNmElmntLst2.item(0);
      System.out.println(fstNmElmnt2);
       fstNm = fstNmElmnt2.getChildNodes();
      
     
                System.out.println(i);
    if (fstNode.getNodeType() == Node.ELEMENT_NODE) {
        
  
       
      
      String str=fstNm.item(0).getNodeValue();
      System.out.println(str);
      int ln=str.length();
            String str1= str.substring(0,ln-1);
             spacing=Integer.parseInt(str1);
     
      
             
      if(spacing<=300)
      {
          System.out.println("C/C Spacing is Valid : "+spacing);
         
          count2=1;
          k="\n\n\n C/C Spacing    :   "+spacing;
          k=k+"\n\n \t\t\t C/C Spacing is Valid";
         l.writeFile("Result1.BIM",k);
      }
      else
      {
          System.out.println("C/C Spacing is InValid : "+spacing+"must be>300");
          
          count2=1;
          k="\n\n\n C/C Spacing   :   "+spacing;
          k=k+"\n\n \t\t\t C/C Spacing is InValid";
         l.writeFile("Result1.BIM",k);
         
      }
     
    
        }
            
            
            
            
    
         }
            
            }
        if(d1.equals("i607962"))
            {
           
           
                System.out.println("Nanda");
            Element fstNmElmnt = (Element) fstNmElmntLst.item(0);
      System.out.println(fstNmElmnt);
       fstNm = fstNmElmnt.getChildNodes();
      String d= fstNm.item(0).getNodeValue();
           
            
            System.out.println(d);
            
            
            if(d.equals("C/CSpacing"))
            {
                NodeList fstNmElmntLst2 = fstElmnt.getElementsByTagName("IfcReal-wrapper");
                Element fstNmElmnt2 = (Element) fstNmElmntLst2.item(0);
      System.out.println(fstNmElmnt2);
       fstNm = fstNmElmnt2.getChildNodes();
      
     
                System.out.println(i);
    if (fstNode.getNodeType() == Node.ELEMENT_NODE) {
        
  
       
      
      String str=fstNm.item(0).getNodeValue();
      System.out.println(str);
      int ln=str.length();
            String str1= str.substring(0,ln-1);
             spacing=Integer.parseInt(str1);
     
      
             
      if(spacing<=300)
      {
          System.out.println("C/C Spacing is Valid : "+spacing);
         
          count2=1;
          k="\n\n\n C/C Spacing    :   "+spacing;
          k=k+"\n\n \t\t\t C/C Spacing is Valid";
         l.writeFile("Result1.BIM",k);
      }
      else
      {
          System.out.println("C/C Spacing is InValid : "+spacing+"must be>300");
          
          count2=1;
          k="\n\n\n C/C Spacing   :   "+spacing;
          k=k+"\n\n \t\t\t C/C Spacing is InValid";
         l.writeFile("Result1.BIM",k);
         
      }
     
      
        }
            
            
            
            
    
         }
            
            }
        
       
        }
        }
        nodeList3 = document.getElementsByTagName("IfcPropertySingleValue");
         k="\n\n\n\t\t-----------------------------Clear Cover Check------------------------------";
            l.writeFile("Result1.BIM",k);
        count2=0;
        System.out.println(nodeList3.getLength());
        for(int i=0;i<nodeList3.getLength();i++)
        {
            
            System.out.println(i);
            
                
            Node fstNode = nodeList3.item((int)i);
            Element fstElmnt = (Element)fstNode;
      NodeList fstNmElmntLst = fstElmnt.getElementsByTagName("Name");
        
         
            Element el = (org.w3c.dom.Element) nodeList3.item((int)i);
           
       if(el.hasAttribute("id"))
        {
            
        String d1=el.getAttribute("id");
      System.out.println(d1);
      
        if(d1.equals("i53164"))
            {  System.out.println("Rahul");
           
           
            
            Element fstNmElmnt = (Element) fstNmElmntLst.item(0);
      System.out.println(fstNmElmnt);
       fstNm = fstNmElmnt.getChildNodes();
      String d= fstNm.item(0).getNodeValue();
           System.out.println(d);
            
            System.out.println(d);
            
            
             if(d.equals("EffectiveCover"))
            {
                NodeList fstNmElmntLst2 = fstElmnt.getElementsByTagName("IfcLabel-wrapper");
                Element fstNmElmnt2 = (Element) fstNmElmntLst2.item(0);
      System.out.println(fstNmElmnt2);
       fstNm = fstNmElmnt2.getChildNodes();
      
     
                System.out.println(i);
    if (fstNode.getNodeType() == Node.ELEMENT_NODE) {
        
  
       
      
      String str=fstNm.item(0).getNodeValue();
      System.out.println(str);
      int ln=str.length();
           
            Double diameter9=Double.parseDouble(str);
     
      
             
      if(diameter9>=20 &&diameter9<=100)
      {
          System.out.println("ClearCover Spacing is Valid : "+diameter9);
         
          count2=1;
          k="\n\n\n ClearCover Spacing    :   "+diameter9;
          k=k+"\n\n \t\t\t ClearCover Spacing is Valid";
         l.writeFile("Result1.BIM",k);
      }
      else
      {
          System.out.println("ClearCover Spacing is InValid : "+diameter9+"must be>300");
          
          count1=1;
          k="\n\n\n ClearCover Spacing   :   "+diameter9;
          k=k+"\n\n \t\t\t ClearCover Spacing is InValid";
         l.writeFile("Result1.BIM",k);
         
      }
     
      
        }
            }
            }
     else   if(d1.equals("i507210"))
            {  System.out.println("Rahul");
           
           
            
            Element fstNmElmnt = (Element) fstNmElmntLst.item(0);
      System.out.println(fstNmElmnt);
       fstNm = fstNmElmnt.getChildNodes();
      String d= fstNm.item(0).getNodeValue();
           System.out.println(d);
            
            System.out.println(d);
            
            
             if(d.equals("EffectiveCover"))
            {
                NodeList fstNmElmntLst2 = fstElmnt.getElementsByTagName("IfcLabel-wrapper");
                Element fstNmElmnt2 = (Element) fstNmElmntLst2.item(0);
      System.out.println(fstNmElmnt2);
       fstNm = fstNmElmnt2.getChildNodes();
      
     
                System.out.println(i);
    if (fstNode.getNodeType() == Node.ELEMENT_NODE) {
        
  
       
      
      String str=fstNm.item(0).getNodeValue();
      System.out.println(str);
      int ln=str.length();
            
             Double diameter9=Double.parseDouble(str);
     
      
             
      if(diameter9>=20 &&diameter9<=100)
      {
          System.out.println("ClearCover Spacing is Valid : "+diameter9);
         
          count2=1;
          k="\n\n\n ClearCover Spacing    :   "+diameter9;
          k=k+"\n\n \t\t\t ClearCover Spacing is Valid";
         l.writeFile("Result1.BIM",k);
      }
      else
      {
          System.out.println("ClearCover Spacing is InValid : "+diameter9+"must be>300");
          
          count1=1;
          k="\n\n\n ClearCover Spacing   :   "+diameter9;
          k=k+"\n\n \t\t\t ClearCover Spacing is InValid";
         l.writeFile("Result1.BIM",k);
         
      }
     
      
        }
            }
            }
        if(d1.equals("i557590"))
            {  System.out.println("Rahul");
           
           
            
            Element fstNmElmnt = (Element) fstNmElmntLst.item(0);
      System.out.println(fstNmElmnt);
       fstNm = fstNmElmnt.getChildNodes();
      String d= fstNm.item(0).getNodeValue();
           System.out.println(d);
            
            System.out.println(d);
            
            
             if(d.equals("EffectiveCover"))
            {
                NodeList fstNmElmntLst2 = fstElmnt.getElementsByTagName("IfcLabel-wrapper");
                Element fstNmElmnt2 = (Element) fstNmElmntLst2.item(0);
      System.out.println(fstNmElmnt2);
       fstNm = fstNmElmnt2.getChildNodes();
      
     
                System.out.println(i);
    if (fstNode.getNodeType() == Node.ELEMENT_NODE) {
        
  
       
      
      String str=fstNm.item(0).getNodeValue();
      System.out.println(str);
      int ln=str.length();
            
             Double diameter9=Double.parseDouble(str);
     
      
             
      if(diameter9>=20 &&diameter9<=100)
      {
          System.out.println("ClearCover Spacing is Valid : "+diameter9);
         
          count2=1;
          k="\n\n\n ClearCover Spacing    :   "+diameter9;
          k=k+"\n\n \t\t\t ClearCover Spacing is Valid";
         l.writeFile("Result1.BIM",k);
      }
      else
      {
          System.out.println("ClearCover Spacing is InValid : "+diameter9+"must be>300");
          
          count1=1;
          k="\n\n\n ClearCover Spacing   :   "+diameter9;
          k=k+"\n\n \t\t\t ClearCover Spacing is InValid";
         l.writeFile("Result1.BIM",k);
         
      }
     
      
        }
            }
            }
        if(d1.equals("i607970"))
            {  System.out.println("Rahul");
           
           
            
            Element fstNmElmnt = (Element) fstNmElmntLst.item(0);
      System.out.println(fstNmElmnt);
       fstNm = fstNmElmnt.getChildNodes();
      String d= fstNm.item(0).getNodeValue();
           System.out.println(d);
            
            System.out.println(d);
            
            
             if(d.equals("EffectiveCover"))
            {
                NodeList fstNmElmntLst2 = fstElmnt.getElementsByTagName("IfcLabel-wrapper");
                Element fstNmElmnt2 = (Element) fstNmElmntLst2.item(0);
      System.out.println(fstNmElmnt2);
       fstNm = fstNmElmnt2.getChildNodes();
     
     
                System.out.println(i);
    if (fstNode.getNodeType() == Node.ELEMENT_NODE) {
        
  
       
      
      String str=fstNm.item(0).getNodeValue();
      System.out.println(str);
      int ln=str.length();
            
            Double diameter9=Double.parseDouble(str);
     
      
             
      if(diameter9>=20 &&diameter9<=100)
      {
          System.out.println("ClearCover Spacing is Valid : "+diameter9);
         
          count2=1;
          k="\n\n\n ClearCover Spacing    :   "+diameter9;
          k=k+"\n\n \t\t\t ClearCover Spacing is Valid";
         l.writeFile("Result1.BIM",k);
      }
      else
      {
          System.out.println("ClearCover Spacing is InValid : "+diameter9+"must be>300");
          
          count1=1;
          k="\n\n\n ClearCover Spacing   :   "+diameter9;
          k=k+"\n\n \t\t\t ClearCover Spacing is InValid";
         
         
      }
     
     
        }
            }
            }
        
       
        }
        }
        
        if(count==0)
        {
            JOptionPane.showMessageDialog(null,"Id not matched");

        }
        else
        {
            JOptionPane.showMessageDialog(null,"Report of Valtion is Being Created as Result1.BIM File");
            
        }
        
        }
        
}
        
        
         
         
         
         
         
        
    

    
    

