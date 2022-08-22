/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.example.inventariosappspring.vista;

import java.util.List;

import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import com.example.inventariosappspring.controlador.ProductoControlador;
import com.example.inventariosappspring.modelo.Producto;
import com.example.inventariosappspring.modelo.ProductoRepositorio;
/**
 *
 * @author javier
 */


public class Vista extends javax.swing.JFrame {
   
    private ProductoControlador controlador;
    private List<Producto> productos;
    private DefaultTableModel modelo;
    // private Object[] modeloTabla = {"codigo", "nombre", "precio", "inventario"};
    /**
     * Creates new form formulario
     */
    public Vista(ProductoControlador controlGeneral) {
        this.controlador = controlGeneral;
        this.productos = this.controlador.listar();
        initComponents();
        setLocationRelativeTo(null);
        setTitle("caja de productos");
        setVisible(true);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {
    // 
    

        jPanel2 = new javax.swing.JPanel();
        bottonAgregar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextNombre = new javax.swing.JTextField();
        jTextPrecio = new javax.swing.JTextField();
        jTextInventario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        bottonBorrar = new javax.swing.JButton();
        bottonActualizar = new javax.swing.JButton();
        bottonInforme = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bottonAgregar.setText("Agregar Producto");
        bottonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bottonAgregarActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombre:");

        jLabel4.setText("Precio:");

        jLabel5.setText("Inventario:");

        jTextNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNombreActionPerformed(evt);
            }
        });

        jTextPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextPrecioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2.setBorder(new TitledBorder("agrega tu producto"));
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(103, Short.MAX_VALUE)
                .addComponent(bottonAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                            .addComponent(jTextPrecio)
                            .addComponent(jTextInventario))))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextInventario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(bottonAgregar)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Noto Sans", 1, 15)); // NOI18N
        jLabel1.setText("Bienvenido a la App de Inventario !!");
        //set table
        modelo = new DefaultTableModel();
        String[] header = { "Código", "Nombre", "Precio", "Inventario" };        
        modelo.setColumnIdentifiers(header);
        jTable1.setModel(modelo);
        jScrollPane1.setViewportView(jTable1);
        cargar();
         
       


        bottonBorrar.setText("Borrar Producto");
        bottonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bottonBorrarActionPerformed(evt);
            }
        });

        bottonActualizar.setText("Actualizar Producto");
        bottonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bottonActualizarActionPerformed(evt);
            }
        });

        bottonInforme.setText("Generar Informee");
        bottonInforme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bottonInformeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bottonBorrar)
                                .addGap(34, 34, 34)
                                .addComponent(bottonActualizar)
                                .addGap(32, 32, 32)
                                .addComponent(bottonInforme))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(92, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bottonBorrar)
                    .addComponent(bottonActualizar)
                    .addComponent(bottonInforme))
                .addContainerGap(145, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>     
    
    
    public void cargar (){
        
        modelo.setNumRows(0);
        for (Producto producto : this.controlador.listar()) {
            String[] fila = {producto.getCodigo()+"", producto.getNombre(), producto.getPrecio()+"", producto.getInventario()+""};
            modelo.addRow(fila);
        }
    }
    private void bottonAgregarActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
        Producto nuevo = new Producto();
        nuevo.setNombre(jTextNombre.getText());
        nuevo.setPrecio(Double.parseDouble(jTextPrecio.getText()));
        nuevo.setInventario(Integer.parseInt(jTextInventario.getText()));
        this.controlador.agregar(nuevo);
        cargar();
    }                                             

    private void jTextNombreActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void jTextPrecioActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void bottonInformeActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
    }                                             

    private void bottonActualizarActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        // TODO add your handling code here:
        
        JOptionPane.showMessageDialog(rootPane, "producto actualizado");
        
    }                                                

    private void bottonBorrarActionPerformed(java.awt.event.ActionEvent evt) {                                             
        JOptionPane.showConfirmDialog(rootPane, "producto actualizado");
    }                                            

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify                     
    private javax.swing.JButton bottonActualizar;
    private javax.swing.JButton bottonAgregar;
    private javax.swing.JButton bottonBorrar;
    private javax.swing.JButton bottonInforme;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextNombre;
    private javax.swing.JTextField jTextPrecio;
    private javax.swing.JTextField jTextInventario;
    // End of variables declaration                   
}
