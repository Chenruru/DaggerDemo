package test.bwie.com.daggerdemo;

import javax.inject.Scope;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * date: 2017/8/5
 * author:陈茹
 * 类的用途:
 */

@Module
public class Mainmodel {


    private String name;
    public Mainmodel(String name){
        this.name=name;
    }



    //要想使用参数，在这写一个provider的方法就可以，写个@Provides注解 返回这个参数
    @Provides
    public String providestring(){
        return name;
    }

   // @Singleton  //添加一个单例的注解，就是要两个对象的输出内容相等
    @IScope
    @Provides
    public MainPresent provideMainPresent(){
        return new MainPresent( name);
    }
}
