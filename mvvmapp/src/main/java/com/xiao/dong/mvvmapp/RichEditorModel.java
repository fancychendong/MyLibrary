package com.xiao.dong.mvvmapp;

import android.databinding.BaseObservable;

import com.xiao.dong.mvvmapp.BR;

/**
 * Created by chenxiaodong on 17/1/8.
 */
public class RichEditorModel extends BaseObservable {

    String mContent;

    public RichEditorModel() {
        mContent = "hello, mvvm !";
    }

    public String getContent() {
        return mContent;
    }

    public void setContent(String content) {
        mContent = content;
        notifyPropertyChanged(BR.content);
    }
}
