package com.example.wallpapersetsup_apps;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.floatingactionbutton.FloatingActionButton;


public class MainActivity extends AppCompatActivity {

    Button wal1, wal2, wal3, wal4, wal5, wal6;
    Button spacea, spaceb, spacec, spaced, spacee, spacef;
    Button text1, text2, text3, text4, text5, text6;
    Button color1, color2, color3, color4, color5, color6;
    private FloatingActionButton livepict;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wal1 = (Button) findViewById(R.id.wal1id);
        wal2 = (Button) findViewById(R.id.wal2id);
        wal3 = (Button) findViewById(R.id.wal3id);
        wal4 = (Button) findViewById(R.id.wal4id);
        wal5 = (Button) findViewById(R.id.wal5id);
        wal6 = (Button) findViewById(R.id.wal6id);

        spacea = (Button) findViewById(R.id.spaceaid);
        spaceb = (Button) findViewById(R.id.spacebid);
        spacec = (Button) findViewById(R.id.spacecid);
        spaced = (Button) findViewById(R.id.spacedid);
        spacee = (Button) findViewById(R.id.spaceeid);
        spacef = (Button) findViewById(R.id.spacefid);

        text1 = (Button) findViewById(R.id.text1id);
        text2 = (Button) findViewById(R.id.text2bid);
        text3 = (Button) findViewById(R.id.text3id);
        text4 = (Button) findViewById(R.id.text4id);
        text5 = (Button) findViewById(R.id.text5id);
        text6 = (Button) findViewById(R.id.text6id);

        color1 = (Button) findViewById(R.id.color1id);
        color2 = (Button) findViewById(R.id.color2id);
        color3 = (Button) findViewById(R.id.color3id);
        color4 = (Button) findViewById(R.id.color4id);
        color5 = (Button) findViewById(R.id.color5id);
        color6 = (Button) findViewById(R.id.color6id);

        livepict = (FloatingActionButton) findViewById(R.id.floatbutton);

        livepict.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(MainActivity.this,WallpaperSlideshow.class);
                startActivity(i);

            }
        });

        wal1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(MainActivity.this,TemaActivity.class);
                String pathpic="wal1";
                i.putExtra("PATH_PICTURE",pathpic);
                startActivity(i);

            }
        });

        wal2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(MainActivity.this,TemaActivity.class);
                String pathpic="wal2";
                i.putExtra("PATH_PICTURE",pathpic);
                startActivity(i);
            }
        });

        wal3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(MainActivity.this,TemaActivity.class);
                String pathpic="wal3";
                i.putExtra("PATH_PICTURE",pathpic);
                startActivity(i);

            }
        });

        wal4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(MainActivity.this,TemaActivity.class);
                String pathpic="wal4";
                i.putExtra("PATH_PICTURE",pathpic);
                startActivity(i);

            }
        });

        wal5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(MainActivity.this,TemaActivity.class);
                String pathpic="wal5";
                i.putExtra("PATH_PICTURE",pathpic);
                startActivity(i);

            }
        });

        wal6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(MainActivity.this,TemaActivity.class);
                String pathpic="wal6";
                i.putExtra("PATH_PICTURE",pathpic);
                startActivity(i);

            }
        });

        spacea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(MainActivity.this,TemaActivity.class);
                String pathpic="spacea";
                i.putExtra("PATH_PICTURE",pathpic);
                startActivity(i);

            }
        });

        spaceb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(MainActivity.this,TemaActivity.class);
                String pathpic="spaceb";
                i.putExtra("PATH_PICTURE",pathpic);
                startActivity(i);

            }
        });

        spacec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(MainActivity.this,TemaActivity.class);
                String pathpic="spacec";
                i.putExtra("PATH_PICTURE",pathpic);
                startActivity(i);

            }
        });

        spaced.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(MainActivity.this,TemaActivity.class);
                String pathpic="spaced";
                i.putExtra("PATH_PICTURE",pathpic);
                startActivity(i);

            }
        });

        spacee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(MainActivity.this,TemaActivity.class);
                String pathpic="spacee";
                i.putExtra("PATH_PICTURE",pathpic);
                startActivity(i);

            }
        });

        spacef.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(MainActivity.this,TemaActivity.class);
                String pathpic="spacef";
                i.putExtra("PATH_PICTURE",pathpic);
                startActivity(i);

            }
        });

        text1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(MainActivity.this,TemaActivity.class);
                String pathpic="text1";
                i.putExtra("PATH_PICTURE",pathpic);
                startActivity(i);

            }
        });

        text2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(MainActivity.this,TemaActivity.class);
                String pathpic="text2";
                i.putExtra("PATH_PICTURE",pathpic);
                startActivity(i);

            }
        });

        text3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(MainActivity.this,TemaActivity.class);
                String pathpic="text3";
                i.putExtra("PATH_PICTURE",pathpic);
                startActivity(i);

            }
        });

        text4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(MainActivity.this,TemaActivity.class);
                String pathpic="text4";
                i.putExtra("PATH_PICTURE",pathpic);
                startActivity(i);

            }
        });

        text5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(MainActivity.this,TemaActivity.class);
                String pathpic="text5";
                i.putExtra("PATH_PICTURE",pathpic);
                startActivity(i);

            }
        });

        text6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(MainActivity.this,TemaActivity.class);
                String pathpic="text6";
                i.putExtra("PATH_PICTURE",pathpic);
                startActivity(i);

            }
        });

        color1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(MainActivity.this,TemaActivity.class);
                String pathpic="color1";
                i.putExtra("PATH_PICTURE",pathpic);
                startActivity(i);

            }
        });

        color2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(MainActivity.this,TemaActivity.class);
                String pathpic="color2";
                i.putExtra("PATH_PICTURE",pathpic);
                startActivity(i);

            }
        });

        color3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(MainActivity.this,TemaActivity.class);
                String pathpic="color3";
                i.putExtra("PATH_PICTURE",pathpic);
                startActivity(i);

            }
        });

        color4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(MainActivity.this,TemaActivity.class);
                String pathpic="color4";
                i.putExtra("PATH_PICTURE",pathpic);
                startActivity(i);

            }
        });

        color5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(MainActivity.this,TemaActivity.class);
                String pathpic="color5";
                i.putExtra("PATH_PICTURE",pathpic);
                startActivity(i);

            }
        });

        color6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(MainActivity.this,TemaActivity.class);
                String pathpic="color6";
                i.putExtra("PATH_PICTURE",pathpic);
                startActivity(i);

            }
        });

    }
}