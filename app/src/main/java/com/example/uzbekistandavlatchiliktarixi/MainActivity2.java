package com.example.uzbekistandavlatchiliktarixi;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity2 extends AppCompatActivity implements UserAdapterAC2.SelectedUser {



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
        setContentView(R.layout.activity_main2);


        Intent intent = getIntent();
        //imageViewc2 = findViewById(R.id.imageViewac2);

        // ruyhatni eloni va sozlanmasi
        recyclerView = findViewById(R.id.recyclerView1);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));



        // tool bar sozlanmasi
//        toolbar = findViewById(R.id.toolBAr);
//        this.setSupportActionBar(toolbar);
        this.getSupportActionBar().setTitle("");
        // tanlangan chapter nomini activity2 da sarlavhaga yozish
        textViewSelectedChapterName = findViewById(R.id.textViewSelectedChapterName);
        getChemgeItemPosition = intent.getIntExtra("swimmers",1);


        //backround uchun liner layoutni aniqlash
        constraintLayout = findViewById(R.id.constraintLayout1);
        constraintLayout.setBackgroundColor(getResources().getColor(R.color.mycolor));


        switch (getChemgeItemPosition){
            case 0: {

                textViewSelectedChapterName.setText("5-semestr uchun Ma'ruza");

                modelRcyclers.add(new ModelRcycler("1-ma’ruza: Kirish. “Davlatchilik” tushunchasi va uning kelib chiqishi ","https://github.com/asadbekakmedov2001/ustoziga/raw/master/app/src/main/assets/1.1.pdf"));
                modelRcyclers.add(new ModelRcycler("2-ma’ruza: “Davlatchilik tushunchasi. Davlatning kelib chitsishi to’g’risidagi nazariyalar.",""));
                modelRcyclers.add(new ModelRcycler("3-ma’ruza: Boshqaruv asoslarining shakllanishi va davlatlarning tashkil topishi",""));
                modelRcyclers.add(new ModelRcycler("4-ma’ruza: O’zbekiston hududida rivoj topgan ilk shahar-davlatlar: boshqaruv tartibi va davlat tuzimi",""));
                modelRcyclers.add(new ModelRcycler("5-ma’ruza: Ahamoniylar, Aleksandr Makedonskiy va yunon-baqtriya davlatlari va ularning boshqaruv asoslari",""));
                modelRcyclers.add(new ModelRcycler("6-ma’ruza:  Qang’, Davon davlatlari. Kushon davlati (podsholigi). Hududi va boshqaruv tizimi",""));
                modelRcyclers.add(new ModelRcycler("7-ma’ruza: Xioniylar va kidariylar davlati",""));
                modelRcyclers.add(new ModelRcycler("8-ma’ruza: Eftaliylar davlatida ijtimoiy-iqtisodiy tuzumi",""));
                modelRcyclers.add(new ModelRcycler("9-ma’ruza:  Turk xoqonligi va uning ma’muriy tuzulishi va boshqaruv tartibi",""));
                modelRcyclers.add(new ModelRcycler("10-ma’ruza: Ilk o’rta asrlarda Markaziy Osiyoda mahalliy hokimliklar: Sug’d, Xorazm, Toxariston, Choch, Eloq",""));
                modelRcyclers.add(new ModelRcycler("11-ma’ruza: Arablarning O’rta Osiyoni istilo etishi va ularning Movaraunnahrdagi boshqaruvi: ijtimoiy-siyosiy jarayonlar",""));
                modelRcyclers.add(new ModelRcycler("12-ma’ruza: Somoniylar davlati: ijtimoiy-siyosiy jarayonlar, davlat boshqaruv tartibi, huquqiy munosabatlar. Qoraxoniylar davlat: ma’muriy tuzilishi, hududi, davlat boshqaruv tartiblari",""));
                modelRcyclers.add(new ModelRcycler("13-ma’ruza:  G’aznaviylar va Saljuqiylarning davlat boshqaruv tizimi",""));
                modelRcyclers.add(new ModelRcycler("14-ma’ruza: Xorazmshoh-anushteginiylar davlatining ma’muriy tuzilishi, boshqaruv tartiblari. Chig’atoy ulusi-ma’muriy tuzulishi va boshqaruv tartiblari",""));

            }break;
            case 1: {

                textViewSelectedChapterName.setText("5-semestr uchun Seminar");

                modelRcyclers.add(new ModelRcycler("1-seminar: O’zbekiston davlatchiligi tarixi fanining predmeti, maqsadi va vazifalari.",""));
                modelRcyclers.add(new ModelRcycler("2-seminar: “Davlatchilik tushunchasi.Davlatning kelib chitsishi tugrisidagi nazariyalar.",""));
                modelRcyclers.add(new ModelRcycler("3-seminar: Boshqaruv asoslarining shakllanishi va davlatlarning tashkil topishi",""));
                modelRcyclers.add(new ModelRcycler("4-seminar: Qadimgi davlatchilik turlari va boshqaruv shakli",""));
                modelRcyclers.add(new ModelRcycler("5-seminar: Ahamoniylar, Aleksandr Makedonskiy va yunon-baqtriya davlatlari va ularning boshqaruv asoslari",""));
                modelRcyclers.add(new ModelRcycler("6-seminar: Qang’, Davon davlatlari. Kushon davlati (podsholigi). Hududi va boshqaruv tizimi",""));
                modelRcyclers.add(new ModelRcycler("7-seminar: Xioniylar va kidariylar davlati",""));
                modelRcyclers.add(new ModelRcycler("8-seminar: Eftaliylar davlatida ijtimoiy-iqtisodiy tuzumi",""));
                modelRcyclers.add(new ModelRcycler("9-seminar: Turk xoqonligi va uning ma’muriy tuzulishi va boshqaruv tartibi",""));
                modelRcyclers.add(new ModelRcycler("10-seminar: Ilk o’rta asrlarda Markaziy Osiyoda mahalliy hokimliklar: Sug’d, Xorazm, Toxariston, Choch, Eloq",""));
                modelRcyclers.add(new ModelRcycler("11-seminar: Arablarning O’rta Osiyoni istilo etishi va ularning Movaraunnahrdagi boshqaruvi: ijtimoiy-siyosiy jarayonlar",""));
                modelRcyclers.add(new ModelRcycler("12-seminar: Somoniylar davlati: ijtimoiy-siyosiy jarayonlar",""));
                modelRcyclers.add(new ModelRcycler("13-seminar: Somoniylar davlati: davlat boshqaruv tartibi, huquqiy munosabatlar.",""));
                modelRcyclers.add(new ModelRcycler("14-seminar: Qoraxoniylar davlat: ma’muriy tuzilishi, hududi, davlat boshqaruv tartiblari",""));
                modelRcyclers.add(new ModelRcycler("15-seminar: G’aznaviylarning davlat boshqaruv tizimi",""));
                modelRcyclers.add(new ModelRcycler("16-seminar: Saljuqiylarning davlat boshqaruv tizimi",""));
                modelRcyclers.add(new ModelRcycler("17-seminar: Xorazmshoh-anushteginiylar davlatining siyosiy tarixi",""));
                modelRcyclers.add(new ModelRcycler("18-seminar: Xorazmshoh-anushteginiylar davlatining ma’muriy tuzilishi, boshqaruv tartiblari. \n",""));
                modelRcyclers.add(new ModelRcycler("19-seminar: Mug’ullar hukmronligining qaror topishi. Chig’atoy ulusining siyosiy hayoti.",""));
                modelRcyclers.add(new ModelRcycler("20-seminar: Chig’atoy ulusi-ma’muriy tuzulishi va boshqaruv tartiblari",""));

            }break;

            case 2: {

                textViewSelectedChapterName.setText("5-semestr uchun Taqdimot");

                modelRcyclers.add(new ModelRcycler("1-ma’ruza taqdimoti: Kirish. “Davlatchilik” tushunchasi va uning kelib chiqishi ","https://github.com/asadbekakmedov2001/ustoziga/raw/master/app/src/main/assets/1.1.pdf"));
                modelRcyclers.add(new ModelRcycler("2-ma’ruza taqdimoti: “Davlatchilik tushunchasi. Davlatning kelib chitsishi to’g’risidagi nazariyalar.",""));
                modelRcyclers.add(new ModelRcycler("3-ma’ruza taqdimoti: Boshqaruv asoslarining shakllanishi va davlatlarning tashkil topishi",""));
                modelRcyclers.add(new ModelRcycler("4-ma’ruza taqdimoti: O’zbekiston hududida rivoj topgan ilk shahar-davlatlar: boshqaruv tartibi va davlat tuzimi",""));
                modelRcyclers.add(new ModelRcycler("5-ma’ruza taqdimoti: Ahamoniylar, Aleksandr Makedonskiy va yunon-baqtriya davlatlari va ularning boshqaruv asoslari",""));
                modelRcyclers.add(new ModelRcycler("6-ma’ruza taqdimoti:  Qang’, Davon davlatlari. Kushon davlati (podsholigi). Hududi va boshqaruv tizimi",""));
                modelRcyclers.add(new ModelRcycler("7-ma’ruza taqdimoti: Xioniylar va kidariylar davlati",""));
                modelRcyclers.add(new ModelRcycler("8-ma’ruza taqdimoti: Eftaliylar davlatida ijtimoiy-iqtisodiy tuzumi",""));
                modelRcyclers.add(new ModelRcycler("9-ma’ruza taqdimoti:  Turk xoqonligi va uning ma’muriy tuzulishi va boshqaruv tartibi",""));
                modelRcyclers.add(new ModelRcycler("10-ma’ruza taqdimoti: Ilk o’rta asrlarda Markaziy Osiyoda mahalliy hokimliklar: Sug’d, Xorazm, Toxariston, Choch, Eloq",""));
                modelRcyclers.add(new ModelRcycler("11-ma’ruza taqdimoti: Arablarning O’rta Osiyoni istilo etishi va ularning Movaraunnahrdagi boshqaruvi: ijtimoiy-siyosiy jarayonlar",""));
                modelRcyclers.add(new ModelRcycler("12-ma’ruza taqdimoti: Somoniylar davlati: ijtimoiy-siyosiy jarayonlar, davlat boshqaruv tartibi, huquqiy munosabatlar. Qoraxoniylar davlat: ma’muriy tuzilishi, hududi, davlat boshqaruv tartiblari",""));
                modelRcyclers.add(new ModelRcycler("13-ma’ruza taqdimoti:  G’aznaviylar va Saljuqiylarning davlat boshqaruv tizimi",""));
                modelRcyclers.add(new ModelRcycler("14-ma’ruza taqdimoti: Xorazmshoh-anushteginiylar davlatining ma’muriy tuzilishi, boshqaruv tartiblari. Chig’atoy ulusi-ma’muriy tuzulishi va boshqaruv tartiblari",""));


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
        startActivity(new Intent(MainActivity2.this, MainActivity3.class).putExtra("data",modelRcycler.getLoadUrl()));
    }
}