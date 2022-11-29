import java.util.Scanner;
import static java.lang.Math.*;

public class zadanie5_laba4 {
    public static void main(String[] args) {
        double x1, y1, x2, y2, x3, y3, y, x;
        x1 = Num();
        x2 = Num();
        x3 = Num();
        y1 = Num();
        y2 = Num();
        y3 = Num();
        x = ProjectionX(x1, x2, y1, y2, x3, y3);
        y = ProjectionY(x1, x2, y1, y2, x3, y3);
        System.out.println(x);
        System.out.println(y);
    }

    public static double ProjectionY(double x1, double x2, double y1, double y2, double x3, double y3) {
        double Ox = x1 - x2;
        double Oy = y1 - y2;
        double chisl = (x3 - x2) * Ox + (y3 - y2) * Oy;
        double znam = pow(Ox, 2) + pow(Oy, 2);
        double t = chisl / znam;
        return y2 + Oy * t;
    }

    public static double ProjectionX(double x1, double x2, double y1, double y2, double x3, double y3) {
        double Ox = x1 - x2;
        double Oy = y1 - y2;
        double chisl = (x3 - x2) * Ox + (y3 - y2) * Oy;
        double znam = pow(Ox, 2) + pow(Oy, 2);
        double t = chisl / znam;
        return x2 + Ox * t;
    }

    public static double Num() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите переменную");
        if (sc.hasNextDouble()) {
            return sc.nextDouble();
        } else {
            return Num();
        }
    }
}
