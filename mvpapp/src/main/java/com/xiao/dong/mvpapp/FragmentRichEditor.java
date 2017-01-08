package com.xiao.dong.mvpapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.hannesdorfmann.mosby.mvp.MvpFragment;

/**
 * Created by chenxiaodong on 17/1/8.
 */
public class FragmentRichEditor extends MvpFragment<FragmentRichEditor, RichEditorFragmentPresenter> {

    private View mRoot;
    private EditText mEditText;

    @Override
    public RichEditorFragmentPresenter createPresenter() {
        return new RichEditorFragmentPresenter();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mRoot = inflater.inflate(R.layout.fragment_rich_editor, container, false);
        findView();
        return mRoot;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onAttachFragment(Fragment childFragment) {
        super.onAttachFragment(childFragment);
    }

    private void findView() {
        mEditText = (EditText) mRoot.findViewById(R.id.edit_text);
    }

    public void setContent(String content) {
        mEditText.setText(content);
    }
}
