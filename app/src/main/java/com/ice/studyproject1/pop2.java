package com.ice.studyproject1;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class pop2 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pop2);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        // 상태바 제거
        Button OkBtn = (Button)findViewById(R.id.okBtn);
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
