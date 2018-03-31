//activity_main.xml
--------------------

<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:layout_margin="10dp"
    android:gravity="center"
    tools:context=".MainActivity">

    <TextView
        android:id="@+id/textViewId"
        android:text="Current Date"
        android:textSize="20dp"
        android:textStyle="bold"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content" />

    <Button
        android:id="@+id/buttonId"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Select Date"
        android:textAllCaps="false"
        android:textSize="20sp"
        android:layout_margin="10dp"
        />

    <DatePicker
        android:id="@+id/datePickerId"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content">

    </DatePicker>


</LinearLayout>


=====================================================================================

//MainActivity.java
--------------------

package com.sazal.shohan.mydatepicker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private DatePicker datePicker;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView)findViewById(R.id.textViewId);
        datePicker = (DatePicker) findViewById(R.id.datePickerId);
        button = (Button) findViewById(R.id.buttonId);

        textView.setText(currentDate());

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(currentDate());
            }
        });
    }

    String currentDate(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(datePicker.getDayOfMonth()+"/");
        stringBuilder.append(datePicker.getMonth()+1+"/");
        stringBuilder.append(datePicker.getYear());

        return stringBuilder.toString();
    }
}
