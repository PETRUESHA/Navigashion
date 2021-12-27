package com.example.navigashion;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.navigashion.databinding.Fragment1Binding;
import com.example.navigashion.databinding.Fragment2Binding;

public class Fragment2 extends Fragment {

    private Button btn3, btn4;
    private Fragment2Binding binding;
    NavController navController;

    public Fragment2() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        navController = Navigation.findNavController(getActivity(), R.id.nav_host_fragment);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = Fragment2Binding.inflate(inflater, container, false);
        View view = binding.getRoot();

        btn3 = binding.button3;
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.fragment1);
            }
        });
        btn4 = binding.button4;
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.fragment3);
            }
        });
        return view;
    }
}