public class Main {
    public static void main(String[] args){
        System.out.println("PENDAFTARAN SEPAKBOLA");
        System.out.println("=======================================");

        System.out.println("CALON PEMAIN");
        Pemain calon_1 = new Pemain();
        calon_1.Posisi="CB";calon_1.sizeBaju="M";calon_1.sizeSepatu="42";
        calon_1.persyaratan();
        
        System.out.println("=======================================");
        System.out.println("CALON PELATIH");
        Pelatih pelatih_1 = new Pelatih();
        pelatih_1.Nama="Fajar";pelatih_1.Usia="30";pelatih_1.asalDaerah="Banten";
        pelatih_1.cara_daftar();
        pelatih_1.persyaratan();
        System.out.println("=======================================");
        
        


    }
}
