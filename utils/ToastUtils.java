package com.vicning.android.oschina.utils;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by Neil on 2016/6/28.
 */
public class ToastUtils {
    private static Toast toast;

    /**
     * 能够连续显示吐司，不必等待上一个吐司消失
     * @param context context
     * @param text text
     */
    public static void showToast(Context context, String text) {
        if (toast == null) {
            toast = Toast.makeText(context, text, 0);
        }
        toast.setText(text);
        toast.show();
    }
}
