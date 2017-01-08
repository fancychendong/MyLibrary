package com.xiao.dong.mvvmapp;

import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.xiao.dong.mvvmapp.databinding.FragmentRichEditorBinding;
import com.xiao.dong.mvvmapp.databinding.WidgetRichEditorBinding;

import eu.inloop.viewmodel.AbstractViewModel;

/**
 * Created by chenxiaodong on 17/1/8.
 */
public class RichEditorViewModel extends AbstractViewModel<IRichEditorView> {

    private RichEditorModel mModel;
    private ViewDataBinding mBinding;

    @Override
    public void bindView(@NonNull IRichEditorView view) {
        super.bindView(view);
//        view.setContent(mModel.getContent());
        mBinding = view.getDataBinding();
        mModel = new RichEditorModel();
        if (mBinding instanceof FragmentRichEditorBinding) {
            ((FragmentRichEditorBinding)mBinding).setContent(mModel);
        } else if (mBinding instanceof WidgetRichEditorBinding) {
            ((WidgetRichEditorBinding)mBinding).setEditContent(mModel);
            mModel.setContent("hello world cxd");
        }
    }

    @Override
    public void onModelRemoved() {
        super.onModelRemoved();
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
    public void saveState(@NonNull Bundle bundle) {
        super.saveState(bundle);
    }

    @Override
    public void clearView() {
        super.clearView();
    }

    @Nullable
    @Override
    public IRichEditorView getView() {
        return super.getView();
    }

    @Override
    public void onCreate(@Nullable Bundle arguments, @Nullable Bundle savedInstanceState) {
        super.onCreate(arguments, savedInstanceState);
    }

    @Nullable
    @Override
    public String getUniqueIdentifier() {
        return super.getUniqueIdentifier();
    }
}
