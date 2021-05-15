package com.kinoboes.upclife.ui.Eventos;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.kinoboes.upclife.databinding.FragmentClubsBinding;

public class EventosFragment extends Fragment {

    private EventosViewModel eventosViewModel;
    private FragmentClubsBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        eventosViewModel =
                new ViewModelProvider(this).get(EventosViewModel.class);

        binding = FragmentClubsBinding.inflate(inflater, container, false);
        View root = binding.getRoot();


        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}