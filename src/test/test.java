
package test;

import pendaftaran.Peserta;

public class test {
    public static void main(String[] args) {
        Peserta peserta = new Peserta();
        
        String kelayakan;
        
        // test case 1
        kelayakan = peserta.cekKelayakan(80,60,55);
        System.out.println(kelayakan);
        // test case 2
        kelayakan = peserta.cekKelayakan(65,55,50);
        System.out.println(kelayakan);
        // test case 3
        kelayakan = peserta.cekKelayakan(100,30,60);
        System.out.println(kelayakan);
        // test case 4
        kelayakan = peserta.cekKelayakan(30,100,60);
        System.out.println(kelayakan);
        // test case 5
        kelayakan = peserta.cekKelayakan(60,30,100);
        System.out.println(kelayakan);
        // test case 6
        kelayakan = peserta.cekKelayakan(80,60,30);
        System.out.println(kelayakan);
        // test case 7
        kelayakan = peserta.cekKelayakan(60,80,30);
        System.out.println(kelayakan);
        // test case 8
        kelayakan = peserta.cekKelayakan(60,60,50);
        System.out.println(kelayakan);
        // test case 9
        kelayakan = peserta.cekKelayakan(100,30,0);
        System.out.println(kelayakan);
    }
}
