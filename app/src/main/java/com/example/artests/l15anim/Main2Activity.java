package com.example.artests.l15anim;

import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Switch;

public class Main2Activity extends AppCompatActivity {
    private Animation mSunRiseAnimation;
    private Animation mClockRiseAnimation;
    private Animation mClockHRiseAnimation;
    private ImageView mSunImageView;
    private ImageView mClockImageView;
    private ImageView mClockHImageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setNavigationIcon(R.drawable.ic);
        setSupportActionBar(toolbar);



        //Get link on Sun
        mSunImageView = (ImageView) findViewById(R.id.idSun);
        //Animation for sunrise
        mSunRiseAnimation = AnimationUtils.loadAnimation(this, R.anim.sun_rise);
        //Link animation to necessary View
        mSunImageView.startAnimation(mSunRiseAnimation);

        //Get link on clock
        mClockImageView = (ImageView) findViewById(R.id.clock);
        //Animation for clock
        mClockRiseAnimation = AnimationUtils.loadAnimation(this, R.anim.clock_turn);
        //Link animation to necessary View
        mClockImageView.startAnimation(mClockRiseAnimation);

        //Get link on clockH
        mClockHImageView = (ImageView) findViewById(R.id.clockH);
        //Animation for clockH
        mClockHRiseAnimation = AnimationUtils.loadAnimation(this, R.anim.clock_hour_turn);
        //Link animation to necessary View
        mClockHImageView.startAnimation(mClockHRiseAnimation);

        }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main2, menu);
        return true;
    }

}
