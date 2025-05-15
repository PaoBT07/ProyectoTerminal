/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ClasesPlanas;

/**
 *
 * @author Paola Barrera Tenorio 2192007348
 */

import INTERFACES.NotaRemision;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import static java.awt.print.Printable.NO_SUCH_PAGE;
import static java.awt.print.Printable.PAGE_EXISTS;
import java.awt.print.PrinterException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import ConexionBD.Conexion;
import static ConexionBD.Conexion.con;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import java.sql.Statement;


public class PanB extends javax.swing.JPanel implements Printable{

    /**
     * Creates new form Telera
     */
    
    
    
    public PanB() {
        initComponents();
        
        Fecha();
        TxtFields();
        MostrarTeleras();
        MostrarBolillosLisos();
        MostrarBolillosAjonjoli();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        lblTelera = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblIngrese = new javax.swing.JLabel();
        lvlVentaPublicoT = new javax.swing.JLabel();
        lblVentasRepartos = new javax.swing.JLabel();
        txtCarrosPublicoTelera = new javax.swing.JTextField();
        txtTablasPublicoTelera = new javax.swing.JTextField();
        lblCarrosTelera = new javax.swing.JLabel();
        lblTablasTelera = new javax.swing.JLabel();
        txtTablasRepartosTelera = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lblTotalTeleras = new javax.swing.JLabel();
        txtCarrosRepartosTelera = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        lblFecha = new javax.swing.JLabel();
        lblFechaDia = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();
        lblTotal = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaTeleras = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        lblBolilloLiso = new javax.swing.JLabel();
        lblIngreseBolillosLisos = new javax.swing.JLabel();
        lblVentaPublicoBL = new javax.swing.JLabel();
        txtCarrosPublicoBL = new javax.swing.JTextField();
        txtTablasPublicoBL = new javax.swing.JTextField();
        lblCarrosBL = new javax.swing.JLabel();
        lblTablasBL = new javax.swing.JLabel();
        lblVentaRepartosBL = new javax.swing.JLabel();
        txtTablasRepartosBL = new javax.swing.JTextField();
        lblCarrosRepartosBL = new javax.swing.JLabel();
        lblTablasRepartosBL = new javax.swing.JLabel();
        lblTotalBL = new javax.swing.JLabel();
        txtCarrosRepartosBL = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        lblTotalBolillosLisos = new javax.swing.JLabel();
        btnCalcularBL = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaBL = new javax.swing.JTable();
        lblFechaDia2 = new javax.swing.JLabel();
        lblFecha2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        lblBolillosAjon = new javax.swing.JLabel();
        lblIngreseBA = new javax.swing.JLabel();
        lblVentaPublicoBA = new javax.swing.JLabel();
        lblVentaRepartosBA = new javax.swing.JLabel();
        txtCarrosPublicoBA = new javax.swing.JTextField();
        txtTablasPublicoBA = new javax.swing.JTextField();
        lblCarrosPublicoBA = new javax.swing.JLabel();
        lblTablasPublicoBA = new javax.swing.JLabel();
        txtCarrosRepartosBA = new javax.swing.JTextField();
        txtTablasRepartosBA = new javax.swing.JTextField();
        lblCarrosRepartosBA = new javax.swing.JLabel();
        lblTablasRepartosBA = new javax.swing.JLabel();
        lblTotalBA = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        lblTotalBolillosAjonjoli = new javax.swing.JLabel();
        btnCalcularBA = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        TablaBA = new javax.swing.JTable();
        lblFechaDia3 = new javax.swing.JLabel();
        lblFecha3 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        lblMateriasPrimas = new javax.swing.JLabel();
        lblHarina = new javax.swing.JLabel();
        lblLevadura = new javax.swing.JLabel();
        lblAzucar = new javax.swing.JLabel();
        lblSal = new javax.swing.JLabel();
        lblAceite = new javax.swing.JLabel();
        lblMantequilla = new javax.swing.JLabel();
        lblAjonjoli = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        txtHarina = new javax.swing.JTextField();
        txtLevadura = new javax.swing.JTextField();
        txtAzucar = new javax.swing.JTextField();
        txtSal = new javax.swing.JTextField();
        txtGrasaVegetal = new javax.swing.JTextField();
        txtMantequilla = new javax.swing.JTextField();
        txtAjonjoli = new javax.swing.JTextField();
        lblCantidadesMP = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        btnActualizar = new javax.swing.JButton();
        lblFechaDia4 = new javax.swing.JLabel();
        lblFecha4 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1166, 671));

        jTabbedPane1.setBackground(new java.awt.Color(250, 212, 155));
        jTabbedPane1.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(250, 212, 155));

        jPanel4.setBackground(new java.awt.Color(165, 105, 66));

        lblTelera.setFont(new java.awt.Font("STLiti", 0, 48)); // NOI18N
        lblTelera.setForeground(new java.awt.Color(255, 255, 255));
        lblTelera.setText("-TELERA-");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(402, 402, 402))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(209, 209, 209)
                .addComponent(lblTelera)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblTelera)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1)
                .addContainerGap())
        );

        lblIngrese.setFont(new java.awt.Font("Bell MT", 0, 24)); // NOI18N
        lblIngrese.setText("Ingrese la cantidad de carros y tablas de teleras");

        lvlVentaPublicoT.setFont(new java.awt.Font("Bell MT", 0, 24)); // NOI18N
        lvlVentaPublicoT.setText("Venta al público");

        lblVentasRepartos.setFont(new java.awt.Font("Bell MT", 0, 24)); // NOI18N
        lblVentasRepartos.setText("Venta a repartos");

        txtCarrosPublicoTelera.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N

        txtTablasPublicoTelera.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N

        lblCarrosTelera.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        lblCarrosTelera.setText("Carros");

        lblTablasTelera.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        lblTablasTelera.setText("Tablas");

        txtTablasRepartosTelera.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        jLabel12.setText("Carros");

        jLabel13.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        jLabel13.setText("Tablas");

        lblTotalTeleras.setFont(new java.awt.Font("Bell MT", 1, 24)); // NOI18N
        lblTotalTeleras.setText("Total de teleras");

        txtCarrosRepartosTelera.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N

        jSeparator2.setBackground(new java.awt.Color(165, 105, 66));
        jSeparator2.setForeground(new java.awt.Color(165, 105, 66));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        lblFecha.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        lblFecha.setText("JLabel");

        lblFechaDia.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        lblFechaDia.setText("Fecha");

        btnCalcular.setBackground(new java.awt.Color(165, 105, 66));
        btnCalcular.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        btnCalcular.setForeground(new java.awt.Color(255, 255, 255));
        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        lblTotal.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        lblTotal.setText("0");

        TablaTeleras.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        TablaTeleras.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(TablaTeleras);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lvlVentaPublicoT)
                        .addGap(42, 42, 42)
                        .addComponent(txtCarrosPublicoTelera, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTablasRepartosTelera, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTablasPublicoTelera, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblVentasRepartos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtCarrosRepartosTelera, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(224, 224, 224))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addGap(71, 71, 71)
                                        .addComponent(jLabel13)
                                        .addGap(129, 129, 129))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblFechaDia)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblFecha)
                                        .addGap(79, 79, 79))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblIngrese)
                                        .addGap(65, 65, 65))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(226, 226, 226)
                                        .addComponent(lblCarrosTelera)
                                        .addGap(82, 82, 82)
                                        .addComponent(lblTablasTelera))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(64, 64, 64)
                                        .addComponent(lblTotalTeleras)
                                        .addGap(66, 66, 66)
                                        .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(179, 179, 179)
                                        .addComponent(btnCalcular)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblFecha)
                                    .addComponent(lblFechaDia))
                                .addGap(34, 34, 34)
                                .addComponent(lblIngrese)
                                .addGap(41, 41, 41)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(lvlVentaPublicoT)
                                            .addComponent(txtCarrosPublicoTelera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtTablasPublicoTelera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(lblCarrosTelera)
                                            .addComponent(lblTablasTelera))
                                        .addGap(60, 60, 60))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtCarrosRepartosTelera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtTablasRepartosTelera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblVentasRepartos)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel13))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCalcular)
                                .addGap(45, 45, 45)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblTotalTeleras)
                                    .addComponent(lblTotal))
                                .addGap(227, 227, 227))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 155, Short.MAX_VALUE))))
        );

        jTabbedPane1.addTab("TELERA", jPanel1);

        jPanel2.setBackground(new java.awt.Color(250, 212, 155));

        jPanel8.setBackground(new java.awt.Color(165, 105, 66));

        lblBolilloLiso.setFont(new java.awt.Font("STLiti", 0, 48)); // NOI18N
        lblBolilloLiso.setForeground(new java.awt.Color(255, 255, 255));
        lblBolilloLiso.setText("-BOLILLO LISO-");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addComponent(lblBolilloLiso)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblBolilloLiso)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        lblIngreseBolillosLisos.setFont(new java.awt.Font("Bell MT", 0, 24)); // NOI18N
        lblIngreseBolillosLisos.setText("Ingrese la cantidad de carros y tablas para los bolillos lisos");

        lblVentaPublicoBL.setFont(new java.awt.Font("Bell MT", 0, 24)); // NOI18N
        lblVentaPublicoBL.setText("Venta al público");

        txtCarrosPublicoBL.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N

        txtTablasPublicoBL.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N

        lblCarrosBL.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        lblCarrosBL.setText("Carros");

        lblTablasBL.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        lblTablasBL.setText("Tablas");

        lblVentaRepartosBL.setFont(new java.awt.Font("Bell MT", 0, 24)); // NOI18N
        lblVentaRepartosBL.setText("Venta a repartos");

        txtTablasRepartosBL.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N

        lblCarrosRepartosBL.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        lblCarrosRepartosBL.setText("Carros");

        lblTablasRepartosBL.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        lblTablasRepartosBL.setText("Tablas");

        lblTotalBL.setFont(new java.awt.Font("Bell MT", 1, 24)); // NOI18N
        lblTotalBL.setText("Total de bolillos lisos");

        txtCarrosRepartosBL.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N

        jSeparator3.setBackground(new java.awt.Color(165, 105, 66));
        jSeparator3.setForeground(new java.awt.Color(165, 105, 66));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        lblTotalBolillosLisos.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        lblTotalBolillosLisos.setText("0");

        btnCalcularBL.setBackground(new java.awt.Color(165, 105, 66));
        btnCalcularBL.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        btnCalcularBL.setForeground(new java.awt.Color(255, 255, 255));
        btnCalcularBL.setText("Calcular");
        btnCalcularBL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularBLActionPerformed(evt);
            }
        });

        TablaBL.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        TablaBL.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(TablaBL);

        lblFechaDia2.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        lblFechaDia2.setText("Fecha:.");

        lblFecha2.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        lblFecha2.setText("jLabel2");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(295, 295, 295)
                            .addComponent(lblCarrosBL)
                            .addGap(93, 93, 93)
                            .addComponent(lblTablasBL)
                            .addGap(116, 116, 116))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblCarrosRepartosBL)
                            .addGap(94, 94, 94)
                            .addComponent(lblTablasRepartosBL)
                            .addGap(115, 115, 115)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblTotalBL)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblVentaPublicoBL)
                                    .addComponent(lblVentaRepartosBL))
                                .addGap(43, 43, 43)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCarrosPublicoBL, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCarrosRepartosBL, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnCalcularBL))))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTablasRepartosBL, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTablasPublicoBL, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(lblTotalBolillosLisos, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(90, 90, 90))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(lblIngreseBolillosLisos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(lblFechaDia2)
                                .addGap(18, 18, 18)
                                .addComponent(lblFecha2)
                                .addGap(65, 65, 65)))))
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFechaDia2)
                            .addComponent(lblFecha2))
                        .addGap(27, 27, 27)
                        .addComponent(lblIngreseBolillosLisos)
                        .addGap(62, 62, 62)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblVentaPublicoBL)
                            .addComponent(txtCarrosPublicoBL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTablasPublicoBL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCarrosBL)
                            .addComponent(lblTablasBL))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblVentaRepartosBL)
                            .addComponent(txtCarrosRepartosBL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTablasRepartosBL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCarrosRepartosBL)
                            .addComponent(lblTablasRepartosBL))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addComponent(btnCalcularBL)
                        .addGap(43, 43, 43)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTotalBL)
                            .addComponent(lblTotalBolillosLisos))
                        .addGap(207, 207, 207))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator3)
                        .addGap(170, 170, 170))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jTabbedPane1.addTab("BOLILLO LISO", jPanel2);

        jPanel3.setBackground(new java.awt.Color(250, 212, 155));

        jPanel6.setBackground(new java.awt.Color(165, 105, 66));

        lblBolillosAjon.setFont(new java.awt.Font("STLiti", 0, 48)); // NOI18N
        lblBolillosAjon.setForeground(new java.awt.Color(255, 255, 255));
        lblBolillosAjon.setText("-BOLILLO CON AJONJOLI-");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblBolillosAjon)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblBolillosAjon)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        lblIngreseBA.setFont(new java.awt.Font("Bell MT", 0, 24)); // NOI18N
        lblIngreseBA.setText("Ingrese la cantidad de carros y tablas de bolillos con ajonjolí");

        lblVentaPublicoBA.setFont(new java.awt.Font("Bell MT", 0, 24)); // NOI18N
        lblVentaPublicoBA.setText("Venta al público");

        lblVentaRepartosBA.setFont(new java.awt.Font("Bell MT", 0, 24)); // NOI18N
        lblVentaRepartosBA.setText("Venta a repartos");

        txtCarrosPublicoBA.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N

        txtTablasPublicoBA.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N

        lblCarrosPublicoBA.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        lblCarrosPublicoBA.setText("Carros");

        lblTablasPublicoBA.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        lblTablasPublicoBA.setText("Tablas");

        txtCarrosRepartosBA.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N

        txtTablasRepartosBA.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N

        lblCarrosRepartosBA.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        lblCarrosRepartosBA.setText("Carros");

        lblTablasRepartosBA.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        lblTablasRepartosBA.setText("Tablas");

        lblTotalBA.setFont(new java.awt.Font("Bell MT", 1, 24)); // NOI18N
        lblTotalBA.setText("Total de bolillos con ajonjolí");

        jSeparator4.setBackground(new java.awt.Color(165, 105, 66));
        jSeparator4.setForeground(new java.awt.Color(165, 105, 66));
        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);

        lblTotalBolillosAjonjoli.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        lblTotalBolillosAjonjoli.setText("0");

        btnCalcularBA.setBackground(new java.awt.Color(165, 105, 66));
        btnCalcularBA.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        btnCalcularBA.setForeground(new java.awt.Color(255, 255, 255));
        btnCalcularBA.setText("Calcular");
        btnCalcularBA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularBAActionPerformed(evt);
            }
        });

        TablaBA.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        TablaBA.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(TablaBA);

        lblFechaDia3.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        lblFechaDia3.setText("Fecha:");

        lblFecha3.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        lblFecha3.setText("jLabel2");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(lblFechaDia3)
                        .addGap(18, 18, 18)
                        .addComponent(lblFecha3)
                        .addGap(48, 48, 48))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(62, 62, 62)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblVentaPublicoBA)
                                            .addComponent(lblVentaRepartosBA))
                                        .addGap(49, 49, 49)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtCarrosRepartosBA, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtCarrosPublicoBA, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(45, 45, 45))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                        .addGap(253, 253, 253)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                                .addComponent(lblCarrosRepartosBA)
                                                .addGap(66, 66, 66))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                                .addComponent(lblCarrosPublicoBA)
                                                .addGap(70, 70, 70)))))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(34, 34, 34)
                                        .addComponent(lblTablasPublicoBA))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtTablasRepartosBA, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtTablasPublicoBA, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblTotalBolillosAjonjoli, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(32, 32, 32)
                                        .addComponent(lblTablasRepartosBA))))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblIngreseBA))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addComponent(lblTotalBA)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(btnCalcularBA)
                        .addGap(246, 246, 246)))
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFechaDia3)
                            .addComponent(lblFecha3))
                        .addGap(27, 27, 27)
                        .addComponent(lblIngreseBA)
                        .addGap(72, 72, 72)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblVentaPublicoBA)
                            .addComponent(txtCarrosPublicoBA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTablasPublicoBA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCarrosPublicoBA)
                            .addComponent(lblTablasPublicoBA))
                        .addGap(52, 52, 52)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblVentaRepartosBA)
                            .addComponent(txtCarrosRepartosBA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTablasRepartosBA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTablasRepartosBA)
                            .addComponent(lblCarrosRepartosBA))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addComponent(btnCalcularBA)
                        .addGap(46, 46, 46)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTotalBA)
                            .addComponent(lblTotalBolillosAjonjoli))
                        .addGap(171, 171, 171))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jTabbedPane1.addTab("BOLILLO AJONJOLI", jPanel3);

        jPanel10.setBackground(new java.awt.Color(250, 212, 155));
        jPanel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel10MousePressed(evt);
            }
        });

        jPanel11.setBackground(new java.awt.Color(165, 105, 66));

        lblMateriasPrimas.setFont(new java.awt.Font("STLiti", 0, 48)); // NOI18N
        lblMateriasPrimas.setForeground(new java.awt.Color(255, 255, 255));
        lblMateriasPrimas.setText("-MATERIAS PRIMAS-");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(lblMateriasPrimas)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(lblMateriasPrimas)
                .addGap(22, 22, 22))
        );

        lblHarina.setFont(new java.awt.Font("Bell MT", 0, 24)); // NOI18N
        lblHarina.setText("Harina");

        lblLevadura.setFont(new java.awt.Font("Bell MT", 0, 24)); // NOI18N
        lblLevadura.setText("Levadura");

        lblAzucar.setFont(new java.awt.Font("Bell MT", 0, 24)); // NOI18N
        lblAzucar.setText("Azúcar");

        lblSal.setFont(new java.awt.Font("Bell MT", 0, 24)); // NOI18N
        lblSal.setText("Sal");

        lblAceite.setFont(new java.awt.Font("Bell MT", 0, 24)); // NOI18N
        lblAceite.setText("Grasa vegetal");

        lblMantequilla.setFont(new java.awt.Font("Bell MT", 0, 24)); // NOI18N
        lblMantequilla.setText("Mantequilla");

        lblAjonjoli.setFont(new java.awt.Font("Bell MT", 0, 24)); // NOI18N
        lblAjonjoli.setText("Ajonjolí");

        jSeparator5.setBackground(new java.awt.Color(165, 105, 66));
        jSeparator5.setForeground(new java.awt.Color(165, 105, 66));
        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);

        txtHarina.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N

        txtLevadura.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N

        txtAzucar.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N

        txtSal.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N

        txtGrasaVegetal.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N

        txtMantequilla.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N

        txtAjonjoli.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N

        lblCantidadesMP.setFont(new java.awt.Font("Bell MT", 0, 24)); // NOI18N
        lblCantidadesMP.setText("Anote las cantidades de materias primas utilizadas");

        jLabel4.setFont(new java.awt.Font("Bell MT", 1, 24)); // NOI18N
        jLabel4.setText("Horario");

        jComboBox1.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Seleccione el horario de producción -", "6:00 am", "7:00 am", "8:00 am ", "9:00 am", "10:00 am", "11:00 am", "12:00 pm", "01:00 pm", "02:00 pm", " " }));

        jLabel5.setFont(new java.awt.Font("Bell MT", 0, 24)); // NOI18N
        jLabel5.setText("Seleccione el horario en que se debe realizar la producción");

        btnActualizar.setBackground(new java.awt.Color(165, 105, 66));
        btnActualizar.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizar.setText("Actualizar inventario");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        lblFechaDia4.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        lblFechaDia4.setText("Fecha: ");

        lblFecha4.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        lblFecha4.setText("jLabel1");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnActualizar)
                        .addGap(181, 181, 181))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCantidadesMP)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGap(358, 358, 358)
                                .addComponent(lblFechaDia4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblFecha4)))
                        .addGap(72, 72, 72))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel10Layout.createSequentialGroup()
                                        .addComponent(lblAjonjoli)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtAjonjoli, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel10Layout.createSequentialGroup()
                                        .addComponent(lblMantequilla)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtMantequilla))
                                    .addGroup(jPanel10Layout.createSequentialGroup()
                                        .addComponent(lblAceite)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtGrasaVegetal))
                                    .addGroup(jPanel10Layout.createSequentialGroup()
                                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblLevadura)
                                            .addComponent(lblAzucar)
                                            .addComponent(lblHarina)
                                            .addComponent(lblSal))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtSal, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtHarina, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtAzucar, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtLevadura, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(178, 178, 178))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(28, 28, 28)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)))
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(481, 481, 481))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jSeparator5)
                        .addGap(125, 125, 125))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFechaDia4)
                            .addComponent(lblFecha4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblCantidadesMP)
                        .addGap(34, 34, 34)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHarina)
                            .addComponent(txtHarina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtLevadura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblLevadura))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAzucar)
                            .addComponent(txtAzucar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSal)
                            .addComponent(txtSal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAceite)
                            .addComponent(txtGrasaVegetal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMantequilla)
                            .addComponent(txtMantequilla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAjonjoli)
                            .addComponent(txtAjonjoli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnActualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(136, 136, 136))))
        );

        jTabbedPane1.addTab("MATERIAS PRIMAS", jPanel10);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
    }// </editor-fold>//GEN-END:initComponents

