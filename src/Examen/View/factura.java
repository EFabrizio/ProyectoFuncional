/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * factura.java
 *
 * Created on 08-dic-2011, 3:58:24
 */
package Examen.View;

import Examen.Controller.Conexion;
import Examen.View.Interface;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.print.Doc;
import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintException;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.SimpleDoc;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author AkaMM
 */
public class factura extends javax.swing.JFrame {

    /** Creates new form factura */
    public factura() {
        
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tproductos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTtotal = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTnombrefac = new javax.swing.JTextField();
        jTdireccionfac = new javax.swing.JTextField();
        jTrfcfac = new javax.swing.JTextField();
        jBimprimirfac = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jTnumfac = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        setTitle("Factura");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel6.setText("Nombre: ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, -1, -1));

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel7.setText("RFC:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, -1, -1));

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 12));
        jLabel8.setText("Direccion:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 178, -1, -1));

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel9.setText("Lugar de Expedicion: ");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        jLabel10.setFont(new java.awt.Font("Verdana", 1, 12));
        jLabel10.setText("Productos:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 313, -1, -1));

        jLabel11.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel11.setText("RFC:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 200, -1, -1));

        jLabel13.setFont(new java.awt.Font("Verdana", 1, 12));
        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 99, -1, -1));

        Tproductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nombre del Producto", "Precio", "Cantidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Tproductos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 335, 723, 207));

        jLabel1.setText("Farmacia \"Las Lomas\"");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, -1, -1));

        jLabel2.setText("TOSO850220GN9");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, -1, -1));

        jLabel3.setText("Baltazar N. 4  ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, -1, -1));

        jLabel4.setText("San Antonio Coaxomulco, Tlaxcala");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, -1, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 26));
        jLabel18.setForeground(new java.awt.Color(255, 0, 0));
        jLabel18.setText("$");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 590, 20, 60));

        jLabel14.setFont(new java.awt.Font("Verdana", 1, 12));
        jLabel14.setText("Total: ");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 613, -1, -1));

        jTtotal.setEditable(false);
        jTtotal.setText("0.00");
        jTtotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTtotalActionPerformed(evt);
            }
        });
        getContentPane().add(jTtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 604, 229, 37));

        jLabel15.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel15.setText("Nombre:");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 140, -1, -1));

        jLabel16.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel16.setText("Dirección:");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(488, 169, -1, -1));

        jTnombrefac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTnombrefacActionPerformed(evt);
            }
        });
        getContentPane().add(jTnombrefac, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 140, 220, -1));

        jTdireccionfac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTdireccionfacActionPerformed(evt);
            }
        });
        getContentPane().add(jTdireccionfac, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 170, 220, -1));

        jTrfcfac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTrfcfacActionPerformed(evt);
            }
        });
        getContentPane().add(jTrfcfac, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 200, 220, -1));

        jBimprimirfac.setText("Imprimir");
        jBimprimirfac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBimprimirfacActionPerformed(evt);
            }
        });
        getContentPane().add(jBimprimirfac, new org.netbeans.lib.awtextra.AbsoluteConstraints(558, 596, 150, 53));

        jLabel17.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel17.setText("Factura Nº: ");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 70, -1, 31));

        jTnumfac.setEditable(false);
        jTnumfac.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTnumfac.setToolTipText("");
        getContentPane().add(jTnumfac, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 70, 70, 25));

        jLabel35.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Factura", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        getContentPane().add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 38, 818, 630));

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondo1.jpg"))); // NOI18N
        jLabel31.setMaximumSize(new java.awt.Dimension(500, 500));
        jLabel31.setMinimumSize(new java.awt.Dimension(500, 500));
        jLabel31.setName(""); // NOI18N
        getContentPane().add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 890, 760));

        jMenu1.setText("Archivo");

        jMenuItem1.setText("Salir");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Info");

        jMenuItem2.setText("Acerca de...");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void jTtotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTtotalActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_jTtotalActionPerformed

private void jTnombrefacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTnombrefacActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_jTnombrefacActionPerformed

