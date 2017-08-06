package test.bwie.com.daggerdemo;

import android.app.Application;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {


    //写一个注解，mainpresent就相当于是对象了，在mainpersent的无参构造方法上也要写 @Inject注解
    //之前咱们使用mvp需要在这个类里面new 出来MainPresent，现在我们就使用注解的方式，他的底层会自动创建对象，不需要在new 了
    @Inject
    MainPresent mainPresent;   //不要写成私有的会访问不到

//    @Inject
//    MainPresent mainPresent1;  //这两个mainpresent对象，输出的结果不相同，要想相同写个单例的注解，在model和compent写@Singleton注解

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // DaggerMainCompent.builder().build().inject(this);
      //  DaggerMainCompent.builder().mainmodel(new Mainmodel("aihao")).build().inject(this);

   //   DaggerMainCompent.builder().mainmodel(new Mainmodel("nihao")).build().inject(this);

        findViewById(R.id.text3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Main2Activity.class));
            }
        });


        IApplacition application = (IApplacition) getApplication();
        application.mainCompent.inject(this);




        System.out.println("mainPresent="+mainPresent);
      //  System.out.println("mainPresent1="+mainPresent1);
    }
}
