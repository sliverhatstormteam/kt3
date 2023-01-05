package com.codegym.demo.models;

public class PhongBan {
    private int phongBanID;
    private String phongBanName;

    public PhongBan() {
    }

    public PhongBan(int phongBanID, String phongBanName) {
        this.phongBanID = phongBanID;
        this.phongBanName = phongBanName;
    }

    public int getPhongBanID() {
        return phongBanID;
    }

    public void setPhongBanID(int phongBanID) {
        this.phongBanID = phongBanID;
    }

    public String getPhongBanName() {
        return phongBanName;
    }

    public void setPhongBanName(String phongBanName) {
        this.phongBanName = phongBanName;
    }
}
