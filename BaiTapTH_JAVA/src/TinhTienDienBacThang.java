import java.util.Locale;
import java.util.Scanner;

public class TinhTienDienBacThang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.print("Nhap so dien tieu thu (kWh): ");
        double kWh = sc.nextDouble();

        if (kWh < 0) {
            System.out.println("So kWh khong hop le!");
            sc.close();
            return;
        }

        
        double gia1 = 1678;
        double gia2 = 1734;
        double gia3 = 2014;
        double gia4 = 2536;
        double gia5 = 2834;
        double gia6 = 2927;

        double tien = 0;

        if (kWh <= 50) {
            tien = kWh * gia1;
        } else if (kWh <= 100) {
            tien = 50 * gia1 + (kWh - 50) * gia2;
        } else if (kWh <= 200) {
            tien = 50 * gia1 + 50 * gia2 + (kWh - 100) * gia3;
        } else if (kWh <= 300) {
            tien = 50 * gia1 + 50 * gia2 + 100 * gia3 + (kWh - 200) * gia4;
        } else if (kWh <= 400) {
            tien = 50 * gia1 + 50 * gia2 + 100 * gia3 + 100 * gia4 + (kWh - 300) * gia5;
        } else {
            tien = 50 * gia1 + 50 * gia2 + 100 * gia3 + 100 * gia4 + 100 * gia5 + (kWh - 400) * gia6;
        }

        System.out.println("\n--- KET QUA ---");
        System.out.printf("So dien: %.2f kWh%n", kWh);
        System.out.printf("Tien dien: %.0f VND%n", tien);

        sc.close();
    }
}
