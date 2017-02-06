package com.example.myapplicationlist;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private static Toast mToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //无需用到Button实例,注册监听事件即可
        findViewById(R.id.hot_film).setOnClickListener(this);
        findViewById(R.id.stock_eagle).setOnClickListener(this);
        findViewById(R.id.xyz_reader).setOnClickListener(this);
        findViewById(R.id.newest).setOnClickListener(this);
        findViewById(R.id.graduation_project).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.hot_film:
                showToast(R.string.hot_film);
                break;
            case R.id.stock_eagle:
                showToast(R.string.stock_eagle);
                break;
            case R.id.xyz_reader:
                showToast(R.string.xyz_reader);
                break;
            case R.id.newest:
                showToast(R.string.newest);
                break;
            case R.id.graduation_project:
                showToast(R.string.graduation_project);
                break;
        }
    }

    private void showToast(int resId) {
        if (mToast == null) {
            mToast = Toast.makeText(this, resId, Toast.LENGTH_SHORT);
        } else {
            mToast.setText(resId);
        }
        mToast.show();
    }
}
