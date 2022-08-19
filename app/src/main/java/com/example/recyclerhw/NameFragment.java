package com.example.recyclerhw;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class NameFragment extends Fragment {
    private RecyclerView recyclerView;
    private List<String>names;
    private Button namebtn;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_name, container, false);
        recyclerView = view.findViewById(R.id.name_recycler);
        names = new ArrayList<>();
        loadData();
        recyclerView.setAdapter(new AdapterName(names));
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        namebtn = view.findViewById(R.id.name_btn);
        namebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nextFragment();
            }
        });
    }

    private void nextFragment() {
        NumberFragment numberFragment = new NumberFragment();
        requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container, numberFragment).addToBackStack(null).commit();
    } 

    private void loadData() {
        names.add("Constantin");
        names.add("Bigby");
        names.add("Batman");
        names.add("Raven");
        names.add("Nightwing");
        names.add("Robin");
        names.add("Wonder Woman");
        names.add("Barbara Gordon");
        names.add("Flash");
        names.add("Catwoman");
        names.add("Poison Ivy");
        names.add("Harley Quinn");
        names.add("Black Canary");
    }
}