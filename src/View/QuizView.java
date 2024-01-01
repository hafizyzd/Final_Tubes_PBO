package View;

import Controller.QuizController;
import DAOListener.Listener_Mahasiswa;
import DataAccessObject.DAO_Mahasiswa;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class QuizView extends javax.swing.JFrame {

    QuizController quizcontroller;
    int index = 0;
    int nilai = 0;
    private ButtonGroup buttonG;
    String username;
    Listener_Mahasiswa listener;
    String matakuliah;

    public QuizView(String matakuliah, String username) {
        initComponents();
        quizcontroller = new QuizController(this, matakuliah);
        quizcontroller.tampilquiz(index);
        this.username = username;
        this.matakuliah = matakuliah;
        listener = new DAO_Mahasiswa();

        buttonG = new ButtonGroup();
        buttonG.add(option1);
        buttonG.add(option2);
        buttonG.add(option3);
        buttonG.add(option4);
    }

    public int getNilai() {
        return nilai;
    }

    public JLabel getQuestion() {
        return Question;
    }

    public void setQuestion(JLabel Question) {
        this.Question = Question;
    }

    public JButton getNext() {
        return btnnext;
    }

    public void setNext(JButton next) {
        this.btnnext = next;
    }

    public JRadioButton getOption1() {
        return option1;
    }

    public void setOption1(JRadioButton option1) {
        this.option1 = option1;
    }

    public JRadioButton getOption2() {
        return option2;
    }

    public void setOption2(JRadioButton option2) {
        this.option2 = option2;
    }

    public JRadioButton getOption3() {
        return option3;
    }

    public void setOption3(JRadioButton option3) {
        this.option3 = option3;
    }

    public JRadioButton getOption4() {
        return option4;
    }

    public void setOption4(JRadioButton option4) {
        this.option4 = option4;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanell_Container = new javax.swing.JPanel();
        Question = new javax.swing.JLabel();
        option1 = new javax.swing.JRadioButton();
        option2 = new javax.swing.JRadioButton();
        option3 = new javax.swing.JRadioButton();
        option4 = new javax.swing.JRadioButton();
        btnnext = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        submit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(48, 77, 48));

        jPanell_Container.setBackground(new java.awt.Color(182, 196, 182));

        Question.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Question.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Question.setText("Question");

        javax.swing.GroupLayout jPanell_ContainerLayout = new javax.swing.GroupLayout(jPanell_Container);
        jPanell_Container.setLayout(jPanell_ContainerLayout);
        jPanell_ContainerLayout.setHorizontalGroup(
            jPanell_ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanell_ContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Question, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanell_ContainerLayout.setVerticalGroup(
            jPanell_ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanell_ContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Question, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                .addContainerGap())
        );

        option1.setBackground(new java.awt.Color(182, 196, 182));
        option1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        option1.setText("jRadioButton1");

        option2.setBackground(new java.awt.Color(182, 196, 182));
        option2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        option2.setText("jRadioButton2");

        option3.setBackground(new java.awt.Color(182, 196, 182));
        option3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        option3.setText("jRadioButton3");

        option4.setBackground(new java.awt.Color(182, 196, 182));
        option4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        option4.setText("jRadioButton4");

        btnnext.setBackground(new java.awt.Color(238, 240, 229));
        btnnext.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnnext.setForeground(new java.awt.Color(22, 48, 32));
        btnnext.setText("Next");
        btnnext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnextActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(182, 196, 182));

        submit.setBackground(new java.awt.Color(22, 48, 32));
        submit.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        submit.setForeground(new java.awt.Color(182, 196, 182));
        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(280, 280, 280))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanell_Container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(option1, javax.swing.GroupLayout.DEFAULT_SIZE, 813, Short.MAX_VALUE)
                    .addComponent(option2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(option4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(option3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnnext, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanell_Container, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(option1)
                .addGap(18, 18, 18)
                .addComponent(option2)
                .addGap(18, 18, 18)
                .addComponent(option3)
                .addGap(18, 18, 18)
                .addComponent(option4)
                .addGap(12, 12, 12)
                .addComponent(btnnext, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnnextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnextActionPerformed
        try {
            if (index >= 0 && index < quizcontroller.getList_quiz().size() && quizcontroller.getList_quiz().get(index+1) != null ) { ///ukuran yang benar
                try {
                    if (option1.isSelected()) {
                        quizcontroller.koreksi(index, option1.getText());
                    } else if (option2.isSelected()) {
                        quizcontroller.koreksi(index, option2.getText());
                    } else if (option3.isSelected()) {
                        quizcontroller.koreksi(index, option3.getText());
                    } else if (option4.isSelected()) {
                        quizcontroller.koreksi(index, option4.getText());
                    } else {
                        throw new Exception("Pilih dulu jawaban");
                    }
                    index++;
                    quizcontroller.tampilquiz(index);
                    buttonG.clearSelection();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, e.getMessage());
                }
            } else {
                throw new IndexOutOfBoundsException("Akhir Quiz");

            }
        } catch (IndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(this, "Akhir Quiz");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Akhir Quiz");
        }


    }//GEN-LAST:event_btnnextActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        if (option1.isSelected()) {
            quizcontroller.koreksi(index, option1.getText());
        } else if (option2.isSelected()) {
            quizcontroller.koreksi(index, option2.getText());
        } else if (option3.isSelected()) {
            quizcontroller.koreksi(index, option3.getText());
        } else if (option4.isSelected()) {
            quizcontroller.koreksi(index, option4.getText());
        }
        nilai = quizcontroller.point;
        System.out.println(nilai);
        try {
            if (matakuliah.equals("Basis Data")) {
                listener.updateNilaiBasisData(username, nilai);
            } else if (matakuliah.equals("Object Oriented Programming")) {
                listener.updateNilaiPBO(username, nilai);
            } else if (matakuliah.equals("Jaringan Enterprise")) {
                listener.updateNilaiJaringanEnterprise(username, nilai);
            }
            int optionResult = JOptionPane.showOptionDialog(
                    this,
                    "Selamat Sudah Mengerjakan Quiz",
                    "Informasi",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    new Object[]{"OK"},
                    "OK"
            );
            if (optionResult == 0) {
                new MahasiswaPage(username).setVisible(true);
                this.dispose();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error updating nilai: " + e.getMessage());
            e.printStackTrace();
        }

    }//GEN-LAST:event_submitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Question;
    private javax.swing.JButton btnnext;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanell_Container;
    private javax.swing.JRadioButton option1;
    private javax.swing.JRadioButton option2;
    private javax.swing.JRadioButton option3;
    private javax.swing.JRadioButton option4;
    private javax.swing.JButton submit;
    // End of variables declaration//GEN-END:variables
}
