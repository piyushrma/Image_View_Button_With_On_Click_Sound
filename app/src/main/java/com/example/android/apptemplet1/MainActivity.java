package com.example.android.apptemplet1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.media.MediaPlayer;



public class MainActivity extends AppCompatActivity {
    ImageButton imgButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgButton =(ImageButton)findViewById(R.id.imagebuttontop);
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.sample);
        imgButton.setOnClickListener(new View.OnClickListener()
        {   @Override
            public void onClick(View v)
            {
                mp.start();
            }
        });
    }
}
