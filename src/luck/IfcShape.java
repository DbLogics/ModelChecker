/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package luck;

import java.io.File;
import java.io.FileInputStream;

/**
 *
 * @author rk nanda
 */
public class IfcShape {

    /**
     * @param args the command line arguments
     */
    
    
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
    public String Ifcshaperep(String s,String sss) throws Exception
    {
        File f=new File(sss);
	FileInputStream fis = new FileInputStream(f);
         while (fis.available() > 0) {
        current = (char) fis.read();
        
        if(current!=';')
        {
            str=str+current;
            
            continue;
        }
       
	
	else
        {
		a=str.split("#");
                if(a.length==1)
                {
                                        
                    
                    continue;
                }
                if(a.length>2)
                {
                    for(i=1;i<a.length;i++)
                    {
                        if(i==1)
                        {
                       Element=Element+a[i]; 
                        }
                        else
                        {
                            Element=Element+"#"+a[i]; 
                        }
                    }
                }
                else
                {
                    Element=a[1];
                }
                
                //System.out.println("\n"+Element+"\n");
                
                b=Element.split("=");
                
                if(b.length<=2)
                {
                id=b[0];
                text=b[1];
                }
                else
                {
                    id=b[0];
                    for(i=1;i<b.length;i++)
                    {
                       text=text+b[i]; 
                    }
                }
                //System.out.println(text);
                  
                
                c=text.split("\\(");
                if(c.length<=2)
                {
                tag=c[0];
                data=c[1].substring(0,c[1].length()-1);
                }
                else
                {
                    tag=c[0];
                    for(i=1;i<c.length;i++)
                    {
                       data=data+c[i]; 
                    }
                    data=data.substring(0,data.length()-1);
                }
                
               data=data.replace("'","");
               data=data.replace(".","");
               Id=Integer.parseInt(id);
             //System.out.println("pp");
               //System.out.println(id);
               if(tag.equalsIgnoreCase(" IFCSHAPEREPRESENTATION"))
               {
                   //System.out.println("cc");
                   //System.out.println(id);
                   
                   s=s.replace("#","");
                   s=s.replace(")","");
                   //System.out.println(s);
                   d=data.split(",");
                   
                   if(id.equalsIgnoreCase(s))
               {
                  // System.out.println("mm");
                   ref=d[3];
                   IFCEXTRUDE ifcex=new IFCEXTRUDE();
                   //System.out.println(ref);
                   String g=ifcex.IFCEXTRUDEDAREASOLID(ref,sss);
                   
                   return(g);
                   
               }
                   
                   
                  
               
                   
                   
                   
                   
                   
                   
                   
                   
                   
                   
                   
                   
                   
                   
                   
                   
                   
                   
                   
                   
                   
                   
                   
                   
                   
                   
                   
                   
                   
                   
                   
                   
                   
                   
                   
                   
               }
               //m.insertIfc(Id,tag,data);
               //m.DmlStatement();
               
               
               
               str="";
               Element="";
               text="";
               data="";
               
               
		
	}
      }
         return "";
    }
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
