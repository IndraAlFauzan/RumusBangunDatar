package id.Kel7.rumusbangundatar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import id.Kel7.rumusbangundatar.BangunDatar.Segitiga.KelilingSegitiga;
import id.Kel7.rumusbangundatar.BangunDatar.Segitiga.LuasSegitiga;

/**
 * Activity Class dari Hitung Segitiga
 */
public class HitungSegitigaActivity extends AppCompatActivity {

    /**
     * Variabel EditText yang terhubung ke layoutnya
     */
    EditText edtText1, edtText2, edtText3;

    /**
     * Variabel TextView yang terhubung ke layoutnya
     */
    TextView txtHasil, txtView1, txtView2, txtView3;
    /**
     * Variabel Button yang terhubung ke layoutnya
     */
    Button btnHitung;

    /**
     * Variabel alas, tinggi, sisi a, sisi b dan sisi c segitiga
     */
    Double alas, tinggi, sisiA, sisiB, sisiC;

    /**
     * Method oncreate akan jalan pertama kali ketika activity class ini dipanggir
     * @param savedInstanceState digunakan untuk menyimpan state dari activity class ini
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hitung_segitiga);

        initial();
    }

    /**
     * inisialisasi activity class ini
     */
    private void initial() {
        edtText1 = (EditText) findViewById(R.id.edt_text_view_1);
        edtText2 = (EditText) findViewById(R.id.edt_text_view_2);
        edtText3 = (EditText) findViewById(R.id.edt_text_view_3);
        txtView1 = (TextView) findViewById(R.id.text_view_1);
        txtView2 = (TextView) findViewById(R.id.text_view_2);
        txtView3 = (TextView) findViewById(R.id.text_view_3);
        txtHasil = (TextView) findViewById(R.id.txt_hasil);
        btnHitung = (Button) findViewById(R.id.btn_hitung);


        edtText1.setVisibility(View.INVISIBLE);
        edtText2.setVisibility(View.INVISIBLE);
        edtText3.setVisibility(View.INVISIBLE);

        btnHitung.setVisibility(View.INVISIBLE);
        txtHasil.setVisibility(View.INVISIBLE);

        getSupportActionBar().setTitle("Segitiga");
    }

    /**
     * Method yang terpanggil ketika sebuah radio button diklik
     * @param view view dari layout persegi Panjang
     */
    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.radio_hitung_luas:
                if (checked) {
                    txtView1.setText(getString(R.string.alas));
                    txtView2.setText(getString(R.string.tinggi));
                    edtText1.setText("");
                    edtText2.setText("");
                    btnHitung.setText(getString(R.string.hitung_luas));

                    edtText1.setVisibility(View.VISIBLE);
                    edtText2.setVisibility(View.VISIBLE);
                    edtText3.setVisibility(View.INVISIBLE);

                    txtView1.setVisibility(View.VISIBLE);
                    txtView2.setVisibility(View.VISIBLE);
                    txtView3.setVisibility(View.INVISIBLE);

                    btnHitung.setVisibility(View.VISIBLE);
                    txtHasil.setVisibility(View.VISIBLE);
                    txtHasil.setText(getString(R.string.hasil));
                    break;
                }
            case R.id.radio_hitung_keliling:
                if (checked) {
                    txtView1.setText(getString(R.string.sisiA));
                    txtView2.setText(getString(R.string.sisiB));
                    txtView3.setText(getString(R.string.sisiC));
                    edtText1.setText("");
                    edtText2.setText("");
                    edtText3.setText("");
                    btnHitung.setText(getString(R.string.hitung_keliling));

                    edtText1.setVisibility(View.VISIBLE);
                    edtText2.setVisibility(View.VISIBLE);
                    edtText3.setVisibility(View.VISIBLE);

                    txtView1.setVisibility(View.VISIBLE);
                    txtView2.setVisibility(View.VISIBLE);
                    txtView3.setVisibility(View.VISIBLE);

                    btnHitung.setVisibility(View.VISIBLE);
                    txtHasil.setVisibility(View.VISIBLE);
                    txtHasil.setText(getString(R.string.hasil));
                    break;
                }
        }
    }


    /**
     * Menghitung luas Segitiga
     * @param view view dari layout persegi Panjang
     */
    public void hitung(View view) {

        String buttonText = btnHitung.getText().toString();
        if (buttonText == getString(R.string.hitung_luas)) {
            try {
                alas = Double.parseDouble(edtText1.getText().toString());
                tinggi = Double.parseDouble(edtText2.getText().toString());
                LuasSegitiga luasSegitiga = new LuasSegitiga(alas, tinggi);
                txtHasil.setText(String.valueOf("Hasil :\nLuas = " + luasSegitiga.hitung_luas()));
            } catch (Exception e) {
                Toast toast = Toast.makeText(this, "Masukan Semua Nomor Yang Akan Dihitung", Toast.LENGTH_SHORT);
                TextView t = (TextView) toast.getView().findViewById(android.R.id.message);
                if (t != null) t.setGravity(Gravity.CENTER);
                toast.show();
            }
        } else {
            try {
                sisiA = Double.parseDouble(edtText1.getText().toString());
                sisiB = Double.parseDouble(edtText2.getText().toString());
                sisiC = Double.parseDouble(edtText3.getText().toString());
                KelilingSegitiga kelilingSegitiga = new KelilingSegitiga(sisiA,sisiB,sisiC);
                txtHasil.setText(String.valueOf("Hasil :\nKeliling = " + kelilingSegitiga.hitung_keliling()));
            } catch (Exception e) {
                Toast toast = Toast.makeText(this, "Masukan Semua Nomor Yang Akan Dihitung", Toast.LENGTH_SHORT);
                TextView t = (TextView) toast.getView().findViewById(android.R.id.message);
                if (t != null) t.setGravity(Gravity.CENTER);
                toast.show();
            }
        }
    }
}