//Botón Calcular Teleras
    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        totalTeleras();
    }//GEN-LAST:event_btnCalcularActionPerformed

//Botón Calcular Bolillos Lisos
    private void btnCalcularBLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularBLActionPerformed
        totalBolilloLiso();
    }//GEN-LAST:event_btnCalcularBLActionPerformed

//Botón Calcular Bolillo Ajonjoli
    private void btnCalcularBAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularBAActionPerformed
        totalBolilloAjonjoli();
    }//GEN-LAST:event_btnCalcularBAActionPerformed

//Botón Actualizar
    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        try {
            descontarMateriasPrimas();
        } catch (SQLException ex) {
            Logger.getLogger(PanB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

//Botón Para Auto Calcular Materias Primas
    private void jPanel10MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel10MousePressed
       int totalPiezas = TotalPB();
        MateriasPrimasPorProduccion(totalPiezas);
    }//GEN-LAST:event_jPanel10MousePressed

//------------------------------------------------------------------------------
    //Método para generar la fecha 
//------------------------------------------------------------------------------
    private void Fecha(){

    LocalDate hoy = LocalDate.now();
    DateTimeFormatter formatoDia = DateTimeFormatter.ofPattern("EEEE", new Locale("es", "ES"));
    lblFechaDia.setText("Fecha: " + hoy.format(formatoDia));
    lblFechaDia2.setText("Fecha: " + hoy.format(formatoDia));
    lblFechaDia3.setText("Fecha: " + hoy.format(formatoDia));
    lblFechaDia4.setText("Fecha: " + hoy.format(formatoDia));
    
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    String fechaActual = sdf.format(new Date());
    lblFecha.setText( fechaActual);
    lblFecha2.setText( fechaActual);
    lblFecha3.setText( fechaActual);
    lblFecha4.setText( fechaActual);
}    
//------------------------------------------------------------------------------
    
    
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
    
    limitarNumeros(txtGrasaVegetal);
    limitarNumeros(txtAjonjoli);
    limitarNumeros(txtAzucar);
    limitarNumeros(txtCarrosPublicoBA);
    limitarNumeros(txtCarrosPublicoTelera);
    limitarNumeros(txtCarrosRepartosBA);
    limitarNumeros(txtCarrosRepartosBL);
    limitarNumeros(txtCarrosRepartosTelera);
    limitarNumeros(txtHarina);
    limitarNumeros(txtLevadura);
    limitarNumeros(txtMantequilla);
    limitarNumeros(txtSal);
    limitarNumeros(txtTablasPublicoBA);
    limitarNumeros(txtTablasPublicoBL);
    limitarNumeros(txtTablasPublicoTelera);
    limitarNumeros(txtTablasRepartosBA);
    limitarNumeros(txtTablasRepartosBL);
    limitarNumeros(txtTablasRepartosTelera);
    limitarNumeros(txtCarrosPublicoBL);
    
    }
