package com.example.lenovo.roomshulvyou.ui.activity;

import android.content.Intent;
import android.graphics.drawable.BitmapDrawable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.example.lenovo.roomshulvyou.R;
import com.example.lenovo.roomshulvyou.base.BaseActivity;
import com.example.lenovo.roomshulvyou.ui.fragment.OrderFragment;
import com.example.lenovo.roomshulvyou.ui.fragment.PersonalFragment;
import com.example.lenovo.roomshulvyou.ui.fragment.HomeFragment;
import com.example.lenovo.roomshulvyou.ui.fragment.FeatureFragment;

import java.util.ArrayList;

public class FeaturedActivity extends BaseActivity {

    private EditText ed_home;
    private LinearLayout linearLayout;
    private ImageView ding;
    private RelativeLayout rel_home;
    private FrameLayout fragelayout;
    private RadioButton shouye;
    private RadioButton geren;
    private RadioButton tanchu;
    private RadioButton dingdan;
    private RadioButton tese;
    private RadioGroup radiogroup;
    private ArrayList<Fragment> list;


    @Override
    protected void initData() {

        initView();

        list = new ArrayList<Fragment>();
        HomeFragment homeFragment = new HomeFragment();
        PersonalFragment personalFragment = new PersonalFragment();
        OrderFragment orderFragment = new OrderFragment();
        FeatureFragment featureFragment = new FeatureFragment();
        list.add(homeFragment);
        list.add(personalFragment);
        list.add(orderFragment);
        list.add(featureFragment);

    }

    @Override
    protected void initId() {
        ed_home = (EditText) findViewById(R.id.ed_home);
        linearLayout = (LinearLayout) findViewById(R.id.linearLayout);
        ding = (ImageView) findViewById(R.id.ding);
        rel_home = (RelativeLayout) findViewById(R.id.rel_home);
        fragelayout = (FrameLayout) findViewById(R.id.fragelayout);
        shouye = (RadioButton) findViewById(R.id.shouye);
        geren = (RadioButton) findViewById(R.id.geren);
        tanchu = (RadioButton) findViewById(R.id.tanchu);
        dingdan = (RadioButton) findViewById(R.id.dingdan);
        tese = (RadioButton) findViewById(R.id.tese);
        radiogroup = (RadioGroup) findViewById(R.id.radiogroup);
    }

    @Override
    protected int getContentViewId() {
        return R.layout.activity_featured;
    }


    private void initView() {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        //开启一个事物
        FragmentTransaction fragmentTransaction = supportFragmentManager.beginTransaction();
        //添加一个Fragment
        final HomeFragment homeFragment = new HomeFragment();
        final PersonalFragment personalFragment = new PersonalFragment();
        final OrderFragment orderFragment = new OrderFragment();
        final FeatureFragment featureFragment = new FeatureFragment();


        fragmentTransaction.add(R.id.fragelayout, homeFragment);
        fragmentTransaction.add(R.id.fragelayout, personalFragment);
        fragmentTransaction.add(R.id.fragelayout, orderFragment);
        fragmentTransaction.add(R.id.fragelayout, featureFragment);
        fragmentTransaction.show(homeFragment).hide(personalFragment).hide(orderFragment).hide(featureFragment);
        //开启
        fragmentTransaction.commit();


        radiogroup = (RadioGroup) findViewById(R.id.radiogroup);
        radiogroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            private PopupWindow popupWindow;

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                FragmentManager supportFragmentManager = getSupportFragmentManager();
                //开启一个事物
                FragmentTransaction fragmentTransaction = supportFragmentManager.beginTransaction();
                Intent intent;
                switch (checkedId) {
                    case R.id.shouye:
                        fragmentTransaction.show(homeFragment).hide(personalFragment).hide(orderFragment).hide(featureFragment);
                        shouye.setVisibility(View.VISIBLE);
                        break;
                    case R.id.geren:
                        fragmentTransaction.show(personalFragment).hide(homeFragment).hide(orderFragment).hide(featureFragment);
                        geren.setVisibility(View.VISIBLE);
                        break;
                    case R.id.tanchu:
                        Toast.makeText(FeaturedActivity.this, "加号", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.dingdan:
                        fragmentTransaction.show(orderFragment).hide(homeFragment).hide(personalFragment).hide(featureFragment);
                        dingdan.setVisibility(View.VISIBLE);
                        break;
                    case R.id.tese:
                        fragmentTransaction.show(featureFragment).hide(homeFragment).hide(personalFragment).hide(orderFragment);
                        tese.setVisibility(View.VISIBLE);
                        break;

                }
                fragmentTransaction.commit();
            }
        });
    }
}


