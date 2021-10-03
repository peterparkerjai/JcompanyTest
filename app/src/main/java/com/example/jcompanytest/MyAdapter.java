package com.example.jcompanytest;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;



public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyAdptr> {

    List<String> list;

    public MyAdapter(List<String> list){
        this.list=list;
    }


    @NonNull
    @Override
    public MyAdptr onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View item = layoutInflater.inflate(R.layout.recyclerv, parent, false);
        MyAdptr my = new MyAdptr(item);

        return my;

    }

    @Override
    public void onBindViewHolder(@NonNull MyAdptr holder, int position) {
        holder.text.setText(this.list.get(position));

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class MyAdptr extends RecyclerView.ViewHolder {

        TextView text;

        public MyAdptr(@NonNull View itemView) {
            super(itemView);

            text = itemView.findViewById(R.id.edittextname);

        }
    }


}



