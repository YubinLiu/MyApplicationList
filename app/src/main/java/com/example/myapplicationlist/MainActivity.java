package com.example.myapplicationlist;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button hotFilm;

    private Button stockEagle;

    private Button xyzReader;

    private Button newest;

    private Button graduation_project;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hotFilm = (Button) findViewById(R.id.hot_film);
        stockEagle = (Button) findViewById(R.id.stock_eagle);
        xyzReader = (Button) findViewById(R.id.xyz_reader);
        newest = (Button) findViewById(R.id.newest);
        graduation_project = (Button) findViewById(R.id.graduation_project);
        hotFilm.setOnClickListener(this);
        stockEagle.setOnClickListener(this);
        xyzReader.setOnClickListener(this);
        newest.setOnClickListener(this);;
        graduation_project.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.hot_film:
                Toast.makeText(MainActivity.this,
                        "启动应用: 热门电影", Toast.LENGTH_SHORT).show();
                break;
            case R.id.stock_eagle:
                Toast.makeText(MainActivity.this,
                        "启动应用: 股票雄鹰", Toast.LENGTH_SHORT).show();
                break;
            case R.id.xyz_reader:
                Toast.makeText(MainActivity.this,
                        "启动应用: XYZ阅读器", Toast.LENGTH_SHORT).show();
                break;
            case R.id.newest:
                Toast.makeText(MainActivity.this,
                        "启动应用: 最新闻", Toast.LENGTH_SHORT).show();
                break;
            case R.id.graduation_project:
                Toast.makeText(MainActivity.this,
                        "启动应用: 毕业设计", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
