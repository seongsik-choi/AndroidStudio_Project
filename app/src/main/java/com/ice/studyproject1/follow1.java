package com.ice.studyproject1;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

// 이론 자바코드
public class follow1 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.follow1);
        setTitle("예제");

        // 하단바 홈버튼
        final ImageButton homekey = (ImageButton) findViewById(R.id.homekey);
        homekey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}

  /* Toast.makeText(getApplicationContext(),"검색해서 선택하세요",
                        Toast.LENGTH_SHORT).show();*/
