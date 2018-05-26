package com.example.leidong.selfviews.ui;

import android.os.Bundle;

import com.example.leidong.selfviews.R;
import com.example.leidong.selfviews.views.MyTextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MyTextViewActivity extends BaseActivity {
    private static final String TAG = MyTextViewActivity.class.getName();

    @BindView(R.id.my_textview)
    MyTextView mMyTextview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_text_view);
        ButterKnife.bind(this);

        initWidgets();

        initActions();

    }

    @Override
    public void initWidgets() {

    }

    @Override
    public void initActions() {

    }
}
