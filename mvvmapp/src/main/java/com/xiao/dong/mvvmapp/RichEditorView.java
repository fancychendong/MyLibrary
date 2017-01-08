package com.xiao.dong.mvvmapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.EditText;
import android.widget.LinearLayout;

import com.xiao.dong.mvvmapp.databinding.WidgetRichEditorBinding;

/**
 * Created by chenxiaodong on 17/1/8.
 */
public class RichEditorView extends LinearLayout implements IRichEditorView<WidgetRichEditorBinding>{

    private WidgetRichEditorBinding mBinding;

    public RichEditorView(Context context) {
        super(context);
        init();
    }

    private void init() {
        mBinding = WidgetRichEditorBinding.inflate(LayoutInflater.from(getContext()));
        addView(mBinding.getRoot());
    }

    @Override
    public void setContent(String content) {

    }

    @Override
    public String getContent() {
        return null;
    }

    @Override
    public WidgetRichEditorBinding getDataBinding() {
        return mBinding;
    }
}
