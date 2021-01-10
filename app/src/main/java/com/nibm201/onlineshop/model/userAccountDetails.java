package com.nibm201.onlineshop.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class userAccountDetails {
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("userAccountType")
    @Expose
    private char userAccountType;
    @SerializedName("addressLine1")
    @Expose
    private String addresLine1;
    @SerializedName("addressLine2")
    @Expose
    private String addresLine2;
    @SerializedName("userCity")
    @Expose
    private String userCity;
    @SerializedName("userAge")
    @Expose
    private int userAge;
    @SerializedName("tel_no")
    @Expose
    private int tel_no;
    @SerializedName("postalCode")
    @Expose
    private int postalCode;

    public userAccountDetails(String email, char userAccountType, String addresLine1, String addresLine2, String userCity, int userAge, int tel_no, int postalCode) {
        this.email = email;
        this.userAccountType = userAccountType;
        this.addresLine1 = addresLine1;
        this.addresLine2 = addresLine2;
        this.userCity = userCity;
        this.userAge = userAge;
        this.tel_no = tel_no;
        this.postalCode = postalCode;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getUserAccountType() {
        return userAccountType;
    }

    public void setUserAccountType(char userAccountType) {
        this.userAccountType = userAccountType;
    }

    public String getAddresLine1() {
        return addresLine1;
    }

    public void setAddresLine1(String addresLine1) {
        this.addresLine1 = addresLine1;
    }

    public String getAddresLine2() {
        return addresLine2;
    }

    public void setAddresLine2(String addresLine2) {
        this.addresLine2 = addresLine2;
    }

    public String getUserCity() {
        return userCity;
    }

    public void setUserCity(String userCity) {
        this.userCity = userCity;
    }

    public int getUserAge() {
        return userAge;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }

    public int getTel_no() {
        return tel_no;
    }

    public void setTel_no(int tel_no) {
        this.tel_no = tel_no;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }
}
