package com.vitamin.wecantalk.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.vitamin.wecantalk.POJO.CommunityRoomListViewPOJO;
import com.vitamin.wecantalk.R;

import java.util.ArrayList;

import jp.wasabeef.glide.transformations.CropCircleTransformation;

/**
 * Created by JongHwa on 2018-04-17.
 */

public class CommunityRoomListViewAdapter extends BaseAdapter{

    private ArrayList<CommunityRoomListViewPOJO> list;

    public CommunityRoomListViewAdapter(ArrayList<CommunityRoomListViewPOJO> list){
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        Context mContext = viewGroup.getContext();

        if (view == null) {
            LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            if(list.get(i).getWhere() == 1) {
                view = inflater.inflate(R.layout.prefab_community_room_listview_receive, viewGroup, false);

                ImageView img = view.findViewById(R.id.prefab_community_room_receive_img);
                TextView name = view.findViewById(R.id.prefab_community_room_receive_name);
                TextView msg = view.findViewById(R.id.prefab_community_room_receive_msg);
                TextView time = view.findViewById(R.id.prefab_community_room_receive_time);

                Glide.with(mContext)
                        .load(list.get(i).getImg())
                        .centerCrop()
                        .bitmapTransform(new CropCircleTransformation(mContext))
                        .into(img);

                name.setText(list.get(i).getName());
                msg.setText(list.get(i).getMsg());
                time.setText(list.get(i).getTime());
            }
            else{
                view = inflater.inflate(R.layout.prefab_community_room_listview_send, viewGroup, false);

                TextView msg = view.findViewById(R.id.prefab_community_room_send_msg);
                TextView time = view.findViewById(R.id.prefab_community_room_send_time);

                msg.setText(list.get(i).getMsg());
                time.setText(list.get(i).getTime());
            }
        }

        return view;
    }

    public void addList(CommunityRoomListViewPOJO pojo){
        list.add(pojo);
        notifyDataSetChanged();
    }
}
