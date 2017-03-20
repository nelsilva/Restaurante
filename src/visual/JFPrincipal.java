/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visual;

import javax.swing.SwingConstants;

/**
 *
 * @author christian
 */
public class JFPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form JFPrincipal
     */
    public JFPrincipal() {
        this.setLocationRelativeTo(this);
        initComponents();
        this.setTitle("Restaurante Sistema de Controle de Mesas 03/2017");
        setExtendedState(MAXIMIZED_BOTH);
        jbtnCaixa.setVerticalTextPosition(SwingConstants.BOTTOM);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdpPrincipal = new javax.swing.JDesktopPane();
        jbtnCaixa = new javax.swing.JButton();
        jbtnPedido = new javax.swing.JButton();
        jbtnProduto = new javax.swing.JButton();
        jbtnRelatorio = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(590, 596));

        jbtnCaixa.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jbtnCaixa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visual/imagens/money_bag.png"))); // NOI18N
        jbtnCaixa.setText("Caixa");
        jbtnCaixa.setToolTipText("Caixa");
        jbtnCaixa.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnCaixa.setMaximumSize(new java.awt.Dimension(140, 140));
        jbtnCaixa.setMinimumSize(new java.awt.Dimension(140, 140));
        jbtnCaixa.setPreferredSize(new java.awt.Dimension(140, 140));

        jbtnPedido.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jbtnPedido.setText("Pedido");
        jbtnPedido.setToolTipText("Pedido");
        jbtnPedido.setMaximumSize(new java.awt.Dimension(140, 140));
        jbtnPedido.setMinimumSize(new java.awt.Dimension(140, 140));
        jbtnPedido.setPreferredSize(new java.awt.Dimension(140, 140));

        jbtnProduto.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jbtnProduto.setText("Produto");
        jbtnProduto.setToolTipText("Produto");
        jbtnProduto.setMaximumSize(new java.awt.Dimension(140, 140));
        jbtnProduto.setMinimumSize(new java.awt.Dimension(140, 140));
        jbtnProduto.setPreferredSize(new java.awt.Dimension(140, 140));
        jbtnProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnProdutoActionPerformed(evt);
            }
        });

        jbtnRelatorio.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jbtnRelatorio.setText("Relatório");
        jbtnRelatorio.setToolTipText("Relatório");
        jbtnRelatorio.setMaximumSize(new java.awt.Dimension(140, 140));
        jbtnRelatorio.setMinimumSize(new java.awt.Dimension(140, 140));
        jbtnRelatorio.setPreferredSize(new java.awt.Dimension(140, 140));

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jdpPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 569, Short.MAX_VALUE)
                .addGap(1, 1, 1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jbtnCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jbtnPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jbtnProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jbtnRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(111, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jdpPrincipal)
                .addGap(1, 1, 1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnProdutoActionPerformed
        JFIProdutoCad objProdutoCad = new JFIProdutoCad();
        jdpPrincipal.add(objProdutoCad);
        objProdutoCad.setVisible(true);
        jbtnProduto.setEnabled(false);
    }//GEN-LAST:event_jbtnProdutoActionPerformed

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
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JButton jbtnCaixa;
    private javax.swing.JButton jbtnPedido;
    private javax.swing.JButton jbtnProduto;
    private javax.swing.JButton jbtnRelatorio;
    private javax.swing.JDesktopPane jdpPrincipal;
    // End of variables declaration//GEN-END:variables
}
