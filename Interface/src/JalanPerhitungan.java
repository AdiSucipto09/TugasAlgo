import Model.Perhitungan;

public class JalanPerhitungan {

    public static void main(String[] args) {
        Perhitungan s = new Perhitungan(4, 6, 0);

        s.PrintJudul();
        
        int HasilTambah = s.hitungtmbh(4, 6);
        System.out.println(HasilTambah);
        
        int HasilKalian = s.hitungkalian(4, 6);
        System.out.println(HasilKalian);

    }
}
