package com.example.rosdistantstudyapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MyHobbyActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hobby);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int itemId = item.getItemId();
        if (itemId == R.id.about_me) {// Действие для пункта "Обо мне"
            Intent intent = new Intent(this, AboutMeActivity.class);
            startActivity(intent);
            return true;
        } else if (itemId == R.id.my_education) {// Действие для пункта "Моя учеба"
            Intent intent = new Intent(this, MyEducation.class);
            startActivity(intent);
            return true;
        } else if (itemId == R.id.my_work) {// Действие для пункта "Моя работа"
            Intent intent = new Intent(this, MyWorkActivity.class);
            startActivity(intent);
            return true;
        } else if (itemId == R.id.my_hobby) {// Действие для пункта "Мое хобби"
            Intent intent = new Intent(this, MyHobbyActivity.class);
            startActivity(intent);
            return true;
        } else if (itemId == R.id.my_plans) {// Действие для пункта "Мои планы"
            Intent intent = new Intent(this, MyPlansActivity.class);
            startActivity(intent);
            return true;
        } else if (itemId == R.id.contacts) {// Действие для пункта "Контакты"
            Intent intent = new Intent(this, ContactsActivity.class);
            startActivity(intent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
