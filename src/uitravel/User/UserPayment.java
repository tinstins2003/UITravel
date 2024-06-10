/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package uitravel.User;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.Firestore;
import com.google.firebase.cloud.FirestoreClient;
import java.awt.event.MouseListener;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import uitravel.UserMain;

/**
 *
 * @author ACER
 */
public class UserPayment extends javax.swing.JPanel {
    private String userID;
    private MouseListener eventCancel;
    private Double prices;
    Firestore firestore = FirestoreClient.getFirestore();
    public UserPayment() {
        initComponents();
        init();
    }
    private void init(){
        pay.setVisible(false);
        info.setVisible(true);
        
    }
    public void setUID(String UID){
        this.userID = UID;
        loadUserData();
    }
    private void loadUserData() {
         try {
            DocumentReference docRef  = firestore.collection("user").document(userID);
            ApiFuture<DocumentSnapshot> future = docRef.get();
            // Block on response
            DocumentSnapshot document;  
            document = future.get();
            System.out.println(document.getString("FullName"));
            if(document.exists()){
                txtName.setText(document.getString("FullName"));
                txtEmail.setText(document.getString("Email"));
                txtPhoneNum.setText(document.getString("PhoneNumber"));
            }
        }
        catch (ExecutionException | InterruptedException ex) {
            Logger.getLogger(UserMain.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    public void setTicketData(int[] tickets){
        txtTickets.setText(" x " +String.valueOf(tickets[0]));
        txtAdultNum.setText(" x " +String.valueOf(tickets[1]));
        txtChildrenNum.setText(" x " +String.valueOf(tickets[2]));
        txtInfantNum.setText(" x " +String.valueOf(tickets[3]));
    }
    public void setPrices(Double price){
        this.prices = price;
        Locale vn = new Locale("vi","VN");
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(vn);
        txtCost.setText(currencyFormatter.format(prices));
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new uitravel.Components.RoundedPanel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        info = new javax.swing.JPanel();
        txtName3 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        txtName = new uitravel.Components.TextField();
        txtEmail = new uitravel.Components.TextField();
        txtPhoneNum = new uitravel.Components.TextField();
        btnNext = new uitravel.Components.MyButton();
        roundedPanel2 = new uitravel.Components.RoundedPanel();
        txtName2 = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        txtAdultNum1 = new javax.swing.JLabel();
        txtChildrenNum1 = new javax.swing.JLabel();
        txtInfantNum1 = new javax.swing.JLabel();
        txtCost = new javax.swing.JLabel();
        ttxLabl1 = new javax.swing.JLabel();
        txtInfantNum = new javax.swing.JLabel();
        txtChildrenNum = new javax.swing.JLabel();
        txtAdultNum = new javax.swing.JLabel();
        pic = new uitravel.Components.RoundedImage();
        txtTime = new javax.swing.JLabel();
        txtTickets = new javax.swing.JLabel();
        pay = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtCardName = new uitravel.Components.TextField();
        txtCardID = new uitravel.Components.TextField();
        txtCardCVC = new uitravel.Components.TextField();
        btnsubmit = new uitravel.Components.MyButton();
        txtCardDate = new uitravel.Components.TextField();
        txtback = new javax.swing.JLabel();

        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1114, 600));
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.PAGE_AXIS));

        bg.setBackground(new java.awt.Color(255, 255, 255));

        info.setOpaque(false);

        txtName3.setColumns(20);
        txtName3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        txtName3.setLineWrap(true);
        txtName3.setRows(5);
        txtName3.setText("Hoi An Basket Boat Tour Hoi An Basket Boat Tour Hoi An Basket Boat Tour Hoi An Basket Boat Tour Hoi An Basket Boat Tour Hoi An Basket Boat Tour ");
        txtName3.setWrapStyleWord(true);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Thông tin của bạn ");

        txtName.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtName.setLabelText("Tên:");

        txtEmail.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtEmail.setLabelText("Địa chỉ Email:");

        txtPhoneNum.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtPhoneNum.setLabelText("Số điện thoại:");

