package com.example.cocktails;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.example.cocktails.ui.main.MainFragment;
import android.content.Intent;

public class MainActivity extends AppCompatActivity implements CocktailListFragment.Listener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void itemClicked(long id) {
        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra(DetailActivity.EXTRA_COCKTAIL_ID, (int) id);
        startActivity(intent);
    }
}