/**
 * 
 */

/**
 * 
 */
import java.util.Scanner;
import java.util.Locale;

public class Lab1_Bai3_TheTich {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US); 
       
        System.out.print("Nhap canh cua khoi lap phuong: ");
        double canh = sc.nextDouble();

        double theTich = canh * canh * canh;

        System.out.println("\n--- KET QUA ---");
        System.out.println("The tich khoi lap phuong: " + theTich);

        sc.close();
    }
}

