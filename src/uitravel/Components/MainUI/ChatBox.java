/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package uitravel.Components.MainUI;

import javax.swing.JScrollBar;
import net.miginfocom.swing.MigLayout;
import uitravel.Components.MainUI.Chat.ChatLeft;
import uitravel.Components.MainUI.Chat.ChatRight;

/**
 *
 * @author ACER
 */
public final class ChatBox extends javax.swing.JPanel {

    /**
     * Creates new form ChatBox
     */
    public ChatBox() {
        initComponents();
        init();
        for(int i=0;i<10;i++){
            addLeft("asdas asdasdsadasssssssss sssssssssssssssdssss sssssssssssdsssssssssssssssdsssssssssssssssd");
            addRight("asdas asdasdsadasssssssss sssssssssssssssdssss sssssssssssdsssssssssssssssdsssssssssssssssd");
        }
    }
    private void init(){
        box.setLayout(new MigLayout("fillx"));
    }
    public void addLeft(String temp){
        ChatLeft item = new ChatLeft();
        item.setText(temp);
        box.add(item, "wrap, w ::80%");
        box.repaint();
        box.revalidate();
    }
    public void addRight(String temp){
        ChatRight item = new ChatRight();
        item.setText(temp);
        box.add(item, "wrap,al right, w ::80%");
        box.repaint();
        box.revalidate();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        roundedPanel1 = new uitravel.Components.RoundedPanel();
        bg = new javax.swing.JScrollPane();
        box = new javax.swing.JPanel();
        txtInput = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setOpaque(false);

        roundedPanel1.setBackground(new java.awt.Color(0, 51, 255));
        roundedPanel1.setOpaque(false);
        roundedPanel1.setRadius(30);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setBorder(null);
        bg.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        bg.setAutoscrolls(true);
        bg.setOpaque(false);
        bg.setPreferredSize(new java.awt.Dimension(370, 331));

        box.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout boxLayout = new javax.swing.GroupLayout(box);
        box.setLayout(boxLayout);
        boxLayout.setHorizontalGroup(
            boxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 381, Short.MAX_VALUE)
        );
        boxLayout.setVerticalGroup(
            boxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 311, Short.MAX_VALUE)
        );

        bg.setViewportView(box);

        txtInput.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtInput.setText("Nhập tin nhắn của bạn ở đây");
        txtInput.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtInputFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtInputFocusLost(evt);
            }
        });

        btnSubmit.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnSubmit.setText("Gửi");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Trung tâm hỗ trợ");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("X");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel2MousePressed(evt);
            }
        });

        javax.swing.GroupLayout roundedPanel1Layout = new javax.swing.GroupLayout(roundedPanel1);
        roundedPanel1.setLayout(roundedPanel1Layout);
        roundedPanel1Layout.setHorizontalGroup(
            roundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(roundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(roundedPanel1Layout.createSequentialGroup()
                        .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 381, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(roundedPanel1Layout.createSequentialGroup()
                        .addComponent(txtInput, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(roundedPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(20, 20, 20))))
        );
        roundedPanel1Layout.setVerticalGroup(
            roundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(roundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(roundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtInput)
                    .addComponent(btnSubmit, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(roundedPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(roundedPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MousePressed
        setVisible(false);
    }//GEN-LAST:event_jLabel2MousePressed

    private void txtInputFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtInputFocusGained
       if("Nhập tin nhắn của bạn ở đây".equals(txtInput.getText())){
           txtInput.setText("");
       }
    }//GEN-LAST:event_txtInputFocusGained

    private void txtInputFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtInputFocusLost
       if("".equals(txtInput.getText())){
           txtInput.setText("Nhập tin nhắn của bạn ở đây");
       }
    }//GEN-LAST:event_txtInputFocusLost

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        if(!("Nhập tin nhắn của bạn ở đây".equals(txtInput.getText())||"".equals(txtInput.getText()))){
            addRight(txtInput.getText());
            txtInput.setText("");
            JScrollBar verticalBar = bg.getVerticalScrollBar();
            verticalBar.setValue(verticalBar.getMaximum());
        }
    }//GEN-LAST:event_btnSubmitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane bg;
    private javax.swing.JPanel box;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private uitravel.Components.RoundedPanel roundedPanel1;
    private javax.swing.JTextField txtInput;
    // End of variables declaration//GEN-END:variables
}
