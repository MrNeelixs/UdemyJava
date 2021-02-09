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
