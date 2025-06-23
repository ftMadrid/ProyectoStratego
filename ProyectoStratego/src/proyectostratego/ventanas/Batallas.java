package proyectostratego.ventanas;

import proyectostratego.utilidades.Jugador;
import proyectostratego.utilidades.Fondos;
import proyectostratego.utilidades.StatsGlobales;

public class Batallas extends javax.swing.JFrame {

    public Batallas() {
        initComponents();
        
        setTitle("Stratego Marvel Heroes");
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        
        uActivos.setText(""+Jugador.nUsuariosTotal);
        uHistoricos.setText(""+(Jugador.nUsuariosTotal+Jugador.nUsuariosEliminadosTotal));
        pJugadas.setText(""+ StatsGlobales.getPartidas());
        vHeroes.setText(""+ StatsGlobales.getVictoriasHeroes());
        vVillanos.setText(""+ StatsGlobales.getVictoriasVillanos());
        Empates.setText(""+StatsGlobales.getEmpates());
        
        uActivos.setOpaque(true);
        labeluActivos.setOpaque(true);
        uHistoricos.setOpaque(true);
        labeluHistoricos.setOpaque(true);
        pJugadas.setOpaque(true);
        labelpJugadas.setOpaque(true);
        vHeroes.setOpaque(true);
        labelvHeroes.setOpaque(true);
        vVillanos.setOpaque(true);
        labelvVillanos.setOpaque(true);
        Empates.setOpaque(true);
        labelEmpates.setOpaque(true);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new Fondos("/proyectostratego/imagenes/fondomenuprincipal.png");
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        uActivos = new javax.swing.JLabel();
        labeluActivos = new javax.swing.JLabel();
        uHistoricos = new javax.swing.JLabel();
        labeluHistoricos = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pJugadas = new javax.swing.JLabel();
        labelpJugadas = new javax.swing.JLabel();
        vHeroes = new javax.swing.JLabel();
        labelvHeroes = new javax.swing.JLabel();
        vVillanos = new javax.swing.JLabel();
        labelvVillanos = new javax.swing.JLabel();
        regresar = new javax.swing.JButton();
        Empates = new javax.swing.JLabel();
        labelEmpates = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectostratego/imagenes/batallastext.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Kefa", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Estadisticas de Actividad");

