package com.fenght.moduledemo;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.widget.TextView;

import com.alibaba.android.arouter.launcher.ARouter;
import com.squareup.leakcanary.LeakCanary;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LeakCanary.install(this.getApplication());
        Log.d("fht","onCreate");
        setContentView(R.layout.activity_main);
        ARouter.init(this.getApplication());
        TextView textView = findViewById(R.id.tv_text);
        textView.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this,MainActivity.class));
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("fht","onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("fht","onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("fht","onRestart");
    }


    @Override
    protected void onPause() {
        super.onPause();
        Log.d("fht","onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("fht","onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("fht","onStop");
    }
}