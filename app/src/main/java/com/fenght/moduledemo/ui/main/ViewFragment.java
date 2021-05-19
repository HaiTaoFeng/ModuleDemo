package com.fenght.moduledemo.ui.main;

import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.fenght.moduledemo.R;
import com.fenght.moduledemo.bean.CodeMessage;
import com.fenght.moduledemo.bean.ViewMessage;
import com.fenght.moduledemo.databinding.ViewFragmentBinding;

public class ViewFragment extends Fragment {

    private MainViewModel mViewModel;
    private ViewFragmentBinding viewFragmentBinding;
    private ViewMessage viewMessage;
    private CodeMessage codeMessage;

    public static ViewFragment newInstance() {
        return new ViewFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.view_fragment, container, false);
        viewFragmentBinding = DataBindingUtil.bind(view);
        viewMessage = new ViewMessage(16,"这就是mvvm？");
        codeMessage = new CodeMessage();
        setModel(viewMessage,codeMessage);
        setListence();
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(MainViewModel.class);
        // TODO: Use the ViewModel
    }

    private void setListence(){
        viewFragmentBinding.message.setOnClickListener(v -> {
            int count = viewMessage.getCode();
            count ++;
            viewMessage.setCode(count);
            viewMessage.setMsg("这就是mvvm的数据实时变化？");
            setModel(viewMessage);
        });

        viewFragmentBinding.code.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                viewMessage.setCode(Integer.parseInt(s.toString()));
                viewMessage.setMsg("code变成了" + s.toString() + ",这就是mvvm的数据实时变化？\n可笑！");
                codeMessage.firstName.set("code变成了" + s.toString() + ",这就是mvvm的数据实时变化？\n可笑！");
//                setModel(viewMessage);
            }
        });
    }

    private  <T> void setModel(T... ts){
        for (T t:ts) {
            if (t instanceof ViewMessage) {
                viewFragmentBinding.setViewMessage((ViewMessage) t);
            }
            if (t instanceof CodeMessage) {
                viewFragmentBinding.setCodeMessage((CodeMessage) t);
            }
        }
    }

}