package beans;



import java.util.List;

public interface EmployeeDAO {
    void addEmployee(Employee employee);
    List<Employee> getAllEmployees();
    void updateEmployee(Employee employee);
    void deleteEmployee(int employeeId);
    Employee getEmployeeById(int employeeId);
}

