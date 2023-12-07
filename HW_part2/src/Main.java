import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //  Задание.1.Вывести построчно в консоль слова Стива Джобса
        System.out.println("Your time is limited");
        System.out.println("so don’t waste it");
        System.out.println("living someone else’s life");

        // Задание.2. Посчитать процент от числа
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число от которого нужно посчитать процент: ");
        int a = scan.nextInt();
        System.out.println("Введите для расчета размер процента от первоначальногно числа");
        int b = scan.nextInt();
        System.out.println("Сумма процентов:" + a * b / 100);

        // Задание.3. Ввести 3 отдельные цифры и сложить в одно число.
        Scanner scan1 = new Scanner(System.in);
        System.out.print("Введите первое число, которое нужно сложить: ");
        int d = scan1.nextInt();
        System.out.print("Введите второе число, которое нужно сложить: ");
        int f = scan1.nextInt();
        System.out.print("Введите третье число, которое нужно сложить: ");
        int g = scan1.nextInt();
        int result = d + f + g;
        System.out.println("Сумма трех чисел: " + result);

        // Задача.4.Переворот шестизначного числа + провека количества символов (Не работает проверка)
        System.out.println("Введите шестизначное число");
        Scanner scan2 = new Scanner(System.in);
        int numberToReverse = scan2.nextInt();
        int length = Integer.parseInt(String.valueOf(numberToReverse));
        if (length > 6 || length <6);{
        System.out.println("Вы ввели не шестизначное число");}
        StringBuilder builder = new StringBuilder(String.valueOf(numberToReverse));
        builder.reverse();
        System.out.println("Число наоборот " + builder);

// Задача.5.Ввод значений и проверка на соответсвия изх временам года.
        System.out.println("Введите порядковый номер месяца календарного года");
        Scanner scan3 = new Scanner(System.in);
        int month = scan3.nextInt();
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

        // Задача.6. Написать программу конвертации величин метрической системы.
        System.out.println("Введите количество метров для конвертации длинны");
        Scanner scan4 = new Scanner(System.in);
        int lengthM = scan4.nextInt();
        System.out.println("Выберете величину длинны для преобразования: 1 - Мили, 2 - Дюймы, 3 - Ярды");
        Scanner scan5 = new Scanner(System.in);
        int magnitude = scan5.nextInt();
        if (magnitude > 1 || magnitude < 3) {
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
            System.out.println("Величина в милях равна = " + result1);}
        if (magnitude == 2) {
            double result2 = (int) lengthM * 39.3701;
            System.out.println("Величина в дюймах равна = " + result2);
        }
        if (magnitude == 3) {
            double result3 = (int) lengthM * 1.0936;
            System.out.println("Величина в ярдах равна = " + result3);
        }

       // Задача.7. Показать четные и не четные двухзначные числа из двух введенных пользователем и выстроить их.
        //-Ввоод 1го числа и проверка на двухзначность, Вввод 2-го числа и проверка на двухзначность,
       // - Если условие выполняется, то идет сравнение двух переменных друг с другом для выстраивания в ряд.
        //- После выстраивания в ряд, написание медода расчета чисел в диапазоне через деление на 2 для четных чисел и невозможностью делоения на 2 для не четных.
        // - public int compareTo( NumberSubClass referenceName )
        System.out.println("Введите первое двухзначное число");
        Scanner scan6 = new Scanner(System.in);
        int twoNum1 = scan6.nextInt();
        if (twoNum1 < 10 || twoNum1 > 99){
            System.out.println("Вы ввели не двухзначное число");}
        System.out.println("Введите второе двухзначное число");
        int twoNum2 = scan6.nextInt();
        if (twoNum2 < 10 || twoNum2 > 99){
            System.out.println("Вы ввели не двухзначное число");}
        if (twoNum2 < twoNum1){
            int newTwoNum1 = twoNum2;
            int newTwoNum2 = twoNum1;
            System.out.println("Диапазон вычислений начинается с: "
                    + newTwoNum1 + " " + "до: " + newTwoNum2);}
            }
          //  System.out.println(twoNumbers2 + twoNumbers1);}
       /* if (twoNumbers1 > 10 || twoNumbers1 < 99 && twoNumbers1 % 2); {
            System.out.println("Even number");
        } else if (num % 2 != 0) {
            System.out.println("Odd number");*/



