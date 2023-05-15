package com.example.cocktails;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

//import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
/**
 * A simple {@link Fragment} subclass.
 * Use the {@link CocktailDetailFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CocktailDetailFragment extends Fragment {
    private long cocktailId;


    public CocktailDetailFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_cocktail_detail, container, false);
    }


    @Override
    public void onStart() {
        super.onStart();
        View view = getView();
        if (view != null) {
            TextView title = (TextView) view.findViewById(R.id.textTitle);
            Cocktail cocktail = Cocktail.cocktails[(int)cocktailId];
            title.setText(cocktail.getName());
            TextView description = (TextView) view.findViewById(R.id.textDescription);
            description.setText(cocktail.getRecipe());
        }
    }
    public void setCocktail(long id) {
        this.cocktailId = id;
    }
}