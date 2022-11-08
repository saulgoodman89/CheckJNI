package com.keg.checkjni;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity {
    private EditText mInputNumEditBox = null;
    private Button mFunctionButton = null;
    private TextView mResultText = null;
    private TextView mJavaTimeText = null;
    private TextView mCTimeText = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mInputNumEditBox = findViewById(R.id.editbox);
        mFunctionButton = findViewById(R.id.button);
        mResultText = findViewById(R.id.result_txt);
        mJavaTimeText = findViewById(R.id.java_time_txt);
        mCTimeText = findViewById(R.id.c_time_txt);
        mFunctionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    int factorialNum = Integer.parseInt(mInputNumEditBox.getText().toString());
                    if(factorialNum<=0)
                        return;
                    calculateFactorial(factorialNum);
                }catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    private void calculateFactorial(int _factorialNum) {
            long sum = 0;
            long difftime = 0;
            long startTime = System.currentTimeMillis();
            Log.e("KEG","startTime : "+ startTime);
            for(int i=1; i<=_factorialNum; i++) {
                sum += i;
            }
            long endTime = System.currentTimeMillis();
            Log.e("KEG","endTime : "+ endTime);
            difftime = endTime-startTime;
           // difftime = TimeUnit.MILLISECONDS.toSeconds(endTime-startTime);
           // Log.e("KEG","difftime : "+ difftime);
            mResultText.setText(String.valueOf(sum));
            mJavaTimeText.setText(String.valueOf(difftime));
    }
}

