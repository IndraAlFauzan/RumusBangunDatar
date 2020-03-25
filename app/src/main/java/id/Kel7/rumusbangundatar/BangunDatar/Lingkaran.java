package id.Kel7.rumusbangundatar.BangunDatar;

/**
 * Class Lingkaran, berisi method untuk menghitung Lingkaran
 */
public class Lingkaran {
    /**
     * Variabel Jari jari lingkaran
     */
    public double jari_jari;

    /**
     * COnstructor Lingkarang
     * @param r parameter r adalah jari-jari
     */
    public Lingkaran(double r) {
        jari_jari = r;
    }

    /**
     * Method untuk menghitung Luas Lingkaran
     * @return return valuenya adalah double
     */
    public double hitung_luas() {
        return Math.PI * Math.pow(jari_jari, 2);
    }

    /**
     * method untuk menghitung keliling
     * @return return valuenya adalah double
     */
    public double hitung_keliling() {
        return (Math.PI * (2 * jari_jari));
    }
}
