/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Starting;


import Archtree.demo.IfcTreeView;
import Archtree.demo.StructureViewer;
import Login.Login;
import Structural_Analysis.Connect;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.prefs.Preferences;
import javafx.scene.control.TreeView;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.text.BadLocationException;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;
import javax.swing.text.StyledDocument;

	

/**
 *
 * @author DataByte Logics
 */
public class MainDesktopIfc extends javax.swing.JFrame {

    /**
     * Creates new form MainDesktopIfc
     */
    String str;
    FileInputStream inputStream;
    Scanner sc;
    JInternalFrame internalFrame;
    JFileChooser fileChooser;
    int returnValue=0;
    String path=null;
     File selectedFile;
           JLabel jl=new JLabel();
              JPanel jPanel=new JPanel();
              JButton j=new JButton();
               JComboBox jc;
               StructureViewer s;
               IfcTreeView t;
              
    public MainDesktopIfc() {
        initComponents();
         setIconImage(Toolkit.getDefaultToolkit().getImage("icons/type.png"));
         Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
        int width=(int)d.getWidth();
        int height=(int)d.getHeight();
        setBounds(0,0,width,height-40);
        jTextArea1.setForeground(Color.black);
                        jTextArea1.setBackground(Color.white);
                        jTextArea2.setBackground(Color.white);
                        jTextArea1.setVisible(true);
                        
                        lb1.setForeground(Color.black);
                        lb1.setBackground(Color.white);
                        lb1.setVisible(true);
                        s=new StructureViewer();
                        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
                        s.setVisible(false);
                        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        tree = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        process = new javax.swing.JProgressBar();
        lb1 = new javax.swing.JLabel();
        btnexit = new javax.swing.JButton();
        home = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        open = new javax.swing.JMenuItem();
        exit = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        validate = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("3D Model Checker ARCH (IFC)");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jDesktopPane1.setBackground(new java.awt.Color(197, 226, 252));

        tree.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        tree.addTab("Specification", jScrollPane1);

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        tree.addTab("Tree View", jScrollPane2);

        process.setForeground(new java.awt.Color(255, 0, 0));
        process.setToolTipText("");
        process.setStringPainted(true);

        lb1.setForeground(new java.awt.Color(255, 0, 0));
        lb1.setText("Loading ....................");

        btnexit.setBackground(new java.awt.Color(102, 102, 102));
        btnexit.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnexit.setForeground(new java.awt.Color(0, 51, 204));
        btnexit.setText("Exit");
        btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexitActionPerformed(evt);
            }
        });

        home.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        home.setForeground(new java.awt.Color(0, 51, 204));
        home.setText("Home");
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(tree, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(process, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(lb1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnexit, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(home, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(tree)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(btnexit, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(process, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(lb1)
                        .addGap(103, 103, 103))))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(home)
                    .addComponent(btnexit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tree, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb1)
                    .addComponent(process, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jMenu1.setText("File");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        open.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        open.setText("Open");
        open.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openActionPerformed(evt);
            }
        });
        jMenu1.add(open);

        exit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_DOWN_MASK));
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jMenu1.add(exit);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setText("Home");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        validate.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        validate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Starting/ok.png"))); // NOI18N
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
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void openActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openActionPerformed
       
         fileChooser = new JFileChooser();
        
                    
        
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Ifc Files (.ifc)","ifc");
            fileChooser.setFileFilter(filter);
            returnValue = fileChooser.showOpenDialog(null);   
            
        if (returnValue == JFileChooser.APPROVE_OPTION) {
         selectedFile = fileChooser.getSelectedFile();
         //System.out.println( selectedFile.getAbsolutePath());
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
                   Preferences userPreferences = Preferences.userRoot();
                    String info = userPreferences.get("userid","0");
                    if(info=="0")
                    {
                        this.setVisible(false);
                        Login l=new Login();
                        l.setVisible(true);
                        l.setLocationRelativeTo(null);  
                    }
                    else
                    {
                        
                        IFC2DB db=new IFC2DB();
                        db.read(path, fileN);
                     inputStream = new FileInputStream(file);
                        sc = new Scanner(inputStream, "UTF-8");
                        while (sc.hasNextLine()) 
                        {
                           
                           one= sc.nextLine();
                            //System.out.println(one);
                            jTextArea1.append(one+"\n");
                            size=size+one.length();
                            per=(size*100)/totSize;
                            //System.out.println("size "+per);
                            lb1.setText((int)per+"% File Loaded..");
                            process.setValue((int)per);
                            
                        }
                        
                       // System.out.println(path);
                         process.setValue(100);
                        lb1.setText("File Loaded");
                        t=s.getTree(path);
                        jTextArea2.add(t);
                    }
                       
                        
                        
        
    
            }  
           catch (Exception ex) {
                JOptionPane.showMessageDialog(this,"Some error Occurred");
            }
            }
          //System.out.println(selectedFile.getName());
          returnValue=1;
        }
        else
        {
            JOptionPane.showMessageDialog(this,"No File Selected");
        }

    }//GEN-LAST:event_openActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
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
            jDesktopPane1.add(bc);
            bc.setVisible(true);
            bc.setBounds(200,100,800,500);

        }
    }//GEN-LAST:event_validateActionPerformed

    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitActionPerformed

        if(JOptionPane.showConfirmDialog(this,"Do u Want to Exit this Application")==JOptionPane.OK_OPTION)
        {
            this.setVisible(false);
        }
    }//GEN-LAST:event_btnexitActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        ChooseAnalysis c=new ChooseAnalysis();
        c.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        // TODO add your handling code here:
        ChooseAnalysis ca=new ChooseAnalysis();
        ca.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_homeActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        Connect c=new Connect();
        c.ClearDatabase();
        try {
            c.DmlStatement();
        } catch (Exception ex) {
            Logger.getLogger(MainDesktopIfc.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowClosing

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnexit;
    private javax.swing.JMenuItem exit;
    private javax.swing.JButton home;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
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

   
}