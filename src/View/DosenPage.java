
package View;

import Controller.Dosen_Controller;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
   
public class DosenPage extends javax.swing.JFrame {

    Dosen_Controller controller;
    String username;
    public DosenPage(String username) {
        initComponents();
        controller = new Dosen_Controller(this,username);
        controller.profildata();
        setImageProfil(username);
        this.username = username;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txtnip = new javax.swing.JLabel();
        txtemail = new javax.swing.JLabel();
        txtusername = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Jlabelprofil = new javax.swing.JLabel();
        txtnama = new javax.swing.JLabel();
        txtrole = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        BtnBuatQuiz = new javax.swing.JButton();
        btnlihatnilai = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(48, 77, 48));

        jPanel2.setBackground(new java.awt.Color(182, 196, 182));

        txtnip.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txtnip.setText("jLabel4");

        txtemail.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txtemail.setText("jLabel6");

        txtusername.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txtusername.setText("jLabel5");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Profile");

        txtnama.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txtnama.setText("txt");

        txtrole.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txtrole.setText("jLabel7");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setText("Nama:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setText("NIP:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setText("Username:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setText("Email:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel6.setText("Role:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(Jlabelprofil, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(465, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(274, 274, 274)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addComponent(jLabel3)
                        .addComponent(jLabel2)
                        .addComponent(jLabel4)
                        .addComponent(jLabel5)
                        .addComponent(jLabel6))
                    .addGap(325, 325, 325))
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap(511, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtnip)
                        .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtusername)
                        .addComponent(txtemail)
                        .addComponent(txtrole))
                    .addGap(12, 12, 12)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(Jlabelprofil, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel3)
                    .addGap(36, 36, 36)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtnip)
                        .addComponent(jLabel2))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(txtusername))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(txtemail))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(txtrole))
                    .addContainerGap(42, Short.MAX_VALUE)))
        );

        BtnBuatQuiz.setBackground(new java.awt.Color(238, 240, 229));
        BtnBuatQuiz.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        BtnBuatQuiz.setText("Buat Quiz");
        BtnBuatQuiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuatQuizActionPerformed(evt);
            }
        });

        btnlihatnilai.setBackground(new java.awt.Color(238, 240, 229));
        btnlihatnilai.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnlihatnilai.setText("Lihat Nilai Mahasiswa");
        btnlihatnilai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlihatnilaiActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(238, 240, 229));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButton2.setText("Kirim Notifikasi");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BtnBuatQuiz, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(103, 103, 103)
                        .addComponent(btnlihatnilai, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(94, 94, 94)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnBuatQuiz, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnlihatnilai, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(100, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnBuatQuizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuatQuizActionPerformed
       new ViewSetQuiz(username).setVisible(true);
       this.dispose();
    }//GEN-LAST:event_BtnBuatQuizActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new View_Kirim_Notif(username).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnlihatnilaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlihatnilaiActionPerformed
        new ViewNilaiMahasiswa(username).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnlihatnilaiActionPerformed
    
    public void setImageProfil(String username){
        if(username.equals("doditebu")){
            ImageIcon icon = new ImageIcon(getClass().getResource("/Image/Dosen1.png"));
            Image img = icon.getImage().getScaledInstance(Jlabelprofil.getWidth(), Jlabelprofil.getHeight(), Image.SCALE_SMOOTH);
            Jlabelprofil.setIcon(new ImageIcon(img));
        }else{
            ImageIcon icon = new ImageIcon(getClass().getResource("/Image/Dosen2.png"));
            Image img = icon.getImage().getScaledInstance(Jlabelprofil.getWidth(), Jlabelprofil.getHeight(), Image.SCALE_SMOOTH);
            Jlabelprofil.setIcon(new ImageIcon(img));
        }
        
    }
    public JLabel getTxtemail() {
        return txtemail;
    }

    public void setTxtemail(JLabel txtemail) {
        this.txtemail = txtemail;
    }

    public JLabel getTxtnama() {
        return txtnama;
    }

    public void setTxtnama(JLabel txtnama) {
        this.txtnama = txtnama;
    }

    public JLabel getTxtnip() {
        return txtnip;
    }

    public void setTxtnip(JLabel txtnip) {
        this.txtnip = txtnip;
    }

    public JLabel getTxtrole() {
        return txtrole;
    }

    public void setTxtrole(JLabel txtrole) {
        this.txtrole = txtrole;
    }

    public JLabel getTxtusername() {
        return txtusername;
    }

    public void setTxtusername(JLabel txtusername) {
        this.txtusername = txtusername;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBuatQuiz;
    private javax.swing.JLabel Jlabelprofil;
    private javax.swing.JButton btnlihatnilai;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel txtemail;
    private javax.swing.JLabel txtnama;
    private javax.swing.JLabel txtnip;
    private javax.swing.JLabel txtrole;
    private javax.swing.JLabel txtusername;
    // End of variables declaration//GEN-END:variables
}
