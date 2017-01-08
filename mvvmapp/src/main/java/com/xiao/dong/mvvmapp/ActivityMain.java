package com.xiao.dong.mvvmapp;

import android.os.Bundle;
import android.support.annotation.Nullable;

import eu.inloop.viewmodel.base.ViewModelBaseEmptyActivity;

/**
 * Created by chenxiaodong on 17/1/8.
 */
public class ActivityMain extends ViewModelBaseEmptyActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actviity_main);
        switchFragment();
    }

    private void switchFragment() {
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_rich_editor, new FragmentRichEditor2()).commitAllowingStateLoss();
    }
}
