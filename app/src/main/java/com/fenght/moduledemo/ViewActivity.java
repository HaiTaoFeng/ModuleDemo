package com.fenght.moduledemo;

import androidx.appcompat.app.AppCompatActivity;
import dalvik.system.BaseDexClassLoader;
import dalvik.system.DexClassLoader;
import dalvik.system.PathClassLoader;

import android.content.Intent;
import android.os.Bundle;

import com.fenght.moduledemo.ui.main.ViewFragment;

public class ViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, ViewFragment.newInstance())
                    .commitNow();
        }

        startActivity(new Intent(this,MainActivity.class));
    }
}