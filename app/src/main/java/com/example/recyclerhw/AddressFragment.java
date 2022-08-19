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

public class AddressFragment extends Fragment {
    private List<String> addresses;
    private RecyclerView addressRecycler;
    private Button addressbtn;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_address, container, false);
        addressRecycler = view.findViewById(R.id.recycler_address);
        addresses = new ArrayList<>();
        loadData();
        addressRecycler.setAdapter(new AdapterAddress(addresses));
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        addressbtn = view.findViewById(R.id.address_btn);
        addressbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nextFragment();
            }
        });
    }

    private void nextFragment() {
        NameFragment nameFragment = new NameFragment();
        requireActivity().getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, nameFragment).addToBackStack(null).commit();
    }

    private void loadData() {
        for (int i = 1; i < 30; i++) {
            addresses.add("Манаса " + i);
        }
    }
}