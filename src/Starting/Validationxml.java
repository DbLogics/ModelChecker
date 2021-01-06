/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Starting;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Scanner;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableColumn;
import luck.Connect;
import luck.Luck10;
import luck.Luck7;
import luck.Luck8;
import luck.Luck9;

/**
 *
 * @author DataByte Logics
 */
public class Validationxml extends javax.swing.JInternalFrame {

    /**
     * Creates new form Validationxml
     */
    String Path="";
    ResultSet rs;
    ResultSetMetaData mt;
    String str;
    FileInputStream inputStream;
    Scanner sc;
    public Validationxml(String s) {
        initComponents();
        
        getContentPane().setBackground(new Color(197,226,252));
        System.out.println("Path : "+s);
        Path=s;
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
        outfile = new javax.swing.JTextField();
        extension = new javax.swing.JTextField();
        validationlabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        output = new javax.swing.JTextArea();

        setTitle("Validation");

        validationlabel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        validationlabel.setText("Select Validation");

        selectvalidation.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        selectvalidation.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Any Check", "Depth of Column", "Width of Beam", "Height of Wall", "Thickness of Slab" }));
        selectvalidation.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                selectvalidationItemStateChanged(evt);
            }
        });
        selectvalidation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectvalidationActionPerformed(evt);
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

        outfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outfileActionPerformed(evt);
            }
        });

        extension.setText(".BIM");
        extension.setEnabled(false);
        extension.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                extensionActionPerformed(evt);
            }
        });

        validationlabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        validationlabel1.setText("Output File");

        output.setEditable(false);
        output.setColumns(20);
        output.setRows(5);
        output.setEnabled(false);
        jScrollPane1.setViewportView(output);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(status, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(validationlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(validationlabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(selectvalidation, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(outfile, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(extension)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(validatebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnexit1)
                                .addGap(21, 21, 21))))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(validationlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectvalidation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(outfile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(extension, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(validationlabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(validatebutton)
                    .addComponent(btnexit1))
                .addGap(25, 25, 25)
                .addComponent(status)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE)
                .addContainerGap())
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
        if(outfile.getText()==null)
        {
            JOptionPane.showMessageDialog(this, "Please give the name of outputfile", "Error Message", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String out=outfile.getText()+extension.getText();
        if(selectvalidation.getSelectedIndex()==1)
        {
            try {
                //System.out.println(selectedFile.getAbsolutePath());
                Luck8 i=new Luck8();
                i.read(Path,out);
                
            } catch (Exception ex) {
                Logger.getLogger(MainWindowIfc.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(selectvalidation.getSelectedIndex()==2)
        {
            try {
                //System.out.println(selectedFile.getAbsolutePath());
                Luck7 i=new Luck7();
                i.read(Path,out);
            } catch (Exception ex) {
                Logger.getLogger(MainWindowIfc.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if (selectvalidation.getSelectedIndex()==3)
        {
            try {
                //System.out.println(selectedFile.getAbsolutePath());
                Luck9 i=new Luck9();
                i.read(Path,out);
            } catch (Exception ex) {
                Logger.getLogger(MainWindowIfc.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(selectvalidation.getSelectedIndex()==4)
        {
            try {
                //System.out.println(selectedFile.getAbsolutePath());
                Luck10 i=new Luck10();
                i.read(Path,out);
            } catch (Exception ex) {
                Logger.getLogger(MainWindowIfc.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    
File file=new File(out);
              
                String fileN=file.getName();
               long totSize=file.length();
                    long size=0;
                    float per;
                    String one="";
                    String two=fileN;
                   
        try {
            inputStream = new FileInputStream(file);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Validationxml.class.getName()).log(Level.SEVERE, null, ex);
        }
                        sc = new Scanner(inputStream, "UTF-8");
                        while (sc.hasNextLine()) 
                        {
                           
                           one= sc.nextLine();
                            System.out.println(one);
                            output.append(one+"\n");
                            size=size+one.length();
                            per=(size*100)/totSize;
                            System.out.println("size "+per);
                            
                            status.setText("Status: Check Performed");
                        }
                        
                       
        
        

    }//GEN-LAST:event_validatebuttonActionPerformed

    private void btnexit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexit1ActionPerformed
     if(JOptionPane.showConfirmDialog(this,"Do u Want to Exit this Application")==JOptionPane.OK_OPTION)
        {
            this.setVisible(false);
        }    // TODO add your handling code here:
    }//GEN-LAST:event_btnexit1ActionPerformed

    private void outfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outfileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_outfileActionPerformed

    private void extensionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_extensionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_extensionActionPerformed

    private void selectvalidationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectvalidationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectvalidationActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnexit1;
    private javax.swing.JTextField extension;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField outfile;
    private javax.swing.JTextArea output;
    private javax.swing.JComboBox selectvalidation;
    private javax.swing.JLabel status;
    private javax.swing.JButton validatebutton;
    private javax.swing.JLabel validationlabel;
    private javax.swing.JLabel validationlabel1;
    // End of variables declaration//GEN-END:variables
}