package com.codegym.demo.models;

public class NhanVien {
    private int id;
    private String tennv;
    private String email;
    private String address;
    private String phone;
    private double salary;
    private String phongBanName;


    public NhanVien(String tennv, String email, String address, String phone, double salary, String phongBanName) {
        this.tennv = tennv;
        this.email = email;
        this.address = address;
        this.phone = phone;
        this.salary = salary;
        this.phongBanName = phongBanName;
    }

    public NhanVien() {
    }

    public NhanVien(int id, String tennv, String email, String address, String phone, double salary, String phongBanName) {
        this.id = id;
        this.tennv = tennv;
        this.email = email;
        this.address = address;
        this.phone = phone;
        this.salary = salary;
        this.phongBanName = phongBanName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTennv() {
        return tennv;
    }

    public void setTennv(String tennv) {
        this.tennv = tennv;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPhongBanName() {
        return phongBanName;
    }

    public void setPhongBanName(String phongBanName) {
        this.phongBanName = phongBanName;
    }
}
