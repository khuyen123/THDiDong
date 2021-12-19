package com.example.diemrenluyen;

import java.io.Serializable;

public class SinhVien implements Serializable {
    private int id_sinhvien;
    private String ma_sinhvien;
    private String ten_sinhvien;
    private String email_sinhvien;
    private String lop_sinhvien;
    private String matKhau_sinhvien;
    private String SDT_sinhvien;
    private String diaChi_sinhvien;
    private String gioiTinh_sinhvien;
    private String ngaySinh_sinhvien;
    private String anh_sinhvien;

    public SinhVien(int id_sinhvien, String ma_sinhvien, String ten_sinhvien, String email_sinhvien, String lop_sinhvien, String matKhau_sinhvien, String SDT_sinhvien, String diaChi_sinhvien, String gioiTinh_sinhvien, String ngaySinh_sinhvien, String anh_sinhvien) {
        this.id_sinhvien = id_sinhvien;
        this.ma_sinhvien = ma_sinhvien;
        this.ten_sinhvien = ten_sinhvien;
        this.email_sinhvien = email_sinhvien;
        this.lop_sinhvien = lop_sinhvien;
        this.matKhau_sinhvien = matKhau_sinhvien;
        this.SDT_sinhvien = SDT_sinhvien;
        this.diaChi_sinhvien = diaChi_sinhvien;
        this.gioiTinh_sinhvien = gioiTinh_sinhvien;
        this.ngaySinh_sinhvien = ngaySinh_sinhvien;
        this.anh_sinhvien = anh_sinhvien;
    }

    public int getId_sinhvien() {
        return id_sinhvien;
    }

    public void setId_sinhvien(int id_sinhvien) {
        this.id_sinhvien = id_sinhvien;
    }

    public String getMa_sinhvien() {
        return ma_sinhvien;
    }

    public void setMa_sinhvien(String ma_sinhvien) {
        this.ma_sinhvien = ma_sinhvien;
    }

    public String getTen_sinhvien() {
        return ten_sinhvien;
    }

    public void setTen_sinhvien(String ten_sinhvien) {
        this.ten_sinhvien = ten_sinhvien;
    }

    public String getEmail_sinhvien() {
        return email_sinhvien;
    }

    public void setEmail_sinhvien(String email_sinhvien) {
        this.email_sinhvien = email_sinhvien;
    }

    public String getLop_sinhvien() {
        return lop_sinhvien;
    }

    public void setLop_sinhvien(String lop_sinhvien) {
        this.lop_sinhvien = lop_sinhvien;
    }

    public String getMatKhau_sinhvien() {
        return matKhau_sinhvien;
    }

    public void setMatKhau_sinhvien(String matKhau_sinhvien) {
        this.matKhau_sinhvien = matKhau_sinhvien;
    }

    public String getSDT_sinhvien() {
        return SDT_sinhvien;
    }

    public void setSDT_sinhvien(String SDT_sinhvien) {
        this.SDT_sinhvien = SDT_sinhvien;
    }

    public String getDiaChi_sinhvien() {
        return diaChi_sinhvien;
    }

    public void setDiaChi_sinhvien(String diaChi_sinhvien) {
        this.diaChi_sinhvien = diaChi_sinhvien;
    }

    public String getGioiTinh_sinhvien() {
        return gioiTinh_sinhvien;
    }

    public void setGioiTinh_sinhvien(String gioiTinh_sinhvien) {
        this.gioiTinh_sinhvien = gioiTinh_sinhvien;
    }

    public String getNgaySinh_sinhvien() {
        return ngaySinh_sinhvien;
    }

    public void setNgaySinh_sinhvien(String ngaySinh_sinhvien) {
        this.ngaySinh_sinhvien = ngaySinh_sinhvien;
    }

    public String getAnh_sinhvien() {
        return anh_sinhvien;
    }

    public void setAnh_sinhvien(String anh_sinhvien) {
        this.anh_sinhvien = anh_sinhvien;
    }
}
