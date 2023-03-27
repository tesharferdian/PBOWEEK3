import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai a: ");
        double a = input.nextDouble();

        System.out.print("Masukkan nilai b: ");
        double b = input.nextDouble();

        System.out.print("Masukkan nilai c: ");
        double c = input.nextDouble();

        double d = Math.pow(b, 2) - 4 * a * c; // Menghitung nilai diskriminan

        if (d > 0) { // Jika D > 0, maka akar-akar real dan berbeda
            double x1 = (-b + Math.sqrt(d)) / (2 * a);
            double x2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("Akar-akar persamaan: x1 = " + x1 + ", x2 = " + x2);
        } else if (d == 0) { // Jika D = 0, maka akar-akar real dan sama
            double x = -b / (2 * a);
            System.out.println("Akar-akar persamaan: x1 = x2 = " + x);
        } else { // Jika D < 0, maka akar-akar imajiner
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-d) / (2 * a);
            System.out.println("Akar-akar persamaan: x1 = " + realPart + " + " + imaginaryPart + "i, x2 = " + realPart + " - " + imaginaryPart + "i");
        }
    }
}
