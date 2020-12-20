package com.ice.studyproject1;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Spinner;

public class dic extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dic);
        setTitle("백과사전 페이지");
        final ImageView econ1 = (ImageView)findViewById(R.id.econ1);
        final ImageButton homekey = (ImageButton) findViewById(R.id.homekey);
        // 메인화면
        homekey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish(); }});
        // 이론 연계
        Spinner spinner3 = (Spinner) findViewById(R.id.spinner3);
        spinner3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id)
            {
                if(position == 1){
                          econ1.setImageResource(R.drawable.ex1);
                }
                else if(position == 2){
                    econ1.setImageResource(R.drawable.ex2);
                }
                else if(position == 3){
                    econ1.setImageResource(R.drawable.ex3);
                }
                else if(position == 4){
                    econ1.setImageResource(R.drawable.ex4);
                }
                else if(position == 5){
                    econ1.setImageResource(R.drawable.i12);
                }
                else if(position == 6){
                    econ1.setImageResource(R.drawable.i13);
                }
                else if(position == 7){
                    econ1.setImageResource(R.drawable.i14);
                }
                else if(position == 8){
                    econ1.setImageResource(R.drawable.i15);
                }
                else if(position == 9){
                    econ1.setImageResource(R.drawable.i16);
                }
                else if(position == 10){
                    econ1.setImageResource(R.drawable.i17);
                }
                else if(position == 11){
                    econ1.setImageResource(R.drawable.i18);
                }
                else if(position == 12){
                    econ1.setImageResource(R.drawable.i19);
                }
                else if(position == 13){
                    econ1.setImageResource(R.drawable.i20);
                }
                else if(position == 14){
                    econ1.setImageResource(R.drawable.i21);
                }
                else if(position == 15){
                    econ1.setImageResource(R.drawable.i22);
                }
                else if(position == 16){
                    econ1.setImageResource(R.drawable.i23);
                }
                else if(position == 17){
                    econ1.setImageResource(R.drawable.i24);
                }
                else if(position == 18){
                    econ1.setImageResource(R.drawable.i25);
                }
                else if(position == 19){
                    econ1.setImageResource(R.drawable.i26);
                }
                else if(position == 20){
                    econ1.setImageResource(R.drawable.i27);
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });

    }
}