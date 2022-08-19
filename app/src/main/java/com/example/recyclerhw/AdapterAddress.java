package com.example.recyclerhw;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterAddress extends RecyclerView.Adapter<AdapterAddress.AddressVH> {
    private List<String>addresses;

    public AdapterAddress(List<String> addresses) {
        this.addresses = addresses;
    }

    @NonNull
    @Override
    public AddressVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new AddressVH(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_address, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull AddressVH holder, int position) {
        holder.addressTV.setText(addresses.get(position));
    }

    @Override
    public int getItemCount() {
        return addresses.size();
    }

    class AddressVH extends RecyclerView.ViewHolder{
        TextView addressTV;

        public AddressVH(@NonNull View itemView) {
            super(itemView);
            addressTV = itemView.findViewById(R.id.address_tv);
        }
    }
}
