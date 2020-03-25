package id.Kel7.rumusbangundatar.BangunDatar;

/**
 * Class Persegi, berisi method untuk menghitung Persegi
 */
public class Persegi {
    /**
     * Variabel Sisi Persegi
     */
    double sisi;

    /**
     * Constructor Class Persegi
     * @param s parameter s adalah sisi
     */
    public Persegi(double s) {
        sisi = s;
    }

    /**
     * method untuk megnhitung luas persegi
     * @return return valuenya adalah double
     */
    public double hitung_luas() {
        return (Math.pow(sisi, 2));
    }

    /**
     * method untuk menghitung keliling persegi
     * @return return valuenya adalah double
     */
    public double hitung_keliling() {
        return (4 * sisi);
    }
}
