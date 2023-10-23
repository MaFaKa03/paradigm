import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter number: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        table(n);
        }

    public static void table(int n){
        //метод принимает число n и выдает таблицу перемножения всех чисел от 1 до n на числа
        // от 1 до 10
        int res = 0;
        int m = n;
        for (int i = 1; i <= 10; i++) {
            while (n >= 1){
                res = i * n;
                System.out.println(i + " * " + n + " = " + res);
                System.out.println();
                n--;
            }
            n = m;
        }
    }
    /*
    Применяю императивный стиль так как не использую встроеные методы Java,
    так как работаю над частным случаем
    Использую процедурную парадигму, чтобы не мешать код (грубо говоря оставил мейн как вью,
    а метод table использую отдельно, чтобы проще было менять вью и метод, в случае необходимости
     */
}