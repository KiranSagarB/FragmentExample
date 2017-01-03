package com.example.boston.fragmentexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


//firstly create a xml file for fragment with relative layout within which add the following////
// create a edittext with id //
//create a button with id//
// later we have to add he business logic for the fragment


public class MainActivity extends AppCompatActivity implements SectionFragment.SectionFragmentListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
// this is the method to be implemented after creating interface of sectionfragment
    @Override
    public void createMeme(String top, String bottom) {

    BottomFragment bottomFragment = (BottomFragment)getSupportFragmentManager().findFragmentById(R.id.fragment2);
        bottomFragment.setMemeText(top,bottom);
    }
}
