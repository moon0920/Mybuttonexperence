package com.mmj.www.mybuttonexperence;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView)findViewById(R.id.textview2);

    }
    public void onclickwidjet(View view){
        int id = view.getId();
        String text = ((Button)view).getText()+"로 가고싶습니다.".toString();
        textView.setText(text);

//        switch (view.getId()){
//            case R.id.btn1:
//                textView.setText(text);break;
//            case R.id.btn2:
//                textView.setText(text);break;
//            case R.id.btn3:
//                textView.setText(text);break;
//            case R.id.btn4:
//                textView.setText(text);break;
//            case R.id.btn5:
//                textView.setText(text);break;
//            case R.id.btn6:
//                textView.setText(text);break;
//            default:
//                text = "noting";
        }
    }


//public class MainActivity extends AppCompatActivity {
//
//    Button button;
//    TextView textView;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        textView = (TextView)findViewById(R.id.textView02);
//    }
//    public  void onclick(View view){
//        int id = view.getId();
//        String text = ((Button)view).getText().toString();
//        text = "내가 태어난곳은 " +text+ " 입니다";
//        textView.setText(text);
//
//
//
//    }
//}
