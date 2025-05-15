/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package MAIN;

import ConexionBD.Conexion;
import INTERFACES.ClienteReparto;
import INTERFACES.ConteoPanHorneado;
import INTERFACES.EleccionUsuario;
import INTERFACES.Equipo;
import INTERFACES.Herramientas;
import INTERFACES.Ingredientes;
import INTERFACES.LimpiezaYMantenimiento;
import INTERFACES.ListaPedido;
import INTERFACES.LoginCajera;
import INTERFACES.Portada;
import INTERFACES.LoginEncargado;
import INTERFACES.MaterialesEmpaque;
import INTERFACES.MenuCajera;
import INTERFACES.MenuEncargado;
import INTERFACES.MenuInventario;
import INTERFACES.Mobiliario;
import INTERFACES.NotaRemision;
import INTERFACES.PanBlanco;
import INTERFACES.PanDulce;
import INTERFACES.Perdidas;
import INTERFACES.ReportesVenta;
import com.sun.jdi.connect.spi.Connection;

/**
 *
 * @author Paola Barrera Tenorio 2192007348
 */
public class Proyecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        new Portada().setVisible(true); 
       // new LoginEncargado().setVisible(true);
       // new LoginCajera().setVisible(true);
       // new MenuEncargado().setVisible(true);
       // new MenuCajera().setVisible(true);
       // new EleccionUsuario().setVisible(true);
       // new PanBlanco().setVisible(true);
       // new PanDulce().setVisible(true);
       // new ConteoPanHorneado().setVisible(true);
       // new MenuInventario().setVisible(true);
       // new Ingredientes().setVisible(true);
       // new Equipo().setVisible(true);
       // new Herramientas().setVisible(true);
       // new MaterialesEmpaque().setVisible(true);
       // new LimpiezaYMantenimiento().setVisible(true);
       // new Mobiliario().setVisible(true);
       // new ClienteReparto().setVisible(true);
       // new ReportesVenta().setVisible(true);
       // new ListaPedido().setVisible(true);
       // new NotaRemision().setVisible(true);
       // new Perdidas().setVisible(true);
       
       //Instancia para la conexión con la base de datos
       Conexion conectar = new Conexion();
       conectar.conectar();
       
       
    }
}
