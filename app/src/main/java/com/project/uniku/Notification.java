package com.project.uniku;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import java.util.ArrayList;

public class Notification extends Fragment {

    private RecyclerView rvNotif;
    private ListNotif adapter;
    private ArrayList<Notif> list = new ArrayList<>();

    public Notification() {
        // Required empty public constructor
    }

    public static Notification newInstance(String param1, String param2) {
        Notification fragment = new Notification();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_notification, container, false);

        rvNotif = view.findViewById(R.id.notif);
        rvNotif.setHasFixedSize(true);

        // Menghindari pengisian data duplikat
        if (list.isEmpty()) {
            list.addAll(NotifData.getListData());
        }

        showRecyclerList();
        return view;
    }


    private void showRecyclerList() {
        rvNotif.setLayoutManager(new LinearLayoutManager(getActivity()));
        adapter = new ListNotif(list);
        rvNotif.setAdapter(adapter);
    }
}
