// Penambahan class untuk Prodi
// package Model;

// public class Prodi {
//    private String idProdi;
//    public String getIdProdi() {
//        return idProdi;
//    }

//    private String nama;
//    public String getNama() {
//        return nama;
//    }

//    public void setNama(String nama) {
//        this.nama = nama;
//    }

//    public Prodi(String idProdi, String nama) {
//        this.idProdi = idProdi;
//        this.nama = nama;
//    }
// }
package Model;

public class Prodi {
    private String idProdi;
    private String namaProdi;

    public Prodi(String idProdi, String namaProdi){
        this.idProdi = idProdi;
        this.namaProdi = namaProdi;
    }

    public String getIdProdi(){
        return idProdi;
    }

    public String getNamaProdi() {
        return namaProdi;
    }
}