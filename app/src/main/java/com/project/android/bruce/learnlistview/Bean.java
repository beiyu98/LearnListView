package com.project.android.bruce.learnlistview;

import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by shuai on 2016/3/22.
 */
public class Bean {

    private int imgRes;
    private String title;
    private String content;

    public Bean(){}

    public Bean(int imgRes, String title, String content) {
        this.imgRes = imgRes;
        this.title = title;
        this.content = content;
    }

    public int getImgRes() {
        return imgRes;
    }

    public void setImgRes(int imgRes) {
        this.imgRes = imgRes;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
