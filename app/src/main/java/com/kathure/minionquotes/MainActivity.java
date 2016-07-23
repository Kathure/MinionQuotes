package com.kathure.minionquotes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final YouTubeInitializationResult result = YouTubeApiServiceUtil.isYouTubeApiServiceAvailable(this);

        if (result != YouTubeInitializationResult.SUCCESS) {
            //If there are any issues we can show an error dialog.
            result.getErrorDialog(this, 0).show();
        //static {
            //addItem(new YouTubeVideo("qTSDL94_Y7M", "Best of Minions"));
            //addItem(new YouTubeVideo("J-uIVtgxHwY", "More on Minions"));
            //addItem(new YouTubeVideo("T09keZ78QVBs", "Minions Banana"));
        //}
        }
}
