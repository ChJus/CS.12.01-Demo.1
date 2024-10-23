import java.util.Random;
import java.util.TreeSet;

public class Organization {
  // TreeSet only stores unique elements
  private TreeSet<Employee> employees;

  // Single random instance for all organizations (static)
  private static Random rand = new Random();

  public Organization() {
    employees = new TreeSet<>();
  }

  // Returns employee TreeSet
  public TreeSet<Employee> getEmployees() {
    return employees;
  }

  // Adds employee to set
  public void addEmployee(Employee employee) {
    employees.add(employee);
  }

  // Removes an employee from the set
  public void removeEmployee(Employee employee) {
    employees.remove(employee);
  }

  // Checks if the set contains an employee
  public boolean containsEmployee(Employee employee) {
    return employees.contains(employee);
  }

  // Similar to 'factory' design pattern for creating employees
  // This ensures each employee's id in an organization is unique.
  public Employee createNewEmployee(String name, int age) {
    return new Employee(generateUniqueId(), name, age);
  }

  // Generates a unique id
  private long generateUniqueId() {
    long id;
    do { // Keeps generating random integer until we find one that does not exist in our employees set
      id = Math.abs(rand.nextLong()); // Random long
    } while (employees.contains(new Employee(id, null, 0)));
    return id;
  }
}
