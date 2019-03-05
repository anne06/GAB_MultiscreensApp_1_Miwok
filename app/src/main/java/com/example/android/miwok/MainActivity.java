package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HandleOnClick clickOnNumbers = new HandleOnClick();
        TextView numbers = findViewById(R.id.numbers);
        TextView colors = findViewById(R.id.colors);
        TextView family = findViewById(R.id.family);

        numbers.setOnClickListener(clickOnNumbers);
        colors.setOnClickListener(clickOnNumbers);
        family.setOnClickListener(clickOnNumbers);

    }


    /*
    public void openNumbersList(View view){
        // EXPLICIT intent
        Intent intent = new Intent(this, NumbersActivity.class);
        startActivity(intent);
    }
    */
}
