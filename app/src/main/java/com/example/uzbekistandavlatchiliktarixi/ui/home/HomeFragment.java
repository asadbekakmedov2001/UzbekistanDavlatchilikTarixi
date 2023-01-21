package com.example.uzbekistandavlatchiliktarixi.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.uzbekistandavlatchiliktarixi.MainActivity2;
import com.example.uzbekistandavlatchiliktarixi.MainActivity3;
import com.example.uzbekistandavlatchiliktarixi.R;
import com.example.uzbekistandavlatchiliktarixi.databinding.FragmentHomeBinding;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment implements UserAdapter.SelectedUser {

    private FragmentHomeBinding binding;

    RecyclerView recyclerView;
    List<ModelRcycler> modelRcyclers = new ArrayList<>();
    UserAdapter userAdapter;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        // ruyhatni eloni va sozlanmasi
        recyclerView = root.findViewById(R.id.recyclerView1);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.addItemDecoration(new DividerItemDecoration(requireContext(),0));

        initial();

        userAdapter  = new UserAdapter(modelRcyclers,  this);
        recyclerView.setAdapter(userAdapter);


        return root;
    }

    private void initial() {
        modelRcyclers.add(new ModelRcycler(R.drawable.kirish,"Kirish","5120300 - Tarix (mamlakatlar va mintaqalar bo’yicha) yo’nalishi 3-kurs uchun...","https://github.com/asadbekakmedov2001/UzbekistanDavlatchilikTarixi/raw/main/app/src/main/assets/kirish.doc"));
        modelRcyclers.add(new ModelRcycler(R.drawable.umk,"O'QUV USLUBIY MAJMUA","(5120300 - Tarix (mamlakatlar va mintaqalar bo’yicha) yo’nalishi 3-kurs uchun","https://github.com/asadbekakmedov2001/UzbekistanDavlatchilikTarixi/raw/main/app/src/main/assets/umk.doc"));
        modelRcyclers.add(new ModelRcycler(R.drawable.nam_fan,"NA'MUNAVIY FAN DASTUR","5120300 - Tarix (mamlakatlar va mintaqalar bo’yicha) yo’nalishi 3-kurs uchun","https://github.com/asadbekakmedov2001/UzbekistanDavlatchilikTarixi/raw/main/app/src/main/assets/nam_dastur.doc"));
        modelRcyclers.add(new ModelRcycler(R.drawable.fan_das,"ISHCHI O'QUV DASTUR","5120300 - Tarix (mamlakatlar va mintaqalar bo’yicha) yo’nalishi 3-kurs uchun","https://github.com/asadbekakmedov2001/UzbekistanDavlatchilikTarixi/raw/main/app/src/main/assets/fan_dastur.doc"));
        modelRcyclers.add(new ModelRcycler(R.drawable.mustaqil,"MUSTAQIL TA'LIM UCHUN USLUBIY KO'RSATMA","5120300 - Tarix (mamlakatlar va mintaqalar bo’yicha) yo’nalishi 3-kurs uchun","https://github.com/asadbekakmedov2001/UzbekistanDavlatchilikTarixi/raw/main/app/src/main/assets/mustaqil_ish.doc"));
        modelRcyclers.add(new ModelRcycler(R.drawable.izohli,"IZOHLI LUG'AT (GLOSARIY)                                         ","","https://github.com/asadbekakmedov2001/UzbekistanDavlatchilikTarixi/raw/main/app/src/main/assets/Glossariy.doc"));
        modelRcyclers.add(new ModelRcycler(R.drawable.test1,"MAVZU YUZASIDAN TEST SAVOLLARI","","https://github.com/asadbekakmedov2001/UzbekistanDavlatchilikTarixi/raw/main/app/src/main/assets/mavzu_test.doc"));
        modelRcyclers.add(new ModelRcycler(R.drawable.test2,"FAN YUZASIDAN TEST SAVOLLARI","","https://github.com/asadbekakmedov2001/UzbekistanDavlatchilikTarixi/raw/main/app/src/main/assets/fan_test.doc"));
        modelRcyclers.add(new ModelRcycler(R.drawable.adabiyot,"ADABIYOTLAR","Azamat Ziyo. O‘zbek davlatchiligi tarixi: (Eng qadimgi davrdan Rossiya bosqiniga qadar). T., Sharq. 2000.\n" +
                " Sagdullaev A.S., Mavlonov O‘. O‘zbekistonda davlat boshqaruvi tarixi. – T.: Akademiya, 2006.\n","https://github.com/asadbekakmedov2001/UzbekistanDavlatchilikTarixi/raw/main/app/src/main/assets/adabiyotlar.doc"));


    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    @Override
    public void selectedUser(ModelRcycler modelRcycler) {

        if (modelRcycler.getLessonName().toLowerCase().startsWith("kirish") ||
                modelRcycler.getLessonName().toLowerCase().startsWith("o'quv") ||
                modelRcycler.getLessonName().toLowerCase().startsWith("na'munaviy") ||
                modelRcycler.getLessonName().toLowerCase().startsWith("mustaqil") ||
                modelRcycler.getLessonName().toLowerCase().startsWith("izohli") ||
                modelRcycler.getLessonName().toLowerCase().startsWith("mavzu") ||
                modelRcycler.getLessonName().toLowerCase().startsWith("fan") ||
                modelRcycler.getLessonName().toLowerCase().startsWith("adab") ||
                modelRcycler.getLessonName().toLowerCase().startsWith("ishchi")
        ){
//
            startActivity(new Intent(getContext(), MainActivity3.class).putExtra("data",modelRcycler.getLoadUrl()));
        }
        else {
            startActivity(new Intent(getContext(), MainActivity2.class).putExtra("swimmers",modelRcyclers.indexOf(modelRcycler)));
        }

    }

//    @Override
//    public void onPause() {
//        super.onPause();
//        modelRcyclers.clear();
//    }

    @Override
    public void onStart() {
        super.onStart();
        modelRcyclers.clear();
        initial();
    }
}