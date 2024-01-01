
package View;

import Controller.Mahasiswa_Controller;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTable;



public class MahasiswaPage extends javax.swing.JFrame {
    
    Mahasiswa_Controller controller;
    String username;
    QuizView quiz;

    public MahasiswaPage(String username) {
        initComponents();
        controller = new Mahasiswa_Controller(this,username);
        controller.profil();
        setImageProfil(username);
        this.username = username;
        controller.showNilai();
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jDialog2 = new javax.swing.JDialog();
        jDialog3 = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtnama = new javax.swing.JLabel();
        txtuser = new javax.swing.JLabel();
        txtemail = new javax.swing.JLabel();
        txtnim = new javax.swing.JLabel();
        txtrole = new javax.swing.JLabel();
        Jlabelprofil = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablenilai = new javax.swing.JTable();
        txtnama1 = new javax.swing.JLabel();
        txtnama2 = new javax.swing.JLabel();
        txtnama3 = new javax.swing.JLabel();
        txtnama4 = new javax.swing.JLabel();
        txtnama5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnnotif = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listquiz = new javax.swing.JList<>();
        btnquiz = new javax.swing.JButton();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 592, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 344, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog3Layout = new javax.swing.GroupLayout(jDialog3.getContentPane());
        jDialog3.getContentPane().setLayout(jDialog3Layout);
        jDialog3Layout.setHorizontalGroup(
            jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog3Layout.setVerticalGroup(
            jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(48, 77, 48));

        jPanel1.setBackground(new java.awt.Color(48, 77, 48));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(236, 227, 206));
        jLabel2.setText("Academic Activity ");

        jPanel2.setBackground(new java.awt.Color(182, 196, 182));
        jPanel2.setForeground(new java.awt.Color(182, 196, 182));

        jPanel5.setBackground(new java.awt.Color(182, 196, 182));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Quiz Scores");

        txtnama.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtnama.setText("Nama  ");
        txtnama.setToolTipText("");

        txtuser.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtuser.setText("Username");

        txtemail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtemail.setText("Email");

        txtnim.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtnim.setText("NIm");

        txtrole.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtrole.setText("Role");

        tablenilai.setBackground(new java.awt.Color(182, 196, 182));
        tablenilai.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tablenilai.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablenilai.setSelectionForeground(new java.awt.Color(182, 196, 182));
        jScrollPane2.setViewportView(tablenilai);

        txtnama1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtnama1.setText("Nama         :");
        txtnama1.setToolTipText("");

        txtnama2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtnama2.setText("Email          :");
        txtnama2.setToolTipText("");

        txtnama3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtnama3.setText("Username   :");
        txtnama3.setToolTipText("");

        txtnama4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtnama4.setText("Role           :");
        txtnama4.setToolTipText("");

        txtnama5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtnama5.setText("Nim            :");
        txtnama5.setToolTipText("");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Profile");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(Jlabelprofil, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtnama2)
                            .addComponent(txtnama4)
                            .addComponent(txtnama5)
                            .addComponent(txtnama3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtnama1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtnama)
                            .addComponent(txtrole)
                            .addComponent(txtuser)
                            .addComponent(txtemail)
                            .addComponent(txtnim))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(txtnama1)
                                .addGap(18, 18, 18)
                                .addComponent(txtnama3)
                                .addGap(18, 18, 18)
                                .addComponent(txtnama2)
                                .addGap(18, 18, 18)
                                .addComponent(txtnama5)
                                .addGap(18, 18, 18)
                                .addComponent(txtnama4))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(txtnama)
                                .addGap(18, 18, 18)
                                .addComponent(txtuser)
                                .addGap(18, 18, 18)
                                .addComponent(txtemail)
                                .addGap(18, 18, 18)
                                .addComponent(txtnim)
                                .addGap(18, 18, 18)
                                .addComponent(txtrole))
                            .addComponent(Jlabelprofil, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        jPanel3.setBackground(new java.awt.Color(182, 196, 182));

        btnnotif.setBackground(new java.awt.Color(238, 240, 229));
        btnnotif.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnnotif.setText("Lihat Notifikasi");
        btnnotif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnotifActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnnotif)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnnotif, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(182, 196, 182));

        listquiz.setBackground(new java.awt.Color(182, 196, 182));
        listquiz.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        listquiz.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Object Oriented Programming", "Basis Data", "Jaringan Enterprise", " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listquiz);

        btnquiz.setBackground(new java.awt.Color(238, 240, 229));
        btnquiz.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnquiz.setText("Kerjakan Quiz");
        btnquiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnquizActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(btnquiz, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnquiz, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(26, 26, 26)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(348, 348, 348)
                        .addComponent(jLabel2)))
                .addContainerGap(97, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102))
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

    private void btnquizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnquizActionPerformed
        controller.pengerjaanquiz();
    }//GEN-LAST:event_btnquizActionPerformed

    private void btnnotifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnotifActionPerformed
       controller.lihatnotif();
    }//GEN-LAST:event_btnnotifActionPerformed
        public void setImageProfil(String username){
        if(username.equals("yazidmhd")){
            ImageIcon icon = new ImageIcon(getClass().getResource("/Image/Mhs1.png"));
            Image img = icon.getImage().getScaledInstance(Jlabelprofil.getWidth(), Jlabelprofil.getHeight(), Image.SCALE_SMOOTH);
            Jlabelprofil.setIcon(new ImageIcon(img));
        }else if(username.equals("lendraaz")){
            ImageIcon icon = new ImageIcon(getClass().getResource("/Image/Mhs2.png"));
            Image img = icon.getImage().getScaledInstance(Jlabelprofil.getWidth(), Jlabelprofil.getHeight(), Image.SCALE_SMOOTH);
            Jlabelprofil.setIcon(new ImageIcon(img));
        }else if(username.equals("irfanzh")){
            ImageIcon icon = new ImageIcon(getClass().getResource("/Image/Mhs3.png"));
            Image img = icon.getImage().getScaledInstance(Jlabelprofil.getWidth(), Jlabelprofil.getHeight(), Image.SCALE_SMOOTH);
            Jlabelprofil.setIcon(new ImageIcon(img));
        }else if(username.equals("rafim")){
            ImageIcon icon = new ImageIcon(getClass().getResource("/Image/Mhs5.png"));
            Image img = icon.getImage().getScaledInstance(Jlabelprofil.getWidth(), Jlabelprofil.getHeight(), Image.SCALE_SMOOTH);
            Jlabelprofil.setIcon(new ImageIcon(img));
        }else{
            ImageIcon icon = new ImageIcon(getClass().getResource("/Image/Mhs4.png"));
            Image img = icon.getImage().getScaledInstance(Jlabelprofil.getWidth(), Jlabelprofil.getHeight(), Image.SCALE_SMOOTH);
            Jlabelprofil.setIcon(new ImageIcon(img));
        }
        
    }

    public JLabel getTxtuser() {
        return txtuser;
    }

    public JButton getBtnnotif() {
        return btnnotif;
    }

    public JTable getTablenilai() {
        return tablenilai;
    }

    public void setTablenilai(JTable tablenilai) {
        this.tablenilai = tablenilai;
    }



    public JButton getBtnquiz() {
        return btnquiz;
    }


    public JDialog getjDialog1() {
        return jDialog1;
    }


    public JList<String> getListquiz() {
        return listquiz;
    }


    public JLabel getTxtemail() {
        return txtemail;
    }


    public JLabel getTxtnama() {
        return txtnama;
    }



    public JLabel getTxtnim() {
        return txtnim;
    }


    public JLabel getTxtrole() {
        return txtrole;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Jlabelprofil;
    private javax.swing.JButton btnnotif;
    private javax.swing.JButton btnquiz;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JDialog jDialog3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> listquiz;
    private javax.swing.JTable tablenilai;
    private javax.swing.JLabel txtemail;
    private javax.swing.JLabel txtnama;
    private javax.swing.JLabel txtnama1;
    private javax.swing.JLabel txtnama2;
    private javax.swing.JLabel txtnama3;
    private javax.swing.JLabel txtnama4;
    private javax.swing.JLabel txtnama5;
    private javax.swing.JLabel txtnim;
    private javax.swing.JLabel txtrole;
    private javax.swing.JLabel txtuser;
    // End of variables declaration//GEN-END:variables
}
