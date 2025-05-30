/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ClasesPlanas;

/**
 *
 * @author Paola Barrera Tenorio 2192007348
 */

import ConexionBD.Conexion;
import java.sql.Connection;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.List;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import static java.awt.print.Printable.NO_SUCH_PAGE;
import static java.awt.print.Printable.PAGE_EXISTS;
import java.awt.print.PrinterException;
import java.io.IOException;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;


public class Cliente extends javax.swing.JPanel implements Printable {

    /**
     * Creates new form Cliente
     */
    public Cliente() {
        initComponents();
        LimpiarCampos();
        Mostrar("ClienteReparto");
        txtArea.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblClientesReparto = new javax.swing.JLabel();
        lblInformacionPersonalCR = new javax.swing.JLabel();
        lblNombreCR = new javax.swing.JLabel();
        lblDireccionCR = new javax.swing.JLabel();
        lblTelefonoCR = new javax.swing.JLabel();
        lblInformacionPedido = new javax.swing.JLabel();
        lblDiasCR = new javax.swing.JLabel();
        cbLunesCR = new javax.swing.JCheckBox();
        cbMartesCR = new javax.swing.JCheckBox();
        cbMiercolesCR = new javax.swing.JCheckBox();
        cbJuevesCR = new javax.swing.JCheckBox();
        cbViernesCR = new javax.swing.JCheckBox();
        cbSabadoCR = new javax.swing.JCheckBox();
        cbDomingoCR = new javax.swing.JCheckBox();
        txtDireccionCR = new javax.swing.JTextField();
        txtNombreCR = new javax.swing.JTextField();
        txtTelefonoCR = new javax.swing.JTextField();
        btnAñadirCR = new javax.swing.JButton();
        btnEliminarCR = new javax.swing.JButton();
        btnActualizarCR = new javax.swing.JButton();
        btnBuscarCR = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaCR = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(247, 226, 201));

        jPanel2.setBackground(new java.awt.Color(196, 151, 109));

