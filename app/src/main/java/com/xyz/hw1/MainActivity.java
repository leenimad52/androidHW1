package com.xyz.hw1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
   private Button button;
   private EditText edtTxt1;
   private EditText edtTxt2;
   private TextView textView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);
        edtTxt1=findViewById(R.id.edtTxt1);
        edtTxt2=findViewById(R.id.edtTxt2);
        textView2=findViewById(R.id.textView2);
    }

    public void btnOnClick(View view) {
        textView2.setVisibility(View.VISIBLE);
        textView2.setText(edtTxt1.getText()+","+edtTxt2.getText());
    }
}