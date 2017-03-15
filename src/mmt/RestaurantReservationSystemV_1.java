/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mmt;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mmahad.bese14seecs
 */
public class RestaurantReservationSystemV_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Welcome to restaurant reservation system");
        
        System.out.println("You have to login to the system before you continue");
        
        System.out.println("");
        
        System.out.println("");
        
        
        
        MysqlCon c1 = new MysqlCon();
        
        
        
        try {
            c1.runSql("Select * from reservation where C_ID = " + "1");
            
        } catch (SQLException ex) {
            Logger.getLogger(RestaurantReservationSystemV_1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
