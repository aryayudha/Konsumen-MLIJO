package com.mlijo.aryaym.konsumen_mlijo.DBModel;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by AryaYM on 09/09/2017.
 */

public class KonsumenModel implements Serializable {
    private String imgAvatar;
    private String email;
    private String nama;
    private String NIK;
    private String noTelp;
    private String uid;
    private String deviceToken;
    private String alamat;
    private String judulAlamat;
    private String alamatId;
    private String namaPenerima;
    private Map<String, Object> detailKonsumen;
    private HashMap<String, Object> alamatUser;

    public KonsumenModel(){}

    public Map<String, Object> getDetailKonsumen() {
        return detailKonsumen;
    }

    public String getImgAvatar() {
        return imgAvatar;
    }

    public void setImgAvatar(String imgAvatar) {
        this.imgAvatar = imgAvatar;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNIK() {
        return NIK;
    }

    public String getNoTelp() {
        return noTelp;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getDeviceToken() {
        return deviceToken;
    }

    public void setDeviceToken(String deviceToken) {
        this.deviceToken = deviceToken;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getJudulAlamat() {
        return judulAlamat;
    }

    public void setJudulAlamat(String judulAlamat) {
        this.judulAlamat = judulAlamat;
    }

    public String getAlamatId() {
        return alamatId;
    }

    public void setAlamatId(String alamatId) {
        this.alamatId = alamatId;
    }

    public HashMap<String, Object> getAlamatUser() {
        return alamatUser;
    }

    public void setAlamatUser(HashMap<String, Object> alamatUser) {
        this.alamatUser = alamatUser;
    }

    public String getNamaPenerima() {
        return namaPenerima;
    }

    public void setNamaPenerima(String namaPenerima) {
        this.namaPenerima = namaPenerima;
    }
}
