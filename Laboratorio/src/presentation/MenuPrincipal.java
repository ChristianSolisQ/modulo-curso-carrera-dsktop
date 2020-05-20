package presentation;

import controller.MenuPrincipalController;
import java.util.Observable;
import javax.swing.JOptionPane;
import models.Model;

public class MenuPrincipal extends javax.swing.JFrame implements java.util.Observer {

    MenuPrincipalController controller;
    Model model;

    public MenuPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public MenuPrincipalController getController() {
        return controller;
    }

    public void setController(MenuPrincipalController controller) {
        this.controller = controller;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelMenuPrincipal = new javax.swing.JLabel();
        labelDescripcion = new javax.swing.JLabel();
        buttonIrCarreras = new javax.swing.JButton();
        buttonIrCursos = new javax.swing.JButton();
        buttonCerrarSesion = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelMenuPrincipal.setFont(new java.awt.Font("Times New Roman", 1, 25)); // NOI18N
        labelMenuPrincipal.setText("  SISTEMA DE MATRICULA");

        labelDescripcion.setText("Opciones del Menu Principal:");

        buttonIrCarreras.setBackground(new java.awt.Color(153, 255, 153));
        buttonIrCarreras.setText("Carreras");
        buttonIrCarreras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonIrCarrerasMouseClicked(evt);
            }
        });

        buttonIrCursos.setBackground(new java.awt.Color(153, 255, 153));
        buttonIrCursos.setText("Cursos");
        buttonIrCursos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonIrCursosMouseClicked(evt);
            }
        });
        buttonIrCursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonIrCursosActionPerformed(evt);
            }
        });

        buttonCerrarSesion.setBackground(new java.awt.Color(255, 153, 0));
        buttonCerrarSesion.setText("Cerrar sesión");
        buttonCerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonCerrarSesionMouseClicked(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/carr.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/c.png"))); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/una.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelDescripcion))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(buttonCerrarSesion))
                    .addComponent(labelMenuPrincipal))
                .addContainerGap(43, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(buttonIrCarreras)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonIrCursos, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)))
                .addGap(70, 70, 70))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelDescripcion)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonIrCarreras)
                    .addComponent(buttonIrCursos))
                .addGap(26, 26, 26)
                .addComponent(buttonCerrarSesion)
                .addGap(46, 46, 46))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonCerrarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonCerrarSesionMouseClicked
        JOptionPane.showMessageDialog(rootPane, "¡Sesión cerrada con éxito!");
        controller.cerrarSesion();
    }//GEN-LAST:event_buttonCerrarSesionMouseClicked

    private void buttonIrCarrerasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonIrCarrerasMouseClicked
        this.controller.verGestionCarreras();
    }//GEN-LAST:event_buttonIrCarrerasMouseClicked

    private void buttonIrCursosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonIrCursosMouseClicked
        this.controller.verGestionCursos();
    }//GEN-LAST:event_buttonIrCursosMouseClicked

    private void buttonIrCursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonIrCursosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonIrCursosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCerrarSesion;
    private javax.swing.JButton buttonIrCarreras;
    private javax.swing.JButton buttonIrCursos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel labelDescripcion;
    private javax.swing.JLabel labelMenuPrincipal;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(Observable o, Object arg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
