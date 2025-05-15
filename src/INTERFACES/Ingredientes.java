/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package INTERFACES;

import ConexionBD.Conexion;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Paola Barrera Tenorio 2192007348
 */
public class Ingredientes extends javax.swing.JFrame {

    /**
     * Creates new form Ingredientes
     */
    public Ingredientes() {
        initComponents();
        
        this.setTitle("Panificadora La Izcalli");
        this.setLocationRelativeTo(Ingredientes.this);
        this.setResizable(false);
        
        MostrarIB("ingredientes_basicos");
        MostrarID("ingredientes_decorativos");
        MostrarIE("ingredientes_extras");
        
        LimpiarCamposIB();
        LimpiarCamposID();
        LimpiarCamposIE();
        
        txtArea.setEditable(false);
        txtArea2.setEditable(false);
        txtArea3.setEditable(false);
        
        TxtFields();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        lblIngredientesBasicos = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        btnRegresarIB = new javax.swing.JButton();
        lblNombreIB = new javax.swing.JLabel();
        lblUnidadMedidaIB = new javax.swing.JLabel();
        lblCantidadIB = new javax.swing.JLabel();
        lblFechaIngresoIB = new javax.swing.JLabel();
        txtNombreIB = new javax.swing.JTextField();
        txtUnidadMedidaIB = new javax.swing.JTextField();
        txtCantidadIB = new javax.swing.JTextField();
        txtFechaIngresoIB = new javax.swing.JTextField();
        btnBuscarIB = new javax.swing.JButton();
        btnAgregarIB = new javax.swing.JButton();
        btnActualizarIB = new javax.swing.JButton();
        btnEliminarIB = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaIngredientesBasicos = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        btnRegresoIB = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        lblIngredientesExtras = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        btnRegresarIE = new javax.swing.JButton();
        lblNombreIE = new javax.swing.JLabel();
        lblUnidadMedidaIE = new javax.swing.JLabel();
        lblCantidadIE = new javax.swing.JLabel();
        lblFechaIngresoIE = new javax.swing.JLabel();
        txtNombreIE = new javax.swing.JTextField();
        txtCantidadIE = new javax.swing.JTextField();
        txtUnidadMedidaIE = new javax.swing.JTextField();
        txtFechaIngresoIE = new javax.swing.JTextField();
        btnBuscarIE = new javax.swing.JButton();
        btnAgregarIE = new javax.swing.JButton();
        btnActualizarIE = new javax.swing.JButton();
        btnEliminarIE = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaIE = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtArea2 = new javax.swing.JTextArea();
        btnRegresoIE = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        lblIngredientesDecorativos = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        btnRegresarID = new javax.swing.JButton();
        lblNombreID = new javax.swing.JLabel();
        lblUnidadMedidaID = new javax.swing.JLabel();
        lblCantidadID = new javax.swing.JLabel();
        lblFechaIngresoID = new javax.swing.JLabel();
        txtNombreID = new javax.swing.JTextField();
        txtCantidadID = new javax.swing.JTextField();
        txtUnidadMedidaID = new javax.swing.JTextField();
        txtFechaIngresoID = new javax.swing.JTextField();
        btnBuscarID = new javax.swing.JButton();
        btnAgregarID = new javax.swing.JButton();
        btnActualizarID = new javax.swing.JButton();
        btnEliminarID = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        TablaID = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtArea3 = new javax.swing.JTextArea();
        btnRegresoID = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setBackground(new java.awt.Color(1, 87, 155));
        jTabbedPane1.setForeground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 245, 225));

        jPanel4.setBackground(new java.awt.Color(1, 87, 155));

        lblIngredientesBasicos.setFont(new java.awt.Font("STLiti", 0, 48)); // NOI18N
        lblIngredientesBasicos.setForeground(new java.awt.Color(255, 255, 255));
        lblIngredientesBasicos.setText("- Ingredientes Basicos -");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(318, 318, 318)
                .addComponent(lblIngredientesBasicos)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblIngredientesBasicos)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(1, 87, 155));

        btnRegresarIB.setBackground(new java.awt.Color(255, 245, 225));
        btnRegresarIB.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        btnRegresarIB.setText("Regresar al menú");
        btnRegresarIB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarIBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(btnRegresarIB)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addComponent(btnRegresarIB)
                .addGap(34, 34, 34))
        );

        lblNombreIB.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        lblNombreIB.setText("Nombre");

        lblUnidadMedidaIB.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        lblUnidadMedidaIB.setText("Unidad de medida");

        lblCantidadIB.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        lblCantidadIB.setText("Cantidad");

        lblFechaIngresoIB.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        lblFechaIngresoIB.setText("Fecha de ingreso");

        txtNombreIB.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N

        txtUnidadMedidaIB.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N

        txtCantidadIB.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N

        txtFechaIngresoIB.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N

        btnBuscarIB.setBackground(new java.awt.Color(1, 87, 155));
        btnBuscarIB.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        btnBuscarIB.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarIB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Buscar.png"))); // NOI18N
        btnBuscarIB.setText("Buscar");
        btnBuscarIB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarIBActionPerformed(evt);
            }
        });

        btnAgregarIB.setBackground(new java.awt.Color(1, 87, 155));
        btnAgregarIB.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        btnAgregarIB.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarIB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Agregar.png"))); // NOI18N
        btnAgregarIB.setText("Agregar");
        btnAgregarIB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarIBActionPerformed(evt);
            }
        });

        btnActualizarIB.setBackground(new java.awt.Color(1, 87, 155));
        btnActualizarIB.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        btnActualizarIB.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizarIB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Actualizar.png"))); // NOI18N
        btnActualizarIB.setText("Actualizar");
        btnActualizarIB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarIBActionPerformed(evt);
            }
        });

        btnEliminarIB.setBackground(new java.awt.Color(1, 87, 155));
        btnEliminarIB.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        btnEliminarIB.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarIB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/borrar.png"))); // NOI18N
        btnEliminarIB.setText("Eliminar");
        btnEliminarIB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarIBActionPerformed(evt);
            }
        });

        TablaIngredientesBasicos.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        TablaIngredientesBasicos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        TablaIngredientesBasicos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaIngredientesBasicosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaIngredientesBasicos);

        jScrollPane4.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N

        txtArea.setBackground(new java.awt.Color(255, 245, 225));
        txtArea.setColumns(20);
        txtArea.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        txtArea.setRows(5);
        txtArea.setText("BUSCAR INGREDIENTE\nEscriba su nombre y presione el botón buscar \n\nAGREGAR INGREDIENTE\nLlene todos los campos con su información\n\nACTUALIZAR DATOS DEL INGREDIENTE\nSeleccione el registro en la tabla, modifique el dato y presione el botón actualizar\n\nELIMINAR INGREDIENTE\nSeleccione el registro y presione el botón eliminar");
        txtArea.setBorder(null);
        txtArea.setCaretColor(new java.awt.Color(255, 245, 225));
        txtArea.setDisabledTextColor(new java.awt.Color(255, 245, 225));
        txtArea.setSelectionColor(new java.awt.Color(255, 245, 225));
        jScrollPane4.setViewportView(txtArea);

        btnRegresoIB.setBackground(new java.awt.Color(1, 87, 155));
        btnRegresoIB.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        btnRegresoIB.setForeground(new java.awt.Color(255, 255, 255));
        btnRegresoIB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Regreso.png"))); // NOI18N
        btnRegresoIB.setText("Regresar");
        btnRegresoIB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresoIBActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("Formato de fecha: 2025-05-09");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 975, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(226, 226, 226)
                                .addComponent(jLabel1)
                                .addGap(184, 184, 184))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(181, 181, 181)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(lblUnidadMedidaIB)
                                                        .addComponent(lblCantidadIB))
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(lblNombreIB)
                                                    .addGap(85, 85, 85)))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(lblFechaIngresoIB)
                                                .addGap(15, 15, 15)))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txtFechaIngresoIB)
                                            .addComponent(txtNombreIB, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtCantidadIB, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtUnidadMedidaIB, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(140, 140, 140)
                                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(56, 56, 56)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRegresoIB)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnAgregarIB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnActualizarIB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnEliminarIB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnBuscarIB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombreIB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNombreIB))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCantidadIB, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCantidadIB)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(btnActualizarIB)
                        .addGap(18, 18, 18)
                        .addComponent(btnAgregarIB, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscarIB)))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtUnidadMedidaIB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblUnidadMedidaIB))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFechaIngresoIB)
                            .addComponent(txtFechaIngresoIB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnEliminarIB))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addGap(18, 65, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRegresoIB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("Básicos", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 245, 225));

        jPanel6.setBackground(new java.awt.Color(1, 87, 155));

        lblIngredientesExtras.setFont(new java.awt.Font("STLiti", 0, 48)); // NOI18N
        lblIngredientesExtras.setForeground(new java.awt.Color(255, 255, 255));
        lblIngredientesExtras.setText("- Ingredientes Extras -");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(302, 302, 302)
                .addComponent(lblIngredientesExtras)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblIngredientesExtras)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(1, 87, 155));

        btnRegresarIE.setBackground(new java.awt.Color(255, 245, 225));
        btnRegresarIE.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        btnRegresarIE.setText("Regresar al menú");
        btnRegresarIE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarIEActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(btnRegresarIE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addComponent(btnRegresarIE)
                .addGap(35, 35, 35))
        );

        lblNombreIE.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        lblNombreIE.setText("Nombre ");

        lblUnidadMedidaIE.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        lblUnidadMedidaIE.setText("Unidad de medida ");

        lblCantidadIE.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        lblCantidadIE.setText("Cantidad");

        lblFechaIngresoIE.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        lblFechaIngresoIE.setText("Fecha de ingreso");

        txtNombreIE.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N

        txtCantidadIE.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N

        txtUnidadMedidaIE.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N

        txtFechaIngresoIE.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N

        btnBuscarIE.setBackground(new java.awt.Color(1, 87, 155));
        btnBuscarIE.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        btnBuscarIE.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarIE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Buscar.png"))); // NOI18N
        btnBuscarIE.setText("Buscar");
        btnBuscarIE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarIEActionPerformed(evt);
            }
        });

        btnAgregarIE.setBackground(new java.awt.Color(1, 87, 155));
        btnAgregarIE.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        btnAgregarIE.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarIE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Agregar.png"))); // NOI18N
        btnAgregarIE.setText("Agregar");
        btnAgregarIE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarIEActionPerformed(evt);
            }
        });

        btnActualizarIE.setBackground(new java.awt.Color(1, 87, 155));
        btnActualizarIE.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        btnActualizarIE.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizarIE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Actualizar.png"))); // NOI18N
        btnActualizarIE.setText("Actualizar");
        btnActualizarIE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarIEActionPerformed(evt);
            }
        });

        btnEliminarIE.setBackground(new java.awt.Color(1, 87, 155));
        btnEliminarIE.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        btnEliminarIE.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarIE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/borrar.png"))); // NOI18N
        btnEliminarIE.setText("Eliminar");
        btnEliminarIE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarIEActionPerformed(evt);
            }
        });

        TablaIE.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        TablaIE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        TablaIE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaIEMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TablaIE);

        jScrollPane5.setPreferredSize(new java.awt.Dimension(437, 176));

        txtArea2.setBackground(new java.awt.Color(255, 245, 225));
        txtArea2.setColumns(20);
        txtArea2.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        txtArea2.setRows(5);
        txtArea2.setText("BUSCAR INGREDIENTE\nEscriba su nombre y presione el botón buscar \n\nAGREGAR INGREDIENTE\nLlene todos los campos con su información\n\nACTUALIZAR DATOS DEL INGREDIENTE\nSeleccione el registro en la tabla, modifique el dato y presione el botón actualizar\n\nELIMINAR INGREDIENTE\nSeleccione el registro y presione el botón eliminar");
        jScrollPane5.setViewportView(txtArea2);

        btnRegresoIE.setBackground(new java.awt.Color(1, 87, 155));
        btnRegresoIE.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        btnRegresoIE.setForeground(new java.awt.Color(255, 255, 255));
        btnRegresoIE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Regreso.png"))); // NOI18N
        btnRegresoIE.setText("Regresar");
        btnRegresoIE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresoIEActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Formato de fecha: 2025-05-09");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(186, 186, 186)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(lblUnidadMedidaIE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtUnidadMedidaIE, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(lblFechaIngresoIE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtFechaIngresoIE, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(lblCantidadIE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtCantidadIE, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(lblNombreIE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtNombreIE, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(114, 114, 114)
                                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(69, 69, 69))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(155, 155, 155)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnActualizarIE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAgregarIE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBuscarIE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEliminarIE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRegresoIE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 984, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNombreIE)
                            .addComponent(txtNombreIE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCantidadIE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCantidadIE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtUnidadMedidaIE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblUnidadMedidaIE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnActualizarIE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAgregarIE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscarIE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminarIE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFechaIngresoIE)
                            .addComponent(txtFechaIngresoIE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))
                    .addComponent(btnRegresoIE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("Extras", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 245, 225));

        jPanel8.setBackground(new java.awt.Color(1, 87, 155));

        lblIngredientesDecorativos.setFont(new java.awt.Font("STLiti", 0, 48)); // NOI18N
        lblIngredientesDecorativos.setForeground(new java.awt.Color(255, 255, 255));
        lblIngredientesDecorativos.setText("- Ingredientes Decorativos -");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(271, 271, 271)
                .addComponent(lblIngredientesDecorativos)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lblIngredientesDecorativos)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel9.setBackground(new java.awt.Color(1, 87, 155));

        btnRegresarID.setBackground(new java.awt.Color(255, 245, 225));
        btnRegresarID.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        btnRegresarID.setText("Regresar al menú");
        btnRegresarID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarIDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(btnRegresarID)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(btnRegresarID)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        lblNombreID.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        lblNombreID.setText("Nombre");

        lblUnidadMedidaID.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        lblUnidadMedidaID.setText("Unidad de medida");

        lblCantidadID.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        lblCantidadID.setText("Cantidad");

        lblFechaIngresoID.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        lblFechaIngresoID.setText("Fecha de ingreso");

        txtNombreID.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N

        txtCantidadID.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N

        txtUnidadMedidaID.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N

        txtFechaIngresoID.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N

        btnBuscarID.setBackground(new java.awt.Color(1, 87, 155));
        btnBuscarID.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        btnBuscarID.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarID.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Buscar.png"))); // NOI18N
        btnBuscarID.setText("Buscar");
        btnBuscarID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarIDActionPerformed(evt);
            }
        });

        btnAgregarID.setBackground(new java.awt.Color(1, 87, 155));
        btnAgregarID.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        btnAgregarID.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarID.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Agregar.png"))); // NOI18N
        btnAgregarID.setText("Agregar");
        btnAgregarID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarIDActionPerformed(evt);
            }
        });

        btnActualizarID.setBackground(new java.awt.Color(1, 87, 155));
        btnActualizarID.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        btnActualizarID.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizarID.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Actualizar.png"))); // NOI18N
        btnActualizarID.setText("Actualizar");
        btnActualizarID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarIDActionPerformed(evt);
            }
        });

        btnEliminarID.setBackground(new java.awt.Color(1, 87, 155));
        btnEliminarID.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        btnEliminarID.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarID.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/borrar.png"))); // NOI18N
        btnEliminarID.setText("Eliminar");
        btnEliminarID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarIDActionPerformed(evt);
            }
        });

        TablaID.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        TablaID.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        TablaID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaIDMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(TablaID);

        txtArea3.setBackground(new java.awt.Color(255, 245, 225));
        txtArea3.setColumns(20);
        txtArea3.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        txtArea3.setRows(5);
        txtArea3.setText("BUSCAR INGREDIENTE\nEscriba su nombre y presione el botón buscar \n\nAGREGAR INGREDIENTE\nLlene todos los campos con su información\n\nACTUALIZAR DATOS DEL INGREDIENTE\nSeleccione el registro en la tabla, modifique el dato y presione el botón actualizar\n\nELIMINAR INGREDIENTE\nSeleccione el registro y presione el botón eliminar");
        jScrollPane6.setViewportView(txtArea3);

        btnRegresoID.setBackground(new java.awt.Color(1, 87, 155));
        btnRegresoID.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        btnRegresoID.setForeground(new java.awt.Color(255, 255, 255));
        btnRegresoID.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Regreso.png"))); // NOI18N
        btnRegresoID.setText("Regresar");
        btnRegresoID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresoIDActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("Formato de fecha: 2025-05-09");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(185, 185, 185)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(lblUnidadMedidaID)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtUnidadMedidaID, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(lblFechaIngresoID)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtFechaIngresoID, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblCantidadID)
                                            .addComponent(lblNombreID))
                                        .addGap(74, 74, 74)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtNombreID, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtCantidadID, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(150, 150, 150))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3)
                                .addGap(187, 187, 187)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnRegresoID)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnEliminarID, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnBuscarID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(5, 5, 5))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAgregarID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnActualizarID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 979, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnActualizarID)
                        .addGap(18, 18, 18)
                        .addComponent(btnAgregarID)
                        .addGap(20, 20, 20)
                        .addComponent(btnBuscarID)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminarID)
                        .addGap(18, 18, 18)
                        .addComponent(btnRegresoID))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNombreID)
                            .addComponent(txtNombreID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCantidadID)
                            .addComponent(txtCantidadID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblUnidadMedidaID)
                            .addComponent(txtUnidadMedidaID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFechaIngresoID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFechaIngresoID))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Decorativos", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

