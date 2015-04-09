package com.example.fedora.coolweather.util;


//回调机制
/**
 * Created by Fedora on 2015/4/7.
 */
public interface HttpCallbackListener {
    void onFinish(String response);

    void onError(Exception e);
}
