package id.Kel7.rumusbangundatar;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


/**
 * Activity Class dari Pilih Bangun Datar
 */
public class PilihBangunDatarActivity extends AppCompatActivity {

    /**
     * Method oncreate akan jalan pertama kali ketika activity class ini dipanggir
     * @param savedInstanceState digunakan untuk menyimpan state dari activity class ini
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pilih_bangun_datar);
    }

    /**
     * Method yang mengarahkan ke layout persegi panjang
     * @param view view dari layout dimana method ini dipanggil
     */
    public void persegiPanjang(View view) {
        Intent intent = new Intent(PilihBangunDatarActivity.this, HitungPersegiPanjangActivity.class);
        startActivity(intent);
    }

    /**
     * Method yang mengarahkan ke layout lingkaran
     * @param view view dari layout dimana method ini dipanggil
     */
    public void lingkaran(View view) {
        Intent intent = new Intent(PilihBangunDatarActivity.this, HitungLingkaranActivity.class);
        startActivity(intent);
    }

    /**
     * Method yang mengarahkan ke layout persegi
     * @param view view dari layout dimana method ini dipanggil
     */
    public void persegi(View view) {
        Intent intent = new Intent(PilihBangunDatarActivity.this, HitungPersegiActivity.class);
        startActivity(intent);
    }

    /**
     * Method yang mengarahkan ke layout segitiga
     * @param view view dari layout dimana method ini dipanggil
     */
    public void segitiga(View view) {
        Intent intent = new Intent(PilihBangunDatarActivity.this, HitungSegitigaActivity.class);
        startActivity(intent);
    }
}
