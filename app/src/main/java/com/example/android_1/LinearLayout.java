package com.example.android_1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.android_1.databinding.ActivityLinearLayoutBinding;
import com.example.android_1.databinding.ActivityMainBinding;

public class LinearLayout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityLinearLayoutBinding binding = ActivityLinearLayoutBinding.inflate(
                getLayoutInflater()
        );
        setContentView(binding.getRoot());

        String initialValue = getIntent().getExtras().getString("initial_value");
        binding.input.setText(initialValue);
        binding.textView.setText(getString(R.string.linear_title));
        binding.imageView.setImageDrawable(getDrawable(R.drawable.double_helix_svgrepo_com));

        binding.button.setOnClickListener(view -> {
            Intent result = new Intent();
            String resultValue = binding.input.getText().toString();
            result.putExtra("result_key", resultValue);
            setResult(Activity.RESULT_OK, result);
            Log.d("MY_TAG", "Нажали");
            finish();
        });
    }
}