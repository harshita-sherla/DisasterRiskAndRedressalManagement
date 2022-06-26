/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import model.ARFModel;

/**
 *
 * @author harsh
 */
public class ARFDao {
    public static void assign(ARFModel arf)
	{
		String query = "insert into action(Cid,ComplaintState,DisasterCommittee,TaskForceHead,Contact,Timings) values('"+arf.getCid()+"','"+arf.getComplaintstate()+"','"+arf.getDiscommittee()+"','"+arf.getTaskforcehead()+"','"+arf.getContact()+"','"+arf.getTimings()+"')";
		DbOperations.setDataorDelete(query,"Assigned TaskForce Successfullyy!");
        }
}
