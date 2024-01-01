/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.SetQuiz_Controller;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author ASUS
 */
public class ViewSetQuiz extends javax.swing.JFrame {

    SetQuiz_Controller controller;
    String username;
    public ViewSetQuiz(String username) {
        initComponents();
        controller = new SetQuiz_Controller(this);
        this.username = username;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtareasoal = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtpilihan1 = new javax.swing.JTextField();
        txtpilihan2 = new javax.swing.JTextField();
        txtpilihan3 = new javax.swing.JTextField();
        txtpilihan4 = new javax.swing.JTextField();
        btntambah = new javax.swing.JButton();
        btnreset = new javax.swing.JButton();
        btnkembali = new javax.swing.JButton();
        cbmatakuliah = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtjawban = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(48, 77, 48));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(236, 227, 206));
        jLabel1.setText("MAKE A QUESTION");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(182, 196, 182));
        jLabel3.setText("Soal");

        txtareasoal.setBackground(new java.awt.Color(238, 240, 229));
        txtareasoal.setColumns(20);
        txtareasoal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtareasoal.setRows(5);
        jScrollPane1.setViewportView(txtareasoal);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(182, 196, 182));
        jLabel4.setText("Pilihan 1");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(182, 196, 182));
        jLabel5.setText("Pilihan 2");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(182, 196, 182));
        jLabel6.setText("Pilihan 3");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(182, 196, 182));
        jLabel7.setText("Pilihan 4");

        txtpilihan1.setBackground(new java.awt.Color(238, 240, 229));
        txtpilihan1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtpilihan2.setBackground(new java.awt.Color(238, 240, 229));
        txtpilihan2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtpilihan2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpilihan2ActionPerformed(evt);
            }
        });

        txtpilihan3.setBackground(new java.awt.Color(238, 240, 229));
        txtpilihan3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtpilihan4.setBackground(new java.awt.Color(238, 240, 229));
        txtpilihan4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btntambah.setBackground(new java.awt.Color(51, 255, 0));
        btntambah.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btntambah.setText("Tambah Quiz");
        btntambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntambahActionPerformed(evt);
            }
        });

        btnreset.setBackground(new java.awt.Color(255, 0, 0));
        btnreset.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnreset.setForeground(new java.awt.Color(255, 255, 255));
        btnreset.setText("Batal");
        btnreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnresetActionPerformed(evt);
            }
        });

        btnkembali.setBackground(new java.awt.Color(255, 255, 255));
        btnkembali.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnkembali.setText("Kembali");
        btnkembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkembaliActionPerformed(evt);
            }
        });

        cbmatakuliah.setBackground(new java.awt.Color(238, 240, 229));
        cbmatakuliah.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbmatakuliah.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Select --", "Object Oriented Programming", "Basis Data", "Jaringan Enterprise" }));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(182, 196, 182));
        jLabel8.setText("Matakuliah");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(182, 196, 182));
        jLabel2.setText("Jawaban");

        txtjawban.setBackground(new java.awt.Color(238, 240, 229));
        txtjawban.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtjawban.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtjawbanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel5)
                        .addComponent(jLabel4)
                        .addComponent(jLabel6)
                        .addComponent(jLabel7))
                    .addComponent(jLabel3)
                    .addComponent(jLabel8)
                    .addComponent(jLabel2))
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbmatakuliah, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btntambah, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)
                        .addComponent(btnreset, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnkembali, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 675, Short.MAX_VALUE)
                    .addComponent(txtpilihan4, javax.swing.GroupLayout.DEFAULT_SIZE, 675, Short.MAX_VALUE)
                    .addComponent(txtpilihan3)
                    .addComponent(txtpilihan1)
                    .addComponent(txtpilihan2)
                    .addComponent(txtjawban))
                .addContainerGap(100, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(366, 366, 366))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbmatakuliah, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtpilihan1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtpilihan2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtpilihan3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtpilihan4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtjawban, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btntambah, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnkembali, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnreset, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(82, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtpilihan2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpilihan2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpilihan2ActionPerformed

    private void txtjawbanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtjawbanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtjawbanActionPerformed

    private void btntambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntambahActionPerformed
        controller.simpanQuiz();
        controller.reset();
    }//GEN-LAST:event_btntambahActionPerformed

    private void btnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresetActionPerformed
        controller.reset();
    }//GEN-LAST:event_btnresetActionPerformed

    private void btnkembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkembaliActionPerformed
        new DosenPage(this.username).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnkembaliActionPerformed

    public JTextField getTxtjawban() {
        return txtjawban;
    }

    public void setTxtjawban(JTextField txtjawban) {
        this.txtjawban = txtjawban;
    }

    public JButton getBtnreset() {
        return btnreset;
    }

    public void setBtnreset(JButton btnreset) {
        this.btnreset = btnreset;
    }

    public JButton getBtntambah() {
        return btntambah;
    }

    public void setBtntambah(JButton btntambah) {
        this.btntambah = btntambah;
    }

    public JComboBox<String> getCbmatakuliah() {
        return cbmatakuliah;
    }

    public void setCbmatakuliah(JComboBox<String> cbmatakuliah) {
        this.cbmatakuliah = cbmatakuliah;
    }

    public JTextArea getTxtareasoal() {
        return txtareasoal;
    }

    public void setTxtareasoal(JTextArea txtareasoal) {
        this.txtareasoal = txtareasoal;
    }

    public JTextField getTxtpilihan1() {
        return txtpilihan1;
    }

    public void setTxtpilihan1(JTextField txtpilihan1) {
        this.txtpilihan1 = txtpilihan1;
    }

    public JTextField getTxtpilihan2() {
        return txtpilihan2;
    }

    public void setTxtpilihan2(JTextField txtpilihan2) {
        this.txtpilihan2 = txtpilihan2;
    }

    public JTextField getTxtpilihan3() {
        return txtpilihan3;
    }

    public void setTxtpilihan3(JTextField txtpilihan3) {
        this.txtpilihan3 = txtpilihan3;
    }

    public JTextField getTxtpilihan4() {
        return txtpilihan4;
    }

    public void setTxtpilihan4(JTextField txtpilihan4) {
        this.txtpilihan4 = txtpilihan4;
    }

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnkembali;
    private javax.swing.JButton btnreset;
    private javax.swing.JButton btntambah;
    private javax.swing.JComboBox<String> cbmatakuliah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtareasoal;
    private javax.swing.JTextField txtjawban;
    private javax.swing.JTextField txtpilihan1;
    private javax.swing.JTextField txtpilihan2;
    private javax.swing.JTextField txtpilihan3;
    private javax.swing.JTextField txtpilihan4;
    // End of variables declaration//GEN-END:variables
}
