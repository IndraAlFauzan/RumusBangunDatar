package id.Kel7.rumusbangundatar.BangunDatar.Segitiga;

/**
 * Class Keliling Segitiga, berisi method untuk menghitung keliling segitiga
 */
public class KelilingSegitiga {

    /**
     * Variabel sisi A
     */
    double sisiA;

    /**
     * Variabel sisi B
     */
    double sisiB;

    /**
     * Variabel sisi C
     */
    double sisiC;

    /**
     * Constructor Kelas Kelling Segitiga
     * @param sA Adalah Sisi A
     * @param sB Adalah Sisi B
     * @param sC Adalah Sisi C
     */
    public KelilingSegitiga(double sA, double sB, double sC) {
        sisiA = sA;
        sisiB = sB;
        sisiC = sC;
    }

    /**
     * Method yang digunakan untuk menghitung Kelilin Segitiga
     * @return return valuenya adalah Double
     */
    public double hitung_keliling() {
        return sisiA + sisiB + sisiC;
    }
}
