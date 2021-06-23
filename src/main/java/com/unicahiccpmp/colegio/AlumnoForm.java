/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicahiccpmp.colegio;
import com.unicahiccpmp.dao.Alumno;
import com.unicahiccpmp.dao.AlumnoModel;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
/**
 *
 * @author obetancourth
 */
public class AlumnoForm extends javax.swing.JDialog {

    private Alumno currentAlumno;
    private boolean _reloadParent = false;
    private String _mode;
    
    public boolean getReloadParent(){
        return _reloadParent;
    }
    /**
     * Creates new form AlumnoForm
     */
    public AlumnoForm(String Mode, double id) {
        initComponents();
        setModal(true);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        
        
        // INS, UPD, DEL, DSP
        _mode = Mode;
        if (!Mode.equals("INS")){
            //No es un insert por tando debe existir en la DB
            //Proceso para capturar el Registro
            System.out.println(id);
            currentAlumno = AlumnoModel.getAlumnosById(id);
            jTNombres.setText(currentAlumno.getNOMBRES());
            jTApellidos.setText(currentAlumno.getAPELLIDOS());
            jTIdentidad.setText(currentAlumno.getIDENTIDAD());
            jTTelefono.setText(currentAlumno.getTELEFONO());
            jTCorreo.setText(currentAlumno.getCORREO());
            jTFchNacimiento.setText(currentAlumno.getFCHNAC());
            jCGenero.setSelectedItem(currentAlumno.getGENERO());
            
        } else {
            currentAlumno = new Alumno();
        }
        switch(Mode){
            case "INS":
                jLTitle.setText("Agregando nuevo Alumno");
                JBConfirmar.setText("Agregar");
                break;
            case "UPD":
                jLTitle.setText(String.format("Actualizando Alumno %.0f %s", currentAlumno.getID(), currentAlumno.getNOMBRECOMPLETO()));
                JBConfirmar.setText("Editar");
                break;
            case "DEL":
                jLTitle.setText(String.format("Eliminar Alumno %.0f %s", currentAlumno.getID(), currentAlumno.getNOMBRECOMPLETO()));
                JBConfirmar.setText("Eliminar");
                break;
            case "DSP":
                JBConfirmar.setVisible(false);
                JBCancel.setText("Salir");
                jLTitle.setText(String.format("Alumno %.0f %s", currentAlumno.getID(), currentAlumno.getNOMBRECOMPLETO()));
                break;
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

        jPanel1 = new javax.swing.JPanel();
        jLTitle = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTNombres = new javax.swing.JTextField();
        jTApellidos = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTIdentidad = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTTelefono = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTCorreo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jCGenero = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jTFchNacimiento = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jCGrado = new javax.swing.JComboBox<>();
        JBCancel = new javax.swing.JButton();
        JBConfirmar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jCEstado = new javax.swing.JComboBox<>();

        setSize(new java.awt.Dimension(401, 390));
        setType(java.awt.Window.Type.POPUP);

        jPanel1.setSize(new java.awt.Dimension(401, 373));

        jLTitle.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLTitle.setText("Trabajar con Alumno");

        jLabel2.setText("Nombres");

        jLabel3.setText("Apellidos");

        jLabel4.setText("Identidad");

        jLabel5.setText("Teléfono");

        jLabel6.setText("Correo");

        jLabel7.setText("Género");
        jLabel7.setMaximumSize(new java.awt.Dimension(59, 16));
        jLabel7.setMinimumSize(new java.awt.Dimension(59, 16));
        jLabel7.setPreferredSize(new java.awt.Dimension(59, 16));

        jCGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Femenino", "Masculino", " " }));
        jCGenero.setMinimumSize(new java.awt.Dimension(10, 26));
        jCGenero.setPreferredSize(new java.awt.Dimension(10, 26));
        jCGenero.setSize(new java.awt.Dimension(10, 26));

        jLabel8.setText("Nacimiento (YYYY-MM-DD)");

        jTFchNacimiento.setToolTipText("YYYY-MM-DD");

        jLabel9.setText("Grado");
        jLabel9.setMaximumSize(new java.awt.Dimension(59, 16));
        jLabel9.setMinimumSize(new java.awt.Dimension(59, 16));
        jLabel9.setPreferredSize(new java.awt.Dimension(59, 16));
        jLabel9.setSize(new java.awt.Dimension(0, 0));

        jCGrado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1er Grado", "2do Grado", "3er Grado", "4to Grado", "5to Grado", "6to Grado", "7mo Grado", "8vo Grado", "9no Grado" }));
        jCGrado.setMinimumSize(new java.awt.Dimension(120, 27));

        JBCancel.setText("Cancelar");
        JBCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JBCancelMouseClicked(evt);
            }
        });

        JBConfirmar.setText("Agregar");
        JBConfirmar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JBConfirmarMouseClicked(evt);
            }
        });

        jLabel10.setText("Estado");

        jCEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sección A", "Sección B", "Sección D" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTCorreo)
                    .addComponent(jLTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTNombres, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTIdentidad, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                                .addComponent(jTApellidos)
                                .addComponent(jLabel5))
                            .addComponent(jTTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jCGrado, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCGenero, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTFchNacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10)
                            .addComponent(jCEstado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(JBConfirmar)
                        .addGap(18, 18, 18)
                        .addComponent(JBCancel)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTIdentidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFchNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCGrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBCancel)
                    .addComponent(JBConfirmar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void JBCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBCancelMouseClicked
        // TODO add your handling code here:
        _reloadParent = false;
        dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
    }//GEN-LAST:event_JBCancelMouseClicked

    private void JBConfirmarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBConfirmarMouseClicked
        // TODO add your handling code here:
        
        
        //Extrer la informacion
        currentAlumno.setNOMBRES(jTNombres.getText());
        currentAlumno.setAPELLIDOS(jTApellidos.getText());
        currentAlumno.setIDENTIDAD(jTIdentidad.getText());
        currentAlumno.setTELEFONO(jTTelefono.getText());
        currentAlumno.setCORREO(jTCorreo.getText());
        currentAlumno.setFCHNAC(jTFchNacimiento.getText());
        currentAlumno.setGENERO(jCGenero.getSelectedItem().toString());
        
        switch(_mode){
            case "INS":
                break;
            case "UPD":
                break;
            case "DEL":
                break;
        }
        
        _reloadParent = true;
        dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
    }//GEN-LAST:event_JBConfirmarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBCancel;
    private javax.swing.JButton JBConfirmar;
    private javax.swing.JComboBox<String> jCEstado;
    private javax.swing.JComboBox<String> jCGenero;
    private javax.swing.JComboBox<String> jCGrado;
    private javax.swing.JLabel jLTitle;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTApellidos;
    private javax.swing.JTextField jTCorreo;
    private javax.swing.JTextField jTFchNacimiento;
    private javax.swing.JTextField jTIdentidad;
    private javax.swing.JTextField jTNombres;
    private javax.swing.JTextField jTTelefono;
    // End of variables declaration//GEN-END:variables
}
