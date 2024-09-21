package beans;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {


Student std=new Student();
std.setStd_id(103);
std.setName("Ayush");
std.setClas(6);
Address add=new Address();
add.setCity("Lucknow");
add.setPincode(226031);
std.setAddress(add);

        Configuration cffg=new Configuration();
        cffg.configure("hibernate.cfg.xml");
        SessionFactory sf= cffg.buildSessionFactory();
        Session session= sf.openSession();
        Transaction tx= session.beginTransaction();
        try{
            session.save(std);
            System.out.println("Success");
            tx.commit();

        }catch (Exception e)
        {
            System.out.println("Failed");
            tx.rollback();
        }

    }
}
