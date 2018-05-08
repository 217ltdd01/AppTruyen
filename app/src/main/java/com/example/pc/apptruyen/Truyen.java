package com.example.pc.apptruyen;

/**
 * Created by PC on 5/8/2018.
 */

public class Truyen {
    public String ten,tacgia,ngaycapnhat;
    public Integer sochuong,hinhanh;
    //public Date ngaycapnhat;

    public Truyen(String ten, String tacgia, Integer hinhanh, Integer sochuong, String ngaycapnhat) {
        this.ten = ten;
        this.tacgia = tacgia;
        this.hinhanh = hinhanh;
        this.sochuong = sochuong;
        this.ngaycapnhat = ngaycapnhat;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getTacgia() {
        return tacgia;
    }

    public void setTacgia(String tacgia) {
        this.tacgia = tacgia;
    }

    public Integer getHinhanh() {
        return hinhanh;
    }

    public void setHinhanh(Integer hinhanh) {
        this.hinhanh = hinhanh;
    }

    public Integer getSochuong() {
        return sochuong;
    }

    public void setSochuong(Integer sochuong) {
        this.sochuong = sochuong;
    }

    public String getNgaycapnhat() {
        return ngaycapnhat;
    }

    public void setNgaycapnhat(String ngaycapnhat) {
        this.ngaycapnhat = ngaycapnhat;
    }
}
