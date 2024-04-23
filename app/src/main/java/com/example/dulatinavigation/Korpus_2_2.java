package com.example.dulatinavigation;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class Korpus_2_2 extends AppCompatActivity {
    private Button button1,button2,button3,button4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.korpus_2_2);

        // По умолчанию загружаем первый фрагмент
        loadFragment(new FirstFloor_2_2());
        // Настройка обработчиков для кнопок
         button1 = findViewById(R.id.button1);
        button2 =  findViewById(R.id.button2);
         button3 = findViewById(R.id.button3);
         button4 =  findViewById(R.id.button4);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(new FirstFloor_2_2());
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(new SecondFloor_2_2());

            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(new ThirdFloor_2_2());
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(new FourthFloor_2_2());
            }
        });

    }

    private void loadFragment(Fragment fragment) {
        // Загрузка фрагмента в контейнер
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragment_container, fragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }public void myFancyMethod(View v) {

        Intent intent=new Intent(Korpus_2_2.this, TechnologyKorpus.class);
        startActivity(intent);    }
}


