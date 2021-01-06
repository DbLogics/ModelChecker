/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package luck;

/**
 *
 * @author rk nanda
 */
public final class IfcCheck 
{
      
    static String  status;
    public static void check(Double depth,Double mini,Double maxi,int id)throws Exception
    {
        status="";
        if(depth >=mini && depth <=maxi)
      {
          
         System.out.println("Beam's Id   :   "+id);
         System.out.println("Beam's Depth    :   "+depth);
         System.out.println("Beam's Depth is Valid");
         status="Valid";
         
      }
      else
      {
         // System.out.println("Depth is InValid : "+depth+"must be>8000 and <12000");
          
         System.out.println("Beam's Id   :   "+id);
         System.out.println("Beam's Depth    :   "+depth);
         System.out.println("Beam's Depth is Invalid");
         status="Invalid";
      }
        
      IfcDatabase.createDatabase(id,mini,maxi,depth,status);
    }
}
