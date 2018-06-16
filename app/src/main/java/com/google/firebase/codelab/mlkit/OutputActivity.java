package com.google.firebase.codelab.mlkit;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class OutputActivity extends AppCompatActivity{

    private TextView tvOutput;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_output);

        tvOutput = (TextView) findViewById(R.id.tvOutput);

        String output = getIntent().getExtras().getString("output");

        tvOutput.setText(output);
    }


}
