import java.util.Scanner;
import static java.lang.Math.*;
public class zadanie1{
    public static double SearchingV(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите y");
        double y = sc.nextDouble();
        System.out.println("Введите w");
        double w = sc.nextDouble();
        double V;
        V= pow(y+2*w,3)/(log(y+0.75));
        System.out.println("V = " + V);
        return V;
    }
    public static double SearchingB(){
    Scanner sc = new Scanner(System.in);
        System.out.println("Введите z");
        double z = sc.nextDouble();
        System.out.println("Введите y");
        double y = sc.nextDouble();
        System.out.println("Введите x");
        double x = sc.nextDouble();
        double B;
        B = (asin(acos(x+y+pow(z,2)))-acos(asin(x+y-pow(z,2))))/abs(x+y+z);
        System.out.println("B = " + B);
        return B;
    }
    public static void main(String[] args) {
        SearchingV();
        SearchingB();
    }
}
