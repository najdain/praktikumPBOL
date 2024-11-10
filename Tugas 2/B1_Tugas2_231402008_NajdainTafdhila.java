import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class B1_Tugas2_231402008_NajdainTafdhila {
    private static Map<String, String> mahasiswaMap = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int pilihan;
        do {
            
            System.out.println("\nInformasi Mahasiswa ");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Lihat Daftar Mahasiswa");
            System.out.println("3. Update Mahasiswa");
            System.out.println("4. Delete Mahasiswa");
            System.out.println("5. Exit");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); 

            switch (pilihan) {
                case 1:
                    tambahMahasiswa();
                    break;
                case 2:
                    lihatMahasiswa();
                    break;
                case 3:
                    updateMahasiswa();
                    break;
                case 4:
                    deleteMahasiswa();
                    break;
                case 5:
                    System.out.println("Program Selesai");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi");
            }
        } while (pilihan != 5);
    }

    private static void tambahMahasiswa() {
        System.out.print("Masukkan NIM: ");
        String nim = scanner.nextLine();

       
        if (mahasiswaMap.containsKey(nim)) {
            System.out.println("Mahasiswa dengan NIM tersebut sudah terdaftar");
            return;
        }

        System.out.print("Masukkan Nama: ");
        String nama = scanner.nextLine();
        mahasiswaMap.put(nim, nama); 
        System.out.println("Mahasiswa berhasil ditambahkan");
    }

    
    private static void lihatMahasiswa() {
        if (mahasiswaMap.isEmpty()) {
            System.out.println("Tidak ada data mahasiswa");
        } else {
            System.out.println("\n Data Mahasiswa ");
            for (Map.Entry<String, String> entry : mahasiswaMap.entrySet()) {
                System.out.println("NIM: " + entry.getKey() + ", Nama: " + entry.getValue());
            }
        }
    }

    private static void updateMahasiswa() {
        System.out.print("Masukkan NIM yang ingin diupdate: ");
        String nim = scanner.nextLine();

        
        if (!mahasiswaMap.containsKey(nim)) {
            System.out.println("Mahasiswa dengan NIM tersebut tidak ditemukan");
            return;
        }

        System.out.print("Masukkan Nama baru: ");
        String namaBaru = scanner.nextLine();
        mahasiswaMap.put(nim, namaBaru); 
        System.out.println("Data mahasiswa berhasil diupdate");
    }

  
    private static void deleteMahasiswa() {
        System.out.print("Masukkan NIM yang ingin dihapus: ");
        String nim = scanner.nextLine();

        
        if (!mahasiswaMap.containsKey(nim)) {
            System.out.println("Mahasiswa dengan NIM tersebut tidak ditemukan");
            return;
        }

        mahasiswaMap.remove(nim); 
        System.out.println("Mahasiswa telah dihapus");
    }
}
