
package gui;

import datos.Parada;
import javax.swing.JOptionPane;
import logica.logicaParadas;

/**
 *
 * @author solet
 */
public class PantallaFormParadas extends javax.swing.JDialog {

    /**
     * Creates new form PantallaFormParadas
     */
    public PantallaFormParadas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    private boolean validarFormulario() {    //un validador manual que comprueba si los campos están vacíos y/o sin se introducen números enteros
        String parada = jTextFieldNombreParada.getText();
        if (parada == null || "".equals(parada)) {
            JOptionPane.showMessageDialog(this, "El nombre de la parada no puede estar vacío", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        try {
            Integer.parseInt(jTextFieldNumParada.getText());
        } catch (NumberFormatException n) {
            JOptionPane.showMessageDialog(this, "El número de la parada debe ser un número", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelNombreParada = new javax.swing.JLabel();
        jTextFieldNombreParada = new javax.swing.JTextField();
        jLabelNumParada = new javax.swing.JLabel();
        jTextFieldNumParada = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jButtonAniadirParada = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout());

        jLabelNombreParada.setText(org.openide.util.NbBundle.getMessage(PantallaFormParadas.class, "PantallaFormParadas.jLabelNombreParada.text")); // NOI18N
        getContentPane().add(jLabelNombreParada);

        jTextFieldNombreParada.setText(org.openide.util.NbBundle.getMessage(PantallaFormParadas.class, "PantallaFormParadas.jTextFieldNombreParada.text")); // NOI18N
        jTextFieldNombreParada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombreParadaActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNombreParada);

        jLabelNumParada.setText(org.openide.util.NbBundle.getMessage(PantallaFormParadas.class, "PantallaFormParadas.jLabelNumParada.text")); // NOI18N
        getContentPane().add(jLabelNumParada);

        jTextFieldNumParada.setText(org.openide.util.NbBundle.getMessage(PantallaFormParadas.class, "PantallaFormParadas.jTextFieldNumParada.text")); // NOI18N
        getContentPane().add(jTextFieldNumParada);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 134, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 37, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);

        jButtonAniadirParada.setText(org.openide.util.NbBundle.getMessage(PantallaFormParadas.class, "PantallaFormParadas.jButtonAniadirParada.text")); // NOI18N
        jButtonAniadirParada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAniadirParadaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAniadirParada);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAniadirParadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAniadirParadaActionPerformed
        if(validarFormulario()){  //si se ha validado el formulario correctamente, se recogen los datos introducidos.
            String nombre = jTextFieldNombreParada.getText();
            int num = Integer.parseInt(jTextFieldNumParada.getText());
            Parada parada = new Parada(nombre, num);
            setVisible(false);
            logicaParadas.guardarParada(parada);
            JOptionPane.showMessageDialog(this, "La parada se ha registrado con éxito", "Parada registrada", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButtonAniadirParadaActionPerformed

    private void jTextFieldNombreParadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombreParadaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNombreParadaActionPerformed

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
            java.util.logging.Logger.getLogger(PantallaFormParadas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaFormParadas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaFormParadas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaFormParadas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PantallaFormParadas dialog = new PantallaFormParadas(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAniadirParada;
    private javax.swing.JLabel jLabelNombreParada;
    private javax.swing.JLabel jLabelNumParada;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldNombreParada;
    private javax.swing.JTextField jTextFieldNumParada;
    // End of variables declaration//GEN-END:variables
}
