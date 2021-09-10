package com.sum.multiplestatusview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.sum.multiple.MultipleStatusView;

public class MainActivity extends AppCompatActivity {
    MultipleStatusView muView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        muView = findViewById(R.id.mu_view);

        muView.showLoading();

        (findViewById(R.id.btn)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                muView.showContent();
            }
        });
    }
}