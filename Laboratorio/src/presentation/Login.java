package presentation;

import Exceptions.GlobalException;
import Exceptions.NoDataException;
import LogicaNegocios.Usuario;
import controller.LoginController;
import java.sql.SQLException;
import java.util.Observable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

import javax.swing.JInternalFrame;
import models.Model;

public class Login extends javax.swing.JFrame implements java.util.Observer {

    LoginController controller;
    Model model;

    public Login() {
        initComponents();
        setLocationRelativeTo(null);
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
        model.addObserver(this);
    }

    public LoginController getController() {
        return controller;
    }

    public void setController(LoginController controller) {
        this.controller = controller;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        labelInicioSesion = new javax.swing.JLabel();
        labelNombreUsuario = new javax.swing.JLabel();
        labelContrasena = new javax.swing.JLabel();
        textFieldNombreUsuario = new javax.swing.JTextField();
        PasswordFieldContrasena = new javax.swing.JPasswordField();
        buttonIniciarSesion = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        desktopPane.setBackground(new java.awt.Color(240, 240, 240));
        desktopPane.setForeground(new java.awt.Color(240, 240, 240));

        labelInicioSesion.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        labelInicioSesion.setText("Inicio de Sesión");

        labelNombreUsuario.setText("Nombre de usuario");

        labelContrasena.setText("Contraseña");

        buttonIniciarSesion.setText("Iniciar sesión");
        buttonIniciarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonIniciarSesionMouseClicked(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/bloggif_5e61d2b68a0e6.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel2.setText("EIF-411. Laboratorio 1 y 2");

        jLabel3.setText("Christian Solis Quesada");

        desktopPane.setLayer(labelInicioSesion, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktopPane.setLayer(labelNombreUsuario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktopPane.setLayer(labelContrasena, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktopPane.setLayer(textFieldNombreUsuario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktopPane.setLayer(PasswordFieldContrasena, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktopPane.setLayer(buttonIniciarSesion, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktopPane.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktopPane.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktopPane.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout desktopPaneLayout = new javax.swing.GroupLayout(desktopPane);
        desktopPane.setLayout(desktopPaneLayout);
        desktopPaneLayout.setHorizontalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, desktopPaneLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelInicioSesion)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(17, 17, 17))
            .addGroup(desktopPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(desktopPaneLayout.createSequentialGroup()
                            .addComponent(labelNombreUsuario)
                            .addGap(18, 18, 18)
                            .addComponent(textFieldNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(desktopPaneLayout.createSequentialGroup()
                            .addComponent(labelContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(buttonIniciarSesion)
                                .addComponent(PasswordFieldContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        desktopPaneLayout.setVerticalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desktopPaneLayout.createSequentialGroup()
                .addGroup(desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(desktopPaneLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(labelInicioSesion))
                    .addGroup(desktopPaneLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addGap(18, 18, 18)
                .addGroup(desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNombreUsuario)
                    .addComponent(textFieldNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PasswordFieldContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelContrasena))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonIniciarSesion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel4.setText("Jose Quesada Valerio");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(desktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktopPane)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonIniciarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonIniciarSesionMouseClicked
        try {
            controller.verificaCredenciales(this.textFieldNombreUsuario.getText(), this.PasswordFieldContrasena.getText());
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (GlobalException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoDataException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (model.getLogged() == 0) {
            JOptionPane.showMessageDialog(rootPane, "¡Datos Correctos!");
            controller.mostrarVentanaPrincipal();
        } else {
            JOptionPane.showMessageDialog(rootPane, "¡Datos Incorrectos!");
        }
    }//GEN-LAST:event_buttonIniciarSesionMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField PasswordFieldContrasena;
    private javax.swing.JButton buttonIniciarSesion;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel labelContrasena;
    private javax.swing.JLabel labelInicioSesion;
    private javax.swing.JLabel labelNombreUsuario;
    private javax.swing.JTextField textFieldNombreUsuario;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(Observable o, Object arg) {
        updateInicioSesion();
    }

    public void updateInicioSesion() {
        Usuario user = model.getUsuarioActual();
        this.textFieldNombreUsuario.setText(user.getCedula());
        this.PasswordFieldContrasena.setText(user.getClave());
    }

}
