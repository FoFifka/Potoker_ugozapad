package com.pinky.potoker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.pinky.potoker.structure.Params;
import com.pinky.potoker.structure.Stream;

import java.util.ArrayList;

public class ChooseStream extends AppCompatActivity {

    public final Stream[] streams = new Stream[]{
            new Stream(1),
            new Stream(2),
            new Stream(3),
            new Stream(4),
            new Stream(5),
            new Stream(6),
            new Stream(7),
    };

    Stream choosenStream = null;

    final String[] streamNames() {
        ArrayList<String> names = new ArrayList<>();
        for (Stream s : streams) {
            names.add(s.name);
        }
        return names.toArray(new String[0]);
    }

    void setStream(Stream s) {
        Button b = findViewById(R.id.stream_confirm_button);
        b.setEnabled(s != null);
        b.setTextColor(getResources().getColor(R.color.white));
        this.choosenStream = s;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_stream);

        generateStreams();
        processButton();
    }

    void processButton() {
        Button b = findViewById(R.id.stream_confirm_button);
        b.setOnClickListener(v -> setupStream());
    }

    void setupStream() {
        SharedPreferences mySharedPreferences = getSharedPreferences(Params.SHARED_PREF_STREAM_SETTINGS, Context.MODE_PRIVATE);
        mySharedPreferences.edit().putInt(Params.SHARED_PREF_STREAM, choosenStream.id).apply();


        startActivity(new Intent(this, Schedule.class));
    }

    void generateStreams() {
        ListView streamList = findViewById(R.id.streams);
        streamList.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
        ListAdapter streamAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_single_choice, streamNames());
        streamList.setAdapter(streamAdapter);

        streamList.setOnItemClickListener((parent, view, position, id) -> {
            Stream s = streams[position];
            setStream(s);
        });
    }


}