package com.example.agenda.Adapters;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.agenda.Activities.Letex_Types;
import com.example.agenda.Activities.Masn3_Types;
import com.example.agenda.Activities.Persons;
import com.example.agenda.Activities.Types_Customers;
import com.example.agenda.Models.Customers_model;
import com.example.agenda.Models.Types_Model;
import com.example.agenda.R;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Customers_Adapter extends RecyclerView.Adapter<Customers_Adapter.CustomersVH> {
    List<Customers_model> customers;
    int type;
    String person;
    List<Types_Model> types;
    public Customers_Adapter(List<Customers_model> customers) {
        this.customers = customers;
    }
    @NonNull
    @Override
    public CustomersVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.customer_item,null);
        return new CustomersVH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final CustomersVH holder, int position) {
        Customers_model customers_model = customers.get(position);
        holder.customers_name.setText(customers_model.getName());
        holder.id.setText(String.valueOf(position+1));
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(holder.customers_name.getText().equals("المصنع")){
                    type = 1;
                    Intent intent = new Intent(view.getContext(), Masn3_Types.class);
                    view.getContext().startActivity(intent);
                }else if (holder.customers_name.getText().equals("لي تكس")){
                    type = 2;
                    Intent intent = new Intent(view.getContext(), Letex_Types.class);
                    view.getContext().startActivity(intent);
                }else if(holder.customers_name.getText().equals("هشام عبدالدايم")){
                    person = "هشام عبدالدايم";
                    Intent intent = new Intent(view.getContext(), Persons.class);
                    intent.putExtra("person",person);
                    view.getContext().startActivity(intent);
                }else if(holder.customers_name.getText().equals("مايكل شحاته")){
                    person = "مايكل شحاته";
                    Intent intent = new Intent(view.getContext(), Persons.class);
                    intent.putExtra("person",person);
                    view.getContext().startActivity(intent);
                }else if(holder.customers_name.getText().equals("على + عبد الله ابو سعده")){
                    person = "على + عبد الله ابو سعده";
                    Intent intent = new Intent(view.getContext(), Persons.class);
                    intent.putExtra("person",person);
                    view.getContext().startActivity(intent);
                }else if(holder.customers_name.getText().equals("عونى العجمى")){
                    person = "عونى العجمى";
                    Intent intent = new Intent(view.getContext(), Persons.class);
                    intent.putExtra("person",person);
                    view.getContext().startActivity(intent);
                }else if(holder.customers_name.getText().equals("عاطف بسيونى")){
                    person = "عاطف بسيونى";
                    Intent intent = new Intent(view.getContext(), Persons.class);
                    intent.putExtra("person",person);
                    view.getContext().startActivity(intent);
                }else if(holder.customers_name.getText().equals("خالد فهمى")){
                    person = "خالد فهمى";
                    Intent intent = new Intent(view.getContext(), Persons.class);
                    intent.putExtra("person",person);
                    view.getContext().startActivity(intent);
                }else if(holder.customers_name.getText().equals("ديفيد حنا")){
                    person = "ديفيد حنا";
                    Intent intent = new Intent(view.getContext(), Persons.class);
                    intent.putExtra("person",person);
                    view.getContext().startActivity(intent);
                }else if(holder.customers_name.getText().equals("محمد سعد")){
                    person = "محمد سعد";
                    Intent intent = new Intent(view.getContext(), Persons.class);
                    intent.putExtra("person",person);
                    view.getContext().startActivity(intent);
                }else if(holder.customers_name.getText().equals("شركه ترست")){
                    person = "شركه ترست";
                    Intent intent = new Intent(view.getContext(), Persons.class);
                    intent.putExtra("person",person);
                    view.getContext().startActivity(intent);
                }else if(holder.customers_name.getText().equals("عبدالمنعم الأشرم")){
                    person = "عبدالمنعم الاشرم";
                    Intent intent = new Intent(view.getContext(), Persons.class);
                    intent.putExtra("person",person);
                    view.getContext().startActivity(intent);
                }else if(holder.customers_name.getText().equals("محمود عبد الباسط")){
                    person = "محمود عبد الباسط";
                    Intent intent = new Intent(view.getContext(), Persons.class);
                    intent.putExtra("person",person);
                    view.getContext().startActivity(intent);
                }else if(holder.customers_name.getText().equals("خلف سالم")){
                    person = "خلف سالم";
                    Intent intent = new Intent(view.getContext(), Persons.class);
                    intent.putExtra("person",person);
                    view.getContext().startActivity(intent);
                }else if(holder.customers_name.getText().equals("محمد قرنى")){
                    person = "محمد قرنى";
                    Intent intent = new Intent(view.getContext(), Persons.class);
                    intent.putExtra("person",person);
                    view.getContext().startActivity(intent);
                }else if(holder.customers_name.getText().equals("رشاد قرنى")){
                    person = "رشاد قرنى";
                    Intent intent = new Intent(view.getContext(), Persons.class);
                    intent.putExtra("person",person);
                    view.getContext().startActivity(intent);
                }else if(holder.customers_name.getText().equals("عماد ابو القاسم")){
                    person = "عماد ابو القاسم";
                    Intent intent = new Intent(view.getContext(), Persons.class);
                    intent.putExtra("person",person);
                    view.getContext().startActivity(intent);
                }else if(holder.customers_name.getText().equals("وائل سعد")){
                    person = "وائل سعد";
                    Intent intent = new Intent(view.getContext(), Persons.class);
                    intent.putExtra("person",person);
                    view.getContext().startActivity(intent);
                }else if(holder.customers_name.getText().equals("جلال الحسينى")){
                    person = "جلال الحسينى";
                    Intent intent = new Intent(view.getContext(), Persons.class);
                    intent.putExtra("person",person);
                    view.getContext().startActivity(intent);
                }else if(holder.customers_name.getText().equals("عبدالله العربى")){
                    person = "عبدالله العربى";
                    Intent intent = new Intent(view.getContext(), Persons.class);
                    intent.putExtra("person",person);
                    view.getContext().startActivity(intent);
                }else if(holder.customers_name.getText().equals("وائل عبد الوهاب")){
                    person = "وائل عبد الوهاب";
                    Intent intent = new Intent(view.getContext(), Persons.class);
                    intent.putExtra("person",person);
                    view.getContext().startActivity(intent);
                }else if(holder.customers_name.getText().equals("ايمن خشبه")){
                    person = "ايمن خشبه";
                    Intent intent = new Intent(view.getContext(), Persons.class);
                    intent.putExtra("person",person);
                    view.getContext().startActivity(intent);
                }else if(holder.customers_name.getText().equals("الصفوه")){
                    person = "الصفوه";
                    Intent intent = new Intent(view.getContext(), Persons.class);
                    intent.putExtra("person",person);
                    view.getContext().startActivity(intent);
                }else if(holder.customers_name.getText().equals("اسامه الشيخ")){
                    person = "اسامه الشيخ";
                    Intent intent = new Intent(view.getContext(), Persons.class);
                    intent.putExtra("person",person);
                    view.getContext().startActivity(intent);
                }else if(holder.customers_name.getText().equals("بلال تكس")){
                    person = "بلال تكس";
                    Intent intent = new Intent(view.getContext(), Persons.class);
                    intent.putExtra("person",person);
                    view.getContext().startActivity(intent);
                }else if(holder.customers_name.getText().equals("الدمياطى")){
                    person = "الدمياطى";
                    Intent intent = new Intent(view.getContext(), Persons.class);
                    intent.putExtra("person",person);
                    view.getContext().startActivity(intent);
                }else if(holder.customers_name.getText().equals("شادى تكس")){
                    person = "شادى تكس";
                    Intent intent = new Intent(view.getContext(), Persons.class);
                    intent.putExtra("person",person);
                    view.getContext().startActivity(intent);
                }else if(holder.customers_name.getText().equals("اشرف البرنس")){
                    person = "اشرف البرنس";
                    Intent intent = new Intent(view.getContext(), Persons.class);
                    intent.putExtra("person",person);
                    view.getContext().startActivity(intent);
                }else if(holder.customers_name.getText().equals("احمد غالى")){
                    person = "احمد غالى";
                    Intent intent = new Intent(view.getContext(), Persons.class);
                    intent.putExtra("person",person);
                    view.getContext().startActivity(intent);
                } else if(holder.customers_name.getText().equals("عبده الصباغ")){
                    person = "عبده الصباغ";
                    Intent intent = new Intent(view.getContext(), Persons.class);
                    intent.putExtra("person",person);
                    view.getContext().startActivity(intent);
                }else if(holder.customers_name.getText().equals("محمد الفقى")){
                    person = "محمد الفقى";
                    Intent intent = new Intent(view.getContext(), Persons.class);
                    intent.putExtra("person",person);
                    view.getContext().startActivity(intent);
                }else if(holder.customers_name.getText().equals("وليد الصباحى")){
                    person = "وليد الصباحى";
                    Intent intent = new Intent(view.getContext(), Persons.class);
                    intent.putExtra("person",person);
                    view.getContext().startActivity(intent);
                }else if(holder.customers_name.getText().equals("هشام هلال")){
                    person = "هشام هلال";
                    Intent intent = new Intent(view.getContext(), Persons.class);
                    intent.putExtra("person",person);
                    view.getContext().startActivity(intent);
                }else if(holder.customers_name.getText().equals("شريف الصدفى")){
                    person = "شريف الصدفى";
                    Intent intent = new Intent(view.getContext(), Persons.class);
                    intent.putExtra("person",person);
                    view.getContext().startActivity(intent);
                }else if(holder.customers_name.getText().equals("اشرف رزق")){
                    person = "اشرف رزق";
                    Intent intent = new Intent(view.getContext(), Persons.class);
                    intent.putExtra("person",person);
                    view.getContext().startActivity(intent);
                }else if(holder.customers_name.getText().equals("حسام عبدالفتاح")){
                    person = "حسام عبدالفتاح";
                    Intent intent = new Intent(view.getContext(), Persons.class);
                    intent.putExtra("person",person);
                    view.getContext().startActivity(intent);
                }else if(holder.customers_name.getText().equals("سعيد فؤاد")){
                    person = "سعيد فؤاد";
                    Intent intent = new Intent(view.getContext(), Persons.class);
                    intent.putExtra("person",person);
                    view.getContext().startActivity(intent);
                }else if(holder.customers_name.getText().equals("هشام يوسف")){
                    person = "هشام يوسف";
                    Intent intent = new Intent(view.getContext(), Persons.class);
                    intent.putExtra("person",person);
                    view.getContext().startActivity(intent);
                }else if(holder.customers_name.getText().equals("احمد الغنيمى")){
                    person = "احمد الغنيمى";
                    Intent intent = new Intent(view.getContext(), Persons.class);
                    intent.putExtra("person",person);
                    view.getContext().startActivity(intent);
                }else if(holder.customers_name.getText().equals("محسن عامر")){
                    person = "محسن عامر";
                    Intent intent = new Intent(view.getContext(), Persons.class);
                    intent.putExtra("person",person);
                    view.getContext().startActivity(intent);
                }else if(holder.customers_name.getText().equals("محمد خليفه")){
                    person = "محمد خليفه";
                    Intent intent = new Intent(view.getContext(), Persons.class);
                    intent.putExtra("person",person);
                    view.getContext().startActivity(intent);
                }else if(holder.customers_name.getText().equals("سمير البطل")){
                    person = "سمير البطل";
                    Intent intent = new Intent(view.getContext(), Persons.class);
                    intent.putExtra("person",person);
                    view.getContext().startActivity(intent);
                }else if(holder.customers_name.getText().equals("ابو سلطوح")){
                    person = "ابو سلطوح";
                    Intent intent = new Intent(view.getContext(), Persons.class);
                    intent.putExtra("person",person);
                    view.getContext().startActivity(intent);
                }else if(holder.customers_name.getText().equals("اسامه جاب الله")){
                    person = "اسامه جاب الله";
                    Intent intent = new Intent(view.getContext(), Persons.class);
                    intent.putExtra("person",person);
                    view.getContext().startActivity(intent);
                }else if(holder.customers_name.getText().equals("محمود عبد المولى")){
                    person = "محمود عبد المولى";
                    Intent intent = new Intent(view.getContext(), Persons.class);
                    intent.putExtra("person",person);
                    view.getContext().startActivity(intent);
                }else if(holder.customers_name.getText().equals("طاهر عفيفى")){
                    person = "طاهر عفيفى";
                    Intent intent = new Intent(view.getContext(), Persons.class);
                    intent.putExtra("person",person);
                    view.getContext().startActivity(intent);
                }else if(holder.customers_name.getText().equals("احمد عنتر")){
                    person = "احمد عنتر";
                    Intent intent = new Intent(view.getContext(), Persons.class);
                    intent.putExtra("person",person);
                    view.getContext().startActivity(intent);
                }else if(holder.customers_name.getText().equals("عماد عابدين")){
                    person = "عماد عابدين";
                    Intent intent = new Intent(view.getContext(), Persons.class);
                    intent.putExtra("person",person);
                    view.getContext().startActivity(intent);
                }else if(holder.customers_name.getText().equals("اسبرانتو جينز")){
                    person = "اسبرانتو جينز";
                    Intent intent = new Intent(view.getContext(), Persons.class);
                    intent.putExtra("person",person);
                    view.getContext().startActivity(intent);
                }else if(holder.customers_name.getText().equals("احمد محرز")){
                    person = "احمد محرز";
                    Intent intent = new Intent(view.getContext(), Persons.class);
                    intent.putExtra("person",person);
                    view.getContext().startActivity(intent);
                }else if(holder.customers_name.getText().equals("انطوان زخارى")){
                    person = "انطوان زخارى";
                    Intent intent = new Intent(view.getContext(), Persons.class);
                    intent.putExtra("person",person);
                    view.getContext().startActivity(intent);
                }else if(holder.customers_name.getText().equals("مصنع رياض")){
                    person = "مصنع رياض";
                    Intent intent = new Intent(view.getContext(), Persons.class);
                    intent.putExtra("person",person);
                    view.getContext().startActivity(intent);
                }else if(holder.customers_name.getText().equals("احمد زيان(شادي تكس)")){
                    person = "احمد زيان(شادي تكس)";
                    Intent intent = new Intent(view.getContext(), Persons.class);
                    intent.putExtra("person",person);
                    view.getContext().startActivity(intent);
                }else if(holder.customers_name.getText().equals("عبدالله قراوش")){
                    person = "عبدالله قراوش";
                    Intent intent = new Intent(view.getContext(), Persons.class);
                    intent.putExtra("person",person);
                    view.getContext().startActivity(intent);
                }else if(holder.customers_name.getText().equals("جينز تكس")){
                    person = "جينز تكس";
                    Intent intent = new Intent(view.getContext(), Persons.class);
                    intent.putExtra("person",person);
                    view.getContext().startActivity(intent);
                }else if(holder.customers_name.getText().equals("احمد العزب")){
                    person = "احمد عزب";
                    Intent intent = new Intent(view.getContext(), Persons.class);
                    intent.putExtra("person",person);
                    view.getContext().startActivity(intent);
                }else if(holder.customers_name.getText().equals("محمد جاويش")){
                    person = "محمد جاويش";
                    Intent intent = new Intent(view.getContext(), Persons.class);
                    intent.putExtra("person",person);
                    view.getContext().startActivity(intent);
                }else if(holder.customers_name.getText().equals("محيى الدين")){
                    person = "محيى الدين";
                    Intent intent = new Intent(view.getContext(), Persons.class);
                    intent.putExtra("person",person);
                    view.getContext().startActivity(intent);
                }else if(holder.customers_name.getText().equals("احمد حسين")){
                    person = "احمد حسين";
                    Intent intent = new Intent(view.getContext(), Persons.class);
                    intent.putExtra("person",person);
                    view.getContext().startActivity(intent);
                }else if(holder.customers_name.getText().equals("محمد ابو غزاله")){
                    person = "محمد ابو غزاله";
                    Intent intent = new Intent(view.getContext(), Persons.class);
                    intent.putExtra("person",person);
                    view.getContext().startActivity(intent);
                }else if(holder.customers_name.getText().equals("الرجبى")){
                    person = "الرجبى";
                    Intent intent = new Intent(view.getContext(), Persons.class);
                    intent.putExtra("person",person);
                    view.getContext().startActivity(intent);
                }else if(holder.customers_name.getText().equals("اسامه جرجس")){
                    person = "اسامه جرجس";
                    Intent intent = new Intent(view.getContext(), Persons.class);
                    intent.putExtra("person",person);
                    view.getContext().startActivity(intent);
                }else if(holder.customers_name.getText().equals("مصنع مكى")){
                    person = "مصنع مكى";
                    Intent intent = new Intent(view.getContext(), Persons.class);
                    intent.putExtra("person",person);
                    view.getContext().startActivity(intent);
                }else if(holder.customers_name.getText().equals("فايز يونس")){
                    person = "فايز يونس";
                    Intent intent = new Intent(view.getContext(), Persons.class);
                    intent.putExtra("person",person);
                    view.getContext().startActivity(intent);
                }else if(holder.customers_name.getText().equals("عادل النجار")){
                    person = "عادل النجار";
                    Intent intent = new Intent(view.getContext(), Persons.class);
                    intent.putExtra("person",person);
                    view.getContext().startActivity(intent);
                }else if(holder.customers_name.getText().equals("عبد الرحمن الفقى")){
                    person = "عبد الرحمن الفقى";
                    Intent intent = new Intent(view.getContext(), Persons.class);
                    intent.putExtra("person",person);
                    view.getContext().startActivity(intent);
                }else if(holder.customers_name.getText().equals("عبور الشام")){
                    person = "عبور الشام";
                    Intent intent = new Intent(view.getContext(), Persons.class);
                    intent.putExtra("person",person);
                    view.getContext().startActivity(intent);
                }else if(holder.customers_name.getText().equals("عادل الجندى")){
                    person = "عادل الجندى";
                    Intent intent = new Intent(view.getContext(), Persons.class);
                    intent.putExtra("person",person);
                    view.getContext().startActivity(intent);
                }else if(holder.customers_name.getText().equals("محسن الخولى")){
                    person = "محسن الخولى";
                    Intent intent = new Intent(view.getContext(), Persons.class);
                    intent.putExtra("person",person);
                    view.getContext().startActivity(intent);
                }else if(holder.customers_name.getText().equals("محمد ابراهيم")){
                    person = "محمد ابراهيم";
                    Intent intent = new Intent(view.getContext(), Persons.class);
                    intent.putExtra("person",person);
                    view.getContext().startActivity(intent);
                }else if(holder.customers_name.getText().equals("هانى عقيل")){
                    person = "هانى عقيل";
                    Intent intent = new Intent(view.getContext(), Persons.class);
                    intent.putExtra("person",person);
                    view.getContext().startActivity(intent);
                }else if(holder.customers_name.getText().equals("عبدالله عزب(عزب تكس)")){
                    person = "عبدالله عزب(عزب تكس)";
                    Intent intent = new Intent(view.getContext(), Persons.class);
                    intent.putExtra("person",person);
                    view.getContext().startActivity(intent);
                }else if(holder.customers_name.getText().equals("اسامه عمران")){
                    person = "اسامه عمران";
                    Intent intent = new Intent(view.getContext(), Persons.class);
                    intent.putExtra("person",person);
                    view.getContext().startActivity(intent);
                }else if(holder.customers_name.getText().equals("الوزان")){
                    person = "الوزان";
                    Intent intent = new Intent(view.getContext(), Persons.class);
                    intent.putExtra("person",person);
                    view.getContext().startActivity(intent);
                }else if(holder.customers_name.getText().equals("هانى المليجى")){
                    person = "هانى المليجى";
                    Intent intent = new Intent(view.getContext(), Persons.class);
                    intent.putExtra("person",person);
                    view.getContext().startActivity(intent);
                }else if(holder.customers_name.getText().equals("جابر حجازى")){
                    person = "جابر حجازى";
                    Intent intent = new Intent(view.getContext(), Persons.class);
                    intent.putExtra("person",person);
                    view.getContext().startActivity(intent);
                }else if(holder.customers_name.getText().equals("ناصر السوهاجى")){
                    person = "ناصر السوهاجى";
                    Intent intent = new Intent(view.getContext(), Persons.class);
                    intent.putExtra("person",person);
                    view.getContext().startActivity(intent);
                }else if(holder.customers_name.getText().equals("محمد تره")){
                    person = "محمد تره";
                    Intent intent = new Intent(view.getContext(), Persons.class);
                    intent.putExtra("person",person);
                    view.getContext().startActivity(intent);
                }else if(holder.customers_name.getText().equals("محمد السخاوى")){
                    person = "محمد السخاوى";
                    Intent intent = new Intent(view.getContext(), Persons.class);
                    intent.putExtra("person",person);
                    view.getContext().startActivity(intent);
                }else if(holder.customers_name.getText().equals("الفولى")){
                    person = "الفولى";
                    Intent intent = new Intent(view.getContext(), Persons.class);
                    intent.putExtra("person",person);
                    view.getContext().startActivity(intent);
                }else if(holder.customers_name.getText().equals("حسن مرجان")){
                    person = "حسن مرجان";
                    Intent intent = new Intent(view.getContext(), Persons.class);
                    intent.putExtra("person",person);
                    view.getContext().startActivity(intent);
                }else if(holder.customers_name.getText().equals("اسماعيل عبود")){
                    person = "اسماعيل عبود";
                    Intent intent = new Intent(view.getContext(), Persons.class);
                    intent.putExtra("person",person);
                    view.getContext().startActivity(intent);
                }else if(holder.customers_name.getText().equals("الاشرم")){
                    person = "الاشرم";
                    Intent intent = new Intent(view.getContext(), Persons.class);
                    intent.putExtra("person",person);
                    view.getContext().startActivity(intent);
                }else if(holder.customers_name.getText().equals("مجدى ناصف")){
                    person = "مجدى ناصف";
                    Intent intent = new Intent(view.getContext(), Persons.class);
                    intent.putExtra("person",person);
                    view.getContext().startActivity(intent);
                }else if(holder.customers_name.getText().equals("تامر +ابراهيم الغنام")){
                    person = "تامر +ابراهيم الغنام";
                    Intent intent = new Intent(view.getContext(), Persons.class);
                    intent.putExtra("person",person);
                    view.getContext().startActivity(intent);
                }else if(holder.customers_name.getText().equals("جاك جبره(فايق تكس)")){
                    person = "جاك جبره(فايق تكس)";
                    Intent intent = new Intent(view.getContext(), Persons.class);
                    intent.putExtra("person",person);
                    view.getContext().startActivity(intent);
                }else if(holder.customers_name.getText().equals("هشام شامل")){
                    person = "هشام شامل";
                    Intent intent = new Intent(view.getContext(), Persons.class);
                    intent.putExtra("person",person);
                    view.getContext().startActivity(intent);
                }else if(holder.customers_name.getText().equals("ايهاب العتال")){
                    person = "ايهاب العتال";
                    Intent intent = new Intent(view.getContext(), Persons.class);
                    intent.putExtra("person",person);
                    view.getContext().startActivity(intent);
                }else if(holder.customers_name.getText().equals("عبد الفتاح الناتعى")){
                    person = "عبد الفتاح الناتعى";
                    Intent intent = new Intent(view.getContext(), Persons.class);
                    intent.putExtra("person",person);
                    view.getContext().startActivity(intent);
                }else if(holder.customers_name.getText().equals("وائل سعد")){
                    person = "وائل سعد";
                    Intent intent = new Intent(view.getContext(), Persons.class);
                    intent.putExtra("person",person);
                    view.getContext().startActivity(intent);
                }else if(holder.customers_name.getText().equals("محمد عبد السلام")){
                    person = "محمد عبد السلام";
                    Intent intent = new Intent(view.getContext(), Persons.class);
                    intent.putExtra("person",person);
                    view.getContext().startActivity(intent);
                }else if(holder.customers_name.getText().equals("وجيه عجايبى")){
                    person = "وجيه عجايبى";
                    Intent intent = new Intent(view.getContext(), Persons.class);
                    intent.putExtra("person",person);
                    view.getContext().startActivity(intent);
                }else if(holder.customers_name.getText().equals("محمود غانم")){
                    person = "محمود غانم";
                    Intent intent = new Intent(view.getContext(), Persons.class);
                    intent.putExtra("person",person);
                    view.getContext().startActivity(intent);
                }else if(holder.customers_name.getText().equals("عبد القادر رياض")){
                    person = "عبد القادر رياض";
                    Intent intent = new Intent(view.getContext(), Persons.class);
                    intent.putExtra("person",person);
                    view.getContext().startActivity(intent);
                }else if(holder.customers_name.getText().equals("احمد عشماوى")){
                    person = "احمد عشماوى";
                    Intent intent = new Intent(view.getContext(), Persons.class);
                    intent.putExtra("person",person);
                    view.getContext().startActivity(intent);
                }else if(holder.customers_name.getText().equals("حازم حسن(200)")){
                    person = "حازم حسن(200)";
                    Intent intent = new Intent(view.getContext(), Persons.class);
                    intent.putExtra("person",person);
                    view.getContext().startActivity(intent);
                }else if(holder.customers_name.getText().equals("سامر عبد المنعم")){
                    person = "سامر عبد المنعم";
                    Intent intent = new Intent(view.getContext(), Persons.class);
                    intent.putExtra("person",person);
                    view.getContext().startActivity(intent);
                }else if(holder.customers_name.getText().equals("اسكاى توب")){
                    person = "سكاى توب";
                    Intent intent = new Intent(view.getContext(), Persons.class);
                    intent.putExtra("person",person);
                    view.getContext().startActivity(intent);
                }else if(holder.customers_name.getText().equals("هشام هلال")){
                    person = "هشام هلال";
                    Intent intent = new Intent(view.getContext(), Persons.class);
                    intent.putExtra("person",person);
                    view.getContext().startActivity(intent);
                }else if(holder.customers_name.getText().equals("حامد عيسى")){
                    person = "حامد عيسى";
                    Intent intent = new Intent(view.getContext(), Persons.class);
                    intent.putExtra("person",person);
                    view.getContext().startActivity(intent);
                }else if(holder.customers_name.getText().equals("اشرف الموجى")){
                    person = "اشرف الموجى";
                    Intent intent = new Intent(view.getContext(), Persons.class);
                    intent.putExtra("person",person);
                    view.getContext().startActivity(intent);
                }else if(holder.customers_name.getText().equals("كندوره")){
                    person = "كندوره";
                    Intent intent = new Intent(view.getContext(), Persons.class);
                    intent.putExtra("person",person);
                    view.getContext().startActivity(intent);
                }else if(holder.customers_name.getText().equals("جمال ابو زيد")){
                    person = "جمال ابو زيد";
                    Intent intent = new Intent(view.getContext(), Persons.class);
                    intent.putExtra("person",person);
                    view.getContext().startActivity(intent);
                }else if(holder.customers_name.getText().equals("محمد عبد المغنى")){
                    person = "محمد عبد المغنى";
                    Intent intent = new Intent(view.getContext(), Persons.class);
                    intent.putExtra("person",person);
                    view.getContext().startActivity(intent);
                }else if(holder.customers_name.getText().equals("وليد الحامولى")){
                    person = "وليد الحامولى";
                    Intent intent = new Intent(view.getContext(), Persons.class);
                    intent.putExtra("person",person);
                    view.getContext().startActivity(intent);
                }else if(holder.customers_name.getText().equals("اشرف الباشا")){
                    person = "اشرف الباشا";
                    Intent intent = new Intent(view.getContext(), Persons.class);
                    intent.putExtra("person",person);
                    view.getContext().startActivity(intent);
                }else if(holder.customers_name.getText().equals("محمد ابو الخير")){
                    person = "محمد ابو الخير";
                    Intent intent = new Intent(view.getContext(), Persons.class);
                    intent.putExtra("person",person);
                    view.getContext().startActivity(intent);
                }else if(holder.customers_name.getText().equals("عبدالمجيد هلال")){
                    person = "عبدالمجيد هلال";
                    Intent intent = new Intent(view.getContext(), Persons.class);
                    intent.putExtra("person",person);
                    view.getContext().startActivity(intent);
                }else if(holder.customers_name.getText().equals("رامى ابراهيم")){
                    person = "رامى ابراهيم";
                    Intent intent = new Intent(view.getContext(), Persons.class);
                    intent.putExtra("person",person);
                    view.getContext().startActivity(intent);
                }else if(holder.customers_name.getText().equals("محمود زهران")){
                    person = "محمود زهران";
                    Intent intent = new Intent(view.getContext(), Persons.class);
                    intent.putExtra("person",person);
                    view.getContext().startActivity(intent);
                }else if(holder.customers_name.getText().equals("خاطر العرابى")){
                    person = "خاطر العرابى";
                    Intent intent = new Intent(view.getContext(), Persons.class);
                    intent.putExtra("person",person);
                    view.getContext().startActivity(intent);
                }else if(holder.customers_name.getText().equals("محمد عبده")){
                    person = "محمد عبده";
                    Intent intent = new Intent(view.getContext(), Persons.class);
                    intent.putExtra("person",person);
                    view.getContext().startActivity(intent);
                }else if(holder.customers_name.getText().equals("عبداللطيف الشيخ")){
                    person = "عبداللطيف الشيخ";
                    Intent intent = new Intent(view.getContext(), Persons.class);
                    intent.putExtra("person",person);
                    view.getContext().startActivity(intent);
                }else if(holder.customers_name.getText().equals("يوسف تكس")){
                    person = "يوسف تكس";
                    Intent intent = new Intent(view.getContext(), Persons.class);
                    intent.putExtra("person",person);
                    view.getContext().startActivity(intent);
                }else if(holder.customers_name.getText().equals("احمد عزام")){
                    person = "احمد عزام";
                    Intent intent = new Intent(view.getContext(), Persons.class);
                    intent.putExtra("person",person);
                    view.getContext().startActivity(intent);
                }else if(holder.customers_name.getText().equals("وليد الشافعى")){
                    person = "وليد الشافعى";
                    Intent intent = new Intent(view.getContext(), Persons.class);
                    intent.putExtra("person",person);
                    view.getContext().startActivity(intent);
                }else if(holder.customers_name.getText().equals("مصنع فريحه")){
                    person = "مصنع فريحه";
                    Intent intent = new Intent(view.getContext(), Persons.class);
                    intent.putExtra("person",person);
                    view.getContext().startActivity(intent);
                }else if(holder.customers_name.getText().equals("وليد الشوربجى")){
                    person = "وليد الشوربجى";
                    Intent intent = new Intent(view.getContext(), Persons.class);
                    intent.putExtra("person",person);
                    view.getContext().startActivity(intent);
                }else if(holder.customers_name.getText().equals("محمد خورشيد")){
                    person = "محمد خورشيد";
                    Intent intent = new Intent(view.getContext(), Persons.class);
                    intent.putExtra("person",person);
                    view.getContext().startActivity(intent);
                }else if(holder.customers_name.getText().equals("محمد السبخاوى")){
                    person = "محمد السبخاوى";
                    Intent intent = new Intent(view.getContext(), Persons.class);
                    intent.putExtra("person",person);
                    view.getContext().startActivity(intent);
                }

            }
        });
    }

    @Override
    public int getItemCount() {
        return customers.size();
    }

    public class CustomersVH extends RecyclerView.ViewHolder {
        TextView customers_name,id;
        public CustomersVH(@NonNull View itemView) {
            super(itemView);
            customers_name = itemView.findViewById(R.id.name);
            id = itemView.findViewById(R.id.id);
        }
    }
}
