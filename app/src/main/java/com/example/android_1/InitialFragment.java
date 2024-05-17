package com.example.android_1;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentResultListener;

public class InitialFragment extends Fragment {

    private Button goToLinearButton;
    private Button goToConstraintButton;
    private Button goToRelativeButton;
    private TextView textView;

    @Nullable
    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater,
            @Nullable ViewGroup container,
            @Nullable Bundle savedInstanceState
    ) {
        View view = inflater.inflate(R.layout.fragment_initial, container, false);
        getParentFragmentManager().setFragmentResultListener(
                "bundle_key",
                this,
                new FragmentResultListener() {
            @Override
            public void onFragmentResult(@NonNull String requestKey, @NonNull Bundle result) {
                String value = result.getString("initial_value");
                textView.setText(value);
            }
        });
        Log.d(String.valueOf(R.string.LOG_TAG), "onCreateView");
        Toast.makeText(requireContext(), "onCreateView", Toast.LENGTH_SHORT).show();

        // Найти кнопки по их ID
        goToLinearButton = view.findViewById(R.id.go_to_linear);
        goToConstraintButton = view.findViewById(R.id.go_to_constraint);
        goToRelativeButton = view.findViewById(R.id.go_to_relative);
        textView = view.findViewById(R.id.text_view);

        goToLinearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFragment(new LinearLayoutFragment());
            }
        });

        goToConstraintButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFragment(new ConstraintLayoutFragment());
            }
        });

        goToRelativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFragment(new RelativeLayoutFragment());
            }
        });

        return view;
    }

    private void openFragment(Fragment fragment) {
        requireActivity()
                .getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_container_view, fragment)
                .commit();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(String.valueOf(R.string.LOG_TAG), "onCreate");
        Toast.makeText(requireContext(), "onCreate", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.d(String.valueOf(R.string.LOG_TAG), "onViewCreated");
        Toast.makeText(requireContext(), "onViewCreated", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onViewStateRestored(@Nullable Bundle savedInstanceState) {
        super.onViewStateRestored(savedInstanceState);
        Log.d(String.valueOf(R.string.LOG_TAG), "onViewStateRestored");
        Toast.makeText(requireContext(), "onViewStateRestored", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d(String.valueOf(R.string.LOG_TAG), "onStart");
        Toast.makeText(requireContext(), "onStart", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(String.valueOf(R.string.LOG_TAG), "onResume");
        Toast.makeText(requireContext(), "onResume", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(String.valueOf(R.string.LOG_TAG), "onPause");
        Toast.makeText(requireContext(), "onPause", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(String.valueOf(R.string.LOG_TAG), "onStop");
        Toast.makeText(requireContext(), "onStop", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d(String.valueOf(R.string.LOG_TAG), "onSaveInstanceState");
        Toast.makeText(requireContext(), "onSaveInstanceState", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d(String.valueOf(R.string.LOG_TAG), "onDestroyView");
        Toast.makeText(requireContext(), "onDestroyView", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(String.valueOf(R.string.LOG_TAG), "onDestroy");
        Toast.makeText(requireContext(), "onDestroy", Toast.LENGTH_SHORT).show();
    }
}
