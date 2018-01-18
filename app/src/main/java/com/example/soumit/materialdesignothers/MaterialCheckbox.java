package com.example.soumit.materialdesignothers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatCheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class MaterialCheckbox extends AppCompatActivity {

    AppCompatCheckBox appCompatCheckBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_material_checkbox);

        appCompatCheckBox = (AppCompatCheckBox) findViewById(R.id.checkbox_id);
        appCompatCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean boxIsChecked) {
                if(boxIsChecked){
                    Toast.makeText(MaterialCheckbox.this, "box checked!", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(MaterialCheckbox.this, "box is empty!", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
