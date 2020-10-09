package lesson1;

//1. Создать пустой проект в IntelliJ IDEA и прописать метод main();
public class Homework1 {
    public static void main(String[] args) {
//2. Создать переменные всех пройденных типов данных, и инициализировать их значения;
        byte b = 127;
        short s = 32767;
        int i = 2147483647;
        long l = 200000L;
        float f = 12.23f;
        double d = -123.123;
        char c = '\u2232';
        boolean bl = false;
        System.out.println("res 1: byte, short, int, long, float, double, char, boolean.");
        System.out.println("res 2: \n byte b = " + b + ";\n short s = " + s +
              ";\n int i = " + i + ";\n long l = " + l + ";\n float f = " + f + ";\n double d = " + d +
              ";\n char c = " + c + ";\n boolean bl = " + bl);

        System.out.println ("res 3: " + calculate(2, 25, 40, 4));
        System.out.println ("res 4: " + lim(4, 7));
        System.out.println ("res 5: " + positiveOrNegative(0));
        System.out.println ("res 6: " + isNegative(-1));
        greetings("Vlad");
        System.out.println ("res 8: " + intercalaryYear(2020));
            }
/*3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
где a, b, c, d – аргументы этого метода, имеющие тип float.;*/
    public static float calculate(float a, float b, float c, float d) {
        float res = a * (b + (c / d));
        return res;
    }
/*4. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит
в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
 */
    public static boolean lim(int x, int y) {
        int sum = x + y;
        return sum > 10 && sum < 20;
    }
/*5. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать
в консоль, положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
 */
    public static String positiveOrNegative(int x) {
        if (x >= 0) {
            return  "Число положительное";
        } else return "Число отрицательное";

    }
//6. Написать метод, которому в качестве параметра передается целое число, метод должен вернуть
// true, если число отрицательное;
    public static boolean isNegative(int x) {
        if(x < 0) {
            return true;
        }
        return false;
}
//7. Написать метод, которому в качестве параметра передается строка, обозначающая имя.
// Метод должен вывести в консоль сообщение «Привет, указанное_имя!».
    public static void greetings(String name) {
        System.out.println("res 7: Привет, " + name);
}

//8. *Написать метод, который определяет, является ли год високосным, и выводит сообщение в консоль.
// Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
    public static String intercalaryYear(int x) {
        if (x % 400 == 0) {
            return "Високосный год";
        } else if (x % 100 == 0) {
            return "Не високосный год";
        } else if (x % 4 == 0) {
            return "Високосный год";
        } else return "Не високосный год";
    }
}