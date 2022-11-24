import java.util.Scanner;

public class zadanie2_laba4 {
    public zadanie2_laba4() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите s");
        double s = sc.nextDouble();
        System.out.println("Введите v2");
        double v2 = sc.nextDouble();
        System.out.println("Введите t");
        double t = sc.nextDouble();
        double v1 = Math.sqrt((2.0 * v2 * s + t * Math.pow(v2, 2.0)) / t);
        System.out.println("v1 = " + v1 + " км/ч");
    }
}
