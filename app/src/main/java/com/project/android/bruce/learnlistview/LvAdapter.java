package com.project.android.bruce.learnlistview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by shuai on 2016/3/22.
 */
public class LvAdapter extends BaseAdapter {

    private List<Bean> beanList;
    private Context context;

    public LvAdapter(List<Bean> beanList,Context context) {
        this.beanList = beanList;
        this.context = context;
    }

    @Override
    public int getCount() {
        return beanList.size();
    }

    @Override
    public Object getItem(int position) {
        return beanList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder viewHolder;

        if (convertView == null){
            convertView = View.inflate(context,R.layout.cell,null);

            viewHolder = new ViewHolder();

            viewHolder.headImg = (ImageView) convertView.findViewById(R.id.head_img);
            viewHolder.titleTv = (TextView) convertView.findViewById(R.id.item_title);
            viewHolder.contentTv = (TextView) convertView.findViewById(R.id.item_content);

            convertView.setTag(viewHolder);
        }else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        viewHolder.headImg.setImageResource(beanList.get(position).getImgRes());
        viewHolder.titleTv.setText(beanList.get(position).getTitle());
        viewHolder.contentTv.setText(beanList.get(position).getContent());

        return convertView;
    }

    static class ViewHolder{
        ImageView headImg;
        TextView titleTv;
        TextView contentTv;
    }
}
