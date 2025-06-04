package proyectostratego.ventanas;

import javax.swing.JOptionPane;
import proyectostratego.eventos.Jugador;
import proyectostratego.utilidades.Fondos;

public class CambiarPassword extends javax.swing.JFrame {

    public CambiarPassword() {
        initComponents();
        setTitle("Stratego Marvel Heroes");
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new Fondos("/proyectostratego/imagenes/fondomenuprincipal.png");
        titulo = new javax.swing.JLabel();
        labelPasswordActual = new javax.swing.JLabel();
        passwordActual = new javax.swing.JTextField();
        labelPasswordNueva = new javax.swing.JLabel();
        passwordNueva = new javax.swing.JTextField();
        botonCambiar = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        titulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectostratego/imagenes/cambiarpasswordtext.png"))); // NOI18N

        labelPasswordActual.setFont(new java.awt.Font("ITF Devanagari", 1, 18)); // NOI18N
        labelPasswordActual.setForeground(new java.awt.Color(255, 255, 255));
        labelPasswordActual.setText("Contraseña Actual:");

        passwordActual.setFont(new java.awt.Font("ITF Devanagari", 0, 18)); // NOI18N
        passwordActual.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        passwordActual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActualActionPerformed(evt);
            }
        });

        labelPasswordNueva.setFont(new java.awt.Font("ITF Devanagari", 1, 18)); // NOI18N
        labelPasswordNueva.setForeground(new java.awt.Color(255, 255, 255));
        labelPasswordNueva.setText("Contraseña Nueva:");

        passwordNueva.setFont(new java.awt.Font("ITF Devanagari", 0, 18)); // NOI18N
        passwordNueva.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        passwordNueva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordNuevaActionPerformed(evt);
            }
        });

        botonCambiar.setFont(new java.awt.Font("ITF Devanagari", 1, 18)); // NOI18N
        botonCambiar.setForeground(new java.awt.Color(0, 204, 0));
        botonCambiar.setText("Cambiar");
        botonCambiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonCambiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCambiarActionPerformed(evt);
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(titulo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelPasswordNueva)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(passwordNueva, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelPasswordActual)
                                    .addComponent(passwordActual, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(252, 252, 252)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonCambiar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(92, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(titulo)
                .addGap(18, 18, 18)
                .addComponent(labelPasswordActual)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordActual, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelPasswordNueva)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordNueva, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(botonCambiar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
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

    private void passwordActualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActualActionPerformed

    private void passwordNuevaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordNuevaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordNuevaActionPerformed

    private void botonCambiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCambiarActionPerformed
        // TODO add your handling code here:
        if (Jugador.jugadorLog.validarPass(passwordActual.getText())) {
            if (passwordNueva.getText().contains(" ")) {
                JOptionPane.showMessageDialog(this, "No puedes tener espacios en la contraseña");
            } else if (passwordNueva.getText().length() != 5) {
                JOptionPane.showMessageDialog(this, "La contraseña tiene que ser unicamente de 5 caracteres");
            } else {
                Jugador.jugadorLog.nuevaPass(passwordNueva.getText());
                JOptionPane.showMessageDialog(this, "Contraseña actualizada correctamente.");
                MiPerfil miperfil = new MiPerfil();
                miperfil.setVisible(true);
                miperfil.setLocationRelativeTo(null);
                dispose();
            }
        }else{
            JOptionPane.showMessageDialog(this, "La contraseña actual ingresada es incorrecta.");
        }
    }//GEN-LAST:event_botonCambiarActionPerformed

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
            java.util.logging.Logger.getLogger(CambiarPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CambiarPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CambiarPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CambiarPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CambiarPassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCambiar;
    private javax.swing.JButton botonSalir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelPasswordActual;
    private javax.swing.JLabel labelPasswordNueva;
    private javax.swing.JTextField passwordActual;
    private javax.swing.JTextField passwordNueva;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
