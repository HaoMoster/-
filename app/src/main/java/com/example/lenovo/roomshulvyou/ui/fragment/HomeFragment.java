package com.example.lenovo.roomshulvyou.ui.fragment;

import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.example.lenovo.roomshulvyou.R;
import com.example.lenovo.roomshulvyou.base.BaseFragment;
import com.example.lenovo.roomshulvyou.ui.adapter.MyApterList;
import com.example.lenovo.roomshulvyou.ui.bean.Person;
import com.recker.flybanner.FlyBanner;
import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends BaseFragment implements View.OnClickListener {


//    private int[] mImagesUrl = {R.mipmap.banner1,R.mipmap.banner2,R.mipmap.banner2,R.mipmap.banner1};
    private ArrayList<Person> list;
    private ImageView img;
    private RecyclerView rv;
    private ImageView fen;
    private FlyBanner flybanner;
    private TextView remenluxian_tv;
    private RecyclerView recyclerview;
    private TextView daoyoufengcai_tv;
    private ImageView img1;
    private ImageView img2;
    private ImageView img3;
    private ImageView img4;
    private ImageView img5;
    private ListView lv;


    @Override
    protected void initView(View inflate) {
        flybanner = (FlyBanner) inflate.findViewById(R.id.flybanner);
        remenluxian_tv = (TextView) inflate.findViewById(R.id.remenluxian_tv);
        recyclerview = (RecyclerView) inflate.findViewById(R.id.recyclerview);
        daoyoufengcai_tv = (TextView) inflate.findViewById(R.id.daoyoufengcai_tv);
        img1 = (ImageView) inflate.findViewById(R.id.img1);
        img1.setOnClickListener(this);
        img2 = (ImageView) inflate.findViewById(R.id.img2);
        img2.setOnClickListener(this);
        img3 = (ImageView) inflate.findViewById(R.id.img3);
        img3.setOnClickListener(this);
        img4 = (ImageView) inflate.findViewById(R.id.img4);
        img4.setOnClickListener(this);
        img5 = (ImageView) inflate.findViewById(R.id.img5);
        img5.setOnClickListener(this);
        lv = (ListView) inflate.findViewById(R.id.lv);
    }

    @Override
    protected void initData() {
        List<Integer> images = new ArrayList<>();
        images.add(R.mipmap.banner1);
        images.add(R.mipmap.banner2);
        images.add(R.mipmap.banner2);
        images.add(R.mipmap.banner1);
        flybanner.setImages(images);
//        mBannerLocal.setPoinstPosition(FlyBanner.RIGHT);
//        List<String> imgesUrl = new ArrayList<>();
//        for (int i = 0; i < mImagesUrl.length; i++) {
//            imgesUrl.add(mImagesUrl[i]);
//        }
//        flybanner.setImagesUrl(imgesUrl);


        list = new ArrayList<Person>();
        for (int i = 0; i < 20; i++) {
            list.add(new Person("哈哈哈哈哈"));
        }
        MyApterList myApterList = new MyApterList(list, getContext());
        lv.setAdapter(myApterList);
    }

    @Override
    protected void updateTitleBar() {

    }

    @Override
    protected int layoutId() {
        return R.layout.fragment_home;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.img1:
                Toast.makeText(getContext(), "周边游", Toast.LENGTH_SHORT).show();
                break;
            case R.id.img2:
                Toast.makeText(getContext(), "摄影游", Toast.LENGTH_SHORT).show();

                break;
            case R.id.img3:
                Toast.makeText(getContext(), "周边游", Toast.LENGTH_SHORT).show();

                break;
            case R.id.img4:
                Toast.makeText(getContext(), "摄影游", Toast.LENGTH_SHORT).show();

                break;
            case R.id.img5:
                Toast.makeText(getContext(), "摄影游", Toast.LENGTH_SHORT).show();

                break;
        }
    }

}
