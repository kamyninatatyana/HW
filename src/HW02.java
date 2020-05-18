import java.util.Arrays;

public class HW02 {
    public static void main(String[] args) {

     /* 1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1,
     0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0; */

        int[] arr1 = new int[10];

        for (int i = 0; i < arr1.length; i++) {

            int a = (int) (Math.random() * 2);
            arr1[i] = a;

        }
        System.out.println("Задание 1.Создать массив, состоящий из элементов 0 и 1.\nЗаменить 0 на 1 и 1 на 0.\n");
        System.out.println(Arrays.toString(arr1));

        for (int i = 0; i < arr1.length; i++) {

            if (arr1[i] == 0) {
                arr1[i] = 1;
            } else {
                arr1[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr1) + "\n");


    /* 2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями
    0 3 6 9 12 15 18 21; */

        int[] arr2 = new int[8];
        int a = 0;

        for (int i = 0; i < arr2.length; i++) {

            arr2[i] = a;
            a = a + 3;

        }
        System.out.println("Задание 2.Создать пустой целочисленный массив размером 8.\nС помощью цикла " +
                "заполнить его значениями 0 3 6 9 12 15 18 21.\n");
        System.out.println(Arrays.toString(arr2) + "\n");

    /*3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6
    умножить на 2; */

        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        System.out.println("Задание 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,\n" +
                "и числа меньшие 6 умножить на 2.\n");
        System.out.println(Arrays.toString(arr3) + "\n");

        for (int i = 0; i < arr3.length; i++) {

            if (arr3[i] < 6) {
                arr3[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(arr3) + "\n");

    /* 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
    и с помощью цикла(-ов) заполнить его диагональные элементы единицами; */

        int[][] arr4 = new int[5][5];

        System.out.println("Задание 4. Создать квадратный двумерный целочисленный массив и заполнить его\n" +
                "диагональные элементы единицами.\nИмеем массив:\n");

        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4[i].length; j++) {

                System.out.printf("%4d", arr4[i][j]);
            }
            System.out.println("\n");
        }

        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4[i].length; j++) {

                if (i == j) {
                    arr4[i][j] = 1;
                } else if ((i + j) == arr4.length - 1) {
                    arr4[i][j] = 1;
                }
            }
        }

        System.out.println("А вот массив с диагоналями, заполненными единицами:\n");

        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4[i].length; j++) {

                System.out.printf("%4d", arr4[i][j]);
            }
            System.out.println();
        }

        /* 5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета); */

        int[] arr5 = new int[10];

        for (int i = 0; i < arr5.length; i++) {

            int b = (int) (Math.random() * 101);
            arr5[i] = b;

        }

        System.out.println("\nЗадание 5.Задать одномерный массив и найти в нем min и max элементы");
        System.out.println(Arrays.toString(arr5));

        int maxNum = arr5[0];
        int minNum = arr5[0];

        for (int i = 0; i < arr5.length; i++) {

            if (arr5[i] > maxNum) {
                maxNum = arr5[i];
            } else if (arr5[i] < minNum) {
                minNum = arr5[i];
            }
        }
        System.out.println("Максимальное число в массиве: " + maxNum + "\nМинимальное число в " +
                "массиве: " + minNum + "\n");

        System.out.println(ifPartsEqual());

    }

    /* 6. Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен
    вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
    Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true,
    граница показана символами ||, эти символы в массив не входят. */

    public static boolean ifPartsEqual() {

        int[] arr6 = {22, 1, 6, 3, 1, 2, 1, 4, 10, 8};

        System.out.println("Задание 6. Написать метод, в который передается не пустой одномерный\n" +
                "целочисленный массив, метод должен вернуть true, если в массиве есть место,\nв котором " +
                "сумма левой и правой части массива равны.");
        System.out.println(Arrays.toString(arr6));

        int sumLeft = 0;
        int sumRight = 0;

        for (int i = 0; i < arr6.length; i++) {
            sumRight += arr6[i];
        }

        for (int i = 0; i < arr6.length; i++) {
            if (sumRight != sumLeft) {
                sumRight -= arr6[i];
                sumLeft += arr6[i];
            } else {
                System.out.println("Индекс элемента массива, на котором заканчивается левая часть: " + i +
                        ".\nЭто " + (i+1) + " по счету элемент массива.\nЕго значение: " + arr6[i] + ".\nСумма правой и левой части массива равна: " + sumLeft);
                break;
            }
        }
        return sumLeft == sumRight;
    }
    /* 7. Написать метод, которому на вход подается одномерный массив и число n (может быть
    положительным, или отрицательным), при этом метод должен сместить все элементы массива на n позиций.
    Для усложнения задачи нельзя пользоваться вспомогательными массивами */

}

