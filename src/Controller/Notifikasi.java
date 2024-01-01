
package Controller;

import DataAccessObject.DAO_Mahasiswa;
import Model.Mahasiswa;
import View.View_Kirim_Notif;
import java.util.List;
import javax.swing.JOptionPane;
import DAOListener.Listener_Mahasiswa;
import Model.Tabel_Model_Mahasiswa;

public class Notifikasi {
    View_Kirim_Notif frame;
    Listener_Mahasiswa implement;
    List<Mahasiswa> list_mahasiswa;

    public Notifikasi(View_Kirim_Notif frame) {
        this.frame = frame;
        implement = new DAO_Mahasiswa();
        list_mahasiswa = implement.getALL();
    }
    
    public void reset(){
        frame.getTxtnama().setText("");
        frame.getTxtnim().setText("");
        frame.getTextpesan().setText("");
    }
    
    public void isiTable(){
        list_mahasiswa = implement.getALL();
        try{
            Tabel_Model_Mahasiswa tmm = new Tabel_Model_Mahasiswa(list_mahasiswa);
            frame.getTablemhs().setModel(tmm);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array melebihi");
        }
    }
    
    public void isiField(int row){
        frame.getTxtnama().setText(list_mahasiswa.get(row).getNama());
        frame.getTxtnim().setText(list_mahasiswa.get(row).getNim().toString());
    }
    
    public void submitNotif(){
        try{
            String pesan = frame.getTextpesan().getText();
            String nim = frame.getTxtnim().getText();
            String name = frame.getTxtnama().getText();
            List<Mahasiswa> list = implement.getCariNIM(nim);
            if(list.isEmpty()){
                JOptionPane.showMessageDialog(frame, "Tidak ada mahasiswa", "Error", 0);
            }else{
                Mahasiswa mhs = new Mahasiswa();
                for(Mahasiswa m : list){
                    mhs.setNim(m.getNim());
                    mhs.setPassword(m.getPassword());
                    mhs.setUsername(m.getUsername());
                    mhs.setNama(m.getNama());
                }
                if(mhs.getNim().equals(Integer.parseInt(nim)) & mhs.getNama().equals(name)){
                    if(!pesan.isEmpty()){
                        implement.submitNotif(nim,pesan);
                        JOptionPane.showMessageDialog(frame,"Notifikasi Berhasil dikirim");
                    }else{
                        JOptionPane.showMessageDialog(frame,"isi notifikasi!");
                    }
                    
                }
            }           
        }catch (Exception ex){
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(frame, "Terjadi kesalahan SQL:" + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
