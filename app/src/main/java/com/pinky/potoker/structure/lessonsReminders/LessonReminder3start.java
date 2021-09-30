package com.pinky.potoker.structure.lessonsReminders;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.pinky.potoker.R;
import com.pinky.potoker.structure.LessonNotification;
import com.pinky.potoker.structure.Params;

public class LessonReminder3start extends BroadcastReceiver {
    String title = "УРОК";
    String text = "Третий урок начался";

    LessonNotification ln = new LessonNotification();
    @Override
    public void onReceive(Context context, Intent intent) {
        ln.startNotification(context, title , text , Params.CHANNEL_1_ID, 5);
    }
}
