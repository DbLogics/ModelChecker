/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Starting;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author DataByte_Logics
 */
public class ChooseIfcArch extends javax.swing.JFrame {

    /**
     * Creates new form ChooseIfc1
     */
    public ChooseIfcArch() {
        initComponents();
         setIconImage(Toolkit.getDefaultToolkit().getImage("icons/file.png"));
         getContentPane().setBackground(new Color(197,226,252));
        
        //getContentPane().setBackground(Color.BLACK);
        ButtonGroup b=new ButtonGroup();
        b.add(ifc);
        b.add(ifcxml);
        
        
        // this.setLayout();
         //this.setLocationRelativeTo(null);
        
       
        
    }
public void setLayout(){
    this.setLayout(new BorderLayout());
	 
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ifc = new javax.swing.JRadioButton();
        ifcxml = new javax.swing.JRadioButton();
        btnexit = new javax.swing.JButton();
        btnexit1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Extension Chooser");
        setBackground(new java.awt.Color(102, 255, 51));
        setBounds(new java.awt.Rectangle(300, 200, 0, 0));
        setMaximumSize(new java.awt.Dimension(0, 0));
        setPreferredSize(new java.awt.Dimension(683, 219));
        setResizable(false);
        setSize(new java.awt.Dimension(500, 500));

        ifc.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        ifc.setForeground(new java.awt.Color(0, 0, 102));
        ifc.setText("ifc");
        ifc.setOpaque(false);
        ifc.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ifcItemStateChanged(evt);
            }
        });
        ifc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ifcActionPerformed(evt);
            }
        });

        ifcxml.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        ifcxml.setForeground(new java.awt.Color(0, 0, 102));
        ifcxml.setText(".ifcXML");
        ifcxml.setOpaque(false);
        ifcxml.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ifcxmlItemStateChanged(evt);
            }
        });
        ifcxml.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ifcxmlActionPerformed(evt);
            }
        });

        btnexit.setBackground(new java.awt.Color(255, 255, 255));
        btnexit.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnexit.setForeground(new java.awt.Color(0, 51, 204));
        btnexit.setText("Back");
        btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexitActionPerformed(evt);
            }
        });

        btnexit1.setBackground(new java.awt.Color(102, 102, 102));
        btnexit1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnexit1.setForeground(new java.awt.Color(0, 51, 204));
        btnexit1.setText("Exit");
        btnexit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexit1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Poppins Black", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("    3D MODEL CHECKER");
        jLabel1.setBorder(new javax.swing.border.MatteBorder(null));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ifc)
                    .addComponent(ifcxml))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnexit1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnexit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ifc)
                    .addComponent(btnexit))
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ifcxml)
                    .addComponent(btnexit1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ifcItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ifcItemStateChanged
 if(ifc.isEnabled()==true)
        {
            MainDesktopIfc i=new MainDesktopIfc();
            this.setVisible(false);
            i.setVisible(true);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_ifcItemStateChanged

    private void ifcxmlItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ifcxmlItemStateChanged
 if(ifcxml.isEnabled()==true)
        {
            MainDesktopIfcxml i=new MainDesktopIfcxml();
            this.setVisible(false);
            i.setVisible(true);
        }        // TODO add your handling code here:
           // TODO add your handling code here:
    }//GEN-LAST:event_ifcxmlItemStateChanged

    private void ifcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ifcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ifcActionPerformed

    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitActionPerformed

        ChooseAnalysis ca=new ChooseAnalysis();
        ca.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnexitActionPerformed

    private void btnexit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexit1ActionPerformed
      if(JOptionPane.showConfirmDialog(this,"Do u Want to Exit this Application")==JOptionPane.OK_OPTION)
        {
            this.setVisible(false);
        }
          
    }//GEN-LAST:event_btnexit1ActionPerformed

    private void ifcxmlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ifcxmlActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ifcxmlActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnexit;
    private javax.swing.JButton btnexit1;
    private javax.swing.JRadioButton ifc;
    private javax.swing.JRadioButton ifcxml;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}