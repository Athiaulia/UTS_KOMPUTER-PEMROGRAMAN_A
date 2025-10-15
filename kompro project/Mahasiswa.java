public class Mahasiswa {
   
    private String nama;
    private String npm;
    private boolean[] absensi; 

    public Mahasiswa(String nama, String npm, int totalPertemuan) {
        this.nama = nama;
        this.npm = npm;
        this.absensi = new boolean[totalPertemuan];
    }

    public void isiAbsensi(int pertemuan, boolean hadir) {
        if (pertemuan > 0 && pertemuan <= absensi.length) {
            this.absensi[pertemuan - 1] = hadir;
        }
    }

    public int hitungKehadiran() {
        int jumlahHadir = 0;
        for (boolean hadir : absensi) {
            if (hadir) {
                jumlahHadir++;
            }
        }
        return jumlahHadir;
    }

    public double getPersentaseKehadiran() {
        if (absensi.length == 0) {
            return 0.0;
        }
        int jumlahHadir = hitungKehadiran();
        return (double) jumlahHadir / absensi.length * 100;
    }

    public String getNama() {
        return nama;
    }
}