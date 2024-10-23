public class Main {
  public static void main(String[] args) {
    String[] names = {"Adam", "Justin", "Colin", "Juby", "Andy", "Amboise", "Meagan", "Sophie", "Olivia", "Bridget"};
    int[] ages = {16, 16, 16, 16, 16, 16, 16, 16, 16, 16};

    Organization CS_12_1_STUDENTS = new Organization();
    for (int i = 0; i < names.length; i++) {
      CS_12_1_STUDENTS.addEmployee(CS_12_1_STUDENTS.createNewEmployee(names[i], ages[i]));
    }

    System.out.println(CS_12_1_STUDENTS.getEmployees());
  }
}