package com.example.aroundme;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import adapter.RecentsAdapter;
import adapter.TopPlacesAdapter;
import model.RecentsData;
import model.TopPlacesData;

public class MainActivity extends AppCompatActivity {
    RecyclerView recentRecycler,topPlacesRecycler;
    RecentsAdapter recentsAdapter;
    TopPlacesAdapter topPlacesAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //now we are adding some dummy data in model class
        List<RecentsData>recentsDataList=new ArrayList<>();
        recentsDataList.add(new RecentsData("AM Lake","india","From $200",R.drawable.recentimage1));
        recentsDataList.add(new RecentsData("Nigiri Hills","india","From $300",R.drawable.recentimage2));
        recentsDataList.add(new RecentsData("AM Lake","india","From $200",R.drawable.recentimage1));
        recentsDataList.add(new RecentsData("Nigiri Hills","india","From $300",R.drawable.recentimage2));
        recentsDataList.add(new RecentsData("AM Lake","india","From $200",R.drawable.recentimage1));
        recentsDataList.add(new RecentsData("Nigiri Hills","india","From $300",R.drawable.recentimage2));
        recentsDataList.add(new RecentsData("AM Lake","india","From $200",R.drawable.recentimage1));
        setRecentRecycler(recentsDataList);
        List<TopPlacesData>topPlacesDataList=new ArrayList<>();
        topPlacesDataList.add(new TopPlacesData("Kasmir Hill","india","$200- 500$",R.drawable.topplaces));
        topPlacesDataList.add(new TopPlacesData("Kasmir Hill","india","$200- 500$",R.drawable.topplaces));
        topPlacesDataList.add(new TopPlacesData("Kasmir Hill","india","$200- 500$",R.drawable.topplaces));
        topPlacesDataList.add(new TopPlacesData("Kasmir Hill","india","$200- 500$",R.drawable.topplaces));
        topPlacesDataList.add(new TopPlacesData("Kasmir Hill","india","$200- 500$",R.drawable.topplaces));
        topPlacesDataList.add(new TopPlacesData("Kasmir Hill","india","$200- 500$",R.drawable.topplaces));
        setTopPlacesRecycler(topPlacesDataList);
    }

    private void setRecentRecycler(List<RecentsData>recentsDataList){
        recentRecycler=findViewById(R.id.recent_recycler);
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false);
        recentRecycler.setLayoutManager(layoutManager);
        recentsAdapter=new RecentsAdapter(this,recentsDataList);
        recentRecycler.setAdapter(recentsAdapter);
    }
    private void setTopPlacesRecycler(List<TopPlacesData>topPlacesDataList){
        topPlacesRecycler=findViewById(R.id.top_places_recycler);
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(this,RecyclerView.VERTICAL,false);
        topPlacesRecycler.setLayoutManager(layoutManager);
        topPlacesAdapter=new TopPlacesAdapter(this,topPlacesDataList);
        topPlacesRecycler.setAdapter(topPlacesAdapter);
    }
}