/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccessObject;

import Controller.Koneksi_DB;
import Model.Mahasiswa;
import Model.Quiz;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import DAOListener.Listener_Quiz;

public class DAO_Quiz implements Listener_Quiz{
    
    Connection connection;
    
    String insert = "INSERT INTO table_quiz(matakuliah, soal, pilihan1, pilihan2, pilihan3, pilihan4,jawaban) VALUES(?,?,?,?,?,?,?);";
    String quizmk = "SELECT * FROM table_quiz where matakuliah like ?";
    
    public DAO_Quiz() {
        this.connection = Koneksi_DB.connection();
    }

    @Override
    public void insertQuiz(Quiz b) {
        PreparedStatement statement = null;
        try{
            statement = connection.prepareStatement(insert);
            statement.setString(1, b.getMatakuliah());
            statement.setString(2, b.getSoal());
            statement.setString(3, b.getPilihan1());
            statement.setString(4, b.getPilihan2());
            statement.setString(5, b.getPilihan3());
            statement.setString(6, b.getPilihan4());
            statement.setString(7, b.getJawaban());
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
    public List<Quiz> getQuizMatakuliah(String mk) {
        List<Quiz> lb = null;
        try{
            lb = new ArrayList<Quiz>();
            PreparedStatement st = connection.prepareStatement(quizmk);
            st.setString(1, "%" + mk + "%");
            ResultSet rs = st.executeQuery();
            while (rs.next()){
                Quiz b = new Quiz();
                b.setId(rs.getInt("id"));
                b.setMatakuliah(rs.getString("matakuliah"));
                b.setSoal(rs.getString("soal"));
                b.setPilihan1(rs.getString("pilihan1"));
                b.setPilihan2(rs.getString("pilihan2"));
                b.setPilihan3(rs.getString("pilihan3"));
                b.setPilihan4(rs.getString("pilihan4"));
                b.setJawaban(rs.getString("jawaban"));
                lb.add(b);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAO_Quiz.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return lb;
    }
    
}
//    @Override
//    public void insertQuizMatakuliah(Quiz b, String mk) {
//        PreparedStatement statement = null;
//        try{
//            statement = connection.prepareStatement(insertmk);
//            statement.setString(1,mk);
//            statement.setString(2, b.getSoal());
//            statement.setString(3, b.getPilihan1());
//            statement.setString(4, b.getPilihan2());
//            statement.setString(5, b.getPilihan3());
//            statement.setString(6, b.getPilihan4());
//            statement.setString(7, b.getJawaban());
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