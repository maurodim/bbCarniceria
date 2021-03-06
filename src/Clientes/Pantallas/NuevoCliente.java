/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clientes.Pantallas;

import Conversores.Numeros;
import Clientes.Objetos.ClientesTango;
import Clientes.Objetos.ListasDePrecios;
import facturacion.pantallas.IngresoDePedidos;
import interfaces.Personalizable;
import interfacesPrograma.Facturar;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author hernan
 */
public class NuevoCliente extends javax.swing.JInternalFrame {
    private ArrayList listadoL=new ArrayList();
    private ClientesTango cli;
    private int estado;
    /**
     * Creates new form NuevoCliente
     */
    public NuevoCliente() {
        initComponents();
        cli=new ClientesTango();
        estado=0;
    }
    public NuevoCliente(ClientesTango cliente){
        initComponents();
        cli=new ClientesTango();
        this.setTitle("MODIFICACION DE CLIENTES");
        estado=1;
        cli=cliente;
        this.jTextField1.setText(cli.getRazonSocial());
        this.jTextField2.setText(cli.getDireccion());
        this.jTextField5.setText(String.valueOf(cli.getCupoDeCredito()));
        this.jTextField3.setText(cli.getNumeroDeCuit());
        this.jTextField4.setText(cli.getTelefono());
        int condIva=Integer.parseInt(cli.getCondicionIva());
        condIva=condIva -1;
        this.jComboBox1.setSelectedIndex(condIva);
        this.jTextField1.requestFocus();
        
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
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jTextField5 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();

        setClosable(true);
        setResizable(true);
        setTitle("FACTURACION - CARGA DE NUEVO CLIENTE");

        jLabel1.setText("Razon Social");

        jLabel2.setText("Domicilio :");

        jLabel3.setText("Liimite de Credito:");

        jLabel4.setText("N° de CUIT:");

        jTextField3.setText("0");

        jLabel5.setText("Telefono :");

        jTextField4.setText("0");

        jButton1.setText("GUARDAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel6.setText("Lista de precios :");

        //ArrayList listadoL=new ArrayList();
        Personalizable per=new ListasDePrecios();
        ListasDePrecios listaP=new ListasDePrecios();
        listadoL=per.listar();
        Iterator ilL=listadoL.listIterator();
        while(ilL.hasNext()){
            listaP=(ListasDePrecios)ilL.next();
            jComboBox2.addItem(listaP.getDescripcionLista());
        }

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Consumidor Final", "Responsable Inscripto", "Exento" }));

        jLabel8.setText("Cond Iva:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextField1)
                                .addComponent(jTextField2)
                                .addComponent(jTextField3)
                                .addComponent(jTextField4)
                                .addComponent(jComboBox2, 0, 297, Short.MAX_VALUE)
                                .addComponent(jTextField5)))))
                .addContainerGap(342, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(158, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       //ClientesTango cli=new ClientesTango();
       //cli.setCodigoCliente(title);
       cli.setRazonSocial(this.jTextField1.getText());
       cli.setDireccion(this.jTextField2.getText());
       String condicion="1";
       switch (this.jComboBox1.getSelectedIndex()){
           case 1:
               condicion="2";
               break;
           case 2:
               condicion="3";
               break;
           case 3:
               condicion="4";
               break;
           default:
               condicion="1";
               break;
       }
       Double limite=Numeros.ConvertirStringADouble(this.jTextField5.getText());
       cli.setCupoDeCredito(limite);
       
           cli.setEmpresa("bu");
       
       ListasDePrecios lista=new ListasDePrecios();
       int posLista=this.jComboBox2.getSelectedIndex();
       if(posLista < 0)posLista=0;
       lista=(ListasDePrecios)listadoL.get(posLista);
       cli.setListaDePrecios(lista.getNumeroLista());
       if(cli.getCupoDeCredito() > 0.00){
           cli.setCondicionDeVenta(2);
       }else{
        cli.setCondicionDeVenta(1);
       }
       cli.setCoeficienteListaDeprecios(lista.getPorcentaje());
       cli.setCondicionIva(condicion);
       cli.setNumeroDeCuit(this.jTextField3.getText());
       cli.setTelefono(this.jTextField4.getText());
       Facturar fact=new ClientesTango();
       if(estado==0){
            fact.guardarNuevoCliente(cli);
           IngresoDePedidos.jCheckBox2.setSelected(true);
           IngresoDePedidos.jCheckBox2.setEnabled(false);
           IngresoDePedidos.cliT=cli;
           IngresoDePedidos.jLabel10.setText(cli.getRazonSocial());
       }
       if(estado==1){
           fact.modificarDatosDelCliente(cli);
           this.dispose();
       }
       this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
