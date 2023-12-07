import java.util.Scanner;



// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


// Задача.7. Показать четные и не четные двухзначные числа из двух введенных пользователем и выстроить их.
        //-Ввоод 1го числа и проверка на двухзначность, Вввод 2-го числа и проверка на двухзначность,
        // - Если условие выполняется, то идет сравнение двух переменных друг с другом для выстраивания в ряд.
        //- После выстраивания в ряд, написание медода расчета не четных чисел в диапазоне, через невозможностью делоения на 2.
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
        if (twoNum1 < twoNum2);
        else (twoNum1 !% 2 && < twoNum2 !% 2){
            int mas2num2 = new int []{twoNum1 !% 2 && < twoNum2 !% 2};
            for(int i = twoNum1; i < twoNum2; i++)
            System.out.println(twoNum1 !% 2 && twoNum2 !% 2);
        }
        if (twoNum2 < twoNum1){
            int newTwoNum1 = twoNum2;
            int newTwoNum2 = twoNum1;
            System.out.println("Диапазон вычислений начинается с: "
                    + newTwoNum1 + " " + "до: " + newTwoNum2);}


    }
}

