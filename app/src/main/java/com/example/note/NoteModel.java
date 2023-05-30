//10120140-RifqiNugraha-IF4

package com.example.note;

import java.util.ArrayList;
import java.util.Date;

public class NoteModel {

    public static ArrayList<NoteModel> noteArrayList = new ArrayList<>();
    public static String NOTE_EDIT_EXTRA =  "noteEdit";
    private int id;
    private  String judul;
    private Date waktu;
    private String catatan;

    public NoteModel(int id, String judul, Date waktu, String catatan) {
        this.id = id;
        this.judul = judul;
        this.waktu = waktu;
        this.catatan = catatan;
    }

    public NoteModel(int id, String judul, String catatan) {
        this.id = id;
        this.judul = judul;
        this.catatan = catatan;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public Date getWaktu() {
        return waktu;
    }

    public void setWaktu(Date waktu) {
        this.waktu = waktu;
    }

    public String getCatatan() {
        return catatan;
    }

    public void setCatatan(String catatan) {
        this.catatan = catatan;
    }
}
