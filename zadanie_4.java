import java.util.Scanner;
public class zadanie4_laba4 {
    public zadanie4_laba4() {
    }
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите r1");
        double r1 = sc.nextDouble();
        System.out.println("Введите r2");
        double r2 = sc.nextDouble();
        System.out.println("Введите r3");
        double r3 = sc.nextDouble();
        System.out.println("Введите r4");
        double r4 = sc.nextDouble();
        double r = r1 + r2 + r3 + r4;
        System.out.println("" + r + " Ом");
    }
}
