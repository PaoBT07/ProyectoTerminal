/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasesPlanas;

import ConexionBD.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Paola Barrera Tenorio 2192007348
 */


public class LoginUsuarios {
    
//------------------------------------------------------------------------------
    //CAJERA
//------------------------------------------------------------------------------
    public boolean verificarCajera(String usuario, String password) {
        
    Connection con = Conexion.conectar();
    if (con == null) {
        JOptionPane.showMessageDialog(null, "Error en la conexión a la base de datos");
        return false;
    }

    try {
        // Consulta SQL para obtener el idUsuario y U_Rol del usuario autenticado
        String sql = "SELECT u.idUsuario, u.U_Rol FROM usuario u " +
                     "JOIN contraseña c ON u.idUsuario = c.C_IDUsuario " +
                     "WHERE u.U_Correo = ? AND c.C_Contraseña = ?";

        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString(1, usuario);
        stmt.setString(2, password);
        ResultSet rs = stmt.executeQuery();

         
        
        if (rs.next()) {
            String rolUsuario = rs.getString("U_Rol");

            // Verificamos si el usuario tiene el rol "Encargado" y lo bloqueamos
            if ("Encargado".equalsIgnoreCase(rolUsuario)) {
                JOptionPane.showMessageDialog(null, "El Encargado no puede iniciar sesión en este menú");
                return false;
            }

            
            return true; // Usuario válido
        } else {
            JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos.");
        }
        con.close();
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
    }
    return false;
    }

//------------------------------------------------------------------------------
//ENCARGADO
//------------------------------------------------------------------------------
    
    public boolean verificarEncargado(String usuario, String password) {
        
    Connection con = Conexion.conectar();
    if (con == null) {
        JOptionPane.showMessageDialog(null, "Error en la conexión a la base de datos");
        return false;
    }

    try {
        // Consulta SQL para obtener el idUsuario y U_Rol del usuario autenticado
        String sql = "SELECT u.idUsuario, u.U_Rol FROM usuario u " +
                     "JOIN contraseña c ON u.idUsuario = c.C_IDUsuario " +
                     "WHERE u.U_Correo = ? AND c.C_Contraseña = ?";

        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString(1, usuario);
        stmt.setString(2, password);
        ResultSet rs = stmt.executeQuery();

        if (rs.next()) {
            String rolUsuario = rs.getString("U_Rol");

            // Verificamos si el usuario tiene el rol "Encargado" y lo bloqueamos
            if ("Cajera".equalsIgnoreCase(rolUsuario)) {
                JOptionPane.showMessageDialog(null, "Las cajeras no pueden iniciar sesión en este menú");
                return false;
            }

            return true; // Usuario válido
        } else {
            JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos.");
        }
        con.close();
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
    }
    return false;
    }
//------------------------------------------------------------------------------


}
