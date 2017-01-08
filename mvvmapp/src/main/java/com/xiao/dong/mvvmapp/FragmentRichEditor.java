package com.xiao.dong.mvvmapp;

import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.xiao.dong.mvvmapp.databinding.FragmentRichEditorBinding;

import eu.inloop.viewmodel.base.ViewModelBaseFragment;

/**
 * Created by chenxiaodong on 17/1/8.
 */
public class FragmentRichEditor extends ViewModelBaseFragment<IRichEditorView, RichEditorViewModel> implements IRichEditorView<FragmentRichEditorBinding> {

    private FragmentRichEditorBinding mBinding;
    private EditText mEditText;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mBinding = FragmentRichEditorBinding.inflate(inflater);
        mBinding.setContent(new RichEditorModel());
        findView();
        return mBinding.getRoot();
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setModelView(this);
    }

    private void findView() {
        mEditText = (EditText) mBinding.getRoot().findViewById(R.id.rich_editor);
    }

    @Nullable
    @Override
    public Class<RichEditorViewModel> getViewModelClass() {
        return RichEditorViewModel.class;
    }

    @Override
    public void setContent(String content) {
        mEditText.setText(content);
    }

    @Override
    public String getContent() {
        return mEditText.getText().toString();
    }

    @Override
    public FragmentRichEditorBinding getDataBinding() {
        return mBinding;
    }
}
