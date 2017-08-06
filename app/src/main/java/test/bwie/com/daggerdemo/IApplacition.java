package test.bwie.com.daggerdemo;

import android.app.Application;

/**
 * date: 2017/8/4
 * author:陈茹
 * 类的用途:
 */

public class IApplacition extends Application {
    MainCompent mainCompent;

    @Override
    public void onCreate() {
        super.onCreate();

        mainCompent= DaggerMainCompent.builder().mainmodel(new Mainmodel("1111")).build();
    }
}
