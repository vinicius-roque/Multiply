import java.util.Scanner;

public class App {
  public static void main(String[] args) throws Exception {
    try (Scanner inputNumber = new Scanner(System.in)) {
      System.out.println("Insira um número: ");

      int number = inputNumber.nextInt();

      for (int i = 0; i <= 10; i++) {
        if (i == 0) {
          System.out.println("Tabela de multiplicação do " + number + ":");
        }
        System.out.println(number + " x " + i + " = " + (number * i));
      }
    }
  }
}