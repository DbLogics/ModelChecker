package Starting;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DataByte_Logics
 */
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;
import luck.*;

public class MainWindowIfc extends javax.swing.JFrame implements Runnable{

    /**
     * Creates new form MainWindow
     */
    String str;
    FileInputStream inputStream;
    Scanner sc;
    JInternalFrame internalFrame;
    JFileChooser fileChooser;
    int returnValue=0;
    String path="";
     File selectedFile;
           JLabel jl=new JLabel();
              JPanel jPanel=new JPanel();
              JButton j=new JButton();
               JComboBox jc;
    
    public MainWindowIfc() {
         this.setExtendedState(JFrame.MAXIMIZED_BOTH);
         str=new String();
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage("icons/type.png"));
        getContentPane().setBackground(new Color(197,226,252));
        jTextArea1.setEnabled(false);
         jPanel.setSize(20,40);
       JLabel jLabel=new JLabel("Select Validation");
       String[] val={"Select any check","Depth of Column","Width of Beam","Height of Wall","Thickness of Slab"};
            jc=new JComboBox(val);
            jPanel.add(jLabel);
             jPanel.add(jc);
             j.setBounds(620, 300,400, 400);
             j.setText("Validate");
                     j.setVisible(true);
              jPanel.add(j);
        jl.setText("Status : Check not Selected");
        jl.setBounds(620,500,500, 500);
             
              jl.setVisible(true);
              jPanel.add(jl);
              internalFrame=new JInternalFrame();
              internalFrame.add(jPanel);
              
              
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tree = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        process = new javax.swing.JProgressBar();
        lb1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        open = new javax.swing.JMenuItem();
        exit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        validate = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("3D Model Checker ARCH (IFC)");

        tree.setBackground(new java.awt.Color(197, 226, 252));
        tree.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        tree.addTab("Specification", jScrollPane1);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        tree.addTab("Tree View", jScrollPane2);

        process.setForeground(new java.awt.Color(255, 0, 0));
        process.setToolTipText("");
        process.setStringPainted(true);

        lb1.setText("Loading ....................");

        jMenu1.setText("File");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        open.setText("Open");
        open.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openActionPerformed(evt);
            }
        });
        jMenu1.add(open);

        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jMenu1.add(exit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        validate.setText("Validate File");
        validate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validateActionPerformed(evt);
            }
        });
        jMenu2.add(validate);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tree, javax.swing.GroupLayout.DEFAULT_SIZE, 511, Short.MAX_VALUE)
                            .addComponent(process, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addComponent(lb1)))
                .addContainerGap(526, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tree, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(process, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void openActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openActionPerformed
  new Thread(new MainWindowIfc()).start();        
         
              
    }//GEN-LAST:event_openActionPerformed
  
    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        Structural_Analysis.Connect c=new Structural_Analysis.Connect();
        c.ClearDatabase();
        this.dispose();
        
    }//GEN-LAST:event_exitActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void validateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validateActionPerformed
        // TODO add your handling code here:
        if(path==null)
        {
             JOptionPane.showMessageDialog(this,"No File Selected");
        }
        else
        {
             Validation bc=new Validation();
        this.add(bc);
        bc.setVisible(true);
        bc.setBounds(300,100,550,500);
           
        }
    }//GEN-LAST:event_validateActionPerformed

    /**
     * @param args the command line arguments
     */


   
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem exit;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JLabel lb1;
    private javax.swing.JMenuItem open;
    private javax.swing.JProgressBar process;
    private javax.swing.JTabbedPane tree;
    private javax.swing.JMenuItem validate;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        fileChooser = new JFileChooser();
        
                    
        
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Ifc Files (.ifc)","ifc");
            fileChooser.setFileFilter(filter);
            returnValue = fileChooser.showOpenDialog(null);   
            
        if (returnValue == JFileChooser.APPROVE_OPTION) {
         selectedFile = fileChooser.getSelectedFile();
         String fileName=selectedFile.getName();
            if(fileName.endsWith(".ifcxml")){
                JOptionPane.showMessageDialog(this,"IFC Format Has Been Choosen In Architectural Domain");
                fileChooser.showOpenDialog(null);
            }else{
          try {
               File file=new File(selectedFile.getAbsolutePath());
               path=selectedFile.getAbsolutePath();
                String fileN=file.getName();
               long totSize=file.length();
                    long size=0;
                    float per;
                    String one="";
                    String two=fileN;
                   
                        inputStream = new FileInputStream(file);
                        sc = new Scanner(inputStream, "UTF-8");
                        while (sc.hasNextLine()) 
                        {
                           
                           one= sc.nextLine();
                            System.out.println(one);
                            jTextArea1.append(one+"\n");
                            size=size+one.length();
                            per=(size*100)/totSize;
                            System.out.println("size "+per);
                            lb1.setText((int)per+"% File Loaded..");
                            process.setValue((int)per);
                            
                        }
                         process.setValue(100);
                        lb1.setText("File Loaded");
                        returnValue=1;
        
    
            }  
           catch (Exception ex) {
                Logger.getLogger(MainWindowIfc.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
          System.out.println(selectedFile.getName());
          returnValue=1;
        }
        else
        {
            JOptionPane.showMessageDialog(this,"No File Selected");
        }
        
}
}
