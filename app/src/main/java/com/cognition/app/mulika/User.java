package com.cognition.app.mulika;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by user on 3/20/2018.
 */

public class User {

    @SerializedName("user_id")
    @Expose
    private Integer user_id;
    @SerializedName("user_name")
    @Expose
    private String user_name;
    @SerializedName("password")
    @Expose
    private String password;
    @SerializedName("phone")
    @Expose
    private Integer phone;

    public User() {
    }

    public User(Integer user_id, String user_name, String password, Integer phone) {
        this.user_id = user_id;
        this.user_name = user_name;
        this.password = password;
        this.phone = phone;
    }

    public User(String user_name, String password, Integer phone) {
        this.user_name = user_name;
        this.password = password;
        this.phone = phone;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }
}
