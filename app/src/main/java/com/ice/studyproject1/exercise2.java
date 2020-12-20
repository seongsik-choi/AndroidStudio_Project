package com.ice.studyproject1;
import android.app.Activity;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class exercise2 extends Activity {

    int result = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exercise2);
        final RadioGroup rgo1=(RadioGroup)findViewById(R.id.rgo1);
        final RadioButton rdo1=(RadioButton)findViewById(R.id.enabled);
        final RadioButton rdo2=(RadioButton)findViewById(R.id.clickable);
        final RadioButton rdo3=(RadioButton)findViewById(R.id.visibility);
        final RadioButton rdo4=(RadioButton)findViewById(R.id.padding);

        final RadioGroup rgo2 = (RadioGroup)findViewById(R.id.rgo2);
        final RadioButton rdo5=(RadioButton)findViewById(R.id.orientation);
        final RadioButton rdo6=(RadioButton)findViewById(R.id.gravity);
        final RadioButton rdo7=(RadioButton)findViewById(R.id.baselineAligned);
        final RadioButton rdo8=(RadioButton)findViewById(R.id.layout_height);

        final RadioGroup rgo3 = (RadioGroup)findViewById(R.id.rgo3);
        final RadioButton rdo9=(RadioButton)findViewById(R.id.LinearLayout);
        final RadioButton rdo10=(RadioButton)findViewById(R.id.RelativeLayout);
        final RadioButton rdo11=(RadioButton)findViewById(R.id.TableLayout);
        final RadioButton rdo12=(RadioButton)findViewById(R.id.GridLayout);

        final RadioGroup rgo4 = (RadioGroup)findViewById(R.id.rgo4);
        final RadioButton rdo13=(RadioButton)findViewById(R.id.vertical);
        final RadioButton rdo14=(RadioButton)findViewById(R.id.horizontal);
        final RadioButton rdo15=(RadioButton)findViewById(R.id.weight);
        final RadioButton rdo16=(RadioButton)findViewById(R.id.center);

        final TextView result1 = (TextView)findViewById(R.id.result1);
        final TextView result2 = (TextView)findViewById(R.id.result2);
        final TextView result3 = (TextView)findViewById(R.id.result3);
        final TextView result4 = (TextView)findViewById(R.id.result4);

        final TextView qu2 = (TextView)findViewById(R.id.qu2);
        final TextView qu3 = (TextView)findViewById(R.id.qu3);
        final TextView qu4 = (TextView)findViewById(R.id.qu42);
        final ImageView qu5 = (ImageView)findViewById(R.id.qu41);

        rgo1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.enabled){
                    result1.setText("정답입니다. 다음문제를 풀어주세요");
                    rdo2.setClickable(false);
                    rdo3.setClickable(false);
                    rdo4.setClickable(false);

                    qu2.setVisibility(View.VISIBLE);
                    rgo2.setVisibility(View.VISIBLE);
                }
                else{
                    result1.setText("오답입니다 다시 풀어주세요");
                    result = result+1;
                }
            }
        });
        rgo2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.layout_height){
                    result2.setText("정답입니다. 다음문제를 풀어주세요.");
                    result1.setVisibility(View.INVISIBLE);
                    rdo5.setClickable(false);
                    rdo6.setClickable(false);
                    rdo7.setClickable(false);

                    qu3.setVisibility(View.VISIBLE);
                    rgo3.setVisibility(View.VISIBLE);
                }
                else{
                    result2.setText("오답입니다 다시 풀어주세요");
                    result = result+1;
                }
            }
        });

        rgo3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.RelativeLayout){
                    result3.setText("정답입니다. 다음문제를 풀어주세요.");

                    result2.setVisibility(View.INVISIBLE);
                    rdo9.setClickable(false);
                    rdo11.setClickable(false);
                    rdo12.setClickable(false);

                    qu4.setVisibility(View.VISIBLE);
                    qu5.setVisibility(View.VISIBLE);
                    rgo4.setVisibility(View.VISIBLE);
                }
                else{
                    result3.setText("오답입니다 다시 풀어주세요");
                    result = result+1;
                }
            }
        });

        rgo4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.horizontal){
                    result4.setText("정답입니다. 홈으로 돌아가주세요 \n 총 "+ result + "번 틀렸습니다.");
                    result4.setTextSize(20);
                    result3.setVisibility(View.INVISIBLE);
                    rdo13.setClickable(false);
                    rdo16.setClickable(false);
                    rdo15.setClickable(false);
                }
                else{
                    result4.setText("오답입니다 다시 풀어주세요");
                    result = result+1;
                }
            }
        });
        ImageButton homekey = (ImageButton)findViewById(R.id.homekey);
        homekey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });



    }
}