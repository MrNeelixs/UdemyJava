public class Lesson04 {

    }
    class Student {
        int id ;
        String name ;
        String name2 ;
        int year ;
        float math ;
        float econom ;
        float language;

    }
    class StudentTest {
        public static void main(String[] args) {
            Student student1 = new Student();
            student1.id = 1;
            student1.name = "Vasa";
            student1.name2 = "Nikitin";
            student1.year = 1991 ;
            student1.math = 6.7f;
            student1.econom= 7.8f;
            student1.language = 4.7f;
            float sred1 = (student1.math+ student1.econom+ student1.language)/3;
            Student student2 = new Student();
            student2.id = 2;
            student2.name = "Buster";
            student2.name2 = "Faster";
            student2.year = 1991 ;
            student2.math = 3.6f;
            student2.econom= 7.6f;
            student2.language = 5.3f;
            float sred2 = (student2.math+ student2.econom+ student2.language)/3;
            Student student3 = new Student();
            student3.id = 3;
            student3.name = "Bret";
            student3.name2 = "Pitt";
            student3.year = 1991 ;
            student3.math = 5.7f;
            student3.econom= 8.8f;
            student3.language = 8.7f;
            float sred3 = (student3.math+ student3.econom+ student3.language)/3;
            System.out.println((sred1+sred2+sred3)/3);
        }

    }
