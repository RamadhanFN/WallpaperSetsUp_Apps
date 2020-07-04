package com.example.wallpapersetsup_apps;


import android.app.Service;
import android.app.WallpaperManager;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.IBinder;

public class ServiceTime3 extends Service implements Runnable {
    private int wallpaperId[] = {R.drawable.text1, R.drawable.text2, R.drawable.text3, R.drawable.text4, R.drawable.text5, R.drawable.text6};
    private int waktu;
    private int FLAG=0;
    private  Thread t;
    private  Bitmap textwalp1;
    private  Bitmap textwalp2;
    private  Bitmap textwalp3;
    private  Bitmap textwalp4;
    private  Bitmap textwalp5;
    private  Bitmap textwalp6;

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
        textwalp1=BitmapFactory.decodeResource(getResources(),wallpaperId[0]);
        textwalp2=BitmapFactory.decodeResource(getResources(),wallpaperId[1]);
        textwalp3=BitmapFactory.decodeResource(getResources(),wallpaperId[2]);
        textwalp4=BitmapFactory.decodeResource(getResources(),wallpaperId[3]);
        textwalp5=BitmapFactory.decodeResource(getResources(),wallpaperId[4]);
        textwalp6=BitmapFactory.decodeResource(getResources(),wallpaperId[5]);
        t = new Thread(ServiceTime3.this);
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
                    myWallpaper.setBitmap(textwalp1);
                    FLAG++;
                }
                else if (FLAG==1){
                    myWallpaper.setBitmap(textwalp2);
                    FLAG++;
                }
                else if (FLAG==2){
                    myWallpaper.setBitmap(textwalp3);
                    FLAG++;
                }
                else if (FLAG==3){
                    myWallpaper.setBitmap(textwalp4);
                    FLAG++;
                }
                else if (FLAG==4){
                    myWallpaper.setBitmap(textwalp5);
                    FLAG++;
                }
                else if (FLAG==5){
                    myWallpaper.setBitmap(textwalp6);
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

