//activity_main.xml
--------------------

<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:layout_margin="20dp"
    android:gravity="center"
    tools:context="com.example.shohan.myedittext.MainActivity">


    <EditText
        android:id="@+id/editText1Id"
        android:layout_width="200dp"
        android:layout_height="50dp"
        android:hint="@string/input1"
        android:inputType="numberDecimal"
        android:backgroundTint="@color/colorPrimary"
        android:textCursorDrawable="@color/colorAccent"
        />

    <EditText
        android:id="@+id/editText2Id"
        android:layout_width="200dp"
        android:layout_height="50dp"
        android:hint="@string/input2"
        android:inputType="numberDecimal"
        android:backgroundTint="@color/colorPrimary"
        android:textCursorDrawable="@color/colorAccent"
        />

    <LinearLayout
        android:layout_width="wrap_content"
        android:layout_height="wrap_content">


    <Button
        android:id="@+id/addButtonId"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="@string/add_btn"
        android:layout_marginRight="10dp"
        />
    <Button
        android:id="@+id/subButtonID"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="@string/sub_btn"
        />

    </LinearLayout>

    <TextView
        android:id="@+id/resultViewId"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:textSize="20sp"

        />

</LinearLayout>


==============================================================================


//ManiActivity.java
--------------------

package com.example.shohan.myedittext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    EditText editText1, editText2;
    Button addButton,subButton;
    TextView resultView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = (EditText)findViewById(R.id.editText1Id);
        editText2 = (EditText)findViewById(R.id.editText2Id);

        addButton = (Button) findViewById(R.id.addButtonId);
        subButton = (Button) findViewById(R.id.subButtonID);

        resultView = (TextView)findViewById(R.id.resultViewId);

        addButton.setOnClickListener(this);
        subButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        try {
            String number1 = editText1.getText().toString();
            String number2 = editText2.getText().toString();

            //converting into double
            double num1 = Double.parseDouble(number1);
            double num2 = Double.parseDouble(number2);

            if (view.getId()==R.id.addButtonId){
                double sum = num1+num2;
                resultView.setText("Result : "+sum);
            }
            if (view.getId()==R.id.subButtonID){
                double sub = num1-num2;
                resultView.setText("Result : "+sub);
            }
        } catch (Exception e){
            Toast.makeText(MainActivity.this,"Enter Numbers",Toast.LENGTH_SHORT).show();
        }
    }
}

