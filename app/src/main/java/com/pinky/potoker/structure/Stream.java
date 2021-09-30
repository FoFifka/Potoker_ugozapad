package com.pinky.potoker.structure;

import android.util.Log;
import android.widget.Switch;

import com.pinky.potoker.R;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class Stream {
    public int id;
    public String name;
    public Lesson[] lessons;


    public Stream(int id) {
        this.id = id;
        this.name = getName();
        this.lessons = getLessons();
    }

    private Lesson[] getLessons() {
        switch (this.id) {
            case 1:



                Params.startTimel1 = setTime(9,0);   // 9:00 - начало урока
                Params.endTimel1 = setTime(9,45);    // 9:45 - конец урока
                Params.startTimel2 = setTime(9,50);  // 9:50 - начало урока
                Params.endTimel2 = setTime(10,35);   // 10:35 - конец урока
                Params.startTimel3 = setTime(11,5);  // 11:05 - начало урока
                Params.endTimel3 = setTime(11,50);   // 15:50 - конец урока
                Params.startTimel4 = setTime(11,55); // 11:55 - начало урока
                Params.endTimel4 = setTime(12,40);   // 12:40 - конец урока
                Params.startTimel5 = setTime(12,50); // 12:50 - начало урока
                Params.endTimel5 = setTime(13,35);   // 13:35 - конец урока
                Params.startTimel6 = setTime(13,40); // 13:40 - начало урока
                Params.endTimel6 = setTime(14,25);   // 14:25 - конец урока
                Params.startTimel7 = setTime(14,35); // 14:35 - начало урока
                Params.endTimel7 = setTime(15,15);   // 15:15 - конец урока
                Params.startTimel8 = setTime(15,25); // 15:25 - начало урока
                Params.endTimel8 = setTime(16,10);   // 16:10 - конец урока
                //Params.startTimel9 = setTime(15,25); // 15:25 - начало урока
                //Params.endTimel9 = setTime(16,10);
               // Params.startTimel10 = setTime(15,25); // 15:25 - начало урока
                //Params.endTimel10 = setTime(16,10);

                break;
            case 2:
                Params.startTimel1 = setTime(9,0);   // 9:00 - начало урока
                Params.endTimel1 = setTime(9,45);    // 9:45 - конец урока
                Params.startTimel2 = setTime(9,50);  // 9:50 - начало урока
                Params.endTimel2 = setTime(10,35);
                Params.startTimel3 = setTime(10,45); // 10:45 - начало урока
                Params.endTimel3 = setTime(11,30);
                Params.startTimel4 = setTime(11,35); // 11:35 - начало урока
                Params.endTimel4 = setTime(12,25);
                Params.startTimel5 = setTime(12,50); // 12:50 - начало урока
                Params.endTimel5 = setTime(13,35);
                Params.startTimel6 = setTime(13,40); // 13:40 - начало урока
                Params.endTimel6 = setTime(14,25);
                Params.startTimel7 = setTime(14,35); // 14:35 - начало урока
                Params.endTimel7 = setTime(15,15);
                Params.startTimel8 = setTime(15,25); // 15:25 - начало урока
                Params.endTimel8 = setTime(16,10);
                //Params.startTimel9 = setTime(15,25); // 15:25 - начало урока
                //Params.endTimel9 = setTime(16,10);
                //Params.startTimel10 = setTime(15,25); // 15:25 - начало урока
                //Params.endTimel10 = setTime(16,10);
                break;
            case 3:
                Params.startTimel1 = setTime(9,0);  // 9:00 - начало урока
                Params.endTimel1 = setTime(9,45);
                Params.startTimel2 = setTime(9,50); // 9:50 - начало урока
                Params.endTimel2 = setTime(10,35);
                Params.startTimel3 = setTime(10,45); // 10:45 - начало урока
                Params.endTimel3 = setTime(11,30);
                Params.startTimel4 = setTime(11,35); // 11:35 - начало урока
                Params.endTimel4 = setTime(12,20);
                Params.startTimel5 = setTime(12,30); // 12:30 - начало урока
                Params.endTimel5 = setTime(13,15);
                Params.startTimel6 = setTime(13,20); // 13:20 - начало урока
                Params.endTimel6 = setTime(14,05);
                Params.startTimel7 = setTime(14,35); // 14:35 - начало урока
                Params.endTimel7 = setTime(15,15);
                Params.startTimel8 = setTime(15,25); // 15:25 - начало урока
                Params.endTimel8 = setTime(16,10);
                break;
            case 4:
                Params.startTimel1 = setTime(9,30);  // 9:30 - начало урока
                Params.endTimel1 = setTime(10,15);
                Params.startTimel2 = setTime(10,20); // 10:20 - начало урока
                Params.endTimel2 = setTime(11,5);
                Params.startTimel3 = setTime(11,35); // 11:35 - начало урока
                Params.endTimel3 = setTime(12,20);
                Params.startTimel4 = setTime(12,25); // 12:25 - начало урока
                Params.endTimel4 = setTime(13,10);
                Params.startTimel5 = setTime(13,20); // 13:20 - начало урока
                Params.endTimel5 = setTime(14,5);
                Params.startTimel6 = setTime(14,10); // 14:10 - начало урока
                Params.endTimel6 = setTime(14,55);
                Params.startTimel7 = setTime(15,5); // 15:05 - начало урока
                Params.endTimel7 = setTime(15,50);
                Params.startTimel8 = setTime(15,55); // 15:55 - начало урока
                Params.endTimel8 = setTime(16,40);
                break;
            case 5:
                Params.startTimel1 = setTime(9,30);  // 9:30 - начало урока
                Params.endTimel1 = setTime(10,15);
                Params.startTimel2 = setTime(10,20); // 10:20 - начало урока
                Params.endTimel2 = setTime(11,5);
                Params.startTimel3 = setTime(11,15); // 11:35 - начало урока
                Params.endTimel3 = setTime(12,0);
                Params.startTimel4 = setTime(12,5); // 12:05 - начало урока
                Params.endTimel4 = setTime(12,50);
                Params.startTimel5 = setTime(13,20); // 13:20 - начало урока
                Params.endTimel5 = setTime(14,5);
                Params.startTimel6 = setTime(14,10); // 15:10 - начало урока
                Params.endTimel6 = setTime(14,55);
                Params.startTimel7 = setTime(15,5); // 15:05 - начало урока
                Params.endTimel7 = setTime(15,50);
                Params.startTimel8 = setTime(15,55); // 15:55 - начало урока
                Params.endTimel8 = setTime(16,40);
                break;
            case 6:
                Params.startTimel1 = setTime(9,30);  // 9:30 - начало урока
                Params.endTimel1 = setTime(10,15);
                Params.startTimel2 = setTime(10,20); // 10:20 - начало урока
                Params.endTimel2 = setTime(11,5);
                Params.startTimel3 = setTime(11,15); // 11:15 - начало урока
                Params.endTimel3 = setTime(12,0);
                Params.startTimel4 = setTime(12,5); // 12:05 - начало урока
                Params.endTimel4 = setTime(12,50);
                Params.startTimel5 = setTime(13,0);                 // 13:00 - начало урока
                Params.endTimel5 = setTime(13,45);
                Params.startTimel6 = setTime(13,55); // 13:55 - начало урока
                Params.endTimel6 = setTime(14,35);
                Params.startTimel7 = setTime(15,5); // 15:05 - начало урока
                Params.endTimel7 = setTime(15,50);
                Params.startTimel8 = setTime(15,55); // 15:55 - начало урока
                Params.endTimel8 = setTime(16,40);
                break;

            case 7:
                Params.startTimel1 = setTime(9,0);   //
                Params.endTimel1 = setTime(9,30);    //
                Params.startTimel2 = setTime(9,40);  //
                Params.endTimel2 = setTime(10,10);   //
                Params.startTimel3 = setTime(10,20);  //
                Params.endTimel3 = setTime(10,50);   //
                Params.startTimel4 = setTime(11,0); //
                Params.endTimel4 = setTime(11,30);   //
                Params.startTimel5 = setTime(11,50); //
                Params.endTimel5 = setTime(12,20);   //
                Params.startTimel6 = setTime(12,30); //
                Params.endTimel6 = setTime(13,0);   //
                Params.startTimel7 = setTime(13,10); //
                Params.endTimel7 = setTime(13,40);   //
                Params.startTimel8 = setTime(13,50); //
                Params.endTimel8 = setTime(14,20); //
                Params.startTimel9 = setTime(14,30); //
                Params.endTimel9 = setTime(15,0);  //
                Params.startTimel10 = setTime(15,10); //
                Params.endTimel10 = setTime(15,40);//
                break;
            default:
                break;
        }
        return null;
    }

    private String getName() {
        switch (this.id) {
            case 1:
                return "Первый поток";
            case 2:
                return "Второй поток";
            case 3:
                return "Третий поток";
            case 4:
                return "Четвёртый поток";
            case 5:
                return "Пятый поток";
            case 6:
                return "Шестой поток";
            case 7:
                return "Короткое расписание";
            default:
                return "Ошибка!";
        }
    }
    private long setTime(int hour, int minute) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());

        if(hour < calendar.get(Calendar.HOUR_OF_DAY)) {
            calendar.set(Calendar.DAY_OF_MONTH, calendar.get(Calendar.DAY_OF_MONTH) + 1);
        } else if (hour == calendar.get(Calendar.HOUR_OF_DAY)) {
            if(minute < calendar.get(Calendar.MINUTE)) {
                calendar.set(Calendar.DAY_OF_MONTH, calendar.get(Calendar.DAY_OF_MONTH) + 1);
            }
        }



        calendar.set(Calendar.HOUR_OF_DAY, hour);
        calendar.set(Calendar.MINUTE, minute);


        return calendar.getTimeInMillis();
    }


}
