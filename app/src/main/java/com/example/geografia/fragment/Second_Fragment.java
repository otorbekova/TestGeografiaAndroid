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

public class Second_Fragment extends Fragment {
    private RecyclerView recyclerView;
    private List<String> text;
    private List<Integer> image;
    private StudyAdapter adapter;
    private ArrayList<String> list = new ArrayList<>();

    public Second_Fragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_second_, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.rec_02);
        text = new ArrayList<>();
        image = new ArrayList<Integer>();
        Add_date();
        adapter = new StudyAdapter(requireContext(), text, image);
        recyclerView.setAdapter(adapter);
    }

    private void Add_date() {
        text.add("\tМировой океан\n" +
                "Океаны планеты: Тихий (самый обширный), Атлантический, Индийский, Северный Ледовитый (самый маленький).\n" +
                "К океанам относятся краевые и внутренние моря. Внутренние моря вдаются глубоко в континенты," +
                " бывают отделены от океана континентальными выступами, между которыми имеются узкие проливы." +
                "Краевые моря отделены от океанов архипелагами островов или не отделены совсем, например, Аравийское море." +
                "Больше всего морей принадлежит бассейну Атлантического океана (31)." +
                "\tТихий океан\n" +
                "Имеет площадь 180 млн км2, среднюю глубину 3,8 км, самое глубокое место находится на глубине более 11 км в Марианском желобе.\n" +
                "Большинство краевых морей расположены вдоль берега Азии, в Малайском архипелаге множество межостровных морей.\n" +
                "Крупные острова: Японские, Сахалин, Новая Зеландия, Малайский архипелаг.\n" +
                "Средняя соленость 34,6%о.\n" +
                "\n" +
                "\tАтлантический океан\n" +
                "Площадь 93 млн км2, средняя глубина 3,7 км, максимальная 8,7 км, соленость 35%о.\n" +
                "\n" +
                "Самое известное Средиземное море разделяет Евразию и Африку.\n" +
                "\n" +
                "Крупные острова: Исландия, Ньюфаундленд, Британские.");
        ////
        image.add(R.drawable.oke_two);

        text.add("\tИндийский океан\n" +
                "Его площадь 76,2 км2, средняя глубина 3,7 км, максимальная 7,7 км, соленость 31-33%о.\n" +
                "\n" +
                "Океану принадлежит всего 6 морей, самое теплое и соленое Красное море (40%о при температуре 25-27°С).Крупные острова: Мадагаскар, Шри-Ланка." +
                "\tСеверный Ледовитый океан\n" +
                "Площадь 14,1 млн км, средняя глубина 1,2 км, в Гренландском море находится самое глубокое место (5,5 км).\n" +
                "К океану относится 13 морей, из них 7 принадлежат России. Самое теплое Норвежское море, куда проникает теплое течение.\n" +
                "По количеству островов океан занимает 2-е место, самый крупный – Гренландия. Большая часть Гренландии покрыта ледником, поселки и небольшие города расположены на юго-западных берегах. От ледника постоянно откалываются айсберги, что затрудняет морское судоходство.\n" +
                "\n" +
                "Это самый холодный океан, средняя температура воды -1°С. Океан никогда не бывает полностью свободен от ледяного покрова. Летом только в прибрежных акваториях появляется чистая вода, но дрейфующие льды подходят близко к береговой линии, поэтому в морских портах работают буксиры и другие суда обслуживания ледового класса.");
        image.add(R.drawable.ai);

    }
}