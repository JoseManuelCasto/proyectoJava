/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Proyecto;

import java.util.Collections;
import javax.swing.DefaultListModel;

/**
 *
 * @author Carri
 */
public class JMostrarProyectos extends javax.swing.JFrame {

    /**
     * Creates new form JMostrarProyectos
     */
    public JMostrarProyectos() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        botonMostrarProyectos = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaGraficaMostrarProyectos = new javax.swing.JList<>();
        botonTituloASC = new javax.swing.JButton();
        botonTituloDEC = new javax.swing.JButton();
        botonFechaInicioASC = new javax.swing.JButton();
        botonFechaInicioDEC = new javax.swing.JButton();
        botonFechaFinDEC = new javax.swing.JButton();
        botonFechaFinASC = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(51, 102, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonMostrarProyectos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        botonMostrarProyectos.setForeground(new java.awt.Color(0, 102, 255));
        botonMostrarProyectos.setText("Mostrar proyectos");
        botonMostrarProyectos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMostrarProyectosActionPerformed(evt);
            }
        });
        jPanel1.add(botonMostrarProyectos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 300, 50));

        jScrollPane2.setViewportView(listaGraficaMostrarProyectos);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 10, 650, 530));

        botonTituloASC.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        botonTituloASC.setText("Ordenar por Titulo (ASC)");
        botonTituloASC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonTituloASCActionPerformed(evt);
            }
        });
        jPanel1.add(botonTituloASC, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 300, 50));

        botonTituloDEC.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        botonTituloDEC.setText("Ordenar por Titulo (DEC)");
        botonTituloDEC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonTituloDECActionPerformed(evt);
            }
        });
        jPanel1.add(botonTituloDEC, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 300, 50));

        botonFechaInicioASC.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        botonFechaInicioASC.setText("Ordenar por Fecha Inicio (ASC)");
        botonFechaInicioASC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonFechaInicioASCActionPerformed(evt);
            }
        });
        jPanel1.add(botonFechaInicioASC, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 300, 50));

        botonFechaInicioDEC.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        botonFechaInicioDEC.setText("Ordenar por Fecha Inicio (DEC)");
        botonFechaInicioDEC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonFechaInicioDECActionPerformed(evt);
            }
        });
        jPanel1.add(botonFechaInicioDEC, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 300, 50));

        botonFechaFinDEC.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        botonFechaFinDEC.setText("Ordenar por Fecha Final (DEC)");
        botonFechaFinDEC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonFechaFinDECActionPerformed(evt);
            }
        });
        jPanel1.add(botonFechaFinDEC, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 300, 50));

        botonFechaFinASC.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        botonFechaFinASC.setText("Ordenar por Fecha Final (ASC)");
        botonFechaFinASC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonFechaFinASCActionPerformed(evt);
            }
        });
        jPanel1.add(botonFechaFinASC, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 300, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonMostrarProyectosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMostrarProyectosActionPerformed
        //cargamos los datos y mostramos los proyectos por orden de creacion
        Datos dat = Datos.cargarDatos();

        DefaultListModel modeloLista = new DefaultListModel();
        modeloLista.addAll(dat.getProyectos());
        listaGraficaMostrarProyectos.setModel(modeloLista);
    }//GEN-LAST:event_botonMostrarProyectosActionPerformed

    private void botonTituloDECActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonTituloDECActionPerformed
        //cargamos los datos y mostramos los proyectos segun el Titulo descendiente
        Datos dat = Datos.cargarDatos();

        DefaultListModel modeloLista = new DefaultListModel();
        Collections.sort(dat.getProyectos(), (p2,p1) -> (p1.getNombre().compareToIgnoreCase(p2.getNombre())));
        modeloLista.addAll(dat.getProyectos());
        listaGraficaMostrarProyectos.setModel(modeloLista);
    }//GEN-LAST:event_botonTituloDECActionPerformed

    private void botonFechaInicioDECActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonFechaInicioDECActionPerformed
        //cargamos los datos y mostramos los proyectos segun la fecha de incicio descendiente
        Datos dat = Datos.cargarDatos();

        DefaultListModel modeloLista = new DefaultListModel();
        Collections.sort(dat.getProyectos(), (p2,p1) -> (p1.getFecha_inicio().compareTo(p2.getFecha_inicio())));
        modeloLista.addAll(dat.getProyectos());
        listaGraficaMostrarProyectos.setModel(modeloLista);
    }//GEN-LAST:event_botonFechaInicioDECActionPerformed

    private void botonFechaFinDECActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonFechaFinDECActionPerformed
        //cargamos los datos y mostramos los proyectos segun la fecha de entrega descendiente
        Datos dat = Datos.cargarDatos();

        DefaultListModel modeloLista = new DefaultListModel();
        Collections.sort(dat.getProyectos(), (p2,p1) -> (p1.getFecha_entrega().compareTo(p2.getFecha_entrega())));
        modeloLista.addAll(dat.getProyectos());
        listaGraficaMostrarProyectos.setModel(modeloLista);
    }//GEN-LAST:event_botonFechaFinDECActionPerformed

    private void botonTituloASCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonTituloASCActionPerformed
        //cargamos los datos y mostramos los proyectos segun el Titulo ascendiente
        Datos dat = Datos.cargarDatos();

        DefaultListModel modeloLista = new DefaultListModel();
        Collections.sort(dat.getProyectos(), (p1,p2) -> (p1.getNombre().compareToIgnoreCase(p2.getNombre())));
        modeloLista.addAll(dat.getProyectos());
        listaGraficaMostrarProyectos.setModel(modeloLista);
    }//GEN-LAST:event_botonTituloASCActionPerformed

    private void botonFechaInicioASCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonFechaInicioASCActionPerformed
        //cargamos los datos y mostramos los proyectos segun la fecha de inicio ascendiente
        Datos dat = Datos.cargarDatos();

        DefaultListModel modeloLista = new DefaultListModel();
        Collections.sort(dat.getProyectos(), (p1,p2) -> (p1.getFecha_inicio().compareTo(p2.getFecha_inicio())));
        modeloLista.addAll(dat.getProyectos());
        listaGraficaMostrarProyectos.setModel(modeloLista);
    }//GEN-LAST:event_botonFechaInicioASCActionPerformed

    private void botonFechaFinASCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonFechaFinASCActionPerformed
        //cargamos los datos y mostramos los proyectos segun la fecha de entrega ascendiente
        Datos dat = Datos.cargarDatos();

        DefaultListModel modeloLista = new DefaultListModel();
        Collections.sort(dat.getProyectos(), (p1,p2) -> (p1.getFecha_entrega().compareTo(p2.getFecha_entrega())));
        modeloLista.addAll(dat.getProyectos());
        listaGraficaMostrarProyectos.setModel(modeloLista);
    }//GEN-LAST:event_botonFechaFinASCActionPerformed

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
            java.util.logging.Logger.getLogger(JMostrarProyectos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JMostrarProyectos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JMostrarProyectos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JMostrarProyectos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JMostrarProyectos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonFechaFinASC;
    private javax.swing.JButton botonFechaFinDEC;
    private javax.swing.JButton botonFechaInicioASC;
    private javax.swing.JButton botonFechaInicioDEC;
    private javax.swing.JButton botonMostrarProyectos;
    private javax.swing.JButton botonTituloASC;
    private javax.swing.JButton botonTituloDEC;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> listaGraficaMostrarProyectos;
    // End of variables declaration//GEN-END:variables
}
