package proyectostratego.eventos.logueo;

import javax.swing.JOptionPane;
import proyectostratego.utilidades.Jugador;
import proyectostratego.utilidades.Fondos;
import proyectostratego.ventanas.MenuInicial;
import proyectostratego.ventanas.MenuPrincipal;

public class Login extends javax.swing.JFrame {

    MenuInicial menuinicial = new MenuInicial();
    MenuPrincipal menuprincipal = new MenuPrincipal();

    public Login() {
        initComponents();
        setTitle("Stratego Marvel Heroes");
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new Fondos("/proyectostratego/imagenes/fondomenuprincipal.png");
        logo = new javax.swing.JLabel();
        botonLoguear = new javax.swing.JButton();
        User = new javax.swing.JTextField();
        labelUsuario = new javax.swing.JLabel();
        labelContra = new javax.swing.JLabel();
        botonSalir = new javax.swing.JButton();
        Password = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectostratego/imagenes/logintexto.png"))); // NOI18N

        botonLoguear.setFont(new java.awt.Font("ITF Devanagari", 1, 18)); // NOI18N
        botonLoguear.setForeground(new java.awt.Color(0, 204, 0));
        botonLoguear.setText("Loguear");
        botonLoguear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonLoguear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLoguearActionPerformed(evt);
            }
        });

        User.setFont(new java.awt.Font("ITF Devanagari", 0, 18)); // NOI18N
        User.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        User.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserActionPerformed(evt);
            }
        });

        labelUsuario.setFont(new java.awt.Font("ITF Devanagari", 1, 18)); // NOI18N
        labelUsuario.setForeground(new java.awt.Color(255, 255, 255));
        labelUsuario.setText("Usuario:");

        labelContra.setFont(new java.awt.Font("ITF Devanagari", 1, 18)); // NOI18N
        labelContra.setForeground(new java.awt.Color(255, 255, 255));
        labelContra.setText("Contraseña:");

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
                .addContainerGap(116, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelUsuario)
                            .addComponent(User, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelContra)
                            .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(116, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(258, 258, 258)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonLoguear, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(labelUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(User, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(labelContra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(botonLoguear, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void botonLoguearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLoguearActionPerformed
        // TODO add your handling code here:
        boolean encontrado = false;
        
        String password = new String(Password.getPassword());
        
        if (User.getText().equals("") || password.equals("")) {
            JOptionPane.showMessageDialog(this, "No puedes dejar los espacios solicitados en blanco");
        } else {
            for (int i = 0; i < Jugador.nUsuariosTotal; i++) {
                if (User.getText().equalsIgnoreCase(Jugador.jugadores[i].username)) //If user valido basicamente
                //Tambien ignore case porque tiene que ser unico
                {
                    if (Jugador.jugadores[i].validarPass(password)) // If la contra es correcta
                    {
                        JOptionPane.showMessageDialog(this, "Logeado correctamente");

                        //System.out.println(MenuPrincipal.jugadores[i].validarPass(Password.getText()));
                        //DEBUG - para ver el estado si es true o false 
                        encontrado = true;
                        Jugador.jugadorLog = Jugador.jugadores[i];
                        Jugador.logged = true;
                        menuprincipal.setVisible(true);
                        menuprincipal.setLocationRelativeTo(null);
                        dispose();
                        return;
                    } else //Si no es correcta
                    {
                        JOptionPane.showMessageDialog(this, "Contrasena incorrecta");
                        //System.out.println(MenuPrincipal.jugadores[i].validarPass(Password.getText()));
                        //DEBUG - para ver el estado si es true o falses 
                        return;
                    }
                }
            }
            if (!encontrado) {
                JOptionPane.showMessageDialog(this, "Usuario no encontrado");
            }
        }

    }//GEN-LAST:event_botonLoguearActionPerformed

    private void UserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserActionPerformed

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        // TODO add your handling code here:
        menuinicial.setVisible(true);
        menuinicial.setLocationRelativeTo(null);
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField Password;
    private javax.swing.JTextField User;
    private javax.swing.JButton botonLoguear;
    private javax.swing.JButton botonSalir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelContra;
    private javax.swing.JLabel labelUsuario;
    private javax.swing.JLabel logo;
    // End of variables declaration//GEN-END:variables
}
