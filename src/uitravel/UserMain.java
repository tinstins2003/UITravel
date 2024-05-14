/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package uitravel;

import com.formdev.flatlaf.FlatIntelliJLaf;
import com.formdev.flatlaf.extras.FlatSVGIcon;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import com.raven.datechooser.DateChooser;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFormattedTextField;
import javax.swing.JLayeredPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import net.miginfocom.swing.MigLayout;
import raven.datetime.component.date.DatePicker;
import uitravel.Components.MainUI.Header;
import uitravel.Components.MyButton;
import uitravel.Components.MyTextField;

/**
 *
 * @author ACER
 */
public class UserMain extends javax.swing.JFrame {

    /**
     * Creates new form UserMain
     */

    private MigLayout layout;
    private Header header;
    public UserMain() {
        initComponents();
        init();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        main = new javax.swing.JScrollPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1400, 800));
        setResizable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main, javax.swing.GroupLayout.PREFERRED_SIZE, 1400, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UserMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        FlatIntelliJLaf.setup();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane main;
    // End of variables declaration//GEN-END:variables
    private MyTextField txtSearch;
    private MyTextField txtDate;
    private MyTextField txtRoom;
    private MyButton btnSearch;
    private DateChooser selectDate;
    private javax.swing.JLayeredPane bg;

    private void init() {
        bg = new JLayeredPane();
        layout = new MigLayout("fill, insets 0");
        bg.setLayout(layout);
        header = new Header();
        bg.add(header,"dock north, width 100%,height 250");
        header.addEvent((ActionEvent e)->{
            LoginMain lm = new LoginMain();
            lm.setLogin(header.isLogin);
            lm.setVisible(true);
            dispose();
        });
        txtSearch = new uitravel.Components.MyTextField();
        txtSearch.setPrefixIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Pin - 1.png"))); // NOI18N
        txtSearch.setOpaque(false);
        txtDate = new MyTextField();
        txtDate.setPrefixIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Calendar.png"))); // NOI18N

        txtDate.setOpaque(false);
        txtRoom = new MyTextField();
        txtRoom.setPrefixIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/House.png"))); // NOI18N
        txtRoom.setOpaque(false);

        Icon icon = new ImageIcon(getClass().getResource("/resources/Loupe.PNG"));
        btnSearch = new MyButton();
        btnSearch.setIcon(icon);
        btnSearch.setText("");
        //btnSearch.setBackground(new Color(255,128,0));
        btnSearch.setColor(new Color(255,128,0));
        btnSearch.setColorOver(new Color(255,153,0));
        bg.add(txtSearch,"cell 0 0, width 28%,height 50, align left,aligny top,gapleft 10%,gapright 0");
        bg.add(txtDate,"cell 0 0,width 25%,height 50, align right,aligny top,gapleft 0, gapright 0");
        bg.add(txtRoom,"cell 0 0,width 25%,height 50, align right,aligny top,gapleft0");
        bg.add(btnSearch,"cell 0 0, align right,height 50,aligny top,gapleft0,gapright 0%");
        
        selectDate = new DateChooser();
        selectDate.setTextField(txtDate);
        selectDate.setBetweenCharacter(" đến ");
        selectDate.setDateSelectionMode(DateChooser.DateSelectionMode.BETWEEN_DATE_SELECTED);
        
        main.setViewportView(bg);
        //jScrollPane1.getViewport().add(bg);
    }
    

   
}
