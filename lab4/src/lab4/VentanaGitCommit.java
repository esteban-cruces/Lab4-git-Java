/**
 * @author Esteban Cruces Araneda
 * Rut 20201381-3
 * Ultimo Edit 20/09/2020
 * @version 1.2
 */ 
package lab4;

import javax.swing.JOptionPane;

/**
* Clase para mostrar la interfaz de gitcommit,
* determinada por interfaz
* @version 1.2
* @author Esteban Cruces Araneda
*/
public class VentanaGitCommit extends javax.swing.JFrame {

    /**
     * Creates new form VentanaGitCommit
     */    
    VentanaPrincipal interfaz;
    /**
     * constructor
     * @param ventana ventana principal
     */
    public VentanaGitCommit(VentanaPrincipal ventana) {
        this.interfaz = ventana;
        initComponents();
    }
    /**
     * constructor
     */
    public VentanaGitCommit() {
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
        jTextFieldAutorCommit = new javax.swing.JTextField();
        jLabelAutorCommit = new javax.swing.JLabel();
        jLabelCommit = new javax.swing.JLabel();
        jTextFieldNameCommit = new javax.swing.JTextField();
        jButtonCommit = new javax.swing.JButton();
        jButtonVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panel1.setBackground(new java.awt.Color(153, 153, 255));

        jLabelAutorCommit.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelAutorCommit.setText("Ingrese el nombre del Autor:");

        jLabelCommit.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelCommit.setText("Indique el nombre para el Commit:");

        jButtonCommit.setBackground(new java.awt.Color(0, 204, 204));
        jButtonCommit.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonCommit.setText("Aceptar");
        jButtonCommit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCommitActionPerformed(evt);
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButtonVolver))
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldAutorCommit, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
                            .addComponent(jTextFieldNameCommit)))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jLabelCommit))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jLabelAutorCommit))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(jButtonCommit)))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabelAutorCommit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldAutorCommit, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelCommit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldNameCommit, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonCommit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
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
            .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    /**
     * metodo que reliaza un gitCommit
     * @param evt
     */
    private void jButtonCommitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCommitActionPerformed
        if(this.jTextFieldNameCommit.getText().length() >= 1 && this.jTextFieldAutorCommit.getText().length() >= 1){
            int estado = this.interfaz.repo.gitCommit(this.jTextFieldNameCommit.getText(),this.jTextFieldAutorCommit.getText());
            if(estado == 0){
                this.interfaz.textLocalRepository.setText(this.interfaz.repo.lRepository.toString());
                this.interfaz.textIndex.setText("");
                this.setVisible(false);
            }            
            else if(estado == 3){
                JOptionPane.showMessageDialog(null,"LA ZONA INDEX SE ENCUNETRA VACIA.","operación mal ingresada",JOptionPane.ERROR_MESSAGE);                    
                this.setVisible(false);
            }
            else{
                JOptionPane.showMessageDialog(null,"EL NOMBRE DEL COMMIT YA EXISTE.","operación mal ingresada",JOptionPane.WARNING_MESSAGE);        
                this.setVisible(false);
            }
        }
        else{
            JOptionPane.showMessageDialog(null,"NO SE INGRESÓ EL NOMBRE DEL AUTOR O DEL COMMIT.","operación mal ingresada",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonCommitActionPerformed
    /**
     * metodo que cierra la ventana
     */
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
            java.util.logging.Logger.getLogger(VentanaGitCommit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaGitCommit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaGitCommit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaGitCommit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new VentanaGitCommit().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCommit;
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JLabel jLabelAutorCommit;
    private javax.swing.JLabel jLabelCommit;
    private javax.swing.JTextField jTextFieldAutorCommit;
    private javax.swing.JTextField jTextFieldNameCommit;
    private java.awt.Panel panel1;
    // End of variables declaration//GEN-END:variables
}
