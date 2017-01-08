package com.xiao.dong.mvpapp;

import com.hannesdorfmann.mosby.mvp.MvpPresenter;

/**
 * Created by chenxiaodong on 17/1/8.
 */
public class RichEditorFragmentPresenter implements MvpPresenter<FragmentRichEditor> {

    private FragmentRichEditor mView;
    private RichEditorModel mModel;

    public RichEditorFragmentPresenter() {
        mModel = new RichEditorModel();
    }

    @Override
    public void attachView(FragmentRichEditor view) {
        mView = view;
        initRichEditor();
    }

    @Override
    public void detachView(boolean retainInstance) {
        mView = null;
    }

    private void initRichEditor() {
        mView.setContent(mModel.getContent());
    }
}
