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
        modelRcyclers.add(new ModelRcycler(R.drawable.fan_das,"Ma'ruzalar","(5120300 - Tarix (mamlakatlar va mintaqalar bo’yicha) yo’nalishi 3-kurs uchun","https://github.com/asadbekakmedov2001/UzbekistanDavlatchilikTarixi/raw/main/app/src/main/assets/umk.doc"));
        modelRcyclers.add(new ModelRcycler(R.drawable.nam_fan,"Taqdimotlar","5120300 - Tarix (mamlakatlar va mintaqalar bo’yicha) yo’nalishi 3-kurs uchun","https://github.com/asadbekakmedov2001/UzbekistanDavlatchilikTarixi/raw/main/app/src/main/assets/nam_dastur.pdf"));
        modelRcyclers.add(new ModelRcycler(R.drawable.mustaqil,"Mustaqi ta'lim","5120300 - Tarix (mamlakatlar va mintaqalar bo’yicha) yo’nalishi 3-kurs uchun","https://github.com/asadbekakmedov2001/UzbekistanDavlatchilikTarixi/raw/main/app/src/main/assets/ish_dastur.pdf"));
        modelRcyclers.add(new ModelRcycler(R.drawable.izohli,"IZOHLI LUG'AT (GLOSARIY)                                         ","","https://github.com/asadbekakmedov2001/UzbekistanDavlatchilikTarixi/raw/main/app/src/main/assets/Glossariy.doc"));
        modelRcyclers.add(new ModelRcycler(R.drawable.test1,"FAN YUZASIDAN TEST SAVOLLARI","","https://github.com/asadbekakmedov2001/UzbekistanDavlatchilikTarixi/raw/main/app/src/main/assets/fan_test.doc"));


    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    @Override
    public void selectedUser(ModelRcycler modelRcycler) {

        if (modelRcycler.getLessonName().toLowerCase().startsWith("mustaqil") ||
                modelRcycler.getLessonName().toLowerCase().startsWith("izohli") ||
                modelRcycler.getLessonName().toLowerCase().startsWith("fan")
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