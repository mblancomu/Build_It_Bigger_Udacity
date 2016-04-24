package com.manuelblanco.jokesandroidlib;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by manuel on 18/4/16.
 */
public class MainLibActivity extends AppCompatActivity {

    public final static String JOKE = "JOKE";
    private ImageView mAnimation;
    private float xCurrentPos, yCurrentPos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lib_main);

        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);

        toolbar.setTitle(R.string.title);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Intent intent = this.getIntent();
        mAnimation = (ImageView)findViewById(R.id.iv_anim);
        xCurrentPos = mAnimation.getLeft();
        yCurrentPos = mAnimation.getTop();

        String joke = intent.getStringExtra(JOKE);
        TextView textViewJoke = (TextView) findViewById(R.id.textview_joke);
        textViewJoke.setText(joke);

        animationView(mAnimation);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == android.R.id.home) {
            finish();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void animationView(final ImageView logoFocus){

        TranslateAnimation animation = new TranslateAnimation(0, 0, 0, 100);
        animation.setDuration(500);
        animation.setRepeatCount(5);
        animation.setFillAfter(false);

        logoFocus.startAnimation(animation);

    }

}
