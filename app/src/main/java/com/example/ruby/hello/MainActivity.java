package com.example.ruby.hello;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

//    private TextView textWelcome;
    private Button btnEnter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        textWelcome = findViewById(R.id.textWelcome);
        btnEnter = findViewById(R.id.btnEnter);

        btnEnter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                textWelcome.setText("HI");
//                textWelcome.setTextSize(50);
                Intent intent = new Intent( MainActivity.this, Main3Activity.class);
                startActivity(intent);

            }
        });
    }
}
