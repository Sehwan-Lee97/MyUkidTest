package com.example.myukidtest;


import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;


public class LoadingActivity extends AppCompatActivity {

    private ImageView logo;
    private static int splashTimeout = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading);

        logo = (ImageView) findViewById(R.id.logo);

        new Handler( ) . postDelayed (new   Runnable ( )   {
            @ Override
            public   void   run ( )   {
                Intent intent   =   new   Intent ( LoadingActivity . this , MainActivity . class ) ;
                startActivity ( intent ) ;
                finish ( ) ;
            }
        } , splashTimeout ) ;

        Animation myanim   =   AnimationUtils. loadAnimation ( this, R.anim.mysplashanimation ) ;
        logo.startAnimation( myanim );
    }




}
