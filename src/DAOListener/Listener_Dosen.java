package DAOListener;

import Model.Dosen;
import java.util.List;


public interface Listener_Dosen {
    public void tambahDosen(Dosen b);
    
    public void tambahDosenRegis(Dosen b);
    
    public void update(Dosen b);
    
    public void delete(int nip);
    
    public List<Dosen> getALL();
    
    public List<Dosen> getCariUsername(String username);
    
    public List<Dosen> getCariLogin(String username, String password);
    
    public int getKodeNip(String nip);
}
