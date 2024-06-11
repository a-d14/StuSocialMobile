package com.example.stusocialmobile;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.stusocialmobile.models.Post;

import java.util.ArrayList;
import java.util.List;

public class FeedAdapter extends RecyclerView.Adapter<FeedAdapter.MyViewHolder> {

    Context context;
    List<Post> posts;

    public FeedAdapter(Context context, List<Post> posts) {
        this.context = context;
        this.posts = posts;
    }

    @NonNull
    @Override
    public FeedAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.post_layout, parent, false);
        return new FeedAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FeedAdapter.MyViewHolder holder, int position) {
        holder.postDate.setText(posts.get(position).getPostDate());
        holder.postBody.setText(posts.get(position).getPostBody());
        holder.userName.setText(posts.get(position).getUserName());
    }

    @Override
    public int getItemCount() {
        return posts.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView postDate, userName, postBody;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            postDate = itemView.findViewById(R.id.postDate);
            userName = itemView.findViewById(R.id.userName);
            postBody = itemView.findViewById(R.id.postBody);
        }
    }
}
