package com.example.alumno.hospital;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        Spinner BloodTypeSp =(Spinner) findViewById(R.id.BloodType);
        ArrayAdapter<CharSequence> BloodTypeAdapt = ArrayAdapter.createFromResource(this,R.array.BloodType,android.R.layout.simple_spinner_item);
        BloodTypeAdapt.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        BloodTypeSp.setAdapter(BloodTypeAdapt);
    }
}
