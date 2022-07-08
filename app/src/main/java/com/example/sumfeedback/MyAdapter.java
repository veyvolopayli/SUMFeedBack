package com.example.sumfeedback;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    Context context;

    ArrayList<UserData> list;

    public MyAdapter(Context context, ArrayList<UserData> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        UserData userData = list.get(position);
        holder.contact.setText(userData.contact);
        holder.message.setText(userData.message);


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView contact, message;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            contact = itemView.findViewById(R.id.contactTextView);
            message = itemView.findViewById(R.id.messageTextView);
        }
    }

}