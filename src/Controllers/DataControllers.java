/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Helpers.Database;
import Models.Jobjoin;
import Models.Joblist;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author hamlet
 */
public class DataControllers {
    Database Database;
    
    ArrayList<Joblist> arrJoblist ;
    ArrayList<Jobjoin> arrJobjoin;
    
    
    public DataControllers() {
        this.Database = new Database();
        this.arrJoblist = new ArrayList<>();
        this.arrJobjoin = new ArrayList<>();
    }
    
    public ArrayList<Joblist> getLamaranku (Integer id_jobseeker) throws SQLException{
        this.arrJoblist.clear();
        ResultSet rs = this.Database.GetData("SELECT TBJOBLIST.NPM06931_JOBNAME,TBJOBLIST.JOBSALARY,TBJOBLIST.JOBLOCATION FROM TBJOBJOIN JOIN TBJOBLIST ON TBJOBLIST.ID_JOB = TBJOBJOIN.ID_JOB JOIN TBEMPLOYEER ON TBEMPLOYEER.ID_EMPLOYEER = TBJOBLIST.ID_EMPLOYEER WHERE TBJOBJOIN.ID_JOBSEEKER = "+ id_jobseeker);
//        ResultSet rs = this.Database.GetData("SELECT ID_JOBJOIN,TBEMPLOYEER.FULLNAME,TBJOBLIST.NPM06931_JOBNAME,TBJOBLIST.JOBSALARY,TBJOBLIST.JOBLOCATION FROM TBJOBJOIN JOIN TBJOBLIST ON TBJOBLIST.ID_JOB = TBJOBJOIN.ID_JOB JOIN TBEMPLOYEER ON TBEMPLOYEER.ID_EMPLOYEER = TBJOBLIST.ID_EMPLOYEER WHERE TBJOBJOIN.ID_JOBSEEKER = "+ id_jobseeker);
        while (rs.next()){
            Joblist listjob = new Joblist();
                        
            listjob.setJobname(rs.getString("NPM06931_JOBNAME"));
            listjob.setJobsalary(rs.getInt("JOBSALARY"));
            listjob.setJoblocation(rs.getString("JOBLOCATION"));
            
            
            this.arrJoblist.add(listjob);
           
        }   
        return this.arrJoblist;
    }
    
    public ArrayList<Joblist> getLowonganku (Integer id_employeer) throws SQLException{
        this.arrJoblist.clear();
        ResultSet rs = this.Database.GetData("SELECT * FROM TBJOBLIST WHERE ID_EMPLOYEER = "+ id_employeer);
        while (rs.next()){
            Joblist listjob = new Joblist();
                        
            listjob.setJobname(rs.getString("NPM06931_JOBNAME"));
            listjob.setJobsalary(rs.getInt("JOBSALARY"));
            listjob.setJoblocation(rs.getString("JOBLOCATION"));
            
            
            this.arrJoblist.add(listjob);
           
        }   
        return this.arrJoblist;
    }
    
    
    public ArrayList<Jobjoin> getJoinJob (String idemployeer) throws SQLException{
        this.arrJobjoin.clear();
        
        ResultSet rs = this.Database.GetData("SELECT ID_JOBJOIN,TBJOBSEEKER.FULLNAME,TBJOBLIST.NPM06931_JOBNAME FROM TBJOBJOIN JOIN TBJOBSEEKER ON TBJOBSEEKER.ID_JOBSEEKER = TBJOBJOIN.ID_JOBSEEKER JOIN TBJOBLIST ON TBJOBLIST.ID_JOB = TBJOBJOIN.ID_JOB WHERE TBJOBLIST.ID_EMPLOYEER = "+ idemployeer);
        
        try {
            while (rs.next()){
            Jobjoin listJoin = new Jobjoin();
            listJoin.setId_jobjoin(rs.getInt("ID_JOBJOIN"));
            listJoin.setNameJobseeker(rs.getString("FULLNAME"));
            listJoin.setNameJob(rs.getString("NPM06931_JOBNAME"));
                        
            this.arrJobjoin.add(listJoin);
            }
            
        } catch (Exception e) {
            System.err.println("Error : "+ e);
        }
           return this.arrJobjoin;
        
    }
    
    public ArrayList<Joblist> getlistJob () throws SQLException{
        this.arrJoblist.clear();
        ResultSet rs = this.Database.GetData("SELECT * FROM TBJOBLIST");
        
        while (rs.next()){
            Joblist listjob = new Joblist();
            listjob.setId_job(rs.getInt("ID_JOB"));
            listjob.setId_employeer(rs.getInt("ID_EMPLOYEER"));
            listjob.setJobname(rs.getString("NPM06931_JOBNAME"));
            listjob.setJobsalary(rs.getInt("JOBSALARY"));
            listjob.setJoblocation(rs.getString("JOBLOCATION"));
            
            
            this.arrJoblist.add(listjob);
        }   
        return arrJoblist;
    }
    
    public void joinJob(String idjob,String idjobseeker) {
        try {
            this.Database.ManipulasiData("INSERT INTO TBJOBJOIN VALUES (ID_JOBJOIN.NEXTVAL,"+idjob+","+idjobseeker+")");                        
        } catch (Exception e) {
            System.err.println(e);
            
        }        
    }
    public void addJob(String id_employeer,String jobname,String jobcategory,String jobdesc,String jobsalary,String joblocation){
        try {
            this.Database.ManipulasiData("INSERT INTO TBJOBLIST VALUES (ID_JOB.NEXTVAL,"+id_employeer+","+"'"+jobname+"','"+jobcategory+"','"+jobdesc+"',"+jobsalary+",'"+joblocation+"')" );
        }catch(Exception e){
            System.err.println(e);
        }
    }
    
}
