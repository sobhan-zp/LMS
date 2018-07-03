package com.lms.zp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        findview();
    }




    public void mainOnclick(View v)
    {
        switch (v.getId())
        {
            case R.id.btn_onlineClass_main:
            {
                Intent intent = new Intent(this, OnliceClassActivity.class);
                startActivity(intent);
                break;
            }

            case R.id.btn_jozve_main:
            {
                Intent intent = new Intent(this, JozveActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.btn_cal_main:
            {
                Intent intent = new Intent(this, CalculatorActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.btn_vedio_main:
            {
                Intent intent = new Intent(this, VedioActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.btn_startTest_main:
            {
                Intent intent = new Intent(this, StartTestActivity.class);
                startActivity(intent);
                break;
            }
            default:
                break;
        }

    }




    private void findview() {
        //bottom navigation


    }


}
