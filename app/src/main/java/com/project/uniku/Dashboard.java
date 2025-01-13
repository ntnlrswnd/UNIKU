package com.project.uniku;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Dashboard extends Fragment {

    public Dashboard() {
        // Required empty public constructor
    }

    public static Dashboard newInstance(String param1, String param2) {
        Dashboard fragment = new Dashboard();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_dashboard, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // Find buttons
        View Course = view.findViewById(R.id.course);
        View timelineButton = view.findViewById(R.id.timeline);
        View calendarButton = view.findViewById(R.id.calender);
        ImageView profile = view.findViewById(R.id.profile);
        TextView AddSubmission = view.findViewById(R.id.add_submission);

        // Set click listeners
        Course.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to CourseActivity
                Intent intent = new Intent(getActivity(), CourseActivity.class);
                startActivity(intent);
            }
        });

        timelineButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to TimelineActivity
                Intent intent = new Intent(getActivity(), TimelineActivity.class);
                startActivity(intent);
            }
        });

        calendarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to CalenderActivity
                Intent intent = new Intent(getActivity(), CalenderActivity.class);
                startActivity(intent);
            }
        });

        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to ProfileActivity
                Intent intent = new Intent(getActivity(), Profile.class);
                startActivity(intent);
            }
        });

        AddSubmission.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to AddSubmissionActivity
                Intent intent = new Intent(getActivity(), AddSubmission.class);
                startActivity(intent);
            }
        });
    }
}