        uActivos.setBackground(new java.awt.Color(255, 255, 255));
        uActivos.setFont(new java.awt.Font("Kefa", 1, 36)); // NOI18N
        uActivos.setForeground(new java.awt.Color(0, 0, 0));
        uActivos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        uActivos.setText("1");
        uActivos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 0), 4));

        labeluActivos.setBackground(new java.awt.Color(102, 102, 255));
        labeluActivos.setFont(new java.awt.Font("Kefa", 1, 32)); // NOI18N
        labeluActivos.setForeground(new java.awt.Color(255, 255, 255));
        labeluActivos.setText("   Usuarios Activos");
        labeluActivos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0), 4));

        uHistoricos.setBackground(new java.awt.Color(255, 255, 255));
        uHistoricos.setFont(new java.awt.Font("Kefa", 1, 36)); // NOI18N
        uHistoricos.setForeground(new java.awt.Color(0, 0, 0));
        uHistoricos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        uHistoricos.setText("1");
        uHistoricos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 0), 4));

        labeluHistoricos.setBackground(new java.awt.Color(102, 102, 255));
        labeluHistoricos.setFont(new java.awt.Font("Kefa", 1, 32)); // NOI18N
        labeluHistoricos.setForeground(new java.awt.Color(255, 255, 255));
        labeluHistoricos.setText("   Usuarios Historicos");
        labeluHistoricos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0), 4));

        jLabel3.setFont(new java.awt.Font("Kefa", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Estadisticas de Partidas");

        pJugadas.setBackground(new java.awt.Color(255, 255, 255));
        pJugadas.setFont(new java.awt.Font("Kefa", 1, 36)); // NOI18N
        pJugadas.setForeground(new java.awt.Color(0, 0, 0));
        pJugadas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pJugadas.setText("1");
        pJugadas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 0), 4));

        labelpJugadas.setBackground(new java.awt.Color(102, 102, 255));
        labelpJugadas.setFont(new java.awt.Font("Kefa", 1, 32)); // NOI18N
        labelpJugadas.setForeground(new java.awt.Color(255, 255, 255));
        labelpJugadas.setText("   Partidas Jugadas");
        labelpJugadas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0), 4));

        vHeroes.setBackground(new java.awt.Color(255, 255, 255));
        vHeroes.setFont(new java.awt.Font("Kefa", 1, 36)); // NOI18N
        vHeroes.setForeground(new java.awt.Color(0, 0, 0));
        vHeroes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vHeroes.setText("1");
        vHeroes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 0), 4));

        labelvHeroes.setBackground(new java.awt.Color(102, 102, 255));
        labelvHeroes.setFont(new java.awt.Font("Kefa", 1, 32)); // NOI18N
        labelvHeroes.setForeground(new java.awt.Color(255, 255, 255));
        labelvHeroes.setText("   Victorias de Heroes");
        labelvHeroes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0), 4));

        vVillanos.setBackground(new java.awt.Color(255, 255, 255));
        vVillanos.setFont(new java.awt.Font("Kefa", 1, 36)); // NOI18N
        vVillanos.setForeground(new java.awt.Color(0, 0, 0));
        vVillanos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vVillanos.setText("1");
        vVillanos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 0), 4));

        labelvVillanos.setBackground(new java.awt.Color(102, 102, 255));
        labelvVillanos.setFont(new java.awt.Font("Kefa", 1, 32)); // NOI18N
        labelvVillanos.setForeground(new java.awt.Color(255, 255, 255));
        labelvVillanos.setText("   Victorias de Villanos");
        labelvVillanos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0), 4));

        regresar.setFont(new java.awt.Font("Kefa", 1, 24)); // NOI18N
        regresar.setForeground(new java.awt.Color(255, 0, 0));
        regresar.setText("Regresar");
        regresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });

        Empates.setBackground(new java.awt.Color(255, 255, 255));
        Empates.setFont(new java.awt.Font("Kefa", 1, 36)); // NOI18N
        Empates.setForeground(new java.awt.Color(0, 0, 0));
        Empates.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Empates.setText("1");
        Empates.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 0), 4));

        labelEmpates.setBackground(new java.awt.Color(102, 102, 255));
        labelEmpates.setFont(new java.awt.Font("Kefa", 1, 32)); // NOI18N
        labelEmpates.setForeground(new java.awt.Color(255, 255, 255));
        labelEmpates.setText("   Partidas Empatadas");
        labelEmpates.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0), 4));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(jLabel3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(vVillanos, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelvVillanos, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(vHeroes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(pJugadas, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelpJugadas, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelvHeroes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addComponent(jLabel2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(uHistoricos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(uActivos, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labeluActivos, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labeluHistoricos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Empates, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelEmpates, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(jLabel1)))
                .addGap(87, 87, 87))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(237, 237, 237))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(uActivos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labeluActivos, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(uHistoricos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labeluHistoricos, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pJugadas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelpJugadas, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(vHeroes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelvHeroes, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(vVillanos)
                    .addComponent(labelvVillanos, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Empates, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelEmpates, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
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
        
        System.out.println("[CONSOLE LOG] Saliendo del menu Batallas.");
        System.out.println("[CONSOLE LOG] Ejecutando el menu Universo Marvel.\n");

        UniversoMarvel umarvel = new UniversoMarvel();
        umarvel.setVisible(true);
        umarvel.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_regresarActionPerformed

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
            java.util.logging.Logger.getLogger(Batallas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Batallas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Batallas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Batallas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Batallas().setVisible(true);
            }
        });*/
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Empates;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelEmpates;
    private javax.swing.JLabel labelpJugadas;
    private javax.swing.JLabel labeluActivos;
    private javax.swing.JLabel labeluHistoricos;
    private javax.swing.JLabel labelvHeroes;
    private javax.swing.JLabel labelvVillanos;
    private javax.swing.JLabel pJugadas;
    private javax.swing.JButton regresar;
    private javax.swing.JLabel uActivos;
    private javax.swing.JLabel uHistoricos;
    private javax.swing.JLabel vHeroes;
    private javax.swing.JLabel vVillanos;
    // End of variables declaration//GEN-END:variables
}
