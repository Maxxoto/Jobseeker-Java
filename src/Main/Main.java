/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import View.Lamaranku;
import View.LamarForm;
import View.LoginForm;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hamlet
 */
public class Main {
    public static void main(String[] args) throws SQLException{
    
    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
//            Lamaranku listJob;
//            LamarForm jobjoin;
            LoginForm login;
            try {
                login = new LoginForm();
                login.setVisible(true);
//                listJob = new Lamaranku();
//                listJob.setVisible(true);
//                
//                jobjoin = new LamarForm();
//                jobjoin.setVisible(true);
                    
            }catch (SQLException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    });
    
    }
}
