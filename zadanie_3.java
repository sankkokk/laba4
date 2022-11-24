import java.util.Scanner;

public class zadanie3_laba4 {
    public zadanie3_laba4() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите n1");
        double n1 = sc.nextDouble();
        System.out.println("Введите n2");
        double n2 = sc.nextDouble();
        System.out.println("Введите R");
        double R = sc.nextDouble();
        double x = Math.sqrt(Math.pow(R, 2.0) / (Math.pow(n1, 2.0) + Math.pow(n2, 2.0)));
        double a1 = n1 * x;
        double a2 = n2 * x;
        System.out.println("a1 = " + a1 + " см");
        System.out.println("a2 = " + a2 + " см");
    }
}
