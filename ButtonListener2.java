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

    <LinearLayout
        android:orientation="horizontal"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content">
    <Button
        android:id="@+id/btnLoginId"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="@string/login"
        android:textAllCaps="false"
        android:drawablePadding="8dp"
        android:textSize="20dp"
        android:drawableLeft="@drawable/login"
        />
    <Button
        android:id="@+id/btnLogoutId"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="@string/logout"
        android:textAllCaps="false"
        android:drawablePadding="8dp"
        android:textSize="20dp"
        android:drawableLeft="@drawable/exit"
        />
    </LinearLayout>

    <TextView
        android:id="@+id/textViewId"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:textSize="18sp"
        android:layout_margin="20dp"
        />

</LinearLayout>

//MainActivity.java
--------------------

package com.sazal.shohan.mybuttonlistener2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button btnLogin,btnLogout;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin = (Button) findViewById(R.id.btnLoginId);
        btnLogout = (Button)findViewById(R.id.btnLogoutId);
        textView = (TextView)findViewById(R.id.textViewId);

        btnLogin.setOnClickListener(this);
        btnLogout.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.btnLoginId){
            textView.setText("Login Successfully");
        }
        if (v.getId()==R.id.btnLogoutId){
            textView.setText("Logout Successfully");
        }
    }
}
