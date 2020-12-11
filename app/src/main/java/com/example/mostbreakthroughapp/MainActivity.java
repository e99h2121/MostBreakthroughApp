package com.example.mostbreakthroughapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText editTexttop;
    private EditText editTextbottom;
    //private boolean buttonTap = false;

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
                String mackytext = "";
                mackytext = editTexttop.getText().toString();
                mackytext = breakthrough(mackytext);
                editTextbottom.setText(mackytext);

//                if(buttonTap){
//                    editTexttop.setText("あります");
//                    editTextbottom.setText("");
//                    buttonTap= false;
//                }
//                else{
//                    editTexttop.setText("");
//                    editTextbottom.setText("まいか");
//                    buttonTap= true;
//                }
            }
        });
    }

    private String breakthrough(String mackytext) {
        String str;
        str = mackytext.replace("ます", "ますまいか");
        str = str.replace("です", "ですぞ");
        str = str.replace("でした", "でしたぞ");
        str = str.replace("ました", "ましたぞ");
        str = str.replace("さい", "さいですぞ");
        return str;
    }
}