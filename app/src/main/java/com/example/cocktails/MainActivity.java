package com.example.cocktails;

import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.appcompat.widget.ShareActionProvider;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.MenuItemCompat;
import androidx.fragment.app.FragmentTransaction;
import com.example.cocktails.ui.main.MainFragment;
import android.content.Intent;
import android.view.MenuItem;
import android.view.Menu;
public class MainActivity extends AppCompatActivity implements CocktailListFragment.Listener{
    private ShareActionProvider shareActionProvider;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Przygotowanie menu i dodanie elementów do paska aplikacji
        getMenuInflater().inflate(R.menu.menu_main, menu);

        MenuItem menuItem = menu.findItem(R.id.action_share);
        shareActionProvider = (ShareActionProvider) MenuItemCompat.getActionProvider(menuItem);
        setShareActionIntent("Blablablablablla");
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.toolbar: //IDK if this is correct id but im going to sleep lol
                // Kod wykonywany po kliknięciu elementu Action_Activity
                Intent intent = new Intent(this, ActionActivity.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public void itemClicked(long id) {
        View fragmentContainer = findViewById(R.id.fragment_container);
        if (fragmentContainer != null) {
            CocktailDetailFragment details = new CocktailDetailFragment();
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            details.setCocktail(id);
            ft.replace(R.id.fragment_container, details);
            ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
            ft.addToBackStack(null);
            ft.commit();
        } else {
            Intent intent = new Intent(this, DetailActivity.class);
            intent.putExtra(DetailActivity.EXTRA_COCKTAIL_ID, (int) id);
            startActivity(intent);
        }
    }



    private void setShareActionIntent(String text) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, text);
        shareActionProvider.setShareIntent(intent);
    }
}