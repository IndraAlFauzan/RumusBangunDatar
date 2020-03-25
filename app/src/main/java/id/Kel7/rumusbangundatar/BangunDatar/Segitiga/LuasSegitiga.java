package id.Kel7.rumusbangundatar.BangunDatar.Segitiga;

/**
 * Class Luas Segitiga, berisi method untuk menghitung luas segitiga
 */
public class LuasSegitiga {
    /**
     * Variabel Alas Segitiga
     */
    public double alas;

    /**
     * Variabel Tinggi Segitiga
     */
    public double tinggi;

    /**
     * Constructor Kelas Luas Segitiga
     * @param a parameter A adalah Alas
     * @param t paramter B adalah Tinggi
     */
    public LuasSegitiga(double a,double t) {
        alas = a;
        tinggi = t;
    }

    /**
     * Method untuk menghitung Luas Segitiga
     * @return return valuenya adalah double
     */
    public double hitung_luas() {
        return (alas * tinggi) / 2;
    }
}
