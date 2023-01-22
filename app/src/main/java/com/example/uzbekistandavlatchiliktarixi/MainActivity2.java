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

                textViewSelectedChapterName.setText("Ma'ruzalar to'plami");

                modelRcyclers.add(new ModelRcycler("1-mavzu: O‘zbekiston tarixi fanining predmeti, maqsadi, vazifalari va metodologik asoslari","https://github.com/asadbekakmedov2001/UzbekistanDavlatchilikTarixi/raw/main/app/src/main/assets/maruza1.doc"));
                modelRcyclers.add(new ModelRcycler("2-mavzu: Paleolit  –  qadimgi tosh davri tarixi.","https://github.com/asadbekakmedov2001/UzbekistanDavlatchilikTarixi/raw/main/app/src/main/assets/maruza2.doc"));
                modelRcyclers.add(new ModelRcycler("3-mavzu: Mezolit – o‘rta tosh davri tarixi.","https://github.com/asadbekakmedov2001/UzbekistanDavlatchilikTarixi/raw/main/app/src/main/assets/maruza3.doc"));
                modelRcyclers.add(new ModelRcycler("4-mavzu: Neolit – yangi tosh davri tarixi.","https://github.com/asadbekakmedov2001/UzbekistanDavlatchilikTarixi/raw/main/app/src/main/assets/maruza4.doc"));
                modelRcyclers.add(new ModelRcycler("5-mavzu: Eneolit – mis-tosh davri tarixi.","https://github.com/asadbekakmedov2001/UzbekistanDavlatchilikTarixi/raw/main/app/src/main/assets/maruza5.doc"));
                modelRcyclers.add(new ModelRcycler("6-mavzu: Bronza va temir davri tarixi","https://github.com/asadbekakmedov2001/UzbekistanDavlatchilikTarixi/raw/main/app/src/main/assets/maruza6.doc"));
                modelRcyclers.add(new ModelRcycler("7-mavzu: “AVESTO” VA ZARDUSHTIYLIK ","https://github.com/asadbekakmedov2001/UzbekistanDavlatchilikTarixi/raw/main/app/src/main/assets/maruza7.doc"));
                modelRcyclers.add(new ModelRcycler("8-mavzu: O’zbekiston davlatchiligining shakllanish asoslari ","https://github.com/asadbekakmedov2001/UzbekistanDavlatchilikTarixi/raw/main/app/src/main/assets/maruza8.doc"));
                modelRcyclers.add(new ModelRcycler("9-mavzu: O’zbekistonning eng qadimgi davlatlari. Qadimgi  fors  bitiklari  va  ilk  yunon  manbalarida  tarixiy  – madaniy  viloyatlar  va  qadimgi  davlatlar.","https://github.com/asadbekakmedov2001/UzbekistanDavlatchilikTarixi/raw/main/app/src/main/assets/maruza9.doc"));
                modelRcyclers.add(new ModelRcycler("10-mavzu: O‘rta Osiyo Ahamoniylar davlati tarkibida (mil.avv. VI-IV asrlar)","https://github.com/asadbekakmedov2001/UzbekistanDavlatchilikTarixi/raw/main/app/src/main/assets/maruza10.doc"));
                modelRcyclers.add(new ModelRcycler("11-mavzu: MAKIDONIYALIK ALEKSANDRNING  BAQTRIYA VA SUG’DIYONAGA YURISHLARI  ","https://github.com/asadbekakmedov2001/UzbekistanDavlatchilikTarixi/raw/main/app/src/main/assets/maruza11.doc"));
                modelRcyclers.add(new ModelRcycler("12-mavzu: O‘zbekistonning antik davr davlatchiligi. Salavkiylar, Yunon–Baqtriya va Parfiya davlati","https://github.com/asadbekakmedov2001/UzbekistanDavlatchilikTarixi/raw/main/app/src/main/assets/maruza12.doc"));
                modelRcyclers.add(new ModelRcycler("13-mavzu: Qadimgi Xorazm, Qang‘ va Davan davlati","https://github.com/asadbekakmedov2001/UzbekistanDavlatchilikTarixi/raw/main/app/src/main/assets/maruza13.doc"));
                modelRcyclers.add(new ModelRcycler("14-mavzu: Yuechji–Kushon va Kushon davlatlari","https://github.com/asadbekakmedov2001/UzbekistanDavlatchilikTarixi/raw/main/app/src/main/assets/maruza14.doc"));
                modelRcyclers.add(new ModelRcycler("15-mavzu: Buyuk ipak yo’li - muloqot va hamkorlik yo’li.","https://github.com/asadbekakmedov2001/UzbekistanDavlatchilikTarixi/raw/main/app/src/main/assets/maruza15.doc"));
                modelRcyclers.add(new ModelRcycler("16-mavzu: O’rta Osiyoda yerga egalik qilish munosabatlarining shakllanishi va rivojlanishi . Kidariylar, Xioniylar  va Eftaliylar davlati","https://github.com/asadbekakmedov2001/UzbekistanDavlatchilikTarixi/raw/main/app/src/main/assets/maruza16.doc"));
                modelRcyclers.add(new ModelRcycler("17-mavzu: Turk xoqonligi davrida O’rta Osiyo.","https://github.com/asadbekakmedov2001/UzbekistanDavlatchilikTarixi/raw/main/app/src/main/assets/maruza17.doc"));
                modelRcyclers.add(new ModelRcycler("18-mavzu: Arab xalifaligi davrida Movaraunnaxr va Xuroson. ","https://github.com/asadbekakmedov2001/UzbekistanDavlatchilikTarixi/raw/main/app/src/main/assets/maruza18.doc"));
                modelRcyclers.add(new ModelRcycler("19-mavzu: Movarounnaxr va Xurosonda arablar bosqiniga qarshi xalq ozodlik harakatlari","https://github.com/asadbekakmedov2001/UzbekistanDavlatchilikTarixi/raw/main/app/src/main/assets/maruza19.doc"));
                modelRcyclers.add(new ModelRcycler("20-mavzu: Movaraunnaxr va Xurosonda mustaqil davlatlarning tashkil topishi. Qorluqlar, O’g’uzlar, Toxiriylar davlati  va Safforiylar davlati.","https://github.com/asadbekakmedov2001/UzbekistanDavlatchilikTarixi/raw/main/app/src/main/assets/maruza20.doc"));
                modelRcyclers.add(new ModelRcycler("21-mavzu: SOMONIYLAR DAVLATI.","https://github.com/asadbekakmedov2001/UzbekistanDavlatchilikTarixi/raw/main/app/src/main/assets/maruza21.doc"));
                modelRcyclers.add(new ModelRcycler("22-mavzu: QORAXONIYLAR DAVLATI","https://github.com/asadbekakmedov2001/UzbekistanDavlatchilikTarixi/raw/main/app/src/main/assets/maruza22.doc"));
                modelRcyclers.add(new ModelRcycler("23-mavzu: G’aznaviylar va Saljuqiylar davlati.","https://github.com/asadbekakmedov2001/UzbekistanDavlatchilikTarixi/raw/main/app/src/main/assets/maruza23.doc"));
                modelRcyclers.add(new ModelRcycler("24-mavzu: Xorazmshoh – Anushtegeniylar davlati","https://github.com/asadbekakmedov2001/UzbekistanDavlatchilikTarixi/raw/main/app/src/main/assets/maruza24.doc"));
                modelRcyclers.add(new ModelRcycler("25-mavzu: O’rta Osiyo xalqlari tarixida IX-XII asrlarda yuz bergan Uygonish davri.  Aniq va tabiiy fanlarning yuksalishi","https://github.com/asadbekakmedov2001/UzbekistanDavlatchilikTarixi/raw/main/app/src/main/assets/maruza25.doc"));
                modelRcyclers.add(new ModelRcycler("26-mavzu: IX-XII asrlarda tarix, adabiyot va diniy bilimlarning yuksalishi","https://github.com/asadbekakmedov2001/UzbekistanDavlatchilikTarixi/raw/main/app/src/main/assets/maruza26.doc"));
                modelRcyclers.add(new ModelRcycler("27-mavzu: Etnogenez va etnik tarix masalalari.","https://github.com/asadbekakmedov2001/UzbekistanDavlatchilikTarixi/raw/main/app/src/main/assets/maruza27.doc"));
                modelRcyclers.add(new ModelRcycler("28-mavzu: Movarounnaxr va Xurosonning mug’ullar tomonidan bosib olinishi.","https://github.com/asadbekakmedov2001/UzbekistanDavlatchilikTarixi/raw/main/app/src/main/assets/maruza28.doc"));
                modelRcyclers.add(new ModelRcycler("29-mavzu: Jaloliddin Manguberdi jasoratlari.","https://github.com/asadbekakmedov2001/UzbekistanDavlatchilikTarixi/raw/main/app/src/main/assets/maruza29.doc"));
                modelRcyclers.add(new ModelRcycler("30-mavzu: Movarounnahr Chig’atoy ulusi tarkibida.","https://github.com/asadbekakmedov2001/UzbekistanDavlatchilikTarixi/raw/main/app/src/main/assets/maruza30.doc"));


            }break;
            case 1: {

                textViewSelectedChapterName.setText("Taqdimotlar to'plami");

                modelRcyclers.add(new ModelRcycler("1-mavzu: O‘zbekiston tarixi fanining predmeti, maqsadi, vazifalari va metodologik asoslari","https://github.com/asadbekakmedov2001/UzbekistanDavlatchilikTarixi/raw/main/app/src/main/assets/slayd1.pptx"));
                modelRcyclers.add(new ModelRcycler("2-mavzu: Paleolit  –  qadimgi tosh davri tarixi.","https://github.com/asadbekakmedov2001/UzbekistanDavlatchilikTarixi/raw/main/app/src/main/assets/slayd2.pptx"));
                modelRcyclers.add(new ModelRcycler("3-mavzu: Mezolit – o‘rta tosh davri tarixi.","https://github.com/asadbekakmedov2001/UzbekistanDavlatchilikTarixi/raw/main/app/src/main/assets/slayd3.pptx"));
                modelRcyclers.add(new ModelRcycler("4-mavzu: Neolit – yangi tosh davri tarixi.","https://github.com/asadbekakmedov2001/UzbekistanDavlatchilikTarixi/raw/main/app/src/main/assets/slayd4.pptx"));
                modelRcyclers.add(new ModelRcycler("5-mavzu: Eneolit – mis-tosh davri tarixi.","https://github.com/asadbekakmedov2001/UzbekistanDavlatchilikTarixi/raw/main/app/src/main/assets/slayd5.pptx"));
                modelRcyclers.add(new ModelRcycler("6-mavzu: Bronza va temir davri tarixi","https://github.com/asadbekakmedov2001/UzbekistanDavlatchilikTarixi/raw/main/app/src/main/assets/slayd6.pptx"));
                modelRcyclers.add(new ModelRcycler("7-mavzu: “AVESTO” VA ZARDUSHTIYLIK ","https://github.com/asadbekakmedov2001/UzbekistanDavlatchilikTarixi/raw/main/app/src/main/assets/slayd7.pptx"));
                modelRcyclers.add(new ModelRcycler("8-mavzu: O’zbekiston davlatchiligining shakllanish asoslari ","https://github.com/asadbekakmedov2001/UzbekistanDavlatchilikTarixi/raw/main/app/src/main/assets/slayd8.pptx"));
                modelRcyclers.add(new ModelRcycler("9-mavzu: O’zbekistonning eng qadimgi davlatlari. Qadimgi  fors  bitiklari  va  ilk  yunon  manbalarida  tarixiy  – madaniy  viloyatlar  va  qadimgi  davlatlar.","https://github.com/asadbekakmedov2001/UzbekistanDavlatchilikTarixi/raw/main/app/src/main/assets/slayd9.pptx"));
                modelRcyclers.add(new ModelRcycler("10-mavzu: O‘rta Osiyo Ahamoniylar davlati tarkibida (mil.avv. VI-IV asrlar)","https://github.com/asadbekakmedov2001/UzbekistanDavlatchilikTarixi/raw/main/app/src/main/assets/slayd10.pptx"));
                modelRcyclers.add(new ModelRcycler("11-mavzu: MAKIDONIYALIK ALEKSANDRNING  BAQTRIYA VA SUG’DIYONAGA YURISHLARI  ","https://github.com/asadbekakmedov2001/UzbekistanDavlatchilikTarixi/raw/main/app/src/main/assets/slayd11.pptx"));
                modelRcyclers.add(new ModelRcycler("12-mavzu: O‘zbekistonning antik davr davlatchiligi. Salavkiylar, Yunon–Baqtriya va Parfiya davlati","https://github.com/asadbekakmedov2001/UzbekistanDavlatchilikTarixi/raw/main/app/src/main/assets/slayd12.pptx"));
                modelRcyclers.add(new ModelRcycler("13-mavzu: Qadimgi Xorazm, Qang‘ va Davan davlati","https://github.com/asadbekakmedov2001/UzbekistanDavlatchilikTarixi/raw/main/app/src/main/assets/slayd13.pptx"));
                modelRcyclers.add(new ModelRcycler("14-mavzu: Yuechji–Kushon va Kushon davlatlari","https://github.com/asadbekakmedov2001/UzbekistanDavlatchilikTarixi/raw/main/app/src/main/assets/slayd14.pptx"));
                modelRcyclers.add(new ModelRcycler("15-mavzu: Buyuk ipak yo’li - muloqot va hamkorlik yo’li.","https://github.com/asadbekakmedov2001/UzbekistanDavlatchilikTarixi/raw/main/app/src/main/assets/slayd15.pptx"));
                modelRcyclers.add(new ModelRcycler("16-mavzu: O’rta Osiyoda yerga egalik qilish munosabatlarining shakllanishi va rivojlanishi . Kidariylar, Xioniylar  va Eftaliylar davlati","https://github.com/asadbekakmedov2001/UzbekistanDavlatchilikTarixi/raw/main/app/src/main/assets/slayd16.pptx"));
                modelRcyclers.add(new ModelRcycler("17-mavzu: Turk xoqonligi davrida O’rta Osiyo.","https://github.com/asadbekakmedov2001/UzbekistanDavlatchilikTarixi/raw/main/app/src/main/assets/slayd17.pptx"));
                modelRcyclers.add(new ModelRcycler("18-mavzu: Arab xalifaligi davrida Movaraunnaxr va Xuroson. ","https://github.com/asadbekakmedov2001/UzbekistanDavlatchilikTarixi/raw/main/app/src/main/assets/slayd18.pptx"));
                modelRcyclers.add(new ModelRcycler("19-mavzu: Movarounnaxr va Xurosonda arablar bosqiniga qarshi xalq ozodlik harakatlari","https://github.com/asadbekakmedov2001/UzbekistanDavlatchilikTarixi/raw/main/app/src/main/assets/slayd19.pptx"));
                modelRcyclers.add(new ModelRcycler("20-mavzu: Movaraunnaxr va Xurosonda mustaqil davlatlarning tashkil topishi. Qorluqlar, O’g’uzlar, Toxiriylar davlati  va Safforiylar davlati.","https://github.com/asadbekakmedov2001/UzbekistanDavlatchilikTarixi/raw/main/app/src/main/assets/slayd20.pptx"));
                modelRcyclers.add(new ModelRcycler("21-mavzu: SOMONIYLAR DAVLATI.","https://github.com/asadbekakmedov2001/UzbekistanDavlatchilikTarixi/raw/main/app/src/main/assets/slayd21.pptx"));
                modelRcyclers.add(new ModelRcycler("22-mavzu: QORAXONIYLAR DAVLATI","https://github.com/asadbekakmedov2001/UzbekistanDavlatchilikTarixi/raw/main/app/src/main/assets/slayd22.pptx"));
                modelRcyclers.add(new ModelRcycler("23-mavzu: G’aznaviylar va Saljuqiylar davlati.","https://github.com/asadbekakmedov2001/UzbekistanDavlatchilikTarixi/raw/main/app/src/main/assets/slayd23.pptx"));
                modelRcyclers.add(new ModelRcycler("24-mavzu: Xorazmshoh – Anushtegeniylar davlati","https://github.com/asadbekakmedov2001/UzbekistanDavlatchilikTarixi/raw/main/app/src/main/assets/slayd24.pptx"));
                modelRcyclers.add(new ModelRcycler("25-mavzu: O’rta Osiyo xalqlari tarixida IX-XII asrlarda yuz bergan Uygonish davri.  Aniq va tabiiy fanlarning yuksalishi","https://github.com/asadbekakmedov2001/UzbekistanDavlatchilikTarixi/raw/main/app/src/main/assets/slayd25.pptx"));
                modelRcyclers.add(new ModelRcycler("26-mavzu: IX-XII asrlarda tarix, adabiyot va diniy bilimlarning yuksalishi","https://github.com/asadbekakmedov2001/UzbekistanDavlatchilikTarixi/raw/main/app/src/main/assets/slayd26.pptx"));
                modelRcyclers.add(new ModelRcycler("27-mavzu: Etnogenez va etnik tarix masalalari.","https://github.com/asadbekakmedov2001/UzbekistanDavlatchilikTarixi/raw/main/app/src/main/assets/slayd27.pptx"));
                modelRcyclers.add(new ModelRcycler("28-mavzu: Movarounnaxr va Xurosonning mug’ullar tomonidan bosib olinishi.","https://github.com/asadbekakmedov2001/UzbekistanDavlatchilikTarixi/raw/main/app/src/main/assets/slayd28.pptx"));
                modelRcyclers.add(new ModelRcycler("29-mavzu: Jaloliddin Manguberdi jasoratlari.","https://github.com/asadbekakmedov2001/UzbekistanDavlatchilikTarixi/raw/main/app/src/main/assets/slayd29.pptx"));
                modelRcyclers.add(new ModelRcycler("30-mavzu: Movarounnahr Chig’atoy ulusi tarkibida.","https://github.com/asadbekakmedov2001/UzbekistanDavlatchilikTarixi/raw/main/app/src/main/assets/slayd30.pptx"));

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