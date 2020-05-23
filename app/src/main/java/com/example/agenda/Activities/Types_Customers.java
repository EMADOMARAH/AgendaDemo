package com.example.agenda.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

import com.example.agenda.Adapters.Types_Adapter;
import com.example.agenda.Models.Types_Model;
import com.example.agenda.R;

import java.util.ArrayList;
import java.util.List;

public class Types_Customers extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    DividerItemDecoration dividerItemDecoration;
    List<Types_Model> types_customers;
    String type,person;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_types__customers);
        recyclerView = findViewById(R.id.recyclerview);
        layoutManager = new LinearLayoutManager(getApplicationContext(),RecyclerView.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);
        dividerItemDecoration = new DividerItemDecoration(getApplicationContext(),DividerItemDecoration.VERTICAL);
        recyclerView.addItemDecoration(dividerItemDecoration);
        types_customers = new ArrayList<>();
        type = getIntent().getStringExtra("type");
        person = getIntent().getStringExtra("person");
        //هنا عاملين سترينجاية بتاخد اللي جاي من الادابتر وتقارنه وتضيف في ليستة وبس الادابتر مربوط لوحده
        if(type.equals("40 40")){
            types_customers.add(new Types_Model("كمال النورى","علي الوصلة","شريط استثمارى",null));
            types_customers.add(new Types_Model("مكتب المحلة","علي الوصلة","40 40","بدون سانفور"));
            types_customers.add(new Types_Model("اشرف غالي","علي الوصلة","صنع في مصر",null));
            types_customers.add(new Types_Model("اشرف غالي","مطبوع(عباية)رول 50 متر","نيوسيمبل",null));
        }else if (type.equals("جينز خفيف")){
            types_customers.add(new Types_Model("اشرف دانيال","علي الوصلة","صنع في مصر",null));
        }else if (type.equals("ميكروفايبر ووتر بروف")){
            types_customers.add(new Types_Model("غريبو","50","غريبو",null));
        }else if (type.equals("فسكوز حرق وبرة")){
            types_customers.add(new Types_Model("سعيد حمدى امام","50","النبيتى","عدم وجود الشريط صنع فى مصر"));
        }else if (type.equals("شيفون")){
            types_customers.add(new Types_Model("الهدى عبد العزيز","50","النحوى الازرق",null));
            types_customers.add(new Types_Model("عبد الله العربى","50","ساده",null));
        }else if (type.equals("برنس")){
            types_customers.add(new Types_Model("محمود عبد الباسك","50","برج الصفا",null));
            types_customers.add(new Types_Model("محمد + شريف قرنى","36","ساده",null));
            types_customers.add(new Types_Model("الصدفى","36","نيو سيمبل",null));
            types_customers.add(new Types_Model("طاهر","36","الولد",null));
            types_customers.add(new Types_Model("شهاب الشوربجى","التوب بتوبه","صنع فى مصر","اكبر من 100 لف على 2 رول"));
        }else if (type.equals("جينز")){
            types_customers.add(new Types_Model("اشرف دانيال","على الوصله","صنع فى مصر",null));
            types_customers.add(new Types_Model("الصدفى","40","نيو سيمبل",null));
        }else if (type.equals("جينز 20")){
            types_customers.add(new Types_Model("محمد ابو حبيبه","على الوصله","شريط ازرق",null));
            types_customers.add(new Types_Model("هشام يوسف","50","حلوانى",null));
        }else if (type.equals("جينز 50 50")){
            types_customers.add(new Types_Model("ابو حبيبه","على الوصله","شريط ازرق",null));
            types_customers.add(new Types_Model("كمال النورى","على الوصله","صنع فى مصر",null));
        }else if (type.equals("جينزمقلم+قطيفه ليكرا+مطبوع كارو")){
            types_customers.add(new Types_Model("?","50","نيو سمبل",null));
        }else if (type.equals("جينز مطبوع")){
            types_customers.add(new Types_Model("هشام داود","50","نيو سيمبل",null));
        }else if (type.equals("80 80")){
            types_customers.add(new Types_Model("جيهان","على الوصله","شريط البنت",null));
            types_customers.add(new Types_Model("حسام عبد الفتاح","على الوصله","شريط 8080",null));
            types_customers.add(new Types_Model("الدرينى","على الوصله","شريط 8080",null));
            types_customers.add(new Types_Model("الصدفى","مطبق 36","شريط ساده",null));
            types_customers.add(new Types_Model("يوسف سامى سليمان","مطبق 30","شريط 8080",null));
            types_customers.add(new Types_Model("وليد خليفه","على الوصله","شريط 8080",null));
            types_customers.add(new Types_Model("رشاد قرنى","مطبق 30","شريط 8080",null));
            types_customers.add(new Types_Model("البرعى","30 مطبق,رول على الوصله","استثمارى",null));
            types_customers.add(new Types_Model("خلف سالم","على الوصله","نيو سيمبل",null));
        }else if (type.equals("كريستال")){
            types_customers.add(new Types_Model("المحله","60","البنت",null));
            types_customers.add(new Types_Model("محمد قرنى","60","البنت",null));
            types_customers.add(new Types_Model("هشام داود","50","نيو سيمبل",null));
            types_customers.add(new Types_Model("هشام نعمان","على الوصله","نيو سيمبل",null));
            types_customers.add(new Types_Model("سمير ابو المجد","50","البنت",null));
            types_customers.add(new Types_Model("حسام عبد الفتاح","50","نيو سيمبل",null));
            types_customers.add(new Types_Model("سعيد فؤاد","؟؟","؟؟",null));
            types_customers.add(new Types_Model("خالد فهمى","60","استثمارى",null));
            types_customers.add(new Types_Model("ابو يابس","60","استثمارى",null));
            types_customers.add(new Types_Model("محمد حجازى","60","نيو سيمبل",null));
            types_customers.add(new Types_Model("خلف سالم","50","المتحده",null));
        }else if (type.equals("جبردين")){
            types_customers.add(new Types_Model("مايكل شحاته","50","شريط مايكل",null));
        }else if (type.equals("جبردين مخلوط x مخلوط")){
            types_customers.add(new Types_Model("وائل ويليام","50","شريط 8080",null));
            types_customers.add(new Types_Model("عبد الغفور شاهين","رول","صنع فى مصر",null));
        }else if (type.equals("ميكروفايبر ووتر بروف مشحم")){
            types_customers.add(new Types_Model("محمد حافظ","على الوصله","البنت",null));
            types_customers.add(new Types_Model("رضا الحلو","150","استثمارى",null));
            types_customers.add(new Types_Model("بلانت فاشون","150","استثمارى",null));
        }else if (type.equals("براشوط")){
            types_customers.add(new Types_Model("محمد حافظ","على الوصله","البنت",null));
            types_customers.add(new Types_Model("رضا الحلو","150","استثمارى",null));
        }else if (type.equals("ميكروفايبر بيتش")){
            types_customers.add(new Types_Model("تامر الشعراوى","150","استثمارى",null));
            types_customers.add(new Types_Model("ناصر منير","150","استثمارى",null));
            types_customers.add(new Types_Model("وائل ويليام","150","استثمارى",null));
            types_customers.add(new Types_Model("السوهاجى","150","استثمارى",null));
            types_customers.add(new Types_Model("نبيل السيد","150","استثمارى",null));
            types_customers.add(new Types_Model("هيثم السورى","150","استثمارى",null));
            types_customers.add(new Types_Model("فاين تكس","150","استثمارى",null));
            types_customers.add(new Types_Model("جوست","150","استثمارى",null));
            types_customers.add(new Types_Model("ابو سلطوح","150","استثمارى",null));
            types_customers.add(new Types_Model("سوسن احمد","150","استثمارى",null));
            types_customers.add(new Types_Model("سامى يوسف سليمان","150","استثمارى",null));
            types_customers.add(new Types_Model("سيد عباس","150","استثمارى",null));
            types_customers.add(new Types_Model("محمد فهمى","150","استثمارى",null));
            types_customers.add(new Types_Model("ايمن الهادى","150","استثمارى",null));
            types_customers.add(new Types_Model("تراست","150","استثمارى",null));
            types_customers.add(new Types_Model("تك بوينت","150","استثمارى",null));
            types_customers.add(new Types_Model("ابو الروس","150","البنت",null));
            types_customers.add(new Types_Model("الدمياطى","100","استثمارى",null));
            types_customers.add(new Types_Model("هشام يوسف","100","حلوانى",null));
            types_customers.add(new Types_Model("على بلال","150","صنع فى مصر",null));
            types_customers.add(new Types_Model("هانى لطفى","على الوصله","استثمارى",null));
            types_customers.add(new Types_Model("محمد + طارق الشوربجى","70","صنع فى مصر",null));
            types_customers.add(new Types_Model("حسام عبد الفتاح","100","النحوى الازرق",null));
            types_customers.add(new Types_Model("هاله الفواخرى","70","صنع فى مصر",null));
            types_customers.add(new Types_Model("عبد القهار","70","صنع فى مصر",null));
            types_customers.add(new Types_Model("احمد حسين","50","شريط ساده",null));
            types_customers.add(new Types_Model("عصام كمال","؟","حلوانى",null));
            types_customers.add(new Types_Model("شهاب الشوربجى","50","شريط ساده + بدون بتش",null));
        }else if (type.equals("لاكوست")){
            types_customers.add(new Types_Model("كوتشى","على الوصله","حلوانى",null));
        }else if (type.equals("قميص مقلم")){
            types_customers.add(new Types_Model("محمد السورى","على الوصله","صنع فى مصر",null));
            types_customers.add(new Types_Model("مجدى السورى","على الوصله","شاده","(ناشف)"));
        }else if (type.equals("شوفيت(تيتون)")){
            types_customers.add(new Types_Model("طاهر عفيفى","35","صنع فى مصر",null));
        }else if (type.equals("ميكانيك استرتش")){
            types_customers.add(new Types_Model("احمد بسيونى","50","النحوى النبيتى(4040)","(سنفور)"));
        }else if (type.equals("قميص + بوبلين ليكرا")){
            types_customers.add(new Types_Model("هشام يوسف","60","حلوانى",null));
        }else if (type.equals("71 71 + مطبوع")){
            types_customers.add(new Types_Model("حسام عبد الفتاح","لا يقل عن 70","شريط 3030",null));
            types_customers.add(new Types_Model("حسام عبد الفتاح","50","شريط 3030","(دا مطبوووع)"));
            types_customers.add(new Types_Model("محمد ابو حبيبه","على الوصله","شريط 3030","(سنفور)"));
            types_customers.add(new Types_Model("بهاء عرفه","على الوصله","شريط 3030",null));
            types_customers.add(new Types_Model("الدمياطى","على الوصله","شريط 3030",null));
            types_customers.add(new Types_Model("الصدفى","50","شريط ساده",null));
            types_customers.add(new Types_Model("عبد الله ابو..","على الوصله","صنع فى مصر",null));
            types_customers.add(new Types_Model("محمد حجازى","على الوصله","شريط 3030",null));
            types_customers.add(new Types_Model("طاهر عفيفى","50","شريط 3030",null));
        }else if (type.equals("إيكو")){
            types_customers.add(new Types_Model("الصدفى","40","شريط 3030",null));
        }else if (type.equals("30 30")){
            types_customers.add(new Types_Model("الصدفى","مطبق 36","صنع فى مصر",null));
            types_customers.add(new Types_Model("عبد القادر رياض","على الوصله","صنع فى مصر",null));
            types_customers.add(new Types_Model("هيثم نصرالله","على الوصله","شريط 3030",null));
            types_customers.add(new Types_Model("ابو حبيبه","على الوصله","شريط 3030",null));
        }else if (type.equals("جلابية ياباني")){
            types_customers.add(new Types_Model("طاهر عفيفى","مطبق 30","شريط ساده",null));
        }else if (type.equals("كلاس")){
            types_customers.add(new Types_Model("الصدفى","50","شريط العميل",null));
        }else if (type.equals("بدر 2 ")){
            types_customers.add(new Types_Model("الصدفى","50","شريط العميل",null));
        }else if (type.equals("بدلة + Boss + بيدبولا")){
            types_customers.add(new Types_Model("الصدفى","36","نيو سيمبل",null));
        }else if (type.equals("سروال")){
            types_customers.add(new Types_Model("اى عميل","50","استثمارى",null));
            types_customers.add(new Types_Model("احمد عبد المنعم","على الوصله","شريط الازرق",null));
        }else if (type.equals("75 75")){
            types_customers.add(new Types_Model("شادى تكس","على الوصله","شريط 3030",null));
        }else if (type.equals("قميص موباكو")){
            types_customers.add(new Types_Model("وليد رمضان","على الوصله","شريط ساده",null));
            types_customers.add(new Types_Model("الشرق","على الوصله","شريط الازرق",null));
        }else if (type.equals("موباكو محروق الوبره")){
            types_customers.add(new Types_Model("الدمياطى","50","شريط الدمياطى",null));
        }else if (type.equals("20 20+9999")){
            types_customers.add(new Types_Model("2020 كمال النورى","على الوصله","شريط استثمارى",null));
            types_customers.add(new Types_Model("وائل ويليام","على الوصله","شريط 3030",null));
            types_customers.add(new Types_Model("محمد ابو حبيبه","على الوصله","شريط 3030",null));
            types_customers.add(new Types_Model("طاهر عفيفى","مطبق 36","شريط 3030",null));
            types_customers.add(new Types_Model("عبد القادر رياض","على الوصله","صنع فى مصر",null));
            types_customers.add(new Types_Model("سمير ابو المجد (9999)","مطبق 30 متر","شريط 3030",null));

        }else if (type.equals("داكرون مخلوط")){
            types_customers.add(new Types_Model("رياض دانيل","على الوصله","شريط الداكرون",null));
            types_customers.add(new Types_Model("محمد ابو حبيبه","على الوصله","شريط الداكرون",null));
            types_customers.add(new Types_Model("الدمياطى","100","شريط الداكرون",null));
            types_customers.add(new Types_Model("هشام يوسف","60","حلوانى",null));
            types_customers.add(new Types_Model("نصر زقزوق","على الوصله","شريط الداكرون",null));
            types_customers.add(new Types_Model("عبد الغفور شاهين","على الوصله","شريط الداكرون",null));
            types_customers.add(new Types_Model("حسام عبد الفتاح","على الوصله","شريط الداكرون",null));
            types_customers.add(new Types_Model("محمد حجازى","50","شريط العميل",null));
            types_customers.add(new Types_Model("وليد خليفه","على الوصله","شريط الداكرون",null));
        }else if (type.equals("بنطلون على")){
            types_customers.add(new Types_Model("الصدفى","50","نيو سيمبل",null));
        }else if (type.equals("فسكوز + فبران")){
            types_customers.add(new Types_Model("البرعى","50","شريط بنى x ازرق",null));
            types_customers.add(new Types_Model("حسن مرجان","50","شريط ساده","(مطبوع + ساده) كيس بكر"));
            types_customers.add(new Types_Model("سامر عبد المنعم","50","صنع فى مصر",null));
            types_customers.add(new Types_Model("راغب مكرم","50","نيو سيمبل",null));
            types_customers.add(new Types_Model("محمد غريبو","50","شريط غريبو"," مطبوع + مواسير كارتون"));
        }else if (type.equals("تنسل ليكرا سادة + مطبوع")){
            types_customers.add(new Types_Model("سعيد حمدى امام","على الوصله","صنع فى مصر",null));
        }else if (type.equals("عباية سعودي")){
            types_customers.add(new Types_Model("الدياسطى","65","؟","تغليف 2 كيس"));
        }else if (type.equals("مقلمات")){
            types_customers.add(new Types_Model("البرعى","36","شريط الولد",null));
        }else if (type.equals("عباية مشبح")){
            types_customers.add(new Types_Model("سعبد حمدى امام","60","شريط ساده",null));
        }else if (type.equals("جلابية")){
            types_customers.add(new Types_Model("حسن عبد ربه","على الوصله","شريط النحوى الازرق",null));
        }else if (type.equals("ستان")){
            types_customers.add(new Types_Model("حسن مرجان","50","نيو سيمبل",null));
            types_customers.add(new Types_Model("اسماعيل حنفى","50","شريط ساده + كارت المحبه",null));
        }else if (type.equals("S140")){
            types_customers.add(new Types_Model("سمير ابو المجد","مطبق 30","شريط 3030",null));
        }else if (type.equals("جاكيت توشيبا العربى")){
            types_customers.add(new Types_Model("طاهر عفيفى","50","شريط ساده + كارت 3030",null));
        }else if (type.equals("نيو جاكيت 1")){
            types_customers.add(new Types_Model("الصدفى","50","ستان اصفر",null));
        }else if (type.equals("نيو جاكيت 2")){
            types_customers.add(new Types_Model("الصدفى","36","شريط النحوى زى شريط طنطاوى",null));
        }else if (type.equals("نيو جاكيت 4")){
            types_customers.add(new Types_Model("الصدفى","36","ستان احمر",null));
        }else if (type.equals("نيو قميص")){
            types_customers.add(new Types_Model("الصدفى","50","شريط ساده",null));
        }else if (type.equals("بيكه")){
            types_customers.add(new Types_Model("الصدفى","مطبق 36","ستان احمر",null));
        }else if (type.equals("بوبلين ليكرا")){
            types_customers.add(new Types_Model("نصر زقزوق","100","شريط الداكرون",null));
        }else if (type.equals("نيو رويال مطبوع")){
            types_customers.add(new Types_Model("حسن مرجان","50","نيو سيمبل بدون صوره",null));
        }else if (type.equals("رويال")){
            types_customers.add(new Types_Model("حسن مرجان","50","نيو سيمبل + صوره",null));
        }else if (type.equals("70 70")){
            types_customers.add(new Types_Model("الصدفى","على الوصله","شريط ساده",null));
        }else if (type.equals("قميص كلاسيك")){
            types_customers.add(new Types_Model("الصدفى","50","شريط ساده",null));
        }else if (type.equals("عبايا سورى")){
            types_customers.add(new Types_Model("ابو النور السورى","80 مطبق","شريط ساده",null));
        } else if (type.equals("شاين+روز1+روز2")){
            types_customers.add(new Types_Model("الصدفى","50","نيو سيمبل",null));
        }else if (type.equals("فلافيل")){
            types_customers.add(new Types_Model("سمير ابو المجد","مطبق 30","شريط الجبردين",null));
        }else if (type.equals("عبايا اطلس")){
            types_customers.add(new Types_Model("هشام يوسف","50","صنع فى مصر",null));
        }  else if (type.equals("ميلتون")){
            types_customers.add(new Types_Model("هشام فهيم","على الوصله","صنع فى مصر","اللف على الوش"));
        } else if (type.equals("جاكيت تركي")){
            types_customers.add(new Types_Model("طاهر عفيفى","36","نيو سيمبل",null));
            //هنا بتوع ليتكس ومتنساش مسافة بداية كل الاسماء
        }else if (type.equals(" كارنيا مطبوع")){
            types_customers.add(new Types_Model("حسن مرجان","على الوصله","شريط مرجان",null));
        }else if (type.equals(" لاكوست")){
            types_customers.add(new Types_Model("مرجان","50","نيو سيمبل","بدون صنف او لون"));
            types_customers.add(new Types_Model("الصدفى","50","ساده",null));
            types_customers.add(new Types_Model("محمد عبد العظيم","50","شريط العميل","الصفا تكس"));
        }else if (type.equals(" قطيفه")){
            types_customers.add(new Types_Model("؟","على الوصله","ساده",null));
        }else if (type.equals(" ليحن")){
            types_customers.add(new Types_Model("مرجان","على الوصله","حلوانى","كرتون(صنف+لون فقط)"));
            types_customers.add(new Types_Model("مايكل","50 + وزن","شريط مايكل","بدون صنف ولا لون ولا عميل"));
            types_customers.add(new Types_Model("تامر الشعراوى","على الوصله","شريط ساده",null));
            types_customers.add(new Types_Model("محمد شقير","على الوصله","شريط ساده",null));
            types_customers.add(new Types_Model("اسماعيل الدرينى","50","صنع فى مصر",null));
            types_customers.add(new Types_Model("ابو سلطوح","50","شريط ساده",null));
            types_customers.add(new Types_Model("حازم حسن","50","نيو سيمبل",null));
            types_customers.add(new Types_Model("محمد الشوربجى","على الوصله","شريط ساده",null));
        }else if (type.equals(" ليفربول")){
            types_customers.add(new Types_Model("مرجان","على الوصله","نيو سيمبل","وزن + متر"));
            types_customers.add(new Types_Model("محمود عبد الباسط","60  (ماسوره كرتون)","شريط العميل","وزن بدون متر"));
            types_customers.add(new Types_Model("مرجان","40","نيو سيمبل",null));
        }else if (type.equals(" ميلتون")){
            types_customers.add(new Types_Model("الصدفى","40 رول","النحوى البنى",null));
            types_customers.add(new Types_Model("هشام فهيم","على الوصله","صنع فى مصر","اللف على الوش"));
        }else if (type.equals(" كشمير")){
            types_customers.add(new Types_Model("؟","على الوصله","شريط ساده",null));
        }else if (type.equals(" فسكوز+ فبران")){
            types_customers.add(new Types_Model("مرجان","50","نيو سيمبل","كرتون"));
            types_customers.add(new Types_Model("ياسر جبره","50","شريط ساده",null));
            types_customers.add(new Types_Model("طاهر عفيفى","60","نيو سيمبل",null));
            types_customers.add(new Types_Model("حازم حسن","50","نيو سيمبل",null));
        }else if (type.equals(" براسولا")){
            types_customers.add(new Types_Model("مرجان","بدون طول","نيو سيمبل","وزن+لون+وزن"));
            types_customers.add(new Types_Model("محمود عبد الله عزب","على الوصله","شريط ساده",null));
        }else if (type.equals(" شبك")){
            types_customers.add(new Types_Model("محمد خليفه","على الوصله","شريط العميل","محمدواحمد"));
        }else if (type.equals(" سوفت")){
            types_customers.add(new Types_Model("محمد عبد العظيم","50","شريط الصفا",null));
            types_customers.add(new Types_Model("مرجان","...","نيو سيمبل",null));
            types_customers.add(new Types_Model("حازم حسن","50","نيو سيمبل",null));
            types_customers.add(new Types_Model("غريبو","50","شريط غريبو",null));
        }else if (type.equals(" لوجى+نور+بدله+222+333")){
            types_customers.add(new Types_Model("الصدفى","36","شريط ساده",null));
        }else if (type.equals(" بنجالين")){
            types_customers.add(new Types_Model("هشام لحكو","50","شريط ساده",null));
        }else if (type.equals(" بوبلين")){
            types_customers.add(new Types_Model("سامر عبد المنعم","60","شريط ساده",null));
        }else if (type.equals(" شاين")){
            types_customers.add(new Types_Model("الصدفى","50","شريط العميل",null));
        }else if (type.equals(" شيفون")){
            types_customers.add(new Types_Model("مرجان","على الوصله","شريط مفتاح","ماسوره كرتون"));
        }else if (type.equals(" براش")){
            types_customers.add(new Types_Model("محمد خليفه","50","شريط محمد واحمد",null));
        }else if (type.equals(" قميص مقلم")){
            types_customers.add(new Types_Model("احمد غالى","60","شريط العميل",null));
        }else if (type.equals(" زارا كريب")){
            types_customers.add(new Types_Model("محمد خليفه","60","محمد خليفه",null));
            types_customers.add(new Types_Model("غريبو","50","شريط غريبو",null));
            types_customers.add(new Types_Model("حازم حسن","50","شريط نيو سيمبل",null));
            types_customers.add(new Types_Model("عبد الله العربى","100","شريط ساده",null));
        }else if (type.equals(" سكوبا كريب")){
            types_customers.add(new Types_Model("مرجان","50 + وزن","شريط نيو سيمبل","ماسوره كرتون"));
            types_customers.add(new Types_Model("جاك جبره","50","شريط فاين تكس",null));
            types_customers.add(new Types_Model("احمد عنتر","50+وزن","شريط ابيض + ماسوره كرتون",null));
        }else if (type.equals(" روزالين")){
            types_customers.add(new Types_Model("حازم حسن","50","شريط نيو سيمبل",null));
        }else if (type.equals(" رويال")){
            types_customers.add(new Types_Model("...","50","شريط نيو سيمبل",null));
        }else if (type.equals(" كريب ايطالى")){
            types_customers.add(new Types_Model("محمد حجازى","50","شريط حجازى",null));
        }else if (type.equals("50 50")){
            types_customers.add(new Types_Model("عبد الله ابو النيل","على الوصله","شريط ساده",null));
        }else if (type.equals("قميص حرق وبره")){
            types_customers.add(new Types_Model("احمد بسيونى","50","شريط الداكرون",null));
            types_customers.add(new Types_Model("تبيد لاموند","على الوصله","شريط النحوى الازرق",null));
            types_customers.add(new Types_Model("الدمياطى","100","شريط الدمياطى",null));
            types_customers.add(new Types_Model("هشام يوسف","75","حلوانى",null));
            types_customers.add(new Types_Model("خلف سالم","100","شريط صنع فى مصر",null));
        }else if (type.equals(" روتانا")){
            types_customers.add(new Types_Model("...","50","شريط نيو سيمبل",null));
        }




        Types_Adapter adapter = new Types_Adapter(types_customers);
        recyclerView.setAdapter(adapter);
    }
}
