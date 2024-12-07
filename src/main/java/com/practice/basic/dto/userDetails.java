package com.practice.basic.dto;

public class userDetails {
    private String username;
    private String userId;
    private int level;

    @Override
    public String toString() {
        return "userDetails{" +
                "username='" + username + '\'' +
                ", userId='" + userId + '\'' +
                ", level=" + level +
                '}';
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
