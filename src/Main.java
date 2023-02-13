import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            int input = inputFH();
            if (input == 5) {
                break;
            }
            System.out.println("\nВведите первое число: ");
            double n = new Scanner(System.in).nextDouble();
            System.out.println("Введите второе число: ");
            double n2 = new Scanner(System.in).nextDouble();

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

    private static int inputFH() {
        System.out.println("Добро пожаловать!\nВыберите действие:\n1 - сложить\n2 - разделить\n3 - умножить\n4 - вычесть\n5-выйти");
        return new Scanner(System.in).nextInt();
    }
}
