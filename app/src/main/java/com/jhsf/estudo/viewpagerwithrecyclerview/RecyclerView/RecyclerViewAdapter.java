package com.jhsf.estudo.viewpagerwithrecyclerview.RecyclerView;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.jhsf.estudo.viewpagerwithrecyclerview.R;
import com.jhsf.estudo.viewpagerwithrecyclerview.model.Contact;

import java.util.List;


public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    Context context;
    List<Contact> data;
    Dialog dialog;

    public RecyclerViewAdapter(Context context, List<Contact> data) {
        this.context = context;
        this.data = data;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v;
        v = LayoutInflater.from(context).inflate(R.layout.item_contact, parent, false);
        final MyViewHolder vHolder = new MyViewHolder(v);

        dialog = new Dialog(context);
        dialog.setContentView(R.layout.dialog_contact);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));


        vHolder.itemContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TextView dialogNameTv = dialog.findViewById(R.id.dialog_name_contact);
                TextView dialogPhoneTv = dialog.findViewById(R.id.dialog_phone_contact);
                ImageView dialogContactImage = dialog.findViewById(R.id.dialog_image_contact);
                dialogNameTv.setText(data.get(vHolder.getAdapterPosition()).getName());
                dialogPhoneTv.setText(data.get(vHolder.getAdapterPosition()).getPhone());
                dialogContactImage.setImageResource(data.get(vHolder.getAdapterPosition()).getPhoto());
                dialog.show();
            }
        });
        return vHolder;
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
        private LinearLayout itemContact;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            itemContact = itemView.findViewById(R.id.contact_item);
            tvName = itemView.findViewById(R.id.name_contact);
            tvPhone = itemView.findViewById(R.id.phone_contact);
            img = itemView.findViewById(R.id.img_contact);


        }
    }
}