//Botón Agregar Ingredientes Extras
    private void btnAgregarIEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarIEActionPerformed
    AgregarIE();
    }//GEN-LAST:event_btnAgregarIEActionPerformed

    
//-----------------------------------------------------------------------------
    //ACCIONES PARA LOS BOTONES DE REGRESO
//------------------------------------------------------------------------------
    private void btnRegresarIBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarIBActionPerformed
        MenuInventario inventario = new MenuInventario();
        inventario.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnRegresarIBActionPerformed

    private void btnRegresarIEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarIEActionPerformed
        MenuInventario inventario = new MenuInventario();
        inventario.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnRegresarIEActionPerformed

    private void btnRegresarIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarIDActionPerformed
        MenuInventario inventario = new MenuInventario();
        inventario.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnRegresarIDActionPerformed
//------------------------------------------------------------------------------
    
    
//Botón Agregar Ingredientes Basicos
    private void btnAgregarIBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarIBActionPerformed
       AgregarIB();
    }//GEN-LAST:event_btnAgregarIBActionPerformed
   
//Botón Agregar Ingredientes Decorativos
    private void btnAgregarIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarIDActionPerformed
       AgregarID();
    }//GEN-LAST:event_btnAgregarIDActionPerformed

    
    
//------------------------------------------------------------------------------
    //Autollenado de los campos al seleccionar un registro INGREDIENTES BASICOS
