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
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;
import javax.swing.JOptionPane;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import sun.rmi.runtime.Log;

public class Luck9 {
    ResultSet rs;
    String min,max;
    static Double mini,maxi;
  public Luck9()throws Exception
   {
       Connect c=new Connect();
        c.Wall();
        rs=c.DqlStatement();
        if(rs.next())
        {
            min=rs.getString(2);
            max=rs.getString(3);
            mini=Double.parseDouble(min);
            maxi=Double.parseDouble(max);
        }
   }
   
  public void read(String s,String ss) throws Exception
        {
            String k;
        NodeList fstNm;
         NodeList fstNmElmntLst;
         Element el;
         Collection<String> a=new ArrayList<>();
   Collection<String> b=new ArrayList<>();
   Collection<String> c=new ArrayList<>();
   String gid;
          
        //l.readFile("rectangular tank.ifcxml");
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        
        Document document = db.parse(new File(s));
        

        NodeList nodeList = document.getElementsByTagName("IfcWallStandardCase");
          k="|---------------------------------------------------------------|\n|                                                               |\n|                                                               |\n|                            SCRUTINIZER                        | ";
            writeFile(ss,k);
           
k="|                                                               |\n|                                                               |\n|                                                               |\n|-----------------------Depth Validation------------------------| ";
         writeFile(ss,k);
        int count=0;
        for(int i=0;i<nodeList.getLength();i++)
        {
            
            //System.out.println(i);
            //System.out.println(nodeList.item(i).getNodeValue());     
            Node fstNode = nodeList.item((int)i);
            Element fstElmnt = (Element) fstNode;
            gid=fstElmnt.getAttribute("id");
            //System.out.println("Gid : "+gid);
            fstNmElmntLst = fstElmnt.getElementsByTagName("IfcProductDefinitionShape");
        
           // nodeList.item((int)i).getAttributes().getNamedItem("id").isSupported(null, null);
            el = (Element)nodeList.item((int)i);
            //System.out.println(el.toString());
      if(el.hasAttribute("id"))
      {
            //System.out.println(el);
         Element IfcDefShape = (Element)fstNmElmntLst.item(0);
         //System.out.println(IfcDefShape);
         if(IfcDefShape.hasAttribute("ref"))
         {
             
            //String nodeValue = nodeList.item((int)i).getAttributes().getNamedItem("id").getNodeValue();
            String IfcDefShapes=IfcDefShape.getAttribute("ref");
            
           // System.out.println("Reference of ifcproduct defination : "+IfcDefShapes);
            if(a.size()==0)
            {
              a.add(IfcDefShapes);
            }
            else
            {
                Boolean m=a.contains(IfcDefShapes);
                if(m==false)
                {
                     a.add(IfcDefShapes);
                }
                else if(m==true)
                {
                    continue;
                }
            }
            //System.out.println("Ref : "+IfcDefShapes);
            NodeList IfcProductDef = document.getElementsByTagName("IfcProductDefinitionShape");
             
            for(int j=0;j<IfcProductDef.getLength();)
        {
                //System.out.println(IfcProductDef.getLength());
                el = (Element)IfcProductDef.item(j);
                if(el.hasAttribute("id"))
                {
                    
                String IfcProductDefi=el.getAttribute("id");
                //System.out.println("Id : "+IfcProductDefi+" Ref : "+IfcDefShapes);
               
                if(IfcDefShapes.equals(IfcProductDefi))
                {
                    //System.out.println("RK");
                    
                    Node IfcDefS = IfcProductDef.item(j);
                    Element IfcDefSh = (Element) IfcDefS;
                    fstNmElmntLst = IfcDefSh.getElementsByTagName("IfcShapeRepresentation");
                    el = (Element)fstNmElmntLst.item(0);
                    //System.out.println(el);
                    if(el.hasAttribute("ref"))
                    {
                       
                        String IfcShapeRep=el.getAttribute("ref");
                        //System.out.println("Reference of ifcshape Representaion : "+IfcShapeRep);
                        if(b.size()==0)
                        {
                            b.add(IfcShapeRep);
                        }
                        else
                        {
                            Boolean m=b.contains(IfcShapeRep);
                            if(m==false)
                            {
                                b.add(IfcShapeRep);
                            }
                            else if(m==true)
                            {
                                continue;
                            }
                        }
                        //System.out.println(IfcShapeRep);
                        NodeList IfcShapeRepresentation = document.getElementsByTagName("IfcShapeRepresentation");
                        el = (Element)IfcShapeRepresentation.item(0);
                        for(int z=0;z<IfcShapeRepresentation.getLength();z++)
                        {
                            // System.out.println("HAHAHAHA");
                            el = (Element)IfcShapeRepresentation.item((int)z);
                            if(el.hasAttribute("id"))
                            {
                               
                            
                            String IfcShapeRepre=el.getAttribute("id");
                            
                            //System.out.println(IfcDefShapes+"mmmmm");
                             //System.out.println("Id : "+IfcShapeRepre+" Ref : "+IfcShapeRep);
                            if(IfcShapeRepre.equals(IfcShapeRep))
                            {
                                //System.out.println("KKKKKKKK");
                                Node IfcRep = IfcShapeRepresentation.item(z);
                                Element IfcRepre = (Element) IfcRep;
                                fstNmElmntLst = IfcRepre.getElementsByTagName("IfcExtrudedAreaSolid");
                                el = (Element)fstNmElmntLst.item(0);
                                
                                
                                
                                if(el.hasAttribute("ref"))
                                {
                                    String IfcExtrudedArea=el.getAttribute("ref");
                                    //System.out.println("Reference of IfcExtrudedArea : "+IfcExtrudedArea);
                                    
                                   if(c.size()==0)
            {
              c.add(IfcExtrudedArea);
            }
            else
            {
                Boolean m=c.contains(IfcExtrudedArea);
                if(m==false)
                {
                     c.add(IfcExtrudedArea);
                }
                else if(m==true)
                {
                    continue;
                }
            }
                                    //System.out.println(IfcExtrudedArea);
                                    NodeList IfcExtrudedAreaSolid = document.getElementsByTagName("IfcExtrudedAreaSolid");
                                    el = (Element)IfcExtrudedAreaSolid.item(0);
                                    for(int y=0;y<IfcExtrudedAreaSolid.getLength();)
                                    {
                                        el = (Element)IfcExtrudedAreaSolid.item((int)y);
                                        if(el.hasAttribute("id"))
                                        {
                                            
                                        
                                        String IfcExtrude=el.getAttribute("id");
                                        //System.out.println(IfcExtrude);
                                        if(IfcExtrude.equals(IfcExtrudedArea))
                                        {
                                             fstNode = IfcExtrudedAreaSolid.item(y);
             fstElmnt = (Element) fstNode;
                                            fstNmElmntLst = fstElmnt.getElementsByTagName("Depth");
                                           //  System.out.println(fstNmElmntLst);
                                            Element fstNmElmnt = (Element) fstNmElmntLst.item(0);
      //System.out.println(fstNmElmnt);
       fstNm = fstNmElmnt.getChildNodes();
      //System.out.println(fstNm.item(0).getNodeValue());
      String str=fstNm.item(0).getNodeValue().toString();
      //System.out.println(str);
       int ln=str.length();
            String str1= str.substring(0,ln-1);
             double depth=Double.parseDouble(str1);
     
      
      if(depth>=mini && depth<=maxi)
      {
          //System.out.println("Depth is Valid : "+depth);
         
          k="|---------------------------------------------------------------|\n|  WallStandCase's Id      :   "+gid+"                                     | ";
          k=k+"|                    								    | \n|                    								    | \n|                    								    | \n|  WallStandCase's Depth   :   "+depth+"                                      | ";
          k=k+"|                    								    | \n|                    								    | \n| \t\t\t WallStandCase's Depth is Valid                          | ";
         writeFile(ss,k);
         
      }
      else
      {
         // System.out.println("Depth is InValid : "+depth+"must be>8000 and <12000");
          
            k="|---------------------------------------------------------------|\n|  WallStandCase's Id      :   "+gid+"                                     | ";
          k=k+"|                    								    | \n|                    								    | \n|                    								    | \n|  WallStandCase's Depth     :   "+depth+"                                        | ";
        k=k+"|                    								    | \n|                    								    | \n| \t\t\t WallStandCase's Depth is InValid                        | ";
        writeFile(ss,k);
         
      }            
      //System.out.println("Scrutinizer");
      break;
                                         
                                            
                                        }
                                        else
                                        {
                                            y++;
                                        }
                                       
                                    }
                                        else
                                        {
                                            y++;
                                        }
                                    }
                                   
                                }
                                
                            }
                            else
                            {
                                continue;
                            }
                           
                        }   
                    }
                   
                    
                   
    }
                    break;
        }
                else
                {
                    j++;
                }
                
        }
                else
                {
                    j++;
                }
    }
}
      }     
}
        k="|---------------------------------------------------------------|";
       writeFile(ss,k);
        
        System.out.println("Report of Validation is Being Created as MAinWall.BIM File");
        }
  
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
    
}