package com.example.wallpapersetsup_apps;

import android.app.WallpaperManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.io.IOException;

public class TemaActivity extends AppCompatActivity {

    LinearLayout theme_preview;
    Button btn_back, btn_save;
    String newString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tema);

        btn_back=(Button)findViewById(R.id.btn_back);
        btn_save=(Button)findViewById(R.id.btn_save);
        theme_preview=(LinearLayout)findViewById(R.id.theme_preview);


        if(savedInstanceState==null){
            Bundle extras=getIntent().getExtras();
            if(extras==null){
                newString=null;
            }else {
                newString=extras.getString("PATH_PICTURE");
                if(newString.equals("wal1")){
                    theme_preview.setBackgroundResource(R.drawable.wal1);

                    btn_save.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            WallpaperManager wlp=WallpaperManager.getInstance(getApplicationContext());
                            Toast.makeText(getApplicationContext(),"Berhasil dipasang",Toast.LENGTH_SHORT).show();
                            try{
                                wlp.setResource(+ R.drawable.wal1);
                            }catch (IOException e){
                                e.printStackTrace();
                            }
                        }
                    });
                }else if (newString.equals("wal2")) {
                    theme_preview.setBackgroundResource(R.drawable.wal2);
                    btn_save.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            WallpaperManager wlp=WallpaperManager.getInstance(getApplicationContext());
                            Toast.makeText(getApplicationContext(),"Berhasil dipasang",Toast.LENGTH_SHORT).show();
                            try{
                                wlp.setResource(+ R.drawable.wal2);
                            }catch (IOException e){
                                e.printStackTrace();
                            }
                        }
                    });

                }else if (newString.equals("wal3")) {
                    theme_preview.setBackgroundResource(R.drawable.wal3);
                    btn_save.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            WallpaperManager wlp=WallpaperManager.getInstance(getApplicationContext());
                            Toast.makeText(getApplicationContext(),"Berhasil dipasang",Toast.LENGTH_SHORT).show();
                            try{
                                wlp.setResource(+ R.drawable.wal3);
                            }catch (IOException e){
                                e.printStackTrace();
                            }
                        }
                    });

                }else if (newString.equals("wal4")) {
                    theme_preview.setBackgroundResource(R.drawable.wal4);
                    btn_save.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            WallpaperManager wlp=WallpaperManager.getInstance(getApplicationContext());
                            Toast.makeText(getApplicationContext(),"Berhasil dipasang",Toast.LENGTH_SHORT).show();
                            try{
                                wlp.setResource(+ R.drawable.wal4);
                            }catch (IOException e){
                                e.printStackTrace();
                            }
                        }
                    });

                }else if (newString.equals("wal5")) {
                    theme_preview.setBackgroundResource(R.drawable.wal5);
                    btn_save.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            WallpaperManager wlp=WallpaperManager.getInstance(getApplicationContext());
                            Toast.makeText(getApplicationContext(),"Berhasil dipasang",Toast.LENGTH_SHORT).show();
                            try{
                                wlp.setResource(+ R.drawable.wal5);
                            }catch (IOException e){
                                e.printStackTrace();
                            }
                        }
                    });

                }else if (newString.equals("wal6")) {
                    theme_preview.setBackgroundResource(R.drawable.wal6);
                    btn_save.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            WallpaperManager wlp=WallpaperManager.getInstance(getApplicationContext());
                            Toast.makeText(getApplicationContext(),"Berhasil dipasang",Toast.LENGTH_SHORT).show();
                            try{
                                wlp.setResource(+ R.drawable.wal6);
                            }catch (IOException e){
                                e.printStackTrace();
                            }
                        }
                    });

                }else if (newString.equals("spacea")) {
                    theme_preview.setBackgroundResource(R.drawable.spacea);
                    btn_save.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            WallpaperManager wlp=WallpaperManager.getInstance(getApplicationContext());
                            Toast.makeText(getApplicationContext(),"Berhasil dipasang",Toast.LENGTH_SHORT).show();
                            try{
                                wlp.setResource(+ R.drawable.spacea);
                            }catch (IOException e){
                                e.printStackTrace();
                            }
                        }
                    });

                }else if (newString.equals("spaceb")) {
                    theme_preview.setBackgroundResource(R.drawable.spaceb);
                    btn_save.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            WallpaperManager wlp=WallpaperManager.getInstance(getApplicationContext());
                            Toast.makeText(getApplicationContext(),"Berhasil dipasang",Toast.LENGTH_SHORT).show();
                            try{
                                wlp.setResource(+ R.drawable.spaceb);
                            }catch (IOException e){
                                e.printStackTrace();
                            }
                        }
                    });

                }else if (newString.equals("spacec")) {
                    theme_preview.setBackgroundResource(R.drawable.spacec);
                    btn_save.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            WallpaperManager wlp=WallpaperManager.getInstance(getApplicationContext());
                            Toast.makeText(getApplicationContext(),"Berhasil dipasang",Toast.LENGTH_SHORT).show();
                            try{
                                wlp.setResource(+ R.drawable.spacec);
                            }catch (IOException e){
                                e.printStackTrace();
                            }
                        }
                    });

                }else if (newString.equals("spaced")) {
                    theme_preview.setBackgroundResource(R.drawable.spaced);
                    btn_save.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            WallpaperManager wlp=WallpaperManager.getInstance(getApplicationContext());
                            Toast.makeText(getApplicationContext(),"Berhasil dipasang",Toast.LENGTH_SHORT).show();
                            try{
                                wlp.setResource(+ R.drawable.spaced);
                            }catch (IOException e){
                                e.printStackTrace();
                            }
                        }
                    });

                }else if (newString.equals("spacee")) {
                    theme_preview.setBackgroundResource(R.drawable.spacee);
                    btn_save.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            WallpaperManager wlp=WallpaperManager.getInstance(getApplicationContext());
                            Toast.makeText(getApplicationContext(),"Berhasil dipasang",Toast.LENGTH_SHORT).show();
                            try{
                                wlp.setResource(+ R.drawable.spacee);
                            }catch (IOException e){
                                e.printStackTrace();
                            }
                        }
                    });

                }else if (newString.equals("spacef")) {
                    theme_preview.setBackgroundResource(R.drawable.spacef);
                    btn_save.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            WallpaperManager wlp=WallpaperManager.getInstance(getApplicationContext());
                            Toast.makeText(getApplicationContext(),"Berhasil dipasang",Toast.LENGTH_SHORT).show();
                            try{
                                wlp.setResource(+ R.drawable.spacef);
                            }catch (IOException e){
                                e.printStackTrace();
                            }
                        }
                    });

                }else if (newString.equals("text1")) {
                    theme_preview.setBackgroundResource(R.drawable.text1);
                    btn_save.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            WallpaperManager wlp=WallpaperManager.getInstance(getApplicationContext());
                            Toast.makeText(getApplicationContext(),"Berhasil dipasang",Toast.LENGTH_SHORT).show();
                            try{
                                wlp.setResource(+ R.drawable.text1);
                            }catch (IOException e){
                                e.printStackTrace();
                            }
                        }
                    });

                }else if (newString.equals("text2")) {
                    theme_preview.setBackgroundResource(R.drawable.text2);
                    btn_save.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            WallpaperManager wlp=WallpaperManager.getInstance(getApplicationContext());
                            Toast.makeText(getApplicationContext(),"Berhasil dipasang",Toast.LENGTH_SHORT).show();
                            try{
                                wlp.setResource(+ R.drawable.text2);
                            }catch (IOException e){
                                e.printStackTrace();
                            }
                        }
                    });

                }else if (newString.equals("text3")) {
                    theme_preview.setBackgroundResource(R.drawable.text3);
                    btn_save.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            WallpaperManager wlp=WallpaperManager.getInstance(getApplicationContext());
                            Toast.makeText(getApplicationContext(),"Berhasil dipasang",Toast.LENGTH_SHORT).show();
                            try{
                                wlp.setResource(+ R.drawable.text3);
                            }catch (IOException e){
                                e.printStackTrace();
                            }
                        }
                    });

                }else if (newString.equals("text4")) {
                    theme_preview.setBackgroundResource(R.drawable.text4);
                    btn_save.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            WallpaperManager wlp=WallpaperManager.getInstance(getApplicationContext());
                            Toast.makeText(getApplicationContext(),"Berhasil dipasang",Toast.LENGTH_SHORT).show();
                            try{
                                wlp.setResource(+ R.drawable.text4);
                            }catch (IOException e){
                                e.printStackTrace();
                            }
                        }
                    });

                }else if (newString.equals("text5")) {
                    theme_preview.setBackgroundResource(R.drawable.text5);
                    btn_save.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            WallpaperManager wlp=WallpaperManager.getInstance(getApplicationContext());
                            Toast.makeText(getApplicationContext(),"Berhasil dipasang",Toast.LENGTH_SHORT).show();
                            try{
                                wlp.setResource(+ R.drawable.text5);
                            }catch (IOException e){
                                e.printStackTrace();
                            }
                        }
                    });

                }else if (newString.equals("text6")) {
                    theme_preview.setBackgroundResource(R.drawable.text6);
                    btn_save.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            WallpaperManager wlp=WallpaperManager.getInstance(getApplicationContext());
                            Toast.makeText(getApplicationContext(),"Berhasil dipasang",Toast.LENGTH_SHORT).show();
                            try{
                                wlp.setResource(+ R.drawable.text6);
                            }catch (IOException e){
                                e.printStackTrace();
                            }
                        }
                    });

                }else if (newString.equals("color1")) {
                    theme_preview.setBackgroundResource(R.drawable.color1);
                    btn_save.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            WallpaperManager wlp=WallpaperManager.getInstance(getApplicationContext());
                            Toast.makeText(getApplicationContext(),"Berhasil dipasang",Toast.LENGTH_SHORT).show();
                            try{
                                wlp.setResource(+ R.drawable.color1);
                            }catch (IOException e){
                                e.printStackTrace();
                            }
                        }
                    });

                }else if (newString.equals("color2")) {
                    theme_preview.setBackgroundResource(R.drawable.color2);
                    btn_save.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            WallpaperManager wlp=WallpaperManager.getInstance(getApplicationContext());
                            Toast.makeText(getApplicationContext(),"Berhasil dipasang",Toast.LENGTH_SHORT).show();
                            try{
                                wlp.setResource(+ R.drawable.color2);
                            }catch (IOException e){
                                e.printStackTrace();
                            }
                        }
                    });

                }else if (newString.equals("color3")) {
                    theme_preview.setBackgroundResource(R.drawable.color3);
                    btn_save.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            WallpaperManager wlp=WallpaperManager.getInstance(getApplicationContext());
                            Toast.makeText(getApplicationContext(),"Berhasil dipasang",Toast.LENGTH_SHORT).show();
                            try{
                                wlp.setResource(+ R.drawable.color3);
                            }catch (IOException e){
                                e.printStackTrace();
                            }
                        }
                    });

                }else if (newString.equals("color4")) {
                    theme_preview.setBackgroundResource(R.drawable.color4);
                    btn_save.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            WallpaperManager wlp=WallpaperManager.getInstance(getApplicationContext());
                            Toast.makeText(getApplicationContext(),"Berhasil dipasang",Toast.LENGTH_SHORT).show();
                            try{
                                wlp.setResource(+ R.drawable.color4);
                            }catch (IOException e){
                                e.printStackTrace();
                            }
                        }
                    });

                }else if (newString.equals("color5")) {
                    theme_preview.setBackgroundResource(R.drawable.color5);
                    btn_save.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            WallpaperManager wlp=WallpaperManager.getInstance(getApplicationContext());
                            Toast.makeText(getApplicationContext(),"Berhasil dipasang",Toast.LENGTH_SHORT).show();
                            try{
                                wlp.setResource(+ R.drawable.color5);
                            }catch (IOException e){
                                e.printStackTrace();
                            }
                        }
                    });

                }else if (newString.equals("color6")) {
                    theme_preview.setBackgroundResource(R.drawable.color6);
                    btn_save.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            WallpaperManager wlp=WallpaperManager.getInstance(getApplicationContext());
                            Toast.makeText(getApplicationContext(),"Berhasil dipasang",Toast.LENGTH_SHORT).show();
                            try{
                                wlp.setResource(+ R.drawable.color6);
                            }catch (IOException e){
                                e.printStackTrace();
                            }
                        }
                    });

                } else{
                    //write the statement
                }
            }
        }


        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

    }
}