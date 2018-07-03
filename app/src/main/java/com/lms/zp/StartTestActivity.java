package com.lms.zp;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

import com.lms.zp.Adapter.RecyclerAdapter_StartTest;

public class StartTestActivity extends AppCompatActivity {


    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    RecyclerView.Adapter adapter;

    private Button btnSendStartTest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_test);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);


        btnSendStartTest = (Button)findViewById(R.id.btn_send_startTest);
        btnSendStartTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                AlertDialog alertDialog = new AlertDialog.Builder(StartTestActivity.this).create();
                alertDialog.setTitle("هشدار");
                alertDialog.setMessage("آیا از ارسال پاسخ آزمون اطمینان دارید؟");


                alertDialog.setButton(AlertDialog.BUTTON_POSITIVE, "خیر",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        });

                alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "بله",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(StartTestActivity.this, "نمره شما ارسال شد", Toast.LENGTH_SHORT).show();
                                dialog.dismiss();
                            }
                        });
                alertDialog.show();



            }
        });

        recyclerView =(RecyclerView) findViewById(R.id.recyclerview_startTest);


        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        adapter = new RecyclerAdapter_StartTest();
        recyclerView.setAdapter(adapter);



    }
}
