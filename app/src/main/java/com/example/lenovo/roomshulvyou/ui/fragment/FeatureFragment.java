package com.example.lenovo.roomshulvyou.ui.fragment;


import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;

import com.example.lenovo.roomshulvyou.R;
import com.example.lenovo.roomshulvyou.base.BaseFragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class FeatureFragment extends BaseFragment {


    private EditText ed_home;
    private LinearLayout linearLayout;
    private ImageView ding;
    private RelativeLayout rel_home;
    private RadioButton mOLBtn;
    private RadioButton mMangerBtn;
    private RadioButton mPersonalBtn;
    private RadioButton hun;
    private RadioGroup mBottomGroup;
    private ListView list_home;

    @Override
    protected void initView(View inflate) {
        ed_home = (EditText) inflate.findViewById(R.id.ed_home);
        linearLayout = (LinearLayout) inflate.findViewById(R.id.linearLayout);
        ding = (ImageView) inflate.findViewById(R.id.ding);
        rel_home = (RelativeLayout) inflate.findViewById(R.id.rel_home);
        mOLBtn = (RadioButton) inflate.findViewById(R.id.mOLBtn);
        mMangerBtn = (RadioButton) inflate.findViewById(R.id.mMangerBtn);
        mPersonalBtn = (RadioButton) inflate.findViewById(R.id.mPersonalBtn);
        hun = (RadioButton) inflate.findViewById(R.id.hun);
        mBottomGroup = (RadioGroup) inflate.findViewById(R.id.mBottomGroup);
        list_home = (ListView) inflate.findViewById(R.id.list_home);

    }

    @Override
    protected void initData() {

    }

    @Override
    protected void updateTitleBar() {

    }

    @Override
    protected int layoutId() {
        return R.layout.fragment_feature;
    }

}
