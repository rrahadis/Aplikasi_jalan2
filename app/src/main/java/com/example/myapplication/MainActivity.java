package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    ListView listView;

    String mTitle[] = {"Bali", "Lombok", "Jogja", "Bandung", "Papua", "Malang"};
    String mDescription[] = {"lihat selengkapnya", "lihat selengkapnya", "lihat selengkapnya", "lihat selengkapnya", "lihat selengkapnya", "lihat selengkapnya"};
    int images[] = {R.drawable.logobali, R.drawable.logolombok, R.drawable.logojogja, R.drawable.logobandung, R.drawable.logopapua, R.drawable.logomalang,};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.ListView1);
        MyAdapter adapter = new MyAdapter(this, mTitle, mDescription, images);
        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position == 0){
                Intent intent = new Intent(MainActivity.this, Main4Activity.class);
                startActivity(intent);}
                if(position == 1){
                    Intent intent1 = new Intent(MainActivity.this, Main8Activity.class);
                    startActivity(intent1);}
                if(position == 2){
                    Intent intent2 = new Intent(MainActivity.this, Main5Activity.class);
                    startActivity(intent2);}
                if(position == 3){
                    Intent intent3 = new Intent(MainActivity.this, Main6Activity.class);
                    startActivity(intent3);}
                if(position == 4){
                    Intent intent4 = new Intent(MainActivity.this, Main7Activity.class);
                    startActivity(intent4);}
                if(position == 5){
                    Intent intent5 = new Intent(MainActivity.this, Main2Activity.class);
                    startActivity(intent5);}

            }
        });

    }

    class MyAdapter extends ArrayAdapter<String>{

        Context context;
        String rTitle[];
        String rDescription[];
        int rImgs[];

        MyAdapter(Context c, String title[], String description[], int imgs[]){
            super(c, R.layout.row, R.id.text1, title);
            this.context = c;
            this.rTitle = title;
            this.rDescription = description;
            this.rImgs = imgs;
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = layoutInflater.inflate(R.layout.row, parent, false);
            ImageView images = row.findViewById(R.id.image);
            TextView myTitle = row.findViewById(R.id.text1);
            TextView myDescription = row.findViewById(R.id.text2);

            images.setImageResource(rImgs[position]);
            myTitle.setText(rTitle[position]);
            myDescription.setText(rDescription[position]);


            return row;
        }
    }

//    public void openActivity2(){
  //      Intent intent = new Intent(this, Main2Activity.class);
    //    startActivity(intent);
    //}
}
