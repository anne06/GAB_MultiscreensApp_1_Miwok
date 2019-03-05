package com.example.android.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Start NUMBERS activity
        TextView numbers = (TextView) findViewById(R.id.numbers);
        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "Numbers", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MainActivity.this, NumbersActivity.class));
            }
        });

        // Start FAMILY MEMBERS activity
        TextView family = (TextView) findViewById(R.id.family);
        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "Family", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MainActivity.this, FamilyActivity.class));
            }
        });

        // start COLORS activity
        TextView colors = (TextView) findViewById(R.id.colors);
        colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "Colors", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MainActivity.this, ColorsActivity.class));
            }
        });

        // start PHRASES activity
        TextView phrases = (TextView) findViewById(R.id.phrases);
        phrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "Phrases", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MainActivity.this, PhrasesActivity.class));
            }
        });

    }


    /*
    public void openNumbersList(View view){
        // EXPLICIT intent
        Intent intent = new Intent(this, NumbersActivity.class);
        startActivity(intent);
    }
    */
}
