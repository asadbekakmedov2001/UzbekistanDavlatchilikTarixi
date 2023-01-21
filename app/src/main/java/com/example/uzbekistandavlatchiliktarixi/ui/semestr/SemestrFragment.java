package com.example.uzbekistandavlatchiliktarixi.ui.semestr;

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

import com.example.uzbekistandavlatchiliktarixi.MainActivity5;
import com.example.uzbekistandavlatchiliktarixi.R;
import com.example.uzbekistandavlatchiliktarixi.databinding.FragmentGalleryBinding;

import java.util.ArrayList;
import java.util.List;

public class SemestrFragment extends Fragment implements UserAdapter.SelectedUser{

    private FragmentGalleryBinding binding;
    RecyclerView recyclerView2;
    List<ModelRcycler> modelRcyclers = new ArrayList<>();
    UserAdapter userAdapter;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentGalleryBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        recyclerView2 = root.findViewById(R.id.recyclerView2);
        recyclerView2.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView2.addItemDecoration(new DividerItemDecoration(requireContext(),0));

        initial();

        userAdapter  = new UserAdapter(modelRcyclers, this);
        recyclerView2.setAdapter(userAdapter);



        return root;
    }
    private void initial() {

        modelRcyclers.add(new ModelRcycler(R.drawable.maruza6,"6-semestr uchun Ma'ruza"," 6-semestr davomida o'tiladigan ma'ruza mashg'ulotlari ",""));
        modelRcyclers.add(new ModelRcycler(R.drawable.seminar6,"6-semestr uchun Seminar"," 6-semestr davomida o'tiladigan seminar mashg'ulotlari ",""));
        modelRcyclers.add(new ModelRcycler(R.drawable.taqdimot6,"6-semestr uchun Taqdimot"," 6-semestr davomida o'tiladigan mavzularning taqdimotlari ",""));

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    @Override
    public void selectedUser(ModelRcycler modelRcycler) {
        startActivity(new Intent(getContext(), MainActivity5.class).putExtra("swimmers",modelRcyclers.indexOf(modelRcycler)));
    }
}