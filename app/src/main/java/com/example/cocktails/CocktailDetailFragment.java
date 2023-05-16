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

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState != null) {
            cocktailId = savedInstanceState.getLong("cocktailId");
        }
    }

    public CocktailDetailFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_cocktail_detail, container, false);
        return view;
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

            StoperFragment stoper = ( StoperFragment) getChildFragmentManager().findFragmentById(R.id.stoper_container);
            stoper.setSeconds(cocktail.getDuration());

        }

    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        savedInstanceState.putLong("cocktailId", cocktailId);
    }

    public void setCocktail(long id) {
        this.cocktailId = id;
    }
}