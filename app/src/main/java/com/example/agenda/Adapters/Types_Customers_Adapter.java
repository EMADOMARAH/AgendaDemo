package com.example.agenda.Adapters;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.agenda.Activities.Letex_Types;
import com.example.agenda.Activities.Masn3_Types;
import com.example.agenda.Activities.Types_Customers;
import com.example.agenda.Models.Customers_model;
import com.example.agenda.Models.Types_Model;
import com.example.agenda.R;

import java.util.List;

public class Types_Customers_Adapter extends RecyclerView.Adapter<Types_Customers_Adapter.Types_CustomersVH> {
    List<Customers_model> types;
    String no3;

    public Types_Customers_Adapter(List<Customers_model> types) {
        this.types = types;
    }

    @NonNull
    @Override
    public Types_CustomersVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.customer_item,null);
        return new Types_CustomersVH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final Types_CustomersVH holder, int position) {
        Customers_model customers_model = types.get(position);
        holder.type_name.setText(customers_model.getName());
        holder.id.setText(String.valueOf(position + 1));
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //بص يا سيدي هنا هتكتب اللي جوا المصنع او لي تكس بتروح تهندل من Types_Customers وبتضيف في الليست اللي انت عايزه بقي حسب الداتا اللي معاك
                //
                if(holder.type_name.getText().equals("40 40")){
                    Intent intent = new Intent(view.getContext(), Types_Customers.class);
                    no3 = "40 40";
                    intent.putExtra("type",no3);
                    view.getContext().startActivity(intent);
                }else if(holder.type_name.getText().equals("جينز خفيف")){
                    Intent intent = new Intent(view.getContext(), Types_Customers.class);
                    no3 = "جينز خفيف";
                    intent.putExtra("type",no3);
                    view.getContext().startActivity(intent);
                }else if(holder.type_name.getText().equals("ميكروفايبر ووتر بروف")){
                    Intent intent = new Intent(view.getContext(), Types_Customers.class);
                    no3 = "ميكروفايبر ووتر بروف";
                    intent.putExtra("type",no3);
                    view.getContext().startActivity(intent);
                }else if(holder.type_name.getText().equals("فسكوز حرق وبرة")){
                    Intent intent = new Intent(view.getContext(), Types_Customers.class);
                    no3 = "فسكوز حرق وبرة";
                    intent.putExtra("type",no3);
                    view.getContext().startActivity(intent);
                }else if(holder.type_name.getText().equals("شيفون")){
                    Intent intent = new Intent(view.getContext(), Types_Customers.class);
                    no3 = "شيفون";
                    intent.putExtra("type",no3);
                    view.getContext().startActivity(intent);
                }else if(holder.type_name.getText().equals("برنس")){
                    Intent intent = new Intent(view.getContext(), Types_Customers.class);
                    no3 = "برنس";
                    intent.putExtra("type",no3);
                    view.getContext().startActivity(intent);
                }else if(holder.type_name.getText().equals("جينز")){
                    Intent intent = new Intent(view.getContext(), Types_Customers.class);
                    no3 = "جينز";
                    intent.putExtra("type",no3);
                    view.getContext().startActivity(intent);
                }else if(holder.type_name.getText().equals("جينز 20")){
                    Intent intent = new Intent(view.getContext(), Types_Customers.class);
                    no3 = "جينز 20";
                    intent.putExtra("type",no3);
                    view.getContext().startActivity(intent);
                }else if(holder.type_name.getText().equals("جينزمقلم+قطيفه ليكرا+مطبوع كارو")){
                    Intent intent = new Intent(view.getContext(), Types_Customers.class);
                    no3 = "جينزمقلم+قطيفه ليكرا+مطبوع كارو";
                    intent.putExtra("type",no3);
                    view.getContext().startActivity(intent);
                }else if(holder.type_name.getText().equals("جينز مطبوع")){
                    Intent intent = new Intent(view.getContext(), Types_Customers.class);
                    no3 = "جينز مطبوع";
                    intent.putExtra("type",no3);
                    view.getContext().startActivity(intent);
                }else if(holder.type_name.getText().equals("جينز 50 50")){
                    Intent intent = new Intent(view.getContext(), Types_Customers.class);
                    no3 = "جينز 50 50";
                    intent.putExtra("type",no3);
                    view.getContext().startActivity(intent);
                }else if(holder.type_name.getText().equals("80 80")){
                    Intent intent = new Intent(view.getContext(), Types_Customers.class);
                    no3 = "80 80";
                    intent.putExtra("type",no3);
                    view.getContext().startActivity(intent);
                }else if(holder.type_name.getText().equals("كريستال")){
                    Intent intent = new Intent(view.getContext(), Types_Customers.class);
                    no3 = "كريستال";
                    intent.putExtra("type",no3);
                    view.getContext().startActivity(intent);
                }else if(holder.type_name.getText().equals("سبرانو")){
                    Intent intent = new Intent(view.getContext(), Types_Customers.class);
                    no3 = "سبرانو";
                    intent.putExtra("type",no3);
                    view.getContext().startActivity(intent);
                }else if(holder.type_name.getText().equals("جبردين")){
                    Intent intent = new Intent(view.getContext(), Types_Customers.class);
                    no3 = "جبردين";
                    intent.putExtra("type",no3);
                    view.getContext().startActivity(intent);
                }else if(holder.type_name.getText().equals("جبردين مخلوط x مخلوط")){
                    Intent intent = new Intent(view.getContext(), Types_Customers.class);
                    no3 = "جبردين مخلوط x مخلوط";
                    intent.putExtra("type",no3);
                    view.getContext().startActivity(intent);
                }else if(holder.type_name.getText().equals("ميكروفايبر ووتر بروف مشحم")){
                    Intent intent = new Intent(view.getContext(), Types_Customers.class);
                    no3 = "ميكروفايبر ووتر بروف مشحم";
                    intent.putExtra("type",no3);
                    view.getContext().startActivity(intent);
                }else if(holder.type_name.getText().equals("براشوط")){
                    Intent intent = new Intent(view.getContext(), Types_Customers.class);
                    no3 = "براشوط";
                    intent.putExtra("type",no3);
                    view.getContext().startActivity(intent);
                }else if(holder.type_name.getText().equals("ميكروفايبر بيتش")){
                    Intent intent = new Intent(view.getContext(), Types_Customers.class);
                    no3 = "ميكروفايبر بيتش";
                    intent.putExtra("type",no3);
                    view.getContext().startActivity(intent);
                }else if(holder.type_name.getText().equals("لاكوست")){
                    Intent intent = new Intent(view.getContext(), Types_Customers.class);
                    no3 = "لاكوست";
                    intent.putExtra("type",no3);
                    view.getContext().startActivity(intent);
                }else if(holder.type_name.getText().equals("قميص مقلم")){
                    Intent intent = new Intent(view.getContext(), Types_Customers.class);
                    no3 = "قميص مقلم";
                    intent.putExtra("type",no3);
                    view.getContext().startActivity(intent);
                }else if(holder.type_name.getText().equals("شوفيت(تيتون)")){
                    Intent intent = new Intent(view.getContext(), Types_Customers.class);
                    no3 = "شوفيت(تيتون)";
                    intent.putExtra("type",no3);
                    view.getContext().startActivity(intent);
                }else if(holder.type_name.getText().equals("ميكانيك استرتش")){
                    Intent intent = new Intent(view.getContext(), Types_Customers.class);
                    no3 = "ميكانيك استرتش";
                    intent.putExtra("type",no3);
                    view.getContext().startActivity(intent);
                }else if(holder.type_name.getText().equals("قميص + بوبلين ليكرا")){
                    Intent intent = new Intent(view.getContext(), Types_Customers.class);
                    no3 = "قميص + بوبلين ليكرا";
                    intent.putExtra("type",no3);
                    view.getContext().startActivity(intent);
                }else if(holder.type_name.getText().equals("71 71 + مطبوع")){
                    Intent intent = new Intent(view.getContext(), Types_Customers.class);
                    no3 = "71 71 + مطبوع";
                    intent.putExtra("type",no3);
                    view.getContext().startActivity(intent);
                }else if(holder.type_name.getText().equals("إيكو")){
                    Intent intent = new Intent(view.getContext(), Types_Customers.class);
                    no3 = "إيكو";
                    intent.putExtra("type",no3);
                    view.getContext().startActivity(intent);
                }else if(holder.type_name.getText().equals("30 30")){
                    Intent intent = new Intent(view.getContext(), Types_Customers.class);
                    no3 = "30 30";
                    intent.putExtra("type",no3);
                    view.getContext().startActivity(intent);
                }else if(holder.type_name.getText().equals("جلابية ياباني")){
                    Intent intent = new Intent(view.getContext(), Types_Customers.class);
                    no3 = "جلابية ياباني";
                    intent.putExtra("type",no3);
                    view.getContext().startActivity(intent);
                }else if(holder.type_name.getText().equals("بدلة + Boss + بيدبولا")){
                    Intent intent = new Intent(view.getContext(), Types_Customers.class);
                    no3 = "بدلة + Boss + بيدبولا";
                    intent.putExtra("type",no3);
                    view.getContext().startActivity(intent);
                }else if(holder.type_name.getText().equals("سروال")){
                    Intent intent = new Intent(view.getContext(), Types_Customers.class);
                    no3 = "سروال";
                    intent.putExtra("type",no3);
                    view.getContext().startActivity(intent);
                }else if(holder.type_name.getText().equals(" شاين")){
                    Intent intent = new Intent(view.getContext(), Types_Customers.class);
                    no3 = " شاين";
                    intent.putExtra("type",no3);
                    view.getContext().startActivity(intent);
                }else if(holder.type_name.getText().equals("ميلتون")){
                    Intent intent = new Intent(view.getContext(), Types_Customers.class);
                    no3 = "ميلتون";
                    intent.putExtra("type",no3);
                    view.getContext().startActivity(intent);
                }else if(holder.type_name.getText().equals("75 75")){
                    Intent intent = new Intent(view.getContext(), Types_Customers.class);
                    no3 = "75 75";
                    intent.putExtra("type",no3);
                    view.getContext().startActivity(intent);
                }else if(holder.type_name.getText().equals("قميص موباكو")){
                    Intent intent = new Intent(view.getContext(), Types_Customers.class);
                    no3 = "قميص موباكو";
                    intent.putExtra("type",no3);
                    view.getContext().startActivity(intent);
                }else if(holder.type_name.getText().equals("موباكو محروق الوبره")){
                    Intent intent = new Intent(view.getContext(), Types_Customers.class);
                    no3 = "موباكو محروق الوبره";
                    intent.putExtra("type",no3);
                    view.getContext().startActivity(intent);
                }else if(holder.type_name.getText().equals("20 20+9999")){
                    Intent intent = new Intent(view.getContext(), Types_Customers.class);
                    no3 = "20 20+9999";
                    intent.putExtra("type",no3);
                    view.getContext().startActivity(intent);
                }else if(holder.type_name.getText().equals("داكرون مخلوط")){
                    Intent intent = new Intent(view.getContext(), Types_Customers.class);
                    no3 = "داكرون مخلوط";
                    intent.putExtra("type",no3);
                    view.getContext().startActivity(intent);
                }else if(holder.type_name.getText().equals("بنطلون على")){
                    Intent intent = new Intent(view.getContext(), Types_Customers.class);
                    no3 = "بنطلون على";
                    intent.putExtra("type",no3);
                    view.getContext().startActivity(intent);
                }else if(holder.type_name.getText().equals("فسكوز + فبران")){
                    Intent intent = new Intent(view.getContext(), Types_Customers.class);
                    no3 = "فسكوز + فبران";
                    intent.putExtra("type",no3);
                    view.getContext().startActivity(intent);
                }else if(holder.type_name.getText().equals("تنسل ليكرا سادة + مطبوع")){
                    Intent intent = new Intent(view.getContext(), Types_Customers.class);
                    no3 = "تنسل ليكرا سادة + مطبوع";
                    intent.putExtra("type",no3);
                    view.getContext().startActivity(intent);
                }else if(holder.type_name.getText().equals("عباية سعودي")){
                    Intent intent = new Intent(view.getContext(), Types_Customers.class);
                    no3 = "عباية سعودي";
                    intent.putExtra("type",no3);
                    view.getContext().startActivity(intent);
                }else if(holder.type_name.getText().equals("مقلمات")){
                    Intent intent = new Intent(view.getContext(), Types_Customers.class);
                    no3 = "مقلمات";
                    intent.putExtra("type",no3);
                    view.getContext().startActivity(intent);
                }else if(holder.type_name.getText().equals("عباية مشبح")){
                    Intent intent = new Intent(view.getContext(), Types_Customers.class);
                    no3 = "عباية مشبح";
                    intent.putExtra("type",no3);
                    view.getContext().startActivity(intent);
                }else if(holder.type_name.getText().equals("جلابية")){
                    Intent intent = new Intent(view.getContext(), Types_Customers.class);
                    no3 = "جلابية";
                    intent.putExtra("type",no3);
                    view.getContext().startActivity(intent);
                }else if(holder.type_name.getText().equals("ستان")){
                    Intent intent = new Intent(view.getContext(), Types_Customers.class);
                    no3 = "ستان";
                    intent.putExtra("type",no3);
                    view.getContext().startActivity(intent);
                }else if(holder.type_name.getText().equals("S140")){
                    Intent intent = new Intent(view.getContext(), Types_Customers.class);
                    no3 = "S140";
                    intent.putExtra("type",no3);
                    view.getContext().startActivity(intent);
                }else if(holder.type_name.getText().equals("جاكيت توشيبا العربى")){
                    Intent intent = new Intent(view.getContext(), Types_Customers.class);
                    no3 = "جاكيت توشيبا العربى";
                    intent.putExtra("type",no3);
                    view.getContext().startActivity(intent);
                }else if(holder.type_name.getText().equals("نيو جاكيت 1")){
                    Intent intent = new Intent(view.getContext(), Types_Customers.class);
                    no3 = "نيو جاكيت 1";
                    intent.putExtra("type",no3);
                    view.getContext().startActivity(intent);
                }else if(holder.type_name.getText().equals("نيو جاكيت 2")){
                    Intent intent = new Intent(view.getContext(), Types_Customers.class);
                    no3 = "نيو جاكيت 2";
                    intent.putExtra("type",no3);
                    view.getContext().startActivity(intent);
                }else if(holder.type_name.getText().equals("نيو جاكيت 4")){
                    Intent intent = new Intent(view.getContext(), Types_Customers.class);
                    no3 = "نيو جاكيت 4";
                    intent.putExtra("type",no3);
                    view.getContext().startActivity(intent);
                }else if(holder.type_name.getText().equals("نيو قميص")){
                    Intent intent = new Intent(view.getContext(), Types_Customers.class);
                    no3 = "نيو قميص";
                    intent.putExtra("type",no3);
                    view.getContext().startActivity(intent);
                }else if(holder.type_name.getText().equals("بيكه")){
                    Intent intent = new Intent(view.getContext(), Types_Customers.class);
                    no3 = "بيكه";
                    intent.putExtra("type",no3);
                    view.getContext().startActivity(intent);
                }else if(holder.type_name.getText().equals("بوبلين ليكرا")){
                    Intent intent = new Intent(view.getContext(), Types_Customers.class);
                    no3 = "بوبلين ليكرا";
                    intent.putExtra("type",no3);
                    view.getContext().startActivity(intent);
                }else if(holder.type_name.getText().equals("نيو رويال مطبوع")){
                    Intent intent = new Intent(view.getContext(), Types_Customers.class);
                    no3 = "نيو رويال مطبوع";
                    intent.putExtra("type",no3);
                    view.getContext().startActivity(intent);
                }else if(holder.type_name.getText().equals("رويال")){
                    Intent intent = new Intent(view.getContext(), Types_Customers.class);
                    no3 = "رويال";
                    intent.putExtra("type",no3);
                    view.getContext().startActivity(intent);
                }else if(holder.type_name.getText().equals("70 70")){
                    Intent intent = new Intent(view.getContext(), Types_Customers.class);
                    no3 = "70 70";
                    intent.putExtra("type",no3);
                    view.getContext().startActivity(intent);
                }else if(holder.type_name.getText().equals("قميص كلاسيك")){
                    Intent intent = new Intent(view.getContext(), Types_Customers.class);
                    no3 = "قميص كلاسيك";
                    intent.putExtra("type",no3);
                    view.getContext().startActivity(intent);
                }else if(holder.type_name.getText().equals("قميص 40")){
                    Intent intent = new Intent(view.getContext(), Types_Customers.class);
                    no3 = "قميص 40";
                    intent.putExtra("type",no3);
                    view.getContext().startActivity(intent);
                }else if(holder.type_name.getText().equals("جاكيت تركي")){
                    Intent intent = new Intent(view.getContext(), Types_Customers.class);
                    no3 = "جاكيت تركي";
                    intent.putExtra("type",no3);
                    view.getContext().startActivity(intent);
                }/*بدايه لي تكس*/else if(holder.type_name.getText().equals(" كارنيا مطبوع")){
                    Intent intent = new Intent(view.getContext(), Types_Customers.class);
                    no3 = " كارنيا مطبوع";
                    intent.putExtra("type",no3);
                    view.getContext().startActivity(intent);
                }else if(holder.type_name.getText().equals(" لاكوست")){
                    Intent intent = new Intent(view.getContext(), Types_Customers.class);
                    no3 = " لاكوست";
                    intent.putExtra("type",no3);
                    view.getContext().startActivity(intent);
                }else if(holder.type_name.getText().equals(" قطيفه")){
                    Intent intent = new Intent(view.getContext(), Types_Customers.class);
                    no3 = " قطيفه";
                    intent.putExtra("type",no3);
                    view.getContext().startActivity(intent);
                }else if(holder.type_name.getText().equals(" ليحن")){
                    Intent intent = new Intent(view.getContext(), Types_Customers.class);
                    no3 = " ليحن";
                    intent.putExtra("type",no3);
                    view.getContext().startActivity(intent);
                }else if(holder.type_name.getText().equals(" ليفربول")){
                    Intent intent = new Intent(view.getContext(), Types_Customers.class);
                    no3 = " ليفربول";
                    intent.putExtra("type",no3);
                    view.getContext().startActivity(intent);
                }else if(holder.type_name.getText().equals(" ميلتون")){
                    Intent intent = new Intent(view.getContext(), Types_Customers.class);
                    no3 = " ميلتون";
                    intent.putExtra("type",no3);
                    view.getContext().startActivity(intent);
                }else if(holder.type_name.getText().equals(" كشمير")){
                    Intent intent = new Intent(view.getContext(), Types_Customers.class);
                    no3 = " كشمير";
                    intent.putExtra("type",no3);
                    view.getContext().startActivity(intent);
                }else if(holder.type_name.getText().equals(" فسكوز+ فبران")){
                    Intent intent = new Intent(view.getContext(), Types_Customers.class);
                    no3 = " فسكوز+ فبران";
                    intent.putExtra("type",no3);
                    view.getContext().startActivity(intent);
                }else if(holder.type_name.getText().equals(" براسولا")){
                    Intent intent = new Intent(view.getContext(), Types_Customers.class);
                    no3 = " براسولا";
                    intent.putExtra("type",no3);
                    view.getContext().startActivity(intent);
                }else if(holder.type_name.getText().equals(" شبك")){
                    Intent intent = new Intent(view.getContext(), Types_Customers.class);
                    no3 = " شبك";
                    intent.putExtra("type",no3);
                    view.getContext().startActivity(intent);
                }else if(holder.type_name.getText().equals(" سوفت")){
                    Intent intent = new Intent(view.getContext(), Types_Customers.class);
                    no3 = " سوفت";
                    intent.putExtra("type",no3);
                    view.getContext().startActivity(intent);
                }else if(holder.type_name.getText().equals(" لوجى+نور+بدله+222+333")){
                    Intent intent = new Intent(view.getContext(), Types_Customers.class);
                    no3 = " لوجى+نور+بدله+222+333";
                    intent.putExtra("type",no3);
                    view.getContext().startActivity(intent);
                }else if(holder.type_name.getText().equals(" بنجالين")){
                    Intent intent = new Intent(view.getContext(), Types_Customers.class);
                    no3 = " بنجالين";
                    intent.putExtra("type",no3);
                    view.getContext().startActivity(intent);
                }else if(holder.type_name.getText().equals(" بوبلين")){
                    Intent intent = new Intent(view.getContext(), Types_Customers.class);
                    no3 = " بوبلين";
                    intent.putExtra("type",no3);
                    view.getContext().startActivity(intent);
                }else if(holder.type_name.getText().equals(" شيفون")){
                    Intent intent = new Intent(view.getContext(), Types_Customers.class);
                    no3 = " شيفون";
                    intent.putExtra("type",no3);
                    view.getContext().startActivity(intent);
                }else if(holder.type_name.getText().equals(" قميص مقلم")){
                    Intent intent = new Intent(view.getContext(), Types_Customers.class);
                    no3 = " قميص مقلم";
                    intent.putExtra("type",no3);
                    view.getContext().startActivity(intent);
                }else if(holder.type_name.getText().equals(" زارا كريب")){
                    Intent intent = new Intent(view.getContext(), Types_Customers.class);
                    no3 = " زارا كريب";
                    intent.putExtra("type",no3);
                    view.getContext().startActivity(intent);
                }else if(holder.type_name.getText().equals(" سكوبا كريب")){
                    Intent intent = new Intent(view.getContext(), Types_Customers.class);
                    no3 = " سكوبا كريب";
                    intent.putExtra("type",no3);
                    view.getContext().startActivity(intent);
                }else if(holder.type_name.getText().equals(" روزالين")){
                    Intent intent = new Intent(view.getContext(), Types_Customers.class);
                    no3 = " روزالين";
                    intent.putExtra("type",no3);
                    view.getContext().startActivity(intent);
                }else if(holder.type_name.getText().equals(" رويال")){
                    Intent intent = new Intent(view.getContext(), Types_Customers.class);
                    no3 = " رويال";
                    intent.putExtra("type",no3);
                    view.getContext().startActivity(intent);
                }else if(holder.type_name.getText().equals("50 50")){
                    Intent intent = new Intent(view.getContext(), Types_Customers.class);
                    no3 = "50 50";
                    intent.putExtra("type",no3);
                    view.getContext().startActivity(intent);
                }else if(holder.type_name.getText().equals("قميص حرق وبره")){
                    Intent intent = new Intent(view.getContext(), Types_Customers.class);
                    no3 = "قميص حرق وبره";
                    intent.putExtra("type",no3);
                    view.getContext().startActivity(intent);
                }else if(holder.type_name.getText().equals("عبايا سورى")){
                    Intent intent = new Intent(view.getContext(), Types_Customers.class);
                    no3 = "عبايا سورى";
                    intent.putExtra("type",no3);
                    view.getContext().startActivity(intent);
                }else if(holder.type_name.getText().equals("شاين+روز1+روز2")){
                    Intent intent = new Intent(view.getContext(), Types_Customers.class);
                    no3 = "شاين+روز1+روز2";
                    intent.putExtra("type",no3);
                    view.getContext().startActivity(intent);
                }else if(holder.type_name.getText().equals("فلافيل")){
                    Intent intent = new Intent(view.getContext(), Types_Customers.class);
                    no3 = "فلافيل";
                    intent.putExtra("type",no3);
                    view.getContext().startActivity(intent);
                }else if(holder.type_name.getText().equals("عبايا اطلس")){
                    Intent intent = new Intent(view.getContext(), Types_Customers.class);
                    no3 = "عبايا اطلس";
                    intent.putExtra("type",no3);
                    view.getContext().startActivity(intent);
                }else if(holder.type_name.getText().equals("براش")){
                    Intent intent = new Intent(view.getContext(), Types_Customers.class);
                    no3 = " براش";
                    intent.putExtra("type",no3);
                    view.getContext().startActivity(intent);
                }else if(holder.type_name.getText().equals(" كريب ايطالى")){
                    Intent intent = new Intent(view.getContext(), Types_Customers.class);
                    no3 = " كريب ايطالى";
                    intent.putExtra("type",no3);
                    view.getContext().startActivity(intent);
                }else if(holder.type_name.getText().equals("كلاس")){
                    Intent intent = new Intent(view.getContext(), Types_Customers.class);
                    no3 = "كلاس";
                    intent.putExtra("type",no3);
                    view.getContext().startActivity(intent);
                }else if(holder.type_name.getText().equals("بدر 2 ")){
                    Intent intent = new Intent(view.getContext(), Types_Customers.class);
                    no3 = "بدر 2 ";
                    intent.putExtra("type",no3);
                    view.getContext().startActivity(intent);
                }

            }
        });
    }

    @Override
    public int getItemCount() {
        return types.size();
    }

    public class Types_CustomersVH extends RecyclerView.ViewHolder {
        TextView type_name, id;
        public Types_CustomersVH(@NonNull View itemView) {
            super(itemView);
            type_name = itemView.findViewById(R.id.name);
            id = itemView.findViewById(R.id.id);
        }
    }
}
