package com.pinky.potoker;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import com.pinky.potoker.structure.Params;
import com.pinky.potoker.structure.Stream;
import com.pinky.potoker.structure.lessonsReminders.LessonReminder10end;
import com.pinky.potoker.structure.lessonsReminders.LessonReminder10start;
import com.pinky.potoker.structure.lessonsReminders.LessonReminder1end;
import com.pinky.potoker.structure.lessonsReminders.LessonReminder1start;
import com.pinky.potoker.structure.lessonsReminders.LessonReminder2end;
import com.pinky.potoker.structure.lessonsReminders.LessonReminder2start;
import com.pinky.potoker.structure.lessonsReminders.LessonReminder3end;
import com.pinky.potoker.structure.lessonsReminders.LessonReminder3start;
import com.pinky.potoker.structure.lessonsReminders.LessonReminder4end;
import com.pinky.potoker.structure.lessonsReminders.LessonReminder4start;
import com.pinky.potoker.structure.lessonsReminders.LessonReminder5end;
import com.pinky.potoker.structure.lessonsReminders.LessonReminder5start;
import com.pinky.potoker.structure.lessonsReminders.LessonReminder6end;
import com.pinky.potoker.structure.lessonsReminders.LessonReminder6start;
import com.pinky.potoker.structure.lessonsReminders.LessonReminder7end;
import com.pinky.potoker.structure.lessonsReminders.LessonReminder7start;
import com.pinky.potoker.structure.lessonsReminders.LessonReminder8end;
import com.pinky.potoker.structure.lessonsReminders.LessonReminder8start;
import com.pinky.potoker.structure.lessonsReminders.LessonReminder9end;
import com.pinky.potoker.structure.lessonsReminders.LessonReminder9start;

import java.text.DateFormat;
import java.util.Date;

public class Schedule extends AppCompatActivity {

    Stream stream;
    Switch aSwitch;


