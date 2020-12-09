package com.example.mostbreakthroughapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText editTexttop;
    private EditText editTextbottom;
    private boolean buttonTap = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // ボタンを設定
        Button button = findViewById(R.id.button);
        editTexttop = findViewById(R.id.editTextTextMultiLineTop);
        editTextbottom = findViewById(R.id.editTextTextMultiLineBottom);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // ...
                if(buttonTap){
                    editTextbottom.setText("Hello");
                    buttonTap= false;
                }
                else{
                    editTextbottom.setText("World");
                    buttonTap= true;
                }
            }
        });
    }
}