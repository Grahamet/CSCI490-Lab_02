package com.example.intentdemo;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class secondActivity extends AppCompatActivity {

    TextView textview2;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent i = getIntent();
        String s = i.getExtras().getString("testString");

        textview2 = findViewById(R.id.textView2);

        textview2.setText(s);

        finish();
    }

//    @Override
//    public void finish(){
//        Intent intent = new Intent();
//        intent.putExtra("imageID", imageID);
//
//        setResult(RESULT_OK, intent);
//        super.finish();
//    }

}
