package com.pinky.potoker.structure.lessonsReminders;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.pinky.potoker.structure.LessonNotification;
import com.pinky.potoker.structure.Params;

public class LessonReminder10end extends BroadcastReceiver {
    String title = "УРОК";
    String text = "Десятый урок закончился(Если он у вас есть)";

    LessonNotification ln = new LessonNotification();
    @Override
    public void onReceive(Context context, Intent intent) {
        ln.startNotification(context, title , text , Params.CHANNEL_1_ID, 20);
    }
}
