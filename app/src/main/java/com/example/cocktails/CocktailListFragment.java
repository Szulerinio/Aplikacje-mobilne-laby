package com.example.cocktails;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ListFragment;
import android.widget.ArrayAdapter;
import android.content.Context;
import android.widget.ListView;
/**
 * A simple {@link Fragment} subclass.
 * Use the {@link CocktailListFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CocktailListFragment extends ListFragment {
    static interface Listener {
        void itemClicked(long id);
    }

    private Listener listener;
    public CocktailListFragment() {
        // Required empty public constructor
    }

    public static CocktailListFragment newInstance(String param1, String param2) {
        CocktailListFragment fragment = new CocktailListFragment();
        Bundle args = new Bundle();
//        args.putString(ARG_PARAM1, param1);
//        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.listener = (Listener)context;
    }
    @Override
    public void onListItemClick(ListView listView, View itemView, int position, long id) {
        if (listener != null) {
            listener.itemClicked(id);
        }
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        String[] names = new String[Cocktail.cocktails.length];
        for (int i = 0; i < names.length; i++) {
            names[i] = Cocktail.cocktails[i].getName();
        }
        ArrayAdapter<String> adapter = new ArrayAdapter <> (
                inflater.getContext(), android.R.layout.simple_list_item_1, names);
        setListAdapter(adapter);

        return super.onCreateView(inflater, container, savedInstanceState);
    }

}