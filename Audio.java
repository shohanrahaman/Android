//activity_main.xml
--------------------

<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:gravity="center"

    tools:context="com.sazal.shohan.myaudio.MainActivity">

    <ImageView
        android:id="@+id/aId"
        android:layout_width="287dp"
        android:layout_height="201dp"
        android:src="@drawable/a"
        android:layout_margin="20dp"

        />

    <ImageView
        android:id="@+id/bId"
        android:layout_width="231dp"
        android:layout_height="184dp"
        android:src="@drawable/b" />

</LinearLayout>




==============================================================================


//ManiActivity.java
--------------------

package com.sazal.shohan.myaudio;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView at,bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        at = (ImageView) findViewById(R.id.aId);
        bt = (ImageView) findViewById(R.id.bId);

        final MediaPlayer amp = MediaPlayer.create(this, R.raw.a);
        final MediaPlayer bmp = MediaPlayer.create(this, R.raw.b);

        at.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                amp.start();
            }
        });

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bmp.start();
            }
        });
    }
}



