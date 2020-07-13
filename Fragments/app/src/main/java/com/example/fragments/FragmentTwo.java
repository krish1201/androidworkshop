package com.example.fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.zip.Inflater;

public class FragmentTwo extends Fragment{
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle sv)
    {
        return inflater.inflate(R.layout.fragment_two,viewGroup,false);
    }
}
