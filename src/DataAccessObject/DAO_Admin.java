/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccessObject;

import Controller.Koneksi_DB;
import Model.Admin;
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
import DAOListener.Listener_Admin;

/**
 *
 * @author ASUS
 */
public class DAO_Admin implements Listener_Admin{
    
    Connection connection;
    
    final String select = "SELECT * FROM admin;";
    final String caripengguna = "SELECT * FROM admin where username like ? AND password like ?";

    public DAO_Admin() {
        this.connection = Koneksi_DB.connection();
    }
    
    
    @Override
    public List<Admin> getALL() {
        List<Admin> lb = null;
        try{
            lb = new ArrayList<Admin>();
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(select);
            while (rs.next()){
                Admin b = new Admin();
                b.setKode(rs.getInt("kode_admin"));
                b.setNama(rs.getString("nama"));
                b.setUsername(rs.getString("username"));
                b.setEmail(rs.getString("email"));
                b.setPassword(rs.getInt("password"));
                b.setRole(rs.getString("role"));
                lb.add(b);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAO_Dosen.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return lb;
    }

    @Override
    public List<Admin> getCariUsername(String username, String password) {
        List<Admin> lb = null;
        try{
            lb = new ArrayList<Admin>();
            PreparedStatement st = connection.prepareStatement(caripengguna);
            st.setString(1,username);
            st.setString(2, password);
            ResultSet rs = st.executeQuery();
            while (rs.next()){
                Admin b = new Admin();
                b.setKode(rs.getInt("kode_admin"));
                b.setNama(rs.getString("nama"));
                b.setUsername(rs.getString("username"));
                b.setEmail(rs.getString("email"));
                b.setPassword(rs.getInt("password"));
                b.setRole(rs.getString("role"));
                lb.add(b);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAO_Dosen.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return lb;
             
    }
    
}
