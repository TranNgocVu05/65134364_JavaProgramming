import java.util.Scanner;
import java.util.Locale;

public class QuyDoiTienTe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.println("Chon loai tien can quy doi:");
        System.out.println("1. USD sang VND");
        System.out.println("2. EUR sang VND");
        System.out.print("Lua chon (1 hoac 2): ");
        int luaChon = sc.nextInt();

        System.out.print("Nhap so tien: ");
        double soTien = sc.nextDouble();

        double tyGia;
        double vnd;

        if (luaChon == 1) {
            tyGia = 23500;
            vnd = soTien * tyGia;
            System.out.println("\nSo tien sau quy doi: " + vnd + " VND");
        } else if (luaChon == 2) {
            tyGia = 27000;
            vnd = soTien * tyGia;
            System.out.println("\nSo tien sau quy doi: " + vnd + " VND");
        } else {
            System.out.println("\nLua chon khong hop le!");
        }

        sc.close();
    }
}
