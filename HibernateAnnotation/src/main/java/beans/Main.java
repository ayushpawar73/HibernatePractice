package beans;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Configuration cfg = new Configuration() ;
        cfg.configure("hibernate.cfg.xml") ;
        SessionFactory sf = cfg.buildSessionFactory() ;
        Session session = sf.openSession() ;
        Transaction tx = session.beginTransaction() ;

        Employee emp = new Employee() ;
        emp.setName("Ayush");
        emp.setAge(15);
        emp.setEmp_id(101);
        emp.setAddress("Delhi");
        emp.setWorking(true);
        emp.setDateofjoin(new Date());

        session.save(emp);
        tx.commit();


    }
}