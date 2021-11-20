/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Core_code;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author rk nanda
 */
public final class Splitting 
{
    static String[] e;
   
    static String firstData="",secondData="";
    static int i;
    public static Collection read(String str,char Seperator)
    {   
        firstData="";
        secondData="";
        
        str=str.replace("'","");
        
        Collection<String> f=new ArrayList<>();
        if(Seperator=='(')
        {
            e=str.split("\\"+Seperator);
        }
        else
        {
            e=str.split(""+Seperator);
        }
        
        if(e.length==1)
        {
            return f;
        }
        
        if(e.length<=2)
        {
            firstData=e[0];
            secondData=e[1];
        }
        else
        {
            firstData=e[0];
            for(i=1;i<e.length;i++)
            {
                if(i==1)
                {
                    secondData=secondData+e[i];
                }
                else
                {
                    secondData=secondData+Seperator+e[i]; //Joining of the rest of the data.
                }    
            }
        }
        
        f.add(firstData);
        f.add(secondData);
             
        return f;
    }
}
    
    

