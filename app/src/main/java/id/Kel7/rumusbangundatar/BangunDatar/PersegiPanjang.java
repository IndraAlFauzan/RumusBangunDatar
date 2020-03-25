package id.Kel7.rumusbangundatar.BangunDatar;

/**
 * Class Persegi Panjang, berisi method untuk menghitung Persegi Panjang
 */

public class PersegiPanjang {
    /**
     * Variabel Panjang Persegi Panjang
     */
    public double panjang;

    /**
     * Variabel Lebar Persegi Panjang
     */
    public double lebar;

    /**
     * Constructor Class Persegi Panjang
     * @param pj parameter pj adalah Panjang
     * @param lb parameter lb adalah lebar
     */
    public PersegiPanjang(double pj, double lb) {
        panjang = pj;
        lebar = lb;

    }

    /**
     * Method untuk menghitung Luas Persegi panjang
     * @return return value nya adalah double
     */
    public double hitung_luas() {
        return panjang * lebar;
    }

    /**
     * method untuk menghitung keliling persegi panjang
     * @return return value nya adalah double
     */
    public double hitung_keliling() {
        return (2 * (panjang + lebar));
    }
}
