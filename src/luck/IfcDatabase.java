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
public final class IfcDatabase 
{   
     static int i=1;
    public static void createDatabase(int id,Double mini,Double maxi,double depth,String status)throws Exception
    {
        Connect c=new Connect();
        if(i==1)
        {
        c.deleteDatabase();
        c.DmlStatement();
        c.createDatabase();
        c.DmlStatement();
        i++; 
        }
        c.insertDatabse(id,mini,maxi,depth,status);
        c.DmlStatement();
        
        
        
    }
}
