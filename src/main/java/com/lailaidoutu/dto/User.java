package com.lailaidoutu.dto;

import javax.validation.constraints.Max;

/**
 * Created by luowen on 2017/5/14.
 */
public class User {

    @Max(value = 6)
    private String username;

    private String avatar;

    private Integer level;

    private float rich;

    public User() {
    }

    public User(String username, String avatar, Integer level) {
        this.username = username;
        this.avatar = avatar;
        this.level = level;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public float getRich() {
        return rich;
    }

    public void setRich(float rich) {
        this.rich = rich;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "username='" + username + '\'' +
                ", avatar='" + avatar + '\'' +
                ", level=" + level +
                ", rich=" + rich +
                '}';
    }
}
