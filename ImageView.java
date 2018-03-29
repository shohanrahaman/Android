//activity_main.xml
--------------------

<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    tools:context="com.example.shohan.myimageview.MainActivity">


    <ImageView
        android:id="@+id/cat"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:src="@drawable/cat"
        android:scaleType="fitXY"
        android:layout_margin="10dp"

        />

    <ImageView
        android:id="@+id/bird"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:src="@drawable/bird"
        android:scaleType="fitXY"
        android:layout_margin="10dp"
        />

</LinearLayout>



==============================================================================


//ManiActivity.java
--------------------

package com.example.shohan.myimageview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private ImageView img1,img2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img1 = (ImageView) findViewById(R.id.cat);
        img2 = (ImageView) findViewById(R.id.bird);

        img1.setOnClickListener(this);
        img2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId()==R.id.cat){
            Toast.makeText(MainActivity.this,"This is Cute cat",Toast.LENGTH_SHORT).show();
        }
        if (view.getId()==R.id.bird){
            Toast.makeText(MainActivity.this,"This is Love Bird",Toast.LENGTH_SHORT).show();
        }
    }
}




