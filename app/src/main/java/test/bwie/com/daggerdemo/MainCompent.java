package test.bwie.com.daggerdemo;

import javax.inject.Singleton;

import dagger.Component;

/**
 * date: 2017/8/4
 * author:陈茹
 * 类的用途:
 */

//activity 和 present需要一个桥梁，这个类就是他俩的桥梁

    @IScope
    @Component(modules = Mainmodel.class)  //与modle关联


    public interface MainCompent {

      void inject(MainActivity mainActivity);

    void  inject(Main2Activity main2Activity);

}