        btnNext.setForeground(new java.awt.Color(255, 255, 255));
        btnNext.setText("Tiếp tục thanh toán");
        btnNext.setBorderColor(new java.awt.Color(51, 0, 255));
        btnNext.setColor(new java.awt.Color(51, 0, 255));
        btnNext.setColorClick(new java.awt.Color(51, 0, 255));
        btnNext.setColorOver(new java.awt.Color(51, 0, 255));
        btnNext.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btnNext.setRadius(10);
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout infoLayout = new javax.swing.GroupLayout(info);
        info.setLayout(infoLayout);
        infoLayout.setHorizontalGroup(
            infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(infoLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(infoLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPhoneNum, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1))
                .addContainerGap(356, Short.MAX_VALUE))
            .addGroup(infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(infoLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(txtName3, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        infoLayout.setVerticalGroup(
            infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, infoLayout.createSequentialGroup()
                .addContainerGap(117, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(txtPhoneNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
            .addGroup(infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(infoLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(txtName3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(401, Short.MAX_VALUE)))
        );

        roundedPanel2.setBackground(new java.awt.Color(255, 255, 255));
        roundedPanel2.setBorderColor(new java.awt.Color(0, 51, 204));
        roundedPanel2.setWithBorder(true);

        txtName2.setColumns(20);
        txtName2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtName2.setLineWrap(true);
        txtName2.setRows(5);
        txtName2.setText("Hoi An Basket Boat Tour Hoi An Basket Boat Tour Hoi An Basket Boat Tour Hoi An Basket Boat Tour Hoi An Basket Boat Tour Hoi An Basket Boat Tour ");
        txtName2.setWrapStyleWord(true);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel10.setText("Số lượng vé:");

        txtAdultNum1.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txtAdultNum1.setText("Người lớn ");

        txtChildrenNum1.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txtChildrenNum1.setText("Trẻ em");

        txtInfantNum1.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txtInfantNum1.setText("Trẻ sơ sinh");

        txtCost.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        txtCost.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtCost.setText("Tổng cộng");

        ttxLabl1.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        ttxLabl1.setText("Tổng giá:");

        txtInfantNum.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txtInfantNum.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtInfantNum.setText("Trẻ sơ sinh");

        txtChildrenNum.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txtChildrenNum.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtChildrenNum.setText("Trẻ sơ sinh");

        txtAdultNum.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txtAdultNum.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtAdultNum.setText("Trẻ sơ sinh");

        pic.setRadius(30);

        javax.swing.GroupLayout picLayout = new javax.swing.GroupLayout(pic);
        pic.setLayout(picLayout);
        picLayout.setHorizontalGroup(
            picLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        picLayout.setVerticalGroup(
            picLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        txtTime.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txtTime.setText("Th 5, 6 thg 6 08:00");

        txtTickets.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        txtTickets.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtTickets.setText("Số lượng vé:");

        javax.swing.GroupLayout roundedPanel2Layout = new javax.swing.GroupLayout(roundedPanel2);
        roundedPanel2.setLayout(roundedPanel2Layout);
        roundedPanel2Layout.setHorizontalGroup(
            roundedPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel2Layout.createSequentialGroup()
                .addGroup(roundedPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(roundedPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(roundedPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(roundedPanel2Layout.createSequentialGroup()
                                .addGroup(roundedPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtAdultNum1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtChildrenNum1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtInfantNum1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addGroup(roundedPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtInfantNum, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtChildrenNum, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAdultNum, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(roundedPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtTickets))
                            .addGroup(roundedPanel2Layout.createSequentialGroup()
                                .addComponent(ttxLabl1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(61, 61, 61)
                                .addComponent(txtCost, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(roundedPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(roundedPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(roundedPanel2Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(txtTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(txtName2, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(20, 20, 20))
        );
        roundedPanel2Layout.setVerticalGroup(
            roundedPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel2Layout.createSequentialGroup()
                .addGroup(roundedPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(roundedPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtName2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTime))
                    .addGroup(roundedPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21)
                .addGroup(roundedPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtTickets))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(roundedPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAdultNum1)
                    .addComponent(txtAdultNum))
                .addGap(18, 18, 18)
                .addGroup(roundedPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtChildrenNum1)
                    .addComponent(txtChildrenNum))
                .addGap(18, 18, 18)
                .addGroup(roundedPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtInfantNum1)
                    .addComponent(txtInfantNum))
                .addGap(18, 18, 18)
                .addGroup(roundedPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ttxLabl1)
                    .addComponent(txtCost))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pay.setOpaque(false);
        pay.setPreferredSize(new java.awt.Dimension(755, 469));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("Kiểm tra và thanh toán ");

        txtCardName.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtCardName.setLabelText("Tên chủ thẻ:");
        txtCardName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCardNameActionPerformed(evt);
            }
        });

        txtCardID.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtCardID.setLabelText("Số thẻ:");

        txtCardCVC.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtCardCVC.setLabelText("CVC:");

        btnsubmit.setForeground(new java.awt.Color(255, 255, 255));
        btnsubmit.setText("Hoàn tất đơn đặt");
        btnsubmit.setBorderColor(new java.awt.Color(51, 0, 255));
        btnsubmit.setColor(new java.awt.Color(51, 0, 255));
        btnsubmit.setColorClick(new java.awt.Color(51, 0, 255));
        btnsubmit.setColorOver(new java.awt.Color(51, 0, 255));
        btnsubmit.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btnsubmit.setRadius(10);
        btnsubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsubmitActionPerformed(evt);
            }
        });

        txtCardDate.setText("MM/YYYY");
        txtCardDate.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtCardDate.setLabelText("Ngày hết hạn:");
        txtCardDate.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCardDateFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCardDateFocusLost(evt);
            }
        });

        javax.swing.GroupLayout payLayout = new javax.swing.GroupLayout(pay);
        pay.setLayout(payLayout);
        payLayout.setHorizontalGroup(
            payLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(payLayout.createSequentialGroup()
                .addGroup(payLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(payLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel2))
                    .addGroup(payLayout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(payLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCardName, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCardID, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(payLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(btnsubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, payLayout.createSequentialGroup()
                                .addComponent(txtCardDate, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtCardCVC, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(356, Short.MAX_VALUE))
        );
        payLayout.setVerticalGroup(
            payLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, payLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel2)
                .addGap(37, 37, 37)
                .addComponent(txtCardName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(txtCardID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(payLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCardDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCardCVC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(btnsubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        txtback.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtback.setForeground(new java.awt.Color(0, 51, 255));
        txtback.setText("< Loại vé");
        txtback.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtbackMousePressed(evt);
            }
        });

        jLayeredPane1.setLayer(info, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(roundedPanel2, javax.swing.JLayeredPane.POPUP_LAYER);
        jLayeredPane1.setLayer(pay, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.setLayer(txtback, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(info, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(txtback)))
                .addContainerGap(309, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addContainerGap(1053, Short.MAX_VALUE)
                    .addComponent(roundedPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(100, 100, 100)))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addGap(50, 50, 50)
                    .addComponent(pay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(321, Short.MAX_VALUE)))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(txtback)
                .addGap(18, 18, 18)
                .addComponent(info, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addGap(88, 88, 88)
                    .addComponent(roundedPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(131, Short.MAX_VALUE)))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addGap(50, 50, 50)
                    .addComponent(pay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(32, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1)
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1)
        );

        add(bg);
    }// </editor-fold>//GEN-END:initComponents

    private void txtCardNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCardNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCardNameActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        if(txtName.getText().equals("")){
            JOptionPane.showMessageDialog(null,
                        "Vui lòng nhập họ và tên!",
                        "Thông báo!",
                        
                        JOptionPane.INFORMATION_MESSAGE);
        }else if(txtEmail.getText().equals("")){
             JOptionPane.showMessageDialog(null,
                        "Vui lòng nhập địa chỉ email!",
                        "Thông báo!",
                        
                        JOptionPane.INFORMATION_MESSAGE);
        }
        else if(txtPhoneNum.getText().equals("")){
             JOptionPane.showMessageDialog(null,
                        "Vui lòng nhập số điện thoại!",
                        "Thông báo!",
                        
                        JOptionPane.INFORMATION_MESSAGE);
        }
        else{
              info.setVisible(false);
        pay.setVisible(true);
        txtback.setText("< Thông tin của bạn");
        }
    }//GEN-LAST:event_btnNextActionPerformed
    public void eventCancel(MouseListener event) {
        this.eventCancel = event;
    }
    private void txtbackMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtbackMousePressed
        if("< Thông tin của bạn".equals(txtback.getText())){
            info.setVisible(true);
            pay.setVisible(false);
            txtback.setText("< Loại vé");
        }
        else{
            eventCancel.mousePressed(evt);
        }
    }//GEN-LAST:event_txtbackMousePressed

    private void btnsubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsubmitActionPerformed
          if(txtCardName.getText().equals("")){
            JOptionPane.showMessageDialog(null,
                        "Vui lòng nhập tên của chủ thẻ!",
                        "Thông báo!",
                        
                        JOptionPane.INFORMATION_MESSAGE);
        }else if(txtCardID.getText().equals("")){
             JOptionPane.showMessageDialog(null,
                        "Vui lòng nhập số thẻ!",
                        "Thông báo!",
                        
                        JOptionPane.INFORMATION_MESSAGE);
        }
        else if(txtCardDate.getText().equals("")||txtCardDate.getText().equals("MM/YYYY")){
             JOptionPane.showMessageDialog(null,
                        "Vui lòng nhập hạn thẻ thoại!",
                        "Thông báo!",
                        
                        JOptionPane.INFORMATION_MESSAGE);
        }
        else if(txtCardCVC.getText().equals("")){
             JOptionPane.showMessageDialog(null,
                        "Vui lòng nhập số điện thoại!",
                        "Thông báo!",
                        
                        JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            // uploadBookingTicket
        }
    }//GEN-LAST:event_btnsubmitActionPerformed

    private void txtCardDateFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCardDateFocusGained
        if(txtCardDate.getText().equals("MM/YYYY")){
            txtCardDate.setText("");
        }
    }//GEN-LAST:event_txtCardDateFocusGained

    private void txtCardDateFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCardDateFocusLost
        if(txtCardDate.getText().equals("")){
            txtCardDate.setText("MM/YYYY");
        }
    }//GEN-LAST:event_txtCardDateFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private uitravel.Components.RoundedPanel bg;
    private uitravel.Components.MyButton btnNext;
    private uitravel.Components.MyButton btnsubmit;
    private javax.swing.JPanel info;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel pay;
    private uitravel.Components.RoundedImage pic;
    private uitravel.Components.RoundedPanel roundedPanel2;
    private javax.swing.JLabel ttxLabl1;
    private javax.swing.JLabel txtAdultNum;
    private javax.swing.JLabel txtAdultNum1;
    private uitravel.Components.TextField txtCardCVC;
    private uitravel.Components.TextField txtCardDate;
    private uitravel.Components.TextField txtCardID;
    private uitravel.Components.TextField txtCardName;
    private javax.swing.JLabel txtChildrenNum;
    private javax.swing.JLabel txtChildrenNum1;
    private javax.swing.JLabel txtCost;
    private uitravel.Components.TextField txtEmail;
    private javax.swing.JLabel txtInfantNum;
    private javax.swing.JLabel txtInfantNum1;
    private uitravel.Components.TextField txtName;
    private javax.swing.JTextArea txtName2;
    private javax.swing.JTextArea txtName3;
    private uitravel.Components.TextField txtPhoneNum;
    private javax.swing.JLabel txtTickets;
    private javax.swing.JLabel txtTime;
    private javax.swing.JLabel txtback;
    // End of variables declaration//GEN-END:variables


}
