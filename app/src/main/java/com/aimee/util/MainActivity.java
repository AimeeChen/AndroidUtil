package com.aimee.util;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.aimee.util.screen.ScreenInfoUtil;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.btn_screen)
    Button mBtnScreen;
    @Bind(R.id.tv_result)
    TextView mTvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_screen:
                getScreenProperty();
                break;
        }
    }

    private void getScreenProperty() {
        String info = ScreenInfoUtil.getScreenProperty(this);
        mTvResult.setText(info);
    }
}
