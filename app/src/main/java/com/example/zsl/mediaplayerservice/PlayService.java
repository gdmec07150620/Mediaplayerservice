package com.example.zsl.mediaplayerservice;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.support.annotation.Nullable;

/**
 * Created by zsl on 2016/11/20.
 */

public class PlayService extends Service {

    MediaPlayer mediaPlayer;
    public PlayService(){

    }
    public IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException("not yet implemented");
    }
    public int onStartCommand(Intent intent,int flags,int startId){
        mediaPlayer.start();
        return super.onStartCommand(intent,flags,startId);
    }
    public void onCreate(){
        super.onCreate();
        mediaPlayer=MediaPlayer.create(this,R.raw.exodus);
    }
    public void onDestory(){
        super.onDestroy();
        mediaPlayer.stop();
        mediaPlayer.release();
    }
}
