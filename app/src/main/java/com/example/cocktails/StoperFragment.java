package com.example.cocktails;

import java.util.Timer;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link StoperFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class StoperFragment extends Fragment implements View.OnClickListener  {

    private int seconds = 60;
    private int currentSeconds = 60;
    private boolean running;
    private boolean wasRunning;
    public StoperFragment() {
        // Required empty public constructor
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
        this.currentSeconds = seconds;
    }
    //
//    public static StoperFragment newInstance(String param1, String param2) {
//        StoperFragment fragment = new StoperFragment();
//        Bundle args = new Bundle();
//        args.putString(ARG_PARAM1, param1);
//        args.putString(ARG_PARAM2, param2);
//        fragment.setArguments(args);
//        return fragment;
//    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState != null) {
            seconds = savedInstanceState.getInt("seconds");
            running = savedInstanceState.getBoolean("running");
            wasRunning = savedInstanceState.getBoolean("wasRunning");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle SavedInstanceState) {
        View layout = inflater.inflate(R.layout.fragment_stoper, container, false);
        runStoper(layout);
        Button startButton = (Button)layout.findViewById(R.id.start_button);
        startButton.setOnClickListener(this);
        Button stopButton = (Button)layout.findViewById(R.id.stop_button);
        stopButton.setOnClickListener(this);
        Button resetButton = (Button)layout.findViewById(R.id.reset_button);
        resetButton.setOnClickListener(this);
        return layout;
    }

    @Override
    public void onPause() {
        super.onPause();
        wasRunning = running;
        running = false;
    }
    @Override
    public void onResume() {
        super.onResume();
        if (wasRunning) {
            running = true;
        }
    }
    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        savedInstanceState.putInt("seconds", seconds);
        savedInstanceState.putBoolean("running", running);
        savedInstanceState.putBoolean("wasRunning", wasRunning);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.start_button:
                onClickStart();
                break;
            case R.id.stop_button:
                onClickStop();
                break;
            case R.id.reset_button:
                onClickReset();
                break;
        }
    }

    void onClickStart() { running = true; }
    void onClickStop() {
        running = false;
    }
    void onClickReset() {
        running = false;
        currentSeconds = seconds;
    }

    private void runStoper(View view) {
        final TextView timeView = (TextView) view.findViewById(R.id.time_view);
        final Handler handler = new Handler();
        handler.post(new Runnable() {
            @Override
            public void run() {
                int hours = currentSeconds / 3600;
                int minutes = (currentSeconds % 3600) / 60;
                int secs = currentSeconds % 60;
                String time = String.format("%d:%02d:%02d", hours, minutes, secs);
                timeView.setText(time);
                if (running) {
                    currentSeconds--;
                }
                handler.postDelayed(this, 1000);
            }
        });
    }
}