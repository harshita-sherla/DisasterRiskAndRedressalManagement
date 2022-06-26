/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import javax.swing.JOptionPane;
/**
 *
 * @author harsh
 */
public class Tables {
    public static void main(String args[]){
        try{
            String complaintTable = "create table complaint(cid varchar(100),name varchar(100),phonenumber varchar(10),state varchar(40),placeincident varchar(100),disastername varchar(100),complaint varchar(200),picture blob,date_inc date)";
            DbOperations.setDataorDelete(complaintTable,"Complaint Table created successfully!");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }
}
