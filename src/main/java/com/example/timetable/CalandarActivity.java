package com.example.timetable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.timetable.MainActivity.*;

public class CalandarActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calandar);
    }


   /* @Override
    public void onBackPressed(){ //뒤로가기 버튼이 눌렸을 때
        final LinearLayout main = (LinearLayout) View.inflate(CalandarActivity.this, R.layout.activity_main, null);

        main.findViewById(R.id.calandarButton).setBackgroundColor(getResources().getColor(R.color.colorPrimary));
        main.findViewById(R.id.timetableButton).setBackgroundColor(getResources().getColor(R.color.colorPrimary));
        main.findViewById(R.id.chatbotButton).setBackgroundColor(getResources().getColor(R.color.colorPrimary));
        main.findViewById(R.id.mailButton).setBackgroundColor(getResources().getColor(R.color.colorPrimary));
        main.findViewById(R.id.teamProjectButton).setBackgroundColor(getResources().getColor(R.color.colorPrimary));
        main.findViewById(R.id.settingButton).setBackgroundColor(getResources().getColor(R.color.colorPrimary));


    }*/

}