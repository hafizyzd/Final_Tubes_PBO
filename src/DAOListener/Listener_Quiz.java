
package DAOListener;

import Model.Quiz;
import java.util.List;


public interface Listener_Quiz {
    public void insertQuiz(Quiz b);
    public List<Quiz> getQuizMatakuliah(String mk);
}
