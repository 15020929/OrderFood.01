package com.example.xuan.orderfood;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import mehdi.sakout.fancybuttons.FancyButton;

public class MainActivity extends AppCompatActivity {
    FancyButton btnSignIn, btnSignUp;
    TextView    txtSologan;
    Typeface    face;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSignIn = (FancyButton) findViewById(R.id.btnSignIn);
        btnSignUp = (FancyButton) findViewById(R.id.btnSignUp);

        txtSologan = (TextView) findViewById(R.id.txtSlogan);
        face = Typeface.createFromAsset(getAssets(), "font/NABILA.TTF");
        txtSologan.setTypeface(face);

        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent signIn = new Intent(MainActivity.this, Signin.class);
                startActivity(signIn);
            }
        });

        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent signUp = new Intent(MainActivity.this, SignUp.class);
                startActivity(signUp);
            }
        });
    }
}
