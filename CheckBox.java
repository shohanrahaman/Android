//activity_main.xml
--------------------

<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="#30b788"
    android:padding="10dp"
    android:orientation="vertical"
    tools:context="com.example.shohan.mycheckbox.MainActivity">

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="@string/head_txt"
        android:textStyle="bold"
        android:textSize="20dp"
        />

    <CheckBox
        android:id="@+id/milkId"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="@string/ck_milk"
        />
    <CheckBox
        android:id="@+id/teaId"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="@string/ck_Tea"
        />
    <CheckBox
        android:id="@+id/sugarId"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="@string/ck_Sugar"
        />
    <Button
        android:id="@+id/showId"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="@string/btn_click"
        />
    <TextView
        android:id="@+id/resultId"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content" />


</LinearLayout>



==============================================================================


//ManiActivity.java
--------------------

package com.example.shohan.mycheckbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private CheckBox ckm,ckt,cks;
    private TextView res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.showId);
        ckm = (CheckBox)findViewById(R.id.milkId);
        ckt = (CheckBox)findViewById(R.id.teaId);
        cks = (CheckBox)findViewById(R.id.sugarId);
        res = (TextView) findViewById(R.id.resultId);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder stringBuilder = new StringBuilder();
                if (ckm.isChecked()){
                    String value = ckm.getText().toString();
                    stringBuilder.append(value+" is ordered \n");
                }
                if (ckt.isChecked()){
                    String value = ckt.getText().toString();
                    stringBuilder.append(value+" is ordered \n");
                }
                if (cks.isChecked()){
                    String value = cks.getText().toString();
                    stringBuilder.append(value+" is ordered");
                }
                res.setText(stringBuilder);
            }
        });

    }
}


