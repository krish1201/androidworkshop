package com.example.task_5;

import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.zip.Inflater;

public class Frag1 extends Fragment{
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle sv)
    {
        return inflater.inflate(R.layout.activity_frag1,viewGroup,false);
    }
}