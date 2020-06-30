/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

//Helpers
import Helpers.Database;

//Models
import Models.Login;
import Models.User;

//SQL Imports
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 *
 * @author hamlet
 */
public class LoginControllers {
    Database Database;
    
//    Global Static ArrayList User    
    public static ArrayList<User> arrUser ;
    
//    public ArrayList<User> arrUser ;
    User userM ;
    
    public LoginControllers() {
        this.Database = new Database();
        LoginControllers.arrUser = new ArrayList<>();        
        this.userM = new User();
    }
    
    public boolean getLoginData (Login login) throws SQLException{
        
        String username = login.getUsername();
        char[] password = login.getPassword();
        String strPass = new String(password);
        
        ResultSet rs = this.Database.GetData("SELECT * FROM tb_auth where username = "+"'"+username+"'"+"and password ="+"'"+strPass+"'");
        
        if(rs.next()==true){
            userM.setId_auth(rs.getInt("ID_AUTH"));
            userM.setRoles(rs.getString("ROLES"));
            arrUser.add(userM);                  
            return true;
        }
        
        return false;
        
    }
    
    public ArrayList<User> getDataUser() throws SQLException{
        int id_auth = arrUser.get(0).getId_auth();
        String roles = arrUser.get(0).getRoles();
        
        if("jobseeker".equals(roles)){
            ResultSet rs = this.Database.GetData("SELECT * from tbjobseeker where ID_AUTH = "+id_auth);            
            rs.next();
            
            userM.setId_jobseeker(rs.getInt("ID_JOBSEEKER"));
            userM.setFullname(rs.getString("FULLNAME"));
            userM.setAddress(rs.getString("ADDRESS"));
            userM.setPhone(rs.getString("PHONENUMBER"));            
            
            arrUser.set(0, userM);
            
        }else if("employeer".equals(roles)){
            ResultSet rs = this.Database.GetData("SELECT * from tbemployeer where ID_AUTH = "+id_auth);            
            rs.next();
            
            userM.setId_employeer(rs.getInt("ID_EMPLOYEER"));
            userM.setFullname(rs.getString("FULLNAME"));
            userM.setAddress(rs.getString("ADDRESS"));
            userM.setPhone(rs.getString("PHONENUMBER"));            
            userM.setCompany(rs.getString("COMPANYNAME"));
            userM.setJobtitle(rs.getString("JOBTITLE"));
            
            arrUser.set(0, userM);
            
        }
        
        return arrUser;
    }
}
