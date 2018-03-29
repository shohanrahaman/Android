//activity_main.xml
--------------------

<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:padding="20dp"
    android:orientation="vertical"
    tools:context="com.sazal.shohan.myradiobutton.MainActivity">

    <RadioGroup
        android:id="@+id/rdId"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content">


        <RadioButton
            android:id="@+id/mId"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Male"
            />

        <RadioButton
            android:id="@+id/fId"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Female"
            />


    </RadioGroup>

    <Button
        android:id="@+id/btnId"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Show"
        android:textAllCaps="false"

        />

    <TextView
        android:id="@+id/viewId"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        />


</>





==============================================================================


//ManiActivity.java
--------------------

package com.sazal.shohan.myradiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RadioGroup radioGroup;
    Button button;
    TextView textView;
    RadioButton gender;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = (RadioGroup)findViewById(R.id.rdId);
        button = (Button)findViewById(R.id.btnId);
        textView = (TextView)findViewById(R.id.viewId);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int selected = radioGroup.getCheckedRadioButtonId();
                gender = (RadioButton) findViewById(selected);
                String value = gender.getText().toString();
                textView.setText("You have selected : "+value);
            }
        });
    }
}







