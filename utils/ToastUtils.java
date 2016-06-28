package com.vicning.android.oschina.utils;

import android.content.Context;
import android.widget.Toast;

/**
 * 吐司工具类
 * Created by Neil on 2016/6/28.
 */
public class ToastUtils {
    private static Toast toast;

    /**
     * 能够连续显示吐司，不必等待上一个吐司消失
     * @param context The context to use.
     * @param text The text to toast.
     */
    public static void showToast(Context context, String text) {
        if (toast == null) {
            toast = Toast.makeText(context, text, 0);
        }
        toast.setText(text);
        toast.show();
    }
}
