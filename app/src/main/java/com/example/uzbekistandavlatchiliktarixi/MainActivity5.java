package com.example.uzbekistandavlatchiliktarixi;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity5 extends AppCompatActivity implements UserAdapterAC2.SelectedUser {



    Toolbar toolbar;
    RecyclerView recyclerView;
    List<ModelRcycler> modelRcyclers = new ArrayList<>();
    TextView textViewSelectedChapterName;

    int getChemgeItemPosition;


    ConstraintLayout constraintLayout;
    UserAdapterAC2 userAdapter;
    ImageView imageViewc2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);


        Intent intent = getIntent();
       // imageViewc2 = findViewById(R.id.imageViewac2);

        // ruyhatni eloni va sozlanmasi
        recyclerView = findViewById(R.id.recyclerView5);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));



        // tool bar sozlanmasi
//        toolbar = findViewById(R.id.toolBAr);
//        this.setSupportActionBar(toolbar);
        this.getSupportActionBar().setTitle("");
        // tanlangan chapter nomini activity2 da sarlavhaga yozish
        textViewSelectedChapterName = findViewById(R.id.textViewSelectedChapterName5);
        getChemgeItemPosition = intent.getIntExtra("swimmers",1);


        //backround uchun liner layoutni aniqlash
        constraintLayout = findViewById(R.id.constraintLayout5);
        constraintLayout.setBackgroundColor(getResources().getColor(R.color.mycolor));


        switch (getChemgeItemPosition){
            case 0: {

                textViewSelectedChapterName.setText("6-semestr uchun Ma'ruza");

                modelRcyclers.add(new ModelRcycler("1-ma’ruza: Amir Temur va temuriylar davrida Movarounnahr va Xurosonda davlatchilik rivoji","https://github.com/asadbekakmedov2001/UzbekistanDavlatchilikTarixi/raw/main/app/src/main/assets/6.1_maruza.doc"));
                modelRcyclers.add(new ModelRcycler("2-ma’ruza: Shayboniylar va Ashtarxoniylar davrida Buxoro xonligining boshqaruv tuzumi: markaziy va mahalliy boshqaruvi.","https://github.com/asadbekakmedov2001/UzbekistanDavlatchilikTarixi/raw/main/app/src/main/assets/6.2_maruza.doc"));
                modelRcyclers.add(new ModelRcycler("3-ma’ruza: Mang’itlar sulolasi hukmronligi davrida davlat boshqaruvi va ma’muriy tizimi","https://github.com/asadbekakmedov2001/UzbekistanDavlatchilikTarixi/raw/main/app/src/main/assets/6.3_maruza.doc"));
                modelRcyclers.add(new ModelRcycler("4-ma’ruza: Xiva xonligi: hududi, mu’muriy tuzilishi, markaziy va mahalliy boshqaruv tartiblari","https://github.com/asadbekakmedov2001/UzbekistanDavlatchilikTarixi/raw/main/app/src/main/assets/6.4_maruza.doc"));
                modelRcyclers.add(new ModelRcycler("5-ma’ruza: Qo’qon xonligi: hududi, mu’muriy tuzilishi, markaziy va mahalliy boshqaruv tartiblari","https://github.com/asadbekakmedov2001/UzbekistanDavlatchilikTarixi/raw/main/app/src/main/assets/6.5_maruza.doc"));
                modelRcyclers.add(new ModelRcycler("6-ma’ruza: Turkiston o’lkasida harbiy-ma’muriy hokimiyat tizimining yuzaga kelishi.","https://github.com/asadbekakmedov2001/UzbekistanDavlatchilikTarixi/raw/main/app/src/main/assets/6.6_maruza.doc"));
                modelRcyclers.add(new ModelRcycler("7-ma’ruza: Mustamlaka boshqaruv tizimining takomillashtirilishi","https://github.com/asadbekakmedov2001/UzbekistanDavlatchilikTarixi/raw/main/app/src/main/assets/6.7_maruza.doc"));
                modelRcyclers.add(new ModelRcycler("8-ma’ruza: 1917-yil siyosiy jarayonlarida Turkiston. Turkiston Muxtoriyati milliy demokratik davlatchilikning dastlabki tajribasi.","https://github.com/asadbekakmedov2001/UzbekistanDavlatchilikTarixi/raw/main/app/src/main/assets/6.8_maruza.doc"));
                modelRcyclers.add(new ModelRcycler("9-ma’ruza: O’zbekiston SSRning tashkil topishi va boshqaruvning ma’muriy- buyruqbozlik tizimi","https://github.com/asadbekakmedov2001/UzbekistanDavlatchilikTarixi/raw/main/app/src/main/assets/6.9_maruza.doc"));
                modelRcyclers.add(new ModelRcycler("10-ma’ruza: O’zbekistonda davlat boshqaruvining yangi tizimining shakllanishi va rivojlanib borishi. Davlat hokimiyati va boshqaruvini demokratlashtirish.","https://github.com/asadbekakmedov2001/UzbekistanDavlatchilikTarixi/raw/main/app/src/main/assets/6.10_maruza.doc"));
                modelRcyclers.add(new ModelRcycler("11-ma’ruza:  Mustaqillik yillarida Qoraqalpog’iston Respublikasi davlatchiligi taraqqiyoti.","https://github.com/asadbekakmedov2001/UzbekistanDavlatchilikTarixi/raw/main/app/src/main/assets/6.11_maruza.doc"));
                modelRcyclers.add(new ModelRcycler("12-ma’ruza:  “Harakatlar strategiyasi”: O’zbekiston boshqaruvidagi islohotlar.","https://github.com/asadbekakmedov2001/UzbekistanDavlatchilikTarixi/raw/main/app/src/main/assets/6.12_maruza.doc"));

            }break;
            case 1: {

                textViewSelectedChapterName.setText("6-semestr uchun Seminar");
                modelRcyclers.add(new ModelRcycler("1-seminar: Amir Temurning siyosiy xokimyatni qo’lga olishi va markazlashgan davlat asoslarining yaratilishi","https://github.com/asadbekakmedov2001/UzbekistanDavlatchilikTarixi/raw/main/app/src/main/assets/6.1_taqdimot.doc"));
                modelRcyclers.add(new ModelRcycler("2-seminar: Amir Temurning harbiy islohoti.","https://github.com/asadbekakmedov2001/UzbekistanDavlatchilikTarixi/raw/main/app/src/main/assets/6.2_taqdimot.doc"));
                modelRcyclers.add(new ModelRcycler("3-seminar: Ulug’bek davrida Movarounnahr.","https://github.com/asadbekakmedov2001/UzbekistanDavlatchilikTarixi/raw/main/app/src/main/assets/6.3_taqdimot.doc"));
                modelRcyclers.add(new ModelRcycler("4-seminar: Shayboniylar davrida Buxoro xonligining boshqaruv tuzumi: markaziy va mahalliy boshqaruvi.","https://github.com/asadbekakmedov2001/UzbekistanDavlatchilikTarixi/raw/main/app/src/main/assets/6.4_taqdimot.doc"));
                modelRcyclers.add(new ModelRcycler("5-seminar: Ashtarxoniylar davrida Buxoro xonligining boshqaruv tuzumi: markaziy va mahalliy boshqaruvi.","https://github.com/asadbekakmedov2001/UzbekistanDavlatchilikTarixi/raw/main/app/src/main/assets/6.5_taqdimot.doc"));
                modelRcyclers.add(new ModelRcycler("6-seminar: Mang’itlar sulolasi hukmronligi davrida Buxoro amirligi","https://github.com/asadbekakmedov2001/UzbekistanDavlatchilikTarixi/raw/main/app/src/main/assets/6.6_taqdimot.doc"));
                modelRcyclers.add(new ModelRcycler("7-seminar: Mang’itlar sulolasi hukmronligi davrida davlat boshqaruvi va ma’muriy tizimi","https://github.com/asadbekakmedov2001/UzbekistanDavlatchilikTarixi/raw/main/app/src/main/assets/6.7_taqdimot.doc"));
                modelRcyclers.add(new ModelRcycler("8-seminar: Xiva xonligining siyosiy tarixi, hududi, mu’muriy tuzilishi","https://github.com/asadbekakmedov2001/UzbekistanDavlatchilikTarixi/raw/main/app/src/main/assets/6.8_taqdimot.doc"));
                modelRcyclers.add(new ModelRcycler("9-seminar: Xiva xonligining markaziy va mahalliy boshqaruv tartiblari","https://github.com/asadbekakmedov2001/UzbekistanDavlatchilikTarixi/raw/main/app/src/main/assets/6.9_taqdimot.doc"));
                modelRcyclers.add(new ModelRcycler("10-seminar:  Qo’qon xonligining siyosiy tarixi, hududi, mu’muriy tuzilishi","https://github.com/asadbekakmedov2001/UzbekistanDavlatchilikTarixi/raw/main/app/src/main/assets/6.10_taqdimot.doc"));
                modelRcyclers.add(new ModelRcycler("11-seminar: Qo’qon xonligining markaziy va mahalliy boshqaruv tartiblari","https://github.com/asadbekakmedov2001/UzbekistanDavlatchilikTarixi/raw/main/app/src/main/assets/6.11_taqdimot.doc"));
                modelRcyclers.add(new ModelRcycler("12-seminar: Turkiston o’lkasida harbiy-ma’muriy hokimiyat tizimining yuzaga kelishi.","https://github.com/asadbekakmedov2001/UzbekistanDavlatchilikTarixi/raw/main/app/src/main/assets/6.12_taqdimot.doc"));
                modelRcyclers.add(new ModelRcycler("13-seminar: Mustamlaka boshqaruv tizimining takomillashtirilishi","https://github.com/asadbekakmedov2001/UzbekistanDavlatchilikTarixi/raw/main/app/src/main/assets/6.13_taqdimot.doc"));
                modelRcyclers.add(new ModelRcycler("14-seminar: 1917-yil siyosiy jarayonlarida Turkiston. Turkiston Muxtoriyati milliy demokratik davlatchilikning dastlabki tajribasi.","https://github.com/asadbekakmedov2001/UzbekistanDavlatchilikTarixi/raw/main/app/src/main/assets/6.14_taqdimot.doc"));
                modelRcyclers.add(new ModelRcycler("15-seminar: O’zbekiston SSRning tashkil topishi va boshqaruvning ma’muriy- buyruqbozlik tizimi. ","https://github.com/asadbekakmedov2001/UzbekistanDavlatchilikTarixi/raw/main/app/src/main/assets/6.15_taqdimot.doc"));
                modelRcyclers.add(new ModelRcycler("16-seminar:  O’zbekistonda davlat boshqaruvining yangi tizimining shakllanishi va rivojlanib borishi. Davlat hokimiyati va boshqaruvini demokratlashtirish.","https://github.com/asadbekakmedov2001/UzbekistanDavlatchilikTarixi/raw/main/app/src/main/assets/6.16_taqdimot.doc"));
                modelRcyclers.add(new ModelRcycler("17-seminar: Mustaqillik yillarida Qoraqalpog’iston Respublikasi davlatchiligi taraqqiyoti","https://github.com/asadbekakmedov2001/UzbekistanDavlatchilikTarixi/raw/main/app/src/main/assets/6.17_taqdimot.doc"));
                modelRcyclers.add(new ModelRcycler("18-seminar: “Harakatlar strategiyasi”: O’zbekiston boshqaruvidagi islohotlar.","https://github.com/asadbekakmedov2001/UzbekistanDavlatchilikTarixi/raw/main/app/src/main/assets/6.18_taqdimot.doc"));

            }break;

            case 2: {

                textViewSelectedChapterName.setText("6-semestr uchun Taqdimot");
                modelRcyclers.add(new ModelRcycler("1-ma’ruza taqdimoti: Amir Temur va temuriylar davrida Movarounnahr va Xurosonda davlatchilik rivoji","https://github.com/asadbekakmedov2001/UzbekistanDavlatchilikTarixi/raw/main/app/src/main/assets/6.1_slayd.pptx"));
                modelRcyclers.add(new ModelRcycler("2-ma’ruza taqdimoti: Shayboniylar va Ashtarxoniylar davrida Buxoro xonligining boshqaruv tuzumi: markaziy va mahalliy boshqaruvi.","https://github.com/asadbekakmedov2001/UzbekistanDavlatchilikTarixi/raw/main/app/src/main/assets/6.2_slayd.pptx"));
                modelRcyclers.add(new ModelRcycler("3-ma’ruza taqdimoti: Mang’itlar sulolasi hukmronligi davrida davlat boshqaruvi va ma’muriy tizimi","https://github.com/asadbekakmedov2001/UzbekistanDavlatchilikTarixi/raw/main/app/src/main/assets/6.3_slayd.pptx"));
                modelRcyclers.add(new ModelRcycler("4-ma’ruza taqdimoti: Xiva xonligi: hududi, mu’muriy tuzilishi, markaziy va mahalliy boshqaruv tartiblari","https://github.com/asadbekakmedov2001/UzbekistanDavlatchilikTarixi/raw/main/app/src/main/assets/6.4_slayd.pptx"));
                modelRcyclers.add(new ModelRcycler("5-ma’ruza taqdimoti: Qo’qon xonligi: hududi, mu’muriy tuzilishi, markaziy va mahalliy boshqaruv tartiblari","https://github.com/asadbekakmedov2001/UzbekistanDavlatchilikTarixi/raw/main/app/src/main/assets/6.5_slayd.pptx"));
                modelRcyclers.add(new ModelRcycler("6-ma’ruza taqdimoti: Turkiston o’lkasida harbiy-ma’muriy hokimiyat tizimining yuzaga kelishi.","https://github.com/asadbekakmedov2001/UzbekistanDavlatchilikTarixi/raw/main/app/src/main/assets/6.6_slayd.pptx"));
                modelRcyclers.add(new ModelRcycler("7-ma’ruza taqdimoti: Mustamlaka boshqaruv tizimining takomillashtirilishi","https://github.com/asadbekakmedov2001/UzbekistanDavlatchilikTarixi/raw/main/app/src/main/assets/6.7_slayd.pptx"));
                modelRcyclers.add(new ModelRcycler("8-ma’ruza taqdimoti: 1917-yil siyosiy jarayonlarida Turkiston. Turkiston Muxtoriyati milliy demokratik davlatchilikning dastlabki tajribasi.","https://github.com/asadbekakmedov2001/UzbekistanDavlatchilikTarixi/raw/main/app/src/main/assets/6.8_slayd.pptx"));
                modelRcyclers.add(new ModelRcycler("9-ma’ruza taqdimoti: O’zbekiston SSRning tashkil topishi va boshqaruvning ma’muriy- buyruqbozlik tizimi","https://github.com/asadbekakmedov2001/UzbekistanDavlatchilikTarixi/raw/main/app/src/main/assets/6.9_slayd.pptx"));
                modelRcyclers.add(new ModelRcycler("10-ma’ruza taqdimoti: O’zbekistonda davlat boshqaruvining yangi tizimining shakllanishi va rivojlanib borishi. Davlat hokimiyati va boshqaruvini demokratlashtirish.","https://github.com/asadbekakmedov2001/UzbekistanDavlatchilikTarixi/raw/main/app/src/main/assets/6.10_slayd.pptx"));
                modelRcyclers.add(new ModelRcycler("11-ma’ruza taqdimoti:  Mustaqillik yillarida Qoraqalpog’iston Respublikasi davlatchiligi taraqqiyoti.","https://github.com/asadbekakmedov2001/UzbekistanDavlatchilikTarixi/raw/main/app/src/main/assets/6.11_slayd.pptx"));
                modelRcyclers.add(new ModelRcycler("12-ma’ruza taqdimoti:  “Harakatlar strategiyasi”: O’zbekiston boshqaruvidagi islohotlar.","https://github.com/asadbekakmedov2001/UzbekistanDavlatchilikTarixi/raw/main/app/src/main/assets/6.12_slayd.pptx"));


            }break;



        }

        userAdapter  = new UserAdapterAC2(modelRcyclers,  this);
        recyclerView.setAdapter(userAdapter);



    }

    @RequiresApi(api = Build.VERSION_CODES.P)
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu1,menu);
        MenuItem menuItem = menu.findItem(R.id.search_view);

        SearchView searchView = (SearchView)menuItem.getActionView();
        searchView.setMaxWidth(Integer.MAX_VALUE);


        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                userAdapter.getFilter().filter(newText);
                return true;
            }
        });
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id   = item.getItemId();
        if (id == R.id.search_view) return true;
        return super.onOptionsItemSelected(item);
    }


    @Override
    public void selectedUser(ModelRcycler modelRcycler) {
        startActivity(new Intent(MainActivity5.this, MainActivity3.class).putExtra("data",modelRcycler.getLoadUrl()));
    }
}