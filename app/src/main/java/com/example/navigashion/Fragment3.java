package com.example.navigashion;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.navigashion.databinding.Fragment2Binding;
import com.example.navigashion.databinding.Fragment3Binding;

public class Fragment3 extends Fragment {

    private Button btn5, btn6;
    private Fragment3Binding binding;
    NavController navController;

    public Fragment3() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = Fragment3Binding.inflate(inflater, container, false);
        View view = binding.getRoot();
        navController = Navigation.findNavController(getActivity(), R.id.nav_host_fragment);

        btn5 = binding.button5;
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.fragment2);
            }
        });
        return view;
    }
}