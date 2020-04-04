package com.example.navigationdrawer.ui.even_or_odd;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class EvenOddViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public EvenOddViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is slideshow fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}