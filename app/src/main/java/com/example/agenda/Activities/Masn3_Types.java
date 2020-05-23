package com.example.agenda.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.example.agenda.Adapters.Customers_Adapter;
import com.example.agenda.Adapters.Types_Customers_Adapter;
import com.example.agenda.Models.Customers_model;
import com.example.agenda.R;

import java.util.ArrayList;
import java.util.List;

public class Masn3_Types extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    DividerItemDecoration dividerItemDecoration;
    List<Customers_model> masn3_types_list,letex_types_list;
    Types_Customers_Adapter adapter;
    Customers_model customers_model;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_types);
        recyclerView = findViewById(R.id.recyclerview);
        masn3_types_list = new ArrayList<>();
        letex_types_list = new ArrayList<>();
        layoutManager = new LinearLayoutManager(getApplicationContext(), RecyclerView.VERTICAL,false);
        dividerItemDecoration = new DividerItemDecoration(getApplicationContext(),DividerItemDecoration.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.addItemDecoration(dividerItemDecoration);
        String[] elmasn3_types = new String[]{
                "40 40",
                "ميكروفايبر ووتر بروف",
                "جينز خفيف",
                "فسكوز حرق وبرة",
                "شيفون",
                "برنس",
                "جينز",
                "جينز 20",
                "جينز 50 50",
                "جينزمقلم+قطيفه ليكرا+مطبوع كارو",
                "جينز مطبوع",
                "80 80",
                "كريستال",
                "سبرانو",
                "جبردين",
                "جبردين مخلوط x مخلوط",
                "ميكروفايبر ووتر بروف مشحم",
                "براشوط",
                "ميكروفايبر بيتش",
                "لاكوست",
                "قميص مقلم",
                "شوفيت(تيتون)",
                "ميكانيك استرتش",
                "قميص + بوبلين ليكرا",
                "71 71 + مطبوع",
                "إيكو",
                "30 30",
                "جلابية ياباني",
                "بدلة + Boss + بيدبولا",
                "سروال",
                "75 75",
                "قميص موباكو",
                "موباكو محروق الوبره",
                "20 20+9999",
                "داكرون مخلوط",
                "بنطلون على",
                "فسكوز + فبران",
                "تنسل ليكرا سادة + مطبوع",
                "عباية سعودي",
                "مقلمات",
                "عباية مشبح",
                "جلابية",
                "ستان",
                "S140",
                "جاكيت توشيبا العربى",
                "نيو جاكيت 1",
                "نيو جاكيت 2",
                "نيو جاكيت 4",
                "نيو قميص",
                "بيكه",
                "بوبلين ليكرا",
                "نيو رويال مطبوع",
                "رويال",
                "70 70",
                "قميص كلاسيك",
                "جاكيت تركي",
                "50 50",
                "قميص حرق وبره",
                "عبايا سورى",
                "شاين+روز1+روز2",
                "فلافيل",
                "عبايا اطلس",
                "ميلتون",
                "كلاس",
                "بدر 2 "

        };

                for(int i = 0; i < elmasn3_types.length; i++)
                {
                    customers_model = new Customers_model(elmasn3_types[i]);
                    masn3_types_list.add(customers_model);
                }
        adapter = new Types_Customers_Adapter(masn3_types_list);
        recyclerView.setAdapter(adapter);
    }
}
