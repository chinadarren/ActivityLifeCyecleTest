package com.example.ActivityLifeCyecleTest;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

/**
 * Created by LeiChen on 7/22/2015.
 */
public class DialogActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.dialog_layout);
    }
}
