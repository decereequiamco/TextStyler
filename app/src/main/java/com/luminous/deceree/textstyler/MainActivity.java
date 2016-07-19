package com.luminous.deceree.textstyler;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText mEtText;
    private RadioButton mRbtnRed,mRbtnBlue,mRbtnGreen;
    private CheckBox mCbBold,mCbItalic;
    private TextView mTvTxt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEtText = (EditText) findViewById(R.id.mEtText);
        mRbtnRed = (RadioButton) findViewById(R.id.mRbtnRed);
        mRbtnBlue = (RadioButton) findViewById(R.id.mRbtnBlue);
        mRbtnGreen = (RadioButton) findViewById(R.id.mRbtnGreen);
        mTvTxt = (TextView) findViewById(R.id.mTvTxt);
        mCbBold = (CheckBox) findViewById(R.id.mCbBold);
        mCbItalic = (CheckBox) findViewById(R.id.mCbItalic);

        mCbBold.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mCbItalic.isChecked() && mCbBold.isChecked()) {
                    mTvTxt.setTypeface(null,Typeface.BOLD_ITALIC);
                }else if(mCbBold.isChecked()){
                    mTvTxt.setTypeface(null,Typeface.BOLD);
                }else if(!mCbBold.isChecked() && mCbItalic.isChecked()){
                    mTvTxt.setTypeface(null,Typeface.ITALIC);
                }else{
                    mTvTxt.setTypeface(null,Typeface.NORMAL);
                }
            }
        });
        mCbItalic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mCbBold.isChecked() && mCbItalic.isChecked()){
                    mTvTxt.setTypeface(null,Typeface.BOLD_ITALIC);
                }else if(mCbItalic.isChecked()){
                    mTvTxt.setTypeface(null,Typeface.ITALIC);
                }else if(!mCbItalic.isChecked() && mCbBold.isChecked()){
                    mTvTxt.setTypeface(null,Typeface.BOLD);
                }else{
                    mTvTxt.setTypeface(null,Typeface.NORMAL);
                }
            }
        });
        mRbtnBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mTvTxt.setTextColor(Color.BLUE);
            }
        });
        mRbtnGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mTvTxt.setTextColor(Color.GREEN);
            }
        });
        mRbtnRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mTvTxt.setTextColor(Color.RED);
            }
        });
        mEtText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                String text = mEtText.getText().toString();
                mTvTxt.setText(text);

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

    }



}
