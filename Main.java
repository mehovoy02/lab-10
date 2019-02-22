//программа выполняет вычисление факториалов + поиск 2-х исключений
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое число в диапазоне: [0,13]");
        //больше 13 бессмысленно, т.к. переполняется int
        int buf = 0;
        try {
            buf = sc.nextInt();
        } catch (InputMismatchException exception) {
            System.out.println(exception.getMessage());
        }
        System.out.println("Результат факториала: ");
        try {
            System.out.println(Factorial.getFactorial(buf));
        }catch(FactorialException exception){
                System.out.println(exception.getMessage());
                System.out.println(exception.getNumber());
            }
            int[] m = {-13, 0, 13};
            try {
                System.out.println("Введите целое число");
                int a = sc.nextInt();//чтобы несколько процессов выполнялись одновременно
                m[a] = 100 / a;
                System.out.println(m[a]);

            } catch (ArithmeticException e) {
                System.out.println("Произошла недопустимая арифметическая операция");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Обращение по недопустимому индексу массива");
            } catch (InputMismatchException exception) {
                System.out.println(exception.getMessage());
            }
            System.out.println("Done");
        }
    }
