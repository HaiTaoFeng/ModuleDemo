package com.fenght.moduledemo;

import android.os.AsyncTask;

public class MyAsyncTask extends AsyncTask<String,Integer,Long> {
    @Override
    protected Long doInBackground(String... strings) {
        return null;
    }

    @Override
    protected void onProgressUpdate(Integer... values) {
        super.onProgressUpdate(values);
    }

    @Override
    protected void onPostExecute(Long aLong) {
        super.onPostExecute(aLong);
    }
}