//------------------------------------------------------------------------------    
    private void TablaIngredientesBasicosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaIngredientesBasicosMouseClicked
        try{
            int fila = TablaIngredientesBasicos.getSelectedRow();
            int id = Integer.parseInt(TablaIngredientesBasicos.getValueAt(fila, 0).toString());
            
            PreparedStatement ps;
            ResultSet rs;
            
            java.sql.Connection con =  Conexion.conectar();
            ps = con.prepareStatement("SELECT IB_Nombre, IB_UnidadMedida, IB_Cantidad, IB_FechaIngreso FROM ingredientes_basicos WHERE idIngredientes=?");
            ps.setInt(1, id);
            rs = ps.executeQuery();
            
            while(rs.next()){
            txtNombreIB.setText(rs.getString("IB_Nombre"));
            txtUnidadMedidaIB.setText(rs.getString("IB_UnidadMedida"));
            txtCantidadIB.setText(rs.getString("IB_Cantidad"));
            txtFechaIngresoIB.setText(rs.getString("IB_FechaIngreso"));
            }
       
       }catch(SQLException e){
           JOptionPane.showMessageDialog(null, e);
       }
        
    }//GEN-LAST:event_TablaIngredientesBasicosMouseClicked
//------------------------------------------------------------------------------
    
    
//------------------------------------------------------------------------------
    //Autollenado de los campos al seleccionar un registro INGREDIENTES EXTRAS
