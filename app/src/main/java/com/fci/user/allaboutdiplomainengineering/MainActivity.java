package com.fci.user.allaboutdiplomainengineering;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class MainActivity extends AppCompatActivity {
    private AdView Kad;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Kad = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        Kad.loadAd(adRequest);



    }

    public void introbtn(View view) {
        Intent i=new Intent(MainActivity.this,Introduction.class);
        startActivity(i);

    }

    public void whatisdip(View view) {
        Intent w=new Intent(MainActivity.this,whatIsdiploma.class);
        startActivity(w);
    }

    public void whydiploma(View view) {
        Intent wh=new Intent(MainActivity.this,whydiploma.class);
        startActivity(wh);
    }

    public void whichinstitute(View view) {
        Intent which=new Intent(MainActivity.this,whichInstitute.class);
        startActivity(which);
    }

    public void subjectonc(View view) {
        Intent dep=new Intent(MainActivity.this,sub.class);
        startActivity(dep);
    }

    public void admisoninforonclk(View view) {
        Intent inf=new Intent(MainActivity.this,admissoninformation.class);
        startActivity(inf);
    }

    public void costonclk(View view) {
        Intent cos=new Intent(MainActivity.this,cost.class);
        startActivity(cos);
    }

    public void higherstudyonclk(View view) {
        Intent hs=new Intent(MainActivity.this,higerstudy.class);
        startActivity(hs);
    }

    public void aboutonclk(View view) {
        Intent ab=new Intent(MainActivity.this,about.class);
        startActivity(ab);
    }
}
