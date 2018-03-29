//activity_main.xml
--------------------

<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:gravity="center"
    android:orientation="vertical"
    tools:context="com.sazal.shohan.myratingbar.MainActivity">

    <RatingBar
        android:id="@+id/rbId"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:numStars="5"
        android:stepSize="0.5"
        android:rating="3"
        android:progressTint="@color/colorAccent"
        android:progressBackgroundTint="@color/colorPrimary"
        />

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:id="@+id/tvId"
        />

</LinearLayout>



==============================================================================


//ManiActivity.java
--------------------

package com.sazal.shohan.myratingbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private RatingBar rb;
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rb = (RatingBar)findViewById(R.id.rbId);
        tv = (TextView)findViewById(R.id.tvId);
        tv.setText("Value is : "+rb.getProgress());

        rb.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                tv.setText("Value is : "+v);
            }
        });
    }
}








