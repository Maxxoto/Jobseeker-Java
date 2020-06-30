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
public class Jobjoin {
    private Integer id_job,id_jobjoin,id_jobseeker;
    private String nameJobseeker,nameJob;

    public Integer getId_job() {
        return id_job;
    }

    public void setId_job(Integer id_job) {
        this.id_job = id_job;
    }

    public Integer getId_jobjoin() {
        return id_jobjoin;
    }

    public void setId_jobjoin(Integer id_jobjoin) {
        this.id_jobjoin = id_jobjoin;
    }

    public Integer getId_jobseeker() {
        return id_jobseeker;
    }

    public void setId_jobseeker(Integer id_jobseeker) {
        this.id_jobseeker = id_jobseeker;
    }

    public String getNameJobseeker() {
        return nameJobseeker;
    }

    public void setNameJobseeker(String nameJobseeker) {
        this.nameJobseeker = nameJobseeker;
    }

    public String getNameJob() {
        return nameJob;
    }

    public void setNameJob(String nameJob) {
        this.nameJob = nameJob;
    }
}
