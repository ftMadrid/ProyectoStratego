package proyectostratego.ventanas;

import javax.swing.table.DefaultTableModel;
import proyectostratego.utilidades.Fondos;

public class LogPartidas extends javax.swing.JFrame {

    private static final int MAX = 100;
    private static String[] registros = new String[MAX];
    private static int contador = 0;

    private String username; // jugador cuyo log vamos a mostrar

    public LogPartidas(String username) {
        this.username = username;
        initComponents();
        setTitle("Stratego Marvel Heroes");
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        cargarRegistros();
    }

    public static void agregarRegistro(String texto) {
        if (contador < MAX) {
            registros[contador] = texto;
            contador++;
        } else {
            // desplazamos para liberar espacio
            for (int i = 1; i < MAX; i++) {
                registros[i - 1] = registros[i];
            }
            registros[MAX - 1] = texto;
        }
    }

    private void cargarRegistros() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);

        for (int i = 0; i < contador; i++) {
            if (registros[i].contains(username)) {
                model.addRow(new Object[]{ registros[i] });
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new Fondos("/proyectostratego/imagenes/fondomenuprincipal.png");
        titulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        regresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        titulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectostratego/imagenes/lpartidastext.png"))); // NOI18N

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setFont(new java.awt.Font("Kefa", 1, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Registro"
            }
        ));
        jTable1.setGridColor(new java.awt.Color(0, 0, 0));
        jTable1.setRowHeight(30);
        jTable1.setShowGrid(true);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setHeaderValue("Registro");
        }

        regresar.setFont(new java.awt.Font("Kefa", 1, 24)); // NOI18N
        regresar.setForeground(new java.awt.Color(255, 0, 0));
        regresar.setText("Regresar");
        regresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(titulo)
                        .addGap(258, 258, 258))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 791, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(376, 376, 376))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(titulo)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
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
        
        System.out.println("[CONSOLE LOG] Saliendo del menu Log Partidas.");
        System.out.println("[CONSOLE LOG] Ejecutando el menu Mi Perfil.\n");
        
        MiPerfil mperfil = new MiPerfil();
        mperfil.setVisible(true);
        mperfil.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_regresarActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton regresar;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
