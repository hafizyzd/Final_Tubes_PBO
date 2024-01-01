
package DataAccessObject;

import Controller.Koneksi_DB;
import Model.Dosen;
import Model.Mahasiswa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import DAOListener.Listener_Mahasiswa;
import com.mysql.jdbc.exceptions.MySQLIntegrityConstraintViolationException;
import javax.swing.JOptionPane;


public class DAO_Mahasiswa implements Listener_Mahasiswa{
    Connection connection;
    
    final String update = "UPDATE table_mahasiswa set nama=?, username=?, email=?, role=? where nim=? ;";
    final String delete = "DELETE FROM table_mahasiswa where nim=? ;";
    final String select = "SELECT * FROM table_mahasiswa;";
    final String carinama = "SELECT * FROM table_mahasiswa where nama like ?";
    final String caripengguna = "SELECT * FROM table_mahasiswa where username like ? AND password like ?";
    final String cariusername = "SELECT * FROM table_mahasiswa where username like ?";
    final String carinim = "SELECT nim,nama,username,password FROM table_mahasiswa where nim like ?";
    final String kodenim = "SELECT nim FROM table_mahasiswa where nim like ?";
    final String submitnotif = "UPDATE table_mahasiswa set notif=? where nim=? ;";
    final String tambah = "INSERT INTO table_mahasiswa(nim, nama, username,email, role) VALUES(?,?,?,?,?);";
    final String tambahregis = "INSERT INTO table_mahasiswa(nim, nama, username,email, role,password) VALUES(?,?,?,?,?,?);";
    final String updatenilaipbo = "UPDATE table_mahasiswa set nilai_pbo=? where username=? ;";
    final String updatenilaibd = "UPDATE table_mahasiswa set nilai_bd=? where username=? ; ;";
    final String updatenilaijre = "UPDATE table_mahasiswa set nilai_jre=? where username=? ; ;";
    
    
    public DAO_Mahasiswa() {
        this.connection = Koneksi_DB.connection();
    }

    @Override
    public void update(Mahasiswa b) {
        PreparedStatement statement = null;
        try{
            statement = connection.prepareStatement(update);
            statement.setString(1, b.getNama());
            statement.setString(2, b.getUsername());
            statement.setString(3, b.getEmail());
            statement.setString(4, b.getRole());
            statement.setInt(5, b.getNim());
            statement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try{
                statement.close();
            }catch(SQLException ex){
                ex.printStackTrace();
            }
        }
    }

    @Override
    public void delete(int nim) {
        PreparedStatement statement = null;
        try{
            statement = connection.prepareStatement(delete);
            statement.setInt(1, nim);
            statement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try{
                statement.close();
            }catch(SQLException ex){
                ex.printStackTrace();
            }
        }
    }

