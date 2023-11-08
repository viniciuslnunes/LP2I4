
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

public class Frm_Main extends javax.swing.JFrame implements ActionListener {
    
    private String sinal = "";
    private double total = 0;
    
    public Frm_Main() {
        initComponents();        
        
        btn_0.addActionListener(this);
        btn_1.addActionListener(this);
        btn_2.addActionListener(this);
        btn_3.addActionListener(this);
        btn_4.addActionListener(this);
        btn_5.addActionListener(this);
        btn_6.addActionListener(this);
        btn_7.addActionListener(this);
        btn_8.addActionListener(this);
        btn_9.addActionListener(this);
        btn_Virgula.addActionListener(this);
    }
        
    public void actionPerformed(ActionEvent e) {
        String action = e.getActionCommand();
        
        entra(action);
    } 
    
    private void erro(Exception e){
        JOptionPane.showMessageDialog(null,e,"Erro!", JOptionPane.WARNING_MESSAGE);
    }
    
    private void entra(String s){
        if(s.equals(".")){
            if(!txt_Result.getText().contains(".")){
                if(txt_Result.getText().equals("0") && !s.equals("."))
                    txt_Result.setText(s);
                else
                    txt_Result.setText(txt_Result.getText() + s);
            }
        }
        else{
            if(txt_Result.getText().equals("0") && !s.equals("."))
                txt_Result.setText(s);
            else
                txt_Result.setText(txt_Result.getText() + s);
        }
    }
    
    private void entraSinal(String s){
        try{        
            if(sinal.equals(""))
                total = Double.parseDouble(txt_Result.getText());
            else
                btn_Igual.doClick();
            
                txt_Result.setText("0");
            
            sinal = s;            
        }
        catch(Exception e){
            erro(e);
            btn_C.doClick();
        }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_Result = new javax.swing.JTextField();
        btn_7 = new javax.swing.JButton();
        btn_8 = new javax.swing.JButton();
        btn_9 = new javax.swing.JButton();
        btn_4 = new javax.swing.JButton();
        btn_5 = new javax.swing.JButton();
        btn_6 = new javax.swing.JButton();
        btn_1 = new javax.swing.JButton();
        btn_2 = new javax.swing.JButton();
        btn_3 = new javax.swing.JButton();
        btn_0 = new javax.swing.JButton();
        btn_Virgula = new javax.swing.JButton();
        btn_Igual = new javax.swing.JButton();
        btn_Div = new javax.swing.JButton();
        btn_Mult = new javax.swing.JButton();
        btn_Sub = new javax.swing.JButton();
        btn_Ad = new javax.swing.JButton();
        btn_C = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txt_Result.setText("0");
        txt_Result.setName(""); // NOI18N

        btn_7.setText("7");
        btn_7.setPreferredSize(new java.awt.Dimension(41, 23));

        btn_8.setText("8");
        btn_8.setPreferredSize(new java.awt.Dimension(41, 23));

        btn_9.setText("9");
        btn_9.setPreferredSize(new java.awt.Dimension(41, 23));

        btn_4.setText("4");
        btn_4.setPreferredSize(new java.awt.Dimension(41, 23));

        btn_5.setText("5");
        btn_5.setPreferredSize(new java.awt.Dimension(41, 23));

        btn_6.setText("6");
        btn_6.setToolTipText("");
        btn_6.setPreferredSize(new java.awt.Dimension(41, 23));

        btn_1.setText("1");
        btn_1.setPreferredSize(new java.awt.Dimension(41, 23));

        btn_2.setText("2");
        btn_2.setPreferredSize(new java.awt.Dimension(41, 23));

        btn_3.setText("3");
        btn_3.setPreferredSize(new java.awt.Dimension(41, 23));

        btn_0.setText("0");
        btn_0.setPreferredSize(new java.awt.Dimension(41, 23));

        btn_Virgula.setText(".");
        btn_Virgula.setPreferredSize(new java.awt.Dimension(41, 23));

        btn_Igual.setText("=");
        btn_Igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_IgualActionPerformed(evt);
            }
        });

        btn_Div.setText("/");
        btn_Div.setPreferredSize(new java.awt.Dimension(41, 23));
        btn_Div.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DivActionPerformed(evt);
            }
        });

        btn_Mult.setText("*");
        btn_Mult.setPreferredSize(new java.awt.Dimension(41, 23));
        btn_Mult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MultActionPerformed(evt);
            }
        });

        btn_Sub.setText("-");
        btn_Sub.setPreferredSize(new java.awt.Dimension(41, 23));
        btn_Sub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SubActionPerformed(evt);
            }
        });

        btn_Ad.setText("+");
        btn_Ad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AdActionPerformed(evt);
            }
        });

        btn_C.setText("C");
        btn_C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt_Result)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn_8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn_9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn_Div, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn_Mult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn_Sub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn_Virgula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn_Igual)
                        .addGap(0, 0, 0)
                        .addComponent(btn_Ad))
                    .addComponent(btn_C))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(txt_Result, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Div, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Mult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Sub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Virgula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Igual)
                    .addComponent(btn_Ad))
                .addGap(0, 0, 0)
                .addComponent(btn_C))
        );

        txt_Result.setHorizontalAlignment(SwingConstants.RIGHT);
        txt_Result.setEditable(false);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CActionPerformed
        txt_Result.setText("0");
        sinal = "";
        total = 0;
    }//GEN-LAST:event_btn_CActionPerformed

    private void btn_IgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_IgualActionPerformed
        try{
            switch (sinal){
                case "/":
                    total /= Double.parseDouble(txt_Result.getText());
                    break;
                    
                case "*":
                    total *= Double.parseDouble(txt_Result.getText());
                    break;
                    
                case "-":
                    total -= Double.parseDouble(txt_Result.getText());
                    break;
                    
                case "+":
                    total += Double.parseDouble(txt_Result.getText());
                    break;
            }
            
            txt_Result.setText(total + "");
        }
        catch(Exception e){
            erro(e);
            btn_C.doClick();
        }        
    }//GEN-LAST:event_btn_IgualActionPerformed

    private void btn_DivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DivActionPerformed
        entraSinal("/");
    }//GEN-LAST:event_btn_DivActionPerformed

    private void btn_MultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MultActionPerformed
        entraSinal("*");
    }//GEN-LAST:event_btn_MultActionPerformed

    private void btn_SubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SubActionPerformed
        entraSinal("-");
    }//GEN-LAST:event_btn_SubActionPerformed

    private void btn_AdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AdActionPerformed
        entraSinal("+");
    }//GEN-LAST:event_btn_AdActionPerformed

    
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
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_0;
    private javax.swing.JButton btn_1;
    private javax.swing.JButton btn_2;
    private javax.swing.JButton btn_3;
    private javax.swing.JButton btn_4;
    private javax.swing.JButton btn_5;
    private javax.swing.JButton btn_6;
    private javax.swing.JButton btn_7;
    private javax.swing.JButton btn_8;
    private javax.swing.JButton btn_9;
    private javax.swing.JButton btn_Ad;
    private javax.swing.JButton btn_C;
    private javax.swing.JButton btn_Div;
    private javax.swing.JButton btn_Igual;
    private javax.swing.JButton btn_Mult;
    private javax.swing.JButton btn_Sub;
    private javax.swing.JButton btn_Virgula;
    private javax.swing.JTextField txt_Result;
    // End of variables declaration//GEN-END:variables
}


