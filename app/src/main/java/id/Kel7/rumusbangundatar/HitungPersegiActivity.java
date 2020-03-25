package id.Kel7.rumusbangundatar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import id.Kel7.rumusbangundatar.BangunDatar.Persegi;

/**
 * Activity Class dari HitungPersegi
 */
public class HitungPersegiActivity extends AppCompatActivity {

    /**
     * Variabel EditText yang terhubung ke layoutnya
     */
    EditText edtSisi;

    /**
     * Variabel TextView yang terhubung ke layoutnya
     */
    TextView txtHasil;

    /**
     * Variabel sisi Persegi
     */
    Double sisi;

    /**
     * Method oncreate akan jalan pertama kali ketika activity class ini dipanggir
     * @param savedInstanceState digunakan untuk menyimpan state dari activity class ini
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hitung_persegi);

        initial();

    }

    /**
     * inisialisasi activity class ini
     */
    private void initial() {
        edtSisi = (EditText) findViewById(R.id.edt_sisi_persegi);
        txtHasil = (TextView) findViewById(R.id.txt_hasil_persegi);

        getSupportActionBar().setTitle("Persegi");
    }

    /**
     * Menghitung luas persegi
     * @param view view dari layout persegi
     */
    public void hitung_luas(View view) {
        try {
            sisi = Double.parseDouble(edtSisi.getText().toString());
            Persegi persegi = new Persegi(sisi);
            txtHasil.setText(String.valueOf("Hasil :\nLuas = " + persegi.hitung_luas()));
        } catch (Exception e) {
            Toast toast = Toast.makeText(this, "Masukan Semua Nomor Yang Akan Dihitung", Toast.LENGTH_SHORT);
            TextView t = (TextView) toast.getView().findViewById(android.R.id.message);
            if (t != null) t.setGravity(Gravity.CENTER);
            toast.show();
        }
    }

    /**
     * Menghitung keliling persegi
     * @param view view dari layout persegi
     */
    public void hitung_keliling(View view) {
        try {
            sisi = Double.parseDouble(edtSisi.getText().toString());
            Persegi persegi = new Persegi(sisi);
            txtHasil.setText(String.valueOf("Hasil :\nKeliling = " + persegi.hitung_keliling()));
        } catch (Exception e) {
            Toast toast = Toast.makeText(this, "Masukan Semua Nomor Yang Akan Dihitung", Toast.LENGTH_SHORT);
            TextView t = (TextView) toast.getView().findViewById(android.R.id.message);
            if (t != null) t.setGravity(Gravity.CENTER);
            toast.show();
        }
    }
}
