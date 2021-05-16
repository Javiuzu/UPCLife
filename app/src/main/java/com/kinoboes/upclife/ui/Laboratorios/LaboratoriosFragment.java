package com.kinoboes.upclife.ui.Laboratorios;

import android.content.Context;
import android.content.Intent;
import android.database.DataSetObserver;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.kinoboes.upclife.MainActivity;
import com.kinoboes.upclife.R;
import com.kinoboes.upclife.databinding.FragmentLaboratoriosBinding;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;


public class LaboratoriosFragment extends Fragment {

    private LaboratoriosViewModel laboratoriosViewModel;
    private FragmentLaboratoriosBinding binding;

    private LinearLayout linearLayout;
    private List<LabCompanion> companionList;
    private FloatingActionButton fab;

    private void initiateCompanionList() {
        companionList = new ArrayList<LabCompanion>();
        LabCompanion lc= new LabCompanion("Takumi Fujiwara", LabCompanion.Assigs.PRO2, "Looking for someone to code, drift and listen to DEJA VU");
        companionList.add(lc);
        lc = new LabCompanion("Banana Martinez", LabCompanion.Assigs.DSBM);
        companionList.add(lc);
        lc = new LabCompanion("Charles Hillworld", LabCompanion.Assigs.MP, "Catalan hardworking student looking for another hardworking student");
        companionList.add(lc);
        lc = new LabCompanion("DarkLord Palpatine", LabCompanion.Assigs.ECSDI, "In Dark Plagueis the wise group");
        companionList.add(lc);
        lc = new LabCompanion("Little Jorge", LabCompanion.Assigs.LP);
        companionList.add(lc);
    }

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        laboratoriosViewModel =
                new ViewModelProvider(this).get(LaboratoriosViewModel.class);

        binding = FragmentLaboratoriosBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        linearLayout = (LinearLayout)root.findViewById(R.id.scrollLayout);
        initiateCompanionList();
        for(int i = 0; i < companionList.size(); ++i) {
            LinearLayout wrapper = (LinearLayout) LayoutInflater.from(getActivity()).inflate(R.layout.partnerlayout, null);

            TextView nameText = (TextView)wrapper.findViewById(R.id.textViewName);
            nameText.setText(companionList.get(i).getName());

            TextView assigText = (TextView)wrapper.findViewById(R.id.textViewAssig);
            assigText.setText(companionList.get(i).getAssig());

            TextView commentText = (TextView)wrapper.findViewById(R.id.CommentTextView);
            commentText.setText(companionList.get(i).getComment());

            Button button = (Button)wrapper.findViewById(R.id.partnerButton);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast t = Toast.makeText(root.getContext(), "Partner contacted", Toast.LENGTH_SHORT);
                    t.show();
                }
            });

            linearLayout.addView(wrapper);
        }


        initiateCompanionList();

        fab = (FloatingActionButton)root.findViewById(R.id.floating_button);
        fab.setImageDrawable(ContextCompat.getDrawable(getActivity(), R.drawable.addfloating_foreground));
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LinearLayout popupLayout = (LinearLayout) LayoutInflater.from(getActivity()).inflate(R.layout.popup_laboratorio, null);
                PopupWindow pw = new PopupWindow(popupLayout,
                        ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                pw.setFocusable(true);
                pw.showAtLocation(popupLayout, Gravity.CENTER, 0,0);
            }
        });



        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}