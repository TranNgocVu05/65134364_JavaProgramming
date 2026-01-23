/**
 * 
 */

/**
 * 
 */
import java.util.Scanner;
import java.util.Locale;

public class Lab1_Bai1_DTB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.print("Nhap ho va ten sinh vien: ");
        String hoTen = sc.nextLine();

        System.out.print("Nhap diem trung binh: ");
        double diemTrungBinh = sc.nextDouble();

        System.out.println("\n--- THONG TIN SINH VIEN ---");
        System.out.println("Ho va ten: " + hoTen);
        System.out.println("Diem trung binh: " + diemTrungBinh);

        sc.close();
    }
}
