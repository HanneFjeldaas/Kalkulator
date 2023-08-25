package com.example.kalkulator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity {
    EditText tall1;
    EditText tall2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tall1 = (EditText) findViewById(R.id.tall1);
        tall2 = (EditText) findViewById(R.id.tall2);
        TextView resultatTextView = findViewById(R.id.resultat);
        Button plussknapp = (Button) findViewById(R.id.pluss);
        Button minusknapp = (Button) findViewById(R.id.minus);
        Button gangeknapp = (Button) findViewById(R.id.gange);
        Button deleknapp = (Button) findViewById(R.id.dele);
        Button sletteknapp = (Button) findViewById(R.id.slette);
        sletteknapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //nullstill tall1 og tall2 og resultat
                tall1.setText("");
                tall2.setText("");
                resultatTextView.setText("Ditt resultat her");
            }
        });
        plussknapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float
                        innverdi1 =
                        Float.parseFloat(tall1.getText().toString());
                float
                        innverdi2 =
                        Float.parseFloat(tall2.getText().toString());

                resultatTextView.setText(String.valueOf(plussTall1og2(innverdi1, innverdi2)));
            }
        });
        minusknapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float
                        innverdi1 =
                        Float.parseFloat(tall1.getText().toString());
                float
                        innverdi2 =
                        Float.parseFloat(tall2.getText().toString());
                resultatTextView.setText(String.valueOf(minusTall1og2(innverdi1, innverdi2)));
            }
        });
        gangeknapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float
                        innverdi1 =
                        Float.parseFloat(tall1.getText().toString());
                float
                        innverdi2 =
                        Float.parseFloat(tall2.getText().toString());
                resultatTextView.setText(String.valueOf(gangeTall1og2(innverdi1, innverdi2)));
            }
        });
        deleknapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float
                        innverdi1 =
                        Float.parseFloat(tall1.getText().toString());
                float
                        innverdi2 =
                        Float.parseFloat(tall2.getText().toString());
                resultatTextView.setText(String.valueOf(deleTall1og2(innverdi1, innverdi2)));
            }
        });
    }
    float plussTall1og2(float innverdi1, float innverdi2) {
        return (innverdi1 + innverdi2);
    }
    float minusTall1og2(float innverdi1, float innverdi2) {
        return (innverdi1 - innverdi2);
    }
    float gangeTall1og2(float innverdi1, float innverdi2) {
        return (innverdi1 * innverdi2);
    }
    float deleTall1og2(float innverdi1, float innverdi2) {
        return (innverdi1 / innverdi2);
    }

}