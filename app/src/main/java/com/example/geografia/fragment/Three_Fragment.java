package com.example.geografia.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.geografia.R;
import com.example.geografia.adapter.StudyAdapter;

import java.util.ArrayList;
import java.util.List;


public class Three_Fragment extends Fragment {
    private RecyclerView recyclerView;
    private List<String> text;
    private List<Integer> image;
    private StudyAdapter adapter;
    private ArrayList<String> list = new ArrayList<>();


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_three_, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.rec_03);
        text = new ArrayList<>();
        image = new ArrayList<Integer>();
        Add_date();
        adapter = new StudyAdapter(requireContext(), text, image);
        recyclerView.setAdapter(adapter);
    }

    private void Add_date() {
        text.add("  Материки");
        ////
        image.add(R.drawable.cp);

        text.add(" Материков шесть:1.Евразия\n 2.Африка\n 3.Северная Америка\n  4.Южная Америка\n 5.Антарктида\n 6.Австралия ");
        image.add(R.drawable.mat_1);
        text.add("  По положению относительно экватора и истории образования материки делят на северные" +
                "южные. К северным относятся Евразия и Северная Америка (бывшие в далёком прошлом единой Лавразией), к южным — Южная Америка, Африка, Австралия и Антарктида (бывшие единой" +
                "Гондваной). В Северном полушарии континенты занимают  % поверхности, а в Южном —  %, поэтому Северное полушарие Земли можно назвать материковым, а Южное — океаническим."
        );
        image.add(R.drawable.mat_02);
        text.add("Так как континенты расположены в разных широтах, они получают неодинаковое количество света и тепла, поступающего от Солнца. На формирование природы огромное влияние оказывает площадь материков и их взаимное расположение. Все материки почти полностью отделены друг от друга обширными водными пространствами. Только узкие полосы суши соединяют Африку с Евразией (Суэцкий перешеек), Северную Америку с Южной Америкой (Панамский перешеек). Евразия и Северная Америка отделены друг от друга узким Беринговым проливом." +
                "Все материки, кроме Антарктиды и Австралии, имеют форму, сужающуюся к югу. Это оказывает влияние на климатические особенности в разных частях материка. Южная Америка, Африка и Австралия лежат в основном в жарком тепловом поясе, в умеренном поясе находятся лишь их небольшие южные узкие части. Северная Америка и Евразия широкими северными частями расположены в умеренном и холодном тепловых поясах, а узкими — в жарком.");
        image.add(R.drawable.mat_03);
    }
}