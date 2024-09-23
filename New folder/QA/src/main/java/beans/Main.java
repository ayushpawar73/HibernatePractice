package beans;

import org.hibernate.*;
import org.hibernate.cfg.*;
public class Main {
    public static void main(String[] args) {
        question q = new question();
        q.setQ_id(25);
        q.setQuestion("What is java");
        Answer a = new Answer();
        a.setAid(025);
        a.setAnswer("Programming Language");
        q.setAnswer(a);
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();

        question ques=session.load(question.class,25);
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

    }}
