package com.lailaidoutu.entities;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by luowen on 2017/5/15.
 */
@Entity
@Table(name = "user", indexes = {
        @Index(name = "idx_name", columnList = ("name")),
        @Index(name = "idx_email", columnList = "email"),
        @Index(name = "idx_mobile", columnList = "mobile"),
        @Index(name = "idx_coins", columnList = "coins"),
        @Index(name = "idx_created_at", columnList = "createdAt")
})
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false, columnDefinition = "varchar(64) default '' comment '用户昵称'")
    private String name;

    @Column(nullable = false, columnDefinition = "varchar(255) default '' comment '用户头像'")
    private String avatar;

    private Integer gender;

    private String email;

    private String mobile;

    private float coins;

    private Date createdAt;

    private Date updatedAt;

    private Date deletedAt;

    public UserEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public float getCoins() {
        return coins;
    }

    public void setCoins(float coins) {
        this.coins = coins;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Date getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(Date deletedAt) {
        this.deletedAt = deletedAt;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", avatar='" + avatar + '\'' +
                ", gender=" + gender +
                ", email='" + email + '\'' +
                ", mobile='" + mobile + '\'' +
                ", coins=" + coins +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", deletedAt=" + deletedAt +
                '}';
    }
}
