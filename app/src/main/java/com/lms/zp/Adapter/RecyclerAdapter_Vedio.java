package com.lms.zp.Adapter;

import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.VideoView;

import com.lms.zp.R;

import fm.jiecao.jcvideoplayer_lib.JCVideoPlayerStandard;

/**
 * Created by kundan on 10/26/2015.
 */
public class RecyclerAdapter_Vedio extends RecyclerView.Adapter<RecyclerAdapter_Vedio.ViewHolder> {


    private String[] titles =

            {

            "ویدیو آموزشی ",

            "ویدیو آموزشی "

            };





    class ViewHolder extends RecyclerView.ViewHolder{

        public int currentItem;
        public TextView itemTitle;
        public VideoView vd;

        public ViewHolder(View itemView) {
            super(itemView);

            itemTitle = (TextView)itemView.findViewById(R.id.tv_title_vedio);


            JCVideoPlayerStandard jcVideoPlayerStandard = (JCVideoPlayerStandard)itemView.findViewById(R.id.videoplayer);
            jcVideoPlayerStandard.setUp("https://hw19.cdn.asset.aparat.com/aparat-video/372afc4a4272dc4b77288b4c3aff73ad10926540-240p__71704.mp4"
                    , JCVideoPlayerStandard.SCREEN_LAYOUT_NORMAL, "آموزش");


        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.activity_vedio_row, viewGroup, false);
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