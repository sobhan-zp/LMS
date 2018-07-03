package com.lms.zp.Adapter;

import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.lms.zp.R;


public class RecyclerAdapter_Calculator extends RecyclerView.Adapter<RecyclerAdapter_Calculator.ViewHolder> {


    private String[] row =
            {
            "دوره icdl",
            "دوره تجارت الکترونیک",
            "دوره Cad",
            "دوره مالیات",
            };


    private String[] cal =
            {
            "2/5/97",
            "22/6/97",
            "12/5/97",
            "6/4/97",
            };


    private String[] time =
            {
            "9:30",
            "9:30",
            "9:30",
            "9:30",
            };


    private String[] finish =
            {
            "تمام شد",
            "تمام نشد",
            "تمام شد",
            "تمام نشد",
            };


    boolean iscolor = true;




    class ViewHolder extends RecyclerView.ViewHolder{

        public int currentItem;
        public TextView row , cal , time , filish;

        public Button enterClass;

        public ViewHolder(View itemView) {
            super(itemView);

            row = (TextView)itemView.findViewById(R.id.tv_row_cal);
            cal = (TextView)itemView.findViewById(R.id.tv_cal_cal);
            time = (TextView)itemView.findViewById(R.id.tv_time_cal);
            filish = (TextView)itemView.findViewById(R.id.tv_finish_cal);

            //enterClass = (Button) itemView.findViewById(R.id.btn_enterClass_onlineClass);





        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.activity_calculator_row, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(v);


        final LinearLayout layout = (LinearLayout)v.findViewById(R.id.ll_bg_row_cal);

        if(iscolor)
        {
            layout.setBackgroundColor(Color.GREEN);
            iscolor = false;
        }
        else
        {
            layout.setBackgroundColor(Color.LTGRAY);
            iscolor = true;
        }



        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        viewHolder.row.setText(row[i]);
        viewHolder.cal.setText(cal[i]);
        viewHolder.time.setText(time[i]);
        viewHolder.filish.setText(finish[i]);
    }

    @Override
    public int getItemCount() {
        return row.length;
    }

}