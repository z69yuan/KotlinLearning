package com.moutain.kotlinlearning;

import android.app.Application;
import android.content.Context;

import me.weishu.reflection.Reflection;

/**
 * ζηεΊη¨
 *
 * @author zfc on 2022/9/27
 */
public class MyApplication extends Application {

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        Reflection.unseal(base);
    }
}
