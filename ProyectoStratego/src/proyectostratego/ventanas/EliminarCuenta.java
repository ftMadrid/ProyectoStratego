package proyectostratego.ventanas;

import javax.swing.JOptionPane;
import proyectostratego.eventos.Jugador;
import proyectostratego.utilidades.Fondos;

public class EliminarCuenta extends javax.swing.JFrame {

    public EliminarCuenta() {
        initComponents();
        setTitle("Stratego Marvel Heroes");
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new Fondos("/proyectostratego/imagenes/fondomenuprincipal.png");
        titulo = new javax.swing.JLabel();
        labelInstrucciones = new javax.swing.JLabel();
        labelPassword = new javax.swing.JLabel();
        password = new javax.swing.JTextField();
        botonConfirmar = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        titulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectostratego/imagenes/eliminarcuentatext.png"))); // NOI18N

        labelInstrucciones.setFont(new java.awt.Font("ITF Devanagari", 1, 16)); // NOI18N
        labelInstrucciones.setForeground(new java.awt.Color(255, 255, 255));
        labelInstrucciones.setText("Para confirmar el proceso ingrese la contraseña de su cuenta");

        labelPassword.setFont(new java.awt.Font("ITF Devanagari", 1, 18)); // NOI18N
        labelPassword.setForeground(new java.awt.Color(255, 255, 255));
        labelPassword.setText("Contraseña:");

        password.setFont(new java.awt.Font("ITF Devanagari", 0, 18)); // NOI18N
        password.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });

        botonConfirmar.setFont(new java.awt.Font("ITF Devanagari", 1, 18)); // NOI18N
        botonConfirmar.setForeground(new java.awt.Color(0, 204, 0));
        botonConfirmar.setText("Confirmar");
        botonConfirmar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonConfirmarActionPerformed(evt);
            }
        });

        botonSalir.setFont(new java.awt.Font("ITF Devanagari", 1, 18)); // NOI18N
        botonSalir.setForeground(new java.awt.Color(255, 51, 51));
        botonSalir.setText("Regresar");
        botonSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(labelInstrucciones)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(86, Short.MAX_VALUE)
                .addComponent(titulo)
                .addGap(94, 94, 94))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelPassword)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(244, 244, 244)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelInstrucciones)
                .addGap(50, 50, 50)
                .addComponent(labelPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(botonConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(84, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void botonConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConfirmarActionPerformed
        // TODO add your handling code here:
        if (Jugador.jugadorLog.validarPass(password.getText())) {
            Jugador.eliminarJugador(Jugador.jugadorLog.getUsername());
            JOptionPane.showMessageDialog(this, "El usuario "+Jugador.jugadorLog.getUsername()+" fue eliminado!.");
            MenuInicial menuinicial = new MenuInicial();
            menuinicial.setVisible(true);
            menuinicial.setLocationRelativeTo(this);
            dispose();
        }else{
            JOptionPane.showMessageDialog(this, "La contraseña ingresada es incorrecta.");
        }
    }//GEN-LAST:event_botonConfirmarActionPerformed

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        // TODO add your handling code here:
        MiPerfil miperfil = new MiPerfil();
        miperfil.setVisible(true);
        miperfil.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_botonSalirActionPerformed

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
            java.util.logging.Logger.getLogger(EliminarCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EliminarCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EliminarCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EliminarCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EliminarCuenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonConfirmar;
    private javax.swing.JButton botonSalir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelInstrucciones;
    private javax.swing.JLabel labelPassword;
    private javax.swing.JTextField password;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
