public class Lesson05 {
    static class Student {
        int id;
        String name;
        String name2;
        int year;
        double math;
        double econom;
        double language;

        double Sredny(Student sred) {
            double resualt = (sred.econom + sred.language + sred.math) / 3;
            System.out.println(resualt);
            return resualt;
        }
    }

    static class Employee {
        int id;
        String name;
        int age;
        double salary;
        String deportament;

        Employee(int id2, String name2, int age2, double salary2, String deportament2) {
            id = id2;
            name = name2;
            age = age2;
            salary = salary2;
            deportament = deportament2;
        }

        double addSalary(double salary1) {
            double newSalary = salary + salary1;
            System.out.println("new salary : " + newSalary);
            return newSalary;
        }
    }

    class BankAccaunt {
        int id;
        String nameYouther;
        double balance;

        double addBalance(double add) {
            double newBalance = balance + add;
            return newBalance;
        }

        double newminBalance(double min) {
            double newMinBalance = balance - min;
            return newMinBalance;
        }
    }

    static class TestHomework {
        public static void main(String[] args) {
            Student student1 = new Student();
            student1.id = 1;
            student1.name = "Vasa";
            student1.name2 = "Nikitin";
            student1.year = 1991;
            student1.math = 6.7f;
            student1.econom = 7.8f;
            student1.language = 4.7f;

            Student student2 = new Student();
            student2.id = 2;
            student2.name = "Buster";
            student2.name2 = "Faster";
            student2.year = 1991;
            student2.math = 3.6f;
            student2.econom = 7.6f;
            student2.language = 5.3f;

            Student student3 = new Student();
            student3.id = 3;
            student3.name = "Bret";
            student3.name2 = "Pitt";
            student3.year = 1991;
            student3.math = 5.7f;
            student3.econom = 8.8f;
            student3.language = 8.7f;
            student1.Sredny(student1);
            student2.Sredny(student2);
            student3.Sredny(student3);

            Employee employee1 = new Employee(1, "Misha", 32, 200.52, "IT java");
            System.out.println(employee1.salary);
            employee1.addSalary(200.43);
            Employee employee2 = new Employee(2, "Dima", 42, 320.23, "Manager");
            System.out.println(employee2.salary);
            employee2.addSalary(23.11);


        }
    }
}
