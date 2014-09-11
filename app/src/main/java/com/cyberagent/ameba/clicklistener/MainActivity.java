package com.cyberagent.ameba.clicklistener;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends Activity {

    TextView touch_count;
    ImageView touch_image;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

        touch_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                countTouch();
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
//画面に触ったときのイベント
//    @Override
//    public boolean onTouchEvent(MotionEvent event){
//        int actionID = event.getAction();
//        switch(actionID){
//            case MotionEvent.ACTION_DOWN:
//            //タッチされたとき
////                countTouch();
//            case MotionEvent.ACTION_UP:
//            //指が離れたとき
//
//            case MotionEvent.ACTION_MOVE:
//            //指をタッチしたまま動かしたとき
//
//            case MotionEvent.ACTION_CANCEL:
//            //タッチがキャンセルされたとき
//
//        }
//
//        return false;
//    }

    public void initView(){
        //Viewの初期化(呼び出し)
        touch_count = (TextView)findViewById(R.id.touch_count);
        touch_count.setText(String.valueOf(count));

        touch_image = (ImageView)findViewById(R.id.touch_image);
    }

    public void countTouch(){
        //タッチカウント
        count += 1;
        touch_count.setText(String.valueOf(count));
    }
}
