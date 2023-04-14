package Ovchinnikoff.hw_1;

public class Ovchinnikoff_1 {

    private static void MethodCount(float a, float b, float c, float d) {
        var q = a * (b + (c / d));
        System.out.println(q);
    }

    private static int TrueFalse(int a, int b) {
        var f = a + b;
        if (f >= 10 && f <= 20) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        return f;
    }

    private static int Negatively(int a) {
        if (a >= 0) {
            System.out.println("положительное");
        } else {
            System.out.println("отрицательное");
        }
        return a;
    }
    private static String printHello(String name){
        System.out.println("<< Привет, "+name+" >>");
        return name;
    }

    private static int intercalaryYear (int year){
        if (year%4==0 && year%100!=0 || year%400==0 ){
            System.out.println("Високосный");
        }else {
            System.out.println("Не високосный");
        }
        return year;
    }

    public static void main(String[] args) {
        MethodCount(5.543F, 5.6F, 5, 5);
        TrueFalse(5, 50);
        Negatively(-5);
        printHello("Витя");
        intercalaryYear(2024);
    }
}