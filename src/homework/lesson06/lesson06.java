/*
   Перегрузка методов и конструкторов
 */

public class lesson06 {
    void  show (int sum){
        System.out.println(sum);
    }

    int sum (int a,int b ,int c,int d){
        return a+b+c+d;
    }
    int sum (int a,int b ,int c){
        return a+b+c;
    }
    int sum (int a,int b){
        return a+b;
    }
    int sum (int a){
        return a;
    }


    public static void main(String[] args) {
        lesson06 l1 = new lesson06();
        l1.show(l1.sum(1,5,7,2));
        l1.show(l1.sum(5,2,80));
        l1.show(l1.sum(5,2));
        l1.show(l1.sum(5));
    }



}
