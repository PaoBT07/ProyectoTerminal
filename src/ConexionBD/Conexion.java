/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConexionBD;


import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Paola Barrera Tenorio 2192007348
 */
public class Conexion {
    
    public static Connection con=null;
    
    static String driver="com.mysql.cj.jdbc.Driver";
    static String url="jdbc:mysql://localhost:3306/panaderia_laizcalli?useSSL=false&serverTimezone=UTC";
    static String user="root";
    static String password="Paola1107+";
    
    public static Connection conectar(){
    
     try {
          Class.forName(driver);
            // No es necesario cargar el driver manualmente en MySQL 8+
            con = DriverManager.getConnection(url, user, password);
            System.out.println("Conexion exitosa a la base de datos.");
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error de conexin: " + e.getMessage());
            System.out.println("Error SQL: " + e.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return con;
    }

    
}
