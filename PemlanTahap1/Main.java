public class Main{
    public static void main(String[] args) {
        
        Perusahaan perusahaan = new Perusahaan("PT. Pertamina");

        Karyawan karyawan1 = new Karyawan("Rayhan Wira", 8000000, perusahaan);
        Karyawan karyawan2 = new Karyawan("Carmella Eliza", 7000000, perusahaan);

        karyawan1.info();
        System.out.println(" ");
        karyawan2.info();
    }
}