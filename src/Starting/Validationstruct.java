/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Starting;

import Structural_Analysis.Connect;
import Structural_Analysis.start;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import static java.lang.Math.sqrt;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableColumn;


public class Validationstruct extends javax.swing.JInternalFrame {

    /**
     * Creates new form Validationstruct
     */
    String Path="";
    ResultSet rs;
    ResultSetMetaData mt;
    String Status;
    Double Load,Length,Elasticity_Measure,Moment_of_Inertia,Calculated_Deflection,Numerator,Denominator,Emperical_Deflection,Theoretical_Deflection,Min_Deflection;
    Double depth,breadth,Effective_Length,Least_Radius_of_Gyration,Area,Expected_Slenderness_Ratio,Calculated_Slenderness_Ratio;
    String Type;
    public Validationstruct(String s) {
        initComponents();
        getContentPane().setBackground(new Color(197,226,252));
        System.out.println("Path : "+s);
        Path=s;
        Elasticity_Measure=22300.00;
        Emperical_Deflection=20.00;
        try
        {
        Connect c=new Connect();
        c.deleteTableDeflection();
        c.DmlStatement();
        c.createTableDeflection();
        c.DmlStatement();
        c.deleteTableSelenderness();
        c.DmlStatement();
        c.createTableSelenderness();
        c.DmlStatement();
        }
        catch(Exception ex)
        {
            
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        validationlabel = new javax.swing.JLabel();
        selectvalidation = new javax.swing.JComboBox();
        validatebutton = new javax.swing.JButton();
        btnexit1 = new javax.swing.JButton();
        status = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Validation");

        validationlabel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        validationlabel.setText("Select Validation");

        selectvalidation.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        selectvalidation.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Any Check", "Load Applied and Moment of Inertia", "Deflection on Beams", "Selenderness Ratio" }));
        selectvalidation.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                selectvalidationItemStateChanged(evt);
            }
        });

        validatebutton.setBackground(new java.awt.Color(102, 102, 102));
        validatebutton.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        validatebutton.setForeground(new java.awt.Color(0, 51, 204));
        validatebutton.setText("Validate");
        validatebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validatebuttonActionPerformed(evt);
            }
        });

        btnexit1.setBackground(new java.awt.Color(102, 102, 102));
        btnexit1.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        btnexit1.setForeground(new java.awt.Color(0, 51, 204));
        btnexit1.setText("Exit");
        btnexit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexit1ActionPerformed(evt);
            }
        });

        status.setFont(new java.awt.Font("Mongolian Baiti", 0, 14)); // NOI18N
        status.setText("Status : Check Not Selected");
        status.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(status, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(validationlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(selectvalidation, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(validatebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                                .addComponent(btnexit1)
                                .addGap(38, 38, 38)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(validationlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectvalidation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(validatebutton)
                    .addComponent(btnexit1))
                .addGap(25, 25, 25)
                .addComponent(status)
                .addContainerGap(194, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void selectvalidationItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_selectvalidationItemStateChanged
        if(selectvalidation.getSelectedIndex()==0)
        {
            status.setText("Status : Check not Selected");
        }
        else
        {
            status.setText("Status : Processing . . . . Please Wait");
        }
    }//GEN-LAST:event_selectvalidationItemStateChanged

    private void validatebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validatebuttonActionPerformed
        validatebutton.setEnabled(false);
        if(selectvalidation.getSelectedIndex()==1)
        {
            try {
                //System.out.println(selectedFile.getAbsolutePath());
                start s=new start();
                
                s.read(Path);
                status.setText("Status: Check Performed");
            } catch (Exception ex) {
                Logger.getLogger(MainWindowIfc.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        
        

            JTable tab;
        JScrollPane sp;
        Vector content = new Vector();
        Vector header = new Vector();

        JPanel p1;
        JLabel l1;
        p1 = new JPanel();
        p1.setBounds(0,150,500,500);
        p1.setLayout(null);
        p1.setBackground(Color.LIGHT_GRAY);
        p1.setSize(800,400);
        l1 = new JLabel("Records Fetched");
        l1.setBounds(300,10, 200, 20);
        l1.setFont(new Font("Comic Sans Ms",Font.BOLD,14));
        //l1.setForeground(Color.WHITE);
        p1.add(l1);
        Connect c=new Connect();
        c.getReports();
        try {
            rs=c.DqlStatement();
            mt=rs.getMetaData();

            int count = mt.getColumnCount();
            for (int i = 1; i <= count; i++)
            {
                header.addElement(mt.getColumnName(i));
            }
            while (rs.next())
            {
                Vector row = new Vector(count);
                for (int i = 1; i <= count; i++)
                {
                    row.addElement(rs.getObject(i));
                }
                content.addElement(row);
            }

            tab = new JTable(content,header);
            tab.setBackground(Color.BLUE);
            tab.setColumnSelectionAllowed(false);
            tab.setAutoscrolls(true);
            tab.setGridColor(Color.BLUE);
            tab.setFont(new Font("Monotype Corsiva", Font.PLAIN,12));
            tab.setForeground(Color.WHITE);

            tab.setCursor(Cursor.getSystemCustomCursor("TEXT_CURSOR"));
            tab.enable(false);
            TableColumn col;
            for (int i = 0; i < tab.getColumnCount(); i++)
            {
                col = tab.getColumnModel().getColumn(i);
                col.sizeWidthToFit();

            }
            sp = new JScrollPane(tab);

            sp.setBounds(0,50,780,170);

            sp.setAutoscrolls(true);
            sp.setVisible(true);
            p1.add(sp);
            this.add(p1);
            p1.setBackground(new Color(204,204,204));
            this.setVisible(true);
        }
        catch(Exception ex)
        {

        }
        }
        else if(selectvalidation.getSelectedIndex()==2)
        {
             Connect c=new Connect();
        c.getReportss();
        try
        {
            
            rs=c.DqlStatement();
            Connect cc=new Connect();
            while(rs.next())
            {
                Length=rs.getDouble("length")*1000;
                Load=rs.getDouble("Loads")*1000*(-1);
                Moment_of_Inertia=rs.getDouble("MOI");
                Numerator=Load*Length*Length*Length;
                Denominator=48*Elasticity_Measure*Moment_of_Inertia;
                Calculated_Deflection=Numerator/Denominator;
                
                Theoretical_Deflection=Length/350;
                
                if(Theoretical_Deflection<Emperical_Deflection)
                {
                    Min_Deflection=Theoretical_Deflection;
                }
                else
                {
                    Min_Deflection=Emperical_Deflection;
                }
                if(Calculated_Deflection<Min_Deflection)
                {
                    Status="Valid";
                }
                else
                {
                    Status="Invalid";
                }
               cc.insertTableDeflection(rs.getString("Curvemember"), Calculated_Deflection, Min_Deflection, Status);
               cc.DmlStatement();
            }
            
            Connect ccc=new Connect();
            ccc.getReportsDeflection();
            
            try {
                JTable tab;
        JScrollPane sp;
        Vector content = new Vector();
        Vector header = new Vector();

        JPanel p1;
        JLabel l1;
        p1 = new JPanel();
        p1.setBounds(0,150,500,500);
        p1.setLayout(null);
        p1.setBackground(Color.LIGHT_GRAY);
        p1.setSize(800,400);
        l1 = new JLabel("Validation Summary");
        l1.setBounds(300,10, 200, 20);
        l1.setFont(new Font("Comic Sans Ms",Font.BOLD,14));
        //l1.setForeground(Color.WHITE);
        p1.add(l1);
            rs=ccc.DqlStatement();
            mt=rs.getMetaData();

            int count = mt.getColumnCount();
            for (int i = 1; i <= count; i++)
            {
                header.addElement(mt.getColumnName(i));
            }
            while (rs.next())
            {
                Vector row = new Vector(count);
                for (int i = 1; i <= count; i++)
                {
                    row.addElement(rs.getObject(i));
                }
                content.addElement(row);
            }

            tab = new JTable(content,header);
            tab.setBackground(Color.BLUE);
            tab.setColumnSelectionAllowed(false);
            tab.setAutoscrolls(true);
            tab.setGridColor(Color.BLUE);
            tab.setFont(new Font("Monotype Corsiva", Font.PLAIN,12));
            tab.setForeground(Color.WHITE);

            tab.setCursor(Cursor.getSystemCustomCursor("TEXT_CURSOR"));
            tab.enable(false);
            TableColumn col;
            for (int i = 0; i < tab.getColumnCount(); i++)
            {
                col = tab.getColumnModel().getColumn(i);
                col.sizeWidthToFit();

            }
            sp = new JScrollPane(tab);

            sp.setBounds(0,50,780,170);

            sp.setAutoscrolls(true);
            sp.setVisible(true);
            p1.add(sp);
            this.add(p1);
            p1.setBackground(new Color(204,204,204));
            this.setVisible(true);
        }
        catch(Exception ex)
        {

        }
            
        }
        catch(Exception ex)
        {
        }
      }
        else if(selectvalidation.getSelectedIndex()==3)
        {
             Connect c=new Connect();
        c.getReportsss();
        
        try
        {
            
            rs=c.DqlStatement();
            Connect cc=new Connect();
            while(rs.next())
            {
                Length=rs.getDouble("length")*1000;
                //Load=rs.getDouble("Loads")*1000*(-1);
                Moment_of_Inertia=rs.getDouble("MOI");
                breadth=rs.getDouble("breadth");
                depth=rs.getDouble("depth");
               if(breadth>depth)
               {
                   Effective_Length=depth;
               }
               else
               {
                   Effective_Length=breadth;
               }
               
                
               
                Calculated_Slenderness_Ratio=Length/Effective_Length;
                
                if(Calculated_Slenderness_Ratio<12)
                {
                    Type="Short Column";
                }
                else
                {
                    Type="Long Column";
                }
                if(Calculated_Slenderness_Ratio<60)
                        {
                          Status="Selenderness Ratio is Ok" ;
                        }
                cc.insertTableSelenderness(rs.getString("Curvemember"), Calculated_Slenderness_Ratio,12.00,Type, Status);
               cc.DmlStatement();
            }
            Connect ccc=new Connect();
            ccc.getReportsSelenderness();
            
            try {
                JTable tab;
        JScrollPane sp;
        Vector content = new Vector();
        Vector header = new Vector();

        JPanel p1;
        JLabel l1;
        p1 = new JPanel();
        p1.setBounds(0,150,500,500);
        p1.setLayout(null);
        p1.setBackground(Color.LIGHT_GRAY);
        p1.setSize(800,400);
        l1 = new JLabel("Validation Summary");
        l1.setBounds(300,10, 200, 20);
        l1.setFont(new Font("Comic Sans Ms",Font.BOLD,14));
        //l1.setForeground(Color.WHITE);
        p1.add(l1);
            rs=ccc.DqlStatement();
            mt=rs.getMetaData();

            int count = mt.getColumnCount();
            for (int i = 1; i <= count; i++)
            {
                header.addElement(mt.getColumnName(i));
            }
            while (rs.next())
            {
                Vector row = new Vector(count);
                for (int i = 1; i <= count; i++)
                {
                    row.addElement(rs.getObject(i));
                }
                content.addElement(row);
            }

            tab = new JTable(content,header);
            tab.setBackground(Color.BLUE);
            tab.setColumnSelectionAllowed(false);
            tab.setAutoscrolls(true);
            tab.setGridColor(Color.BLUE);
            tab.setFont(new Font("Monotype Corsiva", Font.PLAIN,12));
            tab.setForeground(Color.WHITE);

            tab.setCursor(Cursor.getSystemCustomCursor("TEXT_CURSOR"));
            tab.enable(false);
            TableColumn col;
            for (int i = 0; i < tab.getColumnCount(); i++)
            {
                col = tab.getColumnModel().getColumn(i);
                col.sizeWidthToFit();

            }
            sp = new JScrollPane(tab);

            sp.setBounds(0,50,780,170);

            sp.setAutoscrolls(true);
            sp.setVisible(true);
            p1.add(sp);
            this.add(p1);
            p1.setBackground(new Color(204,204,204));
            this.setVisible(true);

        }
        catch(Exception ex)
        {
            
        }
  
        }
        catch(Exception ex)
        {
        }
        }
    }//GEN-LAST:event_validatebuttonActionPerformed

    private void btnexit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexit1ActionPerformed
     if(JOptionPane.showConfirmDialog(this,"Do u Want to Exit this Application")==JOptionPane.OK_OPTION)
        {
            this.setVisible(false);
        }    // TODO add your handling code here:
    }//GEN-LAST:event_btnexit1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnexit1;
    private javax.swing.JComboBox selectvalidation;
    private javax.swing.JLabel status;
    private javax.swing.JButton validatebutton;
    private javax.swing.JLabel validationlabel;
    // End of variables declaration//GEN-END:variables
}