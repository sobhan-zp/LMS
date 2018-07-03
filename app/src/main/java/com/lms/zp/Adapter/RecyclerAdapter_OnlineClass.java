package com.lms.zp.Adapter;

import android.support.design.widget.Snackbar;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.lms.zp.R;


public class RecyclerAdapter_OnlineClass extends RecyclerView.Adapter<RecyclerAdapter_OnlineClass.ViewHolder> {


    private String[] titles =

            {

            "آموزش Icdl ",
            "مالیات بر ارزش افزوده",
            "آموزش حسابداری",
            "آموزش فتوشاپ",

            };



    private String[] time =

            {

                    "9:30 الی 15 ",
                    "8:30 الی 11 ",
                    "14:30 الی 17 ",
                    "13 الی 15:30 ",


            };




    class ViewHolder extends RecyclerView.ViewHolder{

        public int currentItem;
        public TextView itemTitle;
        public TextView itemTime;
        public Button enterClass;

        public ViewHolder(View itemView) {
            super(itemView);

            itemTitle = (TextView)itemView.findViewById(R.id.tv_title_onlineClass);
            itemTime = (TextView)itemView.findViewById(R.id.tv_time_onlineClass);
            enterClass = (Button) itemView.findViewById(R.id.btn_enterClass_onlineClass);


            enterClass.setOnClickListener(new View.OnClickListener() {
                @Override public void onClick(View v) {
                    int position = getAdapterPosition();

                    Snackbar.make(v, "Click detected on item " + position,
                            Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();

                }
            });


        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.activity_onlice_class_row, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        viewHolder.itemTitle.setText(titles[i]);
        viewHolder.itemTime.setText(time[i]);
    }

    @Override
    public int getItemCount() {
        return titles.length;
    }

}