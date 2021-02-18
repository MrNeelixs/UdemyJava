import org.w3c.dom.ls.LSOutput;

public class AccautStudent {
    static class Student {
        int id;
        String name;
        String name2;
        int year;
        double math;
        double econom;
        double language;


        Student(int id1, String name3, String name4, int year1) {
            id = id1;
            name = name3;
            name2 = name4;
            year = year1;
        }

        Student(int id1, String name3, String name4, int year1, double math1, double econom1, double language1) {
            this(id1, name3, name4, year1);
            math = math1;
            econom = econom1;
            language = language1;
        }

        Student() {

        }


    }

    public static class AccauntTest {
        public static void main(String[] args) {
            Student st1 = new Student();
            Student st2 = new Student(1, "Valera", "Petrov", 1991);
            System.out.println(st2.id+" "+st2.year+" "+st2.name+" "+st2.name2);
            Student st3 = new Student(1,"Genadi","Hromov",1992,5.3,4.7,6.8);
            System.out.println(st3.id+" "+st3.year+" "+st3.name+" "+st3.name2+" "+st3.math+" "+st3.language+" "+st3.econom);
        }
    }
}