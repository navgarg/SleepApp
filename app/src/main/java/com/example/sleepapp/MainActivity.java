package com.example.sleepapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    static String stage;
    RadioGroup radioGroup;
    RadioButton stage_selected;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radioGroup = (RadioGroup) findViewById(R.id.radio_group);
        Button proceed = findViewById(R.id.proceed_button);
        proceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int selectedId = radioGroup.getCheckedRadioButtonId();
                stage_selected = (RadioButton) findViewById(selectedId);
                if (selectedId == -1) {
                    Toast.makeText(MainActivity.this, "Nothing selected", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, stage_selected.getText(), Toast.LENGTH_SHORT).show();
                    stage = stage_selected.getText().toString();
                }
            }
        });
    }
}