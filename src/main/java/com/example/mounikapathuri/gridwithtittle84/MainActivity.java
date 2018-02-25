package com.example.mounikapathuri.gridwithtittle84;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    public String[] mName={
            "GingerBread",
            "Honneycomb",
            "Icecream",
            "Jelly",
            "Kitkat",
            "Lollipop"
    };
    public int [] mImages = {
            R.drawable.gingerbread,
            R.drawable.honneycomb,
            R.drawable.icecream,
            R.drawable.jelly,
            R.drawable.kitkat,
            R.drawable.lollipop,
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GridView gridView = (GridView) findViewById(R.id.images);
        gridView.setAdapter(new CustomAdapter(MainActivity.this,mImages,mName));
    }
}
