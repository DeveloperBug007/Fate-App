package hr.zovko.ivan.fateapp.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

import hr.zovko.ivan.fateapp.BuildConfig;
import hr.zovko.ivan.fateapp.FragmentsActivity;
import hr.zovko.ivan.fateapp.MainActivity;
import hr.zovko.ivan.fateapp.R;

public class FAEFragment extends Fragment {

    private TextView tvCarefulResult, tvCleverResult, tvFlashyResult, tvForcefulResult, tvQuickResult, tvSneakyResult;
    private Spinner spCareful, spClever, spFlashy, spForceful, spQuick, spSneaky;
    private Button btnCareful, btnClever, btnFlashy, btnForceful, btnQuick, btnSneaky;
    Random random;
    public int diceSum;

    public FAEFragment() {
    }


    public static FAEFragment newInstance() {
        FAEFragment fragment = new FAEFragment();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_fateaccelerated, container, false);

        random = new Random();

        spCareful = rootView.findViewById(R.id.spCareful);
        spClever = rootView.findViewById(R.id.spClever);
        spFlashy = rootView.findViewById(R.id.spFlashy);
        spForceful = rootView.findViewById(R.id.spForceful);
        spQuick = rootView.findViewById(R.id.spQuick);
        spSneaky = rootView.findViewById(R.id.spSneaky);

        tvCarefulResult = rootView.findViewById(R.id.tvCarefulResult);
        tvCleverResult = rootView.findViewById(R.id.tvCleverResult);
        tvFlashyResult = rootView.findViewById(R.id.tvFlashyResult);
        tvForcefulResult = rootView.findViewById(R.id.tvForcefulResult);
        tvQuickResult = rootView.findViewById(R.id.tvQuickResult);
        tvSneakyResult = rootView.findViewById(R.id.tvSneakyResult);

        btnCareful = rootView.findViewById(R.id.btnCareful);
        btnClever = rootView.findViewById(R.id.btnClever);
        btnFlashy = rootView.findViewById(R.id.btnFlashy);
        btnForceful = rootView.findViewById(R.id.btnForceful);
        btnQuick = rootView.findViewById(R.id.btnQuick);
        btnSneaky = rootView.findViewById(R.id.btnSneaky);

        btnCareful.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FAEFragment.this.faeRoll();
                String carefulSpinner = spCareful.getSelectedItem().toString();
                int carefulCalc = Integer.parseInt(carefulSpinner) + diceSum;
                String carefulTotal = String.valueOf(carefulCalc);
                tvCarefulResult.setText(carefulTotal);
            }
        });

        btnClever.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FAEFragment.this.faeRoll();
                String cleverSpinner = spClever.getSelectedItem().toString();
                int cleverCalc = Integer.parseInt(cleverSpinner) + diceSum;
                String cleverTotal = String.valueOf(cleverCalc);
                tvCleverResult.setText(cleverTotal);
            }
        });

        btnFlashy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FAEFragment.this.faeRoll();
                String flashySpinner = spFlashy.getSelectedItem().toString();
                int flashyCalc = Integer.parseInt(flashySpinner) + diceSum;
                String flashyTotal = String.valueOf(flashyCalc);
                tvFlashyResult.setText(flashyTotal);
            }
        });

        btnForceful.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FAEFragment.this.faeRoll();
                String forcefulSpinner = spForceful.getSelectedItem().toString();
                int forcefulCalc = Integer.parseInt(forcefulSpinner) + diceSum;
                String forcefulTotal = String.valueOf(forcefulCalc);
                tvForcefulResult.setText(forcefulTotal);
            }
        });

        btnQuick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FAEFragment.this.faeRoll();
                String quickSpinner = spQuick.getSelectedItem().toString();
                int quickCalc = Integer.parseInt(quickSpinner) + diceSum;
                String quickTotal = String.valueOf(quickCalc);
                tvQuickResult.setText(quickTotal);
            }
        });

        btnSneaky.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FAEFragment.this.faeRoll();
                String sneakySpinner = spSneaky.getSelectedItem().toString();
                int sneakyCalc = Integer.parseInt(sneakySpinner) + diceSum;
                String sneakyTotal = String.valueOf(sneakyCalc);
                tvSneakyResult.setText(sneakyTotal);
            }
        });

        return rootView;
    }

    private void faeRoll(){
        int d1 = this.random.nextInt(3) -1;
        int d2 = this.random.nextInt(3) -1;
        int d3 = this.random.nextInt(3) -1;
        int d4 = this.random.nextInt(3) -1;

        diceSum = ((d1 + d2) + d3) + d4;
        if (diceSum >= 0){
            Toast.makeText(getActivity(), "You rolled: " + "+" + diceSum, Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(getActivity(), "You rolled: " + "-" + diceSum, Toast.LENGTH_SHORT).show();
        }

    }

}
