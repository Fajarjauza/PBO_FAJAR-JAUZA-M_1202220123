public class Salary extends Karyawan {
    double gajipokok=0;
    double lembur=0;
    double total =0;

    public Salary(String nama, String jenisKelamin, String tempatTanggalLahir, String alamatTinggal,
            String nomorTelepon, String Email,double gajipokok,double lembur) {
        super(nama, jenisKelamin, tempatTanggalLahir, alamatTinggal, nomorTelepon, Email);
        this.gajipokok  =gajipokok;
        this.lembur     =lembur;
    }

    public double getGajipokok(double gajipokok){
        return gajipokok;
    }

    public double getLembur(double lembur){
        return lembur;
    }
    
    public double gajitotal(){
        total = gajipokok+lembur;
        return total;
    }

    @Override
    public String toString() {
        return super.toString()+"\nRP. "+gajipokok+" + RP. "+lembur+"\n= RP. "+gajitotal();
    }
}
