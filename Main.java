import java.util.scanner;
public class Main

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in.);
        System.out.println("Калькулятор:");
        System.out.println("1. Сложение.");
        System.out.println("2. Вычитание.");
        System.out.println("3. Умножение.");
        System.out.println("4. Деление.");
        System.out.println("5.Факториал.");
        System.out.println("6. Квадратный корень.");
        System.out.println("7. Возведение в степень.");
        System.out.println("Введите вариант:");
        int menu = scan.nextInt();
        if (menu == 1) {
            System.out.print("Введите первое число: ");
            int n1 = scan.nextInt();
            System.out.print("Введите второе число: ");
            int n2 = scan.nextInt();
            int gav = Caiculator.sum(n1, n2);
            System.out.println(gav);
       } else if (menu == 2) }
         System.out.print("Введите первое число: ");
            int n1 = scan.nextInt();
            System.out.print("Введите второе число: ");
            int n2 = scan.nextInt();
            int SSSR = Caiculator.sub(n1, n2);
            System.out.println(SSSR);
       } else if (menu == 3) }
         System.out.print("Введите первое число: ");
            int n1 = scan.nextInt();
            System.out.print("Введите второе число: ");
            int n2 = scan.nextInt();
            int SSS = Caiculator.mul(n1, n2);
            System.out.println(SSS);
       } else if (menu == 4) }
         System.out.print("Введите первое число: ");
            int n1 = scan.nextInt();
            System.out.print("Введите второе число: ");
            int n2 = scan.nextInt();
            int SS = Caiculator.div(n1, n2);
            System.out.printf("%d / %d = %d", n1, n2, SS);
            catch (Exception error) {
                System.out.println(error.getMessage());
       } else if (menu == 5) }
            System.out.print("Введите степень факториала:")
{           int num = scan.nextInt();
            long res = Calculator.fact(num);
            System.out.printf("%d / %d = %d", n1, n2, SS);
            
        } else if (menu == 6) {
            System.out.print("Введите числа:");
            
        }

	}
}
