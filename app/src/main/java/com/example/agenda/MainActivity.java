package com.example.agenda;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

import com.example.agenda.Adapters.Customers_Adapter;
import com.example.agenda.Models.Customers_model;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    TextView name,id;
    Customers_model customers_model;
    List<Customers_model> customers;
    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    DividerItemDecoration dividerItemDecoration;
    Customers_Adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        customers = new ArrayList<>();
        recyclerView = findViewById(R.id.recyclerview);
        layoutManager = new LinearLayoutManager(getApplicationContext(), RecyclerView.VERTICAL, false);
        dividerItemDecoration = new DividerItemDecoration(getApplicationContext(), DividerItemDecoration.VERTICAL);
        recyclerView.addItemDecoration(dividerItemDecoration);
        recyclerView.setLayoutManager(layoutManager);
        String[] names = new String[]{
                "المصنع",
                "لي تكس",
                "هشام عبدالدايم",
                "مايكل شحاته",
                "على + عبد الله ابو سعده",
                "عونى العجمى",
                "عاطف بسيونى",
                "خالد فهمى",
                "ديفيد حنا",
                "محمد سعد",
                "شركه ترست",
                "محمود عبد الباسط",
                "خلف سالم",
                "محمد قرنى",
                "رشاد قرنى",
                "عماد ابو القاسم",
                "وائل سعد",
                "جلال الحسينى",
                "عبدالله العربى",
                "وائل عبد الوهاب",
                "ايمن خشبه",
                "الصفوه",
                "اسامه الشيخ",
                "بلال تكس",
                "الدمياطى",
                "شادى تكس",
                "اشرف البرنس",
                "احمد غالى",
                "حسام عبدالفتاح",
                "سعيد فؤاد",
                "هشام يوسف",
                "احمد الغنيمى",
                "محسن عامر",
                "محمد خليفه",
                "سمير البطل",
                "ابو سلطوح",
                "اسامه جاب الله",
                "محمود عبد المولى",
                "طاهر عفيفى",
                "احمد عنتر",
                "عماد عابدين",
                "اسبرانتو جينز",
                "احمد محرز",
                "انطوان زخارى",
                "احمد زيان(شادي تكس)",
                "مصنع رياض",
                "عبدالله قراوش",
                "جينز تكس",
                "احمد العزب",
                "محمد جاويش",
                "محيى الدين",
                "احمد حسين",
                "محمد ابو غزاله",
                "الرجبى",
                "اسامه جرجس",
                "مصنع مكى",
                "فايز يونس",
                "عادل النجار",
                "عبد الرحمن الفقى",
                "عبور الشام",
                "عادل الجندى",
                "محسن الخولى",
                "محمد ابراهيم",
                "هانى عقيل",
                "عبدالله عزب(عزب تكس)",
                "اسامه عمران",
                "الوزان",
                "هانى المليجى",
                "جابر حجازى",
                "ناصر السوهاجى",
                "محمد تره",
                "محمد السخاوى",
                "الفولى",
                "حسن مرجان",
                "اسماعيل عبود",
                "الاشرم",
                "مجدى ناصف",
                "تامر +ابراهيم الغنام",
                "جاك جبره(فايق تكس)",
                "هشام شامل",
                "ايهاب العتال",
                "عبد الفتاح الناتعى",
                "وائل سعد",
                "محمد عبد السلام",
                "وجيه عجايبى",
                "محمود غانم",
                "عبدالقادر رياض",
                "احمد عشماوى",
                "بلال تكس",
                "حازم حسن(200)",
                "سامر عبد المنعم",
                "اسكاى توب",
                "هشام هلال",
                "حامد عيسى",
                "اشرف الموجى",
                "كندوره",
                "جمال ابو زيد",
                "محمد عبد المغنى",
                "وليد الحامولى",
                "محمد الفقى",
                "اشرف رزق",
                "عبده الصباغ",
                "شريف الصدفى",
                "وليد الصباحى",
                "هشام هلال",
                "اشرف الباشا",
                "محمد ابو الخير",
                "عبدالمجيد هلال",
                "رامى ابراهيم",
                "محمود زهران",
                "خاطر العرابى",
                "محمد عبده",
                "عبداللطيف الشيخ",
                "يوسف تكس",
                "احمد عزام",
                "وليد الشافعى",
                "مصنع فريحه",
                "وليد الشوربجى",
                "محمد خورشيد",
                "محمد السبخاوى"

        };
        for (int i = 0; i < names.length; i++)
        {
            Customers_model customers_model = new Customers_model(names[i]);
            customers.add(customers_model);
        }
        adapter = new Customers_Adapter(customers);
        recyclerView.setAdapter(adapter);
    }

}
