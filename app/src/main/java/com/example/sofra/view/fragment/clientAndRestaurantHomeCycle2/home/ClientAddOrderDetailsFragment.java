package com.example.sofra.view.fragment.clientAndRestaurantHomeCycle2.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;

import com.example.sofra.R;
import com.example.sofra.view.fragment.BaSeFragment;

import butterknife.ButterKnife;

public class ClientAddOrderDetailsFragment extends BaSeFragment {




    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_home__client_add_order_details, container, false);
        ButterKnife.bind(this, root);
//
        return root;
    }



}