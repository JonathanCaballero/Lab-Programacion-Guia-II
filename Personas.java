package GuiaII;
import java.util.HashMap;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

public class Personas extends javax.swing.JFrame 
{
    int n=100;
    int i=0;
    int[] cedula = new int[n];
    double[] edad = new double[n];
    double[] estatura = new double[n];
    String[] nombre = new String[n];
    

    Algoritmos algs = new Algoritmos();
    int tam;
    
    public Personas() 
    {
        initComponents();
        Color colorPersonalizado = new Color(3,1,35);
        getContentPane().setBackground(colorPersonalizado);
        Border textAreaBorder = BorderFactory.createLineBorder(Color.DARK_GRAY, 2);
        
        listaOriginal.setBorder(textAreaBorder);
        listaOrdenada.setBorder(textAreaBorder);
    }
    
    @SuppressWarnings("unchecked")
     // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
     private void initComponents() {

          Nombre = new javax.swing.JTextField();
          jLabel1 = new javax.swing.JLabel();
          Cedula = new javax.swing.JTextField();
          jLabel2 = new javax.swing.JLabel();
          Edad = new javax.swing.JTextField();
          jLabel3 = new javax.swing.JLabel();
          Estatura = new javax.swing.JTextField();
          jLabel4 = new javax.swing.JLabel();
          newPersona = new javax.swing.JButton();
          tipoDato = new javax.swing.JComboBox<>();
          jLabel5 = new javax.swing.JLabel();
          jLabel6 = new javax.swing.JLabel();
          tipoOrdenamiento = new javax.swing.JComboBox<>();
          Ordenar = new javax.swing.JButton();
          jLabel7 = new javax.swing.JLabel();
          jLabel8 = new javax.swing.JLabel();
          jScrollPane1 = new javax.swing.JScrollPane();
          listaOriginal = new javax.swing.JTextArea();
          jScrollPane2 = new javax.swing.JScrollPane();
          listaOrdenada = new javax.swing.JTextArea();
          jLabel9 = new javax.swing.JLabel();

          setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
          setBackground(new java.awt.Color(0, 0, 20));

          Nombre.setBackground(new java.awt.Color(45, 45, 45));
          Nombre.setFont(new java.awt.Font("Hack Nerd Font", 0, 14)); // NOI18N
          Nombre.setForeground(new java.awt.Color(72, 112, 255));
          Nombre.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
          Nombre.setCaretColor(new java.awt.Color(72, 112, 255));
          Nombre.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    NombreActionPerformed(evt);
               }
          });

          jLabel1.setBackground(new java.awt.Color(0, 255, 255));
          jLabel1.setFont(new java.awt.Font("Hack Nerd Font", 1, 14)); // NOI18N
          jLabel1.setForeground(new java.awt.Color(0, 255, 255));
          jLabel1.setText("Nombre");

          Cedula.setBackground(new java.awt.Color(45, 45, 45));
          Cedula.setFont(new java.awt.Font("Hack Nerd Font", 0, 14)); // NOI18N
          Cedula.setForeground(new java.awt.Color(72, 112, 255));
          Cedula.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
          Cedula.setCaretColor(new java.awt.Color(72, 112, 255));
          Cedula.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    CedulaActionPerformed(evt);
               }
          });

          jLabel2.setBackground(new java.awt.Color(0, 255, 255));
          jLabel2.setFont(new java.awt.Font("Hack Nerd Font", 1, 14)); // NOI18N
          jLabel2.setForeground(new java.awt.Color(0, 255, 255));
          jLabel2.setText("Cedula");

          Edad.setBackground(new java.awt.Color(45, 45, 45));
          Edad.setFont(new java.awt.Font("Hack Nerd Font", 0, 14)); // NOI18N
          Edad.setForeground(new java.awt.Color(72, 112, 255));
          Edad.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
          Edad.setCaretColor(new java.awt.Color(72, 112, 255));
          Edad.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    EdadActionPerformed(evt);
               }
          });

          jLabel3.setBackground(new java.awt.Color(0, 255, 255));
          jLabel3.setFont(new java.awt.Font("Hack Nerd Font", 1, 14)); // NOI18N
          jLabel3.setForeground(new java.awt.Color(0, 255, 255));
          jLabel3.setText("Edad");

          Estatura.setBackground(new java.awt.Color(45, 45, 45));
          Estatura.setFont(new java.awt.Font("Hack Nerd Font", 0, 14)); // NOI18N
          Estatura.setForeground(new java.awt.Color(72, 112, 255));
          Estatura.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
          Estatura.setCaretColor(new java.awt.Color(72, 112, 255));
          Estatura.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    EstaturaActionPerformed(evt);
               }
          });

          jLabel4.setBackground(new java.awt.Color(0, 255, 255));
          jLabel4.setFont(new java.awt.Font("Hack Nerd Font", 1, 14)); // NOI18N
          jLabel4.setForeground(new java.awt.Color(0, 255, 255));
          jLabel4.setText("Estatura");

          newPersona.setBackground(new java.awt.Color(51, 51, 51));
          newPersona.setFont(new java.awt.Font("Hack Nerd Font", 1, 12)); // NOI18N
          newPersona.setForeground(new java.awt.Color(72, 112, 255));
          newPersona.setText("Agregar persona");
          newPersona.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    newPersonaActionPerformed(evt);
               }
          });

          tipoDato.setBackground(new java.awt.Color(45, 45, 45));
          tipoDato.setFont(new java.awt.Font("Hack Nerd Font", 0, 12)); // NOI18N
          tipoDato.setForeground(new java.awt.Color(0, 255, 255));
          tipoDato.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "Altura", "Edad" }));
          tipoDato.setBorder(null);
          tipoDato.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
          tipoDato.setOpaque(true);
          tipoDato.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    tipoDatoActionPerformed(evt);
               }
          });

          jLabel5.setBackground(new java.awt.Color(0, 255, 255));
          jLabel5.setFont(new java.awt.Font("Hack Nerd Font", 1, 14)); // NOI18N
          jLabel5.setForeground(new java.awt.Color(0, 255, 255));
          jLabel5.setText("Ordenar por:");

          jLabel6.setBackground(new java.awt.Color(0, 255, 255));
          jLabel6.setFont(new java.awt.Font("Hack Nerd Font", 1, 14)); // NOI18N
          jLabel6.setForeground(new java.awt.Color(0, 255, 255));
          jLabel6.setText("Tipo de ordenamiento:");

          tipoOrdenamiento.setBackground(new java.awt.Color(45, 45, 45));
          tipoOrdenamiento.setFont(new java.awt.Font("Hack Nerd Font", 0, 12)); // NOI18N
          tipoOrdenamiento.setForeground(new java.awt.Color(0, 255, 255));
          tipoOrdenamiento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "Burbuja", "Merge" }));
          tipoOrdenamiento.setBorder(null);
          tipoOrdenamiento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
          tipoOrdenamiento.setOpaque(true);
          tipoOrdenamiento.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    tipoOrdenamientoActionPerformed(evt);
               }
          });

          Ordenar.setBackground(new java.awt.Color(51, 51, 51));
          Ordenar.setFont(new java.awt.Font("Hack Nerd Font", 1, 14)); // NOI18N
          Ordenar.setForeground(new java.awt.Color(72, 112, 255));
          Ordenar.setText("Ordenar");
          Ordenar.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    OrdenarActionPerformed(evt);
               }
          });

          jLabel7.setBackground(new java.awt.Color(0, 255, 255));
          jLabel7.setFont(new java.awt.Font("Hack Nerd Font Mono", 1, 15)); // NOI18N
          jLabel7.setForeground(new java.awt.Color(0, 255, 255));
          jLabel7.setText("Lista de personas");

          jLabel8.setBackground(new java.awt.Color(0, 255, 255));
          jLabel8.setFont(new java.awt.Font("Hack Nerd Font", 1, 15)); // NOI18N
          jLabel8.setForeground(new java.awt.Color(0, 255, 255));
          jLabel8.setText("Lista ordenada");

          listaOriginal.setEditable(false);
          listaOriginal.setBackground(new java.awt.Color(45, 45, 45));
          listaOriginal.setColumns(20);
          listaOriginal.setFont(new java.awt.Font("Hack Nerd Font", 0, 12)); // NOI18N
          listaOriginal.setForeground(new java.awt.Color(72, 112, 255));
          listaOriginal.setRows(5);
          listaOriginal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
          listaOriginal.setCaretColor(new java.awt.Color(45, 45, 45));
          listaOriginal.setHighlighter(null);
          listaOriginal.setMargin(new java.awt.Insets(0, 0, 0, 0));
          listaOriginal.setSelectedTextColor(new java.awt.Color(0, 0, 0));
          listaOriginal.setSelectionColor(new java.awt.Color(255, 0, 255));
          jScrollPane1.setViewportView(listaOriginal);

          listaOrdenada.setBackground(new java.awt.Color(45, 45, 45));
          listaOrdenada.setColumns(20);
          listaOrdenada.setFont(new java.awt.Font("Hack Nerd Font", 0, 12)); // NOI18N
          listaOrdenada.setForeground(new java.awt.Color(72, 112, 255));
          listaOrdenada.setRows(5);
          listaOrdenada.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
          listaOrdenada.setCaretColor(new java.awt.Color(45, 45, 45));
          listaOrdenada.setSelectedTextColor(new java.awt.Color(0, 0, 0));
          listaOrdenada.setSelectionColor(new java.awt.Color(255, 0, 255));
          jScrollPane2.setViewportView(listaOrdenada);

          jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
          jLabel9.setForeground(new java.awt.Color(0, 255, 255));
          jLabel9.setText("Ordenador de Usuarios");

          javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
          getContentPane().setLayout(layout);
          layout.setHorizontalGroup(
               layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                         .addGroup(layout.createSequentialGroup()
                              .addGap(18, 18, 18)
                              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                   .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(15, 15, 15)
                                        .addComponent(Estatura))
                                   .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                   .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                             .addComponent(jLabel1)
                                             .addComponent(jLabel2)
                                             .addComponent(jLabel3))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                             .addComponent(Edad)
                                             .addComponent(Cedula)
                                             .addComponent(Nombre)))
                                   .addComponent(newPersona, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                   .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE))
                              .addGap(47, 47, 47)
                              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                   .addComponent(tipoOrdenamiento, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                   .addComponent(Ordenar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                   .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                   .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                                   .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                                   .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
                                   .addComponent(tipoDato, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                         .addGroup(layout.createSequentialGroup()
                              .addGap(217, 217, 217)
                              .addComponent(jLabel9)))
                    .addContainerGap(17, Short.MAX_VALUE))
          );
          layout.setVerticalGroup(
               layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(layout.createSequentialGroup()
                    .addContainerGap(14, Short.MAX_VALUE)
                    .addComponent(jLabel9)
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                              .addComponent(jLabel5)
                              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                              .addComponent(tipoDato, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addGap(18, 18, 18)
                              .addComponent(jLabel6)
                              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                              .addComponent(tipoOrdenamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                   .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                   .addComponent(jLabel1))
                              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                   .addComponent(Cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                   .addComponent(jLabel2))
                              .addGap(8, 8, 8)
                              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                   .addComponent(Edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                   .addComponent(jLabel3))
                              .addGap(10, 10, 10)
                              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                   .addComponent(Estatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                   .addComponent(jLabel4))))
                    .addGap(19, 19, 19)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                         .addComponent(newPersona)
                         .addComponent(Ordenar))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                         .addComponent(jLabel7)
                         .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                         .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                         .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(12, 12, 12))
          );

          pack();
     }// </editor-fold>//GEN-END:initComponents

    private void NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreActionPerformed
        
    }//GEN-LAST:event_NombreActionPerformed

    private void CedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CedulaActionPerformed
        
    }//GEN-LAST:event_CedulaActionPerformed

    private void EdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EdadActionPerformed
        
    }//GEN-LAST:event_EdadActionPerformed

    private void EstaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EstaturaActionPerformed
        
    }//GEN-LAST:event_EstaturaActionPerformed

    private void OrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrdenarActionPerformed
        //System.out.println(tipoDato.getSelectedItem());
        //System.out.println(tipoOrdenamiento.getSelectedItem());
        
        if(tipoDato.getSelectedItem()=="Edad")
        {
            double[] copia=copy(edad);
            if(tipoOrdenamiento.getSelectedItem()=="Burbuja"){
                algs.Burbuja(copia.length, copia);
            }
            
            else
            {
                algs.mergeSort(copia, 0, copia.length-1);
            }
            
            for (int j = 0; j < i; j++)
            {
            escribirListaOrdenadaEdades(copia);
            }
            
        }
        else
        {
            double[] copia =copy(estatura);
            
            if(tipoOrdenamiento.getSelectedItem()=="Burbuja")
            {
                algs.Burbuja(copia.length, copia);
            }
            
            else
            {
                algs.mergeSort(copia, 100, copia.length-1);
            }
            
            escribirListaOrdenadaEstatura(copia);
        }
    }//GEN-LAST:event_OrdenarActionPerformed
    public double[] copy(double[] data)
    {
        for (int j = 0; j < data.length; j++) 
        {
            if(data[j]!=0)
            {
                tam++;
            }
        }
        
        double[] copia = new double[tam];
        //System.out.println(tam);
        System.arraycopy(data, 0, copia, 0, tam);
        return copia;
    }
    private void newPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newPersonaActionPerformed
        nombre[i]=Nombre.getText();
        Nombre.setText("");
        String texto1 = Cedula.getText();
        
        cedula[i]=Integer.parseInt(texto1);
        Cedula.setText("");
        String texto2 = Edad.getText();
        
        edad[i]=Double.parseDouble(texto2);
        Edad.setText("");
        String texto3 = Estatura.getText();
        
        estatura[i]=Double.parseDouble(texto3);
        Estatura.setText("");
        i++;
        
        ListaOriginal();
        
    }//GEN-LAST:event_newPersonaActionPerformed
  
    private void ListaOriginal() 
    {
        StringBuilder texto = new StringBuilder();
        for (int j = 0; j < i; j++)
        {
            texto.append("Nombre: ").append(nombre[j]).append(", Cedula: ").append(cedula[j]).append(", Edad: ").append(edad[j]).append(", Estatura: ").append(estatura[j]).append("\n");
        }
        listaOriginal.setText(texto.toString());
    }
    
    private void escribirListaOrdenadaEdades(double[] copia)
    {
        StringBuilder texto = new StringBuilder();
        HashMap<Double, Boolean> edadesProcesadas = new HashMap<>();

        for (int j = 0; j < tam; j++) 
        {
            if (!edadesProcesadas.containsKey(copia[j])) 
            {
                for (int k = 0; k < i; k++) 
                {
                    if (edad[k] == copia[j]) 
                    {
                        texto.append("Nombre: ").append(nombre[k]).append(", Edad: ").append(edad[k]).append("\n");
                        System.out.println(edad[k]);
                    }
                }
                edadesProcesadas.put(copia[j], true);
            }
        }

        listaOrdenada.setText(texto.toString());
    }
    private void escribirListaOrdenadaEstatura(double[] copia)
    {
        StringBuilder texto = new StringBuilder();
        HashMap<Double, Boolean> estaturasProcesadas = new HashMap<>();

        for (int j = 0; j < tam; j++)
        {
            if (!estaturasProcesadas.containsKey(copia[j]))
            {
                for (int k = 0; k < i; k++)
                {
                    if (estatura[k] == copia[j])
                    {
                        texto.append("Nombre: ").append(nombre[k]).append(", Estatura: ").append(estatura[k]).append("\n");
                    }
                }
                estaturasProcesadas.put(copia[j], true);
            }
        }
        listaOrdenada.setText(texto.toString());
    }
    private void tipoDatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoDatoActionPerformed
        
    }//GEN-LAST:event_tipoDatoActionPerformed

    private void tipoOrdenamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoOrdenamientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipoOrdenamientoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) 
    {
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
            java.util.logging.Logger.getLogger(Personas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Personas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Personas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Personas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new Personas().setVisible(true);
            }
        });
    }

     // Variables declaration - do not modify//GEN-BEGIN:variables
     private javax.swing.JTextField Cedula;
     private javax.swing.JTextField Edad;
     private javax.swing.JTextField Estatura;
     private javax.swing.JTextField Nombre;
     private javax.swing.JButton Ordenar;
     private javax.swing.JLabel jLabel1;
     private javax.swing.JLabel jLabel2;
     private javax.swing.JLabel jLabel3;
     private javax.swing.JLabel jLabel4;
     private javax.swing.JLabel jLabel5;
     private javax.swing.JLabel jLabel6;
     private javax.swing.JLabel jLabel7;
     private javax.swing.JLabel jLabel8;
     private javax.swing.JLabel jLabel9;
     private javax.swing.JScrollPane jScrollPane1;
     private javax.swing.JScrollPane jScrollPane2;
     private javax.swing.JTextArea listaOrdenada;
     private javax.swing.JTextArea listaOriginal;
     private javax.swing.JButton newPersona;
     private javax.swing.JComboBox<String> tipoDato;
     private javax.swing.JComboBox<String> tipoOrdenamiento;
     // End of variables declaration//GEN-END:variables
}
