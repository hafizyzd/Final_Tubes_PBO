/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOListener;

import Model.Mahasiswa;
import java.util.List;

/**
 *
 * @author ASUS
 */
public interface Listener_Mahasiswa {
    public void tambahMahasiswa(Mahasiswa b);
    
    public void tambahMahasiswaRegister(Mahasiswa b);
    
    public void update(Mahasiswa b);
    
    public void delete(int nim);
    
    public List<Mahasiswa> getALL();
    
    public List<Mahasiswa> getCariNama(String nama);
    
    public List<Mahasiswa> getCariUsername(String username);
    
    public List<Mahasiswa> getCariLogin(String username, String password);
    
    public List<Mahasiswa> getCariNIM(String nim);
    
    public void submitNotif(String nim, String pesan);
    
    public void updateNilaiPBO(String username,int nilai);
    
    public void updateNilaiBasisData(String username,int nilai);
    
    public void updateNilaiJaringanEnterprise(String username,int nilai);
    
    public int getKodeNim(String nim);
}
