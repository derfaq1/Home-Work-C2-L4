package com.example.homeworkc2l4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> mNameFood = new ArrayList<>();
    private ArrayList<String> mDescriptionFood = new ArrayList<>();
    private ArrayList<String> mImageUrl = new ArrayList<>();
    private ArrayList<String> mPrice = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupList();
    }

    private void setupList(){
        mNameFood.add("Пицца");
        mDescriptionFood.add("Сыр зеленый, сыр красный, куча колбасы и тд");
        mPrice.add("370 грн");
        mImageUrl.add("https://images.pizza33.ua/products/product/yQfkJqZweoLn9omo68oz5BnaGzaIE0UJ.jpg");

        mNameFood.add("Салат цезарь");
        mDescriptionFood.add("Зелень, зелень, зелень, зелень.. мяса нет(((");
        mPrice.add("45 грн");
        mImageUrl.add("https://www.kulina.ru/images/docs/Image/zes(6).jpg");

        mNameFood.add("Салат арбуз");
        mDescriptionFood.add("Огурец, сыр, помиборы, маслины");
        mPrice.add("75 грн");
        mImageUrl.add("https://alimero.ru/uploads/images/00/30/53/2012/12/31/41801a_wmark.jpg");

        mNameFood.add("Мясной салат");
        mDescriptionFood.add("Другое дело. Это уже есть можно");
        mPrice.add("450 грн");
        mImageUrl.add("https://foresthall.kiev.ua/wp-content/uploads/2018/12/IMG__5943.jpg");

        mNameFood.add("Суп с курицей");
        mDescriptionFood.add("Вода, курица, морковь и снова вода");
        mPrice.add("999 грн");
        mImageUrl.add("https://images.aif.ru/013/788/4fc475dcc8aada55269d2a7bd92401fb.jpg");

        mNameFood.add("Пельмени");
        mDescriptionFood.add("Тесто, соевое мясо");
        mPrice.add("300 грн");
        mImageUrl.add("https://www.gastronom.ru/binfiles/images/20160630/b2db955c.jpg");

        mNameFood.add("Дошик");
        mDescriptionFood.add("Блюдо дня. Доширак");
        mPrice.add("99999 грн");
        mImageUrl.add("https://primpress.ru/img/cards/2018_01/9Sqnu0CKL6j82JGR_lg.jpg");

        startListView();
    }
    private void startListView(){
        RecyclerView recyclerView = findViewById(R.id.recycle_view);
        RecycleViewAdapter adapter = new RecycleViewAdapter(mNameFood, mImageUrl, mDescriptionFood,mPrice, this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
