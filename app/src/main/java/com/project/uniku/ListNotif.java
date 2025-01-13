package com.project.uniku;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ListNotif extends RecyclerView.Adapter<ListNotif.ListViewHolder> {

    private ArrayList<Notif> listNotif;

    // Constructor untuk menerima data notifikasi
    public ListNotif(ArrayList<Notif> listNotif) {
        this.listNotif = listNotif;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_notif, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        Notif notif = listNotif.get(position);
        holder.tvNotif.setText(notif.getNama());
        holder.tvDetail.setText(notif.getDetail());
    }

    @Override
    public int getItemCount() {
        return listNotif.size();
    }

    public static class ListViewHolder extends RecyclerView.ViewHolder {
        TextView tvNotif, tvDetail;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            tvNotif = itemView.findViewById(R.id.notif_item);
            tvDetail = itemView.findViewById(R.id.notif_detail);
        }
    }
}
