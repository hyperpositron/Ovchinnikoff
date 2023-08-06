package Ovchinnikoff.hw_3;

import java.util.Arrays;
import java.util.Scanner;

public class Ovchinnikoff_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //uno(scan);
       // doe(scan);
        tre(scan);
    }

    private static void doe(Scanner scan) {// заполнять массив со сканера
        System.out.println("Ввод:");
        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int cifra = 10;
        int[] massiv = new int[cifra];
        for (int i = 0; i < massiv.length; i++) {
            massiv[i] = scan.nextInt();
            System.out.println(Arrays.toString(massiv));
            for (int j = 0; j<massiv.length; j++){

            }
        }
        System.out.println(Arrays.toString(massiv));
    }

    private static void uno(Scanner scan) {
        System.out.println("Ввод:");
        int min = Integer.MAX_VALUE;//Присвоить самое маленькое значение типа int. Для него есть специальная константа: Integer.MIN_VALUE;
        while (scan.hasNextInt()) {
            int x = scan.nextInt();
            if (x < min)
                min = x;
        }
        System.out.println(min);
    }

 private static void tre(Scanner scan){
     int min1 = Integer.MAX_VALUE;
     int min2 = Integer.MAX_VALUE;
     while(scan.hasNextInt()){
         int a = scan.nextInt();
         if(a<min1){
             min2=min1;
             min1=a;
         } else if ( a>min1 && a<min2){
             min2=a;

         }System.out.println(min2);
     }
 }
}