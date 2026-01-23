
import java.util.Scanner;
import java.util.Locale;

public class Lab1_Bai4_Delta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US); 

        System.out.print("Nhap he so a: ");
        double a = sc.nextDouble();

        System.out.print("Nhap he so b: ");
        double b = sc.nextDouble();

        System.out.print("Nhap he so c: ");
        double c = sc.nextDouble();

        double delta = b * b - 4 * a * c;

        System.out.println("\n--- KET QUA ---");
        System.out.println("Delta = " + delta);

        if (delta >= 0) {
            double canDelta = Math.sqrt(delta);
            System.out.println("Can delta = " + canDelta);
        } else {
            System.out.println("Delta am, khong co can delta trong tap so thuc");
        }

        sc.close();
    }
}