//------------------------------------------------------------------------------
    
  
//------------------------------------------------------------------------------
    //Método para calcular el total de teleras
//------------------------------------------------------------------------------
private void totalTeleras(){

    try {
        // Verificamos que todos los campos tengan contenido
        if (!txtCarrosPublicoTelera.getText().isEmpty() &&
            !txtTablasPublicoTelera.getText().isEmpty() &&
            !txtCarrosRepartosTelera.getText().isEmpty() &&
            !txtTablasRepartosTelera.getText().isEmpty()) {

            int Telera1 = Integer.parseInt(txtCarrosPublicoTelera.getText());
            int Telera2 = Integer.parseInt(txtTablasPublicoTelera.getText());
            int Telera3 = Integer.parseInt(txtCarrosRepartosTelera.getText());
            int Telera4 = Integer.parseInt(txtTablasRepartosTelera.getText());
            
            int TotalTelera = Telera1 + Telera2 + Telera3 + Telera4;

            // Mostrar los resultados
            lblTotal.setText(String.format("%d", TotalTelera));
            
        } else {
            // Si algún campo está vacío, mostramos 0
            txtCarrosPublicoTelera.setText("0");
            txtTablasPublicoTelera.setText("0");
            txtCarrosRepartosTelera.setText("0");
            txtTablasRepartosTelera.setText("0");
        }
    } catch (NumberFormatException e) {
        
            txtCarrosPublicoTelera.setText("0");
            txtTablasPublicoTelera.setText("0");
            txtCarrosRepartosTelera.setText("0");
            txtTablasRepartosTelera.setText("0");
    }
}
//------------------------------------------------------------------------------


