package com.example.android_1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class ConstraintLayout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_constraint_layout);

        EditText editView = (EditText)findViewById(R.id.edit);
        String initialValue = getIntent().getExtras().getString("initial_value").toString();
        editView.setText(initialValue);

        ImageView image = (ImageView)findViewById(R.id.image_view);
        image.setImageDrawable(getDrawable(R.drawable.protein_svgrepo_com));

        Button button = (Button)findViewById(R.id.button);
        button.setOnClickListener(view -> {
            Intent result = new Intent();
            String resultValue = editView.getText().toString();
            result.putExtra("result_key", resultValue);
            setResult(Activity.RESULT_OK, result);
            finish();
        });
    }
}