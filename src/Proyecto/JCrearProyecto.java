package Proyecto;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author Carri
 */
public class JCrearProyecto extends javax.swing.JFrame {

    /**
     * Creates new form JCrearProyecto
     */
    public JCrearProyecto() {
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
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        campoFechaEntrega = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        campoNombre = new javax.swing.JTextField();
        campoTareaPrincipal = new javax.swing.JTextField();
        campoFechaComienzo = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        botonCrearProyecto = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(51, 102, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 732, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 732, -1));

        campoFechaEntrega.setBackground(new java.awt.Color(51, 102, 255));
        campoFechaEntrega.setForeground(java.awt.Color.white);
        campoFechaEntrega.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("yyyy/MM/dd"))));
        campoFechaEntrega.setText("yyyy/MM/dd");
        campoFechaEntrega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoFechaEntregaActionPerformed(evt);
            }
        });
        jPanel1.add(campoFechaEntrega, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 732, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(java.awt.Color.white);
        jLabel2.setText("Nombre:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(java.awt.Color.white);
        jLabel4.setText("Fecha de entrega:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(java.awt.Color.white);
        jLabel5.setText("Tarea principal:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, -1, -1));

        campoNombre.setBackground(new java.awt.Color(51, 102, 255));
        campoNombre.setForeground(java.awt.Color.white);
        campoNombre.setBorder(null);
        campoNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNombreActionPerformed(evt);
            }
        });
        jPanel1.add(campoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 732, -1));

        campoTareaPrincipal.setBackground(new java.awt.Color(51, 102, 255));
        campoTareaPrincipal.setForeground(java.awt.Color.white);
        campoTareaPrincipal.setBorder(null);
        jPanel1.add(campoTareaPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 732, -1));

        campoFechaComienzo.setBackground(new java.awt.Color(51, 102, 255));
        campoFechaComienzo.setForeground(java.awt.Color.white);
        campoFechaComienzo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("yyyy/MM/dd"))));
        campoFechaComienzo.setText("yyyy/MM/dd");
        campoFechaComienzo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoFechaComienzoActionPerformed(evt);
            }
        });
        jPanel1.add(campoFechaComienzo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 732, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Crear proyecto");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1094, 84));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(java.awt.Color.white);
        jLabel3.setText("Fecha de comienzo:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        botonCrearProyecto.setText("Crear");
        botonCrearProyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCrearProyectoActionPerformed(evt);
            }
        });
        jPanel1.add(botonCrearProyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 310, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 978, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNombreActionPerformed

    private void botonCrearProyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCrearProyectoActionPerformed
        //Inicializamos una variables que nos haran falta mas tarde
        DateTimeFormatter formateador = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate FechaInicio = LocalDate.parse(campoFechaComienzo.getText(), formateador);
        LocalDate FechaFin = LocalDate.parse(campoFechaEntrega.getText(), formateador);
        Datos dat = Datos.cargarDatos();
        //Creamos una tarea dummy y un boolean para comprobar si existe
        Tarea buscada = new Tarea("", "", FechaInicio, FechaInicio, FechaInicio);
        String nombreTarea = campoTareaPrincipal.getText();
        boolean encontrado = false;
        for (Tarea t : dat.getTareas()) {
            if (nombreTarea.equalsIgnoreCase(t.getTitulo())) {
                buscada = t;
                encontrado = true;
            }
        }
        //si se encuentra pasamos a la creacion de unn proyecto
        if (encontrado) {
            Proyecto p = new Proyecto(campoNombre.getText(), FechaInicio, FechaFin);
            //Comprobamos si el titulo del proyecto ya existe para que no se repitan
            //Creamos una cadena con todos los titulos de todos los proyectos y comprobamos si el titulo nuevo introducido
            //se encuentra en esta cadena creada  
            String cadenatitulos = "";
            for (Proyecto ps : dat.getProyectos()) {
                cadenatitulos += ps.getNombre();
            }
            //si se encuentra una coincidencia se avisa al usuario, si no se crea el proyecto
            if (cadenatitulos.contains(p.getNombre())) {
                JOptionPane.showMessageDialog(this, "Ese titulo de proyecto ya existe.", "Error",
                        JOptionPane.ERROR_MESSAGE);
            } else {
                dat.añadirProyecto(p);
                p.añadirTarea(buscada);
                buscada.setEnProyecto(true);
                Datos.guardarDatos(dat);

                JOptionPane.showMessageDialog(this, "Proyecto creado con éxito", "Creado correctamente",
                        JOptionPane.INFORMATION_MESSAGE);
            }

        }
        //si no se encuentra la tarea se avisa al usuario
        if (!encontrado) {
            JOptionPane.showMessageDialog(this, "Tarea no encontrada, inserte una tarea existente", "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
        
        campoFechaComienzo.setText("");
        campoFechaEntrega.setText("");
        campoNombre.setText("");
        campoTareaPrincipal.setText("");

    }//GEN-LAST:event_botonCrearProyectoActionPerformed

    private void campoFechaComienzoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoFechaComienzoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoFechaComienzoActionPerformed

    private void campoFechaEntregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoFechaEntregaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoFechaEntregaActionPerformed

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
            java.util.logging.Logger.getLogger(JCrearProyecto.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JCrearProyecto.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JCrearProyecto.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JCrearProyecto.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JCrearProyecto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCrearProyecto;
    private javax.swing.JFormattedTextField campoFechaComienzo;
    private javax.swing.JFormattedTextField campoFechaEntrega;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JTextField campoTareaPrincipal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}