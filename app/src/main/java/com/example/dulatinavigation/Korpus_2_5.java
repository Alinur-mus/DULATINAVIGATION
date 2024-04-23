package com.example.dulatinavigation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class Korpus_2_5 extends AppCompatActivity {
    private Button button2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.korpus_2_5);

        // По умолчанию загружаем первый фрагмент
        loadFragment(new SecondFloor_2_5());
        // Настройка обработчиков для кнопок
        button2 =  findViewById(R.id.krp_2_5_2);




        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(new SecondFloor_2_5());

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

        Intent intent=new Intent(Korpus_2_5.this, TechnologyKorpus.class);
        startActivity(intent);    }
}


