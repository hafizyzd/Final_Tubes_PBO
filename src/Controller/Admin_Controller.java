package Controller;

import DataAccessObject.DAO_Dosen;
import DataAccessObject.DAO_Mahasiswa;
import Model.Dosen;
import Model.Mahasiswa;
import Model.Tabel_Model_Dosen;
import Model.Tabel_Model_Mahasiswa;
import View.AdminPage;
import java.util.List;
import javax.swing.JOptionPane;
import DAOListener.Listener_Mahasiswa;
import DAOListener.Listener_Dosen;
import DAOListener.Listener_Register;
import DataAccessObject.DAO_ObjectRegister;
import Model.ObjectRegister;
import Model.Tabel_Regis;
import com.mysql.jdbc.exceptions.MySQLIntegrityConstraintViolationException;

public class Admin_Controller {

    AdminPage frame1;
    Listener_Mahasiswa implement_mahasiswa;
    Listener_Dosen implement_dosen;
    List<Mahasiswa> list_mahasiswa;
    List<Dosen> list_dosen;
    List<ObjectRegister> list_object;
    Listener_Register listener_regis;

    public Admin_Controller(AdminPage frame1) {
        this.frame1 = frame1;
        implement_mahasiswa = new DAO_Mahasiswa();
        list_mahasiswa = implement_mahasiswa.getALL();
        implement_dosen = new DAO_Dosen();
        list_dosen = implement_dosen.getALL();
        listener_regis = new DAO_ObjectRegister();
        list_object = listener_regis.getALL();
    }

    public void reset() {
        frame1.getTxtkode().setText("");
        frame1.getTxtnamapengguna().setText("");
        frame1.getTxtusername().setText("");
        frame1.getTxtemail().setText("");
        frame1.getTxtusername().setText("");
        frame1.getTxtrole().setText("");
        frame1.getTxtcarimhs().setText("");
        frame1.getTxtcaridosen().setText("");
    }

    public void isiTableMahasiswa() {
        list_mahasiswa = implement_mahasiswa.getALL();
        try {
            Tabel_Model_Mahasiswa tmm = new Tabel_Model_Mahasiswa(list_mahasiswa);
            frame1.getTable_data_mahasiswa().setModel(tmm);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array melebihi");
        }
    }

    public void isiTableRegis() {
        list_object = listener_regis.getALL();
        try {
            Tabel_Regis tmm = new Tabel_Regis(list_object);
            frame1.getTable_permintaan_regis().setModel(tmm);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array melebihi");
        }
    }

    public void isiTableDosen() {
        list_dosen = implement_dosen.getALL();
        try {
            Tabel_Model_Dosen tmd = new Tabel_Model_Dosen(list_dosen);
            frame1.getTable_data_dosen().setModel(tmd);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array melebihi");
        }
    }

    public void isiFieldMhasiswa(int row) {
        frame1.getTxtkode().setText(list_mahasiswa.get(row).getNim().toString());
        frame1.getTxtnamapengguna().setText(list_mahasiswa.get(row).getNama());
        frame1.getTxtusername().setText(list_mahasiswa.get(row).getUsername());
        frame1.getTxtemail().setText(list_mahasiswa.get(row).getEmail());
        frame1.getTxtrole().setText(list_mahasiswa.get(row).getRole());
    }

    public void isiFieldDosen(int row) {
        frame1.getTxtkode().setText(list_dosen.get(row).getNip().toString());
        frame1.getTxtnamapengguna().setText(list_dosen.get(row).getNama());
        frame1.getTxtusername().setText(list_dosen.get(row).getUsername());
        frame1.getTxtemail().setText(list_dosen.get(row).getEmail());
        frame1.getTxtrole().setText(list_dosen.get(row).getRole());
    }

    public void isiFieldRegister(int row) {
        frame1.getTxtnamapengguna().setText(list_object.get(row).getNama());
        frame1.getTxtusername().setText(list_object.get(row).getUsername());
    }

    public void tambahDsn() {
        if (!frame1.getTxtkode().getText().isEmpty() & !frame1.getTxtrole().getText().isEmpty() & !frame1.getTxtnamapengguna().getText().isEmpty() & !frame1.getTxtusername().getText().isEmpty() & !frame1.getTxtemail().getText().isEmpty()) {

            try {
                int nip = implement_dosen.getKodeNip(frame1.getTxtkode().getText());
                String np = nip + "";
                if (np.equals(frame1.getTxtkode().getText())) {
                    JOptionPane.showMessageDialog(null, "Data Sudah ada");
                } else {
                    int ceknim = Integer.parseInt(frame1.getTxtkode().getText());
                    Dosen b = new Dosen();
                    b.setNama(frame1.getTxtnamapengguna().getText());
                    b.setUsername(frame1.getTxtusername().getText());
                    b.setEmail(frame1.getTxtemail().getText());
                    b.setRole(frame1.getTxtrole().getText());
                    b.setNip(ceknim);
                    System.out.println(b.getEmail());
                    System.out.println(b.getRole());
                    implement_dosen.tambahDosen(b);
                    JOptionPane.showMessageDialog(null, "Data Berhasil Di Simpan");
                }

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(frame1, "Kode harus berupa bilangan bulat");
            }

        } else {
            JOptionPane.showMessageDialog(frame1, "Silahkan Pilih Data Yang Akan Di Update");
        }
    }

