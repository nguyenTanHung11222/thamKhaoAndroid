package com.example.myapplication.MainPK;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.style.BulletSpan;

import com.example.myapplication.R;

public class activityMain extends AppCompatActivity {
    RecyclerView recyclerView;
    String s1[];
    int img[]= {R.drawable.hinh1, R.drawable.hinh2, R.drawable.hinh3};

    @Override
    protected void onCreate(Bundle saved){
        super.onCreate(saved);
        setContentView(R.layout.main_layout);
        recyclerView = findViewById(R.id.Rec);
        s1 = getResources().getStringArray(R.array.DanhSachSanPham);
        Adapter myadapter = new Adapter(this,s1,img);
        recyclerView.setAdapter(myadapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

}
