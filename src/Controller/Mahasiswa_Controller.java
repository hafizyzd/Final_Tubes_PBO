package Controller;

import DataAccessObject.DAO_Mahasiswa;
import Model.Mahasiswa;
import View.MahasiswaPage;
import View.QuizView;
import java.util.List;
import DAOListener.Listener_Mahasiswa;
import Model.Tabel_Nilai;
import javax.swing.JOptionPane;

public class Mahasiswa_Controller {

    MahasiswaPage frame1;
    Listener_Mahasiswa implement;
    List<Mahasiswa> list_mahasiswa;
    String username;
    QuizView qe;

    public Mahasiswa_Controller(MahasiswaPage frame1, String username) {
        this.frame1 = frame1;
        this.implement = new DAO_Mahasiswa();
        this.username = username;
    }

    public void profil() {
        list_mahasiswa = implement.getCariUsername(username);
        Mahasiswa mhs = new Mahasiswa();
        for (Mahasiswa m : list_mahasiswa) {
            mhs.setNama(m.getNama());;
            mhs.setEmail(m.getEmail());
            mhs.setNim(m.getNim());
            mhs.setRole(m.getRole());
            mhs.setNotif(m.getNotif());
            mhs.setNilai_bd(m.getNilai_bd());
            mhs.setNilai_jre(m.getNilai_jre());
            mhs.setNilai_pbo(m.getNilai_pbo());
            mhs.setUsername(m.getUsername());
        }

        frame1.getTxtnama().setText(mhs.getNama());
        frame1.getTxtemail().setText(mhs.getEmail());
        frame1.getTxtnim().setText(mhs.getNim().toString());
        frame1.getTxtrole().setText(mhs.getRole());
        frame1.getTxtuser().setText(mhs.getUsername());
    }
    
    public void lihatnotif() {
    try {
        Mahasiswa mhs = new Mahasiswa();
        for (Mahasiswa m : list_mahasiswa) {
            if (m.getNotif() == null) {
                throw new NullPointerException("Tidak ada notifikasi " + m.getNim());
            }
            mhs.setNotif(m.getNotif());
            mhs.setNama(m.getNama());
        }
        JOptionPane.showMessageDialog(null, "Notifikasi untuk " + mhs.getNama() + ":\n" + mhs.getNotif(), "Notifikasi", JOptionPane.INFORMATION_MESSAGE);
    } catch (NullPointerException e) {
        JOptionPane.showMessageDialog(frame1, "Tidak ada notifikasi untuk beberapa Mahasiswa.");
        e.printStackTrace(); 
    }
}


    public void showNilai() {
        list_mahasiswa = implement.getCariUsername(username);
        try {
            Tabel_Nilai tn = new Tabel_Nilai(list_mahasiswa);
            frame1.getTablenilai().setModel(tn);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array melebihi");
        }
    }

    public void pengerjaanquiz() {
        String matakuliah = frame1.getListquiz().getSelectedValue();
        if (matakuliah != null && !matakuliah.isEmpty()) {
            try {
                new QuizView(matakuliah,username).setVisible(true);
                frame1.dispose();
            } catch (Exception e) {
                System.out.println(matakuliah);
                JOptionPane.showMessageDialog(frame1, "Terjadi kesalahan saat membuka quiz!");
            }
        } else {
            JOptionPane.showMessageDialog(frame1, "Silahkan pilih mata kuliah terlebih dahulu!");
        }
    }

}