    public void tambahDsnRegis(String username) {
        List<ObjectRegister> list = listener_regis.getusername(username);
        ObjectRegister obj = new ObjectRegister();
        for (ObjectRegister ob : list) {
            obj.setPassword(ob.getPassword());
        }
        if (!frame1.getTxtkode().getText().isEmpty() & !frame1.getTxtrole().getText().isEmpty() & !frame1.getTxtnamapengguna().getText().isEmpty() & !frame1.getTxtusername().getText().isEmpty() & !frame1.getTxtemail().getText().isEmpty()) {
            try {
                int ceknim = Integer.parseInt(frame1.getTxtkode().getText());
                Dosen b = new Dosen();
                b.setNama(frame1.getTxtnamapengguna().getText());
                b.setUsername(frame1.getTxtusername().getText());
                b.setEmail(frame1.getTxtemail().getText());
                b.setRole(frame1.getTxtrole().getText());
                b.setNip(ceknim);
                b.setPassword(obj.getPassword());
                System.out.println(b.getEmail());
                System.out.println(b.getRole());
                implement_dosen.tambahDosenRegis(b);
                JOptionPane.showMessageDialog(null, "Data Berhasil Di Simpan");
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(frame1, "Kode harus berupa bilangan bulat");
            }
        } else {
            JOptionPane.showMessageDialog(frame1, "Silahkan Pilih Data Yang Akan Di Update");
        }
    }

