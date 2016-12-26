package com.example.safirshahbaaz.sunshine_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView weatherData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        weatherData = (TextView) findViewById(R.id.tv_weather_data);
        String [] weatherArray = {"There", "Is", "No", "Fate", "But", "What", "We", "Make"};

        for(String data : weatherArray) {
            weatherData.append(data + "\n\n\n");
        }
    }
}
