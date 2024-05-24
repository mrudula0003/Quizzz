/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizzzzzzzz;

import java.sql.*;

/**
 *
 *
 */
public class ConnectionProvider {

   public static Connection getCon() {

      try {
         Class.forName("oracle.jdbc.driver.OracleDriver");
         System.out.println("Driver Loaded");

         Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "mrudu09");
         System.out.println("connection to database created");
         // con.close();
         return con;

      }

      catch (Exception e) {

         return null;
      }

   }
}
