public class Karyawan {

    private String nama;
    private double gajiPokok;
    private Perusahaan perusahaan;

    public Karyawan(String nama, double gajiPokok, Perusahaan perusahaan){
        setNama(nama);
        this.gajiPokok = gajiPokok;
        this.perusahaan = perusahaan;
    }

    public void setNama(String nama){
        if(nama.length() >= 4){
            this.nama = nama;
        } else {
            throw new IllegalArgumentException("Nama  minimal 4 karakter.");
        }
    }

    public void info(){
        System.out.println("Nama karyawan: " + nama);
        System.out.println("Gaji pokok: "+ gajiPokok);
        System.out.println("Perusahaan: " + perusahaan.getNamaPerusahaan());
    }

    
}
