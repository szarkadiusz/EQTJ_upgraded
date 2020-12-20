package pl.eqtj.DB;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DBManager {


    private DBRepository dbRepository;

    @Autowired
    public DBManager(DBRepository dbRepository) {
        this.dbRepository = dbRepository;
    }

    public String findQuestionById(Long id) {
        return dbRepository.findById(id).stream().findFirst().get().getQuestion();
    }

    public String findAnswerById(Long id) {
        return dbRepository.findById(id).stream().findFirst().get().getAnswer();
    }

    public QuestionsEntity saveEntity(QuestionsEntity questionsEntity) {
        return dbRepository.save(questionsEntity);
    }

    public void fillDatabase(String newAnswer, String newQuestion) {
        saveEntity(new QuestionsEntity(200L, newQuestion, newAnswer));

    }
}
