package com.fenght.moduledemo.ui.main;

import com.fenght.moduledemo.bean.ViewMessage;

import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {
    // TODO: Implement the ViewModel

    public void changeCode(int code,String msg){
        ViewMessage viewMessage = new ViewMessage();
        viewMessage.setCode(code);
        viewMessage.setMsg(msg);
    }
}