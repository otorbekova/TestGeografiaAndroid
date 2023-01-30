package com.example.geografia;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.example.geografia.Test.Test_Activity;
import com.example.geografia.adapter.StudyAdapter;
import com.example.geografia.fragment.First_Fragment;
import com.example.geografia.fragment.Four_Fragment;
import com.example.geografia.fragment.Second_Fragment;
import com.example.geografia.fragment.Three_Fragment;

import java.util.ArrayList;
import java.util.List;

public class Study extends AppCompatActivity {
    public static final String INPUT_KEY = "input_key";
    private String kod;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stady);

        if (getIntent() != null) {
            Intent intent = getIntent();
            kod = intent.getStringExtra(INPUT_KEY);
        }
        if (kod.equals("rirst")) {
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.nav_host_fragment, new First_Fragment(), "TaG");
            transaction.commit();
        } else if (kod.equals("second")) {
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.nav_host_fragment, new Second_Fragment(), "TaG2");
            transaction.commit();
        } else if (kod.equals("three_materick")) {
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.nav_host_fragment, new Three_Fragment(), "TaG3");
            transaction.commit();
        } else if (kod.equals("four")) {
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.nav_host_fragment, new Four_Fragment(), "TaG4");
            transaction.commit();
        }

    }

    @Override
    public boolean onCreateOptionsMenu(@NonNull Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.exempl, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.toolbar:
                Intent intent = new Intent(Study.this, Test_Activity.class);
                intent.putExtra(Test_Activity.Key, kod);
                startActivityForResult(intent, 01);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}