/*package pl.pp;
import java.util.Scanner;

public class mojaTrzeciaAplikacja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj proszę liczbę większą od 100:");
        var number1 = scanner.nextDouble();
        while (number1 <= 100) {
            System.out.println("Liczba nie jest większa od 100, podaj jeszcze raz:");
            number1 = scanner.nextDouble();
        }
        System.out.println("Dziękuję! Podałeś liczbę: " + number1);
        double number2;
        do {
            System.out.println("Podaj proszę liczbę większą od 200:");
            number2 = scanner.nextDouble();

        } while (number2 <= 200);
        System.out.println("Dziękuję! Podałeś liczbę: " + number2);
        int wynik = 0;
        for (var i = 1; i <= 10; i++) {
            wynik = wynik + i;
            System.out.println("Przebieg numer " + i + " w pętli for, a zmienna wynik = " + wynik);
        }
        System.out.println("Podaj proszę liczbę x: ");
        var x = scanner.nextDouble();
        System.out.println("Podaj proszę liczbę y: ");
        var y = scanner.nextDouble();

        if (x > y) {
            System.out.println("x jest większe od y");
        } else if (x < y) {
            System.out.println("x jest mniejsze od y");
        } else {
            System.out.println("x jest równe y");
        }
        while (true) {
            System.out.println("Wpisz wartość -1 żeby wyjść z programu");
            var input = scanner.nextDouble();
            if (input == -1) {
                System.out.println("Wyjście...");
                break;
            }
        }
        scanner.close();
    }
}*/

/*
package pl.pp;
import java.util.Scanner;

public class mojaTrzeciaAplikacja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Proszę podać liczbę dni (wpisz wartość -1 żeby wyjść z programu): ");
            int days = scanner.nextInt();

            if (days <= 0) {
                System.out.println("Wyjście....");
                break;
            }

            int weeks = days / 7;
            int remainingDays = days % 7;

            System.out.println(days + " dni to " + weeks + " tygodnie i " + remainingDays + " dni.");
        }

        scanner.close();
    }
}
*/


/*package  pl.pp;
import java.util.Scanner;
public class mojaTrzeciaAplikacja {
    public static  void main(String [] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Proszę podać temperatury w skali Fahrenheit’a (wpisz wartość -1 żeby wyjść z programu ): ");
            double fahrenheit = scanner.nextDouble();

            if (fahrenheit == -1) {
                System.out.println("Wyjście.....");
                break;
            }

            double celsius = (fahrenheit - 32.0) / 1.8;
            double kelvin = celsius + 273.16;

            System.out.printf("%.2f Fahrenheit’a = %.2f Celsjusz = %.2f Kelwin%n",
                    fahrenheit, celsius, kelvin);
        }

        scanner.close();
    }
}*/




