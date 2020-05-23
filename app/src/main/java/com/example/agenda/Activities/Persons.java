package com.example.agenda.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.example.agenda.Adapters.Types_Adapter;
import com.example.agenda.Models.Types_Model;
import com.example.agenda.R;

import java.util.ArrayList;
import java.util.List;

public class Persons extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    DividerItemDecoration dividerItemDecoration;
    List<Types_Model> persons;
    String person;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persons);
        recyclerView = findViewById(R.id.recyclerview);
        layoutManager = new LinearLayoutManager(getApplicationContext(),RecyclerView.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);
        dividerItemDecoration = new DividerItemDecoration(getApplicationContext(),DividerItemDecoration.VERTICAL);
        recyclerView.addItemDecoration(dividerItemDecoration);
        persons = new ArrayList<>();
        person = getIntent().getStringExtra("person");
        if (person.equals("هشام عبدالدايم")){
            persons.add(new Types_Model("ريماس","50","شريط ساده",null));
            persons.add(new Types_Model("كيستال","50","شريط ساده",null));
            persons.add(new Types_Model("مرسيليا","50","شريط ساده",null));
            persons.add(new Types_Model("قميص مخلوط","50","شريط دايم فاشون",null));
            persons.add(new Types_Model("مورق","على الوصله","شريط ساده","صنف + رقم بالعربى"));
            persons.add(new Types_Model("جلابيه","30 مطبق","شريط ستان",null));
            persons.add(new Types_Model("بنطلون مخلوط","60","شريط العميل + كارت العميل",null));
            persons.add(new Types_Model("ميكروفيبربتش","60","شريط استثمارى",null));
            persons.add(new Types_Model("فنيسيا","60","شريط العميل",null));
            persons.add(new Types_Model("مارينا","50","شريط ساده",null));
            persons.add(new Types_Model("بيكر مخلوط","50","شريط ساده + كارت العميل",null));
            persons.add(new Types_Model("بوبلين ليكرا","50","شريط ساده + كارت العميل",null));
            persons.add(new Types_Model("تنسل","50","شريط ساده + كارت نيو سمبل خاص بالعميل",null));
            persons.add(new Types_Model("بولستر فسكوز","(سلالم)","شريط العميل",null));
            persons.add(new Types_Model("سابلين","50","شريط العميل",null));
            persons.add(new Types_Model("رجالى","50","شريط العميل",null));
            persons.add(new Types_Model("جيكار","60","شريط صنع فى مصر خاص بالعميل","العيوب شريط حلوانى"));
            persons.add(new Types_Model("داكرون","100","شريط ساده",null));
            persons.add(new Types_Model("جينز ليكرا","50","شريط العميل",null));
        }else if (person.equals("مايكل شحاته"))
        {
            persons.add(new Types_Model("ليفربول","50 رول","شريط مايكل",null));
            persons.add(new Types_Model("تريكو مطبوع","50 + وزن","شريط مايكل",null));
            persons.add(new Types_Model("تريكو ساده","على الوصله","شريط مايكل",null));
            persons.add(new Types_Model("كريبون","50 ","شريط مايكل",null));
            persons.add(new Types_Model("جينز ستان","50 رول","شريط مايكل",null));
            persons.add(new Types_Model("سوفت","50","شريط مايكل",null));
            persons.add(new Types_Model("سكوبا كريب مطبوع","50+وزن","شريط مايكل","مواسير بلاستيك"));
            persons.add(new Types_Model("جبردين ليكرا","50 ","شريط مايكل",null));
        }else if (person.equals("على + عبد الله ابو سعده"))
        {
            persons.add(new Types_Model("كريستال","60","شريط استثمارى",null));
            persons.add(new Types_Model("ريماس","60","شريط استثمارى",null));
        }else if (person.equals("عونى العجمى"))
        {
            persons.add(new Types_Model("ايزيس","40 مطبق","شريط استثمارى",null));
        }else if (person.equals("عاطف بسيونى"))
        {
            persons.add(new Types_Model("شيفون بابليز","50","شريط نيو سيمبل","الرقم فقط"));
            persons.add(new Types_Model("باقى شغل عاطف بسيونى","...","شريط الحاج عاطف",null));
        }else if (person.equals("خالد فهمى"))
        {
            persons.add(new Types_Model("كريستال","60","شريط استثمارى",null));
        }else if (person.equals("ديفيد حنا"))
        {
            persons.add(new Types_Model("ميلتون اسبن ليكرا مطبوع","على الوصله","حلوانى",null));
            persons.add(new Types_Model("سكوبا","على الوصله","شريط ساده",null));
            persons.add(new Types_Model("سوفت ليكرا مطبوع","50","شريط العميل","Tex"));
        }else if (person.equals("محمد سعد"))
        {
            persons.add(new Types_Model("لورد","على الوصله","شريط العميل",null));
            persons.add(new Types_Model("عبايه مبرد","50","شريط العميل",null));
            persons.add(new Types_Model("ميكروفيبربتش","150","شريط العميل","Tex"));
        }else if (person.equals("شركه ترست"))
        {
            persons.add(new Types_Model("بيو مطبوع","على الوصله","حلوانى",null));
        }else if (person.equals("محمود عبد الباسط"))
        {
            persons.add(new Types_Model("لاكوست","على الوصله","شريط برج الصفا","وزن+صنف+لون+رقم حوض"));
            persons.add(new Types_Model("777","لا يزيد عن 70 بدون وصلات","شريط برج الصفا","مواسير كرتون"));
        }else if (person.equals("خلف سالم"))
        {
            persons.add(new Types_Model("5050","على الوصله","شريط المتحده","سانفور"));
            persons.add(new Types_Model("ميكروفيبر مشحم","على الوصله","شريط المتحده",null));
            persons.add(new Types_Model("جبردين شعيرات","على الوصله","شريط المتحده",null));
            persons.add(new Types_Model("جبردين","على الوصله","شريط المتحده",null));
            persons.add(new Types_Model("ترجال مخلوط","على الوصله","شريط المتحده",null));
            persons.add(new Types_Model("كرسيال","50","شريط ساده",null));
            persons.add(new Types_Model("ريماس","50","شريط ساده",null));
            persons.add(new Types_Model("كتان اسلاب","100","شريط ساده",null));
            persons.add(new Types_Model("ميكروفيبر","100","شريط ساده",null));
            persons.add(new Types_Model("داكرون مشحم","100","شريط صنع فى مصر",null));
            persons.add(new Types_Model("داكرزن محرر","...","شريط صنع فى مصر","سانفور"));
            persons.add(new Types_Model("عبايا فسكوز","60","شريط صنع فى مصر",null));
        }else if (person.equals("محمد قرنى"))
        {
            persons.add(new Types_Model("جبردين","على الوصله","شريط KB او صنع فى مصر",null));
        }else if (person.equals("رشاد قرنى"))
        {
            persons.add(new Types_Model("بوبلين مطبوع","50","شريط العميل",null));
        }else if (person.equals("عماد ابو القاسم"))
        {
            persons.add(new Types_Model("كرستال","60","شريط استثمارى",null));
            persons.add(new Types_Model("ريماس","60","شريط استثمارى",null));
            persons.add(new Types_Model("جبردين","على الوصله","شريط استثمارى",null));
            persons.add(new Types_Model("سروال","150","شريط استثمارى","سنفور"));
            persons.add(new Types_Model("فسكوز","60","شريط اصتثمارى","سنفور"));
        }else if (person.equals("وائل سعد"))
        {
            persons.add(new Types_Model("جبردين مخلوط","على الوصله","شريط صنع فى مصر",null));
        }else if (person.equals("جلال الحسينى"))
        {
            persons.add(new Types_Model("فوال","على الوصله","شريط حلوانى",null));
        }else if (person.equals("عبدالله العربى"))
        {
            persons.add(new Types_Model("روعه","على الوصله","شريط ساده","وزن + متر"));
            persons.add(new Types_Model("ليكرا مسحب مطبوع","على الوصله","شريط ساده",null));
        }else if (person.equals("وائل عبد الوهاب"))
        {
            persons.add(new Types_Model("مبرد شعيرات","على الوصله","شريط استثمارى",null));
        }else if (person.equals("ايمن خشبه"))
        {
            persons.add(new Types_Model("ريماس","50","شريط نيو سيمبل",null));
            persons.add(new Types_Model("مارسيليا","50","شريط نيو سيمبل",null));
        }else if (person.equals("الصفوه"))
        {
            persons.add(new Types_Model("مورق","60","شريط العميل",null));
            persons.add(new Types_Model("مكروفيبربتش","100","شريط ساده",null));
        }else if (person.equals("اسامه الشيخ"))
        {
            persons.add(new Types_Model("مكروفيبربتش","50","شريط الشيخ",null));
            persons.add(new Types_Model("حرير","50","شريط الشيخ (حرير فاخر)",null));
            persons.add(new Types_Model("جبردين9494","على الوصله","شريط الشيخ",null));
        }else if (person.equals("بلال تكس"))
        {
            persons.add(new Types_Model("مكروفيبر","على الوصله","شريط استثمارى",null));
            persons.add(new Types_Model("مكروفيبر مطبوع","150","شريط استثمارى",null));
        }else if (person.equals("الدمياطى"))
        {
            persons.add(new Types_Model("مكروفيبربتش","100","شريط استثمارى",null));
            persons.add(new Types_Model("جبردين ليكرا","من 60 ل 70","شريط الدمياطى",null));
            persons.add(new Types_Model("داكرون","على الوصله","شريط الدمياطى",null));
            persons.add(new Types_Model("بوبلين مطبوع","على الوصله","شريط الدمياطى",null));
        }else if (person.equals("شادى تكس"))
        {
            persons.add(new Types_Model("فلات مكستر","على الوصله","شريط ساده",null));
            persons.add(new Types_Model("روزيتا","على الوصله","شريط ساده + كارت استثمارى",null));
        }else if (person.equals("اشرف البرنس"))
        {
            persons.add(new Types_Model("ميكروفيبر","50","شريط استثمارى",null));
        }else if (person.equals("احمد غالى"))
        {
            persons.add(new Types_Model("ليفربول","على الوصله","شريط ساده",null));
            persons.add(new Types_Model("ريون","على الوصله","شريط ساده",null));
            persons.add(new Types_Model("سكوبا","...","شريط ساده",null));
        }else if (person.equals("حسام عبدالفتاح"))
        {
            persons.add(new Types_Model("ترجال2017","على الوصله","شريط استثمارى",null));
            persons.add(new Types_Model("بوليستر","على الوصله","شريط استثمارى",null));
            persons.add(new Types_Model("جبردين مخلوط مطبوع","...","شريط ساده",null));
            persons.add(new Types_Model("جبردين قطن","على الوصله","شريط صنع فى مصر",null));
        }else if (person.equals("سعيد فؤاد"))
        {
            persons.add(new Types_Model("ميكروفيبربتش","100","شريط استثمارى",null));
            persons.add(new Types_Model("مارسيليا","60","شريط استثمارى",null));
            persons.add(new Types_Model("كريستال","60","شريط استثمارى",null));
        }else if (person.equals("هشام يوسف"))
        {
            persons.add(new Types_Model("بيكا","60","شريط حلوانى",null));
            persons.add(new Types_Model("موباكو","60","شريط حلوانى",null));
            persons.add(new Types_Model("بوبلين","60","شريط حلوانى","ساده ومطبوع"));
        }else if (person.equals("احمد الغنيمى"))
        {
            persons.add(new Types_Model("ميكروفيبربتش","50","شريط الغنيمى",null));
        }else if (person.equals("محسن عامر"))
        {
            persons.add(new Types_Model("براسولا مطبوع","على الوصله","شريط ساده","متر+وزن"));
            persons.add(new Types_Model("بوبلين ليكرا مطبوع","50","شريط ساده",null));
        }else if (person.equals("محمد خليفه"))
        {
            persons.add(new Types_Model("لاكوست","50","شريط محمد واحمد",null));
            persons.add(new Types_Model("تنسل","50","شريط محمد واحمد",null));
            persons.add(new Types_Model("فسكوز","50","شريط محمد واحمد",null));
            persons.add(new Types_Model("كريبون","50","شريط محمد واحمد",null));
            persons.add(new Types_Model("سكوبا+ سكوبا دبل","50","شريط محمد واحمد","وزن + متر"));
            persons.add(new Types_Model("ريون","50","شريط محمد واحمد",null));
            persons.add(new Types_Model("سوفت","50","شريط محمد واحمد",null));
            persons.add(new Types_Model("سبايل ليكرا","50","شريط محمد واحمد",null));
            persons.add(new Types_Model("سنجل كريب","50+وزن","شريط العميل",null));
            persons.add(new Types_Model("جبردين ليكرا قطن","50","شريط العميل",null));
        }else if (person.equals("سمير البطل"))
        {
            persons.add(new Types_Model("داكرون","150","شريط استثمارى",null));
        }else if (person.equals("ابو سلطوح"))
        {
            persons.add(new Types_Model("ميلتون","على الوصله","شريط ساده","العيوب حلوانى"));
            persons.add(new Types_Model("لاكوست","60","شريط ساده",null));
            persons.add(new Types_Model("ليفربول","50","شريط ساده",null));
        }else if (person.equals("اسامه جاب الله"))
        {
            persons.add(new Types_Model("جبردين","50","شريط العميل",null));
        }else if (person.equals("محمود عبد المولى"))
        {
            persons.add(new Types_Model("جولدن","30 مطبق","شريط الازرق",null));
            persons.add(new Types_Model("هاى يابانى","30 مطبق","شريط الازرق",null));
            persons.add(new Types_Model("مبرد اسبن","30 مطبق","شريط الازرق",null));
            persons.add(new Types_Model("سروال","30 مطبق","شريط نيو سيمبل",null));
        }else if (person.equals("طاهر عفيفى"))
        {
            persons.add(new Types_Model("فبران","50 مطبق","شريط ساده",null));
            persons.add(new Types_Model("جينز خفيف مطبوع","على الوصله","شريط صنع فى مصر",null));
        }else if (person.equals("احمد عنتر"))
        {
            persons.add(new Types_Model("لاكوست","من 60 ل 70","شريط ساده","متر+ وزن(مواسير كرتون)"));
        }else if (person.equals("عماد عابدين"))
        {
            persons.add(new Types_Model("بنطلون بيكا ليكرا","على الوصله","شريط النحوى الازرق",null));
        }else if (person.equals("اسبرانتو جينز"))
        {
            persons.add(new Types_Model("بولستر مطبوع","على الوصله","شريط حلوانى",null));
        }else if (person.equals("احمد محرز"))
        {
            persons.add(new Types_Model("كريستال","60","شريط استثمارى",null));
        }else if (person.equals("انطوان زخارى"))
        {
            persons.add(new Types_Model("بوبلين ليكرا","50","شريط العميل","ساده لعدم وجود شريط العميل"));
            persons.add(new Types_Model("جبردين قميص ليكرا","50 ","شريط العميل","ساده لعدم وجود شريط العميل"));
            persons.add(new Types_Model("شيفون","50","شريط العميل","ساده لعدم وجود شريط العميل"));
            persons.add(new Types_Model("كريب","50","شريط العميل",null));
            persons.add(new Types_Model("سوبر بتش مخلوط مكستر","على الوصله","شريط العميل",null));
            persons.add(new Types_Model("انجورا بولستر مكستر","على الوصله + وزن","شريط العميل",null));
            persons.add(new Types_Model("جبردين 102 بتش","100","شريط ساده",null));
        }else if (person.equals("مصنع رياض"))
        {
            persons.add(new Types_Model("داكرون","150","شريط استثمارى",null));
        }else if (person.equals("احمد زيان(شادي تكس)"))
        {
            persons.add(new Types_Model("ميكروماش","على الوصله","شريط ساده+ كارت استثمارى",null));
            persons.add(new Types_Model("داكرون","على الوصله","شريط ساده+ كارت استثمارى",null));
        }else if (person.equals("عبدالله قراوش"))
        {
            persons.add(new Types_Model("بدله كراتيه","على الوصله","شريط استثمارى",null));
        }else if (person.equals("جينز تكس"))
        {
            persons.add(new Types_Model("مونتانا","على الوصله","شريط العميل","شريط علم مصر"));
        }else if (person.equals("احمد عزب"))
        {
            persons.add(new Types_Model("ميلتون","على الوصله","شريط ساده",null));
        }else if (person.equals("محمد جاويش"))
        {
            persons.add(new Types_Model("مبرد جبردين","على الوصله","شريط صنع فى مصر",null));
        }else if (person.equals("محيى الدين"))
        {
            persons.add(new Types_Model("فيرو","على الوصله","شريط حلوانى",null));
        }else if (person.equals("احمد حسين"))
        {
            persons.add(new Types_Model("مونتانا مشحم","على الوصله","شريط السويسى",null));
        }else if (person.equals("محمد ابو غزاله"))
        {
            persons.add(new Types_Model("داكرون","على الوصله","شريط استثمارى",null));
        }else if (person.equals("الرجبى"))
        {
            persons.add(new Types_Model("مرسيليا","60","شريط الرجبى",null));
            persons.add(new Types_Model("داكرون","50","شريط الرجبى",null));
        }else if (person.equals("اسامه جرجس"))
        {
            persons.add(new Types_Model("ميكروفيبربتش","60","شريط ساده",null));
        }else if (person.equals("مصنع مكى"))
        {
            persons.add(new Types_Model("ليجن","على الوصله","شريط ساده",null));
        }else if (person.equals("فايز يونس"))
        {
            persons.add(new Types_Model("مخلوط ليكرا+ملايه +قطن+بيكا ليكرا","على الوصله","شريط استثمارى",null));
        }else if (person.equals("عادل النجار"))
        {
            persons.add(new Types_Model("اسبن X  اسبن","60","شريط استثمارى",null));
        }else if (person.equals("عبد الرحمن الفقى"))
        {
            persons.add(new Types_Model("ميكروفيبربتش","150","شريط استثمارى",null));
        }else if (person.equals("عبور الشام"))
        {
            persons.add(new Types_Model("ميكروفيبربتش","على الوصله","شريط استثمارى",null));
        }else if (person.equals("عادل الجندى"))
        {
            persons.add(new Types_Model("بولستر x قطن","على الوصله","شريط صنع فى مصر",null));
            persons.add(new Types_Model("قميص(توب الدفه)","100 او على الوصله","شريط استثمارى",null));
        }else if (person.equals("محسن الخولى"))
        {
            persons.add(new Types_Model("فلافيل(تسليم الصدفى)","50","شريط صنع فى مصر",null));
            persons.add(new Types_Model("قميص كتان","50","شريط العميل",null));
            persons.add(new Types_Model("جبردين100%","على الوصله","شريط العميل+ صوره100/100",null));
            persons.add(new Types_Model("جبردين 55/55","على الوصله","شريط العميل+ كارت 55/55",null));
        }else if (person.equals("محمد ابراهيم"))
        {
            persons.add(new Types_Model("كريستال","60","شريط استثمارى",null));
        }else if (person.equals("هانى عقيل"))
        {
            persons.add(new Types_Model("كنفص","على الوصله","شريط استثمارى",null));
        }else if (person.equals("عبدالله عزب(عزب تكس)"))
        {
            persons.add(new Types_Model("فبران+كاروه","50","شريط ساده",null));
            persons.add(new Types_Model("كروشيه","30","شريط ساده",null));
        }else if (person.equals("اسامه عمران"))
        {
            persons.add(new Types_Model("ميلتون","على الوصله","شريط حلوانى","وزن + متر"));
        }else if (person.equals("الوزان"))
        {
            persons.add(new Types_Model("ميكروفيبربتش","50","شريط العميل",null));
            persons.add(new Types_Model("داكرون","100 رول","شريط العميل",null));
            persons.add(new Types_Model("داكرون","50 مطبق","شريط العميل",null));
        }else if (person.equals("هانى المليجى")) {
            persons.add(new Types_Model("كلوزماش", "على الوصله", "شريط حلوانى", "استثمارى"));
        }else if(person.equals("جابر حجازى")){
            persons.add(new Types_Model("بنطلون ليكرا","على الوصله","شريط ساده",null));
        }else if (person.equals("ناصر السوهاجى"))
        {
            persons.add(new Types_Model("روزيتا","على الوصله","شريط حلوانى + كارت استثمارى",null));
        }else if (person.equals("محمد تره"))
        {
            persons.add(new Types_Model("5050","100","شريط صنع فى مصر",null));
        }else if (person.equals("محمد السخاوى"))
        {
            persons.add(new Types_Model("؟؟","60","شريط ساده","متر+ وزن"));
        }else if (person.equals("الفولى"))
        {
            persons.add(new Types_Model("كرستال","60","شريط العميل",null));
            persons.add(new Types_Model("جبردين","100","شريط العميل","عيوب النسيج تلف درجه اولى مع اخذ عينه"));
        }else if (person.equals("محمد الفقى"))
        {
            persons.add(new Types_Model("كارينا ليكرا مطبوع","على الوصله","شريط ساده","عيوب التفذير حلوانى"));
        }else if (person.equals("اشرف رزق"))
        {
            persons.add(new Types_Model("كارينا مطبوع","على الوصله","شريط ساده",null));
            persons.add(new Types_Model("براسولا شعيرات مطبوع","على الوصله","شريط النحوى الكبير (طربوش)",null));
        }else if (person.equals("حسن مرجان"))
        {
            persons.add(new Types_Model("ليجن","50","شريط ساده",null));
        }else if (person.equals("اسماعيل عبود"))
        {
            persons.add(new Types_Model("جبردين","على الوصله","شريط استثمارى",null));
        }else if (person.equals("الاشرم"))
        {
            persons.add(new Types_Model("كرستال","على الوصله","شريط استثمارى",null));
        }else if (person.equals("مجدى ناصف"))
        {
            persons.add(new Types_Model("ميكروفيبربتش","150","شريط استثمارى",null));
        }else if (person.equals("تامر +ابراهيم الغنام"))
        {
            persons.add(new Types_Model("ميكروفيبربتش","150","شريط استثمارى",null));
        }else if (person.equals("جاك جبره(فايق تكس)"))
        {
            persons.add(new Types_Model("سوفت+ سوبر سوفت","60","شريط العميل",null));
            persons.add(new Types_Model("رويال+ مطبوع","60","شريط العميل","ماسوره كارتون"));
            persons.add(new Types_Model("كراتشى مطبوع","60","شريط العميل",null));
            persons.add(new Types_Model("براش","60+وزن","شريط العميل",null));
            persons.add(new Types_Model("جبردين ليكرا خفيف","50","شريط العميل",null));
            persons.add(new Types_Model("جيكار مونث","60","شريط العميل",null));
        }else if (person.equals("هشام شامل"))
        {
            persons.add(new Types_Model("روزيتا","على الوصله","شريط استثمارى",null));
        }else if (person.equals("ايهاب العتال"))
        {
            persons.add(new Types_Model("سوفت","60","شريط نبوسيمبل",null));
            persons.add(new Types_Model("بنجالين لايت","60","شريط ساده",null));
            persons.add(new Types_Model("كريب العتال","60","شريط ساده",null));
        }else if (person.equals("عبد الفتاح الناتعى"))
        {
            persons.add(new Types_Model("لاكوست","70 +وزن","شريط ساده","بدون عميل او صنف"));
            persons.add(new Types_Model("مربعات(كاروه مطبوع)","70 +وزن","شريط حلوانى",null));
        }else if (person.equals("وائل سعد"))
        {
            persons.add(new Types_Model("جبردين","على الوصله","شريط سنع فى مصر",null));
        }else if (person.equals("محمد عبد السلام"))
        {
            persons.add(new Types_Model("لاكوست","70 + وزن","شريط ساده",null));
        }else if (person.equals("وجيه عجايبى"))
        {
            persons.add(new Types_Model("سوفت","60","شريط العميل","المصريه السويسريه او داليسا"));
            persons.add(new Types_Model("شيفون","50","شريط العميل",null));
        }else if (person.equals("محمود غانم"))
        {
            persons.add(new Types_Model("ميكروفيبربتش","150","شريط استثمارى",null));
        }else if (person.equals("عبد الفادر رياض"))
        {
            persons.add(new Types_Model("50/50","على الوصله","شريط صنع فى مصر",null));
        }else if (person.equals("احمد عشماوى"))
        {
            persons.add(new Types_Model("ليجن","50","شريط ساده + كارت استثمارى",null));
            persons.add(new Types_Model("بلوش","على الوصله","حلوانى",null));
        }else if (person.equals("حازم حسن(200)"))
        {
            persons.add(new Types_Model("شيفون مطبوع","50","شريط القدس",null));
            persons.add(new Types_Model("فسكوز","50","شريط القدس",null));
        }else if (person.equals("سامر عبد المنعم"))
        {
            persons.add(new Types_Model("مخلوط قطن x  بولستر","60","شريط صنع فى مصر",null));
        }else if (person.equals("شريف الصدفى"))
        {
            persons.add(new Types_Model("نيو جاكيت","36","شريط ستان احمر",null));
        }else if (person.equals("هشام هلال"))
        {
            persons.add(new Types_Model("كنفاص","على الوصله","شريط استثمارى",null));
        }else if (person.equals("وليد الصباحى"))
        {
            persons.add(new Types_Model("بدله كاراتيه","على الوصله","شريط استثمارى",null));
        }else if (person.equals("عبده الصباغ"))
        {
            persons.add(new Types_Model("براسولا اسبن مطبوع","على الوصله","شريط ساده","متر"));
        }else if (person.equals("سكاى توب"))
        {
            persons.add(new Types_Model("ليجن","على الوصله","شريط حلوانى + كارت استثمارى ","متر + وزن"));
        }else if (person.equals("اشرف الباشا"))
        {
            persons.add(new Types_Model("جبردين","على الوصله","شريط الباشا",null));
        }else if (person.equals("حامد عيسى"))
        {
            persons.add(new Types_Model("رويال","لا يزيد عن 70 او عالوصله","شريط ساده",null));
        }else if (person.equals("اشرف الموجى"))
        {
            persons.add(new Types_Model("اطلس مشحم","150","شريط استثمارى + كارت الموجى",null));
        }else if (person.equals("كندوره"))
        {
            persons.add(new Types_Model("ميلتون","لف+ فحص على الوش","؟؟",null));
        }else if (person.equals("جمال ابو زيد"))
        {
            persons.add(new Types_Model("ليجن","على الوصله","حلوانى",null));
        }else if (person.equals("محمد عبد المغنى"))
        {
            persons.add(new Types_Model("روزيتا مطبوع","على الوصله","شريط ابيض + كارت استثمارى",null));
        }else if (person.equals("وليد الحامولى"))
        {
            persons.add(new Types_Model("روزيتا مطبوع","على الوصله","شريط ساده + كارت استثمارى",null));
        }else if (person.equals("محمد ابو الخير"))
        {
            persons.add(new Types_Model("بيكاشعيرات","على الوصله","شريط نيو سيمبل",null));
        }else if (person.equals("عبدالمجيد هلال"))
        {
            persons.add(new Types_Model("بيراسولا شعيرات مطبوع","على الوصله","شريط النحوى الكبير(فضى)","بدون وزن + اقل فضلات"));
        }else if (person.equals("رامى ابراهيم"))
        {
            persons.add(new Types_Model("بيراسولا شعيرات مطبوع","80","شريط ابيض كارت E","بدون وزن + اقل فضلات"));
        }else if (person.equals("محمود زهران"))
        {
            persons.add(new Types_Model("براسولا اسبن مطبوع","على الوصله","شريط النحوى الكبير(فضى)","بدون وزن + اقل فضلات"));
        }else if (person.equals("خاطر العرابى"))
        {
            persons.add(new Types_Model("كرستال","100","شريط استثمارى",null));
            persons.add(new Types_Model("جبردين شعيرات","100","شريط استثمارى",null));
        }else if (person.equals("محمد عبده"))
        {
            persons.add(new Types_Model("جبردين","على الوصله","شريط استثمارى",null));
        }else if (person.equals("عبداللطيف الشيخ"))
        {
            persons.add(new Types_Model("جبردين مبرد مخلوط","على الوصله","شريط صنع فى مصر",null));
        }else if (person.equals("يوسف تكس"))
        {
            persons.add(new Types_Model("كتان اسلاب","50 رول","شريط نيو سيمبل",null));
        }else if (person.equals("احمد عزام"))
        {
            persons.add(new Types_Model("براسولا مطبوع","على الوصله","شريط النحوى الفضى(طربوش)",null));
        }else if (person.equals("وليد الشافعى"))
        {
            persons.add(new Types_Model("براسولا شعيرات بتش مطبوع","على الوصله","شريط النحوى الفضى(طربوش)",null));
        }else if (person.equals("مصنع فريحه"))
        {
            persons.add(new Types_Model("براسولا شعيرات مطبوع","على الوصله","شريط النحوى الفضى(طربوش)",null));
        }else if (person.equals("وليد الشوربجى"))
        {
            persons.add(new Types_Model("جبردين","على الوصله","شريط صنع فى مصر",null));
        }else if (person.equals("محمد خورشيد"))
        {
            persons.add(new Types_Model("جبردين ليكرا خفيف","70","شريط الازرق+ كارت النحوى الفضى(طربوش)",null));
        }else if (person.equals("محمد السبخاوى"))
        {
            persons.add(new Types_Model("براسولا شعيرات مطبوع","على الوصله","شريط فضى",null));
        }



        Types_Adapter adapter = new Types_Adapter(persons);
        recyclerView.setAdapter(adapter);
    }

}
