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
 *  8)**6) Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен
 * вернуть true если в массиве есть место, в которой сумма левой и правой части массива равны.
 * Примеры: checkBalance([1,1,1,|| 2,1])-> true, checkBalance([2,1,1,2,1])-> false,
 * checkBalance([10,|| 1,2,3,4])-> true. Абстрактная граница показана символоми ||, эти символы в массив не входят.
 *  9)***7) Написать метод, которому на вход подаётся одномерный массив и число n (может быть положительным, или
 * отрицательным), при это метод должен циклически сместить все элементы массива на n позиции.
 *  10)****8) Не пользоваться вспомогательным массивом при решении задачи 7 */

public class Ovchinnikoff_2 {
    public static void printValueBefore(int[] array) {
        System.out.println("Изначальный массив: " + Arrays.toString(array));
    }

    public static void printValueBefore2(int[][] array) {
        System.out.println("Изначальный массив: " + Arrays.deepToString(array));
    }

    public static void printTask(String i) {
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

    private static void task_2_2_ZapolnyalkaWithParam(int[] array, int shift, int step) {
        for (int i = 0; i < array.length; i++) {
            array[i] = i * step + shift;
            System.out.print(" " + array[i]);
        }
    }

    public static void task_3_Umnozjalka(int[] array) {
        for (int i = 0; i < array.length; i++) {
            //System.out.print(" Был:" + array[i]);
            if (array[i] < 6) {
                array[i] = array[i] * 2;  //array[i]*=2
            }
            //System.out.print(" Индекс:"+i);
            //System.out.println(" Теперь:"+array[i]);
        }
        System.out.println("Умноженный массив:  " + Arrays.toString(array));
    }

    public static void task_3_2_UmnozjalkaWithParam(int[] array, int val, int mul) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] > val) {
                array[i] *= mul;
            }
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

    public static int task_4_2_findMax(int[] a) {
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            System.out.println("a[i]=" + i + " > " + "a[index]=" + a[index]);
            if (a[i] > a[index])
                index = i;
        }
        System.out.println("max index=" + index);
        return index;
    }

    public static int task_4_3_findMin(int[] a) {
        int result = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < result) {
                result = a[i];
            }
        }
        System.out.println(result);
        return result;

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

    public static void task_7_1_crossFill(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            a[i][i] = 1;
            a[i][a.length - 1 - i] = 1;
            System.out.print(a[i][i] + " ");
        }
        System.out.println();
    }

    private static boolean task_8_checkBalance(int[] a) {
        int sum = 0;
        int left = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        for (int i = 0; i < a.length; i++) {
            sum = sum - a[i];
            left = left + a[i];
            if (sum == left) return true;
        }
        return false;
    }

    private static void task_9_shift(int[] a, int n) {
        boolean dir = n < 0;
        if (dir) n = -n;
        n %= a.length;
        int shift = (dir) ? a.length - n : n;

        for (int i = 0; i < shift; i++) {
            int temp = a[a.length-1];
            System.arraycopy(a,0,a,1,a.length-1);
            a[0]=temp;
        }
    }


    public static void main(String[] args) {
        printTask("1");
        int[] arr = new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        printValueBefore(arr);
        task_1_Perevertish(arr);
        printTask("2");
        int[] arr2 = new int[8];
        printValueBefore(arr2);
        task_2_Zapolnyalka(arr2);
        printTask("2_2");
        int[] array = new int[10];
        printValueBefore(array);
        task_2_2_ZapolnyalkaWithParam(array, 1, 3); // со сдвиго shift, и  с шагом step
        printTask("3");
        int[] arr3 = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        printValueBefore(arr3);
        task_3_Umnozjalka(arr3);
        printTask("3_2");
        int[] arr3_2 = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        printValueBefore(arr3_2);
        task_3_2_UmnozjalkaWithParam(arr3_2, 6, 10);
        printTask("4");
        int[] arr4 = new int[]{2, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 2, 56};
        printValueBefore(arr4);
        task_4_findMaxAndMinValue(arr4);
        printTask("5");
        task_5_createSquareCrestInside(5, 5);
        printTask("6");
        task_6_createSecondaryDiagonal(5, 5);
        printTask("7");
        task_7_createMainDiagonal(5, 5);
        printTask("8");
        int[][] array5 = new int[9][9];
        printTask("9");
        int[]array6=new int[]{1,2,3,4,5,6,7,8,9,10,11};
        printValueBefore(array6);
        task_9_shift(array6,1);
        printValueBefore(array6);

    }

}














