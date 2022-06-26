/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import model.RegCompModel;
/**
 *
 * @author harsh
 */
public class RegCompDao {
    public static void submit(RegCompModel reg)
	{
		String query = "insert into complaint(cid,name,phonenumber,state,placeincident,disastername,complaint,picture,date_inc) values('"+reg.getCid()+"','"+reg.getName()+"','"+reg.getPhonenumber()+"','"+reg.getState()+"','"+reg.getPlaceincident()+"','"+reg.getDisastername()+"','"+reg.getComplaint()+"','"+reg.getPicproof()+"','"+reg.getDate()+"')";
		//String query = "insert into 'complaint'('cid','name','phonenumber','state','placeincident','disastername','complaint','picture','date_inc') values(?,?,?,?,?,?,?,?,?)";
                DbOperations.setDataorDelete(query,"Complaint Registered Successfullyy!!");
        }
}
