package com.example.recyclerhw;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterNumber extends RecyclerView.Adapter<AdapterNumber.NumberViewHolder> {

    private List<String> numbers;

    public AdapterNumber(List<String> names) {
        this.numbers = names;
    }


    @NonNull
    @Override
    public NumberViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new NumberViewHolder(LayoutInflater
                .from(parent.getContext()).inflate(R.layout.item_number, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull NumberViewHolder holder, int position) {
        holder.numberTV.setText(numbers.get(position));
    }

    @Override
    public int getItemCount() {
        return numbers.size();
    }



    class NumberViewHolder extends RecyclerView.ViewHolder{
        TextView numberTV;

        public NumberViewHolder(@NonNull View itemView) {
            super(itemView);
            numberTV = itemView.findViewById(R.id.number_tv);
        }
    }
}
