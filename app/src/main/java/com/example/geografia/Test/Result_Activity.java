package com.example.geografia.Test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.geografia.R;

public class Result_Activity extends AppCompatActivity {
    public static final String Result_Key = "result_key";

    private String kod, q;
    private TextView kol_result, result_text, q_result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_);
        kol_result = findViewById(R.id.kol_result);
        q_result = findViewById(R.id.q_result);
        result_text = findViewById(R.id.result_text);
        if (getIntent() != null) {

            Intent intent = getIntent();
            kod = intent.getStringExtra(Result_Key);

        }
        if (Integer.valueOf(kod) >= 0 && Integer.valueOf(kod) <= 3) {
            result_text.setText("Очень плохо внимательно прочитайте тему!");
        } else if (Integer.valueOf(kod) >= 4 && Integer.valueOf(kod) <= 8) {
            result_text.setText("Хороший результат,но вы можете лучше");
        } else if (Integer.valueOf(kod) >= 9 && Integer.valueOf(kod) <= 10) {
            result_text.setText("Отлично!!!");
        }
        kol_result.setText(kod);
        q_result.setText("10");
    }
}