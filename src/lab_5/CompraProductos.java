/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel
 */
public class CompraProductos extends javax.swing.JFrame {

    String nombre;
    String calculo = "";
    String sexo1;
    String sexo2;
    String edad;
    String fecha1;
    String fecha2;
    String fecha3;
    int genero;
    int fechacompra;
    String ideProduct;

    private Connection connection = null;
    private ResultSet rs = null;
    private Statement s = null;

    public void Conexion() {
        if (connection != null) {
            return;
        }

        String url = "jdbc:postgresql://localhost:5433/labfive";
        String password = "123";
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(url, "postgres", password);
            if (connection != null) {
                System.out.println("Connecting to database...");
            }
        } catch (Exception e) {
            System.out.println("Problem when connecting to the database");
        }
    }

    /**
     * Creates new form CompraProductos
     */
    public CompraProductos() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        A = new javax.swing.JRadioButton();
        B = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        R1 = new javax.swing.JTextField();
        R2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        campo = new javax.swing.JComboBox();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        f1 = new javax.swing.JRadioButton();
        w = new javax.swing.JTextField();
        f2 = new javax.swing.JRadioButton();
        f3 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Compra de producto");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 23, 117, -1));

        jLabel2.setText("Nombre");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, 30));

        jLabel3.setText("Edad");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, 30));

        A.setText("Masculino");
        A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AActionPerformed(evt);
            }
        });
        getContentPane().add(A, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 134, -1, -1));

        B.setText("Femenino");
        B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BActionPerformed(evt);
            }
        });
        getContentPane().add(B, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 134, -1, -1));

        jLabel4.setText("Sexo");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 138, -1, -1));
        getContentPane().add(R1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 137, 30));
        getContentPane().add(R2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 137, 30));

        jButton1.setText("Cargar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, -1, -1));

        getContentPane().add(campo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 201, -1));

        jButton2.setText("Compra");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 219, -1, -1));

        jLabel5.setText("Fecha");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 181, -1, -1));

        f1.setText("01/12/2017");
        f1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f1ActionPerformed(evt);
            }
        });
        getContentPane().add(f1, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 177, -1, -1));
        getContentPane().add(w, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, 45, -1));

        f2.setText("02/12/2017");
        f2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f2ActionPerformed(evt);
            }
        });
        getContentPane().add(f2, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 177, -1, -1));

        f3.setText("03/12/2017");
        f3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f3ActionPerformed(evt);
            }
        });
        getContentPane().add(f3, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 177, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        cargarniños();
        cargaIDproduct();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Conexion();
        try {
            nombre = R1.getText();
            edad = R2.getText();
            sexo1 = A.getText();
            sexo2 = B.getText();
            fecha1 = f1.getText();
            fecha2 = f2.getText();
            fecha3 = f3.getText();
            ideProduct = w.getText();
            if (genero == 1) {
                if (fechacompra == 0) {
                    s = connection.createStatement();
                    int z = s.executeUpdate("INSERT INTO compras (nombreusu,edad,sexo,identificador_product,fecha) VALUES ('" + nombre + "', '" + Integer.parseInt(edad) + "', '" + sexo1 + "', '" + Integer.parseInt(ideProduct) + "', '" + fecha1 + "')");
                    if (z == 1) {
                        System.out.println("Se agregó el registro de manera exitosa");
                        JOptionPane.showMessageDialog(rootPane, "A sido registrado con exito");
                    } else {
                        System.out.println("Error al insertar el registro");
                    }
                } else if (fechacompra == 1) {
                    s = connection.createStatement();
                    int z = s.executeUpdate("INSERT INTO compras (nombreusu,edad,sexo,identificador_product,fecha) VALUES ('" + nombre + "', '" + Integer.parseInt(edad) + "', '" + sexo1 + "', '" + Integer.parseInt(ideProduct) + "', '" + fecha2 + "')");
                    if (z == 1) {
                        System.out.println("Se agregó el registro de manera exitosa");
                        JOptionPane.showMessageDialog(rootPane, "A sido registrado con exito");
                    } else {
                        System.out.println("Error al insertar el registro");
                    }
                } else if (fechacompra == 2) {
                    s = connection.createStatement();
                    int z = s.executeUpdate("INSERT INTO compras (nombreusu,edad,sexo,identificador_product,fecha) VALUES ('" + nombre + "', '" + Integer.parseInt(edad) + "', '" + sexo1 + "', '" + Integer.parseInt(ideProduct) + "', '" + fecha3 + "')");
                    if (z == 1) {
                        System.out.println("Se agregó el registro de manera exitosa");
                        JOptionPane.showMessageDialog(rootPane, "A sido registrado con exito");
                    } else {
                        System.out.println("Error al insertar el registro");
                    }
                }
            } else if (genero == 2) {
                if (fechacompra == 0) {
                    s = connection.createStatement();
                    int z = s.executeUpdate("INSERT INTO compras (nombreusu,edad,sexo,identificador_product,fecha) VALUES ('" + nombre + "', '" + Integer.parseInt(edad) + "', '" + sexo2 + "', '" + Integer.parseInt(ideProduct) + "', '" + fecha1 + "')");
                    if (z == 1) {
                        System.out.println("Se agregó el registro de manera exitosa");
                        JOptionPane.showMessageDialog(rootPane, "A sido registrado con exito");
                    } else {
                        System.out.println("Error al insertar el registro");
                    }
                } else if (fechacompra == 1) {
                    s = connection.createStatement();
                    int z = s.executeUpdate("INSERT INTO compras (nombreusu,edad,sexo,identificador_product,fecha) VALUES ('" + nombre + "', '" + Integer.parseInt(edad) + "', '" + sexo2 + "', '" + Integer.parseInt(ideProduct) + "', '" + fecha2 + "')");
                    if (z == 1) {
                        System.out.println("Se agregó el registro de manera exitosa");
                        JOptionPane.showMessageDialog(rootPane, "A sido registrado con exito");
                    } else {
                        System.out.println("Error al insertar el registro");
                    }
                } else if (fechacompra == 2) {
                    s = connection.createStatement();
                    int z = s.executeUpdate("INSERT INTO compras (nombreusu,edad,sexo,identificador_product,fecha) VALUES ('" + nombre + "', '" + Integer.parseInt(edad) + "', '" + sexo1 + "', '" + Integer.parseInt(ideProduct) + "', '" + fecha3 + "')");
                    if (z == 1) {
                        System.out.println("Se agregó el registro de manera exitosa");
                        JOptionPane.showMessageDialog(rootPane, "A sido registrado con exito");
                    } else {
                        System.out.println("Error al insertar el registro");
                    }
                }
            }

        } catch (Exception e) {
            System.out.println("Error de conexión");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AActionPerformed
        if (A.isSelected()) {
            B.setSelected(false);
            genero = 1;

        }
    }//GEN-LAST:event_AActionPerformed

    private void BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BActionPerformed
        if (B.isSelected()) {
            A.setSelected(false);
            genero = 2;
        }
    }//GEN-LAST:event_BActionPerformed

    private void f1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f1ActionPerformed
        if (f1.isSelected()) {
            f2.setSelected(false);
            f3.setSelected(false);
            fechacompra = 1;
        }
    }//GEN-LAST:event_f1ActionPerformed

    private void f2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f2ActionPerformed
        if (f2.isSelected()) {
            f3.setSelected(false);
            f1.setSelected(false);
            fechacompra = 2;
        }
    }//GEN-LAST:event_f2ActionPerformed

    private void f3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f3ActionPerformed
        if (f3.isSelected()) {
            f2.setSelected(false);
            f1.setSelected(false);
            fechacompra = 3;
        }
    }//GEN-LAST:event_f3ActionPerformed

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
            java.util.logging.Logger.getLogger(CompraProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CompraProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CompraProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CompraProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CompraProductos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton A;
    private javax.swing.JRadioButton B;
    private javax.swing.JTextField R1;
    private javax.swing.JTextField R2;
    private javax.swing.JComboBox campo;
    private javax.swing.JRadioButton f1;
    private javax.swing.JRadioButton f2;
    private javax.swing.JRadioButton f3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField w;
    // End of variables declaration//GEN-END:variables
    public void cargarniños() {
        DefaultListModel Gabriel = new DefaultListModel();
        Conexion();
        try {
            s = connection.createStatement();
            rs = s.executeQuery("SELECT nombre From productos");
            while (rs.next()) {
                Gabriel.addElement(rs.getString("nombre"));
                campo.addItem(rs.getString("nombre"));

            }
        } catch (Exception e) {
            System.out.println("Error");
        }

        campo.setSelectedItem(Gabriel);

    }

    public void cargaIDproduct() {
        DefaultListModel Gabriel = new DefaultListModel();
        Conexion();
        try {
            s = connection.createStatement();
            rs = s.executeQuery("SELECT identificador From productos");
            while (rs.next()) {
               
                    w.setText(rs.getString("identificador"));
                
                

            }
        } catch (Exception e) {
            System.out.println(" Error");
        }

        campo.setSelectedItem(Gabriel);
      

    }

    public void comparar() {
        Conexion();
        try {
           
            int edad = Integer.parseInt(R2.getText());
            if (edad >= 0 || edad <= 12) {
                calculo += "niño";
             int id = Integer.parseInt(R1.getText());
            s = connection.createStatement();
            rs = s.executeQuery("SELECT identificador,nombre,precio,tipo FROM productos WHERE tipo  = '" + calculo + "'");
            while (rs.next()) {

                w.setText(rs.getString("identificador"));
              

            }
            } else if (edad >= 13 || edad <= 17) {
                calculo += "joven";
                 int id = Integer.parseInt(R1.getText());
            s = connection.createStatement();
            rs = s.executeQuery("SELECT identificador,nombre,precio,tipo FROM productos WHERE tipo  = '" + calculo + "'");
            while (rs.next()) {

                w.setText(rs.getString("identificador"));
              

            }
            } else if (edad >= 18) {
                calculo += "adulto";
                 int id = Integer.parseInt(R1.getText());
            s = connection.createStatement();
            rs = s.executeQuery("SELECT identificador,nombre,precio,tipo FROM productos WHERE tipo  = '" + calculo + "'");
            while (rs.next()) {

                w.setText(rs.getString("identificador"));
              

            }
            }
           

        } catch (Exception e) {
            System.out.println("Error de conexión");
        }
    }

    public void condiciones() {
        int edad = Integer.parseInt(R2.getText());
        if (edad >= 0 || edad <= 12) {

        } else if (edad >= 13 || edad <= 17) {

        } else if (edad >= 18) {

        }
    }
}
