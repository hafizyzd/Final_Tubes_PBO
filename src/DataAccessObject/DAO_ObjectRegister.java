/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccessObject;

import Controller.Koneksi_DB;
import DAOListener.Listener_Register;
import Model.ObjectRegister;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DAO_ObjectRegister implements Listener_Register {

    Connection connection;
    String tambah = "INSERT INTO register(nama, username,password) VALUES (?,?,?);";
    String select = "SELECT * FROM register;";
    String cariusername = "SELECT * FROM register where username like ?";
    String delete = "DELETE FROM register where username=? ;";

    public DAO_ObjectRegister() {
        this.connection = Koneksi_DB.connection();
    }

    @Override
    public List<ObjectRegister> getALL() {
        List<ObjectRegister> lb = null;
        try {
            lb = new ArrayList<ObjectRegister>();
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(select);
            while (rs.next()) {
                ObjectRegister b = new ObjectRegister();
                b.setNama(rs.getString("nama"));
                b.setUsername(rs.getString("username"));
                b.setPassword(rs.getInt("password"));
                lb.add(b);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAO_Dosen.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lb;
    }

    @Override
    public void tambah(ObjectRegister b) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(tambah);
            statement.setString(1, b.getNama());
            statement.setString(2, b.getUsername());
            statement.setInt(3, b.getPassword());
            statement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                statement.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    @Override
    public List<ObjectRegister> getusername(String username) {
        List<ObjectRegister> lb = null;
        try {
            lb = new ArrayList<ObjectRegister>();
            PreparedStatement st = connection.prepareStatement(cariusername);
            st.setString(1, "%" + username + "%");
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                ObjectRegister b = new ObjectRegister();
                b.setNama(rs.getString("nama"));
                
                b.setUsername(rs.getString("username"));
                b.setPassword(rs.getInt("password"));
                lb.add(b);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAO_Dosen.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lb;
    }

    @Override
    public void delete(String username) {
        PreparedStatement statement = null;
        try{
            statement = connection.prepareStatement(delete);
            statement.setString(1, username);
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

}
