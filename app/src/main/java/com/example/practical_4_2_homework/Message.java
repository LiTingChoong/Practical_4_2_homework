package com.example.practical_4_2_homework;

import android.content.Context;
import android.widget.Toast;

public class Message {
    public static void message(Context context, String msg){
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
    }
}
