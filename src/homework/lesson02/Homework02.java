/* Задание 2 знакомство с перемеными
1.byte	8 бит	от -128 до 127
2 short	16 бит	от -32768 до 32767
3 char	16 бит	беззнаковое целое число, представляющее собой символ UTF-16 (буквы и цифры)
4 int	32 бит	от -2147483648 до 2147483647
5 long	64 бит	от -9223372036854775808L до 9223372036854775807L
6 float	32	от 1.4e-45f до 3.4e+38f
7 double	64	от 4.9e-324 до 1.7e+308

 */

public class Homework02 {
    public static void main(String[] args) {
        byte a1 = 0B1100 ;
        byte a2 = 014 ;
        byte a3 = 0XC ;
        byte a4 = 12 ;

        short b1 = 1300 ;
        short b2 = 0B10100010100 ;
        short b3 = 0X514 ;
        short b4 = 02424 ;

        int c1 = 0 ;
        int c2 = 0 ;
        int c3 = 0 ;
        int c4 = 0 ;

        long d1 = 123456789L;
        long d2 = 0B111010110111100110100010101;
        long d3 = 0X75BCD15;
        long d4 = 0726746425;

        float f1 = 123.4f ;
        float f2 = -124.476f ;

        double do1 = 6453.2 ;
        double do2 = -324.2 ;

        boolean boo1 = true ;
        boolean boo2 = false ;

        char ch1 = 'A' ;
        char ch2 = 300 ;
        char ch3 = '\u1320' ;

        System.out.println("Task 1");
        System.out.println(a1+" "+b1+" "+c1+" "+d1);
        System.out.println(a2+" "+b2+" "+c2+" "+d2);
        System.out.println(a3+" "+b3+" "+c3+" "+d3);
        System.out.println(a4+" "+b4+" "+c4+" "+d4);
        System.out.println("Task 2 ");
        System.out.println(f1+" "+do1+" "+boo1);
        System.out.println(" ");
        System.out.println(f2+" "+do2+" "+boo2);
        System.out.println("Task 3");
        System.out.println(ch1);
        System.out.println(ch2);
        System.out.println(ch3);
    }
}
