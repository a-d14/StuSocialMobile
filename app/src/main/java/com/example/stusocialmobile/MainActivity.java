package com.example.stusocialmobile;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.stusocialmobile.models.Post;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Post> feed = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.homeFeed);

        fillDummyData();

        FeedAdapter adapter = new FeedAdapter(this, feed);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

    private void fillDummyData() {
        for(int i = 0; i < 3; i++) {
            feed.add(new Post("Jun 16 2024", "@auxdg", "This is the post body"));
        }
    }
}