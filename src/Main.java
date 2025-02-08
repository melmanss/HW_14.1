import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Printer printer = new MyPrinter();

        while (true) {
            System.out.print("Введіть текст повідомлення (або 'exit' для виходу): ");
            String text = scanner.nextLine();
            if (text.equalsIgnoreCase("exit")) {
                break; // Вихід з циклу, якщо введено "exit"
            }

            System.out.print("Введіть ім'я відправника (можна залишити порожнім): ");
            String sender = scanner.nextLine();

            // Виклик методу print
            printer.print(sender, text);
        }

        scanner.close(); // Закриття сканера
    }
}