package proyectostratego.ventanas;

import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import proyectostratego.eventos.GenerarTablero;
import proyectostratego.eventos.Jugador;
import proyectostratego.utilidades.pieza;

public class Juego extends javax.swing.JFrame {

    Jugador heroe = Jugador.getHeroe();
    MenuPrincipal menu = new MenuPrincipal();
    private GenerarTablero tablero;

    public Juego() {
        initComponents();

        panelHeroesMuertos.setLayout(new GridLayout(0, 8, 2, 2)); // 5 columnas, filas dinámicas
        panelVillanosMuertos.setLayout(new GridLayout(0, 8, 2, 2));

        showTurno.setText(heroe.username);
        tablero = new GenerarTablero(this);
        tablero.setOpaque(false);
        tablero.setBounds(0, 0, jLabel1.getWidth(), jLabel1.getHeight()); // Mismo tamaño que el tablero (La ventana)
        jLabel1.setLayout(null); // Se sobrepone por asi decirlo
        jLabel1.add(tablero); //Se agrega al mismo jlabel
    }

    public static void setTurno(String turno) {
        showTurno.setText(turno);
    }

    public void agregarPiezaMuerta(pieza piezaMuerta) {
        JLabel label = new JLabel(new ImageIcon(piezaMuerta.imagenOriginal));
        if (piezaMuerta.heroe) {
            panelHeroesMuertos.add(label);
            panelHeroesMuertos.revalidate();
            panelHeroesMuertos.repaint();
        } else {
            panelVillanosMuertos.add(label);
            panelVillanosMuertos.revalidate();
            panelVillanosMuertos.repaint();
        }
    }
    
    public static void setPelea(String pelea)
    {
    Pelea.setText(pelea);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        labelTurno = new javax.swing.JLabel();
        showTurno = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        panelVillanosMuertos = new javax.swing.JPanel();
        panelHeroesMuertos = new javax.swing.JPanel();
        labelTurno1 = new javax.swing.JLabel();
        Pelea = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectostratego/imagenes/Mapamaybe2.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        labelTurno.setFont(new java.awt.Font("Kefa", 1, 36)); // NOI18N
        labelTurno.setText("Turno:");

        showTurno.setFont(new java.awt.Font("Kefa", 1, 36)); // NOI18N
        showTurno.setText("Heroes");

        jButton1.setFont(new java.awt.Font("Kefa", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 0, 0));
        jButton1.setText("Rendirse");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelVillanosMuertosLayout = new javax.swing.GroupLayout(panelVillanosMuertos);
        panelVillanosMuertos.setLayout(panelVillanosMuertosLayout);
        panelVillanosMuertosLayout.setHorizontalGroup(
            panelVillanosMuertosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
        );
        panelVillanosMuertosLayout.setVerticalGroup(
            panelVillanosMuertosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelHeroesMuertosLayout = new javax.swing.GroupLayout(panelHeroesMuertos);
        panelHeroesMuertos.setLayout(panelHeroesMuertosLayout);
        panelHeroesMuertosLayout.setHorizontalGroup(
            panelHeroesMuertosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelHeroesMuertosLayout.setVerticalGroup(
            panelHeroesMuertosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );

        labelTurno1.setFont(new java.awt.Font("Kefa", 1, 36)); // NOI18N
        labelTurno1.setText("ULTIMA PELEA");

        Pelea.setFont(new java.awt.Font("Kefa", 1, 14)); // NOI18N
        Pelea.setText("N\\A");
        Pelea.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelTurno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(showTurno)
                        .addContainerGap(564, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(panelVillanosMuertos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(panelHeroesMuertos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(Pelea, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labelTurno1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelVillanosMuertos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(139, 139, 139)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(showTurno)
                            .addComponent(labelTurno))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelTurno1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Pelea)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelHeroesMuertos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        int opcion = JOptionPane.showConfirmDialog(null, "¿Estás seguro?", "Confirmación para Rendirse", JOptionPane.YES_NO_OPTION);

        if (opcion == JOptionPane.YES_OPTION) {

            tablero.Rendirse();

            JFrame ventana = (JFrame) SwingUtilities.getWindowAncestor(this);
            if (ventana != null) {
                MenuPrincipal ventanas = new MenuPrincipal();
                ventanas.setVisible(true);
                ventanas.setLocationRelativeTo(null);
                ventana.dispose();
            }

        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Juego().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JLabel Pelea;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelTurno;
    private javax.swing.JLabel labelTurno1;
    private javax.swing.JPanel panelHeroesMuertos;
    private javax.swing.JPanel panelVillanosMuertos;
    private static javax.swing.JLabel showTurno;
    // End of variables declaration//GEN-END:variables
}
