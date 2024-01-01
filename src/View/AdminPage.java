package View;

import Controller.Admin_Controller;
import com.mysql.jdbc.exceptions.MySQLIntegrityConstraintViolationException;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class AdminPage extends javax.swing.JFrame {

    Admin_Controller controller_admin;

    public AdminPage() {
        initComponents();
        controller_admin = new Admin_Controller(this);
        controller_admin.isiTableDosen();
        controller_admin.isiTableMahasiswa();
        controller_admin.isiTableRegis();
    }

    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_data_mahasiswa = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_data_dosen = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtcarimhs = new javax.swing.JTextField();
        btncarimhs = new javax.swing.JButton();
        btnrestmhs = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtcaridosen = new javax.swing.JTextField();
        btncaridosen = new javax.swing.JButton();
        btnrestdsn = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        table_permintaan_regis = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtrole = new javax.swing.JTextField();
        btnupdate = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btndelete = new javax.swing.JButton();
        txtnamapengguna = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtkode = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtusername = new javax.swing.JTextField();
        btnsimpan = new javax.swing.JButton();
        btnbatal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(169, 179, 136));
        setForeground(new java.awt.Color(182, 196, 182));

        jPanel3.setBackground(new java.awt.Color(48, 77, 48));

        jLabel1.setBackground(new java.awt.Color(238, 240, 229));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(236, 227, 206));
        jLabel1.setText("USER DATA");

        jPanel1.setBackground(new java.awt.Color(182, 196, 182));

        table_data_mahasiswa.setBackground(new java.awt.Color(238, 240, 229));
        table_data_mahasiswa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        table_data_mahasiswa.setModel(new javax.swing.table.DefaultTableModel(
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
        table_data_mahasiswa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_data_mahasiswaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_data_mahasiswa);

        table_data_dosen.setBackground(new java.awt.Color(238, 240, 229));
        table_data_dosen.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        table_data_dosen.setModel(new javax.swing.table.DefaultTableModel(
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
        table_data_dosen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_data_dosenMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table_data_dosen);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Tabel Mahasiswa");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Tabel Dosen");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Cari Nama");

        txtcarimhs.setBackground(new java.awt.Color(238, 240, 229));
        txtcarimhs.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btncarimhs.setBackground(new java.awt.Color(51, 255, 51));
        btncarimhs.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btncarimhs.setText("Cari");
        btncarimhs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncarimhsActionPerformed(evt);
            }
        });

        btnrestmhs.setBackground(new java.awt.Color(255, 102, 0));
        btnrestmhs.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnrestmhs.setText("Reset");
        btnrestmhs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrestmhsActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Cari Nama");

        txtcaridosen.setBackground(new java.awt.Color(238, 240, 229));
        txtcaridosen.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btncaridosen.setBackground(new java.awt.Color(51, 255, 51));
        btncaridosen.setText("Cari");
        btncaridosen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncaridosenActionPerformed(evt);
            }
        });

        btnrestdsn.setBackground(new java.awt.Color(255, 102, 0));
        btnrestdsn.setText("Reset");
        btnrestdsn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrestdsnActionPerformed(evt);
            }
        });

        table_permintaan_regis.setBackground(new java.awt.Color(238, 240, 229));
        table_permintaan_regis.setModel(new javax.swing.table.DefaultTableModel(
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
        table_permintaan_regis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_permintaan_regisMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(table_permintaan_regis);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Permintaan Registrasi");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel10)
                            .addGap(29, 29, 29)
                            .addComponent(txtcarimhs, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btncarimhs, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnrestmhs)
                            .addGap(122, 122, 122))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 665, Short.MAX_VALUE)))
                    .addComponent(jLabel11)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 665, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addGap(34, 34, 34)
                                    .addComponent(txtcaridosen, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btncaridosen, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(18, 18, 18)
                            .addComponent(btnrestdsn))
                        .addComponent(jScrollPane3)))
                .addGap(44, 44, 44))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtcaridosen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btncaridosen)
                    .addComponent(btnrestdsn))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcarimhs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(btncarimhs)
                    .addComponent(btnrestmhs))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(182, 196, 182));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Email");

        txtemail.setBackground(new java.awt.Color(238, 240, 229));
        txtemail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Role");

        txtrole.setBackground(new java.awt.Color(238, 240, 229));
        txtrole.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btnupdate.setBackground(new java.awt.Color(0, 175, 255));
        btnupdate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnupdate.setText("Update");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Nama Pengguna");

        btndelete.setBackground(new java.awt.Color(204, 0, 0));
        btndelete.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btndelete.setForeground(new java.awt.Color(255, 255, 255));
        btndelete.setText("Hapus");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });

        txtnamapengguna.setBackground(new java.awt.Color(238, 240, 229));
        txtnamapengguna.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Kode");

        txtkode.setBackground(new java.awt.Color(238, 240, 229));
        txtkode.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Username");

        txtusername.setBackground(new java.awt.Color(238, 240, 229));
        txtusername.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btnsimpan.setBackground(new java.awt.Color(0, 51, 255));
        btnsimpan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnsimpan.setForeground(new java.awt.Color(255, 255, 255));
        btnsimpan.setText("Simpan");
        btnsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsimpanActionPerformed(evt);
            }
        });

        btnbatal.setBackground(new java.awt.Color(255, 255, 255));
        btnbatal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnbatal.setText("Batal");
        btnbatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbatalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addComponent(btnsimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btndelete, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnbatal, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(txtnamapengguna, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtkode, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtusername, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtemail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtrole, javax.swing.GroupLayout.Alignment.LEADING)))
                .addGap(33, 33, 33))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(txtkode, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtnamapengguna, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtusername, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtrole, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btndelete, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnbatal, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(469, 469, 469)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed

        if (this.getTxtrole().getText().equals("dosen")) {
            controller_admin.updateDosen();
        } else {
            controller_admin.updateMahasiswa();
        }
        controller_admin.isiTableDosen();
        controller_admin.isiTableMahasiswa();
        controller_admin.reset();

    }//GEN-LAST:event_btnupdateActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        if (!this.getTxtusername().getText().isEmpty() & this.getTxtkode().getText().isEmpty()) {
            controller_admin.deleteRegis(this.getTxtusername().getText());
        } else {
            controller_admin.delete();
        }
        controller_admin.isiTableDosen();
        controller_admin.isiTableMahasiswa();
        controller_admin.isiTableRegis();
        controller_admin.reset();
    }//GEN-LAST:event_btndeleteActionPerformed

    private void btnbatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbatalActionPerformed
        controller_admin.reset();
    }//GEN-LAST:event_btnbatalActionPerformed

    private void btncarimhsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncarimhsActionPerformed
        System.out.println(txtcarimhs.getText());
        controller_admin.carinamamhs();

    }//GEN-LAST:event_btncarimhsActionPerformed

    private void btnrestmhsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrestmhsActionPerformed
        controller_admin.isiTableMahasiswa();
        controller_admin.reset();
    }//GEN-LAST:event_btnrestmhsActionPerformed

    private void btncaridosenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncaridosenActionPerformed
        controller_admin.carinamadsn();
    }//GEN-LAST:event_btncaridosenActionPerformed

    private void btnrestdsnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrestdsnActionPerformed
        controller_admin.isiTableDosen();
        controller_admin.reset();
    }//GEN-LAST:event_btnrestdsnActionPerformed

    private void table_data_mahasiswaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_data_mahasiswaMouseClicked
        controller_admin.isiFieldMhasiswa(table_data_mahasiswa.getSelectedRow());
    }//GEN-LAST:event_table_data_mahasiswaMouseClicked

    private void table_data_dosenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_data_dosenMouseClicked
        controller_admin.isiFieldDosen(table_data_dosen.getSelectedRow());
    }//GEN-LAST:event_table_data_dosenMouseClicked

    private void btnsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsimpanActionPerformed
        int select = table_permintaan_regis.getSelectedRow();
        if (select != -1) {
            if (this.getTxtrole().getText().equals("dosen")) {
                controller_admin.tambahDsnRegis(this.getTxtusername().getText());
            } else if (txtrole.getText().equals("mahasiswa")) {
                controller_admin.tambahMhsRegis(this.getTxtusername().getText());
            } else {
                JOptionPane.showMessageDialog(this, "pilih role yang benar");
            }
        } else {
            if (this.getTxtrole().getText().equals("dosen")) {
                controller_admin.tambahDsn();
            } else if (txtrole.getText().equals("mahasiswa")) {
                controller_admin.tambahMhs();
            } else {
                JOptionPane.showMessageDialog(this, "pilih role yang benar");
            }
        }
        controller_admin.isiTableDosen();
        controller_admin.isiTableMahasiswa();
        controller_admin.isiTableRegis();
    }//GEN-LAST:event_btnsimpanActionPerformed

    private void table_permintaan_regisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_permintaan_regisMouseClicked
        controller_admin.isiFieldRegister(table_permintaan_regis.getSelectedRow());
    }//GEN-LAST:event_table_permintaan_regisMouseClicked

    public JTable getTable_permintaan_regis() {
        return table_permintaan_regis;
    }

    public JButton getBtnbatal() {
        return btnbatal;
    }

    public JButton getBtncaridosen() {
        return btncaridosen;
    }

    public JButton getBtncarimhs() {
        return btncarimhs;
    }

    public JButton getBtndelete() {
        return btndelete;
    }

    public JButton getBtnrestmhs() {
        return btnrestmhs;
    }

    public JButton getBtnupdate() {
        return btnupdate;
    }

    public JTable getTable_data_dosen() {
        return table_data_dosen;
    }

    public JTable getTable_data_mahasiswa() {
        return table_data_mahasiswa;
    }

    public JTextField getTxtcaridosen() {
        return txtcaridosen;
    }

    public JTextField getTxtcarimhs() {
        return txtcarimhs;
    }

    public JTextField getTxtemail() {
        return txtemail;
    }

    public JTextField getTxtkode() {
        return txtkode;
    }

    public JTextField getTxtnamapengguna() {
        return txtnamapengguna;
    }

    public JTextField getTxtrole() {
        return txtrole;
    }

    public JTextField getTxtusername() {
        return txtusername;
    }

    public JButton getBtnrestdsn() {
        return btnrestdsn;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbatal;
    private javax.swing.JButton btncaridosen;
    private javax.swing.JButton btncarimhs;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnrestdsn;
    private javax.swing.JButton btnrestmhs;
    private javax.swing.JButton btnsimpan;
    private javax.swing.JButton btnupdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable table_data_dosen;
    private javax.swing.JTable table_data_mahasiswa;
    private javax.swing.JTable table_permintaan_regis;
    private javax.swing.JTextField txtcaridosen;
    private javax.swing.JTextField txtcarimhs;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtkode;
    private javax.swing.JTextField txtnamapengguna;
    private javax.swing.JTextField txtrole;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables
}
