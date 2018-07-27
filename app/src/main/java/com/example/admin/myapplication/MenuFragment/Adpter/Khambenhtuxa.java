package com.example.admin.myapplication.MenuFragment.Adpter;

public class Khambenhtuxa {
    String name;
    int hinh;
    String gia;

    public Khambenhtuxa(String name, int hinh, String gia) {
        this.name = name;
        this.hinh = hinh;
        this.gia = gia;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHinh() {
        return hinh;
    }

    public void setHinh(int hinh) {
        this.hinh = hinh;
    }

    public String getGia() {
        return gia;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }
}
