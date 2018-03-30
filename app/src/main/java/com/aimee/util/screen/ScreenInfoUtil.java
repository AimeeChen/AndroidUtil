package com.aimee.util.screen;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;

/**
 * 屏幕信息工具类
 * @author chenzhihua
 * @version 7.0.0
 * @date 2018/3/30
 */
public class ScreenInfoUtil {

    /**
     * 获取屏幕大小
     * @param Context
     */
    public static String getScreenProperty(Context Context) {
        WindowManager wm = (WindowManager) Context.getSystemService(Context.WINDOW_SERVICE);
        DisplayMetrics dm = new DisplayMetrics();
        wm.getDefaultDisplay().getMetrics(dm);
        int width = dm.widthPixels;         // 屏幕宽度（像素）
        int height = dm.heightPixels;       // 屏幕高度（像素）
        float density = dm.density;         // 屏幕密度（0.75 / 1.0 / 1.5）
        int densityDpi = dm.densityDpi;     // 屏幕密度dpi（120 / 160 / 240）
        // 屏幕宽度算法:屏幕宽度（像素）/屏幕密度
        int screenWidth = (int) (width / density);  // 屏幕宽度(dp)
        int screenHeight = (int) (height / density);// 屏幕高度(dp)

        String info = "屏幕宽度（像素）：" + width + "\n" +
                "屏幕高度（像素）：" + height + "\n" +
                "屏幕密度（0.75 / 1.0 / 1.5）：" + density + "\n" +
                "屏幕密度dpi（120 / 160 / 240）：" + densityDpi + "\n" +
                "屏幕宽度（dp）：" + screenWidth + "\n" +
                "屏幕高度（dp）：" + screenHeight;
        return info;
    }
}
