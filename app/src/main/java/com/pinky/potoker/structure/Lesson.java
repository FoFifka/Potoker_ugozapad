package com.pinky.potoker.structure;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class Lesson {
    public int id;
    public long startTime;
    public long endTime;

    public Lesson(int id, long startTime, long endTime) {
        this.id = id;
        this.startTime = startTime;
        this.endTime = endTime;
    }
}
