package com.example.fthelloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvMain;
    private boolean isHelloWorld;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.tvMain = (TextView) findViewById(R.id.tvMain);
        this.isHelloWorld = true;
    }

    public void onBtnMainClick(View view) {
        if (this.isHelloWorld) {
            this.tvMain.setText("It changes text! Yaya");
        } else {
            this.tvMain.setText(R.string.label_name);
        }
        this.isHelloWorld = !this.isHelloWorld;
    }

    public void onBtnSideClick(View view) {
        if (this.isHelloWorld) {
            this.tvMain.setTextColor(Color.RED);
        } else {
            this.tvMain.setTextColor(Color.BLUE);
        }
        this.isHelloWorld = !this.isHelloWorld;
    }
}