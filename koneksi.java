/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spk;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Aal
 */
public class koneksi {
    private static Connection mysqlkonek;
    public static Connection konekDb() throws SQLException{
        if(mysqlkonek == null){
            try{
                 String DB ="jdbc:mysql://localhost:3306/spk_karyawan";
                 String user = "root";
                 String pass = "";
                 
                 DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                 mysqlkonek = (com.mysql.jdbc.Connection) DriverManager.getConnection(DB,user,pass);
            }catch(SQLException e){
                 JOptionPane.showMessageDialog(null, e);
            }
        }
         return mysqlkonek;
    }
    
}