        lblClientesReparto.setFont(new java.awt.Font("STLiti", 0, 48)); // NOI18N
        lblClientesReparto.setForeground(new java.awt.Color(255, 255, 255));
        lblClientesReparto.setText("- CLIENTES DE REPARTO -");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(231, 231, 231)
                .addComponent(lblClientesReparto)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblClientesReparto)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        lblInformacionPersonalCR.setFont(new java.awt.Font("Bell MT", 0, 24)); // NOI18N
        lblInformacionPersonalCR.setText("Información personal del cliente");

        lblNombreCR.setFont(new java.awt.Font("Bell MT", 0, 24)); // NOI18N
        lblNombreCR.setText("Nombre");

        lblDireccionCR.setFont(new java.awt.Font("Bell MT", 0, 24)); // NOI18N
        lblDireccionCR.setText("Dirección");

        lblTelefonoCR.setFont(new java.awt.Font("Bell MT", 0, 24)); // NOI18N
        lblTelefonoCR.setText("Teléfono");

        lblInformacionPedido.setFont(new java.awt.Font("Bell MT", 0, 24)); // NOI18N
        lblInformacionPedido.setText("Información relacionada al pedido");

        lblDiasCR.setFont(new java.awt.Font("Bell MT", 0, 24)); // NOI18N
        lblDiasCR.setText("Días de pedido");

        cbLunesCR.setBackground(new java.awt.Color(247, 226, 201));
        cbLunesCR.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        cbLunesCR.setText("Lunes");

        cbMartesCR.setBackground(new java.awt.Color(247, 226, 201));
        cbMartesCR.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        cbMartesCR.setText("Martes");

        cbMiercolesCR.setBackground(new java.awt.Color(247, 226, 201));
        cbMiercolesCR.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        cbMiercolesCR.setText("Miércoles");

        cbJuevesCR.setBackground(new java.awt.Color(247, 226, 201));
        cbJuevesCR.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        cbJuevesCR.setText("Jueves");

        cbViernesCR.setBackground(new java.awt.Color(247, 226, 201));
        cbViernesCR.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        cbViernesCR.setText("Viernes");

        cbSabadoCR.setBackground(new java.awt.Color(247, 226, 201));
        cbSabadoCR.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        cbSabadoCR.setText("Sábado");

        cbDomingoCR.setBackground(new java.awt.Color(247, 226, 201));
        cbDomingoCR.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        cbDomingoCR.setText("Domingo");

        txtDireccionCR.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N

        txtNombreCR.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N

        txtTelefonoCR.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N

        btnAñadirCR.setBackground(new java.awt.Color(196, 151, 109));
        btnAñadirCR.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        btnAñadirCR.setForeground(new java.awt.Color(255, 255, 255));
        btnAñadirCR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Agregar.png"))); // NOI18N
        btnAñadirCR.setText("Añadir ");
        btnAñadirCR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirCRActionPerformed(evt);
            }
        });

        btnEliminarCR.setBackground(new java.awt.Color(196, 151, 109));
        btnEliminarCR.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        btnEliminarCR.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarCR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/borrar.png"))); // NOI18N
        btnEliminarCR.setText("Eliminar ");
        btnEliminarCR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarCRActionPerformed(evt);
            }
        });

        btnActualizarCR.setBackground(new java.awt.Color(196, 151, 109));
        btnActualizarCR.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        btnActualizarCR.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizarCR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Actualizar.png"))); // NOI18N
        btnActualizarCR.setText("Actualizar");
        btnActualizarCR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarCRActionPerformed(evt);
            }
        });

        btnBuscarCR.setBackground(new java.awt.Color(196, 151, 109));
        btnBuscarCR.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        btnBuscarCR.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarCR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Buscar.png"))); // NOI18N
        btnBuscarCR.setText("Buscar ");
        btnBuscarCR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarCRActionPerformed(evt);
            }
        });

        TablaCR.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TablaCR.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID Cliente", "Nombre", "Direccion", "Telefono", "Dias Reparto"
            }
        ));
        TablaCR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaCRMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaCR);

        txtArea.setColumns(20);
        txtArea.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        txtArea.setRows(5);
        txtArea.setText("BUSCAR CLIENTE\nEscriba su nombre y presione el botón buscar \n\nAGREGAR CLIENTE\nLlene todos los campos con su información (forsozamente seleccionar \nal menos un día de reparto) y presione agregar\n\nACTUALIZAR DATOS\nSeleccione el registro en la tabla, modifique el dato y presione el botón editar\n\nELIMINAR CLIENTE\nSeleccione el registro y presione el botón eliminar");
        jScrollPane2.setViewportView(txtArea);

        jButton1.setBackground(new java.awt.Color(196, 151, 109));
        jButton1.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Regreso.png"))); // NOI18N
        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblDiasCR)
                .addGap(18, 18, 18)
                .addComponent(cbLunesCR)
                .addGap(18, 18, 18)
                .addComponent(cbMartesCR)
                .addGap(18, 18, 18)
                .addComponent(cbMiercolesCR)
                .addGap(18, 18, 18)
                .addComponent(cbJuevesCR)
                .addGap(18, 18, 18)
                .addComponent(cbViernesCR)
                .addGap(18, 18, 18)
                .addComponent(cbSabadoCR)
                .addGap(18, 18, 18)
                .addComponent(cbDomingoCR)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(228, 228, 228)
                .addComponent(lblInformacionPersonalCR)
                .addGap(169, 169, 169)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminarCR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBuscarCR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAñadirCR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnActualizarCR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombreCR)
                            .addComponent(lblDireccionCR)
                            .addComponent(lblTelefonoCR))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addComponent(lblInformacionPedido))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtDireccionCR, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtNombreCR, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtTelefonoCR, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 972, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblInformacionPersonalCR)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombreCR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNombreCR))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDireccionCR)
                            .addComponent(txtDireccionCR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTelefonoCR)
                            .addComponent(txtTelefonoCR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnActualizarCR)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAñadirCR)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBuscarCR)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEliminarCR)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1)))
                .addGap(34, 34, 34)
                .addComponent(lblInformacionPedido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDiasCR)
                    .addComponent(cbLunesCR)
                    .addComponent(cbMartesCR)
                    .addComponent(cbMiercolesCR)
                    .addComponent(cbJuevesCR)
                    .addComponent(cbViernesCR)
                    .addComponent(cbSabadoCR)
                    .addComponent(cbDomingoCR))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

