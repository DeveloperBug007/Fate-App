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

import hr.zovko.ivan.fateapp.R;


public class FateCoreFragment extends Fragment {

    private TextView tvAthleticsResult, tvBurglaryResult, tvContactsResult, tvCraftsResult, tvDeceiveResult, tvDriveResult, tvEmpathyResult,
            tvFightResult, tvInvestigateResult, tvLoreResult, tvNoticeResult, tvPhysiqueResult, tvProvokeResult, tvRapportResult,
            tvResourcesResult, tvShootResult, tvStealthResult, tvWillResult;

    private Spinner spAthletics, spBurglary, spContacts, spCrafts, spDeceive, spDrive, spEmpathy, spFight,
    spInvestigate, spLore, spNotice, spPhysique, spProvoke, spRapport, spResources, spShoot, spStealth, spWill;

    private Button btnAthletics, btnBurglary, btnContacts, btnCrafts, btnDeceive, btnDrive, btnEmpathy, btnFight,
    btnInvestigate, btnLore, btnNotice, btnPhysique, btnProvoke, btnRapport, btnResources, btnShoot, btnStealth, btnWill;

    Random random;
    public int diceSum;

    public FateCoreFragment() {
    }


    public static FateCoreFragment newInstance() {
        FateCoreFragment fragment = new FateCoreFragment();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_fatecore, container, false);
        random = new Random();

        tvAthleticsResult = rootView.findViewById(R.id.tvAthleticsResult);
        tvBurglaryResult = rootView.findViewById(R.id.tvBurglaryResult);
        tvContactsResult = rootView.findViewById(R.id.tvContactsResult);
        tvCraftsResult = rootView.findViewById(R.id.tvCraftsResult);
        tvDeceiveResult = rootView.findViewById(R.id.tvDeceiveResult);
        tvDriveResult = rootView.findViewById(R.id.tvDriveResult);
        tvEmpathyResult = rootView.findViewById(R.id.tvEmpathyResult);
        tvFightResult = rootView.findViewById(R.id.tvFightResult);
        tvInvestigateResult = rootView.findViewById(R.id.tvInvestigateResult);
        tvLoreResult = rootView.findViewById(R.id.tvLoreResult);
        tvNoticeResult = rootView.findViewById(R.id.tvNoticeResult);
        tvPhysiqueResult = rootView.findViewById(R.id.tvPhysiqueResult);
        tvProvokeResult = rootView.findViewById(R.id.tvProvokeResult);
        tvRapportResult = rootView.findViewById(R.id.tvRapportResult);
        tvResourcesResult = rootView.findViewById(R.id.tvResourcesResult);
        tvShootResult = rootView.findViewById(R.id.tvShootResult);
        tvStealthResult = rootView.findViewById(R.id.tvStealthResult);
        tvWillResult = rootView.findViewById(R.id.tvWillResult);

        spAthletics = rootView.findViewById(R.id.spAthletics);
        spBurglary = rootView.findViewById(R.id.spBurglary);
        spContacts = rootView.findViewById(R.id.spContacts);
        spCrafts = rootView.findViewById(R.id.spCrafts);
        spDeceive = rootView.findViewById(R.id.spDeceive);
        spDrive = rootView.findViewById(R.id.spDrive);
        spEmpathy = rootView.findViewById(R.id.spEmpathy);
        spFight = rootView.findViewById(R.id.spFight);
        spInvestigate = rootView.findViewById(R.id.spInvestigate);
        spLore = rootView.findViewById(R.id.spLore);
        spNotice = rootView.findViewById(R.id.spNotice);
        spPhysique = rootView.findViewById(R.id.spPhysique);
        spProvoke = rootView.findViewById(R.id.spProvoke);
        spRapport = rootView.findViewById(R.id.spRapport);
        spResources = rootView.findViewById(R.id.spResources);
        spShoot = rootView.findViewById(R.id.spShoot);
        spStealth = rootView.findViewById(R.id.spStealth);
        spWill = rootView.findViewById(R.id.spWill);

        btnAthletics = rootView.findViewById(R.id.btnAthletics);
        btnBurglary = rootView.findViewById(R.id.btnBurglary);
        btnContacts = rootView.findViewById(R.id.btnContacts);
        btnCrafts = rootView.findViewById(R.id.btnCrafts);
        btnDeceive = rootView.findViewById(R.id.btnDeceive);
        btnDrive = rootView.findViewById(R.id.btnDrive);
        btnEmpathy = rootView.findViewById(R.id.btnEmpathy);
        btnFight = rootView.findViewById(R.id.btnFight);
        btnInvestigate = rootView.findViewById(R.id.btnInvestigate);
        btnLore = rootView.findViewById(R.id.btnLore);
        btnNotice = rootView.findViewById(R.id.btnNotice);
        btnPhysique = rootView.findViewById(R.id.btnPhysique);
        btnProvoke = rootView.findViewById(R.id.btnProvoke);
        btnRapport = rootView.findViewById(R.id.btnRapport);
        btnResources = rootView.findViewById(R.id.btnResources);
        btnShoot = rootView.findViewById(R.id.btnShoot);
        btnStealth = rootView.findViewById(R.id.btnStealth);
        btnWill = rootView.findViewById(R.id.btnWill);

