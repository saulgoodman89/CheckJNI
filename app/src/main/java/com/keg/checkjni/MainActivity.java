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

    /*
        long 9223372036854775807
        9,223,372,036,854,775,807
        2,432,902,008,176,640,000

        2432902008176640000

        51090942171709440000

     */
    private void calculateFactorial(int _factorialNum) {
            long sum = 1;
            long difftime = 0;
            long startTime = System.currentTimeMillis();
            int count = 0;
            /*
            for(int i=1; i<=_factorialNum; i++) {
                sum += i;
               // Log.e("KEG","count : "+ i  + " value : "+ sum);
            }*/

            /*
            int count=0;
            for ( int  i = 0 ; i < 100000000 ; i++) {
                count ++;
            }*/

        for (int i = 0; i<10000000 ; i++) {
            count = count*2/3+5-1;
        }


        long endTime = System.currentTimeMillis();
            difftime = endTime-startTime;

            mResultText.setText(String.valueOf(sum));
            mJavaTimeText.setText(String.valueOf(difftime));
            Log.e("KEG","java Time : "+ difftime);
            long cTime = JniManager.checkFactorialFunctionTime(_factorialNum);
            mCTimeText.setText(String.valueOf(cTime));
            Log.e("KEG","c Time : "+ cTime);

            //2432902008176640000/
    }


}

