package com.example.wallpapersetsup_apps;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;

public class PreviewSlide extends Activity {

    private Button check1;
    ViewFlipper viewFlipper;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preview_slide);

        viewFlipper = (ViewFlipper) this.findViewById(R.id.viewFlipper);
        check1 = findViewById(R.id.prevChecked1);

        //sets auto flipping
        viewFlipper.setAutoStart(true);
        viewFlipper.setFlipInterval(3000);
        viewFlipper.startFlipping();

        check1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

    }

}