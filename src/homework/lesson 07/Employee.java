public class Employee {
    private double salary;
    public String surname;
    int id;

    public void showSalary() {
        System.out.println(salary);
    }

    public void showSurname() {
        System.out.println(surname);
    }

    public void showID() {
        System.out.println(id);
    }
    public Employee(int id2){
        id = id2;
    }
    Employee(String surname1){
        surname = surname1;
    }
    private Employee(double salary1){
        salary = salary1;
    }
}
class ShowHomeWork{
    public static void main(String[] args) {
        Employee employee1 = new Employee(1);
        Employee employee2 = new Employee("Vasa");

    }
}
