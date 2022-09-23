import java.util.Scanner;

public class Project {
    static final double ROUBLES_PER_USD = 72.12;

    public static void main(String[] args) {

       int[] dollarsArray;
      double[] roublesArray;

      int n; // количество конвертаций

      Scanner scanner = new Scanner(System.in);
      //отбразить инструкцию
      instruct();

      // получать количество конвертаций , до тех пор, пока не введено верное значение
      do {
          System.out.print("Введите корректное количество конвертаций: ");
          n = scanner.nextInt();
      } while (n <= 0);

      // Получить n сумм денег в usd.
      System.out.print("Введите " + n + " сумм денег в американских долларах: ");
      dollarsArray = new int[n];

      for (int j = 0; j < n; j++) {
          dollarsArray[j] = scanner.nextInt();
      }

      roublesArray = find_roubles(dollarsArray, n);

      //Отобразить в таблице n сумм денег в американских доллларах и
      // эквивалентные им суммы денег в российских рублях в пользу покупателя.
      System.out.println("\n    Сумма, $  Сумма, ₽");
      for (int j = 0; j < n; j++) {
          System.out.println("\t" + dollarsArray[j] + "   \t  " + (int)(roublesArray[j] * 100) / 100.0);
      }
  }

    /**
     * конвертирует n сумм денег из долларов в российские рубли
     * @param dollars
     * @param n
     * @return
     */
    public static double[] find_roubles(int[] dollars, int n) {
        double[] roublesArray = new double[n];

        for (int j = 0; j < n; j++)
            roublesArray[j] = ROUBLES_PER_USD * dollars[j];

        return roublesArray;
    }

    /**
     * Отображает инструкцию
     */
    private static void instruct() {
        System.out.println("Эта программа конвертирует сумму денег из американских долларов в российские рубли.");
        System.out.println("Курс покупки равен " + ROUBLES_PER_USD + " рубля\n");
    }
}