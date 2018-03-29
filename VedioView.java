//activity_main.xml
--------------------

<?xml version="1.0" encoding="utf-8"?>
<android.support.constraint.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context="com.sazal.shohan.myvedioview.MainActivity">

    <FrameLayout
        android:layout_width="match_parent"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintLeft_toLeftOf="parent"
        app:layout_constraintRight_toRightOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        android:layout_height="wrap_content">

        <VideoView
            android:id="@+id/vId"
            android:layout_width="wrap_content"
            android:layout_height="318dp"
            />
    </FrameLayout>




</android.support.constraint.ConstraintLayout>



==============================================================================


//ManiActivity.java
--------------------

package com.sazal.shohan.myvedioview;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    private VideoView videoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        videoView = (VideoView)findViewById(R.id.vId);

        Uri uri = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.mon);
        videoView.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        videoView.setMediaController(mediaController);
        

        videoView.start();


    }
}












