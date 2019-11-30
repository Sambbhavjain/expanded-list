package com.example.mridule.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by mridule on 24/11/19.
 */

public class Fragment_1 extends Fragment {
    ExpandableListView expandableListView;
    List<String> listgroup;
    HashMap<String,List<String>> listitem;
    MainAdapter adapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view=inflater.inflate( R.layout.extendedlist, container,false);
        expandableListView = (ExpandableListView)view.findViewById(R.id.expandedList);
        listgroup = new ArrayList<>();
        listitem = new HashMap<>();
        initListdata();
        adapter=new MainAdapter(view.getContext(),listgroup, listitem);
        expandableListView.setAdapter(adapter);


        return view;
    }
    private void initListdata()
    {
        listgroup.add(getString(R.string.group1));
        listgroup.add(getString(R.string.group2));
        listgroup.add(getString(R.string.group3));
        listgroup.add(getString(R.string.group4));
        listgroup.add(getString(R.string.group5));

        String[] array;
        List<String> list1=new ArrayList<>();
        array = getResources().getStringArray(R.array.group1);
        for (String item:array)
            list1.add(item);
        List<String> list2=new ArrayList<>();
        array = getResources().getStringArray(R.array.group2);
        for (String item:array)
            list2.add(item);
        List<String> list3=new ArrayList<>();
        array = getResources().getStringArray(R.array.group3);
        for (String item:array)
            list3.add(item);
        List<String> list4=new ArrayList<>();
        array = getResources().getStringArray(R.array.group4);
        for (String item:array)
            list4.add(item);
        List<String> list5=new ArrayList<>();
        array = getResources().getStringArray(R.array.group5);
        for (String item:array)
            list5.add(item);
        listitem.put(listgroup.get(0),list1);
        listitem.put(listgroup.get(1),list2);
        listitem.put(listgroup.get(2),list3);
        listitem.put(listgroup.get(3),list4);
        listitem.put(listgroup.get(4),list5);
        //adapter.notifyDataSetChanged();



    }

}
