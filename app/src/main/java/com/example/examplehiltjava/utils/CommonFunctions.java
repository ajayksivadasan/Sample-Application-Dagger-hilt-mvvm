package com.example.examplehiltjava.utils;

import android.content.Context;

public class CommonFunctions {
    private Context context;

    private CommonFunctions(Context context) {
        this.context = context;
    }
    public static CommonFunctions getInstance(Context context){
        return new CommonFunctions(context);
    }
}
