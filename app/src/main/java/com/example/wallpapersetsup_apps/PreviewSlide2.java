package com.example.wallpapersetsup_apps;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;

public class PreviewSlide2 extends Activity {

    private Button check2;
    ViewFlipper viewFlipper;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preview_slide2);

        viewFlipper = (ViewFlipper) this.findViewById(R.id.viewFlipper);
        check2 = findViewById(R.id.prevChecked2);

        //sets auto flipping
        viewFlipper.setAutoStart(true);
        viewFlipper.setFlipInterval(3000);
        viewFlipper.startFlipping();

        check2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }
}