    TextView txt_lesson1_time, txt_lesson2_time,txt_lesson3_time,txt_lesson4_time,txt_lesson5_time,txt_lesson6_time,txt_lesson7_time,txt_lesson8_time,txt_lesson9_time,txt_lesson10_time;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shedule);
        aSwitch = (Switch) findViewById(R.id.switch1);
        txt_lesson1_time = (TextView) findViewById(R.id.shedule_lesson1_time);
        txt_lesson2_time = (TextView) findViewById(R.id.shedule_lesson2_time);
        txt_lesson3_time = (TextView) findViewById(R.id.shedule_lesson3_time);
        txt_lesson4_time = (TextView) findViewById(R.id.shedule_lesson4_time);
        txt_lesson5_time = (TextView) findViewById(R.id.shedule_lesson5_time);
        txt_lesson6_time = (TextView) findViewById(R.id.shedule_lesson6_time);
        txt_lesson7_time = (TextView) findViewById(R.id.shedule_lesson7_time);
        txt_lesson8_time = (TextView) findViewById(R.id.shedule_lesson8_time);
        txt_lesson9_time = (TextView) findViewById(R.id.shedule_lesson9_time);
        txt_lesson10_time = (TextView) findViewById(R.id.shedule_lesson10_time);

        getStream();
        processButton();

        aSwitch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(aSwitch.isChecked()) {

                    Toast.makeText(getApplicationContext(), R.string.notifications_on_text, Toast.LENGTH_SHORT).show();
                    addLessonReminder(1, LessonReminder1start.class, Params.startTimel1);
                    addLessonReminder(2, LessonReminder1end.class, Params.endTimel1);
                    addLessonReminder(3, LessonReminder2start.class, Params.startTimel2);
                    addLessonReminder(4, LessonReminder2end.class, Params.endTimel2);
                    addLessonReminder(5, LessonReminder3start.class, Params.startTimel3);
                    addLessonReminder(6, LessonReminder3end.class, Params.endTimel3);
                    addLessonReminder(7, LessonReminder4start.class, Params.startTimel4);
                    addLessonReminder(8, LessonReminder4end.class, Params.endTimel4);
                    addLessonReminder(9, LessonReminder5start.class, Params.startTimel5);
                    addLessonReminder(10, LessonReminder5end.class, Params.endTimel5);
                    addLessonReminder(11, LessonReminder6start.class, Params.startTimel6);
                    addLessonReminder(12, LessonReminder6end.class, Params.endTimel6);
                    addLessonReminder(13, LessonReminder7start.class, Params.startTimel7);
                    addLessonReminder(14, LessonReminder7end.class, Params.endTimel7);
                    addLessonReminder(15, LessonReminder8start.class, Params.startTimel8);
                    addLessonReminder(16, LessonReminder8end.class, Params.endTimel8);
                    if(stream.id == 7) {
                        addLessonReminder(17, LessonReminder9start.class, Params.startTimel9);
                        addLessonReminder(18, LessonReminder9end.class, Params.endTimel9);
                        addLessonReminder(19, LessonReminder10start.class, Params.startTimel10);
                        addLessonReminder(20, LessonReminder10end.class, Params.endTimel10);
                    }


                    SharedPreferences mySharedPreferences = getSharedPreferences(Params.SHARED_PREF_STREAM_SETTINGS, Context.MODE_PRIVATE);
                    mySharedPreferences.edit().putBoolean(Params.SHARED_PREF_NOTIFICATION_SWITCH, true).apply();




                } else {
                    Toast.makeText(getApplicationContext(), R.string.notifications_off_text, Toast.LENGTH_SHORT).show();

                    removeLessonReminder(1, LessonReminder1start.class);
                    removeLessonReminder(2, LessonReminder1end.class);
                    removeLessonReminder(3, LessonReminder2start.class);
                    removeLessonReminder(4, LessonReminder2end.class);
                    removeLessonReminder(5, LessonReminder3start.class);
                    removeLessonReminder(6, LessonReminder3end.class);
                    removeLessonReminder(7, LessonReminder4start.class);
                    removeLessonReminder(8, LessonReminder4end.class);
                    removeLessonReminder(9, LessonReminder5start.class);
                    removeLessonReminder(10, LessonReminder5end.class);
                    removeLessonReminder(11, LessonReminder6start.class);
                    removeLessonReminder(12, LessonReminder6end.class);
                    removeLessonReminder(13, LessonReminder7start.class);
                    removeLessonReminder(14, LessonReminder7end.class);
                    removeLessonReminder(15, LessonReminder8start.class);
                    removeLessonReminder(16, LessonReminder8end.class);
                    removeLessonReminder(17, LessonReminder9start.class);
                    removeLessonReminder(18, LessonReminder9end.class);
                    removeLessonReminder(19, LessonReminder10start.class);
                    removeLessonReminder(20, LessonReminder10end.class);

                    SharedPreferences mySharedPreferences = getSharedPreferences(Params.SHARED_PREF_STREAM_SETTINGS, Context.MODE_PRIVATE);
                    mySharedPreferences.edit().putBoolean(Params.SHARED_PREF_NOTIFICATION_SWITCH, false).apply();
                }
            }
        });

    }

    void getStream() {
        SharedPreferences mySharedPreferences = getSharedPreferences(Params.SHARED_PREF_STREAM_SETTINGS, Context.MODE_PRIVATE);
        int stream = mySharedPreferences.getInt(Params.SHARED_PREF_STREAM, -1);
        aSwitch.setChecked(mySharedPreferences.getBoolean(Params.SHARED_PREF_NOTIFICATION_SWITCH, false));

        if (stream == -1) {
            startActivity(new Intent(this, ChooseStream.class));
        } else {
            this.stream = new Stream(stream);
            iniSchedule();
        }
    }

    void iniSchedule() {
        TextView title = findViewById(R.id.schedule_title);
        title.setText(stream.name);


        generateSchedule();
    }

    void generateSchedule() {
        txt_lesson1_time.append(DateFormat.getTimeInstance(DateFormat.SHORT).format(Params.startTimel1) + " - " + DateFormat.getTimeInstance(DateFormat.SHORT).format(Params.endTimel1));
        txt_lesson2_time.append(DateFormat.getTimeInstance(DateFormat.SHORT).format(Params.startTimel2) + " - " + DateFormat.getTimeInstance(DateFormat.SHORT).format(Params.endTimel2));
        txt_lesson3_time.append(DateFormat.getTimeInstance(DateFormat.SHORT).format(Params.startTimel3) + " - " + DateFormat.getTimeInstance(DateFormat.SHORT).format(Params.endTimel3));
        txt_lesson4_time.append(DateFormat.getTimeInstance(DateFormat.SHORT).format(Params.startTimel4) + " - " + DateFormat.getTimeInstance(DateFormat.SHORT).format(Params.endTimel4));
        txt_lesson5_time.append(DateFormat.getTimeInstance(DateFormat.SHORT).format(Params.startTimel5) + " - " + DateFormat.getTimeInstance(DateFormat.SHORT).format(Params.endTimel5));
        txt_lesson6_time.append(DateFormat.getTimeInstance(DateFormat.SHORT).format(Params.startTimel6) + " - " + DateFormat.getTimeInstance(DateFormat.SHORT).format(Params.endTimel6));
        txt_lesson7_time.append(DateFormat.getTimeInstance(DateFormat.SHORT).format(Params.startTimel7) + " - " + DateFormat.getTimeInstance(DateFormat.SHORT).format(Params.endTimel7));
        txt_lesson8_time.append(DateFormat.getTimeInstance(DateFormat.SHORT).format(Params.startTimel8) + " - " + DateFormat.getTimeInstance(DateFormat.SHORT).format(Params.endTimel8));

        if(stream.id == 7) {
            txt_lesson9_time.append(DateFormat.getTimeInstance(DateFormat.SHORT).format(Params.startTimel9) + " - " + DateFormat.getTimeInstance(DateFormat.SHORT).format(Params.endTimel9));
            txt_lesson10_time.append(DateFormat.getTimeInstance(DateFormat.SHORT).format(Params.startTimel10) + " - " + DateFormat.getTimeInstance(DateFormat.SHORT).format(Params.endTimel10));
        } else {
            txt_lesson9_time.setVisibility(View.INVISIBLE);
            txt_lesson10_time.setVisibility(View.INVISIBLE);
        }
    }

    void processButton() {
        Button b = findViewById(R.id.re_stream_button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), ChooseStream.class));
                SharedPreferences mySharedPreferences = getSharedPreferences(Params.SHARED_PREF_STREAM_SETTINGS, Context.MODE_PRIVATE);
                mySharedPreferences.edit().putBoolean(Params.SHARED_PREF_NOTIFICATION_SWITCH, false).apply();
            }
        });
    }

    public void addLessonReminder(int code, Class Class, long time) {

        Intent intent = new Intent(this, Class);
        AlarmManager alarmManager = (AlarmManager) getSystemService(Context.ALARM_SERVICE);
        PendingIntent pendingIntent = PendingIntent.getBroadcast(this, code, intent, PendingIntent.FLAG_UPDATE_CURRENT);
        alarmManager.setInexactRepeating(AlarmManager.RTC_WAKEUP, time, AlarmManager.INTERVAL_DAY,
                pendingIntent);

    }
    public void removeLessonReminder(int code, Class Class) {
        Intent intent = new Intent(this, Class);
        AlarmManager alarmManager = (AlarmManager) getSystemService(Context.ALARM_SERVICE);
        PendingIntent pendingIntent = PendingIntent.getBroadcast(this, code, intent, PendingIntent.FLAG_UPDATE_CURRENT);
        alarmManager.cancel(pendingIntent);

    }
}