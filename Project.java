import java.util.Scanner;

public class Project {
    static final double ROUBLES_PER_USD = 72.12;

    public static void main(String[] args) {

        int dollars;
        double roubles;
        int digit; // последняя цифра dollars
        int n; // количество конвертаций
        int i; // счетчик

        Scanner scanner = new Scanner(System.in);
        //отбразить инструкцию
        instruct();

        // получать количество конвертаций , до тех пор,
        // пока не введено верное значение
        do {
            System.out.print("Введите корректное количество конвертаций: ");
            n = scanner.nextInt();
        } while (n <= 0);
        /*
        До тех пор , пока не конвертированы все суммы,
        получать , отображать и конвертировать суммы денег в американских долларах
        и отображать суммы денег в российских рублях
         */
        for (int j = 0; j < n; j++) {

            // Получить сумму денег в usd.
            System.out.print("Введите сумму денег в долларах: ");
            dollars = scanner.nextInt();

            //отобразить сумму в долларах с правильным окончанием
            System.out.print(dollars);
            if (5 <= dollars && dollars <= 20)
                System.out.print(" американских долларов равны");
            else {
                digit = dollars % 10;

                if (digit == 1)
                    System.out.print(" американский доллар равен ");
                else if (2 <= digit && digit <= 4)
                    System.out.print(" американских доллара равны ");
                else
                    System.out.print(" американских долларов равны ");
            }

            //Конвертировать сумму денег в российские рубли.
            roubles = find_roubles(dollars);

            //Отобразить сумму денег в российских рублях в пользу покупателя.
            System.out.println((int) (roubles * 100) / 100.0 + " российских рублей");
        }
    }

    /**
     * конвертирует сумму денег из долларов в российские рубли
     * @param dollars
     * @return
     */
    private static double find_roubles(int dollars) {
        return dollars * ROUBLES_PER_USD;
    }

    /**
     * Отображает инструкцию
     */
    private static void instruct() {
        System.out.println("Эта программа конвертирует сумму денег из американских долларов в российские рубли.");
        System.out.println("Курс покупки равен " + ROUBLES_PER_USD + " рубля\n");
    }
}