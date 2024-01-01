
package Controller;

import DAOListener.Listener_Mahasiswa;
import DataAccessObject.DAO_Mahasiswa;
import Model.Mahasiswa;
import Model.TabelNilai;
import View.ViewNilaiMahasiswa;
import View.View_Kirim_Notif;
import java.util.List;

public class Nilai_Mahasiswa_Controller {
    ViewNilaiMahasiswa frame;
    Listener_Mahasiswa implement;
    List<Mahasiswa> list_mahasiswa;

    public Nilai_Mahasiswa_Controller(ViewNilaiMahasiswa frame) {
        this.frame = frame;
        implement = new DAO_Mahasiswa();
        list_mahasiswa = implement.getALL();
    }
    
    public void isiTable(){
        list_mahasiswa = implement.getALL();
        try{
            TabelNilai tmm = new TabelNilai(list_mahasiswa);
            frame.getTabelnilai().setModel(tmm);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array melebihi");
        }
    }
}
