//activity_main.xml
---------------------


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
        android:id="@+id/btnId"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Show Time Dialog"
        android:textStyle="bold"
        android:textSize="18dp"
        android:layout_margin="10dp"
        style="@style/Widget.AppCompat.Button.Colored"
        />
    <TextView
        android:id="@+id/textViewId"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:textSize="20dp"
        android:textStyle="bold"
        />

</LinearLayout>


==================================================================================

//MainActivity.java
-----------------------


package com.sazal.shohan.mytimepickerdialog;

import android.app.TimePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button button;
    private TextView textView;
    private TimePickerDialog timePickerDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button)findViewById(R.id.btnId);
        textView = (TextView) findViewById(R.id.textViewId);

        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        TimePicker timePicker = new TimePicker(this);
        int currentHour = timePicker.getCurrentHour();
        int currentMinute = timePicker.getCurrentMinute();

        timePickerDialog = new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker view, int hourOfDay, int minute) {

                textView.setText(hourOfDay+" : "+minute);
            }
        },currentHour,currentMinute,true);


        timePickerDialog.show();
    }
}