//------------------------------------------------------------------------------
    //Método para calcular el total de bolillos lisos
//------------------------------------------------------------------------------
private void totalBolilloLiso(){

    try {
        // Verificamos que todos los campos tengan contenido
        if (!txtCarrosPublicoBL.getText().isEmpty() &&
            !txtTablasPublicoBL.getText().isEmpty() &&
            !txtCarrosRepartosBL.getText().isEmpty() &&
            !txtTablasRepartosBL.getText().isEmpty()) {

            int BL1 = Integer.parseInt(txtCarrosPublicoBL.getText());
            int BL2 = Integer.parseInt(txtTablasPublicoBL.getText());
            int BL3 = Integer.parseInt(txtCarrosRepartosBL.getText());
            int BL4 = Integer.parseInt(txtTablasRepartosBL.getText());
            
            int TotalBolillosLisos = BL1 + BL2 + BL3 + BL4;

            // Mostrar los resultados
            lblTotalBolillosLisos.setText(String.format("%d", TotalBolillosLisos));
            
        } else {
            // Si algún campo está vacío, mostramos 0
            txtCarrosPublicoBL.setText("0");
            txtTablasPublicoBL.setText("0");
            txtCarrosRepartosBL.setText("0");
            txtTablasRepartosBL.setText("0");
        }
    } catch (NumberFormatException e) {
        
            txtCarrosPublicoBL.setText("0");
            txtTablasPublicoBL.setText("0");
            txtCarrosRepartosBL.setText("0");
            txtTablasRepartosBL.setText("0");
    }
}
//------------------------------------------------------------------------------


