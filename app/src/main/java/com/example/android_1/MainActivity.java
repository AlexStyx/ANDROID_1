package com.example.android_1;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MY_APP_LOG";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickGoToLinear(View view) {
        Intent intent = new Intent(this, LinearLayout.class);
        String currentValue = ((TextView)findViewById(R.id.text_view)).getText().toString();
        intent.putExtra("initial_value", currentValue);
        launcher.launch(intent);
    }

    public void onClickGoToConstraint(View view) {
        Intent intent = new Intent(this, ConstraintLayout.class);
        String currentValue = ((TextView)findViewById(R.id.text_view)).getText().toString();
        intent.putExtra("initial_value", currentValue);
        launcher.launch(intent);
    }

    public void onClickGoToRelative(View view) {
        Intent intent = new Intent(this, RelativeLayout.class);
        String currentValue = ((TextView)findViewById(R.id.text_view)).getText().toString();
        intent.putExtra("initial_value", currentValue);
        launcher.launch(intent);
    }
    
    private final ActivityResultLauncher<Intent> launcher = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(),
            new ActivityResultCallback<ActivityResult>() {
                @Override
                public void onActivityResult(ActivityResult result) {
                    Intent data = result.getData();
                    if (data == null) return;
                    TextView textView = findViewById(R.id.text_view);
                    textView.setText(data.getStringExtra("result_key"));
                }
            }
    );
}