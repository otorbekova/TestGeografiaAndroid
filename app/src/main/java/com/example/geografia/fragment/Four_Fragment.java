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


public class Four_Fragment extends Fragment {
    private RecyclerView recyclerView;
    private List<String> text;
    private List<Integer> image;
    private StudyAdapter adapter;
    private ArrayList<String> list = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_four_, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.rec_04);
        text = new ArrayList<>();
        image = new ArrayList<Integer>();
        Add_date();
        adapter = new StudyAdapter(requireContext(), text, image);
        recyclerView.setAdapter(adapter);
    }

    private void Add_date() {
        text.add("   География Кыргызстана.");
        ////
        image.add(R.drawable.one_kf_foto);
        text.add("Кыргызская Республика расположена на северо-востоке Центральной Азии, занимая часть Тянь-Шаня и северные цепи Памиро-Алая. Границы проходят в основном по естественным рубежам — гребням высоких горных хребтов и рекам, лишь местами они опускаются на равнины Чуйской, Таласской и Ферганской долины. Граничит на севере с Республикой Казахстан, на западе — с Республикой Узбекистан, на юго-западе — с Республикой Таджикистан, на юго-востоке — с Китайской Народной Республикой. Общая длина границ Кыргызстана — 4503 км. Территория КР простирается с запада на восток на 900 км, с севера на юг — на 410 км и находится примерно между 39° и 43° северной широты.");
        image.add(R.drawable.kgkg);
        text.add(" Площадь Кыргызстана 199,9 тыс. кв. км (85 место в мире). Средняя высота над уровнем моря 2750 м, наибольшая высота — 7439 м (Пик Победы), наименьшая — 394 м (на юго-западе республики). Наиболее высоко поднятая часть территории республики находится на ее восточной окраине. Здесь, в горном узле, пограничном с Китаем, возвышаются высочайшие точки всей Тянь-Шанской горной системы — пик Победы (7439 м) и Хан-Тенгри (6995 м). Отсюда хребты веерообразно расходятся на запад и юго-запад, создавая обособленные параллельные цепи, простирающиеся, в основном, в широтном направлении до 300 — 400 км.");
        image.add(R.drawable.karta);
        text.add("На крайней южной границе республики с Таджикистаном выделяется высочайший Чон-Алайский (Заалайский) хребет, где находится вторая по высоте вершина Кыргызстана — пик Ленина (7134 м). Рельеф Кыргызстана преимущественно горный. Сложное строение горного рельефа и пестрота экологических условий обусловили большое разнообразие почвенно-растительного покрова и животного мира Кыргызстана. На его территории встречаются пустыни, степи, луга, леса, заросли кустарников, болота, горные тундры и другие типы растительности.\n" +
                "\n" +
                "Республика богата рудами цветных и редких металлов, каменным углем и другими ископаемыми. Кыргызская Республика имеет огромный запас водных ресурсов. В 7 самых больших речных бассейнах располагается более 28000 рек и истоков, 90% которых имеют длину 10 км. Среди них есть реки с высоким уровнем воды. Например, река Нарын протяженностью более 500 километров. Находится Республика в центре Евразийского континента, на пересечении воздушных сообщений между Востоком и Западом, Севером и Югом. В зоне 4-часового перелета из аэропорта «Манас» расположены города: Москва (Россия), Пекин (Китай), Стамбул (Турция), Дели (Индия). До 1991 г. Кыргызстан входил в состав Советского Союза, в 1991 г. обрел независимость");
        image.add(R.drawable.reka_naryn);
    }
}