    @Override
    public List<Mahasiswa> getALL() {
        List<Mahasiswa> lb = null;
        try{
            lb = new ArrayList<Mahasiswa>();
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(select);
            while (rs.next()){
                Mahasiswa b = new Mahasiswa();
                b.setNim(rs.getInt("nim"));
                b.setNama(rs.getString("nama"));
                b.setUsername(rs.getString("username"));
                b.setEmail(rs.getString("email"));
                b.setPassword(rs.getInt("password"));
                b.setRole(rs.getString("role"));
                b.setNotif(rs.getString("notif"));
                //b.setNilai(rs.getInt("nilai"));
                b.setNilai_pbo(rs.getInt("nilai_pbo"));
                b.setNilai_bd(rs.getInt("nilai_bd"));
                b.setNilai_jre(rs.getInt("nilai_jre"));
                lb.add(b);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAO_Mahasiswa.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return lb;
    }

    @Override
    public List<Mahasiswa> getCariNama(String nama) {
        List<Mahasiswa> lb = null;
        try{
            lb = new ArrayList<Mahasiswa>();
            PreparedStatement st = connection.prepareStatement(carinama);
            st.setString(1, "%" + nama + "%");
            ResultSet rs = st.executeQuery();
            while (rs.next()){
                Mahasiswa b = new Mahasiswa();
                b.setNim(rs.getInt("nim"));
                b.setNama(rs.getString("nama"));
                b.setUsername(rs.getString("username"));
                b.setEmail(rs.getString("email"));
                b.setPassword(rs.getInt("password"));
                b.setRole(rs.getString("role"));
                b.setNotif(rs.getString("notif"));
                //b.setNilai(rs.getInt("nilai"));
                lb.add(b);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAO_Mahasiswa.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return lb;
    }
    
    
    @Override
    public List<Mahasiswa> getCariLogin(String username, String password) {
        List<Mahasiswa> lb = null;
        try{
            lb = new ArrayList<Mahasiswa>();
            PreparedStatement st = connection.prepareStatement(caripengguna);
            st.setString(1,username);
            st.setString(2,password);
            ResultSet rs = st.executeQuery();
            while (rs.next()){
                Mahasiswa b = new Mahasiswa();
                b.setNim(rs.getInt("nim"));
                b.setNama(rs.getString("nama"));
                b.setUsername(rs.getString("username"));
                b.setEmail(rs.getString("email"));
                b.setPassword(rs.getInt("password"));
                b.setRole(rs.getString("role"));
                b.setNotif(rs.getString("notif"));
                //b.setNilai(rs.getInt("nilai"));
                b.setNilai_bd(rs.getInt("nilai_bd"));
                b.setNilai_jre(rs.getInt("nilai_jre"));
                b.setNilai_pbo(rs.getInt("nilai_pbo"));
                lb.add(b);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAO_Mahasiswa.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return lb;
    }

    @Override
    public List<Mahasiswa> getCariUsername(String username) {
       List<Mahasiswa> lb = null;
        try{
            lb = new ArrayList<Mahasiswa>();
            PreparedStatement st = connection.prepareStatement(cariusername);
            st.setString(1,username);
            ResultSet rs = st.executeQuery();
            while (rs.next()){
               Mahasiswa b = new Mahasiswa();
                b.setNim(rs.getInt("nim"));
                b.setNama(rs.getString("nama"));
                b.setUsername(rs.getString("username"));
                b.setEmail(rs.getString("email"));
                b.setPassword(rs.getInt("password"));
                b.setRole(rs.getString("role"));
                b.setNotif(rs.getString("notif"));
                //b.setNilai(rs.getInt("nilai"));
                b.setNilai_bd(rs.getInt("nilai_bd"));
                b.setNilai_jre(rs.getInt("nilai_jre"));
                b.setNilai_pbo(rs.getInt("nilai_pbo"));
                lb.add(b);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAO_Dosen.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return lb;
    }

    @Override
    public List<Mahasiswa> getCariNIM(String nim) {
        List<Mahasiswa> lb = null;
        try{
            lb = new ArrayList<Mahasiswa>();
            PreparedStatement st = connection.prepareStatement(carinim);
            st.setString(1, nim);
            ResultSet rs = st.executeQuery();
            while (rs.next()){
                Mahasiswa b = new Mahasiswa();
                b.setNim(rs.getInt("nim"));
                b.setNama(rs.getString("nama"));
                b.setUsername(rs.getString("username"));
                b.setPassword(rs.getInt("password"));
                lb.add(b);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAO_Mahasiswa.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return lb;
    }

    @Override
    public void submitNotif(String nim, String pesan) {
        PreparedStatement statement = null;
        try{
            statement = connection.prepareStatement(submitnotif);
            statement.setString(1, pesan);
            statement.setString(2, nim);
            statement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try{
                statement.close();
            }catch(SQLException ex){
                ex.printStackTrace();
            }
        }
    }
    
    public void tambahMahasiswa(Mahasiswa b) {
    PreparedStatement statement = null;
    try {
        statement = connection.prepareStatement(tambah);
        statement.setInt(1, b.getNim());
        statement.setString(2, b.getNama());
        statement.setString(3, b.getUsername());
        statement.setString(4, b.getEmail());
        statement.setString(5, b.getRole());
        statement.executeUpdate();
    } catch (MySQLIntegrityConstraintViolationException e) {
        JOptionPane.showMessageDialog(null, "Email atau Kode sudah ada");
    } catch (SQLException ex) {
        ex.printStackTrace();
    } finally {
        try {
            if (statement != null) {
                statement.close();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}

//    @Override
//    public void tambahMahasiswa(Mahasiswa b) {
//        PreparedStatement statement = null;
//        try{
//            statement = connection.prepareStatement(tambah);
//            statement.setInt(1, b.getNim());
//            statement.setString(2, b.getNama());
//            statement.setString(3, b.getUsername());
//            statement.setString(4, b.getEmail());
//            statement.setString(5, b.getRole());
//            statement.executeUpdate();
//        } catch (SQLException ex) {
//            ex.printStackTrace();
//        } finally {
//            try{
//                statement.close();
//            }catch(SQLException ex){
//                ex.printStackTrace();
//            }
//        }
//    }

    @Override
    public void updateNilaiPBO(String username, int nilai) {
        PreparedStatement statement = null;
        try{
            statement = connection.prepareStatement(updatenilaipbo);
            statement.setInt(1, nilai);
            statement.setString(2, username);
            statement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try{
                statement.close();
            }catch(SQLException ex){
                ex.printStackTrace();
            }
        }
    }

    @Override
    public void updateNilaiBasisData(String username, int nilai) {
                PreparedStatement statement = null;
        try{
            statement = connection.prepareStatement(updatenilaibd);
            statement.setInt(1, nilai);
            statement.setString(2, username);
            statement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try{
                statement.close();
            }catch(SQLException ex){
                ex.printStackTrace();
            }
        }
    }

    @Override
    public void updateNilaiJaringanEnterprise(String username, int nilai) {
                PreparedStatement statement = null;
        try{
            statement = connection.prepareStatement(updatenilaijre);
            statement.setInt(1, nilai);
            statement.setString(2, username);
            statement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try{
                statement.close();
            }catch(SQLException ex){
                ex.printStackTrace();
            }
        }
    }

    @Override
    public void tambahMahasiswaRegister(Mahasiswa b) {
        PreparedStatement statement = null;
        try{
            statement = connection.prepareStatement(tambahregis);
            statement.setInt(1, b.getNim());
            statement.setString(2, b.getNama());
            statement.setString(3, b.getUsername());
            statement.setString(4, b.getEmail());
            statement.setString(5, b.getRole());
            statement.setInt(6, b.getPassword());
            statement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try{
                statement.close();
            }catch(SQLException ex){
                ex.printStackTrace();
            }
        }
    }



    @Override
    public int getKodeNim(String nim) {
        int kode = 0;
        try{
            PreparedStatement st = connection.prepareStatement( kodenim );
            st.setString(1, nim);
            ResultSet rs = st.executeQuery();
            while (rs.next()){
                kode = rs.getInt("nim");
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAO_Mahasiswa.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return kode;
    }
    
    
}
