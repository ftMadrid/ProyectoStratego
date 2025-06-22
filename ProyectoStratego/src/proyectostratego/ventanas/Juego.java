package proyectostratego.ventanas;

import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import proyectostratego.eventos.GenerarTablero;
import proyectostratego.eventos.Jugador;
import proyectostratego.utilidades.Fondos;
import proyectostratego.utilidades.pieza;

public class Juego extends javax.swing.JFrame {

    Jugador heroe = Jugador.getHeroe();
    private GenerarTablero tablero;
    
    // Contadores para el conteo de piezas muertas
    private int contadorHeroesMuertos = 0;
    private int contadorVillanosMuertos = 0;

    // Paneles/columnas para piezas muertas
    private JPanel[] columnasHeroes = new JPanel[4];
    private JPanel[] columnasVillanos = new JPanel[4];

    public Juego() {
        initComponents();
        
        setTitle("Stratego Marvel Heroes | "+Jugador.jugadorLog.username+" vs "+Jugador.jugadorContrincante.username);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);

        // logica para la formacion de los paneles: 1 fila, 4 columnas
        panelHeroesMuertos.setLayout(new GridLayout(1, 4, 2, 2));
        panelVillanosMuertos.setLayout(new GridLayout(1, 4, 2, 2));

        // agrega 4 paneles/columna verticales para Héroes
        for (int i = 0; i < 4; i++) {
            columnasHeroes[i] = new JPanel();
            columnasHeroes[i].setLayout(new BoxLayout(columnasHeroes[i], BoxLayout.Y_AXIS));
            panelHeroesMuertos.add(columnasHeroes[i]);
        }

        // agrega 4 paneles/columna verticales para Villanos
        for (int i = 0; i < 4; i++) {
            columnasVillanos[i] = new JPanel();
            columnasVillanos[i].setLayout(new BoxLayout(columnasVillanos[i], BoxLayout.Y_AXIS));
            panelVillanosMuertos.add(columnasVillanos[i]);
        }

        showTurno.setText(heroe.username);
        tablero = new GenerarTablero(this);
        tablero.setOpaque(false);
        tablero.setBounds(0, 0, jLabel1.getWidth(), jLabel1.getHeight());
        jLabel1.setLayout(null);
        jLabel1.add(tablero);
    }

    public static void setTurno(String turno) {
        showTurno.setText(turno);
    }

    public void agregarPiezaMuerta(pieza piezaMuerta) {
        JLabel label = new JLabel(new ImageIcon(piezaMuerta.imagenMuertes));

        if (piezaMuerta.heroe) {
            int col = contadorHeroesMuertos / 10;  // columna de 0 a 3
            if (col > 3) col = 3; // para no salir del índice si hay más de 40 piezas

            columnasHeroes[col].add(label);
            columnasHeroes[col].revalidate();
            columnasHeroes[col].repaint();

            contadorHeroesMuertos++;
        } else {
            int col = contadorVillanosMuertos / 10;
            if (col > 3) col = 3;

            columnasVillanos[col].add(label);
            columnasVillanos[col].revalidate();
            columnasVillanos[col].repaint();

            contadorVillanosMuertos++;
        }
    }

    public static void setPelea(String pelea) {
        Pelea.setText(pelea);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new Fondos("/proyectostratego/imagenes/fondotablero.png");
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        showTurno = new javax.swing.JLabel();
        labelTurno = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        labelTurno1 = new javax.swing.JLabel();
        Pelea = new javax.swing.JLabel();
        panelVillanosMuertos = new javax.swing.JPanel();
        panelHeroesMuertos = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectostratego/imagenes/tablero.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0), 4));

        showTurno.setFont(new java.awt.Font("Kefa", 1, 36)); // NOI18N
        showTurno.setForeground(new java.awt.Color(255, 255, 255));
        showTurno.setText("Heroes");

        labelTurno.setFont(new java.awt.Font("Kefa", 1, 36)); // NOI18N
        labelTurno.setForeground(new java.awt.Color(255, 255, 255));
        labelTurno.setText("Turno:");

        jButton1.setFont(new java.awt.Font("Kefa", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 0, 0));
        jButton1.setText("Rendirse");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        labelTurno1.setFont(new java.awt.Font("Kefa", 1, 36)); // NOI18N
        labelTurno1.setForeground(new java.awt.Color(255, 255, 255));
        labelTurno1.setText("ULTIMA PELEA");

        Pelea.setFont(new java.awt.Font("Kefa", 1, 14)); // NOI18N
        Pelea.setForeground(new java.awt.Color(255, 255, 255));
        Pelea.setText("N\\A");
        Pelea.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(showTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTurno))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelTurno1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Pelea, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelTurno1)
                        .addGap(0, 0, 0)
                        .addComponent(Pelea)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(labelTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(showTurno)))
                .addGap(15, 15, 15))
        );

        panelVillanosMuertos.setBackground(new java.awt.Color(255, 255, 255));
        panelVillanosMuertos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelVillanosMuertos.setPreferredSize(new java.awt.Dimension(498, 230));

        javax.swing.GroupLayout panelVillanosMuertosLayout = new javax.swing.GroupLayout(panelVillanosMuertos);
        panelVillanosMuertos.setLayout(panelVillanosMuertosLayout);
        panelVillanosMuertosLayout.setHorizontalGroup(
            panelVillanosMuertosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 236, Short.MAX_VALUE)
        );
        panelVillanosMuertosLayout.setVerticalGroup(
            panelVillanosMuertosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 463, Short.MAX_VALUE)
        );

        panelHeroesMuertos.setBackground(new java.awt.Color(255, 255, 255));
        panelHeroesMuertos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelHeroesMuertos.setPreferredSize(new java.awt.Dimension(498, 230));

        javax.swing.GroupLayout panelHeroesMuertosLayout = new javax.swing.GroupLayout(panelHeroesMuertos);
        panelHeroesMuertos.setLayout(panelHeroesMuertosLayout);
        panelHeroesMuertosLayout.setHorizontalGroup(
            panelHeroesMuertosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 236, Short.MAX_VALUE)
        );
        panelHeroesMuertosLayout.setVerticalGroup(
            panelHeroesMuertosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 463, Short.MAX_VALUE)
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectostratego/imagenes/vcaidos.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectostratego/imagenes/hcaidos.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(panelHeroesMuertos, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(panelVillanosMuertos, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(317, 317, 317))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelVillanosMuertos, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(panelHeroesMuertos, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        int opcion = JOptionPane.showConfirmDialog(null, "¿Estás seguro?", "Confirmación para Rendirse", JOptionPane.YES_NO_OPTION);

        if (opcion == JOptionPane.YES_OPTION) {

            tablero.Rendirse();

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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelTurno;
    private javax.swing.JLabel labelTurno1;
    private javax.swing.JPanel panelHeroesMuertos;
    private javax.swing.JPanel panelVillanosMuertos;
    private static javax.swing.JLabel showTurno;
    // End of variables declaration//GEN-END:variables
}
