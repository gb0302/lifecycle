package com.liaxi.dell.lifecycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.e("pp"," A页面 ===========> onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        button=(Button) findViewById(R.id.bu1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainB.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart() {
        Log.e("pp"," A页面 ===========> onStart");
        super.onStart();

    }

    @Override
    protected void onPause() {
        Log.e("pp"," A页面 ===========> onPause");
        super.onPause();

    }

    @Override
    protected void onRestart() {
        Log.e("pp"," A页面 ===========> onRestart");
        super.onRestart();

    }

    @Override
    protected void onDestroy() {
        Log.e("pp"," A页面 ===========> onDestroy");
        super.onDestroy();

    }

    @Override
    protected void onResume() {
        Log.e("pp"," A页面 ===========> onResume");
        super.onResume();

    }

    @Override
    protected void onStop() {
        Log.e("pp"," A页面 ===========> onStop");
        super.onStop();

    }
}
