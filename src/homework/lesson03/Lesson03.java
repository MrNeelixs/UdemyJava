/*
                    Арифметические операторы
1.Сложение + | += сложение с присваиванием
2.Вычитание - (также унарный минус) | -= вычитание с присваиванием
3.Умножение * | *= умножение с присваиванием
4.Деление / | /= деление с присваиванием
5.Деление по модулю %  |  %= деление по модулю с присваиванием
6.Инкремент ++
7.Декремент --
                    Операторы сравнения
1. == Проверяет, равны или нет значения двух операндов, если да, то условие становится истинным	(A == B)
2. != Проверяет, равны или нет значения двух операндов, если значения не равны, то условие становится истинным	(A != B) — значение истинна
3. >  Проверяет, является ли значение левого операнда больше, чем значение правого операнда, если да, то условие становится истинным	(A > B) — не верны
4. <  Проверяет, является ли значение левого операнда меньше, чем значение правого операнда, если да, то условие становится истинным	(A < B) — значение истинна
5. >= Проверяет, является ли значение левого операнда больше или равно значению правого операнда, если да, то условие становится истинным	(A >= B) — значение не верны
6. <= Проверяет, если значение левого операнда меньше или равно значению правого операнда, если да, то условие становится истинным	(A <= B) — значение истинна

                     Логические операторы
1. &&	Называется логический оператор «И». Если оба операнда являются не равны нулю, то условие становится истинным	(A && B) — значение false
2. ||	Называется логический оператор «ИЛИ». Если любой из двух операндов не равен нулю, то условие становится истинным	(A || B) — значение true
3. !	Называется логический оператор «НЕ». Использование меняет логическое состояние своего операнда. Если условие имеет значение true, то оператор логического «НЕ» будет делать false	!(A && B) — значение true
                    Тернарный оператор или условный оператор (?:)
1.  переменная x = (выражение) ? значение if true : значение if false
 */

public class Lesson03 {
    public static void main(String[] args) {
        int i1 = 5;
        int i2 = 11;
        double d1 = 5.5;
        double d2 = 1.3;
        long l = 20L;
        double result = 0;
        result = i2 / d1 + d2 % i2 - l;

        int a = 5;
        int b = 8;
        int c = a-- - --a + ++a + a++ + a;
        int d = ++b - b++ + ++b - --b;

        System.out.println(result);
        System.out.println(c);
        System.out.println(d);
    }
}

