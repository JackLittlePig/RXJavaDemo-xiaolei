package com.xiaolei.rxjava.cache;

import android.graphics.Bitmap;

/**
 * Created by ZhaoLei on 2017/12/7 15:04
 * E-Mail Address：17610230792@163.com
 */
public interface Cache {
    Bitmap getBitmap(String s);

    void putBitmap(String s, Bitmap bitmap);
}
