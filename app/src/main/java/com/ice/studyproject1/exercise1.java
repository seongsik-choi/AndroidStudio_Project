package com.ice.studyproject1;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.GlideDrawableImageViewTarget;
import com.ice.studyproject1.R;

import org.w3c.dom.Text;

public class exercise1 extends Activity {

    Button btn,btn11;

    int result=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.exercise1);

        final RadioGroup rgo1=(RadioGroup)findViewById(R.id.rgo1);
        final RadioButton rdo1=(RadioButton)findViewById(R.id.visible);
        final RadioButton rdo2=(RadioButton)findViewById(R.id.gone);
        final RadioButton rdo3=(RadioButton)findViewById(R.id.invisible);

        final RadioGroup rgo2=(RadioGroup)findViewById(R.id.rgo2);
        final RadioButton rdo4=(RadioButton)findViewById(R.id.radiobutton);
        final RadioButton rdo5=(RadioButton)findViewById(R.id.CompundButton);
        final RadioButton rdo6=(RadioButton)findViewById(R.id.CheckBox);

        final RadioGroup rgo3=(RadioGroup)findViewById(R.id.rgo3);
        final RadioButton rdo7=(RadioButton)findViewById(R.id.visible1);
        final RadioButton rdo8=(RadioButton)findViewById(R.id.gone1);
        final RadioButton rdo9=(RadioButton)findViewById(R.id.invisible1);




        final TextView tv = (TextView)findViewById(R.id.textView2);
        final TextView tv1 =(TextView)findViewById(R.id.textView3);
        final TextView tv3 = (TextView)findViewById(R.id.textView4);

        rgo1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if(checkedId==R.id.gone){
                    tv.setText("정답입니다. 다음문제를 풀어주세요");
                    rgo2.setVisibility(View.VISIBLE);
                    TextView tv2 = (TextView)findViewById(R.id.anw2);
                    tv2.setVisibility(View.VISIBLE);

                    rdo1.setClickable(false);
                    rdo3.setClickable(false);

                }
                else{
                    tv.setText("오답입니다 다시 풀어주세요");
                    result = result +1;
                }
            }
        });

        rgo2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if(checkedId==R.id.radiobutton){
                    tv1.setText("정답입니다. 다음문제를 풀어주세요");
                    tv.setVisibility(View.INVISIBLE);
                    rgo3.setVisibility(View.VISIBLE);
                    TextView tv5 = (TextView)findViewById(R.id.anw3);
                    tv5.setVisibility(View.VISIBLE);
                    rdo5.setClickable(false);
                    rdo6.setClickable(false);
                }
                else{
                    tv1.setText("오답입니다 다시 풀어주세요");
                    result = result +1;
                }
            }
        });

        rgo3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.gone1){
                    tv3.setText("모든 문제를 맞추셨습니다. \n 홈으로 돌아가주세요. \n 총 "+ result + "번 틀렸습니다.");
                    tv3.setTextSize(20);
                    rdo7.setClickable(false);
                    rdo9.setClickable(false);
                    tv1.setVisibility(View.INVISIBLE);
                }
                else{
                    tv3.setTextSize(20);
                    tv3.setText("오답입니다. 다시 풀어주세요");
                    result = result +1;
                }
            }
        });

        // rgo3.setOnCheckedChangeListener();

        ImageView btnex = (ImageView) findViewById(R.id.btnex1);
        GlideDrawableImageViewTarget gifImage = new GlideDrawableImageViewTarget(btnex);
        Glide.with(this).load(R.drawable.btnex1).into(gifImage);

        ImageButton homekey = (ImageButton)findViewById(R.id.homekey);
        homekey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });








       /* rgo1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch(checkedId){
                    case R.id.visible:
                       // Toast.makeText(getApplicationContext(), "확인", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.invisible:
                     //   Toast.makeText(getApplicationContext(), "확인", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.gone:
                     //   Toast.makeText(getApplicationContext(), "확인", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });*/
      /*  btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(rdo1.isSelected()) {
                    Toast.makeText(getApplicationContext(), "종료", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(getApplicationContext(), "확인", Toast.LENGTH_SHORT).show();

                }
            }
        });버튼 클릭 리스너 다음에 */

        /*   btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = rgo1.getCheckedRadioButtonId();
                RadioButton rb = (RadioButton)findViewById(id);
                tv.setText(rb.getText().toString());
                if (rb. == "gone"){
                    Toast.makeText(getApplicationContext(), "확인", Toast.LENGTH_SHORT).show();
                }
            }
        });*/

    }

}