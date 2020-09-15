package com.example.mystartapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.MyStartApp.startappinterstitialexample.R;
import com.startapp.android.publish.adsCommon.StartAppAd;
import com.startapp.android.publish.adsCommon.StartAppSDK;

public class MainActivity extends AppCompatActivity {
    private StartAppAd startAppAd = new StartAppAd(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        StartAppSDK.init(this, "202907397", true);
        StartAppAd.showSplash(this,savedInstanceState);
    }
    @Override
    public void onBackPressed() {
        StartAppAd.onBackPressed(this);
        super.onBackPressed();
    }
}
