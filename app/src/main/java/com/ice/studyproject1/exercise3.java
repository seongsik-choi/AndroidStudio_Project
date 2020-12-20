package com.ice.studyproject1;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.ice.studyproject1.R;

public class exercise3 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exercise3);
        final CheckBox cb1 = (CheckBox)findViewById(R.id.checkBox1);
        final CheckBox cb2 = (CheckBox)findViewById(R.id.checkBox2);
        final CheckBox cb3 = (CheckBox)findViewById(R.id.checkBox3);
        final CheckBox cb4 = (CheckBox)findViewById(R.id.checkBox4);
        final CheckBox cb5 = (CheckBox)findViewById(R.id.checkBox5);
        final CheckBox cb6 = (CheckBox)findViewById(R.id.checkBox6);
        final CheckBox cb7 = (CheckBox)findViewById(R.id.checkBox7);
        final CheckBox cb8 = (CheckBox)findViewById(R.id.checkBox8);
        final CheckBox cb9 = (CheckBox)findViewById(R.id.checkBox9);
        final CheckBox cb10 = (CheckBox)findViewById(R.id.checkBox10);
        final CheckBox cb11 = (CheckBox)findViewById(R.id.checkBox11);
        final CheckBox cb12 = (CheckBox)findViewById(R.id.checkBox12);

//1 3 6 8 9 11
        Button b = (Button)findViewById(R.id.button1);
        Button b1 = (Button)findViewById(R.id.check);

        final TextView tv1 = (TextView)findViewById(R.id.textview3);
        b.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if(cb1.isChecked()==true && cb2.isChecked()==false && cb3.isChecked()==true &&cb4.isChecked()==false &&cb5.isChecked()==false&&cb6.isChecked()==true&&cb7.isChecked()==false
                        &&cb8.isChecked()==true&&cb9.isChecked()==true&&cb10.isChecked()==false&&cb12.isChecked()==true&&cb11.isChecked()==false){
                    tv1.setText("정답입니다!!\n홈으로 돌아가주세요");
                    tv1.setTextSize(30);

                }
                else{
                    tv1.setText("정답이 아닙니다.");
                    tv1.setTextSize(20);

                }

            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"1. (1), 2. (1), 3. (2), 4. (2), 5. (1), 6. (2)",Toast.LENGTH_SHORT).show();
            }
        });
        ImageButton homekey = (ImageButton)findViewById(R.id.homekey);
        homekey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    } // end onCreate()



}