//------------------------------------------------------------------------------    
    private void TablaIEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaIEMouseClicked
        try{
            int fila = TablaIE.getSelectedRow();
            int id = Integer.parseInt(TablaIE.getValueAt(fila, 0).toString());
            
            PreparedStatement ps;
            ResultSet rs;
            
            java.sql.Connection con =  Conexion.conectar();
            ps = con.prepareStatement("SELECT IE_Nombre, IE_UnidadMedida, IE_Cantidad, IE_FechaIngreso FROM ingredientes_extras WHERE idIngredientes_extras=?");
            ps.setInt(1, id);
            rs = ps.executeQuery();
            
            while(rs.next()){
            txtNombreIE.setText(rs.getString("IE_Nombre"));
            txtUnidadMedidaIE.setText(rs.getString("IE_UnidadMedida"));
            txtCantidadIE.setText(rs.getString("IE_Cantidad"));
            txtFechaIngresoIE.setText(rs.getString("IE_FechaIngreso"));
            }
       
       }catch(SQLException e){
           JOptionPane.showMessageDialog(null, e);
       }
    }//GEN-LAST:event_TablaIEMouseClicked
//------------------------------------------------------------------------------
    
    
//------------------------------------------------------------------------------
    //Autollenado de los campos al seleccionar un registro INGREDIENTES DECORATIVOS
//------------------------------------------------------------------------------   
    private void TablaIDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaIDMouseClicked
        try{
            int fila = TablaID.getSelectedRow();
            int id = Integer.parseInt(TablaID.getValueAt(fila, 0).toString());
            
            PreparedStatement ps;
            ResultSet rs;
            
            java.sql.Connection con =  Conexion.conectar();
            ps = con.prepareStatement("SELECT ID_Nombre, ID_UnidadMedida, ID_Cantidad, ID_FechaIngreso FROM ingredientes_decorativos WHERE idIngredientes_Decorativos=?");
            ps.setInt(1, id);
            rs = ps.executeQuery();
            
            while(rs.next()){
            txtNombreID.setText(rs.getString("ID_Nombre"));
            txtUnidadMedidaID.setText(rs.getString("ID_UnidadMedida"));
            txtCantidadID.setText(rs.getString("ID_Cantidad"));
            txtFechaIngresoID.setText(rs.getString("ID_FechaIngreso"));
            }
       
       }catch(SQLException e){
           JOptionPane.showMessageDialog(null, e);
       }
    }//GEN-LAST:event_TablaIDMouseClicked
//------------------------------------------------------------------------------
    
    
////Botón Actualizar Ingredientes Decorativos
    private void btnActualizarIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarIDActionPerformed
        ActualizarID();
    }//GEN-LAST:event_btnActualizarIDActionPerformed

//Botón Actualizar Ingredientes Extras
    private void btnActualizarIEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarIEActionPerformed
        ActualizarIE();
    }//GEN-LAST:event_btnActualizarIEActionPerformed

//Botón Actualizar Ingredientes Basicos
    private void btnActualizarIBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarIBActionPerformed
        ActualizarIB();
    }//GEN-LAST:event_btnActualizarIBActionPerformed

//Botón Eliminar Ingredientes Basicos
    private void btnEliminarIBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarIBActionPerformed
        EliminarIB();
    }//GEN-LAST:event_btnEliminarIBActionPerformed

//Botón Eliminar Ingredientes Extras
    private void btnEliminarIEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarIEActionPerformed
        EliminarIE();
    }//GEN-LAST:event_btnEliminarIEActionPerformed

//Botón Eliminar Ingredientes Decorativos
    private void btnEliminarIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarIDActionPerformed
     EliminarID();
    }//GEN-LAST:event_btnEliminarIDActionPerformed

//Botón Buscar Ingredientes Basicos
    private void btnBuscarIBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarIBActionPerformed
        BuscarIB();
    }//GEN-LAST:event_btnBuscarIBActionPerformed
    
//Botón Buscar Ingredientes Extras
    private void btnBuscarIEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarIEActionPerformed
        BuscarIE();
    }//GEN-LAST:event_btnBuscarIEActionPerformed
  
//Botón Buscar Ingredientes Decorativos
    private void btnBuscarIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarIDActionPerformed
        BuscarID();
    }//GEN-LAST:event_btnBuscarIDActionPerformed

    private void btnRegresoIBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresoIBActionPerformed
        LimpiarCamposIB();
        MostrarIB("ingredientes_basicos");
    }//GEN-LAST:event_btnRegresoIBActionPerformed

    private void btnRegresoIEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresoIEActionPerformed
        LimpiarCamposIE();
        MostrarIE("ingredientes_extras");
    }//GEN-LAST:event_btnRegresoIEActionPerformed

    private void btnRegresoIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresoIDActionPerformed
        LimpiarCamposID();
        MostrarID("ingredientes_decorativos");
    }//GEN-LAST:event_btnRegresoIDActionPerformed

    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ingredientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ingredientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ingredientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ingredientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ingredientes().setVisible(true);
            }
        });
    }
    
    
//*****************************************************************************************************
    //INGREDIENTES BASICOS
//*****************************************************************************************************
    
    
//------------------------------------------------------------------------------
    //Método para mostrar los registros en la tabla INGREDIENTES BASICOS
