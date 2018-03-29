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
        android:id="@+id/btnId"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:drawableLeft="@drawable/call"
        android:text="@string/call"
        android:textSize="20sp"
        android:onClick="showMsg"
        android:textAllCaps="false"
        android:drawablePadding="8dp"
        />
    <TextView
        android:id="@+id/textViewId"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:textSize="18sp"
        android:layout_margin="10dp"
        />

</LinearLayout>

=================================================================

//MainActivity.java
--------------------

package com.sazal.shohan.mybuttonlistener3;

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

        button = (Button)findViewById(R.id.btnId);
        textView = (TextView)findViewById(R.id.textViewId);
    }

    public void showMsg(View v){
        if (v.getId()==R.id.btnId){
            textView.setText("Thanks for calling....");
        }
    }
}