    public void tambahMhs() {
        if (!frame1.getTxtkode().getText().isEmpty() & !frame1.getTxtrole().getText().isEmpty() & !frame1.getTxtnamapengguna().getText().isEmpty() & !frame1.getTxtusername().getText().isEmpty() & !frame1.getTxtemail().getText().isEmpty()) {
            try {
                int ceknim = Integer.parseInt(frame1.getTxtkode().getText());
                int kode = implement_mahasiswa.getKodeNim(frame1.getTxtkode().getText());
                String ko = kode + "";
                if (ko.equals(frame1.getTxtkode().getText())) {
                    JOptionPane.showMessageDialog(null, "Data Sudah ada");
                } else {
                    Mahasiswa b = new Mahasiswa();
                    b.setNama(frame1.getTxtnamapengguna().getText());
                    b.setUsername(frame1.getTxtusername().getText());
                    b.setEmail(frame1.getTxtemail().getText());
                    b.setRole(frame1.getTxtrole().getText());
                    b.setNim(Integer.parseInt(frame1.getTxtkode().getText()));
                    implement_mahasiswa.tambahMahasiswa(b);
                    JOptionPane.showMessageDialog(null, "Data Berhasil Di Simpan");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(frame1, "Kode harus berupa bilangan bulat");
            }

        } else {
            JOptionPane.showMessageDialog(frame1, "Silahkan Pilih Data Yang Akan Di Update");
        }
    }

    public void tambahMhsRegis(String username) {
        List<ObjectRegister> list = listener_regis.getusername(username);
        ObjectRegister obj = new ObjectRegister();
        for (ObjectRegister ob : list) {
            obj.setPassword(ob.getPassword());
        }
        if (!frame1.getTxtkode().getText().isEmpty() & !frame1.getTxtrole().getText().isEmpty() & !frame1.getTxtnamapengguna().getText().isEmpty() & !frame1.getTxtusername().getText().isEmpty() & !frame1.getTxtemail().getText().isEmpty()) {
            try {
                int ceknip = Integer.parseInt(frame1.getTxtkode().getText());
                Mahasiswa b = new Mahasiswa();
                b.setNama(frame1.getTxtnamapengguna().getText());
                b.setUsername(frame1.getTxtusername().getText());
                b.setEmail(frame1.getTxtemail().getText());
                b.setRole(frame1.getTxtrole().getText());
                b.setNim(Integer.parseInt(frame1.getTxtkode().getText()));
                b.setPassword(obj.getPassword());
                implement_mahasiswa.tambahMahasiswaRegister(b);
                JOptionPane.showMessageDialog(null, "Data Berhasil Di Update");
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(frame1, "Kode harus berupa bilangan bulat");
            }
        } else {
            JOptionPane.showMessageDialog(frame1, "Silahkan Pilih Data Yang Akan Di Update");
        }

    }

    public void updateDosen() {
        if (!frame1.getTxtkode().getText().isEmpty() & !frame1.getTxtrole().getText().isEmpty() & !frame1.getTxtnamapengguna().getText().isEmpty() & !frame1.getTxtusername().getText().isEmpty() & !frame1.getTxtemail().getText().isEmpty()) {
            Dosen b = new Dosen();
            b.setNama(frame1.getTxtnamapengguna().getText());
            b.setUsername(frame1.getTxtusername().getText());
            b.setEmail(frame1.getTxtemail().getText());
            b.setRole(frame1.getTxtrole().getText());
            b.setNip(Integer.parseInt(frame1.getTxtkode().getText()));
            System.out.println(b.getEmail());
            System.out.println(b.getRole());
            implement_dosen.update(b);
            JOptionPane.showMessageDialog(null, "Data Berhasil Di Update");
        } else {
            JOptionPane.showMessageDialog(frame1, "Silahkan Pilih Data Yang Akan Di Update");
        }
    }

    public void updateMahasiswa() {
        if (!frame1.getTxtkode().getText().isEmpty() & !frame1.getTxtrole().getText().isEmpty() & !frame1.getTxtnamapengguna().getText().isEmpty() & !frame1.getTxtusername().getText().isEmpty() & !frame1.getTxtemail().getText().isEmpty()) {
            Mahasiswa b = new Mahasiswa();
            b.setNama(frame1.getTxtnamapengguna().getText());
            b.setUsername(frame1.getTxtusername().getText());
            b.setEmail(frame1.getTxtemail().getText());
            b.setRole(frame1.getTxtrole().getText());
            b.setNim(Integer.parseInt(frame1.getTxtkode().getText()));
            implement_mahasiswa.update(b);
            JOptionPane.showMessageDialog(null, "Data Berhasil Di Update");
        } else {
            JOptionPane.showMessageDialog(frame1, "Silahkan Pilih Data Yang Akan Di Update");
        }
    }

    public void deleteRegis(String username) {
        listener_regis.delete(username);
        JOptionPane.showMessageDialog(null, "Data Berhasil Di Hapus");
    }
//    public void delete() {
//        if (!frame1.getTxtkode().getText().trim().isEmpty()) {
//            int id = Integer.parseInt(frame1.getTxtkode().getText());
//            if (frame1.getTxtrole().getText().equals("dosen")) {
//                implement_dosen.delete(id);
//            } else if (frame1.getTxtrole().getText().equals("mahasiswa")) {
//                implement_mahasiswa.delete(id);
//            }
//            JOptionPane.showMessageDialog(null, "Data Berhasil Di Hapus");
//        } else {
//            JOptionPane.showMessageDialog(frame1, "Silahkan Pilih Data Yang Akan Di Hapus");
//        }
//    }

    public void delete() {
        try {
            if (!frame1.getTxtkode().getText().trim().isEmpty()) {
                int id = Integer.parseInt(frame1.getTxtkode().getText());
                if (frame1.getTxtrole().getText().equals("dosen")) {
                    implement_dosen.delete(id);
                } else if (frame1.getTxtrole().getText().equals("mahasiswa")) {
                    implement_mahasiswa.delete(id);
                }
                JOptionPane.showMessageDialog(null, "Data Berhasil Di Hapus");
            } else {
                JOptionPane.showMessageDialog(frame1, "Silahkan Pilih Data Yang Akan Di Hapus");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(frame1, "Kode harus berupa bilangan bulat");
        }
    }

    public void isiTableCariNamaMahasiswa() {
        list_mahasiswa = implement_mahasiswa.getCariNama(frame1.getTxtcarimhs().getText());
        Tabel_Model_Mahasiswa tmb = new Tabel_Model_Mahasiswa(list_mahasiswa);
        frame1.getTable_data_mahasiswa().setModel(tmb);
    }

    public void isiTableCariNamaDosen() {
        list_dosen = implement_dosen.getCariUsername(frame1.getTxtcaridosen().getText());
        Tabel_Model_Dosen tmb = new Tabel_Model_Dosen(list_dosen);
        frame1.getTable_data_dosen().setModel(tmb);
    }

    public void carinamamhs() {
        if (!frame1.getTxtcarimhs().getText().trim().isEmpty()) {
            isiTableCariNamaMahasiswa();
            System.out.println(frame1.getTxtcarimhs().getText());
        } else {
            JOptionPane.showMessageDialog(frame1, "Silahkan Pilih Data !!!");
        }
    }

    public void carinamadsn() {
        if (!frame1.getTxtcaridosen().getText().trim().isEmpty()) {
            isiTableCariNamaDosen();
        } else {
            JOptionPane.showMessageDialog(frame1, "Silahkan Pilih Data !!!");
        }
    }

}