//------------------------------------------------------------------------------
    //Método para calcular el total de bolillos con ajonjoli
//------------------------------------------------------------------------------
private void totalBolilloAjonjoli(){

    try {
        // Verificamos que todos los campos tengan contenido
        if (!txtCarrosPublicoBA.getText().isEmpty() &&
            !txtTablasPublicoBA.getText().isEmpty() &&
            !txtCarrosRepartosBA.getText().isEmpty() &&
            !txtTablasRepartosBA.getText().isEmpty()) {

            int BA1 = Integer.parseInt(txtCarrosPublicoBA.getText());
            int BA2 = Integer.parseInt(txtTablasPublicoBA.getText());
            int BA3 = Integer.parseInt(txtCarrosRepartosBA.getText());
            int BA4 = Integer.parseInt(txtTablasRepartosBA.getText());
            
            int TotalTelera = BA1 + BA2 + BA3 + BA4;

            // Mostrar los resultados
            lblTotalBolillosAjonjoli.setText(String.format("%d", TotalTelera));
            
        } else {
            // Si algún campo está vacío, mostramos 0
            txtCarrosPublicoBA.setText("0");
            txtTablasPublicoBA.setText("0");
            txtCarrosRepartosBA.setText("0");
            txtTablasRepartosBA.setText("0");
        }
    } catch (NumberFormatException e) {
        
            txtCarrosPublicoBA.setText("0");
            txtTablasPublicoBA.setText("0");
            txtCarrosRepartosBA.setText("0");
            txtTablasRepartosBA.setText("0");
    }
}
//------------------------------------------------------------------------------



