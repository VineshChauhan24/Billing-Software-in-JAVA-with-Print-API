/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gstbilling;


import gstbilling.admin.CreateInvoice;
import gstbilling.admin.CreateNewUser;
import gstbilling.admin.EditClassification;
import gstbilling.admin.GstClassificationCreation;
import gstbilling.admin.GstCompanyDetail;
import gstbilling.admin.GstCompanyDetail;
import gstbilling.admin.PreviousInvoice;
import gstbilling.admin.ViewProduct;
import gstbilling.admin.changepassword;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Rishabh
 */
public class AdminHome extends javax.swing.JFrame {
    static String role;
    public static String name;
    /**
     * Creates new form AdminHome
     */
    public AdminHome() {
        initComponents();
          try{
             Connection con=Connect.connect();
             PreparedStatement ps=con.prepareStatement("Select * from companydetail");
             ResultSet rs=ps.executeQuery();
             if(rs.next())
             {
                  
                 jcomname.setText(rs.getString("companyname"));
                 jcomstate.setText(rs.getString("state"));
                 jgst.setText(rs.getString("gstinnumber"));
                 
             }
             
        
        }catch(Exception ex){}

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        jclassificationview = new javax.swing.JButton();
        jcomdetailbutton = new javax.swing.JButton();
        jprevinvoice = new javax.swing.JButton();
        jcreateinvoicebutton = new javax.swing.JButton();
        jprintbillbutton = new javax.swing.JButton();
        jnewuser = new javax.swing.JButton();
        jcomname = new javax.swing.JLabel();
        jcomstate = new javax.swing.JLabel();
        jgst = new javax.swing.JLabel();
        jchangepassbutton1 = new javax.swing.JButton();
        jclassificationbutton1 = new javax.swing.JButton();
        jclassedit = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        openMenuItem = new javax.swing.JMenuItem();
        saveMenuItem = new javax.swing.JMenuItem();
        saveAsMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        cutMenuItem = new javax.swing.JMenuItem();
        copyMenuItem = new javax.swing.JMenuItem();
        pasteMenuItem = new javax.swing.JMenuItem();
        deleteMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        contentMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        desktopPane.setAutoscrolls(true);

        jclassificationview.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jclassificationview.setText("GST CLASSIFICATION VIEW");
        jclassificationview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jclassificationviewActionPerformed(evt);
            }
        });
        desktopPane.add(jclassificationview);
        jclassificationview.setBounds(340, 380, 260, 40);

        jcomdetailbutton.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jcomdetailbutton.setText("GST COMPANY DETAIL");
        jcomdetailbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcomdetailbuttonActionPerformed(evt);
            }
        });
        desktopPane.add(jcomdetailbutton);
        jcomdetailbutton.setBounds(40, 80, 260, 40);

        jprevinvoice.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jprevinvoice.setText("PREVIOUS INVOICE DETAIL");
        jprevinvoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jprevinvoiceActionPerformed(evt);
            }
        });
        desktopPane.add(jprevinvoice);
        jprevinvoice.setBounds(40, 140, 260, 40);

        jcreateinvoicebutton.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jcreateinvoicebutton.setText("CREATE INVOICE");
        jcreateinvoicebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcreateinvoicebuttonActionPerformed(evt);
            }
        });
        desktopPane.add(jcreateinvoicebutton);
        jcreateinvoicebutton.setBounds(40, 200, 260, 40);

        jprintbillbutton.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jprintbillbutton.setText("PRINT INVOICE");
        desktopPane.add(jprintbillbutton);
        jprintbillbutton.setBounds(40, 260, 260, 40);

        jnewuser.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jnewuser.setText("CREATE NEW USER");
        jnewuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jnewuserActionPerformed(evt);
            }
        });
        desktopPane.add(jnewuser);
        jnewuser.setBounds(40, 380, 260, 40);

        jcomname.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        desktopPane.add(jcomname);
        jcomname.setBounds(360, 30, 230, 40);

        jcomstate.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        desktopPane.add(jcomstate);
        jcomstate.setBounds(360, 80, 240, 40);

        jgst.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        desktopPane.add(jgst);
        jgst.setBounds(360, 140, 230, 40);

        jchangepassbutton1.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jchangepassbutton1.setText("CHANGE PASSWORD");
        jchangepassbutton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jchangepassbutton1ActionPerformed(evt);
            }
        });
        desktopPane.add(jchangepassbutton1);
        jchangepassbutton1.setBounds(40, 320, 260, 40);

        jclassificationbutton1.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jclassificationbutton1.setText("GST CLASSIFICATION CREATION");
        jclassificationbutton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jclassificationbutton1ActionPerformed(evt);
            }
        });
        desktopPane.add(jclassificationbutton1);
        jclassificationbutton1.setBounds(40, 20, 260, 40);

        jclassedit.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jclassedit.setText("GST CLASSIFICATION UPD/DEL");
        jclassedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jclasseditActionPerformed(evt);
            }
        });
        desktopPane.add(jclassedit);
        jclassedit.setBounds(340, 320, 260, 40);

        fileMenu.setMnemonic('f');
        fileMenu.setText("File");

        openMenuItem.setMnemonic('o');
        openMenuItem.setText("Open");
        fileMenu.add(openMenuItem);

        saveMenuItem.setMnemonic('s');
        saveMenuItem.setText("Save");
        fileMenu.add(saveMenuItem);

        saveAsMenuItem.setMnemonic('a');
        saveAsMenuItem.setText("Save As ...");
        saveAsMenuItem.setDisplayedMnemonicIndex(5);
        fileMenu.add(saveAsMenuItem);

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        editMenu.setMnemonic('e');
        editMenu.setText("Edit");

        cutMenuItem.setMnemonic('t');
        cutMenuItem.setText("Cut");
        editMenu.add(cutMenuItem);

        copyMenuItem.setMnemonic('y');
        copyMenuItem.setText("Copy");
        editMenu.add(copyMenuItem);

        pasteMenuItem.setMnemonic('p');
        pasteMenuItem.setText("Paste");
        editMenu.add(pasteMenuItem);

        deleteMenuItem.setMnemonic('d');
        deleteMenuItem.setText("Delete");
        editMenu.add(deleteMenuItem);

        menuBar.add(editMenu);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Help");

        contentMenuItem.setMnemonic('c');
        contentMenuItem.setText("Contents");
        helpMenu.add(contentMenuItem);

        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("About");
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 633, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void jcomdetailbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcomdetailbuttonActionPerformed
  
        gstbilling.admin.GstCompanyDetail gc=new GstCompanyDetail();
        desktopPane.add(gc);
        gc.setVisible(true);
    }//GEN-LAST:event_jcomdetailbuttonActionPerformed

    private void jclassificationviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jclassificationviewActionPerformed
       gstbilling.admin.ViewProduct vp=new ViewProduct();
       desktopPane.add(vp);
       vp.setVisible(true);
    }//GEN-LAST:event_jclassificationviewActionPerformed

    private void jnewuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jnewuserActionPerformed
        // TODO add your handling code here:
        
         gstbilling.admin.CreateNewUser cnu=new CreateNewUser();
        desktopPane.add(cnu);
        cnu.setVisible(true);
    }//GEN-LAST:event_jnewuserActionPerformed

    private void jchangepassbutton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jchangepassbutton1ActionPerformed
        // TODO add your handling code here:
        gstbilling.admin.changepassword cp=new changepassword();
        desktopPane.add(cp);
        cp.setVisible(true);
    }//GEN-LAST:event_jchangepassbutton1ActionPerformed

    private void jclassificationbutton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jclassificationbutton1ActionPerformed
        // TODO add your handling code here:
         gstbilling.admin.GstClassificationCreation gcc=new GstClassificationCreation();
        desktopPane.add(gcc);
        gcc.setVisible(true);
    }//GEN-LAST:event_jclassificationbutton1ActionPerformed

    private void jclasseditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jclasseditActionPerformed
     gstbilling.admin.EditClassification ec=new EditClassification();
     desktopPane.add(ec);
     ec.setVisible(true);
    }//GEN-LAST:event_jclasseditActionPerformed

    private void jcreateinvoicebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcreateinvoicebuttonActionPerformed
        gstbilling.admin.CreateInvoice ci=new CreateInvoice();
        desktopPane.add(ci);
        ci.setVisible(true);
    }//GEN-LAST:event_jcreateinvoicebuttonActionPerformed

    private void jprevinvoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jprevinvoiceActionPerformed
                PreviousInvoice pi=new PreviousInvoice();
                desktopPane.add(pi);
                pi.setVisible(true);
    }//GEN-LAST:event_jprevinvoiceActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JMenuItem contentMenuItem;
    private javax.swing.JMenuItem copyMenuItem;
    private javax.swing.JMenuItem cutMenuItem;
    private javax.swing.JMenuItem deleteMenuItem;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JButton jchangepassbutton1;
    private javax.swing.JButton jclassedit;
    private javax.swing.JButton jclassificationbutton1;
    private javax.swing.JButton jclassificationview;
    private javax.swing.JButton jcomdetailbutton;
    private javax.swing.JLabel jcomname;
    private javax.swing.JLabel jcomstate;
    private javax.swing.JButton jcreateinvoicebutton;
    private javax.swing.JLabel jgst;
    private javax.swing.JButton jnewuser;
    private javax.swing.JButton jprevinvoice;
    private javax.swing.JButton jprintbillbutton;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JMenuItem pasteMenuItem;
    private javax.swing.JMenuItem saveAsMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    // End of variables declaration//GEN-END:variables

}
