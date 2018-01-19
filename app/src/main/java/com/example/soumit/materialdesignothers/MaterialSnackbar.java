package com.example.soumit.materialdesignothers;

import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MaterialSnackbar extends AppCompatActivity {

    FloatingActionButton fab;
    Snackbar snackbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_material_snackbar);

        fab = (FloatingActionButton) findViewById(R.id.fabsnackbar_btn);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                snackbar = snackbar.make(view, "Message sent!", Snackbar.LENGTH_INDEFINITE);
                snackbar.setDuration(8000);
                snackbar.setAction("OK", new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        snackbar.dismiss();
                    }
                });

                View v = snackbar.getView();
                v.setBackgroundColor(getResources().getColor(R.color.colorSnackbarBackground));

                /**
                 * Snackbar color customization
                 */

                TextView textView = (TextView) v.findViewById(android.support.design.R.id.snackbar_text);
                textView.setTextColor(getResources().getColor(R.color.colorSnackbarText));

                TextView textAction = (TextView) v.findViewById(android.support.design.R.id.snackbar_action);
                textAction.setTextColor(getResources().getColor(R.color.colorSnackbarActionText));


                snackbar.show();
            }
        });

    }
}
