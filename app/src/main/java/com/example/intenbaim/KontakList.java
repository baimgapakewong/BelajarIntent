package com.example.intenbaim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class KontakList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kontak_list);
    }


    public void Widya(View view) {
        Intent page1 = new Intent(KontakList.this, SecondActivity.class);
        //page1.putExtra(PENERIMA,"Andi");
        startActivity(page1);
    }

    public void Ipul(View view) {
        Intent page1 = new Intent(KontakList.this, SecondActivity.class);
        //page1.putExtra(PENERIMA,"Ridho");
        startActivity(page1);
    }

    public void Aulia(View view) {
        Intent page1 = new Intent(KontakList.this, SecondActivity.class);
        //page1.putExtra(PENERIMA,"Iwan");
        startActivity(page1);
    }

    public void Rakka(View view) {
        Intent page1 = new Intent(KontakList.this, SecondActivity.class);
        //page1.putExtra(PENERIMA,"Alya");
        startActivity(page1);
    }

}