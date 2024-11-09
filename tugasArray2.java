import java.util.Scanner;
public class tugasArray2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] hasilSurvei = new int[10][6];

        System.out.println("Masukkan data survei (1-5):");
        for (int i = 0; i < 10; i++) {
            System.out.println("Responden ke-" + (i + 1) + ":");
            for (int j = 0; j < 6; j++) {
                System.out.print("Pertanyaan " + (j + 1) + ": ");
                hasilSurvei[i][j] = scanner.nextInt();
            }
        }
        System.out.println("\nHasil Survei:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Responden " + (i + 1) + ": ");
            for (int j = 0; j < 6; j++) {
                System.out.print(hasilSurvei[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\nNilai Rata-Rata Setiap Responden:");
        for (int i = 0; i < 10; i++) {
            int  totalRespon = 0;
            for (int j = 0; j < 6; j++) {
                totalRespon += hasilSurvei[i][j];
            }
            double rataRataResponden = (double) totalRespon / 6;
            System.out.println("Responden " + (i + 1) + ": " + rataRataResponden);
        
        }
        System.out.println("\nNilai Rata-Rata Setiap Pertanyaan:");
        for (int j = 0; j < 6; j++) {
            int totalPertanyaan = 0;
            for (int i = 0; i < 10; i++) {
                totalPertanyaan += hasilSurvei[i][j];
            }
            double rataRataPertanyaan = (double) totalPertanyaan / 10;
            System.out.println("Pertanyaan " + (j + 1) + ": " + rataRataPertanyaan);
        }
        
        int totalKeseluruhan = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 6; j++) {
                totalKeseluruhan += hasilSurvei[i][j];
            }
            double rataRataKeseluruhan = (double) totalKeseluruhan / (10 * 6);
            System.out.println("\nRata-rata Keseluruhan: " + rataRataKeseluruhan);
        }
        }
    }
