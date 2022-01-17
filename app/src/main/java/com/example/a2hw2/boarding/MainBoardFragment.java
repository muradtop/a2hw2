package com.example.a2hw2.boarding;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.a2hw2.R;
import com.example.a2hw2.databinding.FragmentMainBoardBinding;
import com.example.a2hw2.model.ViewPagerModel;

import java.util.ArrayList;


public class MainBoardFragment extends Fragment {
    private FragmentMainBoardBinding binding;
    ViewPagerAdapter adapter;
    ArrayList<ViewPagerModel> list = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentMainBoardBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        list.add(new ViewPagerModel("Welcome to productive life!", "Collaboration with students ",R.drawable.toto));
        list.add(new ViewPagerModel("Регистрируйся скорее", "Успевай делать то что раньше не успевал !", R.drawable.doto));
        list.add(new ViewPagerModel("3", "3", R.drawable.doto2));
        adapter = new ViewPagerAdapter(list);
        binding.viewpager.setAdapter(adapter);


    }
}