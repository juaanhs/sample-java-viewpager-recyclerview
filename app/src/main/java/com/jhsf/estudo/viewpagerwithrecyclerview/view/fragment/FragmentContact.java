package com.jhsf.estudo.viewpagerwithrecyclerview.view.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.jhsf.estudo.viewpagerwithrecyclerview.R;
import com.jhsf.estudo.viewpagerwithrecyclerview.RecyclerView.RecyclerViewAdapter;
import com.jhsf.estudo.viewpagerwithrecyclerview.model.Contact;

import java.util.ArrayList;
import java.util.List;

public class FragmentContact extends Fragment {

    View v;
    private RecyclerView recyclerView;
    private List<Contact> lstContacts;

    public FragmentContact() {}

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.contact_fragment, container,false);
        recyclerView = v.findViewById(R.id.contact_recyclerview);
        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(getActivity(), lstContacts);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(recyclerViewAdapter);

        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        lstContacts = new ArrayList<>();
        for(int i = 0; i < 15; i++) {
            if(i % 2 == 0)
                lstContacts.add(new Contact("Men", "(61) 9999-9999", R.drawable.icon_men));
            else
            lstContacts.add(new Contact("Women", "(61) 8888-8888", R.drawable.icon_women));
        }
    }
}