//Botón Añadir Cliente
    private void btnAñadirCRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirCRActionPerformed
     AgregarCliente();
    }//GEN-LAST:event_btnAñadirCRActionPerformed
    
//Botón Actualizar Cliente
    private void btnActualizarCRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarCRActionPerformed
    ActualizarCliente();
    }//GEN-LAST:event_btnActualizarCRActionPerformed

//Botón Buscar Cliente
    private void btnBuscarCRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCRActionPerformed
    BuscarCliente();
    }//GEN-LAST:event_btnBuscarCRActionPerformed

//Botón Eliminar Cliente
    private void btnEliminarCRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarCRActionPerformed
        EliminarCliente();
    }//GEN-LAST:event_btnEliminarCRActionPerformed


//------------------------------------------------------------------------------
    //Método para mostrar los datos de la BD en la tabla
//------------------------------------------------------------------------------
    public void Mostrar(String tabla) {
        
    String sql = "SELECT c.idClienteReparto, " +
                 "c.CR_Nombre, " +
                 "c.CR_Direccion, " +
                 "c.CR_Telefono, " +
                 "GROUP_CONCAT(d.DR_Nombre ORDER BY d.idDiasReparto) AS dias_reparto " +
                 "FROM ClienteReparto c " +
                 "JOIN Cliente_DiasReparto cd ON c.idClienteReparto = cd.CDR_IDClienteReparto " +
                 "JOIN DiasReparto d ON cd.CDR_IDDiasReparto = d.idDiasReparto " +
                 "GROUP BY c.idClienteReparto";
    
    Conexion con = new Conexion();
    java.sql.Connection conexion = con.conectar();

    DefaultTableModel model = new DefaultTableModel();
    String[] columnas = {"ID", "Nombre", "Direccion", "Telefono", "Dias Reparto"};
    
    
    for (String columna : columnas) {
        model.addColumn(columna);
    }

    TablaCR.setRowSorter(null);
    TablaCR.setModel(model);

    try (java.sql.Statement st = conexion.createStatement(); ResultSet rs = st.executeQuery(sql)) {
        while (rs.next()) {
            String[] datos = new String[columnas.length];
            for (int i = 0; i < columnas.length; i++) {
                datos[i] = rs.getString(i + 1);
            }
            datos[4] = rs.getString("dias_reparto");
            model.addRow(datos);
        }
        
        // Modificar el ancho de las columnas
        TableColumnModel modeloColumnas = TablaCR.getColumnModel();
        modeloColumnas.getColumn(0).setMaxWidth(50);   // ID
        modeloColumnas.getColumn(1).setPreferredWidth(50); // Nombre Cliente
        modeloColumnas.getColumn(2).setPreferredWidth(200);  // Direccion
        modeloColumnas.getColumn(3).setMinWidth(50); // Telefono
        modeloColumnas.getColumn(4).setMinWidth(50); // Dias Reparto

        
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error en executeQuery: " + e.getMessage());
    } finally {
        try {
            if (conexion != null && !conexion.isClosed()) {
                conexion.close();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al cerrar la conexión: " + ex.getMessage());
        }
    }
}
//------------------------------------------------------------------------------



//------------------------------------------------------------------------------
    //Método para agregar un nuevo cliente
//------------------------------------------------------------------------------

private void AgregarCliente(){

    String nombre = txtNombreCR.getText();
    String direccion = txtDireccionCR.getText();
    String telefono = txtTelefonoCR.getText(); 
    String diasSeleccionados = obtenerDiasSeleccionados();  
    String[] diasArray = diasSeleccionados.split(", "); 

    try {
        Connection con = Conexion.conectar();
        if (con == null) {
            JOptionPane.showMessageDialog(null, "Error de conexión.");
            return;
        }

        // Verificar si el teléfono ya está registrado
        PreparedStatement psCheck = con.prepareStatement(
            "SELECT * FROM clientereparto WHERE CR_Telefono = ?"
        );
        psCheck.setString(1, telefono);
        ResultSet rsCheck = psCheck.executeQuery();

        if (rsCheck.next()) {
            JOptionPane.showMessageDialog(null, "Ya hay un cliente registrado con ese número de teléfono, ingrese otro número de teléfono.");
            con.close();
            return; // Detener el proceso
        }

        // Insertar cliente
        PreparedStatement psCliente = con.prepareStatement(
            "INSERT INTO clientereparto (CR_Nombre, CR_Direccion, CR_Telefono) VALUES (?, ?, ?)",
            Statement.RETURN_GENERATED_KEYS
        );
        psCliente.setString(1, nombre);
        psCliente.setString(2, direccion);
        psCliente.setString(3, telefono);
        psCliente.executeUpdate();
        
        ResultSet rs = psCliente.getGeneratedKeys();
        int idClienteReparto = -1;
        if (rs.next()) {
            idClienteReparto = rs.getInt(1);
        } else {
            throw new SQLException("No se pudo obtener el ID del cliente insertado.");
        }

        // Insertar relación cliente-día
        for (String dia : diasArray) {
            PreparedStatement psDia = con.prepareStatement(
                "SELECT idDiasReparto FROM diasreparto WHERE DR_Nombre = ?"
            );
            psDia.setString(1, dia);
            ResultSet rsDia = psDia.executeQuery();
            if (rsDia.next()) {
                int idDia = rsDia.getInt("idDiasReparto");

                PreparedStatement psRelacion = con.prepareStatement(
                    "INSERT INTO cliente_diasreparto (CDR_IDClienteReparto, CDR_IDDiasReparto) VALUES (?, ?)"
                );
                psRelacion.setInt(1, idClienteReparto);
                psRelacion.setInt(2, idDia);
                psRelacion.executeUpdate();
            }
        }

        JOptionPane.showMessageDialog(null, "Registro guardado");
        Mostrar("clientereparto");
        LimpiarCampos();
        con.close();

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al guardar: " + e.getMessage());
    }
}
//-------------------------------------------------------------------------------


//------------------------------------------------------------------------------
    //Método para actualizar los datos de un cliente
//------------------------------------------------------------------------------

private void ActualizarCliente(){

int fila = TablaCR.getSelectedRow();
    if (fila < 0) {
        JOptionPane.showMessageDialog(null, "Seleccione un registro para actualizar.");
        return;
    }

    int id = Integer.parseInt(TablaCR.getValueAt(fila, 0).toString());
    String nombre = txtNombreCR.getText();
    String direccion = txtDireccionCR.getText(); 
    String telefono = txtTelefonoCR.getText();
    String dias = obtenerDiasSeleccionados(); // Retorna por ejemplo: "Lunes, Martes"
    String[] diasSeleccionados = dias.split(", ");

    try {
        java.sql.Connection con = Conexion.conectar(); 

        // Actualizar datos principales del cliente
        PreparedStatement ps = con.prepareStatement(
            "UPDATE clientereparto SET CR_Nombre=?, CR_Direccion=?, CR_Telefono=? WHERE idClienteReparto = ?"
        );
        ps.setString(1, nombre);
        ps.setString(2, direccion);
        ps.setString(3, telefono);
        ps.setInt(4, id);
        ps.executeUpdate();
        ps.close();

        // Eliminar días anteriores del cliente en la tabla puente
        PreparedStatement deleteDias = con.prepareStatement(
            "DELETE FROM cliente_diasreparto WHERE CDR_IDClienteReparto = ?"
        );
        deleteDias.setInt(1, id);
        deleteDias.executeUpdate();
        deleteDias.close();

        // Insertar los nuevos días seleccionados
        for (String dia : diasSeleccionados) {
            PreparedStatement getIdDia = con.prepareStatement(
                "SELECT idDiasReparto FROM diasReparto WHERE DR_Nombre = ?"
            );
            getIdDia.setString(1, dia.trim());
            ResultSet rs = getIdDia.executeQuery();

            if (rs.next()) {
                int idDia = rs.getInt("idDiasReparto");

                PreparedStatement insertDia = con.prepareStatement(
                    "INSERT INTO cliente_diasreparto (CDR_IDClienteReparto, CDR_IDDiasReparto) VALUES (?, ?)"
                );
                insertDia.setInt(1, id);
                insertDia.setInt(2, idDia);
                insertDia.executeUpdate();
                insertDia.close();
            }

            rs.close();
            getIdDia.close();
        }

        JOptionPane.showMessageDialog(null, "Registro actualizado correctamente.");
        Mostrar("clientereparto");  // Actualiza la JTable
        LimpiarCampos();            // Limpia los campos del formulario
        con.close();

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al guardar: " + e.getMessage());
    }
}
//-------------------------------------------------------------------------------


//------------------------------------------------------------------------------
    //Método para buscar un cliente en la tabla
//------------------------------------------------------------------------------

private void BuscarCliente(){
TableRowSorter<TableModel> sorter = new TableRowSorter<>(TablaCR.getModel());
    TablaCR.setRowSorter(sorter);

    String textoBusqueda = txtNombreCR.getText().trim(); // Asegúrate de tener un JTextField con este nombre

    if (textoBusqueda.isEmpty()) {
        sorter.setRowFilter(null); // Mostrar todos si el campo está vacío
    } else {
        sorter.setRowFilter(RowFilter.regexFilter("(?i)" + textoBusqueda)); // Buscar sin importar mayúsculas
    }
    
    LimpiarCampos();

}
//--------------------------------------------------------------------------------



//------------------------------------------------------------------------------
    //Método para eliminar un cliente de la tabla
//------------------------------------------------------------------------------

private void EliminarCliente(){

int fila = TablaCR.getSelectedRow();

    if (fila == -1) {
        JOptionPane.showMessageDialog(null, "Seleccione un cliente para eliminar.");
        return;
    }

    int id = Integer.parseInt(TablaCR.getValueAt(fila, 0).toString());

    int confirmacion = JOptionPane.showConfirmDialog(
        null, 
        "¿Está seguro de que desea eliminar este cliente?", 
        "Confirmar eliminación", 
        JOptionPane.YES_NO_OPTION
    );

    if (confirmacion != JOptionPane.YES_OPTION) {
        return;
    }

    try {
        java.sql.Connection con = Conexion.conectar();

        // 1. Eliminar primero los registros relacionados en la tabla puente
        PreparedStatement ps = con.prepareStatement("DELETE FROM cliente_diasreparto WHERE CDR_IDClienteReparto=?");
        ps.setInt(1, id);
        ps.executeUpdate();

        // 2. Eliminar el cliente de reparto
        ps = con.prepareStatement("DELETE FROM clientereparto WHERE idClienteReparto=?");
        ps.setInt(1, id);
        ps.executeUpdate();

        JOptionPane.showMessageDialog(null, "Cliente eliminado correctamente.");

        // 3. Actualizar la tabla y limpiar campos
        Mostrar("clientereparto"); // Asegúrate de que este método funcione para esa tabla
        LimpiarCampos();

        con.close();

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al eliminar: " + e.getMessage());
    }
}
//------------------------------------------------------------------------------

    
    
//------------------------------------------------------------------------------
    //Autollenado de la tabla Cliente Reparto
//------------------------------------------------------------------------------
    private void TablaCRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaCRMouseClicked
       try {
        int fila = TablaCR.getSelectedRow();
        int idCliente = Integer.parseInt(TablaCR.getValueAt(fila, 0).toString());

        PreparedStatement ps;
        ResultSet rs;
        Connection con = Conexion.conectar();

        // 1. Obtener los datos del cliente
        ps = con.prepareStatement("SELECT CR_Nombre, CR_Direccion, CR_Telefono FROM clientereparto WHERE idClienteReparto = ?");
        ps.setInt(1, idCliente);
        rs = ps.executeQuery();

        if (rs.next()) {
            txtNombreCR.setText(rs.getString("CR_Nombre"));
            txtDireccionCR.setText(rs.getString("CR_Direccion"));
            txtTelefonoCR.setText(rs.getString("CR_Telefono"));
        }

        // 2. Desmarcar todos los checkboxes
        cbLunesCR.setSelected(false);
        cbMartesCR.setSelected(false);
        cbMiercolesCR.setSelected(false);
        cbJuevesCR.setSelected(false);
        cbViernesCR.setSelected(false);
        cbSabadoCR.setSelected(false);
        cbDomingoCR.setSelected(false);

        // 3. Consultar los días de reparto del cliente desde la tabla puente
        ps = con.prepareStatement(
            "SELECT d.DR_Nombre " +
            "FROM cliente_diasreparto cdr " +
            "JOIN diasreparto d ON cdr.CDR_IDDiasReparto = d.idDiasReparto " +
            "WHERE cdr.CDR_IDClienteReparto = ?"
        );
        ps.setInt(1, idCliente);
        rs = ps.executeQuery();

        // 4. Marcar los checkboxes correspondientes
        while (rs.next()) {
            String dia = rs.getString("DR_Nombre").toLowerCase().trim();
            switch (dia) {
                case "lunes": cbLunesCR.setSelected(true); break;
                case "martes": cbMartesCR.setSelected(true); break;
                case "miércoles":
                case "miercoles": cbMiercolesCR.setSelected(true); break;
                case "jueves": cbJuevesCR.setSelected(true); break;
                case "viernes": cbViernesCR.setSelected(true); break;
                case "sábado":
                case "sabado": cbSabadoCR.setSelected(true); break;
                case "domingo": cbDomingoCR.setSelected(true); break;
            }
        }

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, e);
    }
    }//GEN-LAST:event_TablaCRMouseClicked

