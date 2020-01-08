package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class menu extends AppCompatActivity {
    CardView cardView1,cardView2,cardView3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        cardView1 = (CardView)findViewById(R.id.cardview1);
        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(menu.this, MainActivity.class);
                startActivity(intent);
            }
        });
        cardView2 = (CardView)findViewById(R.id.cardview2);
        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(menu.this, info.class);
                startActivity(intent);
            }
        });
        cardView3 = (CardView)findViewById(R.id.cardview3);
        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://wa.me/6285710844084?text=Saya%20ingin%20bertanya"));
                startActivity(intent);
            }
        });
    }
}
