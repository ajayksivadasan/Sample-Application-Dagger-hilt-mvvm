package com.example.examplehiltjava.ui.main;

import androidx.lifecycle.ViewModel;

import javax.inject.Inject;

import dagger.hilt.android.lifecycle.HiltViewModel;

@HiltViewModel
public class MainActivityViewModel extends ViewModel {
    @Inject
    public MainActivityViewModel() {
    }
}
