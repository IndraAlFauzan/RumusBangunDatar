package id.Kel7.rumusbangundatar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import id.Kel7.rumusbangundatar.BangunDatar.Lingkaran;

/**
 * Activity Class dari HitungLingkaran
 */
public class HitungLingkaranActivity extends AppCompatActivity {
    /**
     * Variabel EditText yang terhubung ke layoutnya
     */
    EditText edtJariJari;
    /**
     * Variabel TextView yang terhubung ke layoutnya
     */
    TextView txtHasil;
    /**
     * Variabel jari jari lingkaran
     */
    Double jari;


    /**
     * Method oncreate akan jalan pertama kali ketika activity class ini dipanggir
     * @param savedInstanceState digunakan untuk menyimpan state dari activity class ini
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hitung_lingkaran);

        initial();

    }

    /**
     * inisialisasi activity class ini
     */
    private void initial() {
        edtJariJari = (EditText) findViewById(R.id.edt_jari_lingkaran);
        txtHasil = (TextView) findViewById(R.id.txt_hasil_lingkaran);

        getSupportActionBar().setTitle("Lingkaran");
    }

    /**
     * Menghitung luas lingkaran
     * @param view view dari layout Lingkaran
     */
    public void hitung_luas(View view) {
        try {
            jari = Double.parseDouble(edtJariJari.getText().toString());
            Lingkaran lingkaran = new Lingkaran(jari);
            txtHasil.setText(String.valueOf("Hasil :\nLuas = " + lingkaran.hitung_luas()));
        } catch (Exception e) {
            Toast toast = Toast.makeText(this, "Masukan Semua Nomor Yang Akan Dihitung", Toast.LENGTH_SHORT);
            TextView t = (TextView) toast.getView().findViewById(android.R.id.message);
            if (t != null) t.setGravity(Gravity.CENTER);
            toast.show();

        }
    }

    /**
     * Menghitung keliling lingkaran
     * @param view view dari layout Lingkaran
     */
    public void hitung_keliling(View view) {
        try {
            jari = Double.parseDouble(edtJariJari.getText().toString());
            Lingkaran lingkaran = new Lingkaran(jari);
            txtHasil.setText(String.valueOf("Hasil :\nKeliling = " + lingkaran.hitung_keliling()));

        } catch (Exception e) {
            Toast toast = Toast.makeText(this, "Masukan Semua Nomor Yang Akan Dihitung", Toast.LENGTH_SHORT);
            TextView t = (TextView) toast.getView().findViewById(android.R.id.message);
            if (t != null) t.setGravity(Gravity.CENTER);
            toast.show();

        }
    }
}
