// Pemain mewarisi semua dari Sepakbola
public class Pemain extends Sepakbola {
    public String Posisi;
    public String sizeSepatu;
    public String sizeBaju;


    @Override
    public void persyaratan() {
        System.out.println("Persyaratan");
        System.out.println("Posisi: "+Posisi);
        System.out.println("Size Sepatu: "+sizeSepatu);
        System.out.println("Size Baju: "+sizeBaju);
    }

    @Override
    public void cara_daftar() {
        System.out.println("Cara Daftar:");
        
    }
    

}
