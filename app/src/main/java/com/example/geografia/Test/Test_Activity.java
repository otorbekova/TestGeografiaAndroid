package com.example.geografia.Test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.geografia.R;

import java.util.ArrayList;
import java.util.Random;

public class Test_Activity extends AppCompatActivity {
    public static final String Key = "key";
    private TextView tvQueConter, ball, tvQue;
    private int sum = 0, caunt;
    private String kod;
    private Button btOpt1, btOpt2, btOpt3, btOpt4, half, friend;
    private Random random = new Random();
    //list for que
    ArrayList<Value> queList = new ArrayList<>();

    int conter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_);
        init();

        if (getIntent() != null) {
            Intent intent = getIntent();
            kod = intent.getStringExtra(Key);
        }
        if (kod.equals("rirst")) {
            One_Planeta();
        } else if (kod.equals("second")) {
            Okean();
        } else if (kod.equals("three_materick")) {
            Materiki();
        } else if (kod.equals("four")) {
            Kg_F();
        }
        conter = 0;
        loadQuetions(conter);

    }

    private void init() {
        tvQue = findViewById(R.id.tvQue);
        tvQueConter = findViewById(R.id.tvQueConter);
        btOpt1 = findViewById(R.id.btOpt1);
        btOpt2 = findViewById(R.id.btOpt2);
        btOpt3 = findViewById(R.id.btOpt3);
        btOpt4 = findViewById(R.id.btOpt4);
    }

    private void Kg_F() {
        queList.add(new Value("Как по-научному называется цветок Айгуль — эндемичный вид флоры Кыргызстана? ",
                "A. Мельница Василия", "B. Рябчик Эдуарда",
                "C. Кардинал Ришелье", "D. Красный цветок", "B. Рябчик Эдуарда"));
        queList.add(new Value("Какова высота самой высокой вершины в Кыргызстане пика Победы? ",
                "A. 7349 метров", "B. 7439 метров",
                "C. 7447 метров", "D. 7430 метров", "B. 7439 метров"));
        queList.add(new Value("В каком месте расположено сурьмяное месторождение?",
                "A. Хайдаркан", "B. Талас",
                "C. Сурьматоо", "D. Кадамжай", "D. Кадамжай"));
        queList.add(new Value("Общая длина реки — 1030 км, из них лишь 260 км пролегает в пределах Кыргызстана. Как называется река? ",
                "A. Нарын", "B. Куркуроо",
                "C. Чу", "D. нет такой реки", "C. Чу"));
        queList.add(new Value("Через какой перевал можно попасть из Таласской долины в Суусамырскую?",
                "A. Отмок", "B. Тоо Ашуу",
                "C. Долон", "D. Нет дороги", "A. Отмок"));
        queList.add(new Value("Сколько рек и речушек впадают в озеро Иссык-Куль? ",
                "A. 120", "B. 50",
                "C. 40", "D. 80", "D. 80"));
        queList.add(new Value("Какой ледник самый крупный в Кыргызстане?",
                "A. Северный Энильчек", "B. Южный Энильчек",
                "C. Мушкетова", "D. Кайингды", "B. Южный Энильчек"));
        queList.add(new Value("Где в Кыргызстане находится «полюс холода»? ",
                "A. в Аксайской долине", "B. в Алайской",
                "C. в Кочкорской", "D. в Нарынской долине", "A. в Аксайской долине"));
        queList.add(new Value("В какой области больше всего городов и поселков городского типа? ",
                "A. В Чуйской области", "B. В Жалал-Абадской области",
                "C. В Нарынской области", "D. Ошской области", "B. В Жалал-Абадской области"));
        queList.add(new Value("сколько областей в кыргызстане? ",
                "A. 7", "B. 5",
                "C. 8", "D. 6", "D. 7"));
    }

    private void Okean() {
        queList.add(new Value("Площадь какого океана составляет 178,6 млн.км2? ",
                "A. Атлантический", "B. Тихий",
                "C. Северный Ледовитый", "D. Индийский", "B. Тихий"));
        queList.add(new Value("Какой океан омывает берега 4 материков? ", "A. Атлантический", "B. Индийский",
                "C. Южный", "D. Тихий", "D. Тихий"));

        queList.add(new Value("В Атлантической океане находится течение:", "A. Куросио", "B. Гольфстрим",
                "C. Индийский", "D. Сомалийское", "B. Гольфстрим"));
        queList.add(new Value("В Тихом океане находится самая глубочайшая впадина на планете (11022м):", "A. Зондский желоб", "B. Гренландское море",
                "C. Марианский желоб", "D. карибское море", "B. Гренландское море"));

        queList.add(new Value("В бассейн какого океана входит самое соленое море мира (Красное море 42‰)? ", "A. Атлантический", "B. Северный Ледовитый",
                "C. Индийский", "D. Тихий", "A. Атлантический"));

        queList.add(new Value("Назовите самый малый по площади океан? ", "A. Атлантический", "B. Северный Ледовитый",
                "C. Индийский", "D. Тихий", "B. Северный Ледовитый"));

        queList.add(new Value(" В каком океане находится остров Мадагаскар? ", "A. Атлантический", "B. Северный Ледовитый",
                "C. Индийский", "D. Тихий", "A. Атлантический"));
        queList.add(new Value("Какого океана первым из европейцев достиг Ф. Магеллан и дал ему название?", "A. Атлантический", "B. Северный Ледовитый",
                "C. Индийский", "D. Тихий", "D. Тихий"));

        queList.add(new Value("По какому океану совершал свое путешествие в Индию, а открыл Новый Свет Х. Колумб? ", "A. Атлантический", "B. Северный Ледовитый",
                "C. Индийский", "D. Тихий", "A. Атлантический"));

        queList.add(new Value("Климат этого океана разнообразен, так как он лежит во всех климатических поясах: ", "A. Атлантический", "B. Северный Ледовитый",
                "C. Индийский", "D. Тихий", "A. Атлантический"));

    }

    private void Materiki() {
        queList.add(new Value("Сколько на Земле материков?", "A. 5", "B. 8",
                "C. 6", "D.4", "C. 6"));
        queList.add(new Value("Какой материк является самым крупным?", "A. Африка", "B. Евразия",
                "C. Антарктида", "D. Северная Америка", "B. Евразия"));
        queList.add(new Value("Какой материк является самым маленьким?", "A. Северная Америка", "B. Южная Америка",
                "C. Австралия ", "D. Антарктида", "C. Австралия "));
        queList.add(new Value(" Какие материки принято относить к южным?", "A. Евразия", "B. Австралия",
                "C. Северная Америка", "D. Южная Америка", "B. Австралия"));

        queList.add(new Value("Какой из материков в прошлом не был Лавразией?", "A. Северная Америка", "B. Австралия",
                "C. Евразия", "D. Африка", "D. Африка"));
        queList.add(new Value("Какой материк в прошлом не составлял Гондвану?", "A. Северная Америка", "B. Африка",
                "C. Южная Америка", "D. Австралия", "A. Северная Америка"));

        queList.add(new Value("Когда закончилось последнее древнее оледенение?", "A. 5 тыс. лет назад", "B. 10 тыс. лет назад\n",
                "C. 10-15 тыс. лет назад", "D. 12 тыс. лет назад", "C. 10-15 тыс. лет назад"));

        queList.add(new Value("Какой южный материк испытал оледенение?", "A. Австралия", "B. Южная Америка",
                "C. Антарктида", "D. Африка", "C. Антарктида"));

        queList.add(new Value("Какое место по площади среди материков занимает Африка?", "A. 4", "B. 5",
                "C. 1", "D. 2", "D. 2"));
        queList.add(new Value("Какой материк является изолированным?", "A. Австралия", "B. Южная Америка",
                "C. Антарктида", "D. Африка", "A. Австралия"));
    }

    private void One_Planeta() {
        queList.add(new Value("\n" +
                "Сколько звезд в нашей Галактике?", "A. более 100 тыс звезд",
                "B. более 105 млн звезд",
                "C. более 100 млдр звезд", "D. более 10 млдр звезд", "C. более 100 млдр звезд"));
        queList.add(new Value("Как называется Галактика, в которой находится Земля?", "A. Млечный путь", "B. Галактика Андромеды",
                "C. Галактика Венеры", "D.Галактика Шпица", "A. Млечный путь"));
        queList.add(new Value("Сколько планет в нашей Солнечной системе?", "A. 8", "B. 10",
                "C. 9", "D. 11", "A. 8"));
        queList.add(new Value("Причина приливов и отливов — это ...", "A. Наклон оси вращения Земли", "B. Все вышеперечисленное",
                "C. Притяжение Луны и Земли", "D. Оборот земли", "D. Притяжение Луны и Земли"));

        queList.add(new Value("Автор гелиоцентрической системы — это ..", "Птолемей", "Коперник",
                "C. Аристотель", "D. Шниский", "Коперник"));
        queList.add(new Value("Система, которая подразумевает, что Солнце вращается вокруг Земли, называется ...",
                "A. Геоид", "B. Гемоцентрической",
                "C. Гелиоцентрической", "D. Геоцентрической", "D. Геоцентрической"));
        queList.add(new Value("Форма нашей Земли — это ...", "A. Шар;", "B. Квадрат",
                "C. Геоид", "D. Овал", "D. Do you have, don't;"));

        queList.add(new Value("Сколько на нашей планете частей света?", "A. 6;", "B. 7",
                "C. 8", "D. 9", "A. 6;"));
        queList.add(new Value("Площадь поверхности Земли составляет ...", "A. 340 млн км²;", "B. 450 млн км²",
                "C. 510 млн км²", "D. 550 млн км²", "C. 510 млн км²"));
        queList.add(new Value("Твердая оболочка Земли это ..", "A. Биосфера;", "B. Литосфера",
                "C. Атмосфера", "D. Гидросфера", "B. Литосфера"));
    }

    public void loadQuetions(int n) {
        final Value q = queList.get(n);
        int v = queList.size();

        tvQueConter.setText((caunt++) + "/" + queList.size());
        tvQue.setText(q.getQue());
        btOpt1.setText("" + q.getOpt1());
        btOpt2.setText("" + q.getOpt2());
        btOpt3.setText("" + q.getOpt3());
        btOpt4.setText("" + q.getOpt4());

        btOpt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (btOpt1.getText().equals(q.getRightOpt())) {
                    if (conter < (queList.size() - 1)) {
                        conter++;
                        sum++;
                        loadQuetions(conter);

                    } else {
                        intent(String.valueOf(sum));
                    }

                } else {
                    if (conter < (queList.size() - 1)) {
                        conter++;
                        loadQuetions(conter);
                    }
                }
            }
        });
        btOpt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (btOpt2.getText().equals(q.getRightOpt())) {
                    if (conter < (queList.size() - 1)) {
                        conter++;
                        sum++;
                        loadQuetions(conter);
                    } else {
                        intent(String.valueOf(sum));
                    }
                } else {
                    if (conter < (queList.size() - 1)) {
                        conter++;
                        loadQuetions(conter);
                    }
                }
            }

        });

        btOpt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (btOpt3.getText().equals(q.getRightOpt())) {
                    if (conter < (queList.size() - 1)) {
                        conter++;
                        sum++;
                        loadQuetions(conter);
                    } else {
                        intent(String.valueOf(sum));
                    }

                } else {
                    if (conter < (queList.size() - 1)) {
                        conter++;
                        loadQuetions(conter);
                    }
                }
            }
        });

        //btn4
        btOpt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (btOpt4.getText().equals(q.getRightOpt())) {
                    if (conter < (queList.size() - 1)) {
                        conter++;
                        loadQuetions(conter);
                    } else {
                        intent(String.valueOf(sum));
                    }

                } else {
                    if (conter < (queList.size() - 1)) {
                        conter++;
                        loadQuetions(conter);

                    }
                }
            }

        });
    }


    private void intent(String j) {
        Intent intent = new Intent(Test_Activity.this, Result_Activity.class);
        intent.putExtra(Result_Activity.Result_Key, j);
        startActivityForResult(intent, 15);
        finish();
    }
}