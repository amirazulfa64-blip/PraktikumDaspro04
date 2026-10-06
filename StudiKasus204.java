import java.util.Scanner;

public class StudiKasus204 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama, jenisKegiatan;
        int jumlahDokumen, peringkatJuara, statusPKM;

        // Input
        System.out.println("Nama mahasiswa : ");
        nama = sc.nextLine();
        System.out.println("Jenis kegiatan : ");
        jenisKegiatan = sc.nextLine();

        // Logika Nested IF berdasarkan jenis kegiatan
        if (jenisKegiatan.equalsIgnoreCase("BELMAWA") ||
            jenisKegiatan.equalsIgnoreCase("BAKORMA") ||
            jenisKegiatan.equalsIgnoreCase("Mandiri")) {

            System.out.println("Jumlah dokumen : ");
            jumlahDokumen = sc.nextInt();
            System.out.println("Peringkat juara : ");
            peringkatJuara = sc.nextInt();

            if (jumlahDokumen ==4) {
                if (peringkatJuara >= 1 && peringkatJuara <= 3) {
                    System.out.println("Status : Memenuhi syarat. Dana penghargaan diberikan.");
                } else {
                    System.out.println("Status : Juara harapan atau peserta tidak memperoleh dana penghargaan.");
                }
            } else {
                int kurang = 4 - jumlahDokumen;
                System.out.println("Status : Dokumen tidak lengkap (kurang " + kurang + " dokumen). Dana penghargaan tidak diberikan.");

            }

        } else if (jenisKegiatan.equalsIgnoreCase("PKM")) {
            System.out.println("Jumlah dokumen : ");
            jumlahDokumen = sc.nextInt();
            System.out.println("Status pendanaan (1 = lolos, 0 = tidak lolos) : ");
            statusPKM = sc.nextInt();

            if (jumlahDokumen == 4) {
                if (statusPKM == 1) {
                    System.out.println("Status : Memenuhi syarat. Dana penghargaan diberikan.");
                } else {
                    System.out.println("Status : Tim tidak lolos pendanaan. Dana penghargaan tidak diberikan.");
                }
            } else {
                int kurang = 4 - jumlahDokumen;
                System.out.println("Status : Dokumen tidak lengkap (kurang " + kurang + "dokumen). Dana penghargaan tidak diberikan.");
            }
        } else {
            System.out.println("Status : Kegiatan di luar ketentuan. Dana penghargaan tidak diberikan.");
        }

        sc.close();
    }
}