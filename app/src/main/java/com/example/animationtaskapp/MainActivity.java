package com.example.animationtaskapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends AppCompatActivity {

    ImageView iv_sample;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
    }

    private void initViews() {
        iv_sample = findViewById(R.id.image_land);
        Button b_bounce = findViewById(R.id.b_zoom);
        Button b_sequential = findViewById(R.id.b_rotate);
        Button b_together = findViewById(R.id.b_fade);
        Button b_facebook = findViewById(R.id.b_blink);
        Button b_youtube = findViewById(R.id.b_move);
        Button b_twitter = findViewById(R.id.b_slide);
        LottieAnimationView lottieAnimationView = findViewById(R.id.lottie_animation);

        b_bounce.setOnClickListener(v -> {
            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.bounce);
            iv_sample.startAnimation(animation);
        });

        b_sequential.setOnClickListener(v -> {
            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.sequential);
            iv_sample.startAnimation(animation);
        });

        b_together.setOnClickListener(v -> {
            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.together);
            iv_sample.startAnimation(animation);
        });

        b_facebook.setOnClickListener(v -> {
            lottieAnimationView.setAnimation("facebook.json");
            lottieAnimationView.playAnimation();
        });

        b_youtube.setOnClickListener(v -> {
            lottieAnimationView.setAnimation("you_tube.json");
            lottieAnimationView.playAnimation();
        });

        b_twitter.setOnClickListener(v -> {
            lottieAnimationView.setAnimation("twitter.json");
            lottieAnimationView.playAnimation();
        });
    }
}