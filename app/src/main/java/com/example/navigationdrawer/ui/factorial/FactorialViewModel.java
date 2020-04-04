package com.example.navigationdrawer.ui.factorial;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class FactorialViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public FactorialViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is tools fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}