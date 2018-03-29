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
    tools:context=".MainActivity">


    <Button
        android:id="@+id/btnClickId"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="@string/click"
        android:textSize="18dp"
        android:textAllCaps="false"
        android:drawablePadding="8dp"
        android:drawableLeft="@drawable/click"
        />

    <TextView
        android:id="@+id/textViewId"
        android:layout_margin="20dp"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:textSize="20sp"
        />

</LinearLayout>

===========================================================================

//MainActivity.java
--------------------

package com.sazal.shohan.mybuttonlistener;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.btnClickId);
        textView = (TextView) findViewById(R.id.textViewId);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("Button Clicked !");
            }
        });
    }
}
