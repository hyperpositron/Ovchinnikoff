package Ovchinnikoff.hw_2;

import java.util.Arrays;
/* 1) Задать целочисленный массив, состоящий из элементов 0 и 1. Например:[1, 1, 0, 0, 1, 0, 1, 1, 0, 0].
 * Написать метод, заменяющий в принятом массиве 0 на 1, 1 на 0;
 *  2) Задать пустой целочисленный массив размером 8, написать метод, который с помощью цикла заполнит его значениями
 * 1 4 7 10 13 16 19 22;
 *  3) Задать массив[1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1], написать метод, принимающий на вход массив и
 * умножающий числа меньше 6 на 2;
 *  4) Задать одномерный массив. Написать методы поиска в нем минимального и максимального  элемента;
 *  5)* Создать квадратный целоцисленный массив (кол-во строк и столбцов одинаковое), заполнить его диагональные
 * элементы единицами, используя цикл(ы);
 *      Вывод:
 *          1 0 0 0 1
 *          0 1 0 1 0
 *          0 0 1 0 0
 *          0 1 0 1 0
 *          1 0 0 0 1
 *  6)* Создать квадратный целоцисленный массив (кол-во строк и столбцов одинаковое),
 * заполнить только побочную диагональ.
 *      Вывод:
 *          0 0 0 0 1
 *          0 0 0 1 0
 *          0 0 1 0 0
 *          0 1 0 0 0
 *          1 0 0 0 0
 *  7)* Создать квадратный целоцисленный массив (кол-во строк и столбцов одинаковое),
 * заполнить только главную диагональ.
 * Вывод:
 *          1 0 0 0 0
 *          0 1 0 0 0
 *          0 0 1 0 0
 *          0 0 0 1 0
 *          0 0 0 0 1
 *  8)** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен
 * вернуть true если в массиве есть место, в которой сумма левой и правой части массива равны.
 * Примеры: checkBalance([1,1,1,|| 2,1])-> true, checkBalance([2,1,1,2,1])-> false,
 * checkBalance([10,|| 1,2,3,4])-> true. Абстрактная граница показана символоми ||, эти символы в массив не входят.
 *  9)*** Написать метод, которому на вход подаётся одномерный массив и число n (может быть положительным, или
 * отрицательным), при это метод должен циклически сместить все элементы массива на n позиции.
 *  10)**** Не пользоваться вспомогательным массивом при решении задачи 7 */

public class Ovchinnikoff_2 {
    public static void printValueBefore(int[] array) {
        System.out.println("Изначальный массив: " + Arrays.toString(array));
    }

    public static void printTask(int i) {
        System.out.println();
        System.out.println("||||::::::::::::::::::||||Задача № " + i + "||||::::::::::::::::::||||");
        System.out.println();
    }

    public static void task_1_Perevertish(int[] array) {

        for (int i = 0; i < array.length; i++) {
            //System.out.print(" Был:"+array[i]);
            if (array[i] == 0) {

                array[i] = 1;
            } else {
                array[i] = 0;
            }
            //System.out.print(" Индекс:"+i);
            //System.out.println(" Теперь:"+array[i]);
        }
        System.out.println("Перевернутый массив:" + Arrays.toString(array));
    }

    public static void task_2_Zapolnyalka(int[] array) {
        for (int i = 0; i < array.length; i++) {
            //System.out.print(" Был:" + array[i]);
            array[i] = i * 3 + 1;
            //System.out.print(" Индекс:"+i);
            //System.out.println(" Теперь:"+array[i]);
        }
        System.out.println("Заполненный массив: " + Arrays.toString(array));
    }

    public static void task_3_Umnozjalka(int[] array) {
        for (int i = 0; i < array.length; i++) {
            //System.out.print(" Был:" + array[i]);
            if (array[i] < 6) {
                array[i] = array[i] * 2;
            }
            //System.out.print(" Индекс:"+i);
            //System.out.println(" Теперь:"+array[i]);
        }
        System.out.println("Умноженный массив:  " + Arrays.toString(array));
    }

    public static void task_4_findMaxAndMinValue(int[] array) {
        int max = 0;/*array[0];*/
        int min = 1000;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Максимальное значение: " + max);
        System.out.println("Минимальное значение: " + min);
    }

    public static void task_5_createSquareCrestInside(int x, int y) {
        int[][] array = new int[x][y];

        for (int i = 0; i < array.length; i++) {
            //array[i][i] = 1;
            array[i][array.length - i - 1] = 1;
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][i] = 1;
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void task_6_createSecondaryDiagonal(int x, int y) {
        int[][] arr = new int[x][y];

        for (int i = 0; i < arr.length; i++) {
            arr[i][arr.length - i - 1] = 1;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void task_7_createMainDiagonal(int x, int y) {
        int[][] array = new int[x][y];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][i] = 1;
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

//    public static boolean task_8_returnTrue(int[] arr, int[] arr) {
//        int[] arr1 = new int[arr1];
//        int[] arr2 = new int[arr2];
//
//
//        for (int i = 0; i < arr1.length; i++) {
//
//            for (int i = 0; i < arr2.length; i++) {
//                System.out.println("Индекс:" + i + " лежит = " + arr1[i]);
//                arr1[i] = arr1[i] + arr1[i];
//                arr2[i] = arr2[i] + arr2[i];
//                System.out.println(arr1[i]);
//                System.out.println(arr2[i]);
//                if (arr1[i] == arr2[i]) {
//                    System.out.println(true);
//                } else {
//                    System.out.println(false);
//                }
//
//            }
//        }
//    }


    public static void main(String[] args) {
        printTask(1);
        int[] arr = new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        printValueBefore(arr);
        task_1_Perevertish(arr);
        printTask(2);
        int[] arr2 = new int[8];
        printValueBefore(arr2);
        task_2_Zapolnyalka(arr2);
        printTask(3);
        int[] arr3 = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        printValueBefore(arr3);
        task_3_Umnozjalka(arr3);
        printTask(4);
        int[] arr4 = new int[]{2, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 2, 56};
        printValueBefore(arr4);
        task_4_findMaxAndMinValue(arr4);
        printTask(5);
        task_5_createSquareCrestInside(5, 5);
        printTask(6);
        task_6_createSecondaryDiagonal(5, 5);
        printTask(7);
        task_7_createMainDiagonal(5, 5);
        printTask(8);
//        int[] array_1 = new int[]{1, 2, 3, 4};
//        int[] array_2 = new int[]{1, 2, 3, 4};
//        task_8_returnTrue(array_1,array_2 );
 }

}















