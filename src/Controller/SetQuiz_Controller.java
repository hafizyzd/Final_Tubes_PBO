/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DataAccessObject.DAO_Quiz;
import Model.Quiz;
import View.ViewSetQuiz;
import java.util.List;
import javax.swing.JOptionPane;
import DAOListener.Listener_Quiz;

public class SetQuiz_Controller {
    ViewSetQuiz frame_quiz;
    Listener_Quiz implement_quiz;
    List<Quiz> list_quiz;
    
    public SetQuiz_Controller(ViewSetQuiz frame_q){
        this.frame_quiz = frame_q;
        implement_quiz = new DAO_Quiz();
    }
    
    public void reset(){
        frame_quiz.getTxtareasoal().setText("");
        frame_quiz.getTxtpilihan1().setText("");
        frame_quiz.getTxtpilihan2().setText("");
        frame_quiz.getTxtpilihan3().setText("");
        frame_quiz.getTxtpilihan4().setText("");
        frame_quiz.getCbmatakuliah().setSelectedIndex(0);
        frame_quiz.getTxtjawban().setText("");
    }
    
    public void simpanQuiz(){
        if(!frame_quiz.getCbmatakuliah().getSelectedItem().equals("-- Select --") &!frame_quiz.getTxtareasoal().getText().trim().isEmpty() & !frame_quiz.getTxtpilihan1().getText().trim().isEmpty()  & !frame_quiz.getTxtjawban().getText().trim().isEmpty()){
            Quiz b = new Quiz();
            b.setSoal(frame_quiz.getTxtareasoal().getText());
            b.setMatakuliah((String)frame_quiz.getCbmatakuliah().getSelectedItem());
            b.setPilihan1(frame_quiz.getTxtpilihan1().getText());
            b.setPilihan2(frame_quiz.getTxtpilihan2().getText());
            b.setPilihan3(frame_quiz.getTxtpilihan3().getText());
            b.setPilihan4(frame_quiz.getTxtpilihan4().getText());
            b.setJawaban(frame_quiz.getTxtjawban().getText());
            implement_quiz.insertQuiz(b);
            JOptionPane.showMessageDialog(null, "Data Berhasil Di Simpan");
        } else {
            JOptionPane.showMessageDialog(frame_quiz, "Data Tidak Boleh Kosong");
        }
    }
}
