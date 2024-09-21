package beans;

import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.List;

public class EmployeeDAOImpl implements EmployeeDAO {

    @Override
    public void addEmployee(Employee employee) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.save(employee);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    @Override
    public List<Employee> getAllEmployees() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("from Employee", Employee.class).list();
        }
    }

    @Override
    public void updateEmployee(Employee employee) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.update(employee);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    @Override
    public void deleteEmployee(int employeeId) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Employee employee = session.get(Employee.class, employeeId);
            if (employee != null) {
                transaction = session.beginTransaction();
                session.delete(employee);
                transaction.commit();
            }
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    @Override
    public Employee getEmployeeById(int employeeId) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.get(Employee.class, employeeId);
        }
    }
}

