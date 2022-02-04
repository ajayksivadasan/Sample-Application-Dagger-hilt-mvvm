package com.example.examplehiltjava.di;

import android.content.Context;

import com.example.examplehiltjava.utils.CommonFunctions;

import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.qualifiers.ApplicationContext;
import dagger.hilt.components.SingletonComponent;

@Module
@InstallIn(SingletonComponent.class)
public class DiModule {
    public CommonFunctions providesCommonFunction(@ApplicationContext Context context) {
        return CommonFunctions.getInstance(context);
    }
}
