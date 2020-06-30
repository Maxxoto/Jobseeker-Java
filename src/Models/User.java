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
public class User {
    private Integer id_employeer,id_jobseeker,id_auth;
    private String fullname,address,phone,company,jobtitle,roles ;

    public Integer getId_employeer() {
        return id_employeer;
    }

    public void setId_employeer(Integer id_employeer) {
        this.id_employeer = id_employeer;
    }

    public Integer getId_auth() {
        return id_auth;
    }

    public void setId_auth(Integer id_auth) {
        this.id_auth = id_auth;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getJobtitle() {
        return jobtitle;
    }

    public void setJobtitle(String jobtitle) {
        this.jobtitle = jobtitle;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    public Integer getId_jobseeker() {
        return id_jobseeker;
    }

    public void setId_jobseeker(Integer id_jobseeker) {
        this.id_jobseeker = id_jobseeker;
    }
}
