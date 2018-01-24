package hr.zovko.ivan.fateapp.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

import hr.zovko.ivan.fateapp.BuildConfig;
import hr.zovko.ivan.fateapp.R;

public class RollDiceFragment extends Fragment {

    private Button btnRoll;
    private TextView et_rollDice;
    private ImageView iv_dice1, iv_dice2, iv_dice3, iv_dice4;
    Random random;


    public RollDiceFragment() {
    }


    public static RollDiceFragment newInstance() {
        RollDiceFragment fragment = new RollDiceFragment();
        return fragment;

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_rolldice, container, false);
        random = new Random();
        btnRoll = rootView.findViewById(R.id.btnRoll);
        et_rollDice = rootView.findViewById(R.id.et_rollDice);
        iv_dice1 = rootView.findViewById(R.id.iv_dice1);
        iv_dice2 = rootView.findViewById(R.id.iv_dice2);
        iv_dice3 = rootView.findViewById(R.id.iv_dice3);
        iv_dice4 = rootView.findViewById(R.id.iv_dice4);

        btnRoll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RollDiceFragment.this.rollDice();
            }
        });

        return rootView;




    }

    private void rollDice(){
        int d1 = this.random.nextInt(3) -1;
        int d2 = this.random.nextInt(3) -1;
        int d3 = this.random.nextInt(3) -1;
        int d4 = this.random.nextInt(3) -1;

        switch (d1){
            case -1:
                iv_dice1.setImageResource(R.drawable.diceminus);
                break;
            case 0:
                iv_dice1.setImageResource(R.drawable.dicezero);
                break;
            case +1:
                iv_dice1.setImageResource(R.drawable.diceplus);
                break;
        }
        switch (d2){
            case -1:
                iv_dice2.setImageResource(R.drawable.diceminus);
                break;
            case 0:
                iv_dice2.setImageResource(R.drawable.dicezero);
                break;
            case +1:
                iv_dice2.setImageResource(R.drawable.diceplus);
                break;
        }
        switch (d3){
            case -1:
                iv_dice3.setImageResource(R.drawable.diceminus);
                break;
            case 0:
                iv_dice3.setImageResource(R.drawable.dicezero);
                break;
            case +1:
                iv_dice3.setImageResource(R.drawable.diceplus);
                break;
        }
        switch (d4){
            case -1:
                iv_dice4.setImageResource(R.drawable.diceminus);
                break;
            case 0:
                iv_dice4.setImageResource(R.drawable.dicezero);
                break;
            case +1:
                iv_dice4.setImageResource(R.drawable.diceplus);
                break;
        }


        String print = (((BuildConfig.FLAVOR + addResult(d1)) + addResult(d2)) + addResult(d3)) + addResult(d4);
        int diceSum = ((d1 + d2) + d3) + d4;
        if (diceSum > 0){
            this.et_rollDice.setText("+" + Integer.toString(diceSum));
        }else {
            this.et_rollDice.setText(Integer.toString(diceSum));
        }

    }

    public String addResult(int i){
        if (i == 1){
            return "+";
        }
        if (i == 0){
            return "0";
        }
        return "-";
    }

}