//Botón regresar
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Mostrar("ClienteReparto");
    }//GEN-LAST:event_jButton1ActionPerformed
//------------------------------------------------------------------------------


 
//------------------------------------------------------------------------------
    // Método para obtener los días seleccionados en formato de texto
//------------------------------------------------------------------------------
    public String obtenerDiasSeleccionados() {
    StringBuilder dias = new StringBuilder();

    if (cbLunesCR.isSelected()) dias.append("Lunes, ");
    if (cbMartesCR.isSelected()) dias.append("Martes, ");
    if (cbMiercolesCR.isSelected()) dias.append("Miércoles, ");
    if (cbJuevesCR.isSelected()) dias.append("Jueves, ");
    if (cbViernesCR.isSelected()) dias.append("Viernes, ");
    if (cbSabadoCR.isSelected()) dias.append("Sábado, ");
    if (cbDomingoCR.isSelected()) dias.append("Domingo, ");

    if (dias.length() > 0) {
        dias.setLength(dias.length() - 2); // Quita la última coma y espacio
    }

    return dias.toString();
}
//------------------------------------------------------------------------------
    
    
    
//------------------------------------------------------------------------------    
    //Método para limpiar los campos
//------------------------------------------------------------------------------
private void LimpiarCampos(){
    txtNombreCR.setText("");
    txtDireccionCR.setText("");
    txtTelefonoCR.setText("");
    cbLunesCR.setSelected(false);
    cbMartesCR.setSelected(false); 
    cbMiercolesCR.setSelected(false); 
    cbJuevesCR.setSelected(false); 
    cbViernesCR.setSelected(false); 
    cbSabadoCR.setSelected(false); 
    cbDomingoCR.setSelected(false); 

}
//------------------------------------------------------------------------------
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaCR;
    private javax.swing.JButton btnActualizarCR;
    private javax.swing.JButton btnAñadirCR;
    private javax.swing.JButton btnBuscarCR;
    private javax.swing.JButton btnEliminarCR;
    private javax.swing.JCheckBox cbDomingoCR;
    private javax.swing.JCheckBox cbJuevesCR;
    private javax.swing.JCheckBox cbLunesCR;
    private javax.swing.JCheckBox cbMartesCR;
    private javax.swing.JCheckBox cbMiercolesCR;
    private javax.swing.JCheckBox cbSabadoCR;
    private javax.swing.JCheckBox cbViernesCR;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblClientesReparto;
    private javax.swing.JLabel lblDiasCR;
    private javax.swing.JLabel lblDireccionCR;
    private javax.swing.JLabel lblInformacionPedido;
    private javax.swing.JLabel lblInformacionPersonalCR;
    private javax.swing.JLabel lblNombreCR;
    private javax.swing.JLabel lblTelefonoCR;
    private javax.swing.JTextArea txtArea;
    private javax.swing.JTextField txtDireccionCR;
    private javax.swing.JTextField txtNombreCR;
    private javax.swing.JTextField txtTelefonoCR;
    // End of variables declaration//GEN-END:variables

//------------------------------------------------------------------------------
    //Método para imprimir
//------------------------------------------------------------------------------
 public JTable getTablaClientes() {
        return TablaCR;
    }

    @Override
    public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
//------------------------------------------------------------------------------
    
    







