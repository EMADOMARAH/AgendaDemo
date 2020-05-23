package com.example.agenda.Adapters;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.agenda.Activities.Types_Customers;
import com.example.agenda.Models.Types_Model;
import com.example.agenda.R;

import java.util.List;

public class Types_Adapter extends RecyclerView.Adapter<Types_Adapter.TypesVH> {
    List<Types_Model> types_models;
    View view;

    public Types_Adapter(List<Types_Model> types_models) {
        this.types_models = types_models;
    }

    @NonNull
    @Override
    public TypesVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        view = LayoutInflater.from(parent.getContext()).inflate(R.layout.types_item,null);
        return new TypesVH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TypesVH holder, int position) {
        Types_Model types_model = types_models.get(position);
        holder.notes_txt.setText(types_model.getNote());
        holder.client_name_txt.setText(types_model.getCustomer());
        holder.tape_txt.setText(types_model.getTape());
        holder.meters_count_txt.setText(types_model.getMeters());
    }

    @Override
    public int getItemCount() {
        return types_models.size();
    }


    public class TypesVH extends RecyclerView.ViewHolder {
        TextView notes_txt,client_name_txt,tape_txt,meters_count_txt;
        public TypesVH(@NonNull View itemView) {
            super(itemView);

            notes_txt = itemView.findViewById(R.id.notes_txt);
            client_name_txt = itemView.findViewById(R.id.clint_name_txt);
            tape_txt = itemView.findViewById(R.id.tape_txt);
            meters_count_txt = itemView.findViewById(R.id.meters_count_txt);
        }
    }
}
