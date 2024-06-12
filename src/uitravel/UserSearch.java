/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package uitravel;

import com.formdev.flatlaf.FlatIntelliJLaf;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.CollectionReference;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.QuerySnapshot;
import com.google.firebase.cloud.FirestoreClient;
import com.raven.datechooser.DateChooser;
import com.raven.glasspanepopup.GlassPanePopup;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Base64;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLayeredPane;
import net.miginfocom.swing.MigLayout;
import uitravel.User.MainUI.NoLoggedHeader;
import uitravel.User.MainUI.Place;
import uitravel.Components.MyButton;
import uitravel.Components.MyTextField;
import uitravel.Components.RoundedPanel;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.SwingWorker;
import uitravel.Components.Loading;
import uitravel.Components.TourInfo.Component.FullTourInfo;
import uitravel.Components.TourInfo.Component.ShortTourInfo;
import uitravel.User.MainUI.LoggedHeader;
import uitravel.User.UserPayment;


/**
 *
 * @author ACER
 */
public class UserSearch extends javax.swing.JFrame {

    private String searchData;
    private String uid;

    private boolean isLogged = false;
    private MigLayout layout;
    private Map<String, String> AllPlaces;
    FullTourInfo fullTour ;

    Firestore firestore = FirestoreClient.getFirestore();

    private List<ShortTourInfo> allTours;

