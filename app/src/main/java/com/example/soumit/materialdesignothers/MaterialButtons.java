package com.example.soumit.materialdesignothers;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.view.View;
import android.widget.Toast;

public class MaterialButtons extends AppCompatActivity {

    AppCompatButton raisedButton;
    AppCompatButton flatButton;
    FloatingActionButton floatingActionButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_material_buttons);

        raisedButton = (AppCompatButton) findViewById(R.id.raised_btn);
        raisedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MaterialButtons.this, "Rasied button clicked!", Toast.LENGTH_SHORT).show();
            }
        });

        flatButton = (AppCompatButton) findViewById(R.id.flat_btn);
        flatButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MaterialButtons.this, "Flat button clicked!", Toast.LENGTH_SHORT).show();
            }
        });

        floatingActionButton = (FloatingActionButton) findViewById(R.id.fab_btn);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MaterialButtons.this, "FAB clicked!", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
