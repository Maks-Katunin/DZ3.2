package com.geektech.dz32;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PersonViewHolder extends RecyclerView.ViewHolder {
    private ImageView imageView;
    private TextView name;

    public PersonViewHolder(@NonNull View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.iv_avatar);
        name = itemView.findViewById(R.id.name);
    }

    public void onBind(Person person){
        imageView.setImageResource(person.getImage());
        name.setText(person.getName());
    }
}
