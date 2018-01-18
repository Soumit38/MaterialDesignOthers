package com.example.soumit.materialdesignothers;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MaterialConfirmationDialog extends AppCompatActivity {

    AlertDialog dialog;
    AlertDialog.Builder builder;
    String[] items = {"Easy", "Medium", "Hard", "Very Hard"};
    String result = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_material_confirmation_dialog);

        builder = new AlertDialog.Builder(MaterialConfirmationDialog.this, R.style.ConfirmationDialogTheme);
        builder.setTitle("Select the difficulty level");
        builder.setSingleChoiceItems(items, -1, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                result = items[i];
            }
        });

        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MaterialConfirmationDialog.this, "Selected item: "+ result, Toast.LENGTH_SHORT).show();
            }
        });

        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });

        dialog = builder.create();
        dialog.show();

    }
}
