package com.example.soumit.materialdesignothers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatRadioButton;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MaterialRadioButton extends AppCompatActivity {

    AppCompatRadioButton appCompatRadioButton;
    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_material_radio_button);

        radioGroup = (RadioGroup) findViewById(R.id.radiogroup_id);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.radiobtn1_id:
                        Toast.makeText(MaterialRadioButton.this, "RadioButton one selected!", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.radiobtn2_id:
                        Toast.makeText(MaterialRadioButton.this, "RadioButton two selected!", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });

        /*appCompatRadioButton = (AppCompatRadioButton) findViewById(R.id.radiobtn1_id);
        appCompatRadioButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {

            }
        });*/

    }
}
