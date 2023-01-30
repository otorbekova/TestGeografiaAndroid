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
import com.example.geografia.Study;
import com.example.geografia.adapter.StudyAdapter;

import java.util.ArrayList;
import java.util.List;

public class First_Fragment extends Fragment {
    private RecyclerView recyclerView;
    private List<String> text;
    private List<Integer> image;
    private StudyAdapter adapter;
    private ArrayList<String> list = new ArrayList<>();

    public First_Fragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_first_, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.recyclerview_stady);
        text = new ArrayList<>();
        image = new ArrayList<Integer>();
        Add_date();
        adapter = new StudyAdapter(requireContext(), text, image);
        recyclerView.setAdapter(adapter);
    }

    private void Add_date() {
        text.add("Земля — уникальная планета\n");
        // text.add("Планета Земля");
        image.add(R.drawable.sist);
        text.add(".");
        image.add(R.drawable.one_f);
        text.add("Земля имеет шарообразную форму, слегка приплюснутую у полюсов. Учёные назвали форму Земли — геоидом\n");
        image.add(R.drawable.two_f);
        text.add("Шарообразная форма Земли определяет разное количество солнечного света и тепла, поступающего на её поверхность в разных географических широтах." +
                "\nБольшая часть поверхности Земли покрыта водой. Мировой океан, окружающий сушу, делится на 4 океана" +
                "\n1.Тихий\n2.Атлантический" +
                "\n3.Индийский\n4.Северный Ледовитый\n" +
                "Воды Мирового океана распределены неравномерно. Неравномерно распределена и суша. Поэтому на Земле выделяют два полушария — материковое (Северное)" +
                "и океаническое (Южное)");
        image.add(R.drawable.three);
        text.add(".\n");
        image.add(R.drawable.fout_f);
        text.add("Земля — единственная планета Солнечной системы, на которой существует жизнь. Земля обладает необходимыми условиями для комфортной деятельности живых организмов:\n" +
                "необходимое количество тепла и солнечного света;\n" +
                "озоновый слой защищает от ультрафиолетового излучения;\n" +
                "магнитное поле Земли защищает от космических лучей;\n" +
                "достаточное количество воды и влаги на Земле, содержание воды в 3-х  состояниях.");
        image.add(R.drawable.info);
    }
}