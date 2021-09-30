package com.pinky.potoker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import com.pinky.potoker.structure.Params;
import com.pinky.potoker.structure.Stream;

public class MainActivity extends AppCompatActivity {
    Stream stream;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getStream();

    }
    void getStream() {
        SharedPreferences mySharedPreferences = getSharedPreferences(Params.SHARED_PREF_STREAM_SETTINGS, Context.MODE_PRIVATE);
        int stream = mySharedPreferences.getInt(Params.SHARED_PREF_STREAM, -1);
        if (stream == -1) {
            startActivity(new Intent(this, ChooseStream.class));
        } else {
            this.stream = new Stream(stream);
            startActivity(new Intent(this, Schedule.class));
        }
    }
}