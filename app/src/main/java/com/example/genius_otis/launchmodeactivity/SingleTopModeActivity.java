package com.example.genius_otis.launchmodeactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SingleTopModeActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_standard_launch_mode);
    }

    @Override
    public void onClick(View v) {
        int viewId = v.getId();
        switch (viewId) {
            case R.id.standardMode:
                startActivity(new Intent(this, StandardLaunchModeActivity.class));
                break;

            case R.id.singleTop:
                startActivity(new Intent(this, SingleTopModeActivity.class));
                break;

        }
    }
}