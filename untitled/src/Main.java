import java.util.Scanner;



// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
// Задача.9.В одномерном массиве, заполненном случайными числами определить минимальные и максимальные элементы.
// Посчитать колличество отрицательных и положительных элементов, а также колличество нулей с выводом результатов на экран.

//Создать одномерный массив, заполненный случайными числами
        int[] mas = new int[15];
        for (int i = 0; i < mas.length; i++) {
           mas[i] = (int) (Math.random() * 15);
            System.out.println(mas[i]);
            }
        // Определение минимальных и максимальных элементов.

        int[] counter = new int[15];
        for (int i = 0; i < mas.length; i++) {
            counter[mas[i]]++;
        }
        System.out.println("Значение: \tКолличество повторений:");
        for (int i = 0; i < counter.length; i++) {
            System.out.println(i + "\t" + counter[i]);


            System.out.println("\nОтрицательные числа:");
            for (int value : a) {
                if (value < 0) {
                    System.out.println(value);

                    //declared 3 integer variables and initialized all with zero
                    int positiveCount, negativeCount, zeroCount;
                    positiveCount=negativeCount=zeroCount=0;

                    //Declare and initialize the array elements
                    int arr[] = {4, 8, -2, 3, -1, 0, 7, 0, -9};

                    //get the length of the array
                    int size=arr.length;

                    // Print the array elements
                    System.out.println("Array elements are: "+Arrays.toString(arr));

                    //iterate each element of array
                    for(int i=0; i < arr.length; i++) {

                        //check positive number
                        if(arr[i] > 0)
                            positiveCount++;
                            //check negative number
                        else if(arr[i] < 0)
                            negativeCount++;

                            //check zero
                        else
                            zeroCount++;
                    }

                    //print the result
                    System.out.println("Count of positive numbers in array: "+positiveCount);
                    System.out.println("Count of negative numbers in array: "+negativeCount);
                    System.out.println("Count of zeroes in array: "+zeroCount);
                }
        }
    }

       /* int[] array;
        array = new int[12];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int)(Math.random() * 12) - 15);
            System.out.println(array[i]);
        }
//https://ru.stackoverflow.com/questions/434704/%D0%97%D0%B0%D0%BF%D0%BE%D0%BB%D0%BD%D0%B5%D0%BD%D0%B8%D0%B5-%D0%BC%D0%B0%D1%81%D1%81%D0%B8%D0%B2%D0%B0-%D1%81%D0%BB%D1%83%D1%87%D0%B0%D0%B9%D0%BD%D1%8B%D0%BC%D0%B8-%D1%87%D0%B8%D1%81%D0%BB%D0%B0%D0%BC%D0%B8-%D0%B8%D0%B7-%D0%B4%D0%B8%D0%B0%D0%BF%D0%B0%D0%B7%D0%BE%D0%BD%D0%B0-15-15-%D1%81-%D0%BF%D0%BE%D0%BC%D0%BE%D1%89%D1%8C%D1%8E-math-rando
        выводит только отрицательные числа*/



        }


