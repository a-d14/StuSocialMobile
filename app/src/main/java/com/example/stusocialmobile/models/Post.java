package com.example.stusocialmobile.models;

public class Post {
    String postDate;
    String userName;
    String postBody;

    public Post(String postDate, String userName, String postBody) {
        this.postDate = postDate;
        this.userName = userName;
        this.postBody = postBody;
    }

    public String getPostDate() {
        return postDate;
    }

    public String getUserName() {
        return userName;
    }

    public String getPostBody() {
        return postBody;
    }
}
