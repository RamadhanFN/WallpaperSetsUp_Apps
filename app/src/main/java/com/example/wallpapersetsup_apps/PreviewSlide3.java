package com.example.wallpapersetsup_apps;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;

public class PreviewSlide3 extends Activity {

    ViewFlipper viewFlipper;
    private Button check3;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preview_slide3);

        viewFlipper = (ViewFlipper) this.findViewById(R.id.viewFlipper);
        check3 = findViewById(R.id.prevChecked3);

        //sets auto flipping
        viewFlipper.setAutoStart(true);
        viewFlipper.setFlipInterval(3000);
        viewFlipper.startFlipping();

        check3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }
}