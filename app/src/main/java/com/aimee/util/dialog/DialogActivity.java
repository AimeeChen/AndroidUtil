package com.aimee.util.dialog;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.aimee.util.R;

/**
 * Activity制作成的Dialog
 * @author chenzhihua
 * @version 7.0.0
 * @date 2018/6/15
 */
public class DialogActivity extends Activity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog);
    }
}
