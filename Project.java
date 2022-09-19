import java.util.Scanner;

public class Project {
  public static void main(String[] args) {
        final double ROUBLES_PER_USD = 72.12;

        int dollars;
        double roubles;
        int digit;

        Scanner scanner = new Scanner(System.in);

        // Получить сумму денег в usd.
        System.out.print("Введите сумму денег в долларах: ");
        dollars = scanner.nextInt();

        //отобразить сумму в долларах с правильным окончанием
        System.out.print(dollars);
        if (5 <= dollars && dollars <= 20) {
            System.out.print(" американских долларов равны");
        } else {
            digit = dollars % 10;

            if (digit == 1)
                System.out.print(" американский доллар равен ");
            else if (2 <= digit && digit <= 4)
                System.out.print(" американских доллара равны ");
            else
                System.out.print(" американсикй долларов равны ");
        }

        //Конвертировать сумму денег в российские рубли.
        roubles = dollars * ROUBLES_PER_USD;

        //Отобразить сумму денег в российских рублях в пользу покупателя.
        System.out.println((int)(roubles * 100) / 100.0 + " российских рублей");
  }
}