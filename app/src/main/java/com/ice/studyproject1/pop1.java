package com.ice.studyproject1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class pop1 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pop1);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        Button hm = (Button)findViewById(R.id.hm);
        Button ad = (Button)findViewById(R.id.ad);
        Button OkBtn = (Button)findViewById(R.id.okBtn);
        // 도움말 팝업창 생성
        hm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(pop1.this, pop.class);
                startActivityForResult(intent, 1);
            }
        });
        // 개발자 정보 생성
        ad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(pop1.this, pop2.class);
                startActivityForResult(intent, 1);
            }
        });
    }
    public void mCancle(View v){
        finish();
    }
    // 바깥 크릭해도 닫히지 않게
    @Override
    public boolean onTouchEvent(MotionEvent event){
        if(event.getAction()==MotionEvent.ACTION_OUTSIDE){
            return false;
        }
        return true;
    }
    // 안드로이드 백버튼 막기
    @Override
    public void onBackPressed(){
        return;
    }
}
