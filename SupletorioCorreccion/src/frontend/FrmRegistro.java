/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;

import backend.ClsAccesorio;
import backend.*;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Andrea Lizeth
 */
public class FrmRegistro extends javax.swing.JFrame {
    String ProductoSeleccionado;
    Controlador controlador=new Controlador();
    ArrayList<Object> Computador;
    ArrayList<Object> Componentes;
    ArrayList<Object> Accesorios;
    ArrayList<ClsComputador> computadores= new ArrayList();
    ArrayList<ClsComponente> componentes= new ArrayList();
    ArrayList<ClsAccesorio> accesorios= new ArrayList();
    

    /**
     * Creates new form FrmRegistro
     */
    public FrmRegistro() {
        initComponents();
        setLocationRelativeTo(null);
        llenarCategorias();
        btnGuardar.setEnabled(false);
        
        
        
       
    }
public void llenarCategorias(){

       
        String [] listCategorias = new  String []{
         "Computador", "Componente", "Accesorio"
        };
        
        DefaultComboBoxModel cmbCategoriasModel = new DefaultComboBoxModel (listCategorias);
        cmbProductos.setModel(cmbCategoriasModel);
}

public void CargarComputadoras(){
    Computador=controlador.extraerObjetos("computadores.dat");
    computadores.clear();
    DefaultTableModel modelo = (DefaultTableModel) jTable.getModel();
    modelo.setRowCount(0);
    String [] com = new String[]{"Nombre","Precio","Marca","Tipo","Capacidad","Ram","Procesador"};
            modelo.setColumnIdentifiers(com);
            
            if(!Computador.isEmpty()){
                
            
     for (int i = 0; i < Computador.size(); i++) {
            ClsComputador compu = (ClsComputador) Computador.get(i);
            computadores.add(compu);
        }
     Object items[] = new Object[7];
            for (int i = 0; i < Computador.size(); i++) {
                
                items[0] = computadores.get(i).getNombre();
                items[1] = computadores.get(i).getPrecio();
                items[2] = computadores.get(i).getMarca();
                items[3] = computadores.get(i).getTipo();
                items[4] = computadores.get(i).getCapacidad();
                items[5] = computadores.get(i).getRam();
                items[6] = computadores.get(i).getProcesador();
                modelo.addRow(items);
            
                
            }
            }
     }
public void CargarComponentes(){
   Componentes=controlador.extraerObjetos("componentes.dat");
   componentes.clear();
    DefaultTableModel modelo = (DefaultTableModel) jTable.getModel();
    modelo.setRowCount(0);
    String [] com = new String[]{"Nombre","Precio","Marca","Tipo","Capacidad","Velocidad"};
            modelo.setColumnIdentifiers(com);
            
            if(!Componentes.isEmpty()){
            for (int i = 0; i < Componentes.size(); i++) {
            ClsComponente compo = (ClsComponente) Componentes.get(i);
            componentes.add(compo);
        }
     Object items[] = new Object[6];
            for (int i = 0; i < Componentes.size(); i++) {
                
                items[0] = componentes.get(i).getNombre();
                items[1] = componentes.get(i).getPrecio();
                items[2] = componentes.get(i).getMarca();
                items[3] = componentes.get(i).getTipo();
                items[4] = componentes.get(i).getCapacidad();
                items[5] = componentes.get(i).getVelocidad();
           
                modelo.addRow(items);
            
                
            }
           
            }
}
public void CargarAccesorios(){
   Accesorios=controlador.extraerObjetos("accesorios.dat");
   accesorios.clear();
    DefaultTableModel modelo = (DefaultTableModel) jTable.getModel();
    modelo.setRowCount(0);
    String [] com = new String[]{"Nombre","Precio","Marca","Tipo","Color"};
            modelo.setColumnIdentifiers(com);
            
            if(!Accesorios.isEmpty()){
    for (int i = 0; i < Accesorios.size(); i++) {
            ClsAccesorio compo = (ClsAccesorio) Accesorios.get(i);
            accesorios.add(compo);
        }
     Object items[] = new Object[5];
            for (int i = 0; i < Accesorios.size(); i++) {
                
                items[0] = accesorios.get(i).getNombre();
                items[1] = accesorios.get(i).getPrecio();
                items[2] = accesorios.get(i).getMarca();
                items[3] = accesorios.get(i).getTipo();
                items[4] = accesorios.get(i).getColor();
                
           
                modelo.addRow(items);
            
                
            }
            }
}
public void guardarComputadores(){
    ClsComputador compu=new ClsComputador(txtTipo.getText(),Integer.parseInt(txt2.getText()),Integer.parseInt(txt3.getText()), txt4.getText(), txtNombre.getText(), txtMarca.getText(), Double.parseDouble(txtPrecio.getText()));
    Computador.add(compu);
    controlador.escribirObjeto("computadores.dat", Computador);
}

public void guardarComponentes(){
    ClsComponente compo= new ClsComponente(txtTipo.getText(),Integer.parseInt(txt2.getText()),txt3.getText(), txtNombre.getText(), txtMarca.getText(), Double.parseDouble(txtPrecio.getText()));
    Componentes.add(compo);
    controlador.escribirObjeto("componentes.dat", Componentes);
}   
        
public void guardarAccesorios(){
    ClsAccesorio acceso= new ClsAccesorio(txtTipo.getText(),txt2.getText(),txtNombre.getText(), txtMarca.getText(), Double.parseDouble(txtPrecio.getText()));
    Accesorios.add(acceso);
    controlador.escribirObjeto("accesorios.dat", Accesorios);
    
}
public void limpiar(){
    txtTipo.setText("");
    txt4.setText("");
    txt2.setText("");
    txt3.setText("");
    txtNombre.setText("");
    txtMarca.setText("");
    txtPrecio.setText("");
  
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
        jPanel2 = new javax.swing.JPanel();
        cmbProductos = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        txtMarca = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        lbl1 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        lbl3 = new javax.swing.JLabel();
        lbl4 = new javax.swing.JLabel();
        txtTipo = new javax.swing.JTextField();
        txt2 = new javax.swing.JTextField();
        txt3 = new javax.swing.JTextField();
        txt4 = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        lblg = new javax.swing.JLabel();
        lblg1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "REGISTRO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Gill Sans MT", 0, 11))); // NOI18N
        jPanel1.setFont(new java.awt.Font("Gill Sans MT", 0, 11)); // NOI18N

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setFont(new java.awt.Font("Gill Sans MT", 0, 11)); // NOI18N

        cmbProductos.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        cmbProductos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbProductosActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Gill Sans MT", 0, 11)); // NOI18N
        jLabel1.setText("NOMBRE:");

        jLabel2.setFont(new java.awt.Font("Gill Sans MT", 0, 11)); // NOI18N
        jLabel2.setText("PRECIO:");

        jLabel3.setFont(new java.awt.Font("Gill Sans MT", 0, 11)); // NOI18N
        jLabel3.setText("MARCA:");

        txtPrecio.setFont(new java.awt.Font("Gill Sans MT", 0, 11)); // NOI18N
        txtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioKeyTyped(evt);
            }
        });

        txtMarca.setFont(new java.awt.Font("Gill Sans MT", 0, 11)); // NOI18N

        txtNombre.setFont(new java.awt.Font("Gill Sans MT", 0, 11)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(cmbProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cmbProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setFont(new java.awt.Font("Gill Sans MT", 0, 11)); // NOI18N

        lbl1.setFont(new java.awt.Font("Gill Sans MT", 0, 11)); // NOI18N
        lbl1.setText("TIPO:");

        lbl2.setFont(new java.awt.Font("Gill Sans MT", 0, 11)); // NOI18N
        lbl2.setText("CAPACIDAD:");

        lbl3.setFont(new java.awt.Font("Gill Sans MT", 0, 11)); // NOI18N
        lbl3.setText("RAM:");

        lbl4.setFont(new java.awt.Font("Gill Sans MT", 0, 11)); // NOI18N
        lbl4.setText("PROCESADOR:");

        txtTipo.setFont(new java.awt.Font("Gill Sans MT", 0, 11)); // NOI18N

        txt2.setFont(new java.awt.Font("Gill Sans MT", 0, 11)); // NOI18N
        txt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt2ActionPerformed(evt);
            }
        });

        txt3.setFont(new java.awt.Font("Gill Sans MT", 0, 11)); // NOI18N
        txt3.setInheritsPopupMenu(true);
        txt3.setOpaque(false);

        txt4.setFont(new java.awt.Font("Gill Sans MT", 0, 11)); // NOI18N

        btnGuardar.setFont(new java.awt.Font("Gill Sans MT", 0, 11)); // NOI18N
        btnGuardar.setText("GUARDAR");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        lblg.setFont(new java.awt.Font("Gill Sans MT", 0, 11)); // NOI18N
        lblg.setText("GB");

        lblg1.setFont(new java.awt.Font("Gill Sans MT", 0, 11)); // NOI18N
        lblg1.setText("GB");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnGuardar)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl2)
                                    .addComponent(lbl3)
                                    .addComponent(lbl1))
                                .addGap(28, 28, 28))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lbl4)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTipo, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                            .addComponent(txt2)
                            .addComponent(txt3)
                            .addComponent(txt4))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblg)
                    .addComponent(lblg1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl1)
                    .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl2)
                    .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblg))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl3)
                    .addComponent(lblg1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl4))
                .addGap(18, 18, 18)
                .addComponent(btnGuardar)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DATOS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Gill Sans MT", 0, 11))); // NOI18N
        jPanel4.setFont(new java.awt.Font("Gill Sans MT", 0, 11)); // NOI18N

        jTable.setFont(new java.awt.Font("Gill Sans MT", 0, 11)); // NOI18N
        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 443, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt2ActionPerformed

    private void cmbProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbProductosActionPerformed
        // TODO add your handling code here:
        ProductoSeleccionado = (String) cmbProductos.getSelectedItem();
        btnGuardar.setEnabled(true);
        if ( ProductoSeleccionado.equals("Computador")){
            lbl3.setVisible(true);
            lbl4.setVisible(true);
            lbl1.setText("TIPO:");
            lbl2.setText("CAPACIDAD:");
            lbl3.setText("RAM:");
            lblg.setVisible(true);
            lblg1.setVisible(true);
            lbl4.setText("PROCESADOR:");
            txtTipo.setVisible(true);
            txt2.setVisible(true);
            txt3.setVisible(true);
            txt4.setVisible(true);
            CargarComputadoras();
       
        }
         if ( ProductoSeleccionado.equals("Componente")){
             lbl3.setVisible(true);
             txt3.setVisible(true);
            lbl1.setText("TIPO:");
            lblg.setVisible(true);
            lblg1.setVisible(false);
            lbl2.setText("CAPACIDAD:");
            lbl3.setText("VELOCIDAD:");
            lbl4.setVisible(false);
            txtTipo.setVisible(true);
            txt2.setVisible(true);
            txt3.setVisible(true);
            txt4.setVisible(false);
            CargarComponentes();
       
        }
         if ( ProductoSeleccionado.equals("Accesorio")){
            lbl1.setText("TIPO:");
            lbl2.setText("COLOR:");
            lblg.setVisible(false);
            lblg1.setVisible(false);
            lbl3.setVisible(false);
            lbl4.setVisible(false);
            txtTipo.setVisible(true);
            txt2.setVisible(true);
            txt3.setVisible(false);
            txt4.setVisible(false);
            CargarAccesorios();
       
        }
    }//GEN-LAST:event_cmbProductosActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        
        if(ProductoSeleccionado.equals("Computador")){
            if(txtNombre.getText().length()!=0 || txtTipo.getText().length()!=0|| txtMarca.getText().length()!=0
                    ||txtPrecio.getText().length()!=0||txt2.getText().length()!=0
                    ||txt3.getText().length()!=0 ||txt4.getText().length()!=0){
               guardarComputadores();
            
            limpiar();
            Computador=controlador.extraerObjetos("computadores.dat");
            CargarComputadoras(); 
            }else{
                JOptionPane.showMessageDialog(rootPane,"Ingrese todos los datos");
            }
            
        }
        if(ProductoSeleccionado.equals("Componente")){
            if(!txtNombre.getText().equals("")||!txtTipo.getText().equals("")||!txtMarca.getText().equals("")
                    ||!txtPrecio.getText().equals("")||!txt2.getText().equals("")
                    ||!txt3.getText().equals("")){
            guardarComponentes();
            limpiar();
            Componentes=controlador.extraerObjetos("componentes.dat");
            CargarComponentes();
            }else{
                JOptionPane.showMessageDialog(rootPane,"Ingrese todos los datos");
            }
        }
        if(ProductoSeleccionado.equals("Accesorio")){
            if(!txtNombre.getText().equals("")||!txtTipo.getText().equals("")||!txtMarca.getText().equals("")
                    ||!txtPrecio.getText().equals("")||!txt2.getText().equals("")
                   ){
            guardarAccesorios();
            limpiar();
            
            Accesorios=controlador.extraerObjetos("accesorios.dat");
            CargarAccesorios();
            }else{
                JOptionPane.showMessageDialog(rootPane, "Ingrese todos los datos");
            }
        }
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyTyped
        // TODO add your handling code here:
        /*char c=evt.getKeyChar();
    
          if(Character.isLetter(c)) { 
         
                   
                   
              getToolkit().beep(); 
               
              evt.consume(); 
               }*/
    }//GEN-LAST:event_txtPrecioKeyTyped

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
            java.util.logging.Logger.getLogger(FrmRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmRegistro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> cmbProductos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl4;
    private javax.swing.JLabel lblg;
    private javax.swing.JLabel lblg1;
    private javax.swing.JTextField txt2;
    private javax.swing.JTextField txt3;
    private javax.swing.JTextField txt4;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtTipo;
    // End of variables declaration//GEN-END:variables
}
