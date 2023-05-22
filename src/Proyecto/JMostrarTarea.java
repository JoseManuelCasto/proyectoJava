/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Proyecto;

import java.util.Collections;
import javax.swing.DefaultListModel;

/**
 *
 * @author casto
 */
public class JMostrarTarea extends javax.swing.JFrame {

    /**
     * Creates new form JMostrarTarea
     */
    public JMostrarTarea() {
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
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaGraficaMostrarTareas = new javax.swing.JList<>();
        botonOrdenarTituloASC = new javax.swing.JButton();
        botonOrdenarTituloDEC = new javax.swing.JButton();
        botonFechaInicioASC = new javax.swing.JButton();
        botonFechaInicioDEC = new javax.swing.JButton();
        botonFechaFinASC = new javax.swing.JButton();
        botonFechaFinDEC = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(51, 102, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 51, 255));
        jButton1.setText("Mostrar tareas");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 300, 50));

        listaGraficaMostrarTareas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jScrollPane2.setViewportView(listaGraficaMostrarTareas);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 10, 650, 580));

        botonOrdenarTituloASC.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        botonOrdenarTituloASC.setText("Ordenar por Titulo (ASC)");
        botonOrdenarTituloASC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonOrdenarTituloASCActionPerformed(evt);
            }
        });
        jPanel1.add(botonOrdenarTituloASC, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 300, 50));

        botonOrdenarTituloDEC.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        botonOrdenarTituloDEC.setText("Ordenar por Titulo (DEC)");
        botonOrdenarTituloDEC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonOrdenarTituloDECActionPerformed(evt);
            }
        });
        jPanel1.add(botonOrdenarTituloDEC, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 300, 50));

        botonFechaInicioASC.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        botonFechaInicioASC.setText("Ordenar por Fecha Inicio (ASC)");
        botonFechaInicioASC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonFechaInicioASCActionPerformed(evt);
            }
        });
        jPanel1.add(botonFechaInicioASC, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 300, 50));

        botonFechaInicioDEC.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        botonFechaInicioDEC.setText("Ordenar por Fecha Inicio (DEC)");
        botonFechaInicioDEC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonFechaInicioDECActionPerformed(evt);
            }
        });
        jPanel1.add(botonFechaInicioDEC, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 300, 50));

        botonFechaFinASC.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        botonFechaFinASC.setText("Ordenar por Fecha Fin (ASC)");
        botonFechaFinASC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonFechaFinASCActionPerformed(evt);
            }
        });
        jPanel1.add(botonFechaFinASC, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 300, 50));

        botonFechaFinDEC.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        botonFechaFinDEC.setText("Ordenar por Fecha Fin (DEC)");
        botonFechaFinDEC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonFechaFinDECActionPerformed(evt);
            }
        });
        jPanel1.add(botonFechaFinDEC, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, 300, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 598, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //cargamos los datos y rellenamos la lista ordenada por orden de creacion
        Datos dat = Datos.cargarDatos();
        DefaultListModel modeloLista = new DefaultListModel();
        modeloLista.addAll(dat.getTareas());
        listaGraficaMostrarTareas.setModel(modeloLista);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void botonOrdenarTituloASCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonOrdenarTituloASCActionPerformed
        //cargamos los datos y rellenamos la lista ordenada por Titulo de la tarea ascendente
        Datos dat = Datos.cargarDatos();

        DefaultListModel modeloLista = new DefaultListModel();
        Collections.sort(dat.getTareas(), (t1,t2) -> (t1.getTitulo().compareToIgnoreCase(t2.getTitulo())));
        modeloLista.addAll(dat.getTareas());
        listaGraficaMostrarTareas.setModel(modeloLista);
    }//GEN-LAST:event_botonOrdenarTituloASCActionPerformed

    private void botonOrdenarTituloDECActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonOrdenarTituloDECActionPerformed
        //cargamos los datos y rellenamos la lista ordenada por Titulo de la tarea descendente
        Datos dat = Datos.cargarDatos();

        DefaultListModel modeloLista = new DefaultListModel();
        Collections.sort(dat.getTareas(), (t2,t1) -> (t1.getTitulo().compareToIgnoreCase(t2.getTitulo())));
        modeloLista.addAll(dat.getTareas());
        listaGraficaMostrarTareas.setModel(modeloLista);
    }//GEN-LAST:event_botonOrdenarTituloDECActionPerformed

    private void botonFechaInicioASCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonFechaInicioASCActionPerformed
        //cargamos los datos y rellenamos la lista ordenada por la fecha de inicio ascendente
        Datos dat = Datos.cargarDatos();

        DefaultListModel modeloLista = new DefaultListModel();
        Collections.sort(dat.getTareas(), (t1,t2) -> (t1.getFecha_inicio().compareTo(t2.getFecha_inicio())));
        modeloLista.addAll(dat.getTareas());
        listaGraficaMostrarTareas.setModel(modeloLista);
    }//GEN-LAST:event_botonFechaInicioASCActionPerformed

    private void botonFechaInicioDECActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonFechaInicioDECActionPerformed
        //cargamos los datos y rellenamos la lista ordenada por la fecha de inicio descendente
        Datos dat = Datos.cargarDatos();

        DefaultListModel modeloLista = new DefaultListModel();
        Collections.sort(dat.getTareas(), (t2,t1) -> (t1.getFecha_inicio().compareTo(t2.getFecha_inicio())));
        modeloLista.addAll(dat.getTareas());
        listaGraficaMostrarTareas.setModel(modeloLista);
    }//GEN-LAST:event_botonFechaInicioDECActionPerformed

    private void botonFechaFinASCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonFechaFinASCActionPerformed
        //cargamos los datos y rellenamos la lista ordenada por la fecha de entrega ascendente
        Datos dat = Datos.cargarDatos();

        DefaultListModel modeloLista = new DefaultListModel();
        Collections.sort(dat.getTareas(), (t1,t2) -> (t1.getFecha_fin().compareTo(t2.getFecha_fin())));
        modeloLista.addAll(dat.getTareas());
        listaGraficaMostrarTareas.setModel(modeloLista);
    }//GEN-LAST:event_botonFechaFinASCActionPerformed

    private void botonFechaFinDECActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonFechaFinDECActionPerformed
        //cargamos los datos y rellenamos la lista ordenada por la fecha de entrega descendente
        Datos dat = Datos.cargarDatos();

        DefaultListModel modeloLista = new DefaultListModel();
        Collections.sort(dat.getTareas(), (t2,t1) -> (t1.getFecha_fin().compareTo(t2.getFecha_fin())));
        modeloLista.addAll(dat.getTareas());
        listaGraficaMostrarTareas.setModel(modeloLista);
    }//GEN-LAST:event_botonFechaFinDECActionPerformed

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
            java.util.logging.Logger.getLogger(JMostrarTarea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JMostrarTarea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JMostrarTarea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JMostrarTarea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JMostrarTarea().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonFechaFinASC;
    private javax.swing.JButton botonFechaFinDEC;
    private javax.swing.JButton botonFechaInicioASC;
    private javax.swing.JButton botonFechaInicioDEC;
    private javax.swing.JButton botonOrdenarTituloASC;
    private javax.swing.JButton botonOrdenarTituloDEC;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> listaGraficaMostrarTareas;
    // End of variables declaration//GEN-END:variables
}
