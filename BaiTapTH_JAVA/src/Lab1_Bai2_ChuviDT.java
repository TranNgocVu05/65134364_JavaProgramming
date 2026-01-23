import java.util.Scanner;
import java.util.Locale;

public class Lab1_Bai2_ChuviDT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.print("Nhap canh thu nhat: ");
        double canh1 = sc.nextDouble();

        System.out.print("Nhap canh thu hai: ");
        double canh2 = sc.nextDouble();

        double chuVi = (canh1 + canh2) * 2;
        double dienTich = canh1 * canh2;

        double canhNho = Math.min(canh1, canh2);

        System.out.println("\n--- KET QUA ---");
        System.out.println("Chu vi hinh chu nhat: " + chuVi);
        System.out.println("Dien tich hinh chu nhat: " + dienTich);
        System.out.println("Canh nho cua hinh chu nhat: " + canhNho);

        sc.close();
    }
}
