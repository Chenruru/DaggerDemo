package test.bwie.com.daggerdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import javax.inject.Inject;

public class Main2Activity extends AppCompatActivity {

    @Inject
    MainPresent mainPresent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        IApplacition application = (IApplacition) getApplication();
        application.mainCompent.inject(this);

        System.out.println("mainPresent="+mainPresent);
    }
}
