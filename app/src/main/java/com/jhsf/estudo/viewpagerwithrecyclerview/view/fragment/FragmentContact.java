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
            lstContacts.add(new Contact("Seu Jorge", "(61) 9999-9999", R.drawable.man));
            lstContacts.add(new Contact("Amanda", "(55) 8888-8888", R.drawable.girl));
            lstContacts.add(new Contact("Roberto", "(11) 7777-7777", R.drawable.man1));
            lstContacts.add(new Contact("Aniely", "(61) 6666-6666", R.drawable.girl1));
            lstContacts.add(new Contact("Diego", "(41) 5555-5555", R.drawable.boy));
            lstContacts.add(new Contact("Marcos", "(62) 4444-4444", R.drawable.man2));
            lstContacts.add(new Contact("Tiago", "(20) 3333-3333", R.drawable.boy1));
            lstContacts.add(new Contact("Fabio", "(14) 2222-2222", R.drawable.man3));
            lstContacts.add(new Contact("Augusto", "(81) 1111-1111", R.drawable.man4));
        }
    }
