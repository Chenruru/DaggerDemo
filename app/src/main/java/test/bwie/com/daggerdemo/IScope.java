package test.bwie.com.daggerdemo;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * date: 2017/8/5
 * author:陈茹
 * 类的用途:
 */

//自定义的作用域 @scope

    @Scope
    @Retention(RUNTIME)
public @interface IScope {

}
