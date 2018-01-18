package com.example.soumit.materialdesignothers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SwitchCompat;
import android.widget.CompoundButton;
import android.widget.Toast;

public class MaterialSwitchButton extends AppCompatActivity {

    SwitchCompat switchCompat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_material_selection_control);

        switchCompat = (SwitchCompat) findViewById(R.id.switch_id);
        switchCompat.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean switchIsOn) {
                if(switchIsOn){
                    Toast.makeText(MaterialSwitchButton.this, "Switch is ON!", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(MaterialSwitchButton.this, "Switch is OFF!", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
