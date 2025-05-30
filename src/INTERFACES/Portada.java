/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package INTERFACES;

/**
 *
 * @author Paola Barrera Tenorio 2192007348
 */
public class Portada extends javax.swing.JFrame {

    /**
     * Creates new form Portada
     */
    public Portada() {
        initComponents();
        
        this.setTitle("Panificadora La Izcalli");
        
        this.setLocationRelativeTo(Portada.this);
        this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel_Crema = new javax.swing.JPanel();
        Panel_Marron = new javax.swing.JPanel();
        lblLema1 = new javax.swing.JLabel();
        lblLema2 = new javax.swing.JLabel();
        lblLema3 = new javax.swing.JLabel();
        lblImagen2 = new javax.swing.JLabel();
        lblPanificadora = new javax.swing.JLabel();
        lblIzcalli = new javax.swing.JLabel();
        btnAcceder = new javax.swing.JButton();
        lblImagen = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblDireccion = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1024, 768));
        setPreferredSize(new java.awt.Dimension(1024, 768));

        Panel_Crema.setBackground(new java.awt.Color(245, 233, 218));

        Panel_Marron.setBackground(new java.awt.Color(165, 105, 66));

        lblLema1.setBackground(new java.awt.Color(255, 255, 255));
        lblLema1.setFont(new java.awt.Font("STLiti", 0, 36)); // NOI18N
        lblLema1.setForeground(new java.awt.Color(255, 255, 255));
        lblLema1.setText("\"La magia del buen pan");

        lblLema2.setFont(new java.awt.Font("STLiti", 0, 36)); // NOI18N
        lblLema2.setForeground(new java.awt.Color(255, 255, 255));
        lblLema2.setText("siempre fresco,");

        lblLema3.setFont(new java.awt.Font("STLiti", 0, 36)); // NOI18N
        lblLema3.setForeground(new java.awt.Color(255, 255, 255));
        lblLema3.setText("siempre cerca\"");

        lblImagen2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Captura de pantalla 2024-10-08 195104.png"))); // NOI18N

        javax.swing.GroupLayout Panel_MarronLayout = new javax.swing.GroupLayout(Panel_Marron);
        Panel_Marron.setLayout(Panel_MarronLayout);
        Panel_MarronLayout.setHorizontalGroup(
            Panel_MarronLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_MarronLayout.createSequentialGroup()
                .addGroup(Panel_MarronLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblImagen2, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Panel_MarronLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(Panel_MarronLayout.createSequentialGroup()
                            .addGap(47, 47, 47)
                            .addComponent(lblLema1))
                        .addGroup(Panel_MarronLayout.createSequentialGroup()
                            .addGap(107, 107, 107)
                            .addGroup(Panel_MarronLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblLema3, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblLema2)))))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        Panel_MarronLayout.setVerticalGroup(
            Panel_MarronLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_MarronLayout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(lblLema1)
                .addGap(32, 32, 32)
                .addComponent(lblLema2)
                .addGap(32, 32, 32)
                .addComponent(lblLema3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblImagen2, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        lblPanificadora.setFont(new java.awt.Font("Castellar", 0, 48)); // NOI18N
        lblPanificadora.setText("-Panificadora-");

        lblIzcalli.setFont(new java.awt.Font("STLiti", 0, 48)); // NOI18N
        lblIzcalli.setText("\"La Izcalli\"");

        btnAcceder.setBackground(new java.awt.Color(252, 211, 125));
        btnAcceder.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        btnAcceder.setText("Acceder");
        btnAcceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccederActionPerformed(evt);
            }
        });

        lblImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Captura de pantalla 2024-10-08 194340.png"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(233, 190, 180));

        lblDireccion.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        lblDireccion.setText("General Emiliano Zapata 141, Cuartos Constitución 53690, Naucalpan de Juárez");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblDireccion)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(lblDireccion)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        btnSalir.setBackground(new java.awt.Color(252, 211, 125));
        btnSalir.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        btnSalir.setText("Salir del sistema");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Panel_CremaLayout = new javax.swing.GroupLayout(Panel_Crema);
        Panel_Crema.setLayout(Panel_CremaLayout);
        Panel_CremaLayout.setHorizontalGroup(
            Panel_CremaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_CremaLayout.createSequentialGroup()
                .addGroup(Panel_CremaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_CremaLayout.createSequentialGroup()
                        .addGroup(Panel_CremaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(Panel_CremaLayout.createSequentialGroup()
                                .addGroup(Panel_CremaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(Panel_CremaLayout.createSequentialGroup()
                                        .addGap(210, 210, 210)
                                        .addComponent(lblIzcalli, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(Panel_CremaLayout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(Panel_CremaLayout.createSequentialGroup()
                                        .addGap(264, 264, 264)
                                        .addComponent(btnAcceder)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_CremaLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblPanificadora)
                        .addGap(59, 59, 59))
                    .addGroup(Panel_CremaLayout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addComponent(btnSalir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(Panel_Marron, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        Panel_CremaLayout.setVerticalGroup(
            Panel_CremaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_Marron, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(Panel_CremaLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblImagen)
                .addGap(18, 18, 18)
                .addComponent(lblPanificadora)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblIzcalli)
                .addGap(33, 33, 33)
                .addComponent(btnAcceder)
                .addGap(26, 26, 26)
                .addComponent(btnSalir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_Crema, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_Crema, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

//Botón Acceder
    private void btnAccederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccederActionPerformed
        EleccionUsuario usuario = new EleccionUsuario();
        usuario.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAccederActionPerformed

//Botón Salir
    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

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
            java.util.logging.Logger.getLogger(Portada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Portada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Portada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Portada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Portada().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel_Crema;
    private javax.swing.JPanel Panel_Marron;
    private javax.swing.JButton btnAcceder;
    private javax.swing.JButton btnSalir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblImagen2;
    private javax.swing.JLabel lblIzcalli;
    private javax.swing.JLabel lblLema1;
    private javax.swing.JLabel lblLema2;
    private javax.swing.JLabel lblLema3;
    private javax.swing.JLabel lblPanificadora;
    // End of variables declaration//GEN-END:variables
}
