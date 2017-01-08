package com.xiao.dong.mvvmapp;

import android.databinding.ViewDataBinding;

import eu.inloop.viewmodel.IView;

/**
 * Created by chenxiaodong on 17/1/8.
 */
public interface IRichEditorView<T extends ViewDataBinding> extends IView {

    void setContent(String content);

    String getContent();

    T getDataBinding();

}
