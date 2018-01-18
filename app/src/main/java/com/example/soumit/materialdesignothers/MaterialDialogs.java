package com.example.soumit.materialdesignothers;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MaterialDialogs extends AppCompatActivity {

    AlertDialog alertDialog;
    AlertDialog.Builder builder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_material_dialogs);

        builder = new AlertDialog.Builder(MaterialDialogs.this, R.style.AlertDialogTheme);
        builder.setMessage("Discard draft?");

        builder.setPositiveButton("Discard", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MaterialDialogs.this, "Discard clicked!", Toast.LENGTH_SHORT).show();
            }
        });

        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MaterialDialogs.this, "Cancel clicked!", Toast.LENGTH_SHORT).show();
            }
        });

        alertDialog = builder.create();
        alertDialog.show();

        alertDialog.getButton(alertDialog.BUTTON_POSITIVE).
                setTextColor(getResources().getColor(R.color.colorAlertDialog));

        alertDialog.getButton(alertDialog.BUTTON_NEGATIVE).
                setTextColor(getResources().getColor(R.color.colorAlertDialog));

    }
}
