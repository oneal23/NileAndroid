package com.na.demo.ui.login.view;

import com.na.demo.R;
import com.na.ui.mvp.view.ButterKnifeView;

import butterknife.OnClick;

/**
 * Created by oneal23 on 2018/6/26.
 */
public class LoginView extends ButterKnifeView {

    @Override
    protected int getLayoutId() {
        return R.layout.activity_login;
    }

    @OnClick(R.id.btGet)
    void onBtGetClick(){
        if (getEventListener() != null){
            getEventListener().onEvent(0);
        }
    }

}
