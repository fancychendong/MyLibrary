package com.xiao.dong.mvpapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by chenxiaodong on 17/1/8.
 */
public class ActivityMain extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        switchFragment();

        setContentView(customView());
    }

    private void switchFragment() {
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_rich_editor, new FragmentRichEditor()).commitAllowingStateLoss();
    }


    private View customView() {
        RichEditorView view = new RichEditorView(this);
        return view;
    }
}
