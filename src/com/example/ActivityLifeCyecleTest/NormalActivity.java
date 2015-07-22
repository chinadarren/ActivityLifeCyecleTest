package com.example.ActivityLifeCyecleTest;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

/**
 * Created by LeiChen on 7/22/2015.
 */
public class NormalActivity extends Activity {
    @Override
    protected void onCreate(Bundle savdInstanceState) {
        super.onCreate(savdInstanceState);
    requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.normal_layout);
    }
}
