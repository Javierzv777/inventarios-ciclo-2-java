package com.example.inventariosappspring.vista;

import javax.swing.JOptionPane;

import com.example.inventariosappspring.controlador.ProductoControlador;
import com.example.inventariosappspring.modelo.Producto;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import java.awt.event.*;


public class Agregar extends JPanel{
    private ProductoControlador controlador;
    private Vista vista;
    
    public class AdaptadorNumeros extends KeyAdapter{
        public void keyTyped(KeyEvent e) {
            char c = e.getKeyChar();
            if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
                 e.consume();  // if it's not a number, ignore the event
            }
        }
    }

    public Agregar(Vista vista, ProductoControlador controlador){
        this.controlador = controlador;
        this.vista = vista;
        
        
        bottonAgregar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextNombre = new javax.swing.JTextField();
        jTextPrecio = new javax.swing.JTextField();
        jTextPrecio.addKeyListener( new AdaptadorNumeros());
        jTextInventario = new javax.swing.JFormattedTextField();
        jTextInventario.addKeyListener( new AdaptadorNumeros());
        

        bottonAgregar.setText("Agregar Producto");


        jLabel2.setText("Nombre:");

        jLabel4.setText("Precio:");

        jLabel5.setText("Inventario:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(this);
      
     
        this.setLayout(jPanel2Layout);
        this.setBorder(new TitledBorder("agrega tu producto"));

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
        bottonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bottonAgregarActionPerformed(evt);
            }

            private void bottonAgregarActionPerformed(java.awt.event.ActionEvent evt) {                                              
                // TODO add your handling code here:
                if(jTextNombre.getText().isEmpty() || jTextInventario.getText().isEmpty() || jTextPrecio.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null, "debe llenar todos los campos");
                    return;
                }
                Producto nuevo = new Producto();
                nuevo.setNombre(jTextNombre.getText());
                nuevo.setPrecio(Double.parseDouble(jTextPrecio.getText()));
                nuevo.setInventario(Integer.parseInt(jTextInventario.getText()));
                controlador.agregar(nuevo);
                vista.cargar();
            }  

           });
           
          
    }

    
    public javax.swing.JButton bottonAgregar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    public javax.swing.JTextField jTextNombre;
    public javax.swing.JTextField jTextPrecio;
    public javax.swing.JTextField jTextInventario;

}
