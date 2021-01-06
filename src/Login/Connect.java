/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Login;

/**
 *
 * @author rk nanda
 */
import luck.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime; 
public  final class Connect  {

    /**
     * @param args the command line arguments
     */
    private static  String driver;
    private static Connection con;
    private static String url;
    private static  String user;
    private static  String pass;
    private static String query;
    int r;
    public Connect()
    {
           
        //url="jdbc:mysql://localhost:3306/scrutinizer";
        //user="root";
        //pass = "root";
        //driver ="com.mysql.jdbc.Driver";
        
        url="jdbc:sqlserver://DESKTOP-0T46ETS; databaseName=scrutinizer; user=xicom; password=Asd_12345";
        //user="xicom";
        //pass = "Asd_12345";
        driver ="com.microsoft.sqlserver.jdbc.SQLServerDriver";
        query="";
    
        try
        {
            System.out.println("Finding Class");
            
            Class.forName(driver);
              System.out.println("Class Found");
            //con=DriverManager.getConnection(url,user,pass);
            con=DriverManager.getConnection(url);
            System.out.println("Connection Establised");
            System.out.println("-----------------------------------------");
            System.out.println("---------------Scrutinizer---------------");
        }
        catch(Exception ex)
        {
         System.out.println("Connection Not Establised : "+ex.getLocalizedMessage());
        }
        
    }
   
    public void insertIfc(int Id,String Element,String Data)
    {
        
        query="insert into IFC(Id,Element,Data) values("+Id+",'"+Element+"','"+Data+"')";
    }
    
    public void Column()
    {
        query="select * from validation where Element='Column'";
    }
    
    public void Beam()
    {
        query="select * from validation where Element='Beam'";
    }
    
    public void Wall()
    {
        query="select * from validation where Element='Wall'";
    }
    
    public void Slab()
    {
        query="select * from validation where Element='Slab'";
    }
    
    public void deleteDatabase()
    {
        query="drop table IF EXISTS result";
    }
    
    public void createDatabase()
    {
        query="create table result(Id Integer,Minimun varchar(100),Maximum varchar(100),Depth varchar(100),Status varchar(100))";
    }
    
    public void insertDatabse(int id,double mini,double maxi,double depth,String status)
    {
        String d=""+depth+"";
        query="insert into result values("+id+",'"+mini+"','"+maxi+"','"+d+"','"+status+"')";
    }
    
    public void createReport()
    {
        query="Select * from result INTO OUTFILE 'E:/Validation Report/ValidationReport.csv' FIELDS ENCLOSED BY '|'  ESCAPED BY '|' LINES TERMINATED BY '\r\n'";
    }
    
    public void getReport()
    {
        query="Select * from IF EXISTS result";
    }
    
     public  ResultSet DqlStatement()throws Exception
    {
        try
        {
        System.out.println(query);
      
        PreparedStatement ps=con.prepareStatement(query);
        System.out.println("ps"+ps);
        ResultSet rs=ps.executeQuery();
        System.out.println(rs);
        return rs;
        }
        catch(Exception ex)
        {
            System.out.println("Exception : "+ex.getLocalizedMessage());
            return null;
        }
    }
     public  int DmlStatement()throws Exception
    {
        PreparedStatement ps=con.prepareStatement(query);
        int rs=ps.executeUpdate();
        return rs;
    }
     public void createLoginTable()
     {
         query="create table login(user varchar(100),password varchar(100))";
     }
     public void insertLoginTable(String user,String password)
     {
         String time=LocalDateTime.now().toLocalDate().toString();
         query="insert into userinfo(Username,Password,createdat,IsDeleted) values('"+user+"','"+password+"',"+time+",0)";
     }
     public void getLoginTableUser(String user)
     {
         query="select * from userinfo where Username='"+user+"'";
     }
      public void getLoginTableUserAll()
     {
         query="Show tables";
         System.out.println(query);
     }
   
    
}
