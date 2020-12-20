package com.ice.studyproject1;
// 이론 자바코드
import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.ViewFlipper;

public class follow extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.follow);
        setTitle("이론");
        final ViewFlipper view2 = (ViewFlipper)findViewById(R.id.view2);
        final ViewFlipper view3 = (ViewFlipper)findViewById(R.id.view3);
        final ViewFlipper view4 = (ViewFlipper)findViewById(R.id.view4);
        final ViewFlipper view5 = (ViewFlipper)findViewById(R.id.view5);
        // 1주차
        final ImageView i1 = (ImageView)findViewById(R.id.i1);   final ImageView i2 = (ImageView)findViewById(R.id.i2);
        final ImageView i3 = (ImageView)findViewById(R.id.i3);  final ImageView i4 = (ImageView)findViewById(R.id.i4);
        // 2주차
        final ImageView i12 = (ImageView)findViewById(R.id.i12); final ImageView i13 = (ImageView)findViewById(R.id.i13);
        final ImageView i14 = (ImageView)findViewById(R.id.i14);    final ImageView i15= (ImageView)findViewById(R.id.i15);
        final ImageView i16 = (ImageView)findViewById(R.id.i16);
        // 3주차
        final ImageView i17 = (ImageView)findViewById(R.id.i17); final ImageView i18 = (ImageView)findViewById(R.id.i18);
        final ImageView i19 = (ImageView)findViewById(R.id.i19);    final ImageView i20= (ImageView)findViewById(R.id.i20);
        final ImageView i21 = (ImageView)findViewById(R.id.i21);
        // 4주차
        final ImageView i22 = (ImageView)findViewById(R.id.i22); final ImageView i24 = (ImageView)findViewById(R.id.i24);
        final ImageView i25 = (ImageView)findViewById(R.id.i25);    final ImageView i26= (ImageView)findViewById(R.id.i26);
        final ImageView i23 = (ImageView)findViewById(R.id.i23);    final ImageView i27 = (ImageView)findViewById(R.id.i27);

        final ImageButton homekey = (ImageButton) findViewById(R.id.homekey);
        final ImageButton next = (ImageButton) findViewById(R.id.next);
        final ImageButton previous = (ImageButton) findViewById(R.id.previous);


        homekey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        Spinner spinner1 = (Spinner) findViewById(R.id.spinner1);
        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id)
            {
                // 이미지 초기화
                i1.setVisibility(view.INVISIBLE);
                i12.setVisibility(View.INVISIBLE);
                i17.setVisibility(View.INVISIBLE);
                i22.setVisibility(View.INVISIBLE);
                if(position == 1)
                {
                    view2.setVisibility(View.VISIBLE);
                    view3.setVisibility(View.INVISIBLE);
                    view4.setVisibility(View.INVISIBLE);
                    view5.setVisibility(View.INVISIBLE);
                    i1.setVisibility(View.VISIBLE);
                    i12.setVisibility(View.INVISIBLE);
                    i17.setVisibility(View.INVISIBLE);
                    i22.setVisibility(View.INVISIBLE);
                    next.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            view2.showNext();
                        }
                    });
                    previous.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            view2.showPrevious();
                        }
                    });
                }
                // 2주차
                else if(position ==2) {
                    view2.setVisibility(View.INVISIBLE);
                    view3.setVisibility(View.VISIBLE);
                    view4.setVisibility(View.INVISIBLE);
                    view5.setVisibility(View.INVISIBLE);
                    i1.setVisibility(View.INVISIBLE);
                    i12.setVisibility(View.VISIBLE);
                    i17.setVisibility(View.INVISIBLE);
                    i22.setVisibility(View.INVISIBLE);
                    next.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            view3.showNext();
                        }
                    });
                    previous.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            view3.showPrevious();
                        }
                    });
                }
                // 3주차
                else if(position ==3) {
                    view2.setVisibility(View.INVISIBLE);
                    view3.setVisibility(View.INVISIBLE);
                    view4.setVisibility(View.VISIBLE);
                    view5.setVisibility(View.INVISIBLE);
                    i1.setVisibility(View.INVISIBLE);
                    i12.setVisibility(View.INVISIBLE);
                    i17.setVisibility(View.VISIBLE);
                    i22.setVisibility(View.INVISIBLE);
                    next.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            view4.showNext();
                        }
                    });
                    previous.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            view4.showPrevious();
                        }
                    });
                }
                // 4주차 이론
                else if(position ==4)
                {
                    view2.setVisibility(View.INVISIBLE);
                    view3.setVisibility(View.INVISIBLE);
                    view4.setVisibility(View.INVISIBLE);
                    view5.setVisibility(View.VISIBLE);
                    i1.setVisibility(View.INVISIBLE);
                    i12.setVisibility(View.INVISIBLE);
                    i17.setVisibility(View.INVISIBLE);
                    i22.setVisibility(View.VISIBLE);
                    next.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            view5.showNext();
                        }
                    });
                    previous.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            view5.showPrevious();
                        }
                    });
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
    }
}