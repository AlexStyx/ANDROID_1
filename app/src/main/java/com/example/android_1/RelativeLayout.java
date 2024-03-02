package com.example.android_1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class RelativeLayout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative_layout);

        EditText editView = (EditText)findViewById(R.id.input);
        String initialValue = getIntent().getExtras().getString("initial_value").toString();
        editView.setText(initialValue);

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