package com.example.ActivityLifeCyecleTest;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

/**
 * Created by LeiChen on 7/23/2015.
 */

//知晓当前是在哪一个活动,成为其它类的父类,其它活动在启动时机会显示所属类
public class BaseActivity  extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        Log.d("BaseActivity",getClass().getSimpleName());

    }

}
