package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class Main8Activity extends AppCompatActivity implements View.OnClickListener {
Button button;
    CheckBox pil1, pil2, pil3, pil4, pil10, pil11, pil12;
    public int jumlah=0, total;
    TextView harga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);


        pil1 = (CheckBox) findViewById(R.id.pil1);
        pil1.setOnClickListener(this);
        pil2 = (CheckBox) findViewById(R.id.pil2);
        pil2.setOnClickListener(this);
        pil3 = (CheckBox) findViewById(R.id.pil3);
        pil3.setOnClickListener(this);
        pil4 = (CheckBox) findViewById(R.id.pil4);
        pil4.setOnClickListener(this);
        pil10 = (CheckBox) findViewById(R.id.pil10);
        pil10.setOnClickListener(this);
        pil11 = (CheckBox) findViewById(R.id.pil11);
        pil11.setOnClickListener(this);
        pil12 = (CheckBox) findViewById(R.id.pil12);
        pil12.setOnClickListener(this);
        harga = (TextView) findViewById(R.id.harga);

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.pil1:
                if (pil1.isChecked()){
                    jumlah = jumlah + 120000;
                    harga.setText(String.valueOf(jumlah));}
                else{
                    jumlah = jumlah - 120000;
                    harga.setText(String.valueOf(jumlah));
                }
                break;

            case R.id.pil2:
                if (pil2.isChecked()){
                    jumlah = jumlah + 130000;
                    harga.setText(String.valueOf(jumlah));}
                else{
                    jumlah = jumlah - 130000;
                    harga.setText(String.valueOf(jumlah));
                }
                break;
            case R.id.pil3:
                if (pil3.isChecked()){
                    jumlah = jumlah + 140000;
                    harga.setText(String.valueOf(jumlah));}
                else{
                    jumlah = jumlah - 140000;
                    harga.setText(String.valueOf(jumlah));
                }
                break;
            case R.id.pil4:
                if (pil4.isChecked()){
                    jumlah = jumlah + 120000;
                    harga.setText(String.valueOf(jumlah));}
                else{
                    jumlah = jumlah - 120000;
                    harga.setText(String.valueOf(jumlah));
                }

                break;
            case R.id.pil10:
                if (pil10.isChecked()){
                    total = jumlah * 3;
                    harga.setText(String.valueOf(total));}
                else{
                    jumlah = jumlah / 1;
                    harga.setText(String.valueOf(jumlah));
                }

                break;
            case R.id.pil11:
                if (pil11.isChecked()){
                    total = jumlah * 7;
                    harga.setText(String.valueOf(total));}
                else{
                    jumlah = jumlah * 1;
                    harga.setText(String.valueOf(jumlah));
                }

                break;
            case R.id.pil12:
                if (pil12.isChecked()){
                    total = jumlah * 9;
                    harga.setText(String.valueOf(total));}
                else{
                    jumlah = jumlah * 1;
                    harga.setText(String.valueOf(jumlah));
                }

                break;
        }
        button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://wa.me/6285710844084?text=Saya%20ingin%20pesan%20ke%20lombok"));
                startActivity(intent);
            }
        });


    }
}
