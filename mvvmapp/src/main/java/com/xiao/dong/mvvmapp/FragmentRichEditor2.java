package com.xiao.dong.mvvmapp;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import eu.inloop.viewmodel.base.ViewModelBaseFragment;

/**
 * Created by chenxiaodong on 17/1/8.
 */
public class FragmentRichEditor2 extends ViewModelBaseFragment<IRichEditorView, RichEditorViewModel> {

    private RichEditorView mRichEditorView;

    @Nullable
    @Override
    public Class getViewModelClass() {
        return RichEditorViewModel.class;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mRichEditorView = new RichEditorView(getContext());
        return mRichEditorView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setModelView(mRichEditorView);
    }

    @Override
    protected void setModelView(@NonNull IRichEditorView view) {
        super.setModelView(view);
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
    }

    @Override
    public void onStart() {
        super.onStart();
    }

    @Override
    public void onStop() {
        super.onStop();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Nullable
    @Override
    public RichEditorViewModel getViewModel() {
        return super.getViewModel();
    }
}
