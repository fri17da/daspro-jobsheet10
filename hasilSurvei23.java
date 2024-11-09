import java.util.Scanner;

public class hasilSurvei23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int jumlahResponden = 10;
        int jumlahPertanyaan = 6;
        int[][] hasilSurvei = new int[jumlahResponden][jumlahPertanyaan];
        // a. Menyimpan hasil survei
        System.out.println("Masukkan hasil survei (nilai 1-5) untuk setiap responden:");
        for (int i = 0; i < jumlahResponden; i++) {
            System.out.println("Responden " + (i + 1) + ":");
            for (int j = 0; j < jumlahPertanyaan; j++) {
                System.out.print("Pertanyaan " + (j + 1) + ": ");
                hasilSurvei[i][j] = scanner.nextInt();
                while (hasilSurvei[i][j] < 1 || hasilSurvei[i][j] > 5) {
                    System.out.print("Nilai tidak valid. Masukkan nilai antara 1 hingga 5: ");
                    hasilSurvei[i][j] = scanner.nextInt();
                }
            }
        }
        // b. Menampilkan nilai rata-rata untuk setiap responden
        System.out.println("\nRata-rata nilai untuk setiap responden:");
        for (int i = 0; i < jumlahResponden; i++) {
            int totalResponden = 0;
            for (int j = 0; j < jumlahPertanyaan; j++) {
                totalResponden += hasilSurvei[i][j];
            }
            double rataRataResponden = (double) totalResponden / jumlahPertanyaan;
            // Menampilkan rata-rata dengan 2 angka desimal
            System.out.printf("Responden %d: %.2f\n", (i + 1), rataRataResponden);
        }

        // c. Menampilkan nilai rata-rata untuk setiap pertanyaan
        System.out.println("\nRata-rata nilai untuk setiap pertanyaan:");
        for (int j = 0; j < jumlahPertanyaan; j++) {
            int totalPertanyaan = 0;
            for (int i = 0; i < jumlahResponden; i++) {
                totalPertanyaan += hasilSurvei[i][j];
            }
            double rataRataPertanyaan = (double) totalPertanyaan / jumlahResponden;
            // Menampilkan rata-rata dengan 2 angka desimal
            System.out.printf("Pertanyaan %d: %.2f\n", (j + 1), rataRataPertanyaan);
        }

        // d. Menampilkan nilai rata-rata secara keseluruhan
        int totalKeseluruhan = 0;
        for (int i = 0; i < jumlahResponden; i++) {
            for (int j = 0; j < jumlahPertanyaan; j++) {
                totalKeseluruhan += hasilSurvei[i][j];
            }
        }
        double rataRataKeseluruhan = (double) totalKeseluruhan / (jumlahResponden * jumlahPertanyaan);
        // Menampilkan rata-rata keseluruhan dengan 2 angka desimal
        System.out.printf("\nRata-rata nilai keseluruhan: %.2f\n", rataRataKeseluruhan);
    }
}