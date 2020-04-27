package com.example.laundrykuy;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageButton;
public class cek_berat extends AppCompatActivity {
    Button tombol;
    Intent pindah;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cek_berat);

        tombol = (Button) findViewById(R.id.btn_back);

        tombol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //kode untuk pindah ke actifity lain
                pindah = new Intent(cek_berat.this, MainActivity.class);
                startActivity(pindah);
                //saat pindah, activity yg sekarang langsung ditutup
                //agar saat menekan tombol kembali tidak bolak-balik
                finish();
            }
        });

    }
}
