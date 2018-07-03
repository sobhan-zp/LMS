package com.lms.zp.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.support.design.widget.Snackbar;

import com.lms.zp.R;
import com.lms.zp.ShowPdfActivity;

/**
 * Created by kundan on 10/26/2015.
 */
public class RecyclerAdapter_Jozve extends RecyclerView.Adapter<RecyclerAdapter_Jozve.ViewHolder> {


    private String[] titles =

            {

            "آموزش Icdl ",
            "مالیات بر ارزش افزوده",
            "آموزش حسابداری",
            "آموزش فتوشاپ",

            };

    private Context mContext;





    class ViewHolder extends RecyclerView.ViewHolder{

        public int currentItem;
        public ImageView itemImage;
        public TextView itemTitle;
        public LinearLayout llJozveRow;


        public ViewHolder(View itemView) {
            super(itemView);


            llJozveRow = (LinearLayout)itemView.findViewById(R.id.ll_jozve_row);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override public void onClick(View v) {
                    int position = getAdapterPosition();



                    Intent intent = new Intent(mContext, ShowPdfActivity.class);
                    mContext.startActivity(intent);




                    Snackbar.make(v, "Click detected on item " + position,
                            Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();

                }
            });

            itemTitle = (TextView)itemView.findViewById(R.id.tv_title_jozve);
        }
    }


    public RecyclerAdapter_Jozve(Context context) {
        this.mContext = context;
    }



    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.activity_jozve_row, viewGroup, false);
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