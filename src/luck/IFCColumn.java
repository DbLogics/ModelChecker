/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package luck;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import static luck.IFCBeam.mini;
import static luck.Luck7.mini;

/**
 *
 * @author rk nanda
 */
public class IFCColumn {
    String a[];
    String b[];
    String c[];
    String d[];
    int i;
    String Element="";
    String id,text="";
    String str="";
    String tag;
    String data;
      char current;
         
    int Id;
    String ref;
    Iterator n;
    ResultSet rs;
    String min,max;
    static Double mini,maxi;
     Connect m=new Connect();
     
      
      
      
      
      
   
   public  IFCColumn() throws Exception
    {
        
        ////m.checkTable();
      //m.deleteTable();
       // m.createTable();
        m=new Connect();
        m.Column();
        rs=m.DqlStatement();
        if(rs.next())
        {
            min=rs.getString(2);
            max=rs.getString(3);
            mini=Double.parseDouble(min);
            maxi=Double.parseDouble(max);
        }
        
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
               
               if(tag.equalsIgnoreCase(" IFCCOLUMN"))
               {
                    d=data.split(",");
                    ref=d[6];
                   
                    IfcPro pro=new IfcPro();
                    String d=pro.IfcProduct(ref,sss);
                   
                    double depth=Double.parseDouble(d);
                    
                    IfcCheck.check(depth,mini,maxi,Id);
                    System.out.println("-----------------------------------------");
                }
               str="";
               Element="";
               text="";
               data="";	
               col.clear();
            }
        }
        IfcReport.createReport();
               
               
		
	}
      
	
    

    /**
     * @param args the command line arguments
     */
  
    
}