    public UserSearch() {
        initComponents();
        //init();
    }
    public void setAllPlaces(Map<String, String> placeData){
        this.AllPlaces = placeData;
         DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();

        model.addElement("Chọn nơi bạn muốn đến");
        
        for (Map.Entry<String, String> entry : placeData.entrySet()) {
             model.addElement(entry.getKey());
           
        }
        txtSearch.setModel(model);
        txtSearch.setSelectedItem(searchData);
    }
    public void setSearchData(String t){
        this.searchData = t;
        loadHotelData(searchData);

    }
    public void setIsLogged(boolean t){
        this.isLogged = t;
        init();
    }
    public void setUID(String uid){
        this.uid = uid; 
    }
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        chatBox = new uitravel.User.MainUI.ChatBox();
        main = new javax.swing.JScrollPane();
        bg = new javax.swing.JLayeredPane();
        imagePanel1 = new uitravel.Components.ImagePanel();
        header1 = new uitravel.User.MainUI.NoLoggedHeader();
        header2 = new uitravel.User.MainUI.LoggedHeader();
        coverMain = new uitravel.Components.RoundedPanel();
        coverTour = new javax.swing.JLayeredPane();
        roundedPanel1 = new uitravel.Components.RoundedPanel();
        txtDate = new uitravel.Components.MyTextField();
        myButton1 = new uitravel.Components.MyButton();
        txtSearch = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtPlace = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.PAGE_AXIS));

        main.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        main.setToolTipText("");
        main.setViewportView(bg);

        imagePanel1.setbackgroundImage(new javax.swing.ImageIcon(getClass().getResource("/resources/BigBeach_GettyImages-874980426-ezgif.com-webp-to-png-converter.png"))); // NOI18N
        imagePanel1.setHover(false);
        imagePanel1.setisTransparent(false);
        imagePanel1.setPreferredSize(new java.awt.Dimension(1400, 800));
        imagePanel1.setwithBlack(true);

        javax.swing.GroupLayout imagePanel1Layout = new javax.swing.GroupLayout(imagePanel1);
        imagePanel1.setLayout(imagePanel1Layout);
        imagePanel1Layout.setHorizontalGroup(
            imagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1400, Short.MAX_VALUE)
        );
        imagePanel1Layout.setVerticalGroup(
            imagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );

        coverMain.setBackground(new java.awt.Color(255, 255, 255));
        coverMain.setPreferredSize(new java.awt.Dimension(1400, 795));

        coverTour.setPreferredSize(new java.awt.Dimension(700, 0));

        javax.swing.GroupLayout coverTourLayout = new javax.swing.GroupLayout(coverTour);
        coverTour.setLayout(coverTourLayout);
        coverTourLayout.setHorizontalGroup(
            coverTourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 787, Short.MAX_VALUE)
        );
        coverTourLayout.setVerticalGroup(
            coverTourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        roundedPanel1.setBackground(new java.awt.Color(255, 255, 255));
        roundedPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        roundedPanel1.setBorderColor(new java.awt.Color(0, 153, 255));
        roundedPanel1.setRadius(10);
        roundedPanel1.setWithBorder(true);

        txtDate.setForeground(new java.awt.Color(51, 51, 51));
        txtDate.setText("myTextField1");
        txtDate.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtDate.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txtDate.setPrefixIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Calendar.png"))); // NOI18N
        txtDate.setWithBorder(false);
        txtDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDateActionPerformed(evt);
            }
        });

        myButton1.setForeground(new java.awt.Color(255, 255, 255));
        myButton1.setText("Tìm kiếm");
        myButton1.setBorderColor(new java.awt.Color(255, 128, 0));
        myButton1.setColor(new java.awt.Color(255, 128, 0));
        myButton1.setColorClick(new java.awt.Color(255, 25, 20));
        myButton1.setColorOver(new java.awt.Color(255, 50, 20));
        myButton1.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        myButton1.setRadius(10);
        myButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myButton1ActionPerformed(evt);
            }
        });

        txtSearch.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txtSearch.setBorder(null);

        javax.swing.GroupLayout roundedPanel1Layout = new javax.swing.GroupLayout(roundedPanel1);
        roundedPanel1.setLayout(roundedPanel1Layout);
        roundedPanel1Layout.setHorizontalGroup(
            roundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel1Layout.createSequentialGroup()
                .addGroup(roundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(roundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(myButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtDate, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)))
                .addGap(2, 2, 2))
        );
        roundedPanel1Layout.setVerticalGroup(
            roundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(myButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 255));
        jLabel1.setText("Quay về trang chủ");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 26)); // NOI18N
        jLabel2.setText("Điểm tham quan ở");

        txtPlace.setFont(new java.awt.Font("Times New Roman", 1, 26)); // NOI18N
        txtPlace.setText("Huế");

        javax.swing.GroupLayout coverMainLayout = new javax.swing.GroupLayout(coverMain);
        coverMain.setLayout(coverMainLayout);
        coverMainLayout.setHorizontalGroup(
            coverMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(coverMainLayout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(coverMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(coverMainLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPlace, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(coverMainLayout.createSequentialGroup()
                        .addComponent(roundedPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addComponent(coverTour, javax.swing.GroupLayout.PREFERRED_SIZE, 787, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(105, Short.MAX_VALUE))
        );
        coverMainLayout.setVerticalGroup(
            coverMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(coverMainLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addGroup(coverMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPlace))
                .addGap(17, 17, 17)
                .addGroup(coverMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(coverMainLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(roundedPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(665, 749, Short.MAX_VALUE))
                    .addComponent(coverTour, javax.swing.GroupLayout.DEFAULT_SIZE, 908, Short.MAX_VALUE)))
        );

        bg.setLayer(imagePanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        bg.setLayer(header1, javax.swing.JLayeredPane.PALETTE_LAYER);
        bg.setLayer(header2, javax.swing.JLayeredPane.PALETTE_LAYER);
        bg.setLayer(coverMain, javax.swing.JLayeredPane.MODAL_LAYER);

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(imagePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(7, Short.MAX_VALUE))
            .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(bgLayout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(header1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(7, Short.MAX_VALUE)))
            .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(bgLayout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(header2, javax.swing.GroupLayout.PREFERRED_SIZE, 1401, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(bgLayout.createSequentialGroup()
                    .addComponent(coverMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 7, Short.MAX_VALUE)))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(imagePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 327, Short.MAX_VALUE))
            .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(bgLayout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(header1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(876, Short.MAX_VALUE)))
            .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(bgLayout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(header2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(877, Short.MAX_VALUE)))
            .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                    .addGap(0, 105, Short.MAX_VALUE)
                    .addComponent(coverMain, javax.swing.GroupLayout.DEFAULT_SIZE, 1022, Short.MAX_VALUE)))
        );

        main.setViewportView(bg);

        jLayeredPane1.setLayer(chatBox, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(main, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main, javax.swing.GroupLayout.PREFERRED_SIZE, 1400, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(chatBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(chatBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        getContentPane().add(jLayeredPane1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDateActionPerformed

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
        GlassPanePopup.showPopup(new Loading());
        SwingWorker<Void, Void> worker = new SwingWorker<>() {
            @Override
            protected Void doInBackground() throws Exception {
                // Thực hiện tác vụ nặng ở đây
                UserMain um = new UserMain();
                if(isLogged){
                    um.setUID(uid);
                }
                um.setIsLogged(isLogged);
               
                // Hiển thị kết quả sau khi tác vụ hoàn thành
                SwingUtilities.invokeLater(() -> {
                um.setVisible(true);
                });
                return null;
            }

            @Override
            protected void done() {
                // Ẩn màn hình loading sau khi tác vụ hoàn thành
                GlassPanePopup.closePopupAll();
                dispose();
            }
        };
        worker.execute();

    }//GEN-LAST:event_jLabel1MousePressed

    private void myButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton1ActionPerformed
        if(txtSearch.getSelectedIndex()==0){
            
        }
        else{
            loadHotelData((String) txtSearch.getSelectedItem());
            txtPlace.setText((String) txtSearch.getSelectedItem());
        }
    }//GEN-LAST:event_myButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(UserSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        FlatIntelliJLaf.setup();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserSearch().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane bg;
    private uitravel.User.MainUI.ChatBox chatBox;
    private uitravel.Components.RoundedPanel coverMain;
    private javax.swing.JLayeredPane coverTour;
    private uitravel.User.MainUI.NoLoggedHeader header1;
    private uitravel.User.MainUI.LoggedHeader header2;
    private uitravel.Components.ImagePanel imagePanel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane main;
    private uitravel.Components.MyButton myButton1;
    private uitravel.Components.RoundedPanel roundedPanel1;
    private uitravel.Components.MyTextField txtDate;
    private javax.swing.JLabel txtPlace;
    private javax.swing.JComboBox<String> txtSearch;
    // End of variables declaration//GEN-END:variables
    private DateChooser selectDate = new DateChooser();
   // private javax.swing.JLayeredPane bg;

    private void init() {
        selectDate.setTextField(txtDate);
        GlassPanePopup.install(this);

        //bg.setPreferredSize(new java.awt.Dimension(1400, 10000));

        layout = new MigLayout("wrap, fill, insets 0","[]", "12[]12[]12");
        //bg.setLayout(layout);
       if(!isLogged){
            header1.setVisible(true);
            header2.setVisible(false);

            header1.addEvent((ActionEvent e)->{
                LoginMain lm = new LoginMain();
                lm.setLogin(header1.isLogin);
                lm.setVisible(true);
                dispose();
            });
            header1.addAminUIEvent((ActionEvent e)->{
                AdminWelcome am = new AdminWelcome();
                am.setVisible(true);
                dispose();
            });
            header1.addChatEvent((ActionEvent e)->{
                chatBox.setVisible(true);
            });
       }
       else{
            header2.setVisible(true);
            header1.setVisible(false);
            header2.addAminUIEvent((ActionEvent e)->{
                AdminWelcome am = new AdminWelcome();
                am.setVisible(true);
                dispose();
            });

             header2.addEvent(new MouseAdapter(){
                @Override
                    public void mousePressed(MouseEvent e) {
                    GlassPanePopup.showPopup(new Loading());
                SwingWorker<Void, Void> worker = new SwingWorker<>() {
                    @Override
                    protected Void doInBackground() throws Exception {
                            UserInfo ui = new UserInfo();
                            if(isLogged) {
                                ui.setUID(uid);
                            } 
                            // Hiển thị kết quả sau khi tác vụ hoàn thành
                            SwingUtilities.invokeLater(() -> {
                                ui.setVisible(true);
                            });
                            return null;
                    }
                    @Override
                    protected void done() {
                        // Ẩn màn hình loading sau khi tác vụ hoàn thành
                        GlassPanePopup.closePopupAll();
                        dispose();

                    }
                };
                 worker.execute();                    
                    }
            });
            
            
            header2.addChatEvent((ActionEvent e)->{
               chatBox.setVisible(true);

            });
                        loadDataFromFireStore(uid);

       }
    



        //btnSearch.setBackground(new Color(255,128,0));
     
        selectDate = new DateChooser();
        selectDate.setBetweenCharacter(" đến ");
        selectDate.setDateSelectionMode(DateChooser.DateSelectionMode.BETWEEN_DATE_SELECTED);
       
      
        

        main.setViewportView(bg);
        addChatBox();
  
    }
    private void addChatBox(){
        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);

        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap(1013, Short.MAX_VALUE)
                .addComponent(chatBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(main, javax.swing.GroupLayout.DEFAULT_SIZE, 1412, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap(364, Short.MAX_VALUE)
                .addComponent(chatBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(main, javax.swing.GroupLayout.DEFAULT_SIZE, 812, Short.MAX_VALUE))
        );
        chatBox.setVisible(false);

    }
    
 private void loadDataFromFireStore(String uid){
        try {
            DocumentReference docRef  = firestore.collection("user").document(uid);
            ApiFuture<DocumentSnapshot> future = docRef.get();
            // Block on response
            DocumentSnapshot document;  
            document = future.get();
            System.out.println(document.getString("FullName"));
            if(document.exists()){
                header2.setUserName(document.getString("FullName"));
                 ImageIcon temp =loadImage( document);
                    if(temp!=null){
                        header2.setUserAvatar(temp);
                    }
                }
        }
        catch (ExecutionException | InterruptedException ex) {
            Logger.getLogger(UserMain.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    private ImageIcon loadImage(DocumentSnapshot document) {
     try {
       
        if (document.exists()) {
            String imageDataString = document.getString("Avatar");
            System.out.println(imageDataString);
            if (imageDataString != null) {
                // Convert Base64 string back to byte array
                byte[] imageData = Base64.getDecoder().decode(imageDataString);

                ByteArrayInputStream bais = new ByteArrayInputStream(imageData);
                BufferedImage bufferedImage = ImageIO.read(bais);
                return new ImageIcon(bufferedImage);
            } else {
               
            }
        } else {
            JOptionPane.showMessageDialog(null,
                    "Không tìm thấy người dùng!",
                    "Thông báo!",
                    JOptionPane.ERROR_MESSAGE);
        }
    } catch (HeadlessException | IOException  e) {
        JOptionPane.showMessageDialog(null,
                "Lỗi khi tải ảnh!",
                "Thông báo!",
                JOptionPane.ERROR_MESSAGE);
    }
    return null;
}
    private void loadHotelData(String searchData){
        try {
            coverTour.removeAll();
            coverTour.setLayout(new MigLayout("wrap,fill, insets 0","push[]push","1[]20[]push"));
            allTours = new ArrayList<>();
            CollectionReference collection = firestore.collection("admin").document("AllTours").collection("TourInfo");
            ApiFuture<QuerySnapshot> querySnapshot = collection.get();
            for (DocumentSnapshot document : querySnapshot.get().getDocuments()) {
                if (document.exists()) {
                    System.out.println(document.getString("Place") + "   "+searchData);
                    if(document.getString("Place").equals(searchData)){
                        ShortTourInfo t = new ShortTourInfo();
                        t.setTourID(document.getId());
                        t.setTourName(document.getString("TourName"));
                        t.setPlace(document.getString("Place"));
                        t.setDescription(document.getString("TourDescription"));
                        t.setTime("Thời gian: "+document.getString("TourLength"));
                        Map<String,String> Rating = (Map<String,String>) document.get("TourRating");
                        t.setScore(Rating.get("Rate"));
                        List<String> tourImagesBase64 = (List<String>) document.get("TourImages");
                        t.setPic(convertBase64ToImageIcon(tourImagesBase64));
                        t.addEvent((ActionEvent evt)->{
                        fullTour = new FullTourInfo();
                        
                        fullTour.setTourID(t.getTourID());
                        fullTour.addEvent((ActionEvent e) -> {
                            UserPayment up = new UserPayment();
                            up.setTicketData(fullTour.getTicketData());
                            up.setPrices(fullTour.getPrices());
                            up.setChildTourID(fullTour.getChildID());
                            up.setTourID(t.getTourID());
                            if(isLogged){
                                up.setUID(uid);
                            }
                            GlassPanePopup.showPopup(up,"up");
                            up.eventCancel(new MouseAdapter(){
                                @Override
                                public void mousePressed(MouseEvent e) {
                                    GlassPanePopup.closePopup("up");

                                }
                            });
                        });
                        GlassPanePopup.showPopup(fullTour);
                    });
                    
                    t.setPreferredSize(new Dimension(629, 179));
                    coverTour.add(t);
                    allTours.add(t);
                    }
                   
                }
            }
            coverTour.repaint();
            
        } catch (InterruptedException | ExecutionException ex) {
            Logger.getLogger(UserSearch.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     private ImageIcon convertBase64ToImageIcon(List<String> base64Images) {
        List<ImageIcon> imageIcons = new ArrayList<>();
        for (String base64Image : base64Images) {
            try {
                byte[] imageBytes = Base64.getDecoder().decode(base64Image);
                ByteArrayInputStream bais = new ByteArrayInputStream(imageBytes);
                BufferedImage bufferedImage = ImageIO.read(bais);
                ImageIcon imageIcon = new ImageIcon(bufferedImage);
                imageIcons.add(imageIcon);
                break;
            } catch (IOException e) {
            }
        }
        return imageIcons.get(0);
    }
private void retrieveTourInfo() {
   
    }
   
}
