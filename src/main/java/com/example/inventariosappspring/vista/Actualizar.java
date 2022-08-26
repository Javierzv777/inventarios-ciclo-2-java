package com.example.inventariosappspring.vista;

import java.awt.Toolkit;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.event.*;
public class Actualizar extends JDialog{
    
    // private ProductoControlador controlador;
    public Actualizar actualizar = this;
    private Vista vista;
    private Integer id;
    public class AdaptadorNumeros extends KeyAdapter{
        public void keyTyped(KeyEvent e) {
            char c = e.getKeyChar();
            if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
                 e.consume();  // if it's not a number, ignore the event
            }
        }
    }

    public Actualizar (Vista vista){
        super(vista, "Actualizar Producto");
        this.vista = vista;
        initComponents();
    } 

    public void initComponents(){
        bnAceptarUp = new javax.swing.JButton("Aceptar");
    }


    public void run (){
        
        if (vista.jTable1.getSelectedRow() == -1){
            JOptionPane.showMessageDialog(null, "Por favor seleccione un producto", "ERROR", 0 );
        } else {
            
            id = Integer.parseInt(vista.jTable1.getModel().getValueAt(vista.jTable1.getSelectionModel().getMinSelectionIndex(), 0).toString()); 

            JLabel labelTitle = new JLabel("Actualizar Producto");
            //d.setLayout(null);
            

            bnCancelarUp = new javax.swing.JButton("Cancelar");
            bnCancelarUp.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    actualizar.setVisible(false);
                }
            });
    

        
           
            jTextNombreActualizar = new javax.swing.JTextField();
            jTextPrecioActualizar = new javax.swing.JTextField();
            jTextInventarioActualizar = new javax.swing.JTextField();
            labelNombreUp = new javax.swing.JLabel("nombre:");
            labelPrecioUp = new javax.swing.JLabel("precio:");
            labelInventarioUp = new javax.swing.JLabel("Inventario");
            jTextNombreActualizar.setBounds(120, 60, 100, 25);
            jTextPrecioActualizar.setBounds(120, 90, 100, 25);
            jTextInventarioActualizar.setBounds(120, 120, 100, 25);
            jTextPrecioActualizar.addKeyListener( new AdaptadorNumeros());
            jTextInventarioActualizar.addKeyListener( new AdaptadorNumeros());
            labelTitle.setBounds(40, 20, 130, 25);
            labelNombreUp.setBounds(20, 60, 100, 25);
            labelPrecioUp.setBounds(20, 90, 100, 25);
            labelInventarioUp.setBounds(20, 120, 100, 25);
            bnAceptarUp.setBounds(30, 190, 90, 25);
            bnCancelarUp.setBounds(150, 190, 90, 25);
            
            this.add(bnAceptarUp);
            this.add(bnCancelarUp);
            this.add(jTextNombreActualizar);
            this.add(jTextPrecioActualizar);
            this.add(jTextInventarioActualizar);
            this.add(labelNombreUp);
            this.add(labelPrecioUp);
            this.add(labelInventarioUp);
            this.add(labelTitle);
            this.setSize(300, 300);
            this.setLocation((Toolkit.getDefaultToolkit().getScreenSize().width-300)/2, (Toolkit.getDefaultToolkit().getScreenSize().height-400)/2);
            this.setLayout(null);
            this.setLocationRelativeTo(null);
            this.jTextNombreActualizar.setText(vista.jTable1.getModel().getValueAt(vista.jTable1.getSelectionModel().getMinSelectionIndex(), 1).toString() ) ; 
            this.jTextPrecioActualizar.setText(vista.jTable1.getModel().getValueAt(vista.jTable1.getSelectionModel().getMinSelectionIndex(), 2).toString()); 
            this.jTextInventarioActualizar.setText(vista.jTable1.getModel().getValueAt(vista.jTable1.getSelectionModel().getMinSelectionIndex(), 3).toString()); 
            this.setVisible(true);
                
                
                
        }

        
        // create a label
        
    }
    

 
    public javax.swing.JButton getBnAceptarUp() {
        return bnAceptarUp;
    }

    public Integer getId() {
        return id;
    }



    private javax.swing.JButton bnCancelarUp;
    private javax.swing.JButton bnAceptarUp;                 
    public javax.swing.JTextField jTextNombreActualizar;
    public javax.swing.JTextField jTextPrecioActualizar;
    public javax.swing.JTextField jTextInventarioActualizar;
    private javax.swing.JLabel labelNombreUp;
    private javax.swing.JLabel labelPrecioUp;
    private javax.swing.JLabel labelInventarioUp;
    
    
    
}
