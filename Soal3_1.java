import java.util.Scanner;

public class Soal3_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Aplikasi Hitung Rata-rata Nilai Ujian ===");
        
        // Input jumlah siswa
        System.out.print("Masukkan Jumlah Siswa: ");
        int jumlahSiswa = 0;
        if (scanner.hasNextInt()) {
            jumlahSiswa = scanner.nextInt();
        } else {
            System.out.println("Input tidak valid. Harap masukkan angka bulat.");
            scanner.close();
            return;
        }

        if (jumlahSiswa <= 0) {
            System.out.println("Jumlah siswa harus lebih dari 0.");
            scanner.close();
            return;
        }

        double totalNilai = 0;
        int[] nilaiSiswa = new int[jumlahSiswa]; // Array untuk menyimpan nilai (opsional, bisa langsung dijumlahkan)

        // Loop untuk memasukkan nilai setiap siswa
        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.printf("Masukkan Nilai Siswa ke-%d (0-100): ", (i + 1));
            if (scanner.hasNextInt()) {
                int nilai = scanner.nextInt();
                nilaiSiswa[i] = nilai;
                totalNilai += nilai;
            } else {
                System.out.println("Input tidak valid. Program dihentikan.");
                scanner.close();
                return;
            }
        }

        // Hitung rata-rata
        double rataRata = totalNilai / jumlahSiswa;

        // Cetak hasil
        System.out.println("\n=== Hasil Rekapitulasi ===");
        System.out.printf("Total Nilai dari %d siswa: %.0f\n", jumlahSiswa, totalNilai);
        System.out.printf("Nilai Rata-rata Ujian: %.2f\n", rataRata);

        scanner.close();
    }
}


