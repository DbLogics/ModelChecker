/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Structural_Analysis;

import luck.*;
import java.io.File;
import java.io.FileInputStream;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 *
 * @author rk nanda
 */
public class IFCTopologyRepresentation
{
    
   
    String Element="";
    String id,text="";
    String str="";
    String tag;
    String data;
    String[] d;
    char current;
    int Id;
    String ref,ref1,ref2;
    Iterator n;
    ResultSet rs;
    String min,max;
    static Double mini,maxi;
    Connect m;
   
    public String read(String str1,String sss)throws Exception
    {
        Collection<String> col=new ArrayList<>();
        File f=new File(sss);
	FileInputStream fis = new FileInputStream(f);
    
        while (fis.available() > 0) 
        {
            current = (char) fis.read();
        
            if(current!=';')
            {
                str=str+current;
                continue;
            }
  
            else
            {       
                col=Splitting.read(str,'#');
                if(col.isEmpty())
                {
                    str="";
                    continue;
                }
                n=col.iterator();
                
                if(n.hasNext())
                {
                    String s=n.next().toString();
                    Element=n.next().toString();
                }
                          
                col=Splitting.read(Element,'=');
                
                n=col.iterator();
                
                if(n.hasNext())
                {
                    id=n.next().toString();
                    text=n.next().toString();
                }
                             
                col=Splitting.read(text,'(');
                n=col.iterator();
                if(n.hasNext())
                {
                    tag=n.next().toString();
                    data=n.next().toString();
                }
                
               
              
                Id=Integer.parseInt(id);
               
               if(tag.equalsIgnoreCase("IFCTOPOLOGYREPRESENTATION"))
               {
                    d=data.split(",");
                    
                    str1=str1.replace("#","");
                   if(id.equalsIgnoreCase(str1))
               {
                   //System.out.println("mm");
                  ref=d[3];
                  ref=ref.substring(1,ref.length()-2);
                  System.out.println(ref);
                  ref1=d[0];
                   //System.out.println(ref);
                   
                   
                    IFCEdge is=new IFCEdge();
                   String g1=is.read(ref,sss);
                   
                  
                   
                   IFCGeometricRepresentationContext ig=new IFCGeometricRepresentationContext();
                   String g2=ig.read(ref1,sss);
                   //System.out.println("g2 :"+g2);
                   
               String g=g2+"-"+g1;
               System.out.println("g :"+g);
                   return(g);
               }
                }
               str="";
               Element="";
               text="";
               data="";	
               col.clear();
            }
        }
        return "";
    }
  
    
    
}

