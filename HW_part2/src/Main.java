import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static  Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        task6();
    }
    public static void task1(){
        //  Задание.1.Вывести построчно в консоль слова Стива Джобса
        System.out.println("Your time is limited");
        System.out.println("so don’t waste it");
        System.out.println("living someone else’s life");}

    public static void task2(){
        // Задание.2. Посчитать процент от числа
        System.out.print("Введите число от которого нужно посчитать процент: ");
        int a = scan.nextInt();
        System.out.println("Введите для расчета размер процента от первоначальногно числа");
        int b = scan.nextInt();
        System.out.println("Сумма процентов:" + a * b / 100);}

    public static void task3(){
        // Задание.3. Ввести 3 отдельные цифры и сложить в одно число.
        System.out.print("Введите первое число, которое нужно сложить: ");
        int d = scan.nextInt();
        System.out.print("Введите второе число, которое нужно сложить: ");
        int f = scan.nextInt();
        System.out.print("Введите третье число, которое нужно сложить: ");
        int g = scan.nextInt();
        int result = d + f + g;
        System.out.println("Сумма трех чисел: " + result);}

    public static void task4(){
        // Задача.4.Переворот шестизначного числа + провека количества символов (Не работает проверка)
        System.out.println("Введите шестизначное число");
        int numberToReverse = scan.nextInt();
        int length = Integer.parseInt(String.valueOf(numberToReverse));
        if (length > 6 || length < 6) ;
        {
            System.out.println("Вы ввели не шестизначное число");
        }
        StringBuilder builder = new StringBuilder(String.valueOf(numberToReverse));
        builder.reverse();
        System.out.println("Число наоборот " + builder);}

    public static void task5() {
// Задача.5.Ввод значений и проверка на соответсвия изх временам года.
        System.out.println("Введите порядковый номер месяца календарного года");
        int month = scan.nextInt();
        if (month == 1 || month == 2 || month == 12) {
            System.out.println("Winter");
        }
        if (month == 3 || month == 4 || month == 5) {
            System.out.println("Spring");
        }
        if (month == 6 || month == 7 || month == 8) {
            System.out.println("Summer");
        }
        if (month == 9 || month == 10 || month == 11) {
            System.out.println("Winter");
        }
        if (month < 1 || month > 12) {
            System.out.println("УНИКУМ!!!! Ты указал не существующий календарный месяц!!!");
        }
    }

    public static void task6() {
        // Задача.6. Написать программу конвертации величин метрической системы.
        System.out.println("Введите количество метров для конвертации длинны");
        int lengthM = scan.nextInt();
        System.out.println("Выберете величину длинны для преобразования: 1 - Мили, 2 - Дюймы, 3 - Ярды");
        int magnitude = scan.nextInt();
        if (magnitude < 1 || magnitude > 3) {
            System.out.println("УНИКУМ!!!! Ты прочитал не внимательно варианты для выбора, попробуй снова!!!");
        }
        double miles = 1;
        //miles = 0.00062137;
        double Inches = 2;
        //Inches = 39.3701;
        double ayrds = 3;
        // ayrds = 1.0936;
        if (magnitude == 1) {
            double result1 = (int) lengthM * 0.00062137;
            System.out.println("Величина в милях равна = " + result1);
        }
        if (magnitude == 2) {
            double result2 = (int) lengthM * 39.3701;
            System.out.println("Величина в дюймах равна = " + result2);
        }
        if (magnitude == 3) {
            double result3 = (int) lengthM * 1.0936;
            System.out.println("Величина в ярдах равна = " + result3);
        }
    }

    public static void task7() {
        // Задача.7. Показать четные и не четные двухзначные числа из двух введенных пользователем и выстроить их.
        //-Ввоод 1го числа и проверка на двухзначность, Вввод 2-го числа и проверка на двухзначность,
        System.out.println("Введите первое двухзначное число");
        int twoNum1 = scan.nextInt();
        if (twoNum1 < 10 || twoNum1 > 99) {
            System.out.println("Вы ввели не двухзначное число");
        }
        System.out.println("Введите второе двухзначное число");
        int twoNum2 = scan.nextInt();
        if (twoNum2 < 10 || twoNum2 > 99) {
            System.out.println("Вы ввели не двухзначное число");
        }
        // - Если условие выполняется, то идет сравнение двух переменных друг с другом для выстраивания в ряд.
        if (twoNum2 < twoNum1) {
            int newTwoNum1 = twoNum2;
            int newTwoNum2 = twoNum1;
            System.out.println("Диапазон вычислений начинается с: " + newTwoNum1 + " " + "до: " + newTwoNum2);
            for (int q = newTwoNum1; q <= newTwoNum2; q++) {
                if (q % 2 != 0)
                    System.out.println(" Нечетные числа в диапазон вычислений : " + q);
            }
        }
        // Если первоначально первое число меньше второго, то выполняется расчет без нормализации
        for (int i = twoNum1; i <= twoNum2; i++) {
            if (i % 2 != 0)
                System.out.println(" Нечетные числа в диапазон вычислений : " + i);
        }
    }
    public static void task8(){
// Задача.8.Показать на экране таблицу умножения в диапазоне, указанным пользователем.
        //-Ввоод 1го числа, Вввод 2-го числа,Ввод максимального диапазона для каждого из чисел
        System.out.println("Введите первое однозначное число таблицы умножения: ");
        int twoNum1 = scan.nextInt();
        System.out.println("Введите максимальный диапазон для умножения первого числа: ");
        int maxNum1 = scan.nextInt();
        System.out.println("Введите второе однозначное число таблицы умножения: ");
        int twoNum2 = scan.nextInt();
        System.out.println("Введите максимальный диапазон для умножения второго числа: ");
        int maxNum2 = scan.nextInt();
        // Цикл для расчета первого числа
        for (int i = 0; i <= maxNum1; i++){
            int result = twoNum1 * i;
            System.out.println("Таблица умножения первого числа : " + twoNum1 + "*" + i + "=" + result);
        }
        // Цикл для расчета второго числа
        for (int i = 0; i <= maxNum2; i++){
            int result = twoNum2 * i;
            System.out.println("Таблица умножения второго числа : " + twoNum1 + "*" + i + "=" + result);
        }
    }
    public static void task9(){
// Задача.9.В одномерном массиве, заполненном случайными числами определить минимальные и максимальные элементы.
// Посчитать колличество отрицательных и положительных элементов, а также колличество нулей с выводом результатов на экран.


//Создать одномерный массив, заполненный случайными числами.
        int[] mas = new int[15];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 15);
            System.out.println(mas[i]);
        }
        // Определение минимальных и максимальных элементов.
// if i < mas.length; i++
        // System.out.println(mas[i]);
    }

}

          //  System.out.println(twoNumbers2 + twoNumbers1);}
       /* if (twoNumbers1 > 10 || twoNumbers1 < 99 && twoNumbers1 % 2); {
            System.out.println("Even number");
        } else if (num % 2 != 0) {
            System.out.println("Odd number");*/



