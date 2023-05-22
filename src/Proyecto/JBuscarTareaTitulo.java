/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Proyecto;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author casto
 */
public class JBuscarTareaTitulo extends javax.swing.JFrame {

    /**
     * Creates new form JBuscarTareaTitulo
     */
    public JBuscarTareaTitulo() {
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
        jScrollPane3 = new javax.swing.JScrollPane();
        listaGraficaUsuarios = new javax.swing.JList<>();
        campoFechaEstimada = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaDescripcion = new javax.swing.JTextArea();
        campoFechaFin = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        campoNombreTarea = new javax.swing.JTextField();
        botonBuscar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        checkEnTarea = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        campoFechaInicio = new javax.swing.JTextField();

        jPanel1.setBackground(new java.awt.Color(51, 102, 255));
        jPanel1.setForeground(java.awt.Color.white);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, 503, 10));

        listaGraficaUsuarios.setBackground(new java.awt.Color(51, 102, 255));
        listaGraficaUsuarios.setForeground(java.awt.Color.white);
        jScrollPane3.setViewportView(listaGraficaUsuarios);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 450, 503, 119));

        campoFechaEstimada.setBackground(new java.awt.Color(51, 102, 255));
        campoFechaEstimada.setForeground(java.awt.Color.white);
        jPanel1.add(campoFechaEstimada, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 370, 503, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(java.awt.Color.white);
        jLabel4.setText("Fecha inicio:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, -1, -1));

        areaDescripcion.setBackground(new java.awt.Color(51, 102, 255));
        areaDescripcion.setColumns(20);
        areaDescripcion.setForeground(java.awt.Color.white);
        areaDescripcion.setRows(5);
        jScrollPane1.setViewportView(areaDescripcion);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, 503, 118));

        campoFechaFin.setBackground(new java.awt.Color(51, 102, 255));
        campoFechaFin.setForeground(java.awt.Color.white);
        jPanel1.add(campoFechaFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 410, 503, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(java.awt.Color.white);
        jLabel6.setText("Fecha final:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 410, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(java.awt.Color.white);
        jLabel5.setText("Fecha estimada:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(java.awt.Color.white);
        jLabel3.setText("Descripción:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, -1, -1));

        campoNombreTarea.setBackground(new java.awt.Color(51, 102, 255));
        campoNombreTarea.setForeground(java.awt.Color.white);
        campoNombreTarea.setBorder(null);
        campoNombreTarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNombreTareaActionPerformed(evt);
            }
        });
        jPanel1.add(campoNombreTarea, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, 503, 31));

        botonBuscar.setText("Buscar");
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(botonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 120, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(java.awt.Color.white);
        jLabel2.setText("Título de la tarea:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Buscar tarea por su título");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 952, 48));

        checkEnTarea.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        checkEnTarea.setForeground(java.awt.Color.white);
        checkEnTarea.setText("se encuentra en proyecto");
        jPanel1.add(checkEnTarea, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 580, 377, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(java.awt.Color.white);
        jLabel7.setText("Usuarios implicados:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 450, -1, -1));

        campoFechaInicio.setBackground(new java.awt.Color(51, 102, 255));
        campoFechaInicio.setForeground(java.awt.Color.white);
        jPanel1.add(campoFechaInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, 503, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 940, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 715, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(615, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoNombreTareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNombreTareaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNombreTareaActionPerformed

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
        String tituloTarea = campoNombreTarea.getText();

        Datos dat = Datos.cargarDatos();
        String fechaEstandar = "0001/01/01";
        DateTimeFormatter formateador = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate FechaInicio = LocalDate.parse(fechaEstandar, formateador);
        //creamos una Tarea dummy y comprobamos si existe la tarea instroducida por el usuario
        Tarea buscada = new Tarea("", "", FechaInicio, FechaInicio, FechaInicio);
        for (Tarea t : dat.getTareas()) {
            if (t.getTitulo().equalsIgnoreCase(tituloTarea)) {
                buscada = t;
            }
        }
        //si no existe ninguna lo comunicamos al usuario
        //si existe procededmos a cargar los datos en los campos correspondientes
        if (buscada.getTitulo().equals("")) {
            JOptionPane.showMessageDialog(this, "La tarea con el titulo introducido no existe.",
                    "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            
            DefaultListModel modeloLista = new DefaultListModel();
            modeloLista.addAll(buscada.getUsuarios());
            listaGraficaUsuarios.setModel(modeloLista);
            
            areaDescripcion.setText(buscada.getDescripcion());
            campoFechaInicio.setText(buscada.getFecha_inicio().format(formateador));
            campoFechaEstimada.setText(buscada.getFecha_estimada().format(formateador));
            campoFechaFin.setText(buscada.getFecha_fin().format(formateador));
            checkEnTarea.setEnabled(buscada.isEnProyecto());
        }
            campoNombreTarea.setText("");
    }//GEN-LAST:event_botonBuscarActionPerformed

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
            java.util.logging.Logger.getLogger(JBuscarTareaTitulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JBuscarTareaTitulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JBuscarTareaTitulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JBuscarTareaTitulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JBuscarTareaTitulo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaDescripcion;
    private javax.swing.JButton botonBuscar;
    private javax.swing.JTextField campoFechaEstimada;
    private javax.swing.JTextField campoFechaFin;
    private javax.swing.JTextField campoFechaInicio;
    private javax.swing.JTextField campoNombreTarea;
    private javax.swing.JCheckBox checkEnTarea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JList<String> listaGraficaUsuarios;
    // End of variables declaration//GEN-END:variables
}