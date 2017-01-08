package com.xiao.dong.mvpapp;

import com.hannesdorfmann.mosby.mvp.MvpPresenter;

/**
 * Created by chenxiaodong on 17/1/8.
 */
public class RichEditorWidgetPresenter implements MvpPresenter<RichEditorView> {

    private RichEditorView mView;
    private RichEditorModel mModel;

    public RichEditorWidgetPresenter() {
        mModel = new RichEditorModel();
    }

    @Override
    public void attachView(RichEditorView view) {
        mView = view;
        init();
    }

    @Override
    public void detachView(boolean retainInstance) {
        mView = null;
    }

    private void init() {
        mView.setText(mModel.getContent());
    }
}
