package com.liaxi.dell.lifecycle;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import android.widget.Button;

/**
 * Created by dell on 2017/3/29.
 */

public class MainB extends Activity{

    public Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.e("pp"," B页面 ===========> onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mbin);
        button=(Button) findViewById(R.id.bu);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    @Override
    protected void onStart() {
        Log.e("pp"," B页面 ===========> onStart");
        super.onStart();

    }

    @Override
    protected void onPause() {
        Log.e("pp"," B页面 ===========> onPause");
        super.onPause();

    }

    @Override
    protected void onRestart() {
        Log.e("pp"," B页面 ===========> onRestart");
        super.onRestart();

    }

    @Override
    protected void onDestroy() {
        Log.e("pp"," B页面 ===========> onDestroy");
        super.onDestroy();

    }

    @Override
    protected void onResume() {
        Log.e("pp"," B页面 ===========> onResume");
        super.onResume();

    }

    @Override
    protected void onStop() {
        Log.e("pp"," B页面 ===========> onStop");
        super.onStop();

    }
}
