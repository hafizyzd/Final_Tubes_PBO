package Controller;

import DAOListener.Listener_Mahasiswa;
import DAOListener.Listener_Quiz;
import DataAccessObject.DAO_Mahasiswa;
import DataAccessObject.DAO_Quiz;;
import Model.Quiz;
import View.QuizView;
import java.util.List;
import javax.swing.JOptionPane;

public class QuizController {

    List<Quiz> list_quiz;
    public Listener_Quiz listener;
    QuizView frameview;

    public List<Quiz> getList_quiz() {
        return list_quiz;
    }
    String username;
    public int point = 0;
    String matakuliah;

    public QuizController(QuizView quiz, String matakuliah) {
        this.listener = new DAO_Quiz();
        this.list_quiz = this.listener.getQuizMatakuliah(matakuliah);
        frameview = quiz;
        this.matakuliah = matakuliah;
    }

    public void tampilquiz(int index) {
        String soal;
        String pil1, pil2, pil3, pil4;
        soal = list_quiz.get(index).getSoal();
        pil1 = list_quiz.get(index).getPilihan1();
        pil2 = list_quiz.get(index).getPilihan2();
        pil3 = list_quiz.get(index).getPilihan3();
        pil4 = list_quiz.get(index).getPilihan4();

        frameview.getQuestion().setText(soal);
        frameview.getOption1().setText(pil1);
        frameview.getOption2().setText(pil2);
        frameview.getOption3().setText(pil3);
        frameview.getOption4().setText(pil4);

    }

    public void koreksi(int index, String jawab) {                //cek index dan option.get items
        if (list_quiz.get(index).getJawaban().equals(jawab)) {
            point += 10;
        } else {
            point += 0;
        }
        System.out.println(index);
        System.out.println(list_quiz.get(index).getSoal());
        System.out.println(list_quiz.get(index).getJawaban());
    }

}
