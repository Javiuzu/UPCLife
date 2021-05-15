package com.kinoboes.upclife.ui.Laboratorios;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class LaboratoriosViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public LaboratoriosViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is notifications fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}