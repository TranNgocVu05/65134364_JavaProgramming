import java.util.Scanner;
import java.util.Locale;

public class GiaiPTBac1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.print("Nhap he so a: ");
        double a = sc.nextDouble();

        System.out.print("Nhap he so b: ");
        double b = sc.nextDouble();

        System.out.println("\n--- KET QUA ---");

        if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong trinh vo so nghiem");
            } else {
                System.out.println("Phuong trinh vo nghiem");
            }
        } else {
            double x = -b / a;
            System.out.println("Nghiem x = " + x);
        }

        sc.close();
    }
}
