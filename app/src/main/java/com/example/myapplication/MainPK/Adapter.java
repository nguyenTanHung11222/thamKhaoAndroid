package com.example.myapplication.MainPK;

import android.content.Context;
import android.media.Image;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.myapplication.R;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHoldel>
{
    String data1[];
    int imgs[];
    Context context;
    public Adapter(Context ct, String[] s1, int[] img){
        context = ct;
        data1=s1;
        imgs=img;


    }

    @NonNull
    @Override
    public MyViewHoldel onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        LayoutInflater layoutInflater = LayoutInflater.from(context );
        View view = layoutInflater.inflate(R.layout.row,parent, false);
        return new MyViewHoldel(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHoldel myViewHoldel, int i) {
        myViewHoldel.myText.setText(data1[i]);
        myViewHoldel.myImageView.setImageResource(imgs[i]);

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class MyViewHoldel  extends RecyclerView.ViewHolder {
        TextView myText;
        ImageView myImageView;
        public MyViewHoldel(@NonNull View itemView) {
            super(itemView);
            myText = itemView.findViewById(R.id.textView);
            myImageView = itemView.findViewById(R.id.imageView);

        }
    }
}
