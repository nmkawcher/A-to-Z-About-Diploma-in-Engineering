package com.fci.user.allaboutdiplomainengineering;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class Introduction extends AppCompatActivity {
    private AdView mad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduction);

        mad = findViewById(R.id.adViewID);
        AdRequest adRequest =new AdRequest.Builder().build();
        mad.loadAd(adRequest);
    }
}