//------------------------------------------------------------------------------
    //Método para calcular todas las piezas de pan blanco 
//------------------------------------------------------------------------------
    private int TotalPB (){
        
         int TotalTelera = Integer.parseInt(lblTotal.getText());
         int TotalBL = Integer.parseInt(lblTotalBolillosLisos.getText());
         int TotalBA = Integer.parseInt(lblTotalBolillosAjonjoli.getText());
        
        int totalPB = TotalTelera + TotalBL + TotalBA;
        return totalPB;
        
}
//------------------------------------------------------------------------------

    
    
//------------------------------------------------------------------------------
    //Método para cantidades de materias primas
//------------------------------------------------------------------------------
    
    public void MateriasPrimasPorProduccion(int totalPiezas) {
    
    int piezasPorBultoHarina = 463;
    int piezasPorKiloSal = 1540;
    int piezasPorBultoAzucar = 14290;
    int piezasPorCajaLevadura = 267;
    int piezasPorKiloGrasaVegetal = 1333;

    // Calcular bultos necesarios, redondeando hacia arriba
    int bultosHarina = (int) Math.ceil((double) totalPiezas / piezasPorBultoHarina);
    int kiloSal = (int) Math.ceil((double) totalPiezas / piezasPorKiloSal);
    int bultosAzucar = (int) Math.ceil((double) totalPiezas / piezasPorBultoAzucar);
    int cajaLevadura = (int) Math.ceil((double) totalPiezas / piezasPorCajaLevadura);
    int kiloGrasaVegetal = (int) Math.ceil((double) totalPiezas / piezasPorKiloGrasaVegetal);

   
    txtHarina.setText(String.valueOf(bultosHarina));
    txtSal.setText(String.valueOf(kiloSal));
    txtAzucar.setText(String.valueOf(bultosAzucar));
    txtLevadura.setText(String.valueOf(cajaLevadura));
    txtGrasaVegetal.setText(String.valueOf(kiloGrasaVegetal));
}

    
//------------------------------------------------------------------------------

    
    
//------------------------------------------------------------------------------
    //Método para actualizar el inventario de las materias primas
//------------------------------------------------------------------------------

public void descontarMateriasPrimas() throws SQLException {
    
    try {
        int harina = Integer.parseInt(txtHarina.getText());
        int levadura = Integer.parseInt(txtLevadura.getText());
        int azucar = Integer.parseInt(txtAzucar.getText());
        int sal = Integer.parseInt(txtSal.getText());
        int aceite = Integer.parseInt(txtGrasaVegetal.getText());
        int mantequilla = Integer.parseInt(txtMantequilla.getText());
        int ajonjoli = Integer.parseInt(txtAjonjoli.getText());

        if (harina < 0 || levadura < 0 || sal < 0 || azucar < 0 || aceite < 0 || mantequilla < 0 || ajonjoli < 0) {
            JOptionPane.showMessageDialog(null, "Las cantidades deben ser mayores o iguales a 0.");
            return;
        }

        Connection con = Conexion.conectar();
        if (con == null) {
            JOptionPane.showMessageDialog(null, "No se pudo establecer la conexión con la base de datos.");
            return;
        }
        con.setAutoCommit(false); // Transacción

        PreparedStatement stmt = con.prepareStatement("UPDATE ingredientes_basicos SET IB_Cantidad = IB_Cantidad - ? WHERE IB_Nombre = ? AND IB_Cantidad >= ?");

        // Actualización de cada materia prima
        actualizarInventario(stmt, harina, "Harina");
        actualizarInventario(stmt, levadura, "Levadura");
        actualizarInventario(stmt, sal, "Sal");
        actualizarInventario(stmt, azucar, "Azúcar");
        actualizarInventario(stmt, aceite, "Grasa Vegetal");
        actualizarInventario(stmt, mantequilla, "Mantequilla");
        actualizarInventario(stmt, ajonjoli, "Ajonjolí");

        con.commit(); // Confirmar todos los descuentos
        JOptionPane.showMessageDialog(null, "Inventario actualizado correctamente.");

        stmt.close();
        con.close();

    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Todos los campos deben contener números válidos.");
    } catch (SQLException e) {
        con.rollback();  // Revertir los cambios en caso de error
        JOptionPane.showMessageDialog(null, "Error SQL: " + e.getMessage());
    }
}

