// Pelatih mewarisi semua dari Sepakbola
public class Pelatih extends Sepakbola {
    public String Pengalaman;

    @Override
    public void cara_daftar() {
        System.out.println("Cara Daftar");
        System.out.println("Nama:"+Nama);
        System.out.println("Usia: "+Usia);
        System.out.println("Asal Daerah: "+asalDaerah);
    }

    @Override
    public void persyaratan() {
        System.out.println("Pengalaman");
    }


}
