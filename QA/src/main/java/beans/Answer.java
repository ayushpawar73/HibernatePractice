package beans;

import javax.persistence.*;

@Entity
@Table(name="Answer")
public class Answer {
    @Id
    int aid;
    String answer;

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