        btnAthletics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FateCoreFragment.this.fcRoll();
                String athleticsSpinner = spAthletics.getSelectedItem().toString();
                int athleticsCalc = Integer.parseInt(athleticsSpinner) + diceSum;
                String athleticsTotal = String.valueOf(athleticsCalc);
                tvAthleticsResult.setText(athleticsTotal);
            }
        });

        btnBurglary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FateCoreFragment.this.fcRoll();
                String burglarySpinner = spBurglary.getSelectedItem().toString();
                int burglaryCalc = Integer.parseInt(burglarySpinner) + diceSum;
                String burglaryTotal = String.valueOf(burglaryCalc);
                tvBurglaryResult.setText(burglaryTotal);
            }
        });

        btnContacts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FateCoreFragment.this.fcRoll();
                String contactsSpinner = spContacts.getSelectedItem().toString();
                int contactsCalc = Integer.parseInt(contactsSpinner) + diceSum;
                String contactsTotal = String.valueOf(contactsCalc);
                tvContactsResult.setText(contactsTotal);
            }
        });

        btnCrafts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FateCoreFragment.this.fcRoll();
                String craftsSpinner = spCrafts.getSelectedItem().toString();
                int craftsCalc = Integer.parseInt(craftsSpinner) + diceSum;
                String craftsTotal = String.valueOf(craftsCalc);
                tvCraftsResult.setText(craftsTotal);
            }
        });

        btnDeceive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FateCoreFragment.this.fcRoll();
                String deceiveSpinner = spDeceive.getSelectedItem().toString();
                int deceiveCalc = Integer.parseInt(deceiveSpinner) + diceSum;
                String deceiveTotal = String.valueOf(deceiveCalc);
                tvDeceiveResult.setText(deceiveTotal);
            }
        });

        btnDrive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FateCoreFragment.this.fcRoll();
                String driveSpinner = spDrive.getSelectedItem().toString();
                int driveCalc = Integer.parseInt(driveSpinner) + diceSum;
                String driveTotal = String.valueOf(driveCalc);
                tvDriveResult.setText(driveTotal);
            }
        });

        btnEmpathy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FateCoreFragment.this.fcRoll();
                String empathySpinner = spEmpathy.getSelectedItem().toString();
                int empathyCalc = Integer.parseInt(empathySpinner) + diceSum;
                String empathyTotal = String.valueOf(empathyCalc);
                tvEmpathyResult.setText(empathyTotal);
            }
        });

        btnFight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FateCoreFragment.this.fcRoll();
                String fightSpinner = spFight.getSelectedItem().toString();
                int fightCalc = Integer.parseInt(fightSpinner) + diceSum;
                String fightTotal = String.valueOf(fightCalc);
                tvFightResult.setText(fightTotal);
            }
        });

        btnInvestigate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FateCoreFragment.this.fcRoll();
                String investigateSpinner = spInvestigate.getSelectedItem().toString();
                int investigateCalc = Integer.parseInt(investigateSpinner) + diceSum;
                String investigateTotal = String.valueOf(investigateCalc);
                tvInvestigateResult.setText(investigateTotal);
            }
        });

        btnLore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FateCoreFragment.this.fcRoll();
                String loreSpinner = spLore.getSelectedItem().toString();
                int loreCalc = Integer.parseInt(loreSpinner) + diceSum;
                String loreTotal = String.valueOf(loreCalc);
                tvLoreResult.setText(loreTotal);
            }
        });

        btnNotice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FateCoreFragment.this.fcRoll();
                String noticeSpinner = spNotice.getSelectedItem().toString();
                int noticeCalc = Integer.parseInt(noticeSpinner) + diceSum;
                String noticeTotal = String.valueOf(noticeCalc);
                tvNoticeResult.setText(noticeTotal);
            }
        });

        btnPhysique.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FateCoreFragment.this.fcRoll();
                String physiqueSpinner = spPhysique.getSelectedItem().toString();
                int physiqueCalc = Integer.parseInt(physiqueSpinner) + diceSum;
                String physiqueTotal = String.valueOf(physiqueCalc);
                tvPhysiqueResult.setText(physiqueTotal);
            }
        });

        btnProvoke.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FateCoreFragment.this.fcRoll();
                String provokeSpinner = spProvoke.getSelectedItem().toString();
                int provokeCalc = Integer.parseInt(provokeSpinner) + diceSum;
                String provokeTotal = String.valueOf(provokeCalc);
                tvProvokeResult.setText(provokeTotal);
            }
        });

        btnRapport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FateCoreFragment.this.fcRoll();
                String rapportSpinner = spRapport.getSelectedItem().toString();
                int rapportCalc = Integer.parseInt(rapportSpinner) + diceSum;
                String rapportTotal = String.valueOf(rapportCalc);
                tvRapportResult.setText(rapportTotal);
            }
        });

        btnResources.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FateCoreFragment.this.fcRoll();
                String resourcesSpinner = spResources.getSelectedItem().toString();
                int resourcesCalc = Integer.parseInt(resourcesSpinner) + diceSum;
                String resourcesTotal = String.valueOf(resourcesCalc);
                tvResourcesResult.setText(resourcesTotal);
            }
        });

        btnShoot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FateCoreFragment.this.fcRoll();
                String shootSpinner = spShoot.getSelectedItem().toString();
                int shootCalc = Integer.parseInt(shootSpinner) + diceSum;
                String shootTotal = String.valueOf(shootCalc);
                tvShootResult.setText(shootTotal);
            }
        });

        btnStealth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FateCoreFragment.this.fcRoll();
                String stealthSpinner = spStealth.getSelectedItem().toString();
                int stealthCalc = Integer.parseInt(stealthSpinner) + diceSum;
                String stealthTotal = String.valueOf(stealthCalc);
                tvStealthResult.setText(stealthTotal);
            }
        });

        btnWill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FateCoreFragment.this.fcRoll();
                String willSpinner = spWill.getSelectedItem().toString();
                int willCalc = Integer.parseInt(willSpinner) + diceSum;
                String willTotal = String.valueOf(willCalc);
                tvWillResult.setText(willTotal);
            }
        });

        return rootView;
    }

    private void fcRoll(){
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
