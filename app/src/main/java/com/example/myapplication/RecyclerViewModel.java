package com.example.myapplication;

import android.support.annotation.NonNull;

public class RecyclerViewModel  {

    private String basicText;

    public RecyclerViewModel(@NonNull final String basicText){
        setBasicText(basicText);
    }
//     Setter function
    private void setBasicText(@NonNull final String basicText) {
        this.basicText =basicText;
    }

    //Getter function

    public String getSimpleText(){
       return basicText;
    }
}
