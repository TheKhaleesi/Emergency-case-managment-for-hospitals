/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DoctorWorkQueue;

import java.util.ArrayList;

/**
 *
 * @author Mrunal
 */
public class WorkQueue {

 private ArrayList<WorkRequest> workRequestList;


    public ArrayList<WorkRequest> getWorkRequestList() {
        return workRequestList;
    }

    

 
 public WorkQueue() {
        workRequestList = new ArrayList();
    }
 

}
