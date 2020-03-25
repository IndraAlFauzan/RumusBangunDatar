package id.Kel7.rumusbangundatar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import id.Kel7.rumusbangundatar.BangunDatar.PersegiPanjang;

/**
 * Activity Class dari Hitung Persegi Panjang
 */
public class HitungPersegiPanjangActivity extends AppCompatActivity {

    /**
     * Variabel EditText yang terhubung ke layoutnya
     */
    EditText edtPanjang, edtLebar;

    /**
     * Variabel TextView yang terhubung ke layoutnya
     */
    TextView txtLuas;

    /**
     * Variabel Panjang dan lebar Persegi Panjang
     */
    Double panjang, lebar;

    /**
     * Method oncreate akan jalan pertama kali ketika activity class ini dipanggir
     * @param savedInstanceState digunakan untuk menyimpan state dari activity class ini
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hitung_persegi_panjang);

        initial();

    }

    /**
     * inisialisasi activity class ini
     */
    private void initial() {
        edtPanjang = (EditText) findViewById(R.id.edt_panjang);
        edtLebar = (EditText) findViewById(R.id.edt_lebar);
        txtLuas = (TextView) findViewById(R.id.txt_luas);

        getSupportActionBar().setTitle("Persegi Panjang");
    }

    /**
     * Menghitung luas persegi Panjang
     * @param view view dari layout persegi Panjang
     */
    public void hitung_luas(View view) {
        try {
            panjang = Double.parseDouble(edtPanjang.getText().toString());
            lebar = Double.parseDouble(edtLebar.getText().toString());
            PersegiPanjang persegiPanjang = new PersegiPanjang(panjang, lebar);
            txtLuas.setText(String.valueOf("Hasil :\nLuas = " + persegiPanjang.hitung_luas()));
        } catch (Exception e) {
            Toast toast = Toast.makeText(this, "Masukan Semua Nomor Yang Akan Dihitung", Toast.LENGTH_SHORT);
            TextView t = (TextView) toast.getView().findViewById(android.R.id.message);
            if (t != null) t.setGravity(Gravity.CENTER);
            toast.show();
        }
    }

    /**
     * Menghitung keliling persegi Panjang
     * @param view view dari layout persegi Panjang
     */
    public void hitung_keliling(View view) {
        try {
            panjang = Double.parseDouble(edtPanjang.getText().toString());
            lebar = Double.parseDouble(edtLebar.getText().toString());
            PersegiPanjang persegiPanjang = new PersegiPanjang(panjang, lebar);
            txtLuas.setText(String.valueOf("Hasil :\nKeliling = " + persegiPanjang.hitung_keliling()));
        } catch (Exception e) {
            Toast toast = Toast.makeText(this, "Masukan Semua Nomor Yang Akan Dihitung", Toast.LENGTH_SHORT);
            TextView t = (TextView) toast.getView().findViewById(android.R.id.message);
            if (t != null) t.setGravity(Gravity.CENTER);
            toast.show();
        }
    }
}