package proyectostratego.ventanas;

import proyectostratego.eventos.Jugador;
import proyectostratego.utilidades.Fondos;

public class MiPerfil extends javax.swing.JFrame {

    public MiPerfil() {
        initComponents();
        setTitle("Stratego Marvel Heroes");
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        jLabel2.setText(Jugador.jugadorLog.username);
        Puntos.setText(""+Jugador.jugadorLog.puntos);
        pHeroes.setText(""+Jugador.jugadorLog.heroesPartidas);
        pVillanos.setText(""+Jugador.jugadorLog.villanosPartidas);
        Victorias.setText(""+Jugador.jugadorLog.victorias);
        Derrotas.setText(""+Jugador.jugadorLog.derrotas);
        Puntos.setOpaque(true);
        labelPuntos.setOpaque(true);
        pHeroes.setOpaque(true);
        labelpHeroes.setOpaque(true);
        pVillanos.setOpaque(true);
        labelpVillanos.setOpaque(true);
        Victorias.setOpaque(true);
        labelVictorias.setOpaque(true);
        Derrotas.setOpaque(true);
        labelDerrotas.setOpaque(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new Fondos("/proyectostratego/imagenes/fondomenuprincipal.png");
        titulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cambiarPassword = new javax.swing.JButton();
        eliminarCuenta = new javax.swing.JButton();
        regresar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Puntos = new javax.swing.JLabel();
        labelPuntos = new javax.swing.JLabel();
        pHeroes = new javax.swing.JLabel();
        labelpHeroes = new javax.swing.JLabel();
        pVillanos = new javax.swing.JLabel();
        labelpVillanos = new javax.swing.JLabel();
        Victorias = new javax.swing.JLabel();
        labelVictorias = new javax.swing.JLabel();
        Derrotas = new javax.swing.JLabel();
        labelDerrotas = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        titulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectostratego/imagenes/miperfiltexto.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Kefa", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ESTADISTICAS");

        cambiarPassword.setFont(new java.awt.Font("Kefa", 1, 20)); // NOI18N
        cambiarPassword.setForeground(new java.awt.Color(0, 153, 255));
        cambiarPassword.setText("CAMBIAR PASSWORD");
        cambiarPassword.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cambiarPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiarPasswordActionPerformed(evt);
            }
        });

        eliminarCuenta.setFont(new java.awt.Font("Kefa", 1, 20)); // NOI18N
        eliminarCuenta.setForeground(new java.awt.Color(0, 153, 255));
        eliminarCuenta.setText("ELIMINAR CUENTA");
        eliminarCuenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eliminarCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarCuentaActionPerformed(evt);
            }
        });

        regresar.setFont(new java.awt.Font("Kefa", 1, 24)); // NOI18N
        regresar.setForeground(new java.awt.Color(255, 0, 51));
        regresar.setText("Regresar");
        regresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Kefa", 3, 44)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Jugador");

        Puntos.setBackground(new java.awt.Color(255, 255, 255));
        Puntos.setFont(new java.awt.Font("Kefa", 1, 36)); // NOI18N
        Puntos.setForeground(new java.awt.Color(0, 0, 0));
        Puntos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Puntos.setText("1");
        Puntos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 0), 4));

        labelPuntos.setBackground(new java.awt.Color(102, 102, 255));
        labelPuntos.setFont(new java.awt.Font("Kefa", 1, 36)); // NOI18N
        labelPuntos.setForeground(new java.awt.Color(255, 255, 255));
        labelPuntos.setText("   Puntos");
        labelPuntos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0), 4));

        pHeroes.setBackground(new java.awt.Color(255, 255, 255));
        pHeroes.setFont(new java.awt.Font("Kefa", 1, 36)); // NOI18N
        pHeroes.setForeground(new java.awt.Color(0, 0, 0));
        pHeroes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pHeroes.setText("1");
        pHeroes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 0), 4));

        labelpHeroes.setBackground(new java.awt.Color(102, 102, 255));
        labelpHeroes.setFont(new java.awt.Font("Kefa", 1, 36)); // NOI18N
        labelpHeroes.setForeground(new java.awt.Color(255, 255, 255));
        labelpHeroes.setText("   Partidas Heroes");
        labelpHeroes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0), 4));

        pVillanos.setBackground(new java.awt.Color(255, 255, 255));
        pVillanos.setFont(new java.awt.Font("Kefa", 1, 36)); // NOI18N
        pVillanos.setForeground(new java.awt.Color(0, 0, 0));
        pVillanos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pVillanos.setText("1");
        pVillanos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 0), 4));

        labelpVillanos.setBackground(new java.awt.Color(102, 102, 255));
        labelpVillanos.setFont(new java.awt.Font("Kefa", 1, 36)); // NOI18N
        labelpVillanos.setForeground(new java.awt.Color(255, 255, 255));
        labelpVillanos.setText("   Partidas Villanos");
        labelpVillanos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0), 4));

        Victorias.setBackground(new java.awt.Color(255, 255, 255));
        Victorias.setFont(new java.awt.Font("Kefa", 1, 36)); // NOI18N
        Victorias.setForeground(new java.awt.Color(0, 0, 0));
        Victorias.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Victorias.setText("1");
        Victorias.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 0), 4));

        labelVictorias.setBackground(new java.awt.Color(102, 102, 255));
        labelVictorias.setFont(new java.awt.Font("Kefa", 1, 36)); // NOI18N
        labelVictorias.setForeground(new java.awt.Color(255, 255, 255));
        labelVictorias.setText("   Victorias");
        labelVictorias.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0), 4));

        Derrotas.setBackground(new java.awt.Color(255, 255, 255));
        Derrotas.setFont(new java.awt.Font("Kefa", 1, 36)); // NOI18N
        Derrotas.setForeground(new java.awt.Color(0, 0, 0));
        Derrotas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Derrotas.setText("1");
        Derrotas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 0), 4));

        labelDerrotas.setBackground(new java.awt.Color(102, 102, 255));
        labelDerrotas.setFont(new java.awt.Font("Kefa", 1, 36)); // NOI18N
        labelDerrotas.setForeground(new java.awt.Color(255, 255, 255));
        labelDerrotas.setText("   Derrotas");
        labelDerrotas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0), 4));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titulo)
                .addGap(217, 217, 217))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Victorias, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelVictorias, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Derrotas, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelDerrotas, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(Puntos, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(labelPuntos, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(pHeroes, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(labelpHeroes, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(pVillanos, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(labelpVillanos, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(cambiarPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(eliminarCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(titulo)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addComponent(cambiarPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(eliminarCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelPuntos, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Puntos, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pHeroes, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelpHeroes, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pVillanos, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelpVillanos, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Victorias, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelVictorias, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Derrotas, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelDerrotas, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(31, Short.MAX_VALUE))
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

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
        // TODO add your handling code here:
        MenuPrincipal menuprincipal = new MenuPrincipal();
        menuprincipal.setVisible(true);
        menuprincipal.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_regresarActionPerformed

    private void eliminarCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarCuentaActionPerformed
        // TODO add your handling code here:
        EliminarCuenta eliminarcuenta = new EliminarCuenta();
        eliminarcuenta.setVisible(true);
        eliminarcuenta.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_eliminarCuentaActionPerformed

    private void cambiarPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambiarPasswordActionPerformed
        // TODO add your handling code here:
        CambiarPassword cpassword = new CambiarPassword();
        cpassword.setVisible(true);
        cpassword.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_cambiarPasswordActionPerformed

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
            java.util.logging.Logger.getLogger(MiPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MiPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MiPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MiPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MiPerfil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Derrotas;
    private javax.swing.JLabel Puntos;
    private javax.swing.JLabel Victorias;
    private javax.swing.JButton cambiarPassword;
    private javax.swing.JButton eliminarCuenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelDerrotas;
    private javax.swing.JLabel labelPuntos;
    private javax.swing.JLabel labelVictorias;
    private javax.swing.JLabel labelpHeroes;
    private javax.swing.JLabel labelpVillanos;
    private javax.swing.JLabel pHeroes;
    private javax.swing.JLabel pVillanos;
    private javax.swing.JButton regresar;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
