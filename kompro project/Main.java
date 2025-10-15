import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan nama Kelas: ");
        String namaKelas = scanner.nextLine();
        
        System.out.print("Masukkan total jumlah pertemuan: ");
        int totalPertemuan = 0;
        if (scanner.hasNextInt()) {
            totalPertemuan = scanner.nextInt();
        }
        scanner.nextLine(); 
        
        Kelas kelas = new Kelas(namaKelas);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = 0;
        if (scanner.hasNextInt()) {
            jumlahMahasiswa = scanner.nextInt();
        }
        scanner.nextLine();

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("\n--- Input Data Mahasiswa ke-" + (i + 1) + " ---");
            System.out.print("Nama: ");
            String nama = scanner.nextLine();
            System.out.print("NPM: ");
            String npm = scanner.nextLine();
            
            Mahasiswa mhs = new Mahasiswa(nama, npm, totalPertemuan);
            kelas.tambahMahasiswa(mhs);
        }

        List<Mahasiswa> daftarMhs = kelas.getDaftarMahasiswa();

        System.out.println("\n--- INPUT ABSENSI PER PERTEMUAN ---");
    
        for (int p = 1; p <= totalPertemuan; p++) {
            System.out.println("\n--- Pertemuan ke-" + p + " ---");

            for (Mahasiswa m : daftarMhs) {
                boolean inputValid = false;
                while (!inputValid) {
                    System.out.print("Apakah " + m.getNama() + " hadir? (y/t): ");
                    String hadirInput = scanner.next().toLowerCase();
                    
                    if (hadirInput.equals("y")) {
                        m.isiAbsensi(p, true);
                        inputValid = true;
                    } else if (hadirInput.equals("t")) {
                        m.isiAbsensi(p, false);
                        inputValid = true;
                    } else {
                        System.out.println("Input tidak valid. Harap masukkan 'y' atau 't'.");
                    }
                }
            }
        }
        
        kelas.tampilkanRekap();
        
        scanner.close();
    }
}