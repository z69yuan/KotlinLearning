package com.android.server;

/**
 *  然后在 发布 服务：
 *             traceBeginAndSlog("StartVibratorService");
 *             vibrator = new VibratorService(context);
 *             ServiceManager.addService("vibrator", vibrator);
 *             traceEnd();
 *
 *  接下来 写本地逻辑；
 *      com_android_server_led_service.cpp
 */
public class LedService extends ILedService.Stub {
    private static final String TAG = "LedService";

    LedService(){
        native_ledopen();
    }
    // 调用native方法，访问硬件服务
    int doSum(int a,int b){
        // 调用native函数
        return 1;
    }



    public native int native_ledopen();
    public native int native_ledclose();
    public native int native_ctrl(int a, int b);
}
