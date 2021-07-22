package com.example.busbooking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class slpshactivity extends AppCompatActivity {

    private  static int SPLASH_SCREEN= 3000;
    Animation topAnim,bottomAnim;
    ImageView img;
    TextView developed, name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slpshactivity);


        topAnim= AnimationUtils.loadAnimation(this,R.anim.top);
        bottomAnim=AnimationUtils.loadAnimation(this,R.anim.bottom);

        img= findViewById(R.id.logo);
        developed=findViewById(R.id.dev_by);
        name=findViewById(R.id.my_name);

        img.setAnimation(topAnim);
        developed.setAnimation(bottomAnim);
        name.setAnimation(bottomAnim);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent= new Intent(slpshactivity.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        },SPLASH_SCREEN);
    }
}