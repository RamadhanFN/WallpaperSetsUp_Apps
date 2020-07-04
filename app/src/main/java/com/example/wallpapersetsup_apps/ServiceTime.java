package com.example.wallpapersetsup_apps;


import android.app.Service;
import android.app.WallpaperManager;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.IBinder;

public class ServiceTime extends Service implements Runnable {
    private int wallpaperId[] = {R.drawable.color1, R.drawable.color2, R.drawable.color3, R.drawable.color4, R.drawable.color5, R.drawable.color6};
    private int waktu;
    private int FLAG=0;
    private  Thread t;
    private  Bitmap colorwalp1;
    private  Bitmap colorwalp2;
    private  Bitmap colorwalp3;
    private  Bitmap colorwalp4;
    private  Bitmap colorwalp5;
    private  Bitmap colorwalp6;

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
        colorwalp1=BitmapFactory.decodeResource(getResources(),wallpaperId[0]);
        colorwalp2=BitmapFactory.decodeResource(getResources(),wallpaperId[1]);
        colorwalp3=BitmapFactory.decodeResource(getResources(),wallpaperId[2]);
        colorwalp4=BitmapFactory.decodeResource(getResources(),wallpaperId[3]);
        colorwalp5=BitmapFactory.decodeResource(getResources(),wallpaperId[4]);
        colorwalp6=BitmapFactory.decodeResource(getResources(),wallpaperId[5]);
        t = new Thread(ServiceTime.this);
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
                    myWallpaper.setBitmap(colorwalp1);
                    FLAG++;
                }
                else if (FLAG==1){
                    myWallpaper.setBitmap(colorwalp2);
                    FLAG++;
                }
                else if (FLAG==2){
                    myWallpaper.setBitmap(colorwalp3);
                    FLAG++;
                }
                else if (FLAG==3){
                    myWallpaper.setBitmap(colorwalp4);
                    FLAG++;
                }
                else if (FLAG==4){
                    myWallpaper.setBitmap(colorwalp5);
                    FLAG++;
                }
                else if (FLAG==5){
                    myWallpaper.setBitmap(colorwalp6);
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

