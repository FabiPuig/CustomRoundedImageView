package com.example.fabian.customroundedimageview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView iv = (ImageView) findViewById( R.id.image_view);
        RoundedImageView iv2 = (RoundedImageView) findViewById( R.id.rounded_image_view );

        iv.setImageResource( R.drawable.jessica_parker_kennedy);
        iv2.setImageResource( R.drawable.jessica_parker_kennedy);
    }
}
