/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package luck;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.sql.ResultSet;

/**
 *
 * @author rk nanda
 */
public class IfcReport 
{
    static String k;
    static ResultSet rs;
    public static void createReport()throws Exception
    {
        Connect c=new Connect();
        c.createReport();
        c.DqlStatement();
        k="|---------------------------------------------------------------|\n|                                                               |\n|                                                               |\n|                            SCRUTINIZER                        | ";
            writeFile("IfcReport.BIM",k);
k="|                                                               |\n|                                                               |\n|                                                               |\n|-----------------------Depth Validation------------------------| ";
           writeFile("IfcReport.BIM",k);
        c.getReport();
        rs=c.DqlStatement();
        while(rs.next())
        {
            String status=rs.getString("status");
            if(status.equalsIgnoreCase("Valid"))
            {
                k="|---------------------------------------------------------------|\n|       Id      :   "+rs.getString("id")+"                                     | ";
          k=k+"|                    								    | \n|                    								    | \n|                    								    | \n|   Depth   :   "+rs.getString("depth")+"                                      | ";
          k=k+"|                    								    | \n|                    								    | \n| \t\t\t  Depth is Valid                          | ";
         writeFile("IfcReport.BIM",k);
            }
            else if(status.equalsIgnoreCase("invalid"))
            {
                k="|---------------------------------------------------------------|\n|   Id      :   "+rs.getString("id")+"                                     | ";
          k=k+"|                    								    | \n|                    								    | \n|                    								    | \n|   Depth     :   "+rs.getString("depth")+"                                        | ";
        k=k+"|                    								    | \n|                    								    | \n| \t\t\t  Depth is InValid                        | ";
         writeFile("IfcReport.BIM",k);
            }
        }
        
        
        
        
    }
    
    
	public static void writeFile(String n,String k)throws Exception
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
