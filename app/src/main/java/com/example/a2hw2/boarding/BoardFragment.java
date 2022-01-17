package com.example.a2hw2.boarding;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.a2hw2.R;
import com.example.a2hw2.databinding.FragmentBoardBinding;


public class BoardFragment extends Fragment {
    private FragmentBoardBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentBoardBinding.inflate(getLayoutInflater(),container,false);
        return binding.getRoot();
    }
}