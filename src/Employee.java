// Employee record:
// Each employee contains a unique integer id, a name, and age.
public class Employee implements Comparable<Employee> {
  private long id;
  private String name;
  private int age;

  public Employee(long id, String name, int age) {
    this.id = id;
    this.name = name;
    this.age = age;
  }

  // Getters for id, name, and age
  long getId() {
    return id;
  }

  String getName() {
    return name;
  }

  int getAge() {
    return age;
  }

  // Implements the compareTo() function for sorting the
  // employees (as used in Organization and the TreeSet class).
  @Override
  public int compareTo(Employee otherEmployee) {
    // If the employee is null, throw an error.
    if (otherEmployee == null) {
      throw new IllegalArgumentException("Cannot compare to null.");
    }

    // Return comparison value based on id
    // -1: the current employee comes before the given employee
    // 0: the given employee is congruent to the current employee
    // 1: the current employee comes after the given employee
    if (this.id < otherEmployee.id) return -1;
    else if (this.id == otherEmployee.id) return 0;
    else return 1;
  }

  // Checks if this employee is the same as a given employee
  // Note this is used by the contains() method in Organization
  @Override
  public boolean equals(Object otherEmployee) {
    if (!(otherEmployee instanceof Employee))
      return false;
    else // compare only by id
      return ((Employee) otherEmployee).id == this.id;
  }

  // Prints a readable version of the employee with parameter values.
  @Override
  public String toString() {
    return "[\n\t<id: " + id + ">\n" +
        "\t<name: " + name + "\n" +
        "\t<age: " + age + ">\n]";
  }
}
