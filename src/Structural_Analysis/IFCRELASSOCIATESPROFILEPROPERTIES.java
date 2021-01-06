/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Structural_Analysis;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.io.File;
import java.io.FileInputStream;
import static java.lang.Math.sqrt;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import luck.*;

/**
 *
 * @author rk nanda
 */
public class IFCRELASSOCIATESPROFILEPROPERTIES 
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
    String type="";
    String length="";
    String breadth="";
   public  IFCRELASSOCIATESPROFILEPROPERTIES() throws Exception
   {
        Connect m=new Connect();
        m.Beam();
        rs=m.DqlStatement();
        if(rs.next())
        {
            min=rs.getString(2);
            max=rs.getString(3);
            mini=Double.parseDouble(min);
            maxi=Double.parseDouble(max);
        }
         m.deleteTable();
                 m.DmlStatement();
                    m.createTable();
                     m.DmlStatement();
        
    }
    public void read(String sss)throws Exception
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
               
               if(tag.equalsIgnoreCase("IFCRELASSOCIATESPROFILEPROPERTIES"))
               {
                    d=data.split(",");
                    
                   
                  
                   //System.out.println("mm");
                  ref=d[4];
                  ref1=d[5];
                  
                   System.out.println(ref);
                                       

                   
                    IFCStructuralCurveMember is=new IFCStructuralCurveMember();
                   String l1=is.read(ref,sss);
               System.out.println("l1 : "+l1);
             
                    String b[]=l1.split("-");
                    String l2=b[0];
                    String l3=b[1];
                    String c[]=l2.split(",");
                    String dircatx=c[0];
                    String dircaty=c[1];
                    String dircatz=c[2];
                    String dir1x=c[3];
                    String dir1y=c[4];
                    String dir1z=c[5];
                    String dir2x=c[6];
                    String dir2y=c[7];
                    String dir2z=c[8];
                    
                    Double dircatx1=Double.parseDouble(dircatx);
                    Double dircaty1=Double.parseDouble(dircaty);
                    Double dircatz1=Double.parseDouble(dircatz);
                    Double dir1x1=Double.parseDouble(dir1x);
                    Double dir1y1=Double.parseDouble(dir1y);
                    Double dir1z1=Double.parseDouble(dir1z);
                    Double dir2x1=Double.parseDouble(dir2x);
                    Double dir2y1=Double.parseDouble(dir2y);
                    Double dir2z1=Double.parseDouble(dir2z);
                    
                    
                    
                    
                    
                    
                    String a[]=l3.split(",");
                    String ax=a[0];
                    String ay=a[1];
                    String az=a[2];
                    String bx=a[3];
                    String by=a[4];
                    String bz=a[5];
                    
                    Double ax1=Double.parseDouble(ax);
                    Double ay1=Double.parseDouble(ay);
                    Double az1=Double.parseDouble(az);
                    Double bx1=Double.parseDouble(bx);
                    Double by1=Double.parseDouble(by);
                    Double bz1=Double.parseDouble(bz);
                    System.out.println("Coordinates of Starting Point \n");
                    System.out.println("X-Axis : "+ax1+"\n");
                    System.out.println("Y-Axis : "+ay1+"\n");
                    System.out.println("Z-Axis : "+az1+"\n\n");
                    String start=ax1+"-"+ay1+"-"+az1;
                   
                    System.out.println("Coordinates of Ending Point \n");
                     System.out.println("X-Axis : "+bx1+"\n");
                    System.out.println("Y-Axis : "+by1+"\n");
                    System.out.println("Z-Axis : "+bz1+"\n\n");
                    String end=bx1+"-"+by1+"-"+bz1;
                    double re=Math.pow((bx1-ax1),2)+Math.pow((by1-ay1),2)+Math.pow((bz1-az1),2);
                    Double result=sqrt(re);
                    Double l=result/1000;
                    String len=""+l+"";
                    System.out.println("Span : "+len);
                    
                    System.out.println("Cartesion Points of Direction \n");
                     System.out.println("X-Axis : "+dircatx1+"\n");
                    System.out.println("Y-Axis : "+dircaty1+"\n");
                    System.out.println("Z-Axis : "+dircatz1+"\n\n");
                    
                     System.out.println("Cordinates1 of Direction \n");
                     System.out.println("X-Axis : "+dir1x1+"\n");
                    System.out.println("Y-Axis : "+dir1y1+"\n");
                    System.out.println("Z-Axis : "+dir1z1+"\n\n");
                    
                    System.out.println("Cordinates2 of Direction \n");
                     System.out.println("X-Axis : "+dir2x1+"\n");
                    System.out.println("Y-Axis : "+dir2y1+"\n");
                    System.out.println("Z-Axis : "+dir2z1+"\n\n");
                   
               
               
               
               IFCSTRUCTURALPROFILEPROPERTIES im=new IFCSTRUCTURALPROFILEPROPERTIES();
                   String g1=im.read(ref1,sss);
               System.out.println(g1);
               System.out.println(g1.charAt(0));
               
               if(g1.charAt(0)=='c')
               {
                   type="Column";
                   System.out.println(type);
                   String n=g1.substring(1);
                   String n1[]=n.split("x");
                   length=n1[0];
                   breadth=n1[1];
                   System.out.println("length   :   "+length);
                   System.out.println("breadth   :   "+breadth);
                   
               }
               else
               {
                   type="Beam";
                    String n1[]=g1.split("x");
                   length=n1[0];
                   breadth=n1[1];
               }
               
               
                    String id=""+Id+"";
                    ref=ref.replace("#","");
                     ref=ref.replace("(","");
                      ref=ref.replace(")","");
                      ref1=ref1.replace("#","");
                     ref1=ref1.replace("(","");
                      ref1=ref1.replace(")","");
                      System.out.println("Start : "+start);
                      System.out.println("End : "+end);
                      String query;
                    Connect m=new Connect();
                    Double bre=Double.parseDouble(length);
                    Double dep=Double.parseDouble(breadth);
                    Double mo=bre*Math.pow(dep,3);
                    Double moi=mo/12;
                    Double deflection;
                  
                 
                 
                 
                 
                 
                   long ll = (new Double(moi)).longValue();
                    System.out.println("Moment of Inertia : "+ll);
                    String moin=""+ll+"";
                    long rs=(new Double(ll/l)).longValue();
                    System.out.println("Relative Stifness : "+rs);
                    m.insertTable(id,ref,type,ref1,length,breadth,start,end,len,moin);
                    m.DmlStatement();
                   
               
                }
               str="";
               Element="";
               text="";
               data="";	
               col.clear();
            }
        }
        
    }
  void drawLines(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
 
        g2d.drawLine(120, 50, 360, 50);
 
        g2d.draw(new Line2D.Double(59.2d, 99.8d, 419.1d, 99.8d));
 
        g2d.draw(new Line2D.Float(21.50f, 132.50f, 459.50f, 132.50f));
 
    }
    
    
}

