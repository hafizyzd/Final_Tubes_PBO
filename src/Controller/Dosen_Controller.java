/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DataAccessObject.DAO_Dosen;
import Model.Dosen;
import View.DosenPage;
import java.util.List;
import DAOListener.Listener_Dosen;

public class Dosen_Controller {
    DosenPage frame_dosen;
    Listener_Dosen implement_dosen;
    List<Dosen> list_dosen;
    String username;
    
    public Dosen_Controller(DosenPage frame1, String username){
        this.frame_dosen = frame1;
        implement_dosen = new DAO_Dosen();
        this.username = username;
    }
    
    public void profildata(){
        list_dosen = implement_dosen.getCariUsername(username);
        Dosen dsn = new Dosen();
        for(Dosen d : list_dosen){
            dsn.setNama(d.getNama());
            dsn.setNip(d.getNip());
            dsn.setEmail(d.getEmail());
            dsn.setRole(d.getRole());
            dsn.setQuiz(d.getQuiz());
            dsn.setUsername(d.getUsername());
        }
        
        frame_dosen.getTxtnama().setText(dsn.getNama());
        frame_dosen.getTxtemail().setText(dsn.getEmail());
        frame_dosen.getTxtnip().setText(dsn.getNip().toString());
        frame_dosen.getTxtrole().setText(dsn.getRole());
        frame_dosen.getTxtusername().setText(dsn.getUsername());
    }
    
}
