package id.Kel7.rumusbangundatar;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


/**
 * Activity Class dari Main Activity
 */
public class MainActivity extends AppCompatActivity {

    /**
     * Method oncreate akan jalan pertama kali ketika activity class ini dipanggir
     * @param savedInstanceState digunakan untuk menyimpan state dari activity class ini
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void pilihBangunDatar(View view) {
        Intent intent = new Intent(MainActivity.this, PilihBangunDatarActivity.class);
        startActivity(intent);
    }

}