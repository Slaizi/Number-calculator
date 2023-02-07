import javax.swing.*;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.regex.Matcher;

public class Main {
    public static void main(String[] args) {
        while (true){
            System.out.println("Добро пожаловать в калькулятор!\nВведите первое число: ");
            double n = new Scanner(System.in).nextDouble();
            System.out.println("Введите второе число: ");
            double n2 = new Scanner(System.in).nextDouble();


                System.out.println("Выберите действие:\n1 - сложить\n2 - разделить\n3 - умножить\n4 - вычесть\n5-выйти");
                double input = new Scanner(System.in).nextDouble();
                if (input == 5) {
                    break;
                }
                if (input == 1)
                    n = (n + n2);
                else if (input == 2) {
                    n = (n / n2);
                } else if (input == 3) {
                    n = (n * n2);
                } else if (input == 4) {
                    n = (n - n2);
                } else {
                    System.out.println("Error");
                }
                {
                    System.out.println("Ответ : " + n);
                }

            }
        }
    }