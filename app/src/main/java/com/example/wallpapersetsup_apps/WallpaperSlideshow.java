package com.example.wallpapersetsup_apps;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;

public class WallpaperSlideshow extends AppCompatActivity {
    private Button prev;
    private Button prev2;
    private Button prev3;
    private Button mSetBtn;
    private Button mUnSetBtn;
    private Button mSetBtn2;
    private Button mUnSetBtn2;
    private Button mSetBtn3;
    private Button mUnSetBtn3;
    private RadioButton mMenitRadio;
    private RadioGroup mTimeRadioGroup;
    private RadioButton mMenitRadio2;
    private RadioGroup mTimeRadioGroup2;
    private RadioButton mMenitRadio3;
    private RadioGroup mTimeRadioGroup3;
    public int mChargeTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wallpaper_slideshow);

        prev = findViewById(R.id.Preview1);
        prev2 = findViewById(R.id.Preview2);
        prev3 = findViewById(R.id.Preview3);

        mSetBtn = (Button) findViewById(R.id.Set1);
        mUnSetBtn = (Button) findViewById(R.id.Unset1);
        mMenitRadio = (RadioButton) findViewById(R.id.coloursplash);
        mTimeRadioGroup = (RadioGroup) findViewById(R.id.radioGroup);

        mSetBtn2 = (Button) findViewById(R.id.Set2);
        mUnSetBtn2 = (Button) findViewById(R.id.Unset2);
        mMenitRadio2 = (RadioButton) findViewById(R.id.spaceadventurer);
        mTimeRadioGroup2 = (RadioGroup) findViewById(R.id.radioGroup2);

        mSetBtn3 = (Button) findViewById(R.id.Set3);
        mUnSetBtn3 = (Button) findViewById(R.id.Unset3);
        mMenitRadio3 = (RadioButton) findViewById(R.id.textureable);
        mTimeRadioGroup3 = (RadioGroup) findViewById(R.id.radioGroup3);

        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (WallpaperSlideshow.this, PreviewSlide.class);
                startActivity(intent);
            }
        });

        prev2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (WallpaperSlideshow.this, PreviewSlide2.class);
                startActivity(intent);
            }
        });

        prev3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (WallpaperSlideshow.this, PreviewSlide3.class);
                startActivity(intent);
            }
        });

        mUnSetBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                    Intent intent = new Intent(WallpaperSlideshow.this, ServiceTime.class);
                    stopService(intent);
                    System.out.println("Something went wrong.");
            }
        });

        mUnSetBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {

                Intent intent = new Intent(WallpaperSlideshow.this, ServiceTime2.class);
                stopService(intent);
            }
        });

        mUnSetBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {

                Intent intent = new Intent(WallpaperSlideshow.this, ServiceTime3.class);
                stopService(intent);
            }
        });

        mSetBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                int mRadioID = mTimeRadioGroup.getCheckedRadioButtonId();
                if(mMenitRadio.getId()==mRadioID) {mChargeTime=1;}

                Intent mService = new Intent(WallpaperSlideshow.this,ServiceTime.class);
                Bundle mBundleTime = new Bundle();
                mBundleTime.putInt("durasi", mChargeTime);
                mService.putExtras(mBundleTime);
                startService(mService);
                finish();
            }
        });

        mSetBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                int mRadioID = mTimeRadioGroup2.getCheckedRadioButtonId();
                if(mMenitRadio2.getId()==mRadioID) {mChargeTime=1;}

                Intent mService = new Intent(WallpaperSlideshow.this,ServiceTime2.class);
                Bundle mBundleTime = new Bundle();
                mBundleTime.putInt("durasi", mChargeTime);
                mService.putExtras(mBundleTime);
                startService(mService);
                finish();
            }
        });

        mSetBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                int mRadioID = mTimeRadioGroup3.getCheckedRadioButtonId();
                if(mMenitRadio3.getId()==mRadioID) {mChargeTime=1;}

                Intent mService = new Intent(WallpaperSlideshow.this,ServiceTime3.class);
                Bundle mBundleTime = new Bundle();
                mBundleTime.putInt("durasi", mChargeTime);
                mService.putExtras(mBundleTime);
                startService(mService);
                finish();
            }
        });
    }

}