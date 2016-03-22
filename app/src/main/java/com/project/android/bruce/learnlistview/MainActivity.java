package com.project.android.bruce.learnlistview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import butterknife.ButterKnife;
import butterknife.InjectView;

public class MainActivity extends AppCompatActivity {

    @InjectView(R.id.lv)
    ListView lv;

    private Bean mBean;

    private List<Bean> beanList;

    private LvAdapter lvAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);

        beanList = new ArrayList<>();

        int[] imgList = {R.drawable.cloudy_weather128,
                R.drawable.light_weather128,
                R.drawable.rain_weather128,
                R.drawable.sun_weather128,
                R.drawable.iconfontfanhui,
                R.drawable.iconfontfenleishousuo,
                R.drawable.iconfontsousuo,
                R.drawable.iconfontspinner32,
                R.drawable.iconfonttejia,
                R.drawable.iconfontweixin2};
        String[] titleList = {"cloudy","light","rain","sun","fanhui","fenlei","sousuo","spinner","tejia","weixin"};
        String[] contentList = {"cloudy","light","rain","sun","fanhui","fenlei","sousuo","spinner","tejia","weixin"};

        for (int i = 0; i < imgList.length; i++) {

            mBean = new Bean(imgList[i],titleList[i],contentList[i]);
            beanList.add(mBean);
        }

        lvAdapter = new LvAdapter(beanList,this);
        lv.setAdapter(lvAdapter);
    }
}
