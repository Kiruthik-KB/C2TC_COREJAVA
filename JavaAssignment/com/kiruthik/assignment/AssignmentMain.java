import com.kiruthik.assignment.employees.Developer;
import com.kiruthik.assignment.employees.Manager;
import com.kiruthik.assignment.utilities.EmployeeUtilities;

/**
 * Main class for testing the Java package structure and access modifiers.
 */
public class AssignmentMain {
    public static void main(String[] args) {
        // Create Manager instance
        Manager manager = new Manager("Alice", 101, 75000, "HR");
        System.out.println("Manager Details:");
        EmployeeUtilities.displayEmployeeInfo(manager);
        System.out.println("Department: " + manager.getDepartment());

        // Create Developer instance
        Developer developer = new Developer("Bob", 102, 65000, "Java");
        System.out.println("\nDeveloper Details:");
        EmployeeUtilities.displayEmployeeInfo(developer);
        System.out.println("Programming Language: " + developer.getProgrammingLanguage());

        // Update salary
        System.out.println("\nUpdating salaries:");
        EmployeeUtilities.updateEmployeeSalary(manager, 80000);
        EmployeeUtilities.updateEmployeeSalary(developer, 70000);
    }
}
