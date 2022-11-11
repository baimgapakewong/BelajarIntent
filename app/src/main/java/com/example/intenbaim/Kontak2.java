package com.example.intenbaim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.intenbaim.SecondActivity;
import com.google.android.material.color.HarmonizedColorAttributes;

class Kontak extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Widya(View view) {
        Intent page1 = new Intent(Kontak.this, SecondActivity.class);
        //page1.putExtra(PENERIMA,"Andi");
        startActivity(page1);
    }

    public void Ipul(View view) {
        Intent page1 = new Intent(Kontak.this, SecondActivity.class);
        //page1.putExtra(PENERIMA,"Ridho");
        startActivity(page1);
    }

    public void Aulia(View view) {
            Intent page1 = new Intent(Kontak.this, SecondActivity.class);
        //page1.putExtra(PENERIMA,"Iwan");
        startActivity(page1);
    }

    public void Rakka(View view) {
        Intent page1 = new Intent(Kontak.this, SecondActivity.class);
        //page1.putExtra(PENERIMA,"Alya");
        startActivity(page1);
    }

}