package Controller;

import DataAccessObject.DAO_Admin;
import DataAccessObject.DAO_Dosen;
import DataAccessObject.DAO_Mahasiswa;
import Model.Admin;
import Model.Dosen;
import Model.Mahasiswa;
import View.AdminPage;
import View.DosenPage;
import View.LoginPage;
import View.MahasiswaPage;
import View.ViewSetQuiz;
import java.util.List;
import javax.swing.JOptionPane;
import DAOListener.Listener_Admin;
import DAOListener.Listener_Mahasiswa;
import DAOListener.Listener_Dosen;

public class Login_Control {
    private LoginPage frame1;
    private AdminPage frame2;
    private DosenPage frame3;
    private MahasiswaPage frame4;
    private ViewSetQuiz setquiz;

    public Login_Control(LoginPage frame1) {
        this.frame1 = frame1;
    }
    
    public void reset(){
        frame1.getTxtUser().setText("");
        frame1.getTxtPassword().setText("");
        frame1.getcbUser().setSelectedIndex(0);
    }
    
    public void aksiLogin(){
        String username = frame1.getTxtUser().getText().toString();
        String password = frame1.getTxtPassword().getText().toString();
        String role = frame1.getcbUser().getSelectedItem().toString();
        
        List<Admin> list_admin;
        List<Dosen> list_dosen;
        List<Mahasiswa> list_mahasiswa;
        
        Listener_Admin implement_admin = new DAO_Admin();
        Listener_Dosen implement_dosen = new DAO_Dosen();
        Listener_Mahasiswa implement_mahasiswa = new DAO_Mahasiswa();
        
        if(username.equals("") || password.equals("") || role.equals("-- Select --")){
            JOptionPane.showMessageDialog(frame1,"Ada kesalahan field","Error", 0);
        }else{
            if(role.equals("Admin")){
                try{
                    list_admin = implement_admin.getCariUsername(username,password);
                    if(list_admin.isEmpty()){
                        JOptionPane.showMessageDialog(frame1, "Username dan Password tidak sesuai", "Error", 0);
                    }else{
                        Admin ad = new Admin();
                        for(Admin adm : list_admin){
                            ad.setKode(adm.getKode());
                            ad.setNama(adm.getNama());
                            ad.setUsername(adm.getUsername());
                            ad.setEmail(adm.getEmail());
                            ad.setPassword(adm.getPassword());
                            ad.setRole(adm.getRole());
                        }
                        if(ad.getUsername().equals(username) && ad.getPassword().equals(Integer.parseInt(password))){
                            frame2 = new AdminPage();
                            frame2.setVisible(true);
                            frame1.dispose();
                        }
                    }
                }catch (Exception ex){
                    System.out.println(ex.getMessage());
                    JOptionPane.showMessageDialog(frame1, "Terjadi kesalahan SQL:" + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }else if(role.equals("Dosen")){
                try{
                    list_dosen = implement_dosen.getCariLogin(username,password);
                    if(list_dosen.isEmpty()){
                        JOptionPane.showMessageDialog(frame1, "Username dan Password tidak sesuai", "Error", 0);
                    }else{
                        Dosen ds = new Dosen();
                        for(Dosen dsn : list_dosen){
                            ds.setNama(dsn.getNama());
                            ds.setEmail(dsn.getEmail());
                            ds.setNip(dsn.getNip());
                            ds.setPassword(dsn.getPassword());
                            ds.setRole(dsn.getRole());
                            ds.setUsername(dsn.getUsername());
                        }
                        
                        if(ds.getUsername().equals(username) && ds.getPassword().equals(Integer.parseInt(password))){
                            frame3 = new DosenPage(username);
                            frame3.setVisible(true);
                            frame1.dispose();
                        }
                    }
                }catch (Exception ex){
                    System.out.println(ex.getMessage());
                    JOptionPane.showMessageDialog(frame1, "Terjadi kesalahan SQL:" + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }else if(role.equals("Mahasiswa")){
                try{
                    list_mahasiswa = implement_mahasiswa.getCariLogin(username,password);
                    if(list_mahasiswa.isEmpty()){
                        JOptionPane.showMessageDialog(frame1, "Username dan Password tidak sesuai", "Error", 0);
                    }else{
                        Mahasiswa mhs = new Mahasiswa();
                        for(Mahasiswa m : list_mahasiswa){
                            mhs.setNama(m.getNama());
                            mhs.setEmail(m.getEmail());
                            mhs.setNim(m.getNim());
                            mhs.setPassword(m.getPassword());
                            mhs.setRole(m.getRole());
                            mhs.setUsername(m.getUsername());
                            mhs.setNilai_bd(m.getNilai_bd());
                            mhs.setNilai_jre(m.getNilai_jre());
                            mhs.setNilai_pbo(m.getNilai_pbo());
                            mhs.setNotif(m.getNotif());
                        }
                        if(mhs.getUsername().equals(username) && mhs.getPassword().equals(Integer.parseInt(password))){
                            frame4 = new MahasiswaPage(username);
                            frame4.setVisible(true);
                            frame1.dispose();
                        }
                    }
                }catch (Exception ex){
                    System.out.println(ex.getMessage());
                    JOptionPane.showMessageDialog(frame1, "Terjadi kesalahan SQL:" + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        
    }
    
    
}