// Método para actualizar el inventario de una materia prima
private void actualizarInventario(PreparedStatement stmt, int cantidad, String nombre) throws SQLException {
    stmt.setInt(1, cantidad);
    stmt.setString(2, nombre);
    stmt.setInt(3, cantidad);
    if (stmt.executeUpdate() == 0) {
        throw new SQLException("Inventario insuficiente para " + nombre);
    }
}
//------------------------------------------------------------------------------



//------------------------------------------------------------------------------
    //Método para mostrar en la tabla los datos de MySQL para las teleras
//------------------------------------------------------------------------------
    public void MostrarTeleras() {
    String sql = "SELECT lp.LP_Fecha, lpp.LPP_Cantidad, lp.LP_IDClienteReparto, lpp.LPP_IDListaPedido, lpp.LPP_IDVariedadPan " +
                 "FROM listapedido lp " +
                 "INNER JOIN ListaPedidoPan lpp ON lp.idListaPedido = lpp.LPP_IDListaPedido " +
                 "WHERE lpp.LPP_IDVariedadPan = 1";

    Connection conexion = Conexion.conectar(); // Usa tu clase estática correctamente

    DefaultTableModel model = new DefaultTableModel();
    String[] columnas = {"Fecha", "Cantidad", "Lista Pedido", "Cliente"};

    for (String columna : columnas) {
        model.addColumn(columna);
    }

    TablaTeleras.setModel(model);

    try (Statement st = conexion.createStatement(); ResultSet rs = st.executeQuery(sql)) {
        while (rs.next()) {
            String[] datos = new String[4]; // Solo usamos 4 columnas
            datos[0] = rs.getString("LP_Fecha");
            datos[1] = rs.getString("LPP_Cantidad");
            datos[2] = rs.getString("LPP_IDListaPedido");
            datos[3] = rs.getString("LP_IDClienteReparto");

            model.addRow(datos);
        }

        // Opcional: Ajustar ancho de columnas
        TableColumnModel modeloColumnas = TablaTeleras.getColumnModel();
        modeloColumnas.getColumn(0).setPreferredWidth(100); // Fecha
        modeloColumnas.getColumn(1).setPreferredWidth(50);  // Cantidad
        modeloColumnas.getColumn(2).setPreferredWidth(80);  // Lista Pedido
        modeloColumnas.getColumn(3).setPreferredWidth(80);  // Cliente

    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error al cargar datos: " + e.getMessage());
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
    //Método para mostrar en la tabla los datos de MySQL para las teleras
//------------------------------------------------------------------------------
    public void MostrarBolillosLisos() {
    String sql = "SELECT lp.LP_Fecha, lpp.LPP_Cantidad, lp.LP_IDClienteReparto, lpp.LPP_IDListaPedido, lpp.LPP_IDVariedadPan " +
                 "FROM ListaPedido lp " +
                 "INNER JOIN ListaPedidoPan lpp ON lp.IDListaPedido = lpp.LPP_IDListaPedido " +
                 "WHERE lpp.LPP_IDVariedadPan = 2";

    Connection conexion = Conexion.conectar(); // Usa tu clase estática correctamente

    DefaultTableModel model = new DefaultTableModel();
    String[] columnas = {"Fecha", "Cantidad", "Lista Pedido", "Cliente"};

    for (String columna : columnas) {
        model.addColumn(columna);
    }

    TablaBL.setModel(model);

    try (Statement st = conexion.createStatement(); ResultSet rs = st.executeQuery(sql)) {
        while (rs.next()) {
            String[] datos = new String[4]; // Solo usamos 4 columnas
            datos[0] = rs.getString("LP_Fecha");
            datos[1] = rs.getString("LPP_Cantidad");
            datos[2] = rs.getString("LPP_IDListaPedido");
            datos[3] = rs.getString("LP_IDClienteReparto");

            model.addRow(datos);
        }

        // Opcional: Ajustar ancho de columnas
        TableColumnModel modeloColumnas = TablaBL.getColumnModel();
        modeloColumnas.getColumn(0).setPreferredWidth(100); // Fecha
        modeloColumnas.getColumn(1).setPreferredWidth(50);  // Cantidad
        modeloColumnas.getColumn(2).setPreferredWidth(80);  // Lista Pedido
        modeloColumnas.getColumn(3).setPreferredWidth(80);  // Cliente

    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error al cargar datos: " + e.getMessage());
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
    //Método para mostrar en la tabla los datos de MySQL para las teleras
//------------------------------------------------------------------------------
    public void MostrarBolillosAjonjoli() {
    String sql = "SELECT lp.LP_Fecha, lpp.LPP_Cantidad, lp.LP_IDClienteReparto, lpp.LPP_IDListaPedido, lpp.LPP_IDVariedadPan " +
                 "FROM ListaPedido lp " +
                 "INNER JOIN ListaPedidoPan lpp ON lp.IDListaPedido = lpp.LPP_IDListaPedido " +
                 "WHERE lpp.LPP_IDVariedadPan = 3";

    Connection conexion = Conexion.conectar(); // Usa tu clase estática correctamente

    DefaultTableModel model = new DefaultTableModel();
    String[] columnas = {"Fecha", "Cantidad", "Lista Pedido", "Cliente"};

    for (String columna : columnas) {
        model.addColumn(columna);
    }

    TablaBA.setModel(model);

    try (Statement st = conexion.createStatement(); ResultSet rs = st.executeQuery(sql)) {
        while (rs.next()) {
            String[] datos = new String[4]; // Solo usamos 4 columnas
            datos[0] = rs.getString("LP_Fecha");
            datos[1] = rs.getString("LPP_Cantidad");
            datos[2] = rs.getString("LPP_IDListaPedido");
            datos[3] = rs.getString("LP_IDClienteReparto");

            model.addRow(datos);
        }

        // Opcional: Ajustar ancho de columnas
        TableColumnModel modeloColumnas = TablaBA.getColumnModel();
        modeloColumnas.getColumn(0).setPreferredWidth(100); // Fecha
        modeloColumnas.getColumn(1).setPreferredWidth(50);  // Cantidad
        modeloColumnas.getColumn(2).setPreferredWidth(80);  // Lista Pedido
        modeloColumnas.getColumn(3).setPreferredWidth(80);  // Cliente

    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error al cargar datos: " + e.getMessage());
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaBA;
    private javax.swing.JTable TablaBL;
    private javax.swing.JTable TablaTeleras;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnCalcularBA;
    private javax.swing.JButton btnCalcularBL;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblAceite;
    private javax.swing.JLabel lblAjonjoli;
    private javax.swing.JLabel lblAzucar;
    private javax.swing.JLabel lblBolilloLiso;
    private javax.swing.JLabel lblBolillosAjon;
    private javax.swing.JLabel lblCantidadesMP;
    private javax.swing.JLabel lblCarrosBL;
    private javax.swing.JLabel lblCarrosPublicoBA;
    private javax.swing.JLabel lblCarrosRepartosBA;
    private javax.swing.JLabel lblCarrosRepartosBL;
    private javax.swing.JLabel lblCarrosTelera;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblFecha2;
    private javax.swing.JLabel lblFecha3;
    private javax.swing.JLabel lblFecha4;
    private javax.swing.JLabel lblFechaDia;
    private javax.swing.JLabel lblFechaDia2;
    private javax.swing.JLabel lblFechaDia3;
    private javax.swing.JLabel lblFechaDia4;
    private javax.swing.JLabel lblHarina;
    private javax.swing.JLabel lblIngrese;
    private javax.swing.JLabel lblIngreseBA;
    private javax.swing.JLabel lblIngreseBolillosLisos;
    private javax.swing.JLabel lblLevadura;
    private javax.swing.JLabel lblMantequilla;
    private javax.swing.JLabel lblMateriasPrimas;
    private javax.swing.JLabel lblSal;
    private javax.swing.JLabel lblTablasBL;
    private javax.swing.JLabel lblTablasPublicoBA;
    private javax.swing.JLabel lblTablasRepartosBA;
    private javax.swing.JLabel lblTablasRepartosBL;
    private javax.swing.JLabel lblTablasTelera;
    private javax.swing.JLabel lblTelera;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblTotalBA;
    private javax.swing.JLabel lblTotalBL;
    private javax.swing.JLabel lblTotalBolillosAjonjoli;
    private javax.swing.JLabel lblTotalBolillosLisos;
    private javax.swing.JLabel lblTotalTeleras;
    private javax.swing.JLabel lblVentaPublicoBA;
    private javax.swing.JLabel lblVentaPublicoBL;
    private javax.swing.JLabel lblVentaRepartosBA;
    private javax.swing.JLabel lblVentaRepartosBL;
    private javax.swing.JLabel lblVentasRepartos;
    private javax.swing.JLabel lvlVentaPublicoT;
    private javax.swing.JTextField txtAjonjoli;
    private javax.swing.JTextField txtAzucar;
    private javax.swing.JTextField txtCarrosPublicoBA;
    private javax.swing.JTextField txtCarrosPublicoBL;
    private javax.swing.JTextField txtCarrosPublicoTelera;
    private javax.swing.JTextField txtCarrosRepartosBA;
    private javax.swing.JTextField txtCarrosRepartosBL;
    private javax.swing.JTextField txtCarrosRepartosTelera;
    private javax.swing.JTextField txtGrasaVegetal;
    private javax.swing.JTextField txtHarina;
    private javax.swing.JTextField txtLevadura;
    private javax.swing.JTextField txtMantequilla;
    private javax.swing.JTextField txtSal;
    private javax.swing.JTextField txtTablasPublicoBA;
    private javax.swing.JTextField txtTablasPublicoBL;
    private javax.swing.JTextField txtTablasPublicoTelera;
    private javax.swing.JTextField txtTablasRepartosBA;
    private javax.swing.JTextField txtTablasRepartosBL;
    private javax.swing.JTextField txtTablasRepartosTelera;
    // End of variables declaration//GEN-END:variables

//------------------------------------------------------------------------------
//Método para imprimir
    public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
        
    if(pageIndex == 0){
    Graphics2D graphics2d=(Graphics2D) graphics;
    graphics2d.translate(pageFormat.getImageableX(), pageFormat.getImageableY());
    printAll(graphics2d);
    return PAGE_EXISTS;
    }
    else{
    return NO_SUCH_PAGE;
    }
    
    
    }
//------------------------------------------------------------------------------
}
