package com.jhsf.estudo.viewpagerwithrecyclerview.RecyclerView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.jhsf.estudo.viewpagerwithrecyclerview.R;
import com.jhsf.estudo.viewpagerwithrecyclerview.model.Contact;

import java.util.List;


public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    Context context;
    List<Contact> data;

    public RecyclerViewAdapter(Context context, List<Contact> data) {
        this.context = context;
        this.data = data;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v;
        v = LayoutInflater.from(context).inflate(R.layout.item_contact, parent, false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.tvName.setText(data.get(position).getName());
        holder.tvPhone.setText(data.get(position).getPhone());
        holder.img.setImageResource(data.get(position).getPhoto());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        private TextView tvName;
        private TextView tvPhone;
        private ImageView img;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            tvName = itemView.findViewById(R.id.name_contact);
            tvPhone = itemView.findViewById(R.id.phone_contact);
            img = itemView.findViewById(R.id.img_contact);


        }
    }
}
