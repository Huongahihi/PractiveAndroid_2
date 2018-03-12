package com.huongtlu.thuchanh_two;

/**
 * Created by BEHUONG on 3/7/2018.
 */

public class monhoc {
    private String tenMH;
    private String hocky;
    private int nam;
    private char diem;

    public monhoc() {
    }

    public monhoc(String tenMH, String hocky, int nam, char diem) {
        this.tenMH = tenMH;
        this.hocky = hocky;
        this.nam = nam;
        this.diem = diem;
    }

    public String getTenMH() {
        return tenMH;
    }

    public void setTenMH(String tenMH) {
        this.tenMH = tenMH;
    }

    public String getHocky() {
        return hocky;
    }

    public void setHocky(String hocky) {
        this.hocky = hocky;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }

    public char getDiem() {
        return diem;
    }

    public void setDiem(char diem) {
        this.diem = diem;
    }
}
