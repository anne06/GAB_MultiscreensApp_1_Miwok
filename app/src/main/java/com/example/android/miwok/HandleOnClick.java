package com.example.android.miwok;

import android.view.View;
import android.widget.Toast;

public class HandleOnClick implements View.OnClickListener {

    @Override
    public void onClick(View v) {
        Toast.makeText(v.getContext(), "Je suis dans le listener", Toast.LENGTH_SHORT).show();
   }
}
