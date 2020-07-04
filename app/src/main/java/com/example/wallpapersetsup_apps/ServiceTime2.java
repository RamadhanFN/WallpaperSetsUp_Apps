package com.example.wallpapersetsup_apps;


import android.app.Service;
import android.app.WallpaperManager;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.IBinder;

public class ServiceTime2 extends Service implements Runnable {
    private int wallpaperId[] = {R.drawable.spacea, R.drawable.spaceb, R.drawable.spacec, R.drawable.spaced, R.drawable.spacee, R.drawable.spacef};
    private int waktu;
    private int FLAG=0;
    private  Thread t;
    private  Bitmap spacewalp1;
    private  Bitmap spacewalp2;
    private  Bitmap spacewalp3;
    private  Bitmap spacewalp4;
    private  Bitmap spacewalp5;
    private  Bitmap spacewalp6;

    @Override
    public IBinder onBind(Intent arg0) {
        return null;
    }
    @Override
    public int onStartCommand(Intent intent, int flag,int startId)
    {
        super.onStartCommand(intent,flag, startId);
        Bundle bundle=intent.getExtras();
        waktu = bundle.getInt("durasi");
        spacewalp1=BitmapFactory.decodeResource(getResources(),wallpaperId[0]);
        spacewalp2=BitmapFactory.decodeResource(getResources(),wallpaperId[1]);
        spacewalp3=BitmapFactory.decodeResource(getResources(),wallpaperId[2]);
        spacewalp4=BitmapFactory.decodeResource(getResources(),wallpaperId[3]);
        spacewalp5=BitmapFactory.decodeResource(getResources(),wallpaperId[4]);
        spacewalp6=BitmapFactory.decodeResource(getResources(),wallpaperId[5]);
        t = new Thread(ServiceTime2.this);
        t.start();
        return START_STICKY_COMPATIBILITY;
    }
    @Override
    public void onDestroy(){
        super.onDestroy();
        System.exit(0);
    }
    @Override
    public void run(){
        WallpaperManager myWallpaper;
        myWallpaper = WallpaperManager.getInstance(this);
        try{
            while (true){
                if(FLAG==0){
                    myWallpaper.setBitmap(spacewalp1);
                    FLAG++;
                }
                else if (FLAG==1){
                    myWallpaper.setBitmap(spacewalp2);
                    FLAG++;
                }
                else if (FLAG==2){
                    myWallpaper.setBitmap(spacewalp3);
                    FLAG++;
                }
                else if (FLAG==3){
                    myWallpaper.setBitmap(spacewalp4);
                    FLAG++;
                }
                else if (FLAG==4){
                    myWallpaper.setBitmap(spacewalp5);
                    FLAG++;
                }
                else if (FLAG==5){
                    myWallpaper.setBitmap(spacewalp6);
                    FLAG++;
                }
                else{
                    FLAG = 0;
                }
                Thread.sleep(100*waktu);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

