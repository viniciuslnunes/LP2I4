
import javax.swing.JOptionPane;

public class Frm_Main extends javax.swing.JFrame {

    private Pessoa UmaPessoa = new Pessoa();
    
    public Frm_Main() {
        initComponents();
    }
    
    private void entra(){
        if(txt_Nome.getText().isEmpty() || txt_Sexo.getText().isEmpty() || txt_Idade.getText().isEmpty())
            btn_Ok.setEnabled(false);
        else
            btn_Ok.setEnabled(true);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txt_Num = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_Nome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_Sexo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_Idade = new javax.swing.JTextField();
        btn_Ok = new javax.swing.JButton();
        btn_Limpar = new javax.swing.JButton();
        btn_Mostrar = new javax.swing.JButton();
        btn_Sair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Exercício 02");
        setName("Exercício 02"); // NOI18N

        jLabel1.setText("Número:");

        jLabel2.setText("Nome:");
        jLabel2.setRequestFocusEnabled(false);

        txt_Nome.setToolTipText("");
        txt_Nome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_NomeKeyReleased(evt);
            }
        });

        jLabel3.setText("Sexo:");
        jLabel3.setRequestFocusEnabled(false);

        txt_Sexo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_SexoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_SexoKeyTyped(evt);
            }
        });

        jLabel4.setText("Idade:");
        jLabel4.setRequestFocusEnabled(false);

        txt_Idade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_IdadeKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_IdadeKeyTyped(evt);
            }
        });

        btn_Ok.setText("Ok");
        btn_Ok.setEnabled(false);
        btn_Ok.setPreferredSize(new java.awt.Dimension(69, 23));
        btn_Ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_OkActionPerformed(evt);
            }
        });

        btn_Limpar.setText("Limpar");
        btn_Limpar.setPreferredSize(new java.awt.Dimension(69, 23));
        btn_Limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LimparActionPerformed(evt);
            }
        });

        btn_Mostrar.setText("Mostrar");
        btn_Mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MostrarActionPerformed(evt);
            }
        });

        btn_Sair.setText("Sair");
        btn_Sair.setPreferredSize(new java.awt.Dimension(69, 23));
        btn_Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_Idade, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btn_Ok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn_Limpar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn_Mostrar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn_Sair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_Sexo)
                            .addComponent(txt_Nome)
                            .addComponent(txt_Num))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_Num, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Idade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Ok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Limpar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Mostrar)
                    .addComponent(btn_Sair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txt_Num.setEditable(false);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_SexoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_SexoKeyTyped
        if ((Character.toUpperCase(evt.getKeyChar()) != 'M' && Character.toUpperCase(evt.getKeyChar()) != 'F' && evt.getKeyCode() != 8) || (txt_Sexo.getText().length() > 0 && evt.getKeyCode() != 8))
        evt.consume();
    }//GEN-LAST:event_txt_SexoKeyTyped

    private void txt_IdadeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_IdadeKeyTyped
        if(!Character.isDigit(evt.getKeyChar()))
            evt.consume();
    }//GEN-LAST:event_txt_IdadeKeyTyped

    private void btn_OkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_OkActionPerformed
        UmaPessoa = new Pessoa(txt_Nome.getText(), txt_Sexo.getText().charAt(0), Integer.parseInt(txt_Idade.getText()));
        
        JOptionPane.showMessageDialog(null,"Pessoa Salva!", "Pessoa Salva", JOptionPane.INFORMATION_MESSAGE);
        
        btn_Limpar.doClick();
    }//GEN-LAST:event_btn_OkActionPerformed

    private void btn_LimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LimparActionPerformed
        txt_Num.setText("");
        txt_Nome.setText("");
        txt_Sexo.setText("");
        txt_Idade.setText("");
        
        btn_Ok.setEnabled(false);
    }//GEN-LAST:event_btn_LimparActionPerformed

    private void btn_MostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MostrarActionPerformed
        txt_Num.setText(Integer.toString(UmaPessoa.getKp()));
        txt_Nome.setText(UmaPessoa.getNome());
        txt_Sexo.setText(Character.toString(UmaPessoa.getSexo()));
        txt_Idade.setText(Integer.toString(UmaPessoa.getIdade()));
    }//GEN-LAST:event_btn_MostrarActionPerformed

    private void btn_SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SairActionPerformed
        System.gc();
        this.dispose();
    }//GEN-LAST:event_btn_SairActionPerformed

    private void txt_NomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_NomeKeyReleased
       entra();
    }//GEN-LAST:event_txt_NomeKeyReleased

    private void txt_SexoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_SexoKeyReleased
        entra();
    }//GEN-LAST:event_txt_SexoKeyReleased

    private void txt_IdadeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_IdadeKeyReleased
        entra();
    }//GEN-LAST:event_txt_IdadeKeyReleased

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frm_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Limpar;
    private javax.swing.JButton btn_Mostrar;
    private javax.swing.JButton btn_Ok;
    private javax.swing.JButton btn_Sair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txt_Idade;
    private javax.swing.JTextField txt_Nome;
    private javax.swing.JTextField txt_Num;
    private javax.swing.JTextField txt_Sexo;
    // End of variables declaration//GEN-END:variables
}
