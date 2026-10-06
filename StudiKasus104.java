import java.util.Scanner;

public class StudiKasus104 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Preparation
        int hargaPerCup = 18000;
        int jumlahCup, uangBayar;
        int totalHarga, diskon, totalBayar;
        int kembalian, kurang;

        // Input
        System.out.println("Masukkan jumlah cup : ");
        jumlahCup = sc.nextInt();
        System.out.println("Masukkan uang bayar : ");
        uangBayar = sc.nextInt();
        
        // Menghitung total harga
        totalHarga = jumlahCup * hargaPerCup;
        diskon = 0;

        // Cek diskon
        if (totalHarga >= 100000) {
            diskon = totalHarga * 10 / 100;
        } else {
            diskon = 0;
        }

        // Menghitung total bayar
        totalBayar = totalHarga - diskon;

        // Output
        System.out.println("Total harga   : " + totalHarga);
        System.out.println("Diskon        : " + diskon);
        System.out.println("Total bayar   : " + totalBayar);

        // Keberhasilan pembayaran
        if (uangBayar >= totalBayar) {
            kembalian = uangBayar - totalBayar;
            System.out.println("Kembalian     : " + kembalian);
        } else {
            kurang = totalBayar - uangBayar;
            System.out.println("Uang tidak cukup, kurang RP : " + kurang);
        }

        sc.close();
    }
} 
