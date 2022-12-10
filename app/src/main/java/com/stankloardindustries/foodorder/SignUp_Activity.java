package com.stankloardindustries.foodorder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;

public class SignUp_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        /*getSupportActionBar().setTitle("SingUp");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);*/

        // Transparent ActionBar

        getWindow().setFlags(
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        );

        getSupportActionBar().hide();
    }

    /*@Override
    public boolean onSupportNavigateUp() {
        return super.onSupportNavigateUp();
    }*/
}