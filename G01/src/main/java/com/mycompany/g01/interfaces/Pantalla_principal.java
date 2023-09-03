/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.g01.interfaces;



import java.awt.Image;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Tania Garcia
 */
public class Pantalla_principal extends javax.swing.JFrame {
    
    
   private ArrayList<String> lstMaterias = new ArrayList<String>();
   
   float cum = 0;
   int contadorAprobadas = 0;
   int contadorReprobadas = 0;
   int c1 = 0;
   int c2 = 0;
   int c3 = 0;
   int c4 = 0;
   int c5 = 0;
   int cr1 = 0;
   int cr2 = 0;
   int cr3 = 0;
   int cr4 = 0;
   int cr5 = 0;

    /**
     * Creates new form Pantalla_principal
     */
    public Pantalla_principal() {
        initComponents();
        
       rellenarListaMaterias();
       rellenarcarrera();
       rellenarciclo();
       selecvalor();
       
       //asignarImagen(lblImage, "src/imagenes/descarga2.jpeg");
       
       //ImageIcon icon = new ImageIcon("src/imagenes/descarga2.jpeg");
       
       lblImage.setIcon(new javax.swing.ImageIcon("D:\\G01\\src\\main\\java\\imagenes\\descarga2.jpeg"));
    }
    
    private void rellenarListaMaterias(){
        cmbMaterias1.addItem("Seleccione una opcion");
        cmbMaterias1.addItem("Electronica");
        cmbMaterias1.addItem("Desarrollo de software I");
        cmbMaterias1.addItem("Base de datos II");
        cmbMaterias1.addItem("Investigacion de operaciones");
        cmbMaterias1.addItem("Legislacion aplicada a la empresa");
        
        cmbMaterias2.addItem("Seleccione una opcion");
        cmbMaterias2.addItem("Electronica");
        cmbMaterias2.addItem("Desarrollo de software I");
        cmbMaterias2.addItem("Base de datos II");
        cmbMaterias2.addItem("Investigacion de operaciones");
        cmbMaterias2.addItem("Legislacion aplicada a la empresa");
        
        cmbMaterias3.addItem("Seleccione una opcion");
        cmbMaterias3.addItem("Electronica");
        cmbMaterias3.addItem("Desarrollo de software I");
        cmbMaterias3.addItem("Base de datos II");
        cmbMaterias3.addItem("Investigacion de operaciones");
        cmbMaterias3.addItem("Legislacion aplicada a la empresa");
        
        cmbMaterias4.addItem("Seleccione una opcion");
        cmbMaterias4.addItem("Electronica");
        cmbMaterias4.addItem("Desarrollo de software I");
        cmbMaterias4.addItem("Base de datos II");
        cmbMaterias4.addItem("Investigacion de operaciones");
        cmbMaterias4.addItem("Legislacion aplicada a la empresa");
        
        cmbMaterias5.addItem("Seleccione una opcion");
        cmbMaterias5.addItem("Electronica");
        cmbMaterias5.addItem("Desarrollo de software I");
        cmbMaterias5.addItem("Base de datos II");
        cmbMaterias5.addItem("Investigacion de operaciones");
        cmbMaterias5.addItem("Legislacion aplicada a la empresa");
         
    }
private void rellenarcarrera(){
         cmbCarrera.addItem("Seleccione una opcion");
         cmbCarrera.addItem("Ing.En Sistemas");

}
private void rellenarciclo(){
        cmbciclo.addItem("Seleccione una opcion");
        cmbciclo.addItem("O2-23");
}
private void selecvalor(){
    cmbvalor1.addItem("Seleccione");
    cmbvalor1.addItem("3");
    cmbvalor1.addItem("4");
    
    cmbvalor2.addItem("Selecione");
    cmbvalor2.addItem("3");
    cmbvalor2.addItem("4");
    
    cmbvalor3.addItem("Seleccione");
    cmbvalor3.addItem("3");
    cmbvalor3.addItem("4");
    
    cmbvalor4.addItem("Seleccione");
    cmbvalor4.addItem("3");
    cmbvalor4.addItem("4");
    
    cmbvalor5.addItem("Seleccione");
    cmbvalor5.addItem("3");
    cmbvalor5.addItem("4");
    
}

private void asignarImagen(JLabel labelName, String root){
    ImageIcon image = new ImageIcon(root);
    Icon icon = new ImageIcon(image.getImage().getScaledInstance(labelName.getWidth(), labelName.getHeight(), Image.SCALE_DEFAULT));
    labelName.setIcon(image);
    
    this.repaint();
    
}

private void calcularCUM(){
    if(!txtNota1.getText().isEmpty() && (!txtNota2.getText().isEmpty())
            && !txtNota3.getText().isEmpty()
            && !txtNota4.getText().isEmpty()
            && !txtNota5.getText().isEmpty()){
        cum = ((Float.parseFloat(txtNota1.getText()) * cmbvalor1.getSelectedIndex()) + (Float.parseFloat(txtNota2.getText()) * cmbvalor2.getSelectedIndex())
            + (Float.parseFloat(txtNota3.getText()) * cmbvalor3.getSelectedIndex()) + (Float.parseFloat(txtNota4.getText()) * cmbvalor4.getSelectedIndex())
            + Float.parseFloat(txtNota5.getText()) * cmbvalor5.getSelectedIndex())/(cmbvalor1.getSelectedIndex() + cmbvalor2.getSelectedIndex()
            + cmbvalor3.getSelectedIndex() + cmbvalor4.getSelectedIndex() + cmbvalor5.getSelectedIndex());
    
        contadorAprobadas = c1 + c2 + c3 + c4 + c5;
        contadorReprobadas = cr1 + cr2 + cr3 + cr4 + cr5;
        
        lblresp.setText(txtNombre.getText() + " su estado actual es de " + contadorAprobadas + " materias aprobadas " + " y " + 
                contadorReprobadas + " reprobadas " + "y su CUM actual es de " + cum);
        cmbCum.setText(String.valueOf(cum));
    }
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textField1 = new java.awt.TextField();
        lblControlNotas = new javax.swing.JLabel();
        cmbMaterias1 = new javax.swing.JComboBox<>();
        cmbMaterias2 = new javax.swing.JComboBox<>();
        cmbMaterias3 = new javax.swing.JComboBox<>();
        cmbMaterias4 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cmbCarrera = new javax.swing.JComboBox<>();
        cmbciclo = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cmbvalor1 = new javax.swing.JComboBox<>();
        cmbvalor2 = new javax.swing.JComboBox<>();
        cmbvalor3 = new javax.swing.JComboBox<>();
        cmbvalor4 = new javax.swing.JComboBox<>();
        cmbvalor5 = new javax.swing.JComboBox<>();
        txtNombre = new javax.swing.JTextField();
        cmbCum = new javax.swing.JTextField();
        txtNota2 = new javax.swing.JTextField();
        txtNota1 = new javax.swing.JTextField();
        txtNota3 = new javax.swing.JTextField();
        txtNota4 = new javax.swing.JTextField();
        txtNota5 = new javax.swing.JTextField();
        lblMsg1 = new javax.swing.JLabel();
        lblMsg2 = new javax.swing.JLabel();
        lblMsg3 = new javax.swing.JLabel();
        lblMsg4 = new javax.swing.JLabel();
        lblMsg5 = new javax.swing.JLabel();
        cmbMaterias5 = new javax.swing.JComboBox<>();
        btnCalcular = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        lblresp = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblImage = new javax.swing.JLabel();

        textField1.setText("textField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        lblControlNotas.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        lblControlNotas.setText("Control de Notas");

        jLabel1.setText("Ciclo ");

        jLabel2.setText("Nombre");

        jLabel3.setText("Carrera");

        jLabel4.setText("CUM");

        jLabel6.setText("UV");

        jLabel7.setText("Materias");

        txtNombre.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        txtNota2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNota2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNota2KeyReleased(evt);
            }
        });

        txtNota1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNota1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNota1KeyReleased(evt);
            }
        });

        txtNota3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNota3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNota3KeyReleased(evt);
            }
        });

        txtNota4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNota4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNota4KeyReleased(evt);
            }
        });

        txtNota5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNota5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNota5KeyReleased(evt);
            }
        });

        lblMsg1.setForeground(new java.awt.Color(255, 0, 0));
        lblMsg1.setText("ESTADO");

        lblMsg2.setForeground(new java.awt.Color(255, 0, 0));
        lblMsg2.setText("ESTADO");

        lblMsg3.setForeground(new java.awt.Color(255, 0, 0));
        lblMsg3.setText("ESTADO");

        lblMsg4.setForeground(new java.awt.Color(255, 0, 0));
        lblMsg4.setText("ESTADO");

        lblMsg5.setForeground(new java.awt.Color(255, 0, 0));
        lblMsg5.setText("ESTADO");

        btnCalcular.setBackground(new java.awt.Color(255, 102, 102));
        btnCalcular.setFont(new java.awt.Font("Segoe UI Semilight", 2, 12)); // NOI18N
        btnCalcular.setForeground(new java.awt.Color(0, 0, 0));
        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        jLabel8.setText("Nota");

        lblresp.setBackground(new java.awt.Color(204, 0, 0));
        lblresp.setForeground(new java.awt.Color(204, 0, 0));
        lblresp.setToolTipText("");
        lblresp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lblrespKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblresp, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(144, 144, 144))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbMaterias5, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(jLabel2)))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(156, 156, 156)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNota2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNota1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNota3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNota5, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNota4, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lblControlNotas)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addGap(101, 101, 101)
                                .addComponent(jLabel1)
                                .addGap(104, 104, 104)
                                .addComponent(jLabel4)))
                        .addGap(34, 34, 34)
                        .addComponent(lblMsg5)
                        .addGap(123, 123, 123))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cmbCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cmbciclo, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cmbCum, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbMaterias3, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbMaterias2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbMaterias1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbMaterias4, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(51, 51, 51)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cmbvalor3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmbvalor4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmbvalor5, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmbvalor1, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmbvalor2, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(134, 134, 134)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(154, 154, 154)
                        .addComponent(jLabel8)
                        .addGap(289, 289, 289))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblMsg2)
                            .addComponent(lblMsg3)
                            .addComponent(lblMsg4)
                            .addComponent(lblMsg1))
                        .addGap(123, 123, 123))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(jLabel9))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblControlNotas)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbciclo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbCum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jLabel9)
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cmbMaterias1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNota1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblMsg1))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtNota2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbMaterias2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblMsg2)
                                    .addComponent(cmbvalor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtNota4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbMaterias3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblMsg3))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cmbMaterias4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNota3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblMsg4))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtNota5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbMaterias5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblMsg5)))
                            .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addComponent(lblresp, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(btnCalcular))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cmbvalor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84)
                        .addComponent(cmbvalor3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(cmbvalor4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(cmbvalor5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(212, 212, 212))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
           // TODO add your handling code here:
           
           calcularCUM();
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void txtNota1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNota1KeyReleased
        // TODO add your handling code here:
        if(txtNota1.getText().isEmpty()){
            c1 = 0;
            cr1 = 0;
        } else {
            if(Integer.parseInt(txtNota1.getText()) >=6 && Integer.parseInt(txtNota1.getText()) <= 10){
                lblMsg1.setText("Aprobada");
                c1++;
            } else {
                lblMsg1.setText("Reprobada");
                cr1++;
            }
        }
    }//GEN-LAST:event_txtNota1KeyReleased

    private void txtNota2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNota2KeyReleased
        // TODO add your handling code here:
        if(txtNota2.getText().isEmpty()){
            c2 = 0;
            cr2 = 0;
        } else {
            if(Integer.parseInt(txtNota2.getText()) >=6 && Integer.parseInt(txtNota2.getText()) <= 10){
                lblMsg2.setText("Aprobada");
                c2++;
            } else {
                lblMsg2.setText("Reprobada");
                cr2++;
            }
        }
    }//GEN-LAST:event_txtNota2KeyReleased

    private void txtNota3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNota3KeyReleased
        // TODO add your handling code here:
        if(txtNota3.getText().isEmpty()){
            c3 = 0;
            cr3 = 0;
        } else {
            if(Integer.parseInt(txtNota3.getText()) >=6 && Integer.parseInt(txtNota3.getText()) <= 10){
                lblMsg3.setText("Aprobada");
                c3++;
            } else {
                lblMsg3.setText("Reprobada");
                cr3++;
            }
        }
    }//GEN-LAST:event_txtNota3KeyReleased

    private void txtNota4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNota4KeyReleased
        // TODO add your handling code here:
        if(txtNota4.getText().isEmpty()){
            c4 = 0;
            cr4 = 0;
        } else {
            if(Integer.parseInt(txtNota4.getText()) >=6 && Integer.parseInt(txtNota4.getText()) <= 10){
                lblMsg4.setText("Aprobada");
                c4++;
            } else {
                lblMsg4.setText("Reprobada");
                cr4++;
            }
        }
    }//GEN-LAST:event_txtNota4KeyReleased

    private void txtNota5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNota5KeyReleased
        // TODO add your handling code here:
        if(txtNota5.getText().isEmpty()){
            c5 = 0;
            cr5 = 0;
        } else {
            if(Integer.parseInt(txtNota5.getText()) >=6 && Integer.parseInt(txtNota5.getText()) <= 10){
                lblMsg5.setText("Aprobada");
                c5++;
            } else {
                lblMsg5.setText("Reprobada");
                cr5++;
            }
        }
    }//GEN-LAST:event_txtNota5KeyReleased

    private void lblrespKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblrespKeyReleased
        // TODO add your handling code here:
     
    }//GEN-LAST:event_lblrespKeyReleased

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
            java.util.logging.Logger.getLogger(Pantalla_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pantalla_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pantalla_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pantalla_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pantalla_principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JComboBox<String> cmbCarrera;
    private javax.swing.JTextField cmbCum;
    private javax.swing.JComboBox<String> cmbMaterias1;
    private javax.swing.JComboBox<String> cmbMaterias2;
    private javax.swing.JComboBox<String> cmbMaterias3;
    private javax.swing.JComboBox<String> cmbMaterias4;
    private javax.swing.JComboBox<String> cmbMaterias5;
    private javax.swing.JComboBox<String> cmbciclo;
    private javax.swing.JComboBox<String> cmbvalor1;
    private javax.swing.JComboBox<String> cmbvalor2;
    private javax.swing.JComboBox<String> cmbvalor3;
    private javax.swing.JComboBox<String> cmbvalor4;
    private javax.swing.JComboBox<String> cmbvalor5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblControlNotas;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblMsg1;
    private javax.swing.JLabel lblMsg2;
    private javax.swing.JLabel lblMsg3;
    private javax.swing.JLabel lblMsg4;
    private javax.swing.JLabel lblMsg5;
    private javax.swing.JLabel lblresp;
    private java.awt.TextField textField1;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNota1;
    private javax.swing.JTextField txtNota2;
    private javax.swing.JTextField txtNota3;
    private javax.swing.JTextField txtNota4;
    private javax.swing.JTextField txtNota5;
    // End of variables declaration//GEN-END:variables
}
