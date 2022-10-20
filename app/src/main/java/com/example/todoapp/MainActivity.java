package com.example.todoapp;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import android.os.Bundle;


public class MainActivity extends SingleFragmentActivity{
    Fragment fragment;
    FragmentManager fragmentManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragment=createFragment();
        if(fragment == null){
            fragment = new TaskFragment();
            fragmentManager.beginTransaction().add(R.id.fragment_container, fragment).commit();
        }
    }

    @Override
    protected Fragment createFragment() {
        fragmentManager = getSupportFragmentManager();
        Fragment fragmentx = fragmentManager.findFragmentById(R.id.fragment_container);
        return fragmentx;
    }
}