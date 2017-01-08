package com.xiao.dong.mvpapp;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EditText;

import com.hannesdorfmann.mosby.mvp.MvpPresenter;
import com.hannesdorfmann.mosby.mvp.MvpView;
import com.hannesdorfmann.mosby.mvp.layout.MvpLinearLayout;

/**
 * Created by chenxiaodong on 17/1/8.
 */
public class RichEditorView extends MvpLinearLayout<RichEditorView, RichEditorWidgetPresenter> implements MvpView {

    private EditText mEditText;

    public RichEditorView(Context context) {
        this(context, null);
    }

    public RichEditorView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public RichEditorView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    public RichEditorView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init();
    }

    private void init() {
        inflate(getContext(), R.layout.widget_rich_editor, this);
        mEditText = (EditText) findViewById(R.id.widget_rich_editor);

    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override
    public RichEditorWidgetPresenter createPresenter() {
        return new RichEditorWidgetPresenter();
    }

    public void setText(String content) {
        mEditText.setText(content);
    }
}
