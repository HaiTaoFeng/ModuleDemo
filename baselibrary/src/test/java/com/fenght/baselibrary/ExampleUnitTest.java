package com.fenght.baselibrary;

import org.junit.Test;

import java.util.HashMap;
import java.util.concurrent.CountDownLatch;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        final String[] res = new String[1];
        HashMap<String,String> map = new HashMap<>();
        map.put("a","b");
        tongBu("测试", new Callback() {
            @Override
            public void b(String s) {
                res[0] = s;
            }
        });
    }

    private void tongBu(String s ,final Callback callback){
        callback.b(s);
    }

    interface Callback{
        void b(String s);
    }



}