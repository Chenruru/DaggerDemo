package test.bwie.com.daggerdemo;

import javax.inject.Inject;

/**
 * date: 2017/8/4
 * author:陈茹
 * 类的用途:
 */

public class MainPresent {


  public String name;
   @Inject
    public MainPresent(String name){

      this.name=name;
    }
}
