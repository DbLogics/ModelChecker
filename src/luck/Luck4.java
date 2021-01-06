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

public class Luck4 {
   
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
        Luck4 l=new Luck4();
        String k;
        NodeList fstNm;
         NodeList fstNmElmntLst;
         Element el;
          int[] a=new int[100];
    int[] b=new int[100];
    int[] c=new int[100];
    int ainc=0,binc=0,cinc=0;
    int aloop,bloop,cloop;
    int aflag=0,bflag=0,cflag=0;
    String aval,bval,cval;
        //l.readFile("rectangular tank.ifcxml");
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        
        Document document = db.parse(new File("MainTank.ifcxml"));
        

        NodeList nodeList = document.getElementsByTagName("IfcBeam");
         
        int count=0;
        for(int i=0;i<nodeList.getLength();i++)
        {
            
            System.out.println(i);
            //System.out.println(nodeList.item(i).getNodeValue());     
            Node fstNode = nodeList.item((int)i);
            Element fstElmnt = (Element) fstNode;
            fstNmElmntLst = fstElmnt.getElementsByTagName("IfcProductDefinitionShape");
        
           // nodeList.item((int)i).getAttributes().getNamedItem("id").isSupported(null, null);
            el = (Element)nodeList.item((int)i);
            System.out.println(el.toString());
      if(el.hasAttribute("id"))
      {
            System.out.println(el);
         Element IfcDefShape = (Element)fstNmElmntLst.item(0);
         System.out.println(IfcDefShape);
         if(IfcDefShape.hasAttribute("ref"))
         {
             
            //String nodeValue = nodeList.item((int)i).getAttributes().getNamedItem("id").getNodeValue();
            String IfcDefShapes=IfcDefShape.getAttribute("ref");
            aval=IfcDefShapes.substring(1,IfcDefShapes.length());
            System.out.println(aval);
            System.out.println(a.length);
            if(a.length==0)
            {
              a[ainc]=Integer.parseInt(aval);  
              ainc=ainc++;
            }
            else
            {
             for(aloop=0;aloop<ainc;aloop++)  
             {
                 if(Integer.parseInt(aval)==a[aloop])
                 {
                     aflag=1;
                 }
             }
             if(aflag==1)
             {
               break;  
             }
             else
             {
                 a[ainc]=Integer.parseInt(aval);  
              ainc=ainc++;
             }
            }
            System.out.println("Ref : "+IfcDefShapes);
            NodeList IfcProductDef = document.getElementsByTagName("IfcProductDefinitionShape");
             
            for(int j=0;j<IfcProductDef.getLength();j++)
        {
                System.out.println(IfcProductDef.getLength());
                el = (Element)IfcProductDef.item(j);
                if(el.hasAttribute("id"))
                {
                    
                String IfcProductDefi=el.getAttribute("id");
                System.out.println("Id : "+IfcProductDefi+" Ref : "+IfcDefShapes);
               
                if(IfcDefShapes.equals(IfcProductDefi))
                {
                    System.out.println("RK");
                    
                    Node IfcDefS = IfcProductDef.item(0);
                    Element IfcDefSh = (Element) IfcDefS;
                    fstNmElmntLst = IfcDefSh.getElementsByTagName("IfcShapeRepresentation");
                    el = (Element)fstNmElmntLst.item(0);
                    System.out.println(el);
                    if(el.hasAttribute("ref"))
                    {
                       
                        String IfcShapeRep=el.getAttribute("ref");
                        bval=IfcShapeRep.substring(1,IfcShapeRep.length());
                        if(b.length==0)
            {
              b[binc]=Integer.parseInt(bval);  
              binc=binc++;
            }
            else
            {
             for(bloop=0;bloop<binc;bloop++)  
             {
                 if(Integer.parseInt(bval)==b[bloop])
                 {
                     bflag=1;
                 }
             }
             if(bflag==1)
             {
               break;  
             }
             else
             {
                 b[binc]=Integer.parseInt(bval);  
              binc=binc++;
             }
            }
                        System.out.println(IfcShapeRep);
                        NodeList IfcShapeRepresentation = document.getElementsByTagName("IfcShapeRepresentation");
                        el = (Element)IfcShapeRepresentation.item(0);
                        for(int z=0;z<IfcShapeRepresentation.getLength();z++)
                        {
                             System.out.println("HAHAHAHA");
                            el = (Element)IfcShapeRepresentation.item(0);
                            if(el.hasAttribute("id")==false)
                            {
                                break;
                            }
                            String IfcShapeRepre=el.getAttribute("id");
                            
                            System.out.println(IfcDefShapes+"mmmmm");
                             System.out.println("Id : "+IfcShapeRepre+" Ref : "+IfcShapeRep);
                            if(IfcShapeRepre.equals(IfcShapeRep))
                            {
                                System.out.println("KKKKKKKK");
                                Node IfcRep = IfcShapeRepresentation.item(0);
                                Element IfcRepre = (Element) IfcRep;
                                fstNmElmntLst = IfcRepre.getElementsByTagName("IfcExtrudedAreaSolid");
                                el = (Element)fstNmElmntLst.item(0);
                                if(el.hasAttribute("ref"))
                                {
                                    String IfcExtrudedArea=el.getAttribute("ref");
                                    cval=IfcExtrudedArea.substring(1,IfcExtrudedArea.length());
                                    if(c.length==0)
            {
              c[cinc]=Integer.parseInt(cval);  
              cinc=cinc++;
            }
            else
            {
             for(cloop=0;cloop<cinc;cloop++)  
             {
                 if(Integer.parseInt(cval)==c[cloop])
                 {
                     cflag=1;
                 }
             }
             if(cflag==1)
             {
               break;  
             }
             else
             {
                 c[cinc]=Integer.parseInt(cval);  
              cinc=cinc++;
             }
            }
                                    System.out.println(IfcExtrudedArea);
                                    NodeList IfcExtrudedAreaSolid = document.getElementsByTagName("IfcExtrudedAreaSolid");
                                    el = (Element)IfcExtrudedAreaSolid.item(0);
                                    for(int y=0;y<IfcExtrudedAreaSolid.getLength();y++)
                                    {
                                        el = (Element)IfcExtrudedAreaSolid.item(0);
                                        if(el.hasAttribute("id")==false)
                                        {
                                            break;
                                        }
                                        String IfcExtrude=el.getAttribute("id");
                                        System.out.println(IfcExtrude);
                                        if(IfcExtrude.equals(IfcExtrudedArea))
                                        {
                                             fstNode = IfcExtrudedAreaSolid.item(0);
             fstElmnt = (Element) fstNode;
                                            fstNmElmntLst = fstElmnt.getElementsByTagName("Depth");
                                             System.out.println(fstNmElmntLst);
                                            Element fstNmElmnt = (Element) fstNmElmntLst.item(0);
      System.out.println(fstNmElmnt);
       fstNm = fstNmElmnt.getChildNodes();
      System.out.println(fstNm.item(0).getNodeValue());
      String str=fstNm.item(0).getNodeValue().toString();
      System.out.println(str);
                                         
                                            
                                        }
                                    }
                                }
                                
                            }
                        }   } else {
                    }
    }
        }
        }
    }
}
}
    }
}