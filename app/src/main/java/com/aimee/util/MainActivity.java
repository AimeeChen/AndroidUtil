package com.aimee.util;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.aimee.util.dialog.DialogActivity;
import com.aimee.util.screen.ScreenInfoUtil;
import com.aimee.util.wifi.connecter.WifiScanActivity;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.btn_screen)
    Button mBtnScreen;
    @Bind(R.id.tv_result)
    TextView mTvResult;
    @Bind(R.id.btn_activity_as_dialog)
    Button mBtnActivityAsDialog;

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
            case R.id.btn_activity_as_dialog:
                startDialogActivity();
                break;
            case R.id.btn_wifi:
                startWifiScanActivity();
                break;
        }
    }

    private void getScreenProperty() {
        String info = ScreenInfoUtil.getScreenProperty(this);
        mTvResult.setText(info);
    }

    private void startDialogActivity() {
        Intent intent = new Intent(MainActivity.this, DialogActivity.class);
        startActivity(intent);
    }

    private void startWifiScanActivity() {
        Intent intent = new Intent(MainActivity.this, WifiScanActivity.class);
        startActivity(intent);
        // 跳转到系统WIFI设置
//        Intent intent = new Intent("android.settings.WIFI_SETTINGS");
//        startActivity(intent);("android.settings.WIFI_SETTINGS");
//        startActivity(intent);
    }
}
