package com.example.loadimgcompany;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Gallery;
import android.widget.GridView;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Logo> list=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list.add(new Logo("1","https://www.riotgames.com",R.drawable.h1));
        list.add(new Logo("2","https://www.garena.vn/",R.drawable.h2));
        list.add(new Logo("3","https://www.vng.com.vn/",R.drawable.h3));
        list.add(new Logo("4","https://vtcgame.vn/",R.drawable.h4));
        list.add(new Logo("5","https://sohagame.vn/",R.drawable.h5));
        list.add(new Logo("6","https://www.nexon.com/main/fr",R.drawable.h6));
        list.add(new Logo("7","https://www.tencent.com/zh-cn/index.html",R.drawable.h7));
        list.add(new Logo("8","https://www.blizzard.com/fr-fr/",R.drawable.h8));
        list.add(new Logo("9","https://www.ubisoft.com/en-gb",R.drawable.h9));
        list.add(new Logo("10","https://www.klei.com/",R.drawable.h10));

    MyAdapter adapter=new MyAdapter(MainActivity.this,list);
    GridView grid=(GridView)findViewById(R.id.grid_img);
    grid.setAdapter(adapter);
    grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            Intent intent=new Intent(MainActivity.this,Main2Activity.class);
            intent.putExtra("duongdan",list.get(i).src);
            startActivity(intent);
            finish();
        }
    });

    }
}
