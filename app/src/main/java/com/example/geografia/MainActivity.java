package com.example.geografia;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.geografia.fragment.First_Fragment;

public class MainActivity extends AppCompatActivity {
    private TextView city, flag, three_mat, fout_kg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        city = findViewById(R.id.city);
        flag = findViewById(R.id.flag);
        three_mat = findViewById(R.id.three);
        fout_kg = findViewById(R.id.four_kg);

        city.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Study.class);
                intent.putExtra(Study.INPUT_KEY, "rirst");
                startActivityForResult(intent, 1);
            }
        });


        flag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Study.class);
                intent.putExtra(Study.INPUT_KEY, "second");
                startActivityForResult(intent, 1);
            }
        });

        three_mat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Study.class);
                intent.putExtra(Study.INPUT_KEY, "three_materick");
                startActivityForResult(intent, 1);
            }
        });

        fout_kg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Study.class);
                intent.putExtra(Study.INPUT_KEY, "four");
                startActivityForResult(intent, 1);
            }
        });
    }
}