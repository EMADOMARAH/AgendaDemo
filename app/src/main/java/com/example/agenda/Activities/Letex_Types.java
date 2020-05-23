package com.example.agenda.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.agenda.Adapters.Customers_Adapter;
import com.example.agenda.Adapters.Types_Customers_Adapter;
import com.example.agenda.Models.Customers_model;
import com.example.agenda.R;

import java.util.ArrayList;
import java.util.List;

public class Letex_Types extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    DividerItemDecoration dividerItemDecoration;
    List<Customers_model> letex_types_list;
    Types_Customers_Adapter adapter;
    Customers_model customers_model;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_letex__types);
        recyclerView = findViewById(R.id.recyclerview);
        letex_types_list = new ArrayList<>();
        layoutManager = new LinearLayoutManager(getApplicationContext(), RecyclerView.VERTICAL,false);
        dividerItemDecoration = new DividerItemDecoration(getApplicationContext(),DividerItemDecoration.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.addItemDecoration(dividerItemDecoration);
        String[] letex_types = new String[]{
                " كارنيا مطبوع",
                " لاكوست",
                " قطيفه",
                " ليحن",
                " ليفربول",
                " ميلتون",
                " كشمير",
                " فسكوز+ فبران",
                " براسولا",
                " شبك",
                " سوفت",
                " لوجى+نور+بدله+222+333",
                " بنجالين",
                " بوبلين",
                " شيفون",
                " قميص مقلم",
                " زارا كريب",
                " سكوبا كريب",
                " روزالين",
                " رويال",
                "براش",
                " شاين",
                " كريب ايطالى",
                " روتانا"
        };

        for (int i = 0; i < letex_types.length; i++)
        {
            customers_model = new Customers_model(letex_types[i]);
            letex_types_list.add(customers_model);
        }
        adapter = new Types_Customers_Adapter(letex_types_list);
        recyclerView.setAdapter(adapter);
    }
}
