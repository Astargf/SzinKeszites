package com.example.horvthattila.rgb_szin;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    SeekBar seekBar, seekBar2, seekBar3;
    TextView textView, textView2, textView3, colorView;

    int red = 0;
    int green = 0;
    int blue = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        seekBar = (SeekBar) findViewById(R.id.seekBar);
        seekBar.setMax(255);
        seekBar.setProgress(red);

        textView = (TextView) findViewById(R.id.textView);
        textView.setText("Red: " + red);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener(){
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                red = i;
                textView.setText("Red: " + red);
                colorView.setBackgroundColor(Color.rgb(red, green, blue));
                colorView.setText("(" + red + "," + green + "," + blue + ")");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        seekBar2 = (SeekBar) findViewById(R.id.seekBar2);
        seekBar2.setMax(255);
        seekBar2.setProgress(green);

        textView2 = (TextView) findViewById(R.id.textView2);
        textView2.setText("Green: " + green);

        seekBar2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener(){
            @Override
            public void onProgressChanged(SeekBar seekBar2, int j, boolean b) {
                green = j;
                textView2.setText("Green: " + green);
                colorView.setBackgroundColor(Color.rgb(red, green, blue));
                colorView.setText("(" + red + "," + green + "," + blue + ")");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        seekBar3 = (SeekBar) findViewById(R.id.seekBar3);
        seekBar3.setMax(255);
        seekBar3.setProgress(blue);

        textView3 = (TextView) findViewById(R.id.textView3);
        textView3.setText("Blue: " + blue);

        seekBar3.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener(){
            @Override
            public void onProgressChanged(SeekBar seekBar3, int k, boolean b) {
                blue = k;
                textView3.setText("Blue: " + blue);
                colorView.setBackgroundColor(Color.rgb(red, green, blue));
                colorView.setText("(" + red + "," + green + "," + blue + ")");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        colorView = (TextView) findViewById(R.id.colorView);
        //colorView.setTextColor(Color.rgb(red, green, blue));
        //colorView.setBackgroundColor(Color.rgb(red, green, blue));


    }
}
