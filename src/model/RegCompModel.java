/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Blob;

/**
 *
 * @author harsh
 */
public class RegCompModel {
        private String cid;
        private String name;
	private String phonenumber;
	private String state;
	private String placeincident;
	private String disastername;
	private String complaint;
	private String date;
        private Blob picproof;
        
    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPlaceincident() {
        return placeincident;
    }

    public void setPlaceofincident(String placeincident) {
        this.placeincident = placeincident;
    }

    public String getDisastername() {
        return disastername;
    }

    public void setDisastername(String disastername) {
        this.disastername = disastername;
    }

    public String getComplaint() {
        return complaint;
    }

    public void setComplaint(String complaint) {
        this.complaint = complaint;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Blob getPicproof() {
        return picproof;
    }

    public void setPicproof(Blob picproof) {
        this.picproof = picproof;
    }
        
}
