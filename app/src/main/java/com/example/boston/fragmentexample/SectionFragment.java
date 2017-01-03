package com.example.boston.fragmentexample;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.app.Activity;
import android.widget.Button;
import android.widget.EditText;


public class SectionFragment  extends Fragment{

    // in here firstly import Bundle,Fragment,View,ViewGroup,LayoutInflater
    //later this java class should extends Fragment class
    // then the onCreateView method has to be over ridden and View has to be assigned
    @Nullable



    private static EditText topinput;
    private static EditText bottominput;

    SectionFragmentListener activityCommander;

    public interface SectionFragmentListener{
        public void createMeme(String top,String bottom);

    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try{
            activityCommander= (SectionFragmentListener) activity;

        } catch (ClassCastException e)
        {
            throw new ClassCastException(activity.toString());
        }
    }

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        // we are going to tell the app that we use the fragment xml file
        // inflate is the one which says this is the layout we use
        View view = inflater.inflate(R.layout.section_fragment,container,false);

        topinput = (EditText)view.findViewById(R.id.topinput);
        bottominput = (EditText)view.findViewById(R.id.bottominput);
        final Button startbutton = (Button) view.findViewById(R.id.startbutton);

        startbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonClicked(view);
            }
        });



        return view;
    }

    //calls this when button is clicked
    public void buttonClicked(View view)
    {
        activityCommander.createMeme(topinput.getText().toString(),bottominput.getText().toString());

    }
}
