package com.example.toshi.layoutsample_20150701;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements OnClickListener {

    int[] layoutIdAry = {                 //
            R.layout._01_linear_1,          //
            R.layout._01_linear_2,          //
            R.layout._01_linear_3,          //
            R.layout._02_relative_1,        //
            R.layout._02_relative_2,        //
            R.layout._02_relative_3,        //
            R.layout._02_relative_4,        //
            R.layout._03_frame_1,           //
            R.layout._03_frame_2,           //
            R.layout._03_frame_3,           //
            R.layout._04_set_1,             //
            R.layout.practice_1_sample_img, //
            R.layout.practice_1             //
    };

    String[] buttonTextAry = {//
            "01_linear_1",      //
            "01_linear_2",      //
            "01_linear_3",      //
            "02_relative_1",    //
            "02_relative_2",    //
            "02_relative_3",    //
            "02_relative_4",    //
            "03_frame_1",       //
            "03_frame_2",       //
            "03_frame_3",       //
            "04_set_1",         //
            "practice_1(見本)",  //
            "practice_1"        //
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout._activity_index);
        LayoutParams lp = new LayoutParams(LayoutParams.MATCH_PARENT,
                LayoutParams.WRAP_CONTENT);
        LinearLayout ll = (LinearLayout) findViewById(R.id.linearLayout);
        for (int i = 0; i < layoutIdAry.length; i++) {
            Button b = new Button(this);
            b.setLayoutParams(lp);
            b.setText(buttonTextAry[i]);
            b.setTag(layoutIdAry[i]);
            b.setOnClickListener(this);
            ll.addView(b);
        }
    }

    @Override
    public void onClick(View v) {
        ((Button) v).setTextColor(Color.GRAY);
        Intent intent = new Intent(MainActivity.this,
                SubActivity.class);
        intent.putExtra("layout_id", (Integer) v.getTag());
        startActivity(intent);
    }
}
