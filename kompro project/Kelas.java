import java.util.ArrayList;
import java.util.List;
import java.util.Locale; 

public class Kelas {
   
    private String namaKelas;
    private List<Mahasiswa> daftarMahasiswa;

    public Kelas(String namaKelas) {
        this.namaKelas = namaKelas;
        this.daftarMahasiswa = new ArrayList<>();
    }

    public void tambahMahasiswa(Mahasiswa m) {
        daftarMahasiswa.add(m);
    }

    public void tampilkanRekap() {
        System.out.println("\n--- REKAP ABSENSI KELAS: " + namaKelas + " ---");

        int maxNamaLength = 0;
        for (Mahasiswa m : daftarMahasiswa) {
            if (m.getNama().length() > maxNamaLength) {
                maxNamaLength = m.getNama().length();
            }
        }
        
        int lebarNama = maxNamaLength + 3; 
        String formatString = "Nama: %-" + lebarNama + "s | Persentase Kehadiran: %8.2f%% | Status: %s\n";
        
        for (Mahasiswa m : daftarMahasiswa) {
            double persentase = m.getPersentaseKehadiran();
            String statusLulus;

            if (persentase >= 75.0) {
                statusLulus = "LULUS";
            } else {
                statusLulus = "TIDAK LULUS";
            }

            String outputLine = String.format(Locale.US, formatString, m.getNama(), persentase, statusLulus);
            System.out.print(outputLine);
        }
        System.out.println("----------------------------------------------------------------------------------"); 
    }

    public List<Mahasiswa> getDaftarMahasiswa() {
        return daftarMahasiswa;
    }
}