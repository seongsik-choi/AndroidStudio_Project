package com.ice.studyproject1;
import android.app.Activity;
import android.app.Dialog;
import android.app.TabActivity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;


public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 예제 스피너 클릭시 각각의 예제 선택 가능
        Spinner spinner_field  = (Spinner) findViewById(R.id.spinner_field);
        spinner_field.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id)
            {
                if(position == 1)
                {
                    Intent intent;
                    intent = new Intent(getApplicationContext(), exercise1.class);
                    startActivity(intent);
                }
                else if(position ==2)
                {
                    Intent intent;
                    intent = new Intent(getApplicationContext(), exercise2.class);
                    startActivity(intent);
                }
                else if(position ==3)
                {
                    Intent intent;
                    intent = new Intent(getApplicationContext(), exercise3.class);
                    startActivity(intent);
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });

        // 이론 버튼 클릭시 이론 페이지로 이동
        Button eronpage = (Button)findViewById(R.id.eronpage);
        eronpage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent;
                intent = new Intent(getApplicationContext(), follow.class);
                startActivity(intent);
            }
        });
        // 백과사전 스피너 클릭시 각각의 이론 또는 예제 선택 가능
        Spinner spinner0 = (Spinner) findViewById(R.id.spinner0);
        spinner0.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id)
            {
                if(position == 1)
                {
                    Intent intent;
                    intent = new Intent(getApplicationContext(), dic.class);
                    startActivity(intent);
                }
                else if(position ==2)
                {
                    Intent intent;
                    intent = new Intent(getApplicationContext(), exercise1.class);
                    startActivity(intent);
                }
                else if(position ==3)
                {
                    Intent intent;
                    intent = new Intent(getApplicationContext(), exercise2.class);
                    startActivity(intent);
                }
                else if(position ==4)
                {
                    Intent intent;
                    intent = new Intent(getApplicationContext(), exercise3.class);
                    startActivity(intent);
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });

        // 커스텀 다이얼로그 생성
        final ImageButton setting = (ImageButton) findViewById(R.id.setting);
        setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent;
                intent = new Intent(getApplicationContext(), pop1.class);
                startActivity(intent);
            }
        });
    }
}
