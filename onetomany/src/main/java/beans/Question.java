package beans;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="Questionotm")
public class Question {
    @Id
    int q_id;
    String question;

    public List<Answer> getAnswerlist() {
        return answerlist;
    }

    public void setAnswerlist(List<Answer> answerlist) {
        this.answerlist = answerlist;
    }

    @OneToMany
    @JoinColumn(name = "answer_id")
    List<Answer> answerlist=new ArrayList<>();
    Answer answer;

    public int getQ_id() {
        return q_id;
    }

    public void setQ_id(int q_id) {
        this.q_id = q_id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public Answer getAnswer() {
        return answer;
    }

    public void setAnswer(Answer answer) {
        this.answer = answer;
    }

}
