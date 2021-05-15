package com.kinoboes.upclife.ui.Laboratorios;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.kinoboes.upclife.databinding.FragmentLaboratoriosBinding;

public class LaboratoriosFragment extends Fragment {

    private LaboratoriosViewModel laboratoriosViewModel;
    private FragmentLaboratoriosBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        laboratoriosViewModel =
                new ViewModelProvider(this).get(LaboratoriosViewModel.class);

        binding = FragmentLaboratoriosBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}