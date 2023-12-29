public class Karyawan {
    
    public static String[] toString;
    private String nama;
    private String jenisKelamin;
    private String tanggalLahir;
    private String alamatTinggal;
    private String nomorTelepon;
    private String email;

    public Karyawan(String nama, String jenisKelamin, String tempatTanggalLahir, String alamatTinggal, String nomorTelepon, String Email) {
        this.nama = nama;
        this.jenisKelamin   = jenisKelamin;
        this.tanggalLahir   = tempatTanggalLahir;
        this.alamatTinggal  = alamatTinggal;
        this.nomorTelepon   = nomorTelepon;
        this.email          = Email;
    }
    public String getNama() {
        return nama;
    }
    public String getjenisKelamin(String jenisKelamin){
        return jenisKelamin;
    }
    public String gettanggalLahir(String tanggalLahir){
        return tanggalLahir;
    }
    public String getalamatTinggal(String alamatTinggal){
        return alamatTinggal;
    }
    public String getnomorTelepon(String nomorTelepon){
        return nomorTelepon;
    }
    public String getemail(String Email){
        return Email;
    }

    @Override
    public String toString(){
        return "\nData Karyawan\n"+nama+", "+jenisKelamin+", "+tanggalLahir+", "+alamatTinggal+", "+nomorTelepon+", "+email;
    }
}
