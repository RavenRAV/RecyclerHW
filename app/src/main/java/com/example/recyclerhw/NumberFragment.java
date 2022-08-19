package com.example.recyclerhw;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class NumberFragment extends Fragment {
    private List<String>numbers;
    private RecyclerView numberRecycler;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_number, container, false);
        numberRecycler = view.findViewById(R.id.recycler_number);
        numbers = new ArrayList<>();
        loadData();
        numberRecycler.setAdapter(new AdapterNumber(numbers));
        return view;
    }

    private void loadData() {
        for (int i = 10; i < 100; i++) {
            numbers.add("05556622" + i);
        }
    }
}