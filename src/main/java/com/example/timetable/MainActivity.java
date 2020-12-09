package com.example.timetable;

import androidx.appcompat.app.AppCompatActivity;
import java.io.*;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT); //어플리케이션을 세로로 고정

        final Button calandarButton = (Button) findViewById(R.id.calandarButton);
        final Button timetableButton = (Button) findViewById(R.id.timetableButton);
        final Button chatbotButton = (Button) findViewById(R.id.chatbotButton);
        final Button mailButton = (Button) findViewById(R.id.mailButton);
        final Button teamProjectButton = (Button) findViewById(R.id.teamProjectButton);
        final Button settingButton = (Button) findViewById(R.id.settingButton);

        //프래그먼트 화면전환(혹시나 해서 남김)
         /*FragmentManager fragmentManager= getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragment, new TimeTableFragment());
                fragmentTransaction.commit();*/


        calandarButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                calandarButton.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark)); //눌린 버튼 색깔 변화
                timetableButton.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                chatbotButton.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                mailButton.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                teamProjectButton.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                settingButton.setBackgroundColor(getResources().getColor(R.color.colorPrimary));

                Intent intent = new Intent(getApplicationContext(), CalandarActivity.class); //인텐트 화면 전환
                startActivity(intent);

            }
        });

        timetableButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                calandarButton.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                timetableButton.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark)); //눌린 버튼 색깔 변화
                chatbotButton.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                mailButton.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                teamProjectButton.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                settingButton.setBackgroundColor(getResources().getColor(R.color.colorPrimary));

                Intent intent = new Intent(getApplicationContext(), TimeTableActivity.class); //인텐트 화면 전환
                startActivity(intent);

            }
        });

        chatbotButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                calandarButton.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                timetableButton.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                chatbotButton.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark)); //눌린 버튼 색깔 변화
                mailButton.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                teamProjectButton.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                settingButton.setBackgroundColor(getResources().getColor(R.color.colorPrimary));

                Intent intent = new Intent(getApplicationContext(), ChatBotActivity.class); //인텐트 화면 전환
                startActivity(intent);

            }
        });

        mailButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                calandarButton.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                timetableButton.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                chatbotButton.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                mailButton.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark)); //눌린 버튼 색깔 변화
                teamProjectButton.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                settingButton.setBackgroundColor(getResources().getColor(R.color.colorPrimary));

                Intent intent = new Intent(getApplicationContext(), MailActivity.class); //인텐트 화면 전환
                startActivity(intent);

            }
        });

        teamProjectButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                calandarButton.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                timetableButton.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                chatbotButton.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                mailButton.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                teamProjectButton.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));//눌린 버튼 색깔 변화
                settingButton.setBackgroundColor(getResources().getColor(R.color.colorPrimary));

                Intent intent = new Intent(getApplicationContext(), TeamProjectActivity.class); //인텐트 화면 전환
                startActivity(intent);

            }
        });

        settingButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                calandarButton.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                timetableButton.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                chatbotButton.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                mailButton.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                teamProjectButton.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                settingButton.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));//눌린 버튼 색깔 변화

                Intent intent = new Intent(getApplicationContext(), SettingActivity.class); //인텐트 화면 전환
                startActivity(intent);
            }
        });

        }
}



