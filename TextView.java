
//activity_main.xml
----------------------

<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:layout_margin="20dp"
    android:gravity="center"
    tools:context=".MainActivity">


    <TextView
        android:id="@+id/nameTextViewId"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="@string/name_text"
        android:textSize="20sp"
        android:padding="10dp"
        android:textAllCaps="true"
        android:textAlignment="center"
        android:textColor="@color/colorPrimary"
        android:textStyle="bold"
        android:textIsSelectable="true"
        android:textColorHighlight="@color/colorAccent"
        />

    <ScrollView
        android:layout_width="match_parent"
        android:layout_height="match_parent">

        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:background="#56c7f1"
            android:text="@string/dumy_text"
            android:textColor="@color/colorPrimaryDark"
            android:textSize="18sp" />
    </ScrollView>

</LinearLayout>


==============================================================================================

//MainActivity.java
--------------------

package com.sazal.shohan.mytextview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.nameTextViewId);
        textView.setText("Hello Android");
    }
}