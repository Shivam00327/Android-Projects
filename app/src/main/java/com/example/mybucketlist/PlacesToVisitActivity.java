package com.example.mybucketlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class PlacesToVisitActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places_to_visit);
        setupList();

    }
    private void setupList(){
        BucketListEntry[] placesToVisit={
                new BucketListEntry("Vietnam","amazing place to visit,known for its artistic view",R.drawable.vietnam,5),
                new BucketListEntry("Kerala ","Tried various tea flavour,stayed in houseboat,delicious food",R.drawable.kerala,5),
                new BucketListEntry("Iceland","Hot springs,bamboo forest,sushi,bullet train through mountain",R.drawable.iceland,4.5f),
                new BucketListEntry("Japan","Waterfalls,nature reserves,may northern lights too",R.drawable.japan,4),
                new BucketListEntry("The Amazon","Try to being survive being scared of all creepy crawlies.",R.drawable.amazon,3.5f)


        };
        RecyclerView recyclerView=findViewById(R.id.recycler_view__places_to_visit);
        BucketListEntryAdapter adapter =new BucketListEntryAdapter(placesToVisit);
        recyclerView.setAdapter(adapter);

    }
}