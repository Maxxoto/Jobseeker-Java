/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author hamlet
 */
public class Joblist {
    private Integer id_job,id_employeer;
    private Integer jobsalary;
    private String jobname,jobcategory,jobdesc,joblocation;

    public Integer getId_job() {
        return id_job;
    }

    public void setId_job(Integer id_job) {
        this.id_job = id_job;
    }

    public int getId_employeer() {
        return id_employeer;
    }

    public void setId_employeer(int id_employeer) {
        this.id_employeer = id_employeer;
    }

    public Integer getJobsalary() {
        return jobsalary;
    }

    public void setJobsalary(Integer jobsalary) {
        this.jobsalary = jobsalary;
    }

    public String getJobname() {
        return jobname;
    }

    public void setJobname(String jobname) {
        this.jobname = jobname;
    }

    public String getJobcategory() {
        return jobcategory;
    }

    public void setJobcategory(String jobcategory) {
        this.jobcategory = jobcategory;
    }

    public String getJobdesc() {
        return jobdesc;
    }

    public void setJobdesc(String jobdesc) {
        this.jobdesc = jobdesc;
    }

    public String getJoblocation() {
        return joblocation;
    }

    public void setJoblocation(String joblocation) {
        this.joblocation = joblocation;
    }
}
