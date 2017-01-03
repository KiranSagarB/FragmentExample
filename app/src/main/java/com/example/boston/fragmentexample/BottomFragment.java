package com.example.boston.fragmentexample;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;



public class BottomFragment extends Fragment{

    private static TextView topmeme;
    private static TextView bottommeme;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.bottom_fragment,container,false);

        topmeme = (TextView)view.findViewById(R.id.topmeme);
        bottommeme = (TextView)view.findViewById(R.id.bottommeme);

        return view;
    }

    public void setMemeText (String top,String bottom){
        topmeme.setText(top);
        bottommeme.setText(bottom);
    }
}
