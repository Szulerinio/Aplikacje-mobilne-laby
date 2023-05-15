package com.example.cocktails;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class DetailActivity extends AppCompatActivity {
    public static final String EXTRA_COCKTAIL_ID = "id";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_detail);
        CocktailDetailFragment frag = (CocktailDetailFragment)
                getSupportFragmentManager().findFragmentById(R.id.detail_frag);
        int cocktailId = (int) getIntent().getExtras().get(EXTRA_COCKTAIL_ID);
        frag.setCocktail(cocktailId);
    }

}