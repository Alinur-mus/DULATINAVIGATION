package com.example.dulatinavigation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class TechnologyKorpus extends AppCompatActivity {
    private Button button2_1,button2_2,button2_3,button2_5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.teh_korpus);
        button2_1=findViewById(R.id.tk_2_1);
        button2_2=findViewById(R.id.tk_2_2);
        button2_3=findViewById(R.id.tk_2_3);
        button2_5=findViewById(R.id.tk_2_5);

        WebView webView = findViewById(R.id.webview);
        webView.getSettings().setJavaScriptEnabled(true); // Включаем поддержку JavaScript
        webView.setWebViewClient(new WebViewClient()); // Устанавливаем клиент WebView
        webView.loadUrl("file:///android_asset/map.html"); // Загружаем файл HTML из папки assets
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setInitialScale(100);

        button2_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TechnologyKorpus.this, Korpus_2_1.class);
                startActivity(intent);
            }
        });
        button2_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TechnologyKorpus.this, Korpus_2_2.class);
                startActivity(intent);
            }
        });
        button2_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TechnologyKorpus.this, Korpus_2_3.class);
                startActivity(intent);
            }
        });
        button2_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TechnologyKorpus.this, Korpus_2_5.class);
                startActivity(intent);
            }
        });

    }
    public void myFancyMethod(View v) {

        Intent intent=new Intent(TechnologyKorpus.this, MainActivity.class);
        startActivity(intent);    }
}