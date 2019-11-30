package com.example.mridule.fragments;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView bottomNav= (BottomNavigationView) findViewById (R.id.bottom_navigation);
        bottomNav.setOnNavigationItemSelectedListener(navlistener);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new HomeFragment()).commit();


    }

////    private void initListdata()
//    {
//        listgroup.add(getString(R.string.group1));
//        listgroup.add(getString(R.string.group2));
//        listgroup.add(getString(R.string.group3));
//        listgroup.add(getString(R.string.group4));
//        listgroup.add(getString(R.string.group5));
//
//        String[] array;
//        List<String> list1=new ArrayList<>();
//        array = getResources().getStringArray(R.array.group1);
//        for (String item:array)
//            list1.add(item);
//        List<String> list2=new ArrayList<>();
//        array = getResources().getStringArray(R.array.group2);
//        for (String item:array)
//            list2.add(item);
//        List<String> list3=new ArrayList<>();
//        array = getResources().getStringArray(R.array.group3);
//        for (String item:array)
//            list3.add(item);
//        List<String> list4=new ArrayList<>();
//        array = getResources().getStringArray(R.array.group4);
//        for (String item:array)
//            list4.add(item);
//        List<String> list5=new ArrayList<>();
//        array = getResources().getStringArray(R.array.group5);
//        for (String item:array)
//            list5.add(item);
//        listitem.put(listgroup.get(0),list1);
//        listitem.put(listgroup.get(1),list2);
//        listitem.put(listgroup.get(2),list3);
//        listitem.put(listgroup.get(3),list4);
//        listitem.put(listgroup.get(4),list5);
//        adapter.notifyDataSetChanged();
//
//
//
//    }


    private BottomNavigationView.OnNavigationItemSelectedListener navlistener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    Fragment selectedfragment=null;

                    switch (item.getItemId()){
                        case R.id.nav_home:
                            selectedfragment = new HomeFragment();
                            break;
                        case R.id.nav_favourite:
                            selectedfragment = new FavouriteFragment();
                            break;
                        case R.id.nav_search:
                            selectedfragment = new SearchFragment();
                            break;

                    }
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,selectedfragment).commit();
                    return true;
                }
            };

    public void onBackPressed() {
        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        int seletedItemId = bottomNavigationView.getSelectedItemId();
        if (R.id.nav_home != seletedItemId) {
            setHomeItem(MainActivity.this);
        } else {
            super.onBackPressed();
        }
    }

    public static void setHomeItem(Activity activity) {
        BottomNavigationView bottomNavigationView = (BottomNavigationView)
                activity.findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.nav_home);
    }

   public void fragment1(View view){
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new Fragment_1()).addToBackStack(null).commit();
    }

    /*public void onBackPressed()
    {
        FragmentManager fm = get().getSupportFragmentManager();
        fm.popBackStack();
    }*/

}




