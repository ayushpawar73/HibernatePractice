package beans;

import org.hibernate.*;
import org.hibernate.cfg.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Question q1 = new Question();
        q1.setQ_id(01);
        q1.setQuestion("What is java");
        
        Answer a1 = new Answer();
        a1.setAid(001);
        a1.setAnswer("Programming Language");
        q1.setAnswer(a1);

        Answer a2 = new Answer();
        a2.setAid(002);
        a2.setAnswer("Programming Language");
        q1.setAnswer(a2);

        List<Answer> list1=new ArrayList<>();
        list1.add(a1);
        list1.add(a2);
        q1.setAnswerlist(list1);



        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();

        Question ques=session.load(Question.class,25);
        System.out.println(ques.getQuestion());
        System.out.println(ques.getAnswer().getAnswer());



//        session.save(q);
//        session.save(a);
//        try{
//            tx.commit();
//            System.out.println("Success");
//        }catch (Exception e){
//            tx.rollback();
//            System.out.println("Failed");
//        }

    }
}
