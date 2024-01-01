package DataAccessObject;

import Controller.Koneksi_DB;
import Model.Dosen;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import DAOListener.Listener_Dosen;


public class DAO_Dosen implements Listener_Dosen {
    
    Connection connection;
    final String tambah = "INSERT INTO table_dosen(nip, nama, username,email, role) VALUES (?,?,?,?,?);";
    final String tambahregis = "INSERT INTO table_dosen(nip, nama, username,email, role, password) VALUES (?,?,?,?,?,?);";
    final String update = "UPDATE table_dosen set nama=?, username=?, email=?, role=? where nip=? ;";
    final String delete = "DELETE FROM table_dosen where nip=? ;";
    final String select = "SELECT * FROM table_dosen;";
    final String carinama = "SELECT * FROM table_dosen where username like ?";
    final String caripengguna = "SELECT * FROM table_dosen where username like ? AND password like ?";
    final String carinip = "SELECT nip FROM table_dosen where nip like ?";

    public DAO_Dosen() {
        this.connection = Koneksi_DB.connection();
    }

    @Override
    public void update(Dosen b) {
        PreparedStatement statement = null;
        try{
            statement = connection.prepareStatement(update);
            statement.setString(1, b.getNama());
            statement.setString(2, b.getUsername());
            statement.setString(3, b.getEmail());
            statement.setString(4, b.getRole());
            statement.setInt(5, b.getNip());
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
    public void delete(int nip) {
        PreparedStatement statement = null;
        try{
            statement = connection.prepareStatement(delete);
            statement.setInt(1, nip);
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
    public List<Dosen> getALL() {
        List<Dosen> lb = null;
        try{
            lb = new ArrayList<Dosen>();
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(select);
            while (rs.next()){
                Dosen b = new Dosen();
                b.setNip(rs.getInt("nip"));
                b.setNama(rs.getString("nama"));
                b.setUsername(rs.getString("username"));
                b.setEmail(rs.getString("email"));
                b.setPassword(rs.getInt("password"));
                b.setRole(rs.getString("role"));
                b.setQuiz("quiz");
                lb.add(b);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAO_Dosen.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return lb;
    }

    @Override
    public List<Dosen> getCariUsername(String nama) {
        List<Dosen> lb = null;
        try{
            lb = new ArrayList<Dosen>();
            PreparedStatement st = connection.prepareStatement(carinama);
            st.setString(1, "%" + nama + "%");
            ResultSet rs = st.executeQuery();
            while (rs.next()){
                Dosen b = new Dosen();
                b.setNip(rs.getInt("nip"));
                b.setNama(rs.getString("nama"));
                b.setUsername(rs.getString("username"));
                b.setEmail(rs.getString("email"));
                b.setPassword(rs.getInt("password"));
                b.setRole(rs.getString("role"));
                b.setQuiz("quiz");
                lb.add(b);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAO_Dosen.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return lb;
    }

    @Override
    public List<Dosen> getCariLogin(String username, String password) {
        List<Dosen> lb = null;
        try{
            lb = new ArrayList<Dosen>();
            PreparedStatement st = connection.prepareStatement(caripengguna);
            st.setString(1,username);
            st.setString(2, password);
            ResultSet rs = st.executeQuery();
            while (rs.next()){
                Dosen b = new Dosen();
                b.setNip(rs.getInt("nip"));
                b.setNama(rs.getString("nama"));
                b.setUsername(rs.getString("username"));
                b.setEmail(rs.getString("email"));
                b.setPassword(rs.getInt("password"));
                b.setRole(rs.getString("role"));
                b.setQuiz("quiz");
                lb.add(b);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAO_Dosen.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return lb;
    }

    @Override
    public void tambahDosen(Dosen b) {
        PreparedStatement statement = null;
        try{
            statement = connection.prepareStatement(tambah);
            statement.setInt(1, b.getNip());
            statement.setString(2, b.getNama());
            statement.setString(3, b.getUsername());
            statement.setString(4, b.getEmail());
            statement.setString(5, b.getRole());
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
    public void tambahDosenRegis(Dosen b) {
                PreparedStatement statement = null;
        try{
            statement = connection.prepareStatement(tambahregis);
            statement.setInt(1, b.getNip());
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
    public int getKodeNip(String nip) {
        int kode = 0;
        try{
            PreparedStatement st = connection.prepareStatement( carinip );
            st.setString(1, nip);
            ResultSet rs = st.executeQuery();
            while (rs.next()){
                kode = rs.getInt("nip");
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAO_Mahasiswa.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return kode;
    }
    
}
