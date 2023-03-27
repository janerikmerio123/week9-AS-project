package com.example.kayttisprojekti;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class UserViewHolder extends RecyclerView.ViewHolder {

    TextView userName, userDegree, userEmail;

    public UserViewHolder(@NonNull View itemView) {
        super(itemView);
        userName = itemView.findViewById(R.id.txtUserName);
        userDegree = itemView.findViewById(R.id.txtUserDegree);
        userEmail = itemView.findViewById(R.id.txtUserEmail);
    }
}