//------------------------------------------------------------------------------
    public void MostrarIB(String tabla) {
    String sql = "SELECT * FROM " + tabla;
    Conexion con = new Conexion();
    java.sql.Connection conexion = con.conectar();

    DefaultTableModel model = new DefaultTableModel();
    String[] columnas = {"ID", "Nombre", "Unidad de Medida", "Cantidad", "Fecha de Ingreso"};
    
    
    for (String columna : columnas) {
        model.addColumn(columna);
    }

    TablaIngredientesBasicos.setRowSorter(null);
    TablaIngredientesBasicos.setModel(model);

    try (java.sql.Statement st = conexion.createStatement(); ResultSet rs = st.executeQuery(sql)) {
        while (rs.next()) {
            String[] datos = new String[columnas.length];
            for (int i = 0; i < columnas.length; i++) {
                datos[i] = rs.getString(i + 1);
            }
          
            model.addRow(datos);
        }
        
        // Modificar el ancho de las columnas
        TableColumnModel modeloColumnas = TablaIngredientesBasicos.getColumnModel();
        modeloColumnas.getColumn(0).setPreferredWidth(1);  // ID
        modeloColumnas.getColumn(1).setPreferredWidth(10); // Nombre
        modeloColumnas.getColumn(2).setPreferredWidth(10); // Unidad de medida
        modeloColumnas.getColumn(3).setPreferredWidth(10); // Cantidad
        modeloColumnas.getColumn(4).setPreferredWidth(30); // Fecha de ingreso
        
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
    //Método para agregar registros a la tabla INGREDIENTES BASICOS
//------------------------------------------------------------------------------

private void AgregarIB(){

String nombreIB = txtNombreIB.getText();
    String unidadMedidaIB = txtUnidadMedidaIB.getText();
    int cantidadIB = Integer.parseInt(txtCantidadIB.getText()); 
    Date fechaIngresoIB = parseDate(txtFechaIngresoIB.getText()); 
    
    if (fechaIngresoIB == null) {
        // Usar la fecha actual si es inválida
        fechaIngresoIB = new Date(); 
        JOptionPane.showMessageDialog(null, "Fecha inválida. Se usará la fecha actual.");
    }

    
    java.sql.Date fechaSQL = new java.sql.Date(fechaIngresoIB.getTime()); 
    
  
    try {
        java.sql.Connection con =  Conexion.conectar(); 
        PreparedStatement ps = con.prepareStatement("INSERT INTO ingredientes_basicos (IB_Nombre, IB_UnidadMedida, IB_Cantidad, IB_FechaIngreso) VALUES (?,?,?,?)");

        ps.setString(1, nombreIB);
        ps.setString(2, unidadMedidaIB);
        ps.setInt(3, cantidadIB);
        ps.setDate(4, fechaSQL);
         
        ps.executeUpdate();
        JOptionPane.showMessageDialog(null, "Registro guardado");
        
        //Actualizar la tabla para que aparezca el registro nuevo
        MostrarIB("ingredientes_basicos");
        
        //Después de guardar el registro limpiar los campos 
        LimpiarCamposIB();
        
        con.close(); // Cierra la conexión

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al guardar: " + e.getMessage());
    }

}
//-----------------------------------------------------------------------------



//------------------------------------------------------------------------------
    //Método de actualizar los registros de la tabla INGREDIENTES BASICOS
//------------------------------------------------------------------------------

private void ActualizarIB(){

int fila = TablaIngredientesBasicos.getSelectedRow();
    int id = Integer.parseInt(TablaIngredientesBasicos.getValueAt(fila, 0).toString()); 
    String nombreIB = txtNombreIB.getText();
    String unidadMedidaIB = txtUnidadMedidaIB.getText();
    int cantidadIB = Integer.parseInt(txtCantidadIB.getText()); 
    Date fechaIngresoIB = parseDate(txtFechaIngresoIB.getText()); 
    
    if (fechaIngresoIB == null) {
        JOptionPane.showMessageDialog(null, "Fecha inválida. Ingrese en formato yyyy-MM-dd.");
        return; // Sale del método si la fecha es inválida
    }
    
    java.sql.Date fechaSQL = new java.sql.Date(fechaIngresoIB.getTime()); 
    
  
    try {
        java.sql.Connection con =  Conexion.conectar(); 
        PreparedStatement ps = con.prepareStatement("UPDATE ingredientes_basicos SET IB_Nombre=?, IB_UnidadMedida=?, IB_Cantidad=?, IB_FechaIngreso=? WHERE idIngredientes=?");

        ps.setString(1, nombreIB);
        ps.setString(2, unidadMedidaIB);
        ps.setInt(3, cantidadIB);
        ps.setDate(4, fechaSQL);
        ps.setInt(5, id);
         
        ps.executeUpdate();
        JOptionPane.showMessageDialog(null, "Registro actualizado");
        
        //Actualizar la tabla para que aparezca el registro nuevo
        MostrarIB("ingredientes_basicos");
        
        //Después de guardar el registro limpiar los campos 
        LimpiarCamposIB();
        
        con.close(); // Cierra la conexión

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al guardar: " + e.getMessage());
    }

}
//------------------------------------------------------------------------------



//------------------------------------------------------------------------------
    //Método para eliminar un registro de la tabla INGREDIENTES BASICOS 
//------------------------------------------------------------------------------ 

private void EliminarIB(){

int fila = TablaIngredientesBasicos.getSelectedRow();
    int id = Integer.parseInt(TablaIngredientesBasicos.getValueAt(fila, 0).toString()); 
    
    try {
        java.sql.Connection con =  Conexion.conectar(); 
        PreparedStatement ps = con.prepareStatement("DELETE FROM ingredientes_basicos WHERE idIngredientes=?");

        ps.setInt(1, id);
         
        ps.executeUpdate();
        JOptionPane.showMessageDialog(null, "Registro eliminado");
        
        //Actualizar la tabla para que aparezca el registro nuevo
        MostrarIB("ingredientes_basicos");
        
        //Después de guardar el registro limpiar los campos 
        LimpiarCamposIB();
        
        con.close(); // Cierra la conexión

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al guardar: " + e.getMessage());
    }

}
//------------------------------------------------------------------------------



//------------------------------------------------------------------------------
    //Método para buscar un registro de la tabla INGREDIENTES BASICOS
//------------------------------------------------------------------------------

private void BuscarIB(){

TableRowSorter<TableModel> sorter = new TableRowSorter<>(TablaIngredientesBasicos.getModel());
    TablaIngredientesBasicos.setRowSorter(sorter);
    
    String textoBusqueda = txtNombreIB.getText().trim();
    
    if (textoBusqueda.isEmpty()) {
        sorter.setRowFilter(null); // Muestra todos los registros si el campo está vacío
    } else {
        sorter.setRowFilter(RowFilter.regexFilter("(?i)" + textoBusqueda)); // Filtra ignorando mayúsculas/minúsculas
    }

    LimpiarCamposIB();
}
//------------------------------------------------------------------------------


//------------------------------------------------------------------------------
    //Método para limpiar los campos INGREDIENTES BASICOS
//------------------------------------------------------------------------------    
private void LimpiarCamposIB(){

        txtNombreIB.setText("");
        txtUnidadMedidaIB.setText("");
        txtCantidadIB.setText("");
        txtFechaIngresoIB.setText("");
}
//------------------------------------------------------------------------------
    
//*****************************************************************************************************
    
    
    
    
    
//*****************************************************************************************************
    //INGREDIENTES DECORATIVOS
//*****************************************************************************************************
    
    
//------------------------------------------------------------------------------
    //Método para mostrar los registros en la tabla INGREDIENTES DECORATIVOS
//------------------------------------------------------------------------------
    public void MostrarID(String tabla) {
    String sql = "SELECT * FROM " + tabla;
    Conexion con = new Conexion();
    java.sql.Connection conexion = con.conectar();

    DefaultTableModel model = new DefaultTableModel();
    String[] columnas = {"ID", "Nombre", "Unidad de Medida", "Cantidad", "Fecha de Ingreso"};
    
    
    for (String columna : columnas) {
        model.addColumn(columna);
    }

    TablaID.setRowSorter(null);
    TablaID.setModel(model);

    try (java.sql.Statement st = conexion.createStatement(); ResultSet rs = st.executeQuery(sql)) {
        while (rs.next()) {
            String[] datos = new String[columnas.length];
            for (int i = 0; i < columnas.length; i++) {
                datos[i] = rs.getString(i + 1);
            }
          
            model.addRow(datos);
        }
        
        // Modificar el ancho de las columnas
        TableColumnModel modeloColumnas = TablaID.getColumnModel();
        modeloColumnas.getColumn(0).setPreferredWidth(1);  // ID
        modeloColumnas.getColumn(1).setPreferredWidth(10); // Nombre
        modeloColumnas.getColumn(2).setPreferredWidth(10); // Unidad de medida
        modeloColumnas.getColumn(3).setPreferredWidth(10); // Cantidad
        modeloColumnas.getColumn(4).setPreferredWidth(30); // Fecha de ingreso
        
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
    //Método para agregar registros a la tabla INGREDIENTES DECORATIVOS
//------------------------------------------------------------------------------ 

private void AgregarID(){

 String nombreID= txtNombreID.getText();
    String unidadMedidaID = txtUnidadMedidaID.getText();
    int cantidadID = Integer.parseInt(txtCantidadID.getText()); 
    Date fechaIngresoID = parseDate(txtFechaIngresoID.getText()); 
    
    if (fechaIngresoID == null) {
        // Usar la fecha actual si es inválida
        fechaIngresoID = new Date(); 
        JOptionPane.showMessageDialog(null, "Fecha inválida. Se usará la fecha actual.");
    }

    
    java.sql.Date fechaSQL = new java.sql.Date(fechaIngresoID.getTime()); 
    
  
    try {
        java.sql.Connection con =  Conexion.conectar(); 
        PreparedStatement ps = con.prepareStatement("INSERT INTO ingredientes_decorativos (ID_Nombre, ID_UnidadMedida, ID_Cantidad, ID_FechaIngreso) VALUES (?,?,?,?)");

        ps.setString(1, nombreID);
        ps.setString(2, unidadMedidaID);
        ps.setInt(3, cantidadID);
        ps.setDate(4, fechaSQL);
         
        ps.executeUpdate();
        JOptionPane.showMessageDialog(null, "Registro guardado");
        
        //Actualizar la tabla para que aparezca el registro nuevo
        MostrarID("ingredientes_decorativos");
        
        //Después de guardar el registro limpiar los campos 
        LimpiarCamposID();
        
        con.close(); // Cierra la conexión

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al guardar: " + e.getMessage());
    }

}
//------------------------------------------------------------------------------


//------------------------------------------------------------------------------
    //Método de actualizar los registros de la tabla INGREDIENTES DECORATIVOS
//------------------------------------------------------------------------------

private void ActualizarID(){

int fila = TablaID.getSelectedRow();
    int id = Integer.parseInt(TablaID.getValueAt(fila, 0).toString());
    String nombreID= txtNombreID.getText();
    String unidadMedidaID = txtUnidadMedidaID.getText();
    int cantidadID = Integer.parseInt(txtCantidadID.getText()); 
    Date fechaIngresoID = parseDate(txtFechaIngresoID.getText()); 
    
    if (fechaIngresoID == null) {
        JOptionPane.showMessageDialog(null, "Fecha inválida. Ingrese en formato yyyy-MM-dd.");
        return; // Sale del método si la fecha es inválida
    }
    
    java.sql.Date fechaSQL = new java.sql.Date(fechaIngresoID.getTime()); 
    
  
    try {
        java.sql.Connection con =  Conexion.conectar(); 
        PreparedStatement ps = con.prepareStatement("UPDATE ingredientes_decorativos SET ID_Nombre=?, ID_UnidadMedida=?, ID_Cantidad=?, ID_FechaIngreso=? WHERE idIngredientes_Decorativos=?" );

        ps.setString(1, nombreID);
        ps.setString(2, unidadMedidaID);
        ps.setInt(3, cantidadID);
        ps.setDate(4, fechaSQL);
        ps.setInt(5, id);
         
        ps.executeUpdate();
        JOptionPane.showMessageDialog(null, "Registro actualizado");
        
        //Actualizar la tabla para que aparezca el registro nuevo
        MostrarID("ingredientes_decorativos");
        
        //Después de guardar el registro limpiar los campos 
        LimpiarCamposID();
        
        con.close(); // Cierra la conexión

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al guardar: " + e.getMessage());
    }

}
//------------------------------------------------------------------------------


//------------------------------------------------------------------------------
    //Método para eliminar un registro de la tabla INGREDIENTES DECORATIVOS
//------------------------------------------------------------------------------ 

private void EliminarID(){

int fila = TablaID.getSelectedRow();
    int id = Integer.parseInt(TablaID.getValueAt(fila, 0).toString());
    
    try {
        java.sql.Connection con =  Conexion.conectar(); 
        PreparedStatement ps = con.prepareStatement("DELETE FROM ingredientes_decorativos WHERE idIngredientes_Decorativos=?" );

        ps.setInt(1, id);
         
        ps.executeUpdate();
        JOptionPane.showMessageDialog(null, "Registro eliminado");
        
        //Actualizar la tabla para que aparezca el registro nuevo
        MostrarID("ingredientes_decorativos");
        
        //Después de guardar el registro limpiar los campos 
        LimpiarCamposID();
        
        con.close(); // Cierra la conexión

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al guardar: " + e.getMessage());
    }

}
//------------------------------------------------------------------------------



//------------------------------------------------------------------------------
    //Método para buscar un registro de la tabla INGREDIENTES DECORATIVOS
//------------------------------------------------------------------------------ 

private void BuscarID(){

TableRowSorter<TableModel> sorter = new TableRowSorter<>(TablaID.getModel());
    TablaID.setRowSorter(sorter);
    
    String textoBusqueda = txtNombreID.getText().trim();
    
    if (textoBusqueda.isEmpty()) {
        sorter.setRowFilter(null); // Muestra todos los registros si el campo está vacío
    } else {
        sorter.setRowFilter(RowFilter.regexFilter("(?i)" + textoBusqueda)); // Filtra ignorando mayúsculas/minúsculas
    }

}
//------------------------------------------------------------------------------


//------------------------------------------------------------------------------
    //Método para limpiar los campos INGREDIENTES DECORATIVOS
//------------------------------------------------------------------------------    
private void LimpiarCamposID(){

        txtNombreID.setText("");
        txtUnidadMedidaID.setText("");
        txtCantidadID.setText("");
        txtFechaIngresoID.setText("");
}
//------------------------------------------------------------------------------


    
//********************************************************************************************************
    
    

    
    
//*******************************************************************************************************
	//INGREDIENTES EXTRAS
//******************************************************************************************************

    
//------------------------------------------------------------------------------
    //Método para mostrar los registros en la tabla INGREDIENTES EXTRAS
//------------------------------------------------------------------------------    
    public void MostrarIE(String tabla) {
    String sql = "SELECT * FROM " + tabla;
    Conexion con = new Conexion();
    java.sql.Connection conexion = con.conectar();

    DefaultTableModel model = new DefaultTableModel();
    String[] columnas = {"ID", "Nombre", "Unidad de Medida", "Cantidad", "Fecha de Ingreso"};
    
    
    for (String columna : columnas) {
        model.addColumn(columna);
    }

    TablaIE.setRowSorter(null);
    TablaIE.setModel(model);

    try (java.sql.Statement st = conexion.createStatement(); ResultSet rs = st.executeQuery(sql)) {
        while (rs.next()) {
            String[] datos = new String[columnas.length];
            for (int i = 0; i < columnas.length; i++) {
                datos[i] = rs.getString(i + 1);
            }
          
            model.addRow(datos);
        }
        
        // Modificar el ancho de las columnas
        TableColumnModel modeloColumnas = TablaIE.getColumnModel();
        modeloColumnas.getColumn(0).setPreferredWidth(1);  // ID
        modeloColumnas.getColumn(1).setPreferredWidth(10); // Nombre
        modeloColumnas.getColumn(2).setPreferredWidth(10); // Unidad de medida
        modeloColumnas.getColumn(3).setPreferredWidth(10); // Cantidad
        modeloColumnas.getColumn(4).setPreferredWidth(30); // Fecha de ingreso
        
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
    //Método para agregar registros a la tabla INGREDIENTES EXTRAS
//------------------------------------------------------------------------------

private void AgregarIE(){

String nombreIE = txtNombreIE.getText();
    String unidadMedidaIE = txtUnidadMedidaIE.getText();
    int cantidadIE = Integer.parseInt(txtCantidadIE.getText()); 
    Date fechaIngresoIE = parseDate(txtFechaIngresoIE.getText()); 
    
    if (fechaIngresoIE == null) {
        // Usar la fecha actual si es inválida
        fechaIngresoIE = new Date(); 
        JOptionPane.showMessageDialog(null, "Fecha inválida. Se usará la fecha actual.");
    }

    
    java.sql.Date fechaSQL = new java.sql.Date(fechaIngresoIE.getTime()); 
    
  
    try {
        java.sql.Connection con =  Conexion.conectar(); 
        PreparedStatement ps = con.prepareStatement("INSERT INTO ingredientes_extras (IE_Nombre, IE_UnidadMedida, IE_Cantidad, IE_FechaIngreso) VALUES (?,?,?,?)");

        ps.setString(1, nombreIE);
        ps.setString(2, unidadMedidaIE);
        ps.setInt(3, cantidadIE);
        ps.setDate(4, fechaSQL);
         
        ps.executeUpdate();
        JOptionPane.showMessageDialog(null, "Registro guardado");
        
        //Actualizar la tabla para que aparezca el registro nuevo
        MostrarIE("ingredientes_extras");
        
        //Después de guardar el registro limpiar los campos 
        LimpiarCamposIE();
        
        con.close(); // Cierra la conexión

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al guardar: " + e.getMessage());
    }

}


//------------------------------------------------------------------------------
	


//------------------------------------------------------------------------------
    //Método de actualizar los registros de la tabla INGREDIENTES EXTRAS
//------------------------------------------------------------------------------

private void ActualizarIE(){

int fila = TablaIE.getSelectedRow();
    int id = Integer.parseInt(TablaIE.getValueAt(fila, 0).toString());    
    String nombreIE = txtNombreIE.getText();
    String unidadMedidaIE = txtUnidadMedidaIE.getText();
    int cantidadIE = Integer.parseInt(txtCantidadIE.getText()); 
    Date fechaIngresoIE = parseDate(txtFechaIngresoIE.getText()); 
    
    if (fechaIngresoIE == null) {
        JOptionPane.showMessageDialog(null, "Fecha inválida. Ingrese en formato yyyy-MM-dd.");
        return; // Sale del método si la fecha es inválida
    }
    
    java.sql.Date fechaSQL = new java.sql.Date(fechaIngresoIE.getTime()); 
    
  
    try {
        java.sql.Connection con =  Conexion.conectar(); 
        PreparedStatement ps = con.prepareStatement("UPDATE ingredientes_extras SET IE_Nombre=?, IE_UnidadMedida=?, IE_Cantidad=?, IE_FechaIngreso=? WHERE idIngredientes_extras=? ");

        ps.setString(1, nombreIE);
        ps.setString(2, unidadMedidaIE);
        ps.setInt(3, cantidadIE);
        ps.setDate(4, fechaSQL);
        ps.setInt(5, id);
        
        ps.executeUpdate();
        JOptionPane.showMessageDialog(null, "Registro actualizado");
        
        //Actualizar la tabla para que aparezca el registro nuevo
        MostrarIE("ingredientes_extras");
        
        //Después de guardar el registro limpiar los campos 
        LimpiarCamposIE();
        
        con.close(); // Cierra la conexión

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al guardar: " + e.getMessage());
    }

}
//------------------------------------------------------------------------------



//------------------------------------------------------------------------------
    //Método para eliminar un registro de la tabla INGREDIENTES EXTRAS
//------------------------------------------------------------------------------

private void EliminarIE(){

int fila = TablaIE.getSelectedRow();
    int id = Integer.parseInt(TablaIE.getValueAt(fila, 0).toString());    
    String nombreIE = txtNombreIE.getText();
    
    try {
        java.sql.Connection con =  Conexion.conectar(); 
        PreparedStatement ps = con.prepareStatement("DELETE FROM ingredientes_extras WHERE idIngredientes_extras=? ");

        ps.setInt(1, id);
        
        ps.executeUpdate();
        JOptionPane.showMessageDialog(null, "Registro eliminado");
        
        //Actualizar la tabla para que aparezca el registro nuevo
        MostrarIE("ingredientes_extras");
        
        //Después de guardar el registro limpiar los campos 
        LimpiarCamposIE();
        
        con.close(); // Cierra la conexión

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al guardar: " + e.getMessage());
    }

}
//------------------------------------------------------------------------------



//------------------------------------------------------------------------------
    //Método para buscar un registro de la tabla INGREDIENTES EXTRAS
//------------------------------------------------------------------------------

private void BuscarIE(){

TableRowSorter<TableModel> sorter = new TableRowSorter<>(TablaIE.getModel());
    TablaIE.setRowSorter(sorter);
    
    String textoBusqueda = txtNombreIE.getText().trim();
    
    if (textoBusqueda.isEmpty()) {
        sorter.setRowFilter(null); // Muestra todos los registros si el campo está vacío
    } else {
        sorter.setRowFilter(RowFilter.regexFilter("(?i)" + textoBusqueda)); // Filtra ignorando mayúsculas/minúsculas
    }

}
//------------------------------------------------------------------------------


//------------------------------------------------------------------------------
    //Método para limpiar los campos INGREDIENTES EXTRAS
//------------------------------------------------------------------------------    
private void LimpiarCamposIE(){

        txtNombreIE.setText("");
        txtUnidadMedidaIE.setText("");
        txtCantidadIE.setText("");
        txtFechaIngresoIE.setText("");
}
//------------------------------------------------------------------------------

//******************************************************************************


//------------------------------------------------------------------------------
    //Método para limitar a escribir solo números en los Textfield
//------------------------------------------------------------------------------
    private void limitarNumeros(JTextField textField) {
        textField.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c)) { // Solo permite números
                    e.consume(); // Bloquea la entrada si no es un número
                }
            }
        });
    }
//------------------------------------------------------------------------------
    
    
//------------------------------------------------------------------------------
    //Método para txtFields
//------------------------------------------------------------------------------
    private void TxtFields(){
    
    limitarNumeros(txtCantidadIB);
    limitarNumeros(txtCantidadIE);
    limitarNumeros(txtCantidadID);
  
    }
//------------------------------------------------------------------------------

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaID;
    private javax.swing.JTable TablaIE;
    private javax.swing.JTable TablaIngredientesBasicos;
    private javax.swing.JButton btnActualizarIB;
    private javax.swing.JButton btnActualizarID;
    private javax.swing.JButton btnActualizarIE;
    private javax.swing.JButton btnAgregarIB;
    private javax.swing.JButton btnAgregarID;
    private javax.swing.JButton btnAgregarIE;
    private javax.swing.JButton btnBuscarIB;
    private javax.swing.JButton btnBuscarID;
    private javax.swing.JButton btnBuscarIE;
    private javax.swing.JButton btnEliminarIB;
    private javax.swing.JButton btnEliminarID;
    private javax.swing.JButton btnEliminarIE;
    private javax.swing.JButton btnRegresarIB;
    private javax.swing.JButton btnRegresarID;
    private javax.swing.JButton btnRegresarIE;
    private javax.swing.JButton btnRegresoIB;
    private javax.swing.JButton btnRegresoID;
    private javax.swing.JButton btnRegresoIE;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblCantidadIB;
    private javax.swing.JLabel lblCantidadID;
    private javax.swing.JLabel lblCantidadIE;
    private javax.swing.JLabel lblFechaIngresoIB;
    private javax.swing.JLabel lblFechaIngresoID;
    private javax.swing.JLabel lblFechaIngresoIE;
    private javax.swing.JLabel lblIngredientesBasicos;
    private javax.swing.JLabel lblIngredientesDecorativos;
    private javax.swing.JLabel lblIngredientesExtras;
    private javax.swing.JLabel lblNombreIB;
    private javax.swing.JLabel lblNombreID;
    private javax.swing.JLabel lblNombreIE;
    private javax.swing.JLabel lblUnidadMedidaIB;
    private javax.swing.JLabel lblUnidadMedidaID;
    private javax.swing.JLabel lblUnidadMedidaIE;
    private javax.swing.JTextArea txtArea;
    private javax.swing.JTextArea txtArea2;
    private javax.swing.JTextArea txtArea3;
    private javax.swing.JTextField txtCantidadIB;
    private javax.swing.JTextField txtCantidadID;
    private javax.swing.JTextField txtCantidadIE;
    private javax.swing.JTextField txtFechaIngresoIB;
    private javax.swing.JTextField txtFechaIngresoID;
    private javax.swing.JTextField txtFechaIngresoIE;
    private javax.swing.JTextField txtNombreIB;
    private javax.swing.JTextField txtNombreID;
    private javax.swing.JTextField txtNombreIE;
    private javax.swing.JTextField txtUnidadMedidaIB;
    private javax.swing.JTextField txtUnidadMedidaID;
    private javax.swing.JTextField txtUnidadMedidaIE;
    // End of variables declaration//GEN-END:variables

//------------------------------------------------------------------------------
private Date parseDate(String fechaTexto) {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    sdf.setLenient(false); // Asegura que solo se acepten fechas válidas
    try {
        return sdf.parse(fechaTexto);
    } catch (ParseException e) {
        return null; // Devuelve null si no es válida
    }
}
//------------------------------------------------------------------------------
}
