package com.example.practical_4_2_homework;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {
    CheckBox check_chocolate, check_Sprinkles, check_Crushednuts, check_Cherries, check_OrioCookie;
    Button btn_showtost;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        check_chocolate = findViewById(R.id.ChocololateSyrup);
        check_Sprinkles = findViewById(R.id.Sprinkles);
        check_Crushednuts = findViewById(R.id.Crushednuts);
        check_Cherries = findViewById(R.id.Cherries);
        check_OrioCookie = findViewById(R.id.OrioCookie);
        btn_showtost = findViewById(R.id.Showtost);
        btn_showtost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuffer result = new StringBuffer();
                result.append("Toppings:");
                if (check_chocolate.isChecked()) {
                    result.append("" + check_chocolate.getText().toString());
                }
                if (check_Sprinkles.isChecked()) {
                    result.append("\t" + check_Sprinkles.getText().toString());
                }
                if (check_Crushednuts.isChecked()) {
                    result.append("\t" + check_Crushednuts.getText().toString());
                }
                if (check_Cherries.isChecked()) {
                    result.append("\t" + check_Cherries.getText().toString());
                }
                if (check_OrioCookie.isChecked()) {
                    result.append("\t" + check_OrioCookie.getText().toString());
                }
                if (!check_chocolate.isChecked() && !check_Sprinkles.isChecked() && !check_Crushednuts.isChecked() && !check_Cherries.isChecked() && !check_OrioCookie.isChecked())
                    result.append("None");
                Message.message(MainActivity.this, result.toString());
            }
        });
    }
}