/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import java.sql.ResultSet;

/**
 *
 * @author DataByte_Logics
 */
public class Start {
    Connect c =new Connect();
    ResultSet rs;
    int flag=0;
    public Start() throws Exception{
/*
        c.getLoginTableUserAll();
        rs=c.DqlStatement();
        
                while(rs.next()){
                if("login".equals(rs.getString("Tables_in_scrutinizer"))){
                    flag=1;
                    break;                    
                }
                }
                if(flag==0)
                {
                     Register r=new Register();
                     r.createTable();
                     r.setVisible(true);
                     r.setLocationRelativeTo(null);
            
                }
                else
                {
                    Login l=new Login();
                    l.setVisible(true);
                    l.setLocationRelativeTo(null);
                }*/

                    Login l=new Login();
                    l.setVisible(true);
                    l.setLocationRelativeTo(null);
    }
    public static void main(String as[]) throws Exception
    {
     Start s=new Start();
   try {
        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
            if ("Windows".equals(info.getName())) {
                javax.swing.UIManager.setLookAndFeel(info.getClassName());
                break;
            }
        }
    }catch(Exception e){
        
    }
    }
}
