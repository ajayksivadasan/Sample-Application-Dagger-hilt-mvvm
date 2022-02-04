package com.example.examplehiltjava.ui.main;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.examplehiltjava.R;
import com.example.examplehiltjava.data.Model;
import com.example.examplehiltjava.utils.CommonFunctions;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class MainActivity extends AppCompatActivity {
    @Inject
    CommonFunctions commonFunctions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<Model> modelList = new ArrayList<>();
        modelList.add(new Model(0, "https://upload.wikimedia.org/wikipedia/commons/thumb/c/cb/Mohanlal_Viswanathan_Nair_BNC.jpg/220px-Mohanlal_Viswanathan_Nair_BNC.jpg"));

    }
}