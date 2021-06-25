
package pendaftaran;


public class Peserta {
    public String cekKelayakan(int nilaiMatematika, int nilaiFisika, int nilaiKimia) {
        
        String kelayakan;
        
        if(nilaiMatematika >= 65 && nilaiFisika >= 55 && nilaiKimia >= 50) {
            kelayakan = "layak ikut kursus";
        } else if((nilaiMatematika + nilaiFisika + nilaiKimia) >= 190) {
            kelayakan = "layak ikut kursus";
        } else if((nilaiMatematika + nilaiFisika) >= 140) {
            kelayakan = "layak ikut kursus";
        } else {
            kelayakan = "tidak layak ikut kursus";
        }
        
        return kelayakan;
    }
}
