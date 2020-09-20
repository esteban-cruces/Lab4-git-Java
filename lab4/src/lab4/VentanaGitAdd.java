
package lab4;

import javax.swing.JOptionPane;

/**
 *
 * @author Esteban
 */
public class VentanaGitAdd extends javax.swing.JFrame {

    /**
     * Creates new form VentanaGitAdd
     */
    VentanaPrincipal interfaz;
    public VentanaGitAdd(VentanaPrincipal ventana) {
        this.interfaz = ventana;
        initComponents();
        
    }
    public VentanaGitAdd() {
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

        panel1 = new java.awt.Panel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaNombresArchivos = new javax.swing.JTextArea();
        jLabelIngresarNombresArchivos = new javax.swing.JLabel();
        jLabelGitAddAll = new javax.swing.JLabel();
        btGitAddAll = new javax.swing.JButton();
        btGitAdd = new javax.swing.JButton();
        jButtonVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panel1.setBackground(new java.awt.Color(153, 153, 255));

        jTextAreaNombresArchivos.setColumns(20);
        jTextAreaNombresArchivos.setRows(5);
        jScrollPane1.setViewportView(jTextAreaNombresArchivos);

        jLabelIngresarNombresArchivos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelIngresarNombresArchivos.setText("Ingrese los nombres de los archivos (separados por un salto de linea):");

        jLabelGitAddAll.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelGitAddAll.setText("Presione aquí si desea hacer un GitAdd -All:");

        btGitAddAll.setBackground(new java.awt.Color(0, 204, 204));
        btGitAddAll.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btGitAddAll.setText("Add All");
        btGitAddAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGitAddAllActionPerformed(evt);
            }
        });

        btGitAdd.setBackground(new java.awt.Color(0, 204, 204));
        btGitAdd.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btGitAdd.setText("Add");
        btGitAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGitAddActionPerformed(evt);
            }
        });

        jButtonVolver.setBackground(new java.awt.Color(0, 204, 204));
        jButtonVolver.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonVolver.setText("Volver");
        jButtonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelIngresarNombresArchivos)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(jLabelGitAddAll)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btGitAdd)
                                    .addComponent(btGitAddAll))))
                        .addContainerGap(17, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28))
                            .addComponent(jButtonVolver, javax.swing.GroupLayout.Alignment.TRAILING)))))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabelIngresarNombresArchivos)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btGitAdd)
                .addGap(40, 40, 40)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelGitAddAll, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btGitAddAll))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jButtonVolver))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btGitAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGitAddActionPerformed
        int estado = this.interfaz.repo.gitAdd(this.jTextAreaNombresArchivos.getText());
        if(estado == 0){
            this.interfaz.textIndex.setText(this.interfaz.repo.index.toString());
            this.setVisible(false);
        }
        else{
            JOptionPane.showMessageDialog(null,"ALGÚN ARCHIVO NO PERTENECE AL WORKSPACE, POR LO QUE SE OMITIRÁ ESE ARCHIVO.","operación mal ingresada",JOptionPane.INFORMATION_MESSAGE);                                
            this.interfaz.textIndex.setText(this.interfaz.repo.index.toString());
            this.setVisible(false);
        }
    }//GEN-LAST:event_btGitAddActionPerformed

    private void btGitAddAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGitAddAllActionPerformed
        this.interfaz.repo.gitAdd();
        this.interfaz.textIndex.setText(this.interfaz.repo.index.toString());
        this.setVisible(false);
    }//GEN-LAST:event_btGitAddAllActionPerformed

    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButtonVolverActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaGitAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaGitAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaGitAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaGitAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new VentanaGitAdd().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btGitAdd;
    private javax.swing.JButton btGitAddAll;
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JLabel jLabelGitAddAll;
    private javax.swing.JLabel jLabelIngresarNombresArchivos;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTextArea jTextAreaNombresArchivos;
    private java.awt.Panel panel1;
    // End of variables declaration//GEN-END:variables
}