private void jTdireccionfacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTdireccionfacActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_jTdireccionfacActionPerformed

private void jTrfcfacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTrfcfacActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_jTrfcfacActionPerformed

private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        if(JOptionPane.showConfirmDialog(rootPane, "Estás seguro de cerrarla?","Cerrar aplicación",1)==0){
           this.dispose();
        }
}//GEN-LAST:event_jMenuItem1ActionPerformed

private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        JOptionPane.showMessageDialog(rootPane, "Realizado por:\n\n Abraham Moreno Meza \n Lizeth Toledo Leon");
}//GEN-LAST:event_jMenuItem2ActionPerformed

private void jBimprimirfacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBimprimirfacActionPerformed
        int j;
        Conexion con;
        ResultSet rs;
        String nomfac = jTnombrefac.getText();
        String rfcfac = jTrfcfac.getText();
        String direccionfac = jTdireccionfac.getText();
        String total = jTtotal.getText();
       
        Object producto;
        Object canti;
        String cadenita = "";
        String pro ="";
        
        
if(!nomfac.equals("") || !rfcfac.equals("") || !direccionfac.equals("")) {
if(JOptionPane.showConfirmDialog(rootPane, "Ya esta listo para imprimir la Factura?","Imprimir Factura",1)==0){
    String existe = null;
    int e;
        String ID = null;
        String ticket;
        String ss;
    
        
        try {
                //se crea la conexion y las consultas
                con = new Conexion();
                
                con.ejecutar("INSERT INTO `negocio`.`facturas` (`cantidad`, `nombre`, `direccion`, `rfc`) VALUES ('"+total+"', '"+nomfac+"', '"+direccionfac+"', '"+rfcfac+"');");
//                int to[] = new int[100];
//                float prec[] = new float[100];
                Object ex = null,precio=null;
                Object pros=null;
                
                // se crea la sentecia sql y se ejecuta para hacer la modificacion
               
//////                FileOutputStream os = null;
//////                try {
//////                    os = new FileOutputStream("ticket.txt");
//////                } catch (FileNotFoundException ex1) {
//////                    Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex1);
//////                }
//////                  PrintStream ps = new PrintStream(os);
                
                
                Interface row = new Interface();
                int rowCount = row.getFactura();
                vendedor vende = new vendedor();
                int rc = vende.getFactura();
                
                Date fecha = new Date();
                String cadena="Farmacia 'Las Lomas'\n----------------------\nRFC: TOSO850220GN9\nBaltazar N. 4  \nSan Antonio Coaxomulco, Tlaxcala\nFecha: "+fecha+"\n";
                String cade="----------------------\n\n\t>>Datos del Comprador<<\n\nNumero de Factura: "+jTnumfac.getText()+"\nNombre: "+nomfac+"\nRFC: "+rfcfac+"\nDireccion: "+direccionfac;
              //  System.out.println("Numero de Filas: "+rowCount);
                String enca="\n----------------------\nProducto\tCant.\tPrecio\n";
                for(int x=0;x<rowCount;x++){
                
                   producto = Tproductos.getValueAt(x,0);
                    pro = objectToString(producto);
                    
                    precio = Tproductos.getValueAt(x,1);
        //            String pre = objectToString(prec);
                   
                    canti = Tproductos.getValueAt(x,2);
        //            String c = objectToString(canti);
                   
                    
                    if(pro.length()<=8)
                        pro=pro+"     ";
                    if(pro.length()>15)
                        pro = pro.substring(0, 15);
                                
                    cadenita = cadenita+"\n"+pro+"\t"+canti+"\t"+precio+"";
                   
                }
                for(int x=0;x<rc;x++){
                
                   producto = Tproductos.getValueAt(x,0);
                    pro = objectToString(producto);
                    
                    precio = Tproductos.getValueAt(x,1);
        //            String pre = objectToString(prec);
                   
                    canti = Tproductos.getValueAt(x,2);
        //            String c = objectToString(canti);
                   
                    
                    if(pro.length()<=8)
                        pro=pro+"     ";
                    if(pro.length()>15)
                        pro = pro.substring(0, 15);
                                
                    cadenita = cadenita+"\n"+pro+"\t"+canti+"\t"+precio+"";
                   
                }
                 ticket = cadena+cade+enca+cadenita+"\n\nTotal: \t\t$"+jTtotal.getText()+"\n\n----------------------\n    CON EL CORAZON EN LAS MANOS\n    GRACIAS POR SU COMPRA.\n\n\n\n";
                
                        
                         
              
                
                
                //Cogemos el servicio de impresión por defecto (impresora por defecto)
PrintService service = PrintServiceLookup.lookupDefaultPrintService();
//Le decimos el tipo de datos que vamos a enviar a la impresora
//Tipo: bytes Subtipo: autodetectado
DocFlavor flavor = DocFlavor.BYTE_ARRAY.AUTOSENSE;
//Creamos un trabajo de impresión
DocPrintJob pj = service.createPrintJob();
//Nuestro trabajo de impresión envía una cadena de texto
 ss=new String(ticket);
byte[] bytes;
//Transformamos el texto a bytes que es lo que soporta la impresora
bytes=ss.getBytes();
//Creamos un documento (Como si fuese una hoja de Word para imprimir)
Doc doc=new SimpleDoc(bytes,flavor,null);

//Obligado coger la excepción PrintException
  //Mandamos a impremir el documento
  pj.print(doc, null);


                
                
////                ps.println(ticket);
////                  ps.close();
                
                 
                
               String t=jTtotal.getText();
//               String id34=jTID.getText();
               ticket = "";
                //String venta = "INSERT INTO `ventas`(`total`, `id_usuario`) VALUES (,'"+t+"','"+id34+"')";
//                String venta = "INSERT INTO  `negocio`.`ventas` (`id_ventas` ,`total` ,`fecha` ,`Id_usuario`)VALUES (NULL ,  '"+t+"', CURRENT_TIMESTAMP ,  '"+id34+"');";
//                con.ejecutar(venta);
//////////////////                for(int i=0;i<j;i++){
//////////////////                    venta = "INSERT INTO `negocio`.`vendidos` (`id_vendido`, `producto`, `precio`, `cantidad`, `fecha`, `Id_usuario`) VALUES (NULL, '"+pro[i]+"', '"+prec[i]+"', '"+to[i]+"', CURRENT_TIMESTAMP, '"+id34+"');";
//////////////////                    con.ejecutar(venta);
//////////////////                }
                JOptionPane.showMessageDialog(null, "   Imprimiendo Factura");
               this.dispose();


              
               
    
    
                


            }   catch (PrintException ex1) {
                    Logger.getLogger(factura.class.getName()).log(Level.SEVERE, null, ex1);
                }  catch (ClassNotFoundException ex) {
                Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
            }

        
    
    
}
}
else 
    JOptionPane.showMessageDialog(rootPane, "Faltan Campos por Llenar");

// TODO add your handling code here:
}//GEN-LAST:event_jBimprimirfacActionPerformed

    /**
     * @param args the command line arguments
     */


public void setTabla(JTable datos){
    this.Tproductos=datos;

}

public void setTotal(String total){
    jTtotal.setText(total);
}

public int getFactura(int filas){
    return filas;
}

public String objectToString(Object o) {
        String st;
        st = (String) o;
        return st;
    }

public JTable getTabla(){
    return this.Tproductos;
}
public void setNum(int num){
    String x = String.valueOf(num);
    jTnumfac.setText(x);
}

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
            java.util.logging.Logger.getLogger(factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                    factura fact =    new factura();
                    fact.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tproductos;
    private javax.swing.JButton jBimprimirfac;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTdireccionfac;
    private javax.swing.JTextField jTnombrefac;
    private javax.swing.JTextField jTnumfac;
    private javax.swing.JTextField jTrfcfac;
    private javax.swing.JTextField jTtotal;
    // End of variables declaration//GEN-END:variables
}