package beans;



import java.util.List;
import java.util.Scanner;

public class EmployeeManager {

    private static EmployeeDAO employeeDAO = new EmployeeDAOImpl();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Employee");
            System.out.println("2. View All Employees");
            System.out.println("3. Update Employee");
            System.out.println("4. Delete Employee");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    addEmployee(scanner);
                    break;
                case 2:
                    viewAllEmployees();
                    break;
                case 3:
                    updateEmployee(scanner);
                    break;
                case 4:
                    deleteEmployee(scanner);
                    break;
                case 5:
                    HibernateUtil.shutdown();
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    private static void addEmployee(Scanner scanner) {
        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();
        System.out.print("Enter employee designation: ");
        String designation = scanner.nextLine();
        System.out.print("Enter employee salary: ");
        double salary = scanner.nextDouble();

        Employee employee = new Employee();
        employee.setName(name);
        employee.setDesignation(designation);
        employee.setSalary(salary);

        employeeDAO.addEmployee(employee);
        System.out.println("Employee added successfully.");
    }

    private static void viewAllEmployees() {
        List<Employee> employees = employeeDAO.getAllEmployees();
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    private static void updateEmployee(Scanner scanner) {
        System.out.print("Enter employee ID to update: ");
        int id = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        Employee employee = employeeDAO.getEmployeeById(id);
        if (employee != null) {
            System.out.print("Enter new name: ");
            String name = scanner.nextLine();
            System.out.print("Enter new designation: ");
            String designation = scanner.nextLine();
            System.out.print("Enter new salary: ");
            double salary = scanner.nextDouble();

            employee.setName(name);
            employee.setDesignation(designation);
            employee.setSalary(salary);

            employeeDAO.updateEmployee(employee);
            System.out.println("Employee updated successfully.");
        } else {
            System.out.println("Employee with ID " + id + " not found.");
        }
    }

    private static void deleteEmployee(Scanner scanner) {
        System.out.print("Enter employee ID to delete: ");
        int id = scanner.nextInt();

        employeeDAO.deleteEmployee(id);
        System.out.println("Employee deleted successfully.");
    }
}
