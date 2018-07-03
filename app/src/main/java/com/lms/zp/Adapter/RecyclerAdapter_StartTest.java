package com.lms.zp.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

import com.lms.zp.R;

/**
 * Created by kundan on 10/26/2015.
 */
public class RecyclerAdapter_StartTest extends RecyclerView.Adapter<RecyclerAdapter_StartTest.ViewHolder> {


    private String[] titles =

            {


            " - تخصیص دهنده منابع ومذاکره کننده در حوزه کدامیک از نقش ھای متفاوت مدیریت محسوب میگردد. ",

            " - درواقع بررسی میزان موثربودن اقدامات انجام شده براي دستیابی به اهداف از پیش تعیین شده است. ",

            " - توجه بر کل نگري وکلیت سیستم است و از روش قیاسی در تحلیل تغییر وتحولات شرایط محیطی استفاده می گردد ",

            };




    class ViewHolder extends RecyclerView.ViewHolder{

        public int currentItem;
        public TextView itemTitle;
        public CheckBox cbGozine_1_test , cbGozine_2_test ,cbGozine_3_test ;

        public ViewHolder(View itemView) {
            super(itemView);

            itemTitle = (TextView)itemView.findViewById(R.id.tv_title_vedio);

            cbGozine_1_test = (CheckBox)itemView.findViewById(R.id.cb_gozine_1_test);
            cbGozine_2_test = (CheckBox)itemView.findViewById(R.id.cb_gozine_2_test);
            cbGozine_3_test = (CheckBox)itemView.findViewById(R.id.cb_gozine_3_test);


        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.activity_start_test_row, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(v);




        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        viewHolder.itemTitle.setText(titles[i]);



    }

    @Override
    public int getItemCount() {
        return titles.length;
    